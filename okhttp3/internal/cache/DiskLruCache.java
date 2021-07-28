package okhttp3.internal.cache;

import j.d;
import j.e;
import j.l;
import j.s;
import j.t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;

public final class DiskLruCache implements Closeable, Flushable {
  static final long ANY_SEQUENCE_NUMBER = -1L;
  
  private static final String CLEAN = "CLEAN";
  
  private static final String DIRTY = "DIRTY";
  
  static final String JOURNAL_FILE = "journal";
  
  static final String JOURNAL_FILE_BACKUP = "journal.bkp";
  
  static final String JOURNAL_FILE_TEMP = "journal.tmp";
  
  static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
  
  static final String MAGIC = "libcore.io.DiskLruCache";
  
  private static final String READ = "READ";
  
  private static final String REMOVE = "REMOVE";
  
  static final String VERSION_1 = "1";
  
  private final int appVersion;
  
  private final Runnable cleanupRunnable = new Runnable() {
      public void run() {
        synchronized (DiskLruCache.this) {
          boolean bool;
          if (!DiskLruCache.this.initialized) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool | DiskLruCache.this.closed)
            return; 
          try {
            DiskLruCache.this.trimToSize();
          } catch (IOException iOException) {
            DiskLruCache.this.mostRecentTrimFailed = true;
          } 
          try {
            if (DiskLruCache.this.journalRebuildRequired()) {
              DiskLruCache.this.rebuildJournal();
              DiskLruCache.this.redundantOpCount = 0;
            } 
          } catch (IOException iOException) {
            DiskLruCache.this.mostRecentRebuildFailed = true;
            DiskLruCache.this.journalWriter = l.a(l.a());
          } 
          return;
        } 
      }
    };
  
  boolean closed;
  
  final File directory;
  
  private final Executor executor;
  
  final FileSystem fileSystem;
  
  boolean hasJournalErrors;
  
  boolean initialized;
  
  private final File journalFile;
  
  private final File journalFileBackup;
  
  private final File journalFileTmp;
  
  d journalWriter;
  
  final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<String, Entry>(0, 0.75F, true);
  
  private long maxSize;
  
  boolean mostRecentRebuildFailed;
  
  boolean mostRecentTrimFailed;
  
  private long nextSequenceNumber = 0L;
  
  int redundantOpCount;
  
  private long size = 0L;
  
  final int valueCount;
  
  DiskLruCache(FileSystem paramFileSystem, File paramFile, int paramInt1, int paramInt2, long paramLong, Executor paramExecutor) {
    this.fileSystem = paramFileSystem;
    this.directory = paramFile;
    this.appVersion = paramInt1;
    this.journalFile = new File(paramFile, "journal");
    this.journalFileTmp = new File(paramFile, "journal.tmp");
    this.journalFileBackup = new File(paramFile, "journal.bkp");
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
    this.executor = paramExecutor;
  }
  
  private void checkNotClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isClosed : ()Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: new java/lang/IllegalStateException
    //   17: dup
    //   18: ldc 'cache is closed'
    //   20: invokespecial <init> : (Ljava/lang/String;)V
    //   23: athrow
    //   24: astore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_2
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	24	finally
    //   14	24	24	finally
  }
  
  public static DiskLruCache create(FileSystem paramFileSystem, File paramFile, int paramInt1, int paramInt2, long paramLong) {
    if (paramLong > 0L) {
      if (paramInt2 > 0)
        return new DiskLruCache(paramFileSystem, paramFile, paramInt1, paramInt2, paramLong, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Util.threadFactory("OkHttp DiskLruCache", true))); 
      throw new IllegalArgumentException("valueCount <= 0");
    } 
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  private d newJournalWriter() {
    return l.a((s)new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
          protected void onException(IOException param1IOException) {
            DiskLruCache.this.hasJournalErrors = true;
          }
        });
  }
  
  private void processJournal() {
    this.fileSystem.delete(this.journalFileTmp);
    Iterator<Entry> iterator = this.lruEntries.values().iterator();
    while (iterator.hasNext()) {
      Entry entry = iterator.next();
      Editor editor = entry.currentEditor;
      boolean bool = false;
      int i = 0;
      if (editor == null) {
        while (i < this.valueCount) {
          this.size += entry.lengths[i];
          i++;
        } 
        continue;
      } 
      entry.currentEditor = null;
      for (i = bool; i < this.valueCount; i++) {
        this.fileSystem.delete(entry.cleanFiles[i]);
        this.fileSystem.delete(entry.dirtyFiles[i]);
      } 
      iterator.remove();
    } 
  }
  
  private void readJournal() {
    e e = l.a(this.fileSystem.source(this.journalFile));
    try {
      String str1 = e.g();
      String str2 = e.g();
      String str5 = e.g();
      String str3 = e.g();
      String str4 = e.g();
      if ("libcore.io.DiskLruCache".equals(str1) && "1".equals(str2) && Integer.toString(this.appVersion).equals(str5) && Integer.toString(this.valueCount).equals(str3)) {
        boolean bool = "".equals(str4);
        if (bool) {
          int i = 0;
          try {
            while (true) {
              readJournalLine(e.g());
              i++;
            } 
          } catch (EOFException eOFException) {
            this.redundantOpCount = i - this.lruEntries.size();
            if (!e.j()) {
              rebuildJournal();
            } else {
              this.journalWriter = newJournalWriter();
            } 
            return;
          } 
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unexpected journal header: [");
      stringBuilder.append((String)eOFException);
      stringBuilder.append(", ");
      stringBuilder.append(str2);
      stringBuilder.append(", ");
      stringBuilder.append(str3);
      stringBuilder.append(", ");
      stringBuilder.append(str4);
      stringBuilder.append("]");
      throw new IOException(stringBuilder.toString());
    } finally {
      Util.closeQuietly((Closeable)e);
    } 
  }
  
  private void readJournalLine(String paramString) {
    String[] arrayOfString;
    int i = paramString.indexOf(' ');
    if (i != -1) {
      String str;
      int j = i + 1;
      int k = paramString.indexOf(' ', j);
      if (k == -1) {
        String str1 = paramString.substring(j);
        str = str1;
        if (i == 6) {
          str = str1;
          if (paramString.startsWith("REMOVE")) {
            this.lruEntries.remove(str1);
            return;
          } 
        } 
      } else {
        str = paramString.substring(j, k);
      } 
      Entry entry2 = this.lruEntries.get(str);
      Entry entry1 = entry2;
      if (entry2 == null) {
        entry1 = new Entry(str);
        this.lruEntries.put(str, entry1);
      } 
      if (k != -1 && i == 5 && paramString.startsWith("CLEAN")) {
        arrayOfString = paramString.substring(k + 1).split(" ");
        entry1.readable = true;
        entry1.currentEditor = null;
        entry1.setLengths(arrayOfString);
        return;
      } 
      if (k == -1 && i == 5 && arrayOfString.startsWith("DIRTY")) {
        entry1.currentEditor = new Editor(entry1);
        return;
      } 
      if (k == -1 && i == 4 && arrayOfString.startsWith("READ"))
        return; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("unexpected journal line: ");
      stringBuilder1.append((String)arrayOfString);
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("unexpected journal line: ");
    stringBuilder.append((String)arrayOfString);
    throw new IOException(stringBuilder.toString());
  }
  
  private void validateKey(String paramString) {
    if (LEGAL_KEY_PATTERN.matcher(paramString).matches())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
    stringBuilder.append(paramString);
    stringBuilder.append("\"");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield initialized : Z
    //   6: ifeq -> 105
    //   9: aload_0
    //   10: getfield closed : Z
    //   13: ifeq -> 19
    //   16: goto -> 105
    //   19: aload_0
    //   20: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   23: invokevirtual values : ()Ljava/util/Collection;
    //   26: aload_0
    //   27: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   30: invokevirtual size : ()I
    //   33: anewarray okhttp3/internal/cache/DiskLruCache$Entry
    //   36: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   41: checkcast [Lokhttp3/internal/cache/DiskLruCache$Entry;
    //   44: astore_3
    //   45: aload_3
    //   46: arraylength
    //   47: istore_2
    //   48: iconst_0
    //   49: istore_1
    //   50: iload_1
    //   51: iload_2
    //   52: if_icmpge -> 79
    //   55: aload_3
    //   56: iload_1
    //   57: aaload
    //   58: astore #4
    //   60: aload #4
    //   62: getfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   65: ifnull -> 124
    //   68: aload #4
    //   70: getfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   73: invokevirtual abort : ()V
    //   76: goto -> 124
    //   79: aload_0
    //   80: invokevirtual trimToSize : ()V
    //   83: aload_0
    //   84: getfield journalWriter : Lj/d;
    //   87: invokeinterface close : ()V
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield journalWriter : Lj/d;
    //   97: aload_0
    //   98: iconst_1
    //   99: putfield closed : Z
    //   102: aload_0
    //   103: monitorexit
    //   104: return
    //   105: aload_0
    //   106: iconst_1
    //   107: putfield closed : Z
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    //   113: astore_3
    //   114: aload_0
    //   115: monitorexit
    //   116: goto -> 121
    //   119: aload_3
    //   120: athrow
    //   121: goto -> 119
    //   124: iload_1
    //   125: iconst_1
    //   126: iadd
    //   127: istore_1
    //   128: goto -> 50
    // Exception table:
    //   from	to	target	type
    //   2	16	113	finally
    //   19	48	113	finally
    //   60	76	113	finally
    //   79	102	113	finally
    //   105	110	113	finally
  }
  
  void completeEdit(Editor paramEditor, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield entry : Lokhttp3/internal/cache/DiskLruCache$Entry;
    //   6: astore #10
    //   8: aload #10
    //   10: getfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   13: aload_1
    //   14: if_acmpne -> 472
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: istore #4
    //   24: iload_2
    //   25: ifeq -> 134
    //   28: iload #5
    //   30: istore #4
    //   32: aload #10
    //   34: getfield readable : Z
    //   37: ifne -> 134
    //   40: iconst_0
    //   41: istore_3
    //   42: iload #5
    //   44: istore #4
    //   46: iload_3
    //   47: aload_0
    //   48: getfield valueCount : I
    //   51: if_icmpge -> 134
    //   54: aload_1
    //   55: getfield written : [Z
    //   58: iload_3
    //   59: baload
    //   60: ifeq -> 96
    //   63: aload_0
    //   64: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   67: aload #10
    //   69: getfield dirtyFiles : [Ljava/io/File;
    //   72: iload_3
    //   73: aaload
    //   74: invokeinterface exists : (Ljava/io/File;)Z
    //   79: ifne -> 89
    //   82: aload_1
    //   83: invokevirtual abort : ()V
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: iload_3
    //   90: iconst_1
    //   91: iadd
    //   92: istore_3
    //   93: goto -> 42
    //   96: aload_1
    //   97: invokevirtual abort : ()V
    //   100: new java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore_1
    //   108: aload_1
    //   109: ldc_w 'Newly created entry didn't create value for index '
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_1
    //   117: iload_3
    //   118: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: new java/lang/IllegalStateException
    //   125: dup
    //   126: aload_1
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: athrow
    //   134: iload #4
    //   136: aload_0
    //   137: getfield valueCount : I
    //   140: if_icmpge -> 254
    //   143: aload #10
    //   145: getfield dirtyFiles : [Ljava/io/File;
    //   148: iload #4
    //   150: aaload
    //   151: astore_1
    //   152: iload_2
    //   153: ifeq -> 241
    //   156: aload_0
    //   157: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   160: aload_1
    //   161: invokeinterface exists : (Ljava/io/File;)Z
    //   166: ifeq -> 491
    //   169: aload #10
    //   171: getfield cleanFiles : [Ljava/io/File;
    //   174: iload #4
    //   176: aaload
    //   177: astore #11
    //   179: aload_0
    //   180: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   183: aload_1
    //   184: aload #11
    //   186: invokeinterface rename : (Ljava/io/File;Ljava/io/File;)V
    //   191: aload #10
    //   193: getfield lengths : [J
    //   196: iload #4
    //   198: laload
    //   199: lstore #6
    //   201: aload_0
    //   202: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   205: aload #11
    //   207: invokeinterface size : (Ljava/io/File;)J
    //   212: lstore #8
    //   214: aload #10
    //   216: getfield lengths : [J
    //   219: iload #4
    //   221: lload #8
    //   223: lastore
    //   224: aload_0
    //   225: aload_0
    //   226: getfield size : J
    //   229: lload #6
    //   231: lsub
    //   232: lload #8
    //   234: ladd
    //   235: putfield size : J
    //   238: goto -> 491
    //   241: aload_0
    //   242: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   245: aload_1
    //   246: invokeinterface delete : (Ljava/io/File;)V
    //   251: goto -> 491
    //   254: aload_0
    //   255: aload_0
    //   256: getfield redundantOpCount : I
    //   259: iconst_1
    //   260: iadd
    //   261: putfield redundantOpCount : I
    //   264: aload #10
    //   266: aconst_null
    //   267: putfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   270: aload #10
    //   272: getfield readable : Z
    //   275: iload_2
    //   276: ior
    //   277: ifeq -> 369
    //   280: aload #10
    //   282: iconst_1
    //   283: putfield readable : Z
    //   286: aload_0
    //   287: getfield journalWriter : Lj/d;
    //   290: ldc 'CLEAN'
    //   292: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   297: bipush #32
    //   299: invokeinterface writeByte : (I)Lj/d;
    //   304: pop
    //   305: aload_0
    //   306: getfield journalWriter : Lj/d;
    //   309: aload #10
    //   311: getfield key : Ljava/lang/String;
    //   314: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   319: pop
    //   320: aload #10
    //   322: aload_0
    //   323: getfield journalWriter : Lj/d;
    //   326: invokevirtual writeLengths : (Lj/d;)V
    //   329: aload_0
    //   330: getfield journalWriter : Lj/d;
    //   333: bipush #10
    //   335: invokeinterface writeByte : (I)Lj/d;
    //   340: pop
    //   341: iload_2
    //   342: ifeq -> 428
    //   345: aload_0
    //   346: getfield nextSequenceNumber : J
    //   349: lstore #6
    //   351: aload_0
    //   352: lconst_1
    //   353: lload #6
    //   355: ladd
    //   356: putfield nextSequenceNumber : J
    //   359: aload #10
    //   361: lload #6
    //   363: putfield sequenceNumber : J
    //   366: goto -> 428
    //   369: aload_0
    //   370: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   373: aload #10
    //   375: getfield key : Ljava/lang/String;
    //   378: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   381: pop
    //   382: aload_0
    //   383: getfield journalWriter : Lj/d;
    //   386: ldc 'REMOVE'
    //   388: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   393: bipush #32
    //   395: invokeinterface writeByte : (I)Lj/d;
    //   400: pop
    //   401: aload_0
    //   402: getfield journalWriter : Lj/d;
    //   405: aload #10
    //   407: getfield key : Ljava/lang/String;
    //   410: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   415: pop
    //   416: aload_0
    //   417: getfield journalWriter : Lj/d;
    //   420: bipush #10
    //   422: invokeinterface writeByte : (I)Lj/d;
    //   427: pop
    //   428: aload_0
    //   429: getfield journalWriter : Lj/d;
    //   432: invokeinterface flush : ()V
    //   437: aload_0
    //   438: getfield size : J
    //   441: aload_0
    //   442: getfield maxSize : J
    //   445: lcmp
    //   446: ifgt -> 456
    //   449: aload_0
    //   450: invokevirtual journalRebuildRequired : ()Z
    //   453: ifeq -> 469
    //   456: aload_0
    //   457: getfield executor : Ljava/util/concurrent/Executor;
    //   460: aload_0
    //   461: getfield cleanupRunnable : Ljava/lang/Runnable;
    //   464: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   469: aload_0
    //   470: monitorexit
    //   471: return
    //   472: new java/lang/IllegalStateException
    //   475: dup
    //   476: invokespecial <init> : ()V
    //   479: athrow
    //   480: astore_1
    //   481: aload_0
    //   482: monitorexit
    //   483: goto -> 488
    //   486: aload_1
    //   487: athrow
    //   488: goto -> 486
    //   491: iload #4
    //   493: iconst_1
    //   494: iadd
    //   495: istore #4
    //   497: goto -> 134
    // Exception table:
    //   from	to	target	type
    //   2	17	480	finally
    //   32	40	480	finally
    //   46	86	480	finally
    //   96	134	480	finally
    //   134	152	480	finally
    //   156	238	480	finally
    //   241	251	480	finally
    //   254	341	480	finally
    //   345	366	480	finally
    //   369	428	480	finally
    //   428	456	480	finally
    //   456	469	480	finally
    //   472	480	480	finally
  }
  
  public void delete() {
    close();
    this.fileSystem.deleteContents(this.directory);
  }
  
  public Editor edit(String paramString) {
    return edit(paramString, -1L);
  }
  
  Editor edit(String paramString, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual initialize : ()V
    //   6: aload_0
    //   7: invokespecial checkNotClosed : ()V
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial validateKey : (Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   19: aload_1
    //   20: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast okhttp3/internal/cache/DiskLruCache$Entry
    //   26: astore #8
    //   28: lload_2
    //   29: ldc2_w -1
    //   32: lcmp
    //   33: ifeq -> 59
    //   36: aload #8
    //   38: ifnull -> 55
    //   41: aload #8
    //   43: getfield sequenceNumber : J
    //   46: lstore #4
    //   48: lload #4
    //   50: lload_2
    //   51: lcmp
    //   52: ifeq -> 59
    //   55: aload_0
    //   56: monitorexit
    //   57: aconst_null
    //   58: areturn
    //   59: aload #8
    //   61: ifnull -> 80
    //   64: aload #8
    //   66: getfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   69: astore #7
    //   71: aload #7
    //   73: ifnull -> 80
    //   76: aload_0
    //   77: monitorexit
    //   78: aconst_null
    //   79: areturn
    //   80: aload_0
    //   81: getfield mostRecentTrimFailed : Z
    //   84: ifne -> 205
    //   87: aload_0
    //   88: getfield mostRecentRebuildFailed : Z
    //   91: ifeq -> 97
    //   94: goto -> 205
    //   97: aload_0
    //   98: getfield journalWriter : Lj/d;
    //   101: ldc 'DIRTY'
    //   103: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   108: bipush #32
    //   110: invokeinterface writeByte : (I)Lj/d;
    //   115: aload_1
    //   116: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   121: bipush #10
    //   123: invokeinterface writeByte : (I)Lj/d;
    //   128: pop
    //   129: aload_0
    //   130: getfield journalWriter : Lj/d;
    //   133: invokeinterface flush : ()V
    //   138: aload_0
    //   139: getfield hasJournalErrors : Z
    //   142: istore #6
    //   144: iload #6
    //   146: ifeq -> 153
    //   149: aload_0
    //   150: monitorexit
    //   151: aconst_null
    //   152: areturn
    //   153: aload #8
    //   155: astore #7
    //   157: aload #8
    //   159: ifnonnull -> 184
    //   162: new okhttp3/internal/cache/DiskLruCache$Entry
    //   165: dup
    //   166: aload_0
    //   167: aload_1
    //   168: invokespecial <init> : (Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V
    //   171: astore #7
    //   173: aload_0
    //   174: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   177: aload_1
    //   178: aload #7
    //   180: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   183: pop
    //   184: new okhttp3/internal/cache/DiskLruCache$Editor
    //   187: dup
    //   188: aload_0
    //   189: aload #7
    //   191: invokespecial <init> : (Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V
    //   194: astore_1
    //   195: aload #7
    //   197: aload_1
    //   198: putfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_1
    //   204: areturn
    //   205: aload_0
    //   206: getfield executor : Ljava/util/concurrent/Executor;
    //   209: aload_0
    //   210: getfield cleanupRunnable : Ljava/lang/Runnable;
    //   213: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   218: aload_0
    //   219: monitorexit
    //   220: aconst_null
    //   221: areturn
    //   222: astore_1
    //   223: aload_0
    //   224: monitorexit
    //   225: aload_1
    //   226: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	222	finally
    //   41	48	222	finally
    //   64	71	222	finally
    //   80	94	222	finally
    //   97	144	222	finally
    //   162	184	222	finally
    //   184	201	222	finally
    //   205	218	222	finally
  }
  
  public void evictAll() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual initialize : ()V
    //   6: aload_0
    //   7: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   10: invokevirtual values : ()Ljava/util/Collection;
    //   13: aload_0
    //   14: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   17: invokevirtual size : ()I
    //   20: anewarray okhttp3/internal/cache/DiskLruCache$Entry
    //   23: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   28: checkcast [Lokhttp3/internal/cache/DiskLruCache$Entry;
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: istore_2
    //   35: iconst_0
    //   36: istore_1
    //   37: iload_1
    //   38: iload_2
    //   39: if_icmpge -> 57
    //   42: aload_0
    //   43: aload_3
    //   44: iload_1
    //   45: aaload
    //   46: invokevirtual removeEntry : (Lokhttp3/internal/cache/DiskLruCache$Entry;)Z
    //   49: pop
    //   50: iload_1
    //   51: iconst_1
    //   52: iadd
    //   53: istore_1
    //   54: goto -> 37
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield mostRecentTrimFailed : Z
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: astore_3
    //   66: aload_0
    //   67: monitorexit
    //   68: goto -> 73
    //   71: aload_3
    //   72: athrow
    //   73: goto -> 71
    // Exception table:
    //   from	to	target	type
    //   2	35	65	finally
    //   42	50	65	finally
    //   57	62	65	finally
  }
  
  public void flush() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield initialized : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokespecial checkNotClosed : ()V
    //   18: aload_0
    //   19: invokevirtual trimToSize : ()V
    //   22: aload_0
    //   23: getfield journalWriter : Lj/d;
    //   26: invokeinterface flush : ()V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	34	finally
    //   14	31	34	finally
  }
  
  public Snapshot get(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual initialize : ()V
    //   6: aload_0
    //   7: invokespecial checkNotClosed : ()V
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial validateKey : (Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   19: aload_1
    //   20: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast okhttp3/internal/cache/DiskLruCache$Entry
    //   26: astore_2
    //   27: aload_2
    //   28: ifnull -> 120
    //   31: aload_2
    //   32: getfield readable : Z
    //   35: ifne -> 41
    //   38: goto -> 120
    //   41: aload_2
    //   42: invokevirtual snapshot : ()Lokhttp3/internal/cache/DiskLruCache$Snapshot;
    //   45: astore_2
    //   46: aload_2
    //   47: ifnonnull -> 54
    //   50: aload_0
    //   51: monitorexit
    //   52: aconst_null
    //   53: areturn
    //   54: aload_0
    //   55: aload_0
    //   56: getfield redundantOpCount : I
    //   59: iconst_1
    //   60: iadd
    //   61: putfield redundantOpCount : I
    //   64: aload_0
    //   65: getfield journalWriter : Lj/d;
    //   68: ldc 'READ'
    //   70: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   75: bipush #32
    //   77: invokeinterface writeByte : (I)Lj/d;
    //   82: aload_1
    //   83: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   88: bipush #10
    //   90: invokeinterface writeByte : (I)Lj/d;
    //   95: pop
    //   96: aload_0
    //   97: invokevirtual journalRebuildRequired : ()Z
    //   100: ifeq -> 116
    //   103: aload_0
    //   104: getfield executor : Ljava/util/concurrent/Executor;
    //   107: aload_0
    //   108: getfield cleanupRunnable : Ljava/lang/Runnable;
    //   111: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_2
    //   119: areturn
    //   120: aload_0
    //   121: monitorexit
    //   122: aconst_null
    //   123: areturn
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	124	finally
    //   31	38	124	finally
    //   41	46	124	finally
    //   54	116	124	finally
  }
  
  public File getDirectory() {
    return this.directory;
  }
  
  public long getMaxSize() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield maxSize : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public void initialize() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield initialized : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   18: aload_0
    //   19: getfield journalFileBackup : Ljava/io/File;
    //   22: invokeinterface exists : (Ljava/io/File;)Z
    //   27: ifeq -> 79
    //   30: aload_0
    //   31: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   34: aload_0
    //   35: getfield journalFile : Ljava/io/File;
    //   38: invokeinterface exists : (Ljava/io/File;)Z
    //   43: ifeq -> 62
    //   46: aload_0
    //   47: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   50: aload_0
    //   51: getfield journalFileBackup : Ljava/io/File;
    //   54: invokeinterface delete : (Ljava/io/File;)V
    //   59: goto -> 79
    //   62: aload_0
    //   63: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   66: aload_0
    //   67: getfield journalFileBackup : Ljava/io/File;
    //   70: aload_0
    //   71: getfield journalFile : Ljava/io/File;
    //   74: invokeinterface rename : (Ljava/io/File;Ljava/io/File;)V
    //   79: aload_0
    //   80: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   83: aload_0
    //   84: getfield journalFile : Ljava/io/File;
    //   87: invokeinterface exists : (Ljava/io/File;)Z
    //   92: istore_1
    //   93: iload_1
    //   94: ifeq -> 205
    //   97: aload_0
    //   98: invokespecial readJournal : ()V
    //   101: aload_0
    //   102: invokespecial processJournal : ()V
    //   105: aload_0
    //   106: iconst_1
    //   107: putfield initialized : Z
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    //   113: astore_2
    //   114: invokestatic get : ()Lokhttp3/internal/platform/Platform;
    //   117: astore_3
    //   118: new java/lang/StringBuilder
    //   121: dup
    //   122: invokespecial <init> : ()V
    //   125: astore #4
    //   127: aload #4
    //   129: ldc_w 'DiskLruCache '
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload #4
    //   138: aload_0
    //   139: getfield directory : Ljava/io/File;
    //   142: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload #4
    //   148: ldc_w ' is corrupt: '
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload #4
    //   157: aload_2
    //   158: invokevirtual getMessage : ()Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #4
    //   167: ldc_w ', removing'
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_3
    //   175: iconst_5
    //   176: aload #4
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: aload_2
    //   182: invokevirtual log : (ILjava/lang/String;Ljava/lang/Throwable;)V
    //   185: aload_0
    //   186: invokevirtual delete : ()V
    //   189: aload_0
    //   190: iconst_0
    //   191: putfield closed : Z
    //   194: goto -> 205
    //   197: astore_2
    //   198: aload_0
    //   199: iconst_0
    //   200: putfield closed : Z
    //   203: aload_2
    //   204: athrow
    //   205: aload_0
    //   206: invokevirtual rebuildJournal : ()V
    //   209: aload_0
    //   210: iconst_1
    //   211: putfield initialized : Z
    //   214: aload_0
    //   215: monitorexit
    //   216: return
    //   217: astore_2
    //   218: aload_0
    //   219: monitorexit
    //   220: aload_2
    //   221: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	217	finally
    //   14	59	217	finally
    //   62	79	217	finally
    //   79	93	217	finally
    //   97	110	113	java/io/IOException
    //   97	110	217	finally
    //   114	185	217	finally
    //   185	189	197	finally
    //   189	194	217	finally
    //   198	205	217	finally
    //   205	214	217	finally
  }
  
  public boolean isClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  boolean journalRebuildRequired() {
    int i = this.redundantOpCount;
    return (i >= 2000 && i >= this.lruEntries.size());
  }
  
  void rebuildJournal() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield journalWriter : Lj/d;
    //   6: ifnull -> 18
    //   9: aload_0
    //   10: getfield journalWriter : Lj/d;
    //   13: invokeinterface close : ()V
    //   18: aload_0
    //   19: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   22: aload_0
    //   23: getfield journalFileTmp : Ljava/io/File;
    //   26: invokeinterface sink : (Ljava/io/File;)Lj/s;
    //   31: invokestatic a : (Lj/s;)Lj/d;
    //   34: astore_1
    //   35: aload_1
    //   36: ldc 'libcore.io.DiskLruCache'
    //   38: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   43: bipush #10
    //   45: invokeinterface writeByte : (I)Lj/d;
    //   50: pop
    //   51: aload_1
    //   52: ldc '1'
    //   54: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   59: bipush #10
    //   61: invokeinterface writeByte : (I)Lj/d;
    //   66: pop
    //   67: aload_1
    //   68: aload_0
    //   69: getfield appVersion : I
    //   72: i2l
    //   73: invokeinterface i : (J)Lj/d;
    //   78: bipush #10
    //   80: invokeinterface writeByte : (I)Lj/d;
    //   85: pop
    //   86: aload_1
    //   87: aload_0
    //   88: getfield valueCount : I
    //   91: i2l
    //   92: invokeinterface i : (J)Lj/d;
    //   97: bipush #10
    //   99: invokeinterface writeByte : (I)Lj/d;
    //   104: pop
    //   105: aload_1
    //   106: bipush #10
    //   108: invokeinterface writeByte : (I)Lj/d;
    //   113: pop
    //   114: aload_0
    //   115: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   118: invokevirtual values : ()Ljava/util/Collection;
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore_2
    //   127: aload_2
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 227
    //   136: aload_2
    //   137: invokeinterface next : ()Ljava/lang/Object;
    //   142: checkcast okhttp3/internal/cache/DiskLruCache$Entry
    //   145: astore_3
    //   146: aload_3
    //   147: getfield currentEditor : Lokhttp3/internal/cache/DiskLruCache$Editor;
    //   150: ifnull -> 192
    //   153: aload_1
    //   154: ldc 'DIRTY'
    //   156: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   161: bipush #32
    //   163: invokeinterface writeByte : (I)Lj/d;
    //   168: pop
    //   169: aload_1
    //   170: aload_3
    //   171: getfield key : Ljava/lang/String;
    //   174: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   179: pop
    //   180: aload_1
    //   181: bipush #10
    //   183: invokeinterface writeByte : (I)Lj/d;
    //   188: pop
    //   189: goto -> 127
    //   192: aload_1
    //   193: ldc 'CLEAN'
    //   195: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   200: bipush #32
    //   202: invokeinterface writeByte : (I)Lj/d;
    //   207: pop
    //   208: aload_1
    //   209: aload_3
    //   210: getfield key : Ljava/lang/String;
    //   213: invokeinterface a : (Ljava/lang/String;)Lj/d;
    //   218: pop
    //   219: aload_3
    //   220: aload_1
    //   221: invokevirtual writeLengths : (Lj/d;)V
    //   224: goto -> 180
    //   227: aload_1
    //   228: invokeinterface close : ()V
    //   233: aload_0
    //   234: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   237: aload_0
    //   238: getfield journalFile : Ljava/io/File;
    //   241: invokeinterface exists : (Ljava/io/File;)Z
    //   246: ifeq -> 266
    //   249: aload_0
    //   250: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   253: aload_0
    //   254: getfield journalFile : Ljava/io/File;
    //   257: aload_0
    //   258: getfield journalFileBackup : Ljava/io/File;
    //   261: invokeinterface rename : (Ljava/io/File;Ljava/io/File;)V
    //   266: aload_0
    //   267: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   270: aload_0
    //   271: getfield journalFileTmp : Ljava/io/File;
    //   274: aload_0
    //   275: getfield journalFile : Ljava/io/File;
    //   278: invokeinterface rename : (Ljava/io/File;Ljava/io/File;)V
    //   283: aload_0
    //   284: getfield fileSystem : Lokhttp3/internal/io/FileSystem;
    //   287: aload_0
    //   288: getfield journalFileBackup : Ljava/io/File;
    //   291: invokeinterface delete : (Ljava/io/File;)V
    //   296: aload_0
    //   297: aload_0
    //   298: invokespecial newJournalWriter : ()Lj/d;
    //   301: putfield journalWriter : Lj/d;
    //   304: aload_0
    //   305: iconst_0
    //   306: putfield hasJournalErrors : Z
    //   309: aload_0
    //   310: iconst_0
    //   311: putfield mostRecentRebuildFailed : Z
    //   314: aload_0
    //   315: monitorexit
    //   316: return
    //   317: astore_2
    //   318: aload_1
    //   319: invokeinterface close : ()V
    //   324: aload_2
    //   325: athrow
    //   326: astore_1
    //   327: aload_0
    //   328: monitorexit
    //   329: goto -> 334
    //   332: aload_1
    //   333: athrow
    //   334: goto -> 332
    // Exception table:
    //   from	to	target	type
    //   2	18	326	finally
    //   18	35	326	finally
    //   35	127	317	finally
    //   127	180	317	finally
    //   180	189	317	finally
    //   192	224	317	finally
    //   227	266	326	finally
    //   266	314	326	finally
    //   318	326	326	finally
  }
  
  public boolean remove(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual initialize : ()V
    //   6: aload_0
    //   7: invokespecial checkNotClosed : ()V
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial validateKey : (Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield lruEntries : Ljava/util/LinkedHashMap;
    //   19: aload_1
    //   20: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast okhttp3/internal/cache/DiskLruCache$Entry
    //   26: astore_1
    //   27: aload_1
    //   28: ifnonnull -> 35
    //   31: aload_0
    //   32: monitorexit
    //   33: iconst_0
    //   34: ireturn
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual removeEntry : (Lokhttp3/internal/cache/DiskLruCache$Entry;)Z
    //   40: istore_2
    //   41: iload_2
    //   42: ifeq -> 62
    //   45: aload_0
    //   46: getfield size : J
    //   49: aload_0
    //   50: getfield maxSize : J
    //   53: lcmp
    //   54: ifgt -> 62
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield mostRecentTrimFailed : Z
    //   62: aload_0
    //   63: monitorexit
    //   64: iload_2
    //   65: ireturn
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	66	finally
    //   35	41	66	finally
    //   45	62	66	finally
  }
  
  boolean removeEntry(Entry paramEntry) {
    Editor editor = paramEntry.currentEditor;
    if (editor != null)
      editor.detach(); 
    for (int i = 0; i < this.valueCount; i++) {
      this.fileSystem.delete(paramEntry.cleanFiles[i]);
      long l = this.size;
      long[] arrayOfLong = paramEntry.lengths;
      this.size = l - arrayOfLong[i];
      arrayOfLong[i] = 0L;
    } 
    this.redundantOpCount++;
    this.journalWriter.a("REMOVE").writeByte(32).a(paramEntry.key).writeByte(10);
    this.lruEntries.remove(paramEntry.key);
    if (journalRebuildRequired())
      this.executor.execute(this.cleanupRunnable); 
    return true;
  }
  
  public void setMaxSize(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: putfield maxSize : J
    //   7: aload_0
    //   8: getfield initialized : Z
    //   11: ifeq -> 27
    //   14: aload_0
    //   15: getfield executor : Ljava/util/concurrent/Executor;
    //   18: aload_0
    //   19: getfield cleanupRunnable : Ljava/lang/Runnable;
    //   22: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_3
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_3
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	30	finally
  }
  
  public long size() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual initialize : ()V
    //   6: aload_0
    //   7: getfield size : J
    //   10: lstore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: lload_1
    //   14: lreturn
    //   15: astore_3
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_3
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
  
  public Iterator<Snapshot> snapshots() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual initialize : ()V
    //   6: new okhttp3/internal/cache/DiskLruCache$3
    //   9: dup
    //   10: aload_0
    //   11: invokespecial <init> : (Lokhttp3/internal/cache/DiskLruCache;)V
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: areturn
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	19	finally
  }
  
  void trimToSize() {
    while (this.size > this.maxSize)
      removeEntry(this.lruEntries.values().iterator().next()); 
    this.mostRecentTrimFailed = false;
  }
  
  public final class Editor {
    private boolean done;
    
    final DiskLruCache.Entry entry;
    
    final boolean[] written;
    
    Editor(DiskLruCache.Entry param1Entry) {
      boolean[] arrayOfBoolean;
      this.entry = param1Entry;
      if (param1Entry.readable) {
        DiskLruCache.this = null;
      } else {
        arrayOfBoolean = new boolean[DiskLruCache.this.valueCount];
      } 
      this.written = arrayOfBoolean;
    }
    
    public void abort() {
      synchronized (DiskLruCache.this) {
        if (!this.done) {
          if (this.entry.currentEditor == this)
            DiskLruCache.this.completeEdit(this, false); 
          this.done = true;
          return;
        } 
        throw new IllegalStateException();
      } 
    }
    
    public void abortUnlessCommitted() {
      synchronized (DiskLruCache.this) {
        if (!this.done) {
          Editor editor = this.entry.currentEditor;
          if (editor == this)
            try {
              DiskLruCache.this.completeEdit(this, false);
            } catch (IOException iOException) {} 
        } 
        return;
      } 
    }
    
    public void commit() {
      synchronized (DiskLruCache.this) {
        if (!this.done) {
          if (this.entry.currentEditor == this)
            DiskLruCache.this.completeEdit(this, true); 
          this.done = true;
          return;
        } 
        throw new IllegalStateException();
      } 
    }
    
    void detach() {
      if (this.entry.currentEditor == this) {
        int i = 0;
        while (true) {
          DiskLruCache diskLruCache = DiskLruCache.this;
          if (i < diskLruCache.valueCount) {
            try {
              diskLruCache.fileSystem.delete(this.entry.dirtyFiles[i]);
            } catch (IOException iOException) {}
            i++;
            continue;
          } 
          this.entry.currentEditor = null;
          return;
        } 
      } 
    }
    
    public s newSink(int param1Int) {
      synchronized (DiskLruCache.this) {
        if (!this.done) {
          if (this.entry.currentEditor != this)
            return l.a(); 
          if (!this.entry.readable)
            this.written[param1Int] = true; 
          File file = this.entry.dirtyFiles[param1Int];
          try {
            s s = DiskLruCache.this.fileSystem.sink(file);
            return (s)new FaultHidingSink(s) {
                protected void onException(IOException param2IOException) {
                  synchronized (DiskLruCache.this) {
                    DiskLruCache.Editor.this.detach();
                    return;
                  } 
                }
              };
          } catch (FileNotFoundException fileNotFoundException) {
            return l.a();
          } 
        } 
        throw new IllegalStateException();
      } 
    }
    
    public t newSource(int param1Int) {
      synchronized (DiskLruCache.this) {
        if (!this.done) {
          if (this.entry.readable) {
            Editor editor = this.entry.currentEditor;
            if (editor == this)
              try {
                return DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[param1Int]);
              } catch (FileNotFoundException fileNotFoundException) {
                return null;
              }  
          } 
          return null;
        } 
        throw new IllegalStateException();
      } 
    }
  }
  
  class null extends FaultHidingSink {
    null(s param1s) {
      super(param1s);
    }
    
    protected void onException(IOException param1IOException) {
      synchronized (DiskLruCache.this) {
        this.this$1.detach();
        return;
      } 
    }
  }
  
  private final class Entry {
    final File[] cleanFiles;
    
    DiskLruCache.Editor currentEditor;
    
    final File[] dirtyFiles;
    
    final String key;
    
    final long[] lengths;
    
    boolean readable;
    
    long sequenceNumber;
    
    Entry(String param1String) {
      this.key = param1String;
      int i = DiskLruCache.this.valueCount;
      this.lengths = new long[i];
      this.cleanFiles = new File[i];
      this.dirtyFiles = new File[i];
      StringBuilder stringBuilder = new StringBuilder(param1String);
      stringBuilder.append('.');
      int j = stringBuilder.length();
      for (i = 0; i < DiskLruCache.this.valueCount; i++) {
        stringBuilder.append(i);
        this.cleanFiles[i] = new File(DiskLruCache.this.directory, stringBuilder.toString());
        stringBuilder.append(".tmp");
        this.dirtyFiles[i] = new File(DiskLruCache.this.directory, stringBuilder.toString());
        stringBuilder.setLength(j);
      } 
    }
    
    private IOException invalidLengths(String[] param1ArrayOfString) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unexpected journal line: ");
      stringBuilder.append(Arrays.toString((Object[])param1ArrayOfString));
      throw new IOException(stringBuilder.toString());
    }
    
    void setLengths(String[] param1ArrayOfString) {
      if (param1ArrayOfString.length == DiskLruCache.this.valueCount) {
        int i = 0;
        try {
          while (i < param1ArrayOfString.length) {
            this.lengths[i] = Long.parseLong(param1ArrayOfString[i]);
            i++;
          } 
          return;
        } catch (NumberFormatException numberFormatException) {
          throw invalidLengths(param1ArrayOfString);
        } 
      } 
      IOException iOException = invalidLengths(param1ArrayOfString);
      throw iOException;
    }
    
    DiskLruCache.Snapshot snapshot() {
      if (Thread.holdsLock(DiskLruCache.this)) {
        t[] arrayOfT = new t[DiskLruCache.this.valueCount];
        long[] arrayOfLong = (long[])this.lengths.clone();
        boolean bool = false;
        int i = 0;
        try {
          while (i < DiskLruCache.this.valueCount) {
            arrayOfT[i] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i]);
            i++;
          } 
          return new DiskLruCache.Snapshot(this.key, this.sequenceNumber, arrayOfT, arrayOfLong);
        } catch (FileNotFoundException fileNotFoundException) {
          for (i = bool; i < DiskLruCache.this.valueCount && arrayOfT[i] != null; i++)
            Util.closeQuietly((Closeable)arrayOfT[i]); 
          try {
            DiskLruCache.this.removeEntry(this);
          } catch (IOException iOException) {}
          return null;
        } 
      } 
      AssertionError assertionError = new AssertionError();
      throw assertionError;
    }
    
    void writeLengths(d param1d) {
      for (long l : this.lengths)
        param1d.writeByte(32).i(l); 
    }
  }
  
  public final class Snapshot implements Closeable {
    private final String key;
    
    private final long[] lengths;
    
    private final long sequenceNumber;
    
    private final t[] sources;
    
    Snapshot(String param1String, long param1Long, t[] param1ArrayOft, long[] param1ArrayOflong) {
      this.key = param1String;
      this.sequenceNumber = param1Long;
      this.sources = param1ArrayOft;
      this.lengths = param1ArrayOflong;
    }
    
    public void close() {
      t[] arrayOfT = this.sources;
      int j = arrayOfT.length;
      for (int i = 0; i < j; i++)
        Util.closeQuietly((Closeable)arrayOfT[i]); 
    }
    
    public DiskLruCache.Editor edit() {
      return DiskLruCache.this.edit(this.key, this.sequenceNumber);
    }
    
    public long getLength(int param1Int) {
      return this.lengths[param1Int];
    }
    
    public t getSource(int param1Int) {
      return this.sources[param1Int];
    }
    
    public String key() {
      return this.key;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/cache/DiskLruCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */