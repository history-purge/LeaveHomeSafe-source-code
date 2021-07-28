package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

public abstract class n extends c {
  protected final Context c;
  
  protected String d;
  
  private final Map<String, Object> e = new HashMap<String, Object>();
  
  protected n(Context paramContext, String paramString) {
    super(a(paramContext, paramString), 1);
    this.c = paramContext;
  }
  
  public static File a(Context paramContext, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append((paramContext.getApplicationInfo()).dataDir);
    stringBuilder.append("/");
    stringBuilder.append(paramString);
    return new File(stringBuilder.toString());
  }
  
  private void a(byte paramByte, c paramc, e parame) {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("regenerating DSO store ");
    stringBuilder1.append(getClass().getName());
    Log.v("fb-UnpackingSoSource", stringBuilder1.toString());
    RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.a, "dso_manifest"), "rw");
    StringBuilder stringBuilder2 = null;
    stringBuilder1 = stringBuilder2;
    if (paramByte == 1)
      try {
        c c1 = c.a(randomAccessFile);
      } catch (Exception exception) {
        Log.i("fb-UnpackingSoSource", "error reading existing DSO manifest", exception);
        stringBuilder1 = stringBuilder2;
      } finally {} 
    stringBuilder2 = stringBuilder1;
    if (stringBuilder1 == null)
      c c1 = new c(new b[0]); 
    a(paramc.a);
    byte[] arrayOfByte = new byte[32768];
    while (true) {
      if (parame.a()) {
        Object object;
        d d = parame.b();
        boolean bool = true;
        paramByte = 0;
        while (true) {
          i = paramByte + 1;
          object = SYNTHETIC_LOCAL_VARIABLE_5;
        } 
        break;
      } 
      randomAccessFile.close();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Finished regenerating DSO store ");
      stringBuilder.append(getClass().getName());
      Log.v("fb-UnpackingSoSource", stringBuilder.toString());
      return;
    } 
  }
  
  private void a(d paramd, byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("extracting DSO ");
    stringBuilder2.append(paramd.c.c);
    Log.i("fb-UnpackingSoSource", stringBuilder2.toString());
    if (this.a.setWritable(true, true)) {
      RandomAccessFile randomAccessFile;
      File file = new File(this.a, paramd.c.c);
      try {
        randomAccessFile = new RandomAccessFile(file, "rw");
      } catch (IOException iOException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error overwriting ");
        stringBuilder.append(file);
        stringBuilder.append(" trying to delete and start over");
        Log.w("fb-UnpackingSoSource", stringBuilder.toString(), iOException);
        SysUtil.a(file);
        randomAccessFile = new RandomAccessFile(file, "rw");
      } 
      try {
        int i = paramd.d.available();
        if (i > 1)
          SysUtil.a(randomAccessFile.getFD(), i); 
        SysUtil.a(randomAccessFile, paramd.d, 2147483647, paramArrayOfbyte);
        randomAccessFile.setLength(randomAccessFile.getFilePointer());
        boolean bool = file.setExecutable(true, false);
        if (bool) {
          randomAccessFile.close();
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cannot make file executable: ");
        stringBuilder.append(file);
        throw new IOException(stringBuilder.toString());
      } catch (IOException iOException) {
        SysUtil.a(file);
        throw iOException;
      } finally {}
      randomAccessFile.close();
      throw paramd;
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("cannot make directory writable for us: ");
    stringBuilder1.append(this.a);
    throw new IOException(stringBuilder1.toString());
  }
  
  private void a(b[] paramArrayOfb) {
    String[] arrayOfString = this.a.list();
    if (arrayOfString != null) {
      for (int i = 0; i < arrayOfString.length; i++) {
        String str = arrayOfString[i];
        if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
          boolean bool = false;
          for (int j = 0; !bool && j < paramArrayOfb.length; j++) {
            if ((paramArrayOfb[j]).c.equals(str))
              bool = true; 
          } 
          if (!bool) {
            File file = new File(this.a, str);
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("deleting unaccounted-for file ");
            stringBuilder1.append(file);
            Log.v("fb-UnpackingSoSource", stringBuilder1.toString());
            SysUtil.a(file);
          } 
        } 
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("unable to list directory ");
    stringBuilder.append(this.a);
    IOException iOException = new IOException(stringBuilder.toString());
    throw iOException;
  }
  
  private boolean a(g paramg, int paramInt, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/io/File
    //   3: dup
    //   4: aload_0
    //   5: getfield a : Ljava/io/File;
    //   8: ldc 'dso_state'
    //   10: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   13: astore #9
    //   15: new java/io/RandomAccessFile
    //   18: dup
    //   19: aload #9
    //   21: ldc 'rw'
    //   23: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   26: astore #6
    //   28: aload #6
    //   30: invokevirtual readByte : ()B
    //   33: istore #5
    //   35: iload #5
    //   37: istore #4
    //   39: iload #5
    //   41: iconst_1
    //   42: if_icmpeq -> 108
    //   45: new java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #7
    //   54: aload #7
    //   56: ldc 'dso store '
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #7
    //   64: aload_0
    //   65: getfield a : Ljava/io/File;
    //   68: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload #7
    //   74: ldc ' regeneration interrupted: wiping clean'
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: ldc 'fb-UnpackingSoSource'
    //   82: aload #7
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   90: pop
    //   91: iconst_0
    //   92: istore #4
    //   94: goto -> 108
    //   97: astore_1
    //   98: aload_1
    //   99: athrow
    //   100: astore_1
    //   101: aload #6
    //   103: invokevirtual close : ()V
    //   106: aload_1
    //   107: athrow
    //   108: aload #6
    //   110: invokevirtual close : ()V
    //   113: new java/io/File
    //   116: dup
    //   117: aload_0
    //   118: getfield a : Ljava/io/File;
    //   121: ldc 'dso_deps'
    //   123: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   126: astore #11
    //   128: aconst_null
    //   129: astore #6
    //   131: new java/io/RandomAccessFile
    //   134: dup
    //   135: aload #11
    //   137: ldc 'rw'
    //   139: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   142: astore #8
    //   144: aload #8
    //   146: invokevirtual length : ()J
    //   149: l2i
    //   150: newarray byte
    //   152: astore #7
    //   154: aload #8
    //   156: aload #7
    //   158: invokevirtual read : ([B)I
    //   161: aload #7
    //   163: arraylength
    //   164: if_icmpeq -> 178
    //   167: ldc 'fb-UnpackingSoSource'
    //   169: ldc 'short read of so store deps file: marking unclean'
    //   171: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: iconst_0
    //   176: istore #4
    //   178: aload #7
    //   180: aload_3
    //   181: invokestatic equals : ([B[B)Z
    //   184: ifne -> 436
    //   187: ldc 'fb-UnpackingSoSource'
    //   189: ldc_w 'deps mismatch on deps store: regenerating'
    //   192: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   195: pop
    //   196: iconst_0
    //   197: istore #4
    //   199: goto -> 436
    //   202: ldc 'fb-UnpackingSoSource'
    //   204: ldc_w 'so store dirty: regenerating'
    //   207: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   210: pop
    //   211: aload #9
    //   213: iconst_0
    //   214: invokestatic b : (Ljava/io/File;B)V
    //   217: aload_0
    //   218: invokevirtual b : ()Lcom/facebook/soloader/n$f;
    //   221: astore #10
    //   223: aload #10
    //   225: invokevirtual a : ()Lcom/facebook/soloader/n$c;
    //   228: astore #7
    //   230: aload #10
    //   232: invokevirtual b : ()Lcom/facebook/soloader/n$e;
    //   235: astore #6
    //   237: aload_0
    //   238: iload #4
    //   240: aload #7
    //   242: aload #6
    //   244: invokespecial a : (BLcom/facebook/soloader/n$c;Lcom/facebook/soloader/n$e;)V
    //   247: aload #6
    //   249: ifnull -> 257
    //   252: aload #6
    //   254: invokevirtual close : ()V
    //   257: aload #7
    //   259: astore #6
    //   261: aload #10
    //   263: ifnull -> 450
    //   266: aload #10
    //   268: invokevirtual close : ()V
    //   271: aload #7
    //   273: astore #6
    //   275: goto -> 450
    //   278: aload #8
    //   280: invokevirtual close : ()V
    //   283: aload #6
    //   285: ifnonnull -> 290
    //   288: iconst_0
    //   289: ireturn
    //   290: new com/facebook/soloader/n$a
    //   293: dup
    //   294: aload_0
    //   295: aload #11
    //   297: aload_3
    //   298: aload #6
    //   300: aload #9
    //   302: aload_1
    //   303: invokespecial <init> : (Lcom/facebook/soloader/n;Ljava/io/File;[BLcom/facebook/soloader/n$c;Ljava/io/File;Lcom/facebook/soloader/g;)V
    //   306: astore_1
    //   307: iload_2
    //   308: iconst_1
    //   309: iand
    //   310: ifeq -> 358
    //   313: new java/lang/StringBuilder
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: astore_3
    //   321: aload_3
    //   322: ldc_w 'SoSync:'
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload_3
    //   330: aload_0
    //   331: getfield a : Ljava/io/File;
    //   334: invokevirtual getName : ()Ljava/lang/String;
    //   337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: pop
    //   341: new java/lang/Thread
    //   344: dup
    //   345: aload_1
    //   346: aload_3
    //   347: invokevirtual toString : ()Ljava/lang/String;
    //   350: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/String;)V
    //   353: invokevirtual start : ()V
    //   356: iconst_1
    //   357: ireturn
    //   358: aload_1
    //   359: invokeinterface run : ()V
    //   364: iconst_1
    //   365: ireturn
    //   366: astore_1
    //   367: aload_1
    //   368: athrow
    //   369: astore_1
    //   370: aload #6
    //   372: ifnull -> 380
    //   375: aload #6
    //   377: invokevirtual close : ()V
    //   380: aload_1
    //   381: athrow
    //   382: astore_1
    //   383: aload_1
    //   384: athrow
    //   385: astore_1
    //   386: aload #10
    //   388: ifnull -> 396
    //   391: aload #10
    //   393: invokevirtual close : ()V
    //   396: aload_1
    //   397: athrow
    //   398: astore_1
    //   399: aload_1
    //   400: athrow
    //   401: astore_1
    //   402: aload #8
    //   404: invokevirtual close : ()V
    //   407: goto -> 412
    //   410: aload_1
    //   411: athrow
    //   412: goto -> 410
    //   415: astore #7
    //   417: goto -> 91
    //   420: astore_3
    //   421: goto -> 106
    //   424: astore_3
    //   425: goto -> 380
    //   428: astore_3
    //   429: goto -> 396
    //   432: astore_3
    //   433: goto -> 407
    //   436: iload #4
    //   438: ifeq -> 202
    //   441: iload_2
    //   442: iconst_2
    //   443: iand
    //   444: ifeq -> 450
    //   447: goto -> 202
    //   450: goto -> 278
    // Exception table:
    //   from	to	target	type
    //   28	35	415	java/io/EOFException
    //   28	35	97	finally
    //   45	91	415	java/io/EOFException
    //   45	91	97	finally
    //   98	100	100	finally
    //   101	106	420	finally
    //   144	154	398	finally
    //   154	175	398	finally
    //   178	196	398	finally
    //   202	223	398	finally
    //   223	237	382	finally
    //   237	247	366	finally
    //   252	257	382	finally
    //   266	271	398	finally
    //   367	369	369	finally
    //   375	380	424	finally
    //   380	382	382	finally
    //   383	385	385	finally
    //   391	396	428	finally
    //   396	398	398	finally
    //   399	401	401	finally
    //   402	407	432	finally
  }
  
  private static void b(File paramFile, byte paramByte) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "rw");
    try {
      randomAccessFile.seek(0L);
      randomAccessFile.write(paramByte);
      randomAccessFile.setLength(randomAccessFile.getFilePointer());
      randomAccessFile.getFD().sync();
      return;
    } finally {
      null = null;
    } 
  }
  
  private Object c(String paramString) {
    synchronized (this.e) {
      Object object2 = this.e.get(paramString);
      Object object1 = object2;
      if (object2 == null) {
        object1 = new Object();
        this.e.put(paramString, object1);
      } 
      return object1;
    } 
  }
  
  public int a(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    synchronized (c(paramString)) {
      paramInt = a(paramString, paramInt, this.a, paramThreadPolicy);
      return paramInt;
    } 
  }
  
  protected void a(int paramInt) {
    SysUtil.c(this.a);
    g g = g.a(new File(this.a, "dso_lock"));
    try {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("locked dso store ");
      stringBuilder.append(this.a);
      Log.v("fb-UnpackingSoSource", stringBuilder.toString());
      if (a(g, paramInt, a())) {
        g = null;
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("dso store is up-to-date: ");
        stringBuilder.append(this.a);
        Log.i("fb-UnpackingSoSource", stringBuilder.toString());
      } 
      if (g != null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("releasing dso store lock for ");
        stringBuilder.append(this.a);
        Log.v("fb-UnpackingSoSource", stringBuilder.toString());
        return;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("not releasing dso store lock for ");
      stringBuilder.append(this.a);
      stringBuilder.append(" (syncer thread started)");
      return;
    } finally {
      if (g != null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("releasing dso store lock for ");
        stringBuilder.append(this.a);
        Log.v("fb-UnpackingSoSource", stringBuilder.toString());
        g.close();
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("not releasing dso store lock for ");
        stringBuilder.append(this.a);
        stringBuilder.append(" (syncer thread started)");
        Log.v("fb-UnpackingSoSource", stringBuilder.toString());
      } 
    } 
  }
  
  public void a(String[] paramArrayOfString) {}
  
  protected byte[] a() {
    byte[] arrayOfByte;
    Parcel parcel = Parcel.obtain();
    f f = b();
    try {
      b[] arrayOfB = (f.a()).a;
      parcel.writeByte((byte)1);
      parcel.writeInt(arrayOfB.length);
      for (int i = 0; i < arrayOfB.length; i++) {
        parcel.writeString((arrayOfB[i]).c);
        parcel.writeString((arrayOfB[i]).d);
      } 
      if (f != null)
        f.close(); 
      arrayOfByte = parcel.marshall();
      return arrayOfByte;
    } finally {
      parcel = null;
    } 
  }
  
  protected abstract f b();
  
  protected void b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial c : (Ljava/lang/String;)Ljava/lang/Object;
    //   7: astore_2
    //   8: aload_2
    //   9: monitorenter
    //   10: aload_0
    //   11: aload_1
    //   12: putfield d : Ljava/lang/String;
    //   15: aload_0
    //   16: iconst_2
    //   17: invokevirtual a : (I)V
    //   20: aload_2
    //   21: monitorexit
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_2
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	30	finally
    //   10	22	25	finally
    //   26	28	25	finally
    //   28	30	30	finally
  }
  
  class a implements Runnable {
    a(n this$0, File param1File1, byte[] param1ArrayOfbyte, n.c param1c, File param1File2, g param1g) {}
    
    public void run() {
      try {
      
      } finally {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("releasing dso store lock for ");
        stringBuilder.append(this.h.a);
        stringBuilder.append(" (from syncer thread)");
        Log.v("fb-UnpackingSoSource", stringBuilder.toString());
        this.g.close();
      } 
    }
  }
  
  public static class b {
    public final String c;
    
    public final String d;
    
    public b(String param1String1, String param1String2) {
      this.c = param1String1;
      this.d = param1String2;
    }
  }
  
  public static final class c {
    public final n.b[] a;
    
    public c(n.b[] param1ArrayOfb) {
      this.a = param1ArrayOfb;
    }
    
    static final c a(DataInput param1DataInput) {
      if (param1DataInput.readByte() == 1) {
        int i = param1DataInput.readInt();
        if (i >= 0) {
          n.b[] arrayOfB = new n.b[i];
          for (int j = 0; j < i; j++)
            arrayOfB[j] = new n.b(param1DataInput.readUTF(), param1DataInput.readUTF()); 
          return new c(arrayOfB);
        } 
        throw new RuntimeException("illegal number of shared libraries");
      } 
      RuntimeException runtimeException = new RuntimeException("wrong dso manifest version");
      throw runtimeException;
    }
    
    public final void a(DataOutput param1DataOutput) {
      param1DataOutput.writeByte(1);
      param1DataOutput.writeInt(this.a.length);
      int i = 0;
      while (true) {
        n.b[] arrayOfB = this.a;
        if (i < arrayOfB.length) {
          param1DataOutput.writeUTF((arrayOfB[i]).c);
          param1DataOutput.writeUTF((this.a[i]).d);
          i++;
          continue;
        } 
        break;
      } 
    }
  }
  
  protected static final class d implements Closeable {
    public final n.b c;
    
    public final InputStream d;
    
    public d(n.b param1b, InputStream param1InputStream) {
      this.c = param1b;
      this.d = param1InputStream;
    }
    
    public void close() {
      this.d.close();
    }
  }
  
  protected static abstract class e implements Closeable {
    public abstract boolean a();
    
    public abstract n.d b();
    
    public void close() {}
  }
  
  protected static abstract class f implements Closeable {
    protected abstract n.c a();
    
    protected abstract n.e b();
    
    public void close() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */