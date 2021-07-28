package okhttp3.internal.cache2;

import j.c;
import j.f;
import j.t;
import j.u;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;

final class Relay {
  private static final long FILE_HEADER_SIZE = 32L;
  
  static final f PREFIX_CLEAN = f.d("OkHttp cache v1\n");
  
  static final f PREFIX_DIRTY = f.d("OkHttp DIRTY :(\n");
  
  private static final int SOURCE_FILE = 2;
  
  private static final int SOURCE_UPSTREAM = 1;
  
  final c buffer;
  
  final long bufferMaxSize;
  
  boolean complete;
  
  RandomAccessFile file;
  
  private final f metadata;
  
  int sourceCount;
  
  t upstream;
  
  final c upstreamBuffer;
  
  long upstreamPos;
  
  Thread upstreamReader;
  
  private Relay(RandomAccessFile paramRandomAccessFile, t paramt, long paramLong1, f paramf, long paramLong2) {
    boolean bool;
    this.upstreamBuffer = new c();
    this.buffer = new c();
    this.file = paramRandomAccessFile;
    this.upstream = paramt;
    if (paramt == null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.complete = bool;
    this.upstreamPos = paramLong1;
    this.metadata = paramf;
    this.bufferMaxSize = paramLong2;
  }
  
  public static Relay edit(File paramFile, t paramt, f paramf, long paramLong) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "rw");
    Relay relay = new Relay(randomAccessFile, paramt, 0L, paramf, paramLong);
    randomAccessFile.setLength(0L);
    relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
    return relay;
  }
  
  public static Relay read(File paramFile) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "rw");
    FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
    c c1 = new c();
    fileOperator.read(0L, c1, 32L);
    if (c1.c(PREFIX_CLEAN.s()).equals(PREFIX_CLEAN)) {
      long l1 = c1.readLong();
      long l2 = c1.readLong();
      c1 = new c();
      fileOperator.read(l1 + 32L, c1, l2);
      return new Relay(randomAccessFile, null, l1, c1.c(), 0L);
    } 
    throw new IOException("unreadable cache file");
  }
  
  private void writeHeader(f paramf, long paramLong1, long paramLong2) {
    c c1 = new c();
    c1.a(paramf);
    c1.k(paramLong1);
    c1.k(paramLong2);
    if (c1.s() == 32L) {
      (new FileOperator(this.file.getChannel())).write(0L, c1, 32L);
      return;
    } 
    throw new IllegalArgumentException();
  }
  
  private void writeMetadata(long paramLong) {
    c c1 = new c();
    c1.a(this.metadata);
    (new FileOperator(this.file.getChannel())).write(32L + paramLong, c1, this.metadata.s());
  }
  
  void commit(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: lload_1
    //   2: invokespecial writeMetadata : (J)V
    //   5: aload_0
    //   6: getfield file : Ljava/io/RandomAccessFile;
    //   9: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   12: iconst_0
    //   13: invokevirtual force : (Z)V
    //   16: aload_0
    //   17: getstatic okhttp3/internal/cache2/Relay.PREFIX_CLEAN : Lj/f;
    //   20: lload_1
    //   21: aload_0
    //   22: getfield metadata : Lj/f;
    //   25: invokevirtual s : ()I
    //   28: i2l
    //   29: invokespecial writeHeader : (Lj/f;JJ)V
    //   32: aload_0
    //   33: getfield file : Ljava/io/RandomAccessFile;
    //   36: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   39: iconst_0
    //   40: invokevirtual force : (Z)V
    //   43: aload_0
    //   44: monitorenter
    //   45: aload_0
    //   46: iconst_1
    //   47: putfield complete : Z
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_0
    //   53: getfield upstream : Lj/t;
    //   56: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield upstream : Lj/t;
    //   64: return
    //   65: astore_3
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_3
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   45	52	65	finally
    //   66	68	65	finally
  }
  
  boolean isClosed() {
    return (this.file == null);
  }
  
  public f metadata() {
    return this.metadata;
  }
  
  public t newSource() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield file : Ljava/io/RandomAccessFile;
    //   6: ifnonnull -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: aconst_null
    //   12: areturn
    //   13: aload_0
    //   14: aload_0
    //   15: getfield sourceCount : I
    //   18: iconst_1
    //   19: iadd
    //   20: putfield sourceCount : I
    //   23: aload_0
    //   24: monitorexit
    //   25: new okhttp3/internal/cache2/Relay$RelaySource
    //   28: dup
    //   29: aload_0
    //   30: invokespecial <init> : (Lokhttp3/internal/cache2/Relay;)V
    //   33: areturn
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	34	finally
    //   13	25	34	finally
    //   35	37	34	finally
  }
  
  class RelaySource implements t {
    private FileOperator fileOperator = new FileOperator(Relay.this.file.getChannel());
    
    private long sourcePos;
    
    private final u timeout = new u();
    
    public void close() {
      if (this.fileOperator == null)
        return; 
      null = null;
      this.fileOperator = null;
      synchronized (Relay.this) {
        Relay relay = Relay.this;
        relay.sourceCount--;
        if (Relay.this.sourceCount == 0) {
          null = Relay.this.file;
          Relay.this.file = null;
        } 
        if (null != null)
          Util.closeQuietly(null); 
        return;
      } 
    }
    
    public long read(c param1c, long param1Long) {
      // Byte code:
      //   0: aload_0
      //   1: getfield fileOperator : Lokhttp3/internal/cache2/FileOperator;
      //   4: ifnull -> 539
      //   7: aload_0
      //   8: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   11: astore #9
      //   13: aload #9
      //   15: monitorenter
      //   16: aload_0
      //   17: getfield sourcePos : J
      //   20: lstore #7
      //   22: aload_0
      //   23: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   26: getfield upstreamPos : J
      //   29: lstore #5
      //   31: lload #7
      //   33: lload #5
      //   35: lcmp
      //   36: ifne -> 99
      //   39: aload_0
      //   40: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   43: getfield complete : Z
      //   46: ifeq -> 56
      //   49: aload #9
      //   51: monitorexit
      //   52: ldc2_w -1
      //   55: lreturn
      //   56: aload_0
      //   57: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   60: getfield upstreamReader : Ljava/lang/Thread;
      //   63: ifnull -> 80
      //   66: aload_0
      //   67: getfield timeout : Lj/u;
      //   70: aload_0
      //   71: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   74: invokevirtual waitUntilNotified : (Ljava/lang/Object;)V
      //   77: goto -> 16
      //   80: aload_0
      //   81: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   84: invokestatic currentThread : ()Ljava/lang/Thread;
      //   87: putfield upstreamReader : Ljava/lang/Thread;
      //   90: iconst_1
      //   91: istore #4
      //   93: aload #9
      //   95: monitorexit
      //   96: goto -> 130
      //   99: lload #5
      //   101: aload_0
      //   102: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   105: getfield buffer : Lj/c;
      //   108: invokevirtual s : ()J
      //   111: lsub
      //   112: lstore #7
      //   114: aload_0
      //   115: getfield sourcePos : J
      //   118: lload #7
      //   120: lcmp
      //   121: ifge -> 486
      //   124: aload #9
      //   126: monitorexit
      //   127: iconst_2
      //   128: istore #4
      //   130: iload #4
      //   132: iconst_2
      //   133: if_icmpne -> 177
      //   136: lload_2
      //   137: lload #5
      //   139: aload_0
      //   140: getfield sourcePos : J
      //   143: lsub
      //   144: invokestatic min : (JJ)J
      //   147: lstore_2
      //   148: aload_0
      //   149: getfield fileOperator : Lokhttp3/internal/cache2/FileOperator;
      //   152: aload_0
      //   153: getfield sourcePos : J
      //   156: ldc2_w 32
      //   159: ladd
      //   160: aload_1
      //   161: lload_2
      //   162: invokevirtual read : (JLj/c;J)V
      //   165: aload_0
      //   166: aload_0
      //   167: getfield sourcePos : J
      //   170: lload_2
      //   171: ladd
      //   172: putfield sourcePos : J
      //   175: lload_2
      //   176: lreturn
      //   177: aload_0
      //   178: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   181: getfield upstream : Lj/t;
      //   184: aload_0
      //   185: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   188: getfield upstreamBuffer : Lj/c;
      //   191: aload_0
      //   192: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   195: getfield bufferMaxSize : J
      //   198: invokeinterface read : (Lj/c;J)J
      //   203: lstore #7
      //   205: lload #7
      //   207: ldc2_w -1
      //   210: lcmp
      //   211: ifne -> 258
      //   214: aload_0
      //   215: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   218: lload #5
      //   220: invokevirtual commit : (J)V
      //   223: aload_0
      //   224: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   227: astore_1
      //   228: aload_1
      //   229: monitorenter
      //   230: aload_0
      //   231: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   234: aconst_null
      //   235: putfield upstreamReader : Ljava/lang/Thread;
      //   238: aload_0
      //   239: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   242: invokevirtual notifyAll : ()V
      //   245: aload_1
      //   246: monitorexit
      //   247: ldc2_w -1
      //   250: lreturn
      //   251: astore #9
      //   253: aload_1
      //   254: monitorexit
      //   255: aload #9
      //   257: athrow
      //   258: lload #7
      //   260: lload_2
      //   261: invokestatic min : (JJ)J
      //   264: lstore_2
      //   265: aload_0
      //   266: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   269: getfield upstreamBuffer : Lj/c;
      //   272: aload_1
      //   273: lconst_0
      //   274: lload_2
      //   275: invokevirtual a : (Lj/c;JJ)Lj/c;
      //   278: pop
      //   279: aload_0
      //   280: aload_0
      //   281: getfield sourcePos : J
      //   284: lload_2
      //   285: ladd
      //   286: putfield sourcePos : J
      //   289: aload_0
      //   290: getfield fileOperator : Lokhttp3/internal/cache2/FileOperator;
      //   293: lload #5
      //   295: ldc2_w 32
      //   298: ladd
      //   299: aload_0
      //   300: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   303: getfield upstreamBuffer : Lj/c;
      //   306: invokevirtual clone : ()Lj/c;
      //   309: lload #7
      //   311: invokevirtual write : (JLj/c;J)V
      //   314: aload_0
      //   315: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   318: astore_1
      //   319: aload_1
      //   320: monitorenter
      //   321: aload_0
      //   322: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   325: getfield buffer : Lj/c;
      //   328: aload_0
      //   329: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   332: getfield upstreamBuffer : Lj/c;
      //   335: lload #7
      //   337: invokevirtual write : (Lj/c;J)V
      //   340: aload_0
      //   341: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   344: getfield buffer : Lj/c;
      //   347: invokevirtual s : ()J
      //   350: aload_0
      //   351: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   354: getfield bufferMaxSize : J
      //   357: lcmp
      //   358: ifle -> 389
      //   361: aload_0
      //   362: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   365: getfield buffer : Lj/c;
      //   368: aload_0
      //   369: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   372: getfield buffer : Lj/c;
      //   375: invokevirtual s : ()J
      //   378: aload_0
      //   379: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   382: getfield bufferMaxSize : J
      //   385: lsub
      //   386: invokevirtual skip : (J)V
      //   389: aload_0
      //   390: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   393: astore #9
      //   395: aload #9
      //   397: aload #9
      //   399: getfield upstreamPos : J
      //   402: lload #7
      //   404: ladd
      //   405: putfield upstreamPos : J
      //   408: aload_1
      //   409: monitorexit
      //   410: aload_0
      //   411: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   414: astore_1
      //   415: aload_1
      //   416: monitorenter
      //   417: aload_0
      //   418: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   421: aconst_null
      //   422: putfield upstreamReader : Ljava/lang/Thread;
      //   425: aload_0
      //   426: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   429: invokevirtual notifyAll : ()V
      //   432: aload_1
      //   433: monitorexit
      //   434: lload_2
      //   435: lreturn
      //   436: astore #9
      //   438: aload_1
      //   439: monitorexit
      //   440: aload #9
      //   442: athrow
      //   443: astore #9
      //   445: aload_1
      //   446: monitorexit
      //   447: aload #9
      //   449: athrow
      //   450: astore #9
      //   452: aload_0
      //   453: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   456: astore_1
      //   457: aload_1
      //   458: monitorenter
      //   459: aload_0
      //   460: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   463: aconst_null
      //   464: putfield upstreamReader : Ljava/lang/Thread;
      //   467: aload_0
      //   468: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   471: invokevirtual notifyAll : ()V
      //   474: aload_1
      //   475: monitorexit
      //   476: aload #9
      //   478: athrow
      //   479: astore #9
      //   481: aload_1
      //   482: monitorexit
      //   483: aload #9
      //   485: athrow
      //   486: lload_2
      //   487: lload #5
      //   489: aload_0
      //   490: getfield sourcePos : J
      //   493: lsub
      //   494: invokestatic min : (JJ)J
      //   497: lstore_2
      //   498: aload_0
      //   499: getfield this$0 : Lokhttp3/internal/cache2/Relay;
      //   502: getfield buffer : Lj/c;
      //   505: aload_1
      //   506: aload_0
      //   507: getfield sourcePos : J
      //   510: lload #7
      //   512: lsub
      //   513: lload_2
      //   514: invokevirtual a : (Lj/c;JJ)Lj/c;
      //   517: pop
      //   518: aload_0
      //   519: aload_0
      //   520: getfield sourcePos : J
      //   523: lload_2
      //   524: ladd
      //   525: putfield sourcePos : J
      //   528: aload #9
      //   530: monitorexit
      //   531: lload_2
      //   532: lreturn
      //   533: astore_1
      //   534: aload #9
      //   536: monitorexit
      //   537: aload_1
      //   538: athrow
      //   539: new java/lang/IllegalStateException
      //   542: dup
      //   543: ldc 'closed'
      //   545: invokespecial <init> : (Ljava/lang/String;)V
      //   548: astore_1
      //   549: goto -> 554
      //   552: aload_1
      //   553: athrow
      //   554: goto -> 552
      // Exception table:
      //   from	to	target	type
      //   16	31	533	finally
      //   39	52	533	finally
      //   56	77	533	finally
      //   80	90	533	finally
      //   93	96	533	finally
      //   99	127	533	finally
      //   177	205	450	finally
      //   214	223	450	finally
      //   230	247	251	finally
      //   253	255	251	finally
      //   258	321	450	finally
      //   321	389	443	finally
      //   389	410	443	finally
      //   417	434	436	finally
      //   438	440	436	finally
      //   445	447	443	finally
      //   447	450	450	finally
      //   459	476	479	finally
      //   481	483	479	finally
      //   486	531	533	finally
      //   534	537	533	finally
    }
    
    public u timeout() {
      return this.timeout;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/cache2/Relay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */