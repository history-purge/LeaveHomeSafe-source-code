package okhttp3.internal.http2;

import j.c;
import j.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class Http2Writer implements Closeable {
  private static final Logger logger = Logger.getLogger(Http2.class.getName());
  
  private final boolean client;
  
  private boolean closed;
  
  private final c hpackBuffer;
  
  final Hpack.Writer hpackWriter;
  
  private int maxFrameSize;
  
  private final d sink;
  
  Http2Writer(d paramd, boolean paramBoolean) {
    this.sink = paramd;
    this.client = paramBoolean;
    this.hpackBuffer = new c();
    this.hpackWriter = new Hpack.Writer(this.hpackBuffer);
    this.maxFrameSize = 16384;
  }
  
  private void writeContinuationFrames(int paramInt, long paramLong) {
    while (paramLong > 0L) {
      boolean bool;
      int i = (int)Math.min(this.maxFrameSize, paramLong);
      long l = i;
      paramLong -= l;
      if (paramLong == 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      frameHeader(paramInt, i, (byte)9, bool);
      this.sink.write(this.hpackBuffer, l);
    } 
  }
  
  private static void writeMedium(d paramd, int paramInt) {
    paramd.writeByte(paramInt >>> 16 & 0xFF);
    paramd.writeByte(paramInt >>> 8 & 0xFF);
    paramd.writeByte(paramInt & 0xFF);
  }
  
  public void applyAndAckSettings(Settings paramSettings) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 60
    //   9: aload_0
    //   10: aload_1
    //   11: aload_0
    //   12: getfield maxFrameSize : I
    //   15: invokevirtual getMaxFrameSize : (I)I
    //   18: putfield maxFrameSize : I
    //   21: aload_1
    //   22: invokevirtual getHeaderTableSize : ()I
    //   25: iconst_m1
    //   26: if_icmpeq -> 40
    //   29: aload_0
    //   30: getfield hpackWriter : Lokhttp3/internal/http2/Hpack$Writer;
    //   33: aload_1
    //   34: invokevirtual getHeaderTableSize : ()I
    //   37: invokevirtual setHeaderTableSizeSetting : (I)V
    //   40: aload_0
    //   41: iconst_0
    //   42: iconst_0
    //   43: iconst_4
    //   44: iconst_1
    //   45: invokevirtual frameHeader : (IIBB)V
    //   48: aload_0
    //   49: getfield sink : Lj/d;
    //   52: invokeinterface flush : ()V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: new java/io/IOException
    //   63: dup
    //   64: ldc 'closed'
    //   66: invokespecial <init> : (Ljava/lang/String;)V
    //   69: athrow
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	40	70	finally
    //   40	57	70	finally
    //   60	70	70	finally
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield closed : Z
    //   7: aload_0
    //   8: getfield sink : Lj/d;
    //   11: invokeinterface close : ()V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally
  }
  
  public void connectionPreface() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 85
    //   9: aload_0
    //   10: getfield client : Z
    //   13: istore_1
    //   14: iload_1
    //   15: ifne -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: getstatic okhttp3/internal/http2/Http2Writer.logger : Ljava/util/logging/Logger;
    //   24: getstatic java/util/logging/Level.FINE : Ljava/util/logging/Level;
    //   27: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   30: ifeq -> 57
    //   33: getstatic okhttp3/internal/http2/Http2Writer.logger : Ljava/util/logging/Logger;
    //   36: ldc '>> CONNECTION %s'
    //   38: iconst_1
    //   39: anewarray java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: getstatic okhttp3/internal/http2/Http2.CONNECTION_PREFACE : Lj/f;
    //   47: invokevirtual b : ()Ljava/lang/String;
    //   50: aastore
    //   51: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   54: invokevirtual fine : (Ljava/lang/String;)V
    //   57: aload_0
    //   58: getfield sink : Lj/d;
    //   61: getstatic okhttp3/internal/http2/Http2.CONNECTION_PREFACE : Lj/f;
    //   64: invokevirtual u : ()[B
    //   67: invokeinterface write : ([B)Lj/d;
    //   72: pop
    //   73: aload_0
    //   74: getfield sink : Lj/d;
    //   77: invokeinterface flush : ()V
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: new java/io/IOException
    //   88: dup
    //   89: ldc 'closed'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: athrow
    //   95: astore_2
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_2
    //   99: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	95	finally
    //   21	57	95	finally
    //   57	82	95	finally
    //   85	95	95	finally
  }
  
  public void data(boolean paramBoolean, int paramInt1, c paramc, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 33
    //   9: iconst_0
    //   10: istore #5
    //   12: iload_1
    //   13: ifeq -> 20
    //   16: iconst_1
    //   17: i2b
    //   18: istore #5
    //   20: aload_0
    //   21: iload_2
    //   22: iload #5
    //   24: aload_3
    //   25: iload #4
    //   27: invokevirtual dataFrame : (IBLj/c;I)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: new java/io/IOException
    //   36: dup
    //   37: ldc 'closed'
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: athrow
    //   43: astore_3
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_3
    //   47: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	43	finally
    //   20	30	43	finally
    //   33	43	43	finally
  }
  
  void dataFrame(int paramInt1, byte paramByte, c paramc, int paramInt2) {
    frameHeader(paramInt1, paramInt2, (byte)0, paramByte);
    if (paramInt2 > 0)
      this.sink.write(paramc, paramInt2); 
  }
  
  public void flush() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 21
    //   9: aload_0
    //   10: getfield sink : Lj/d;
    //   13: invokeinterface flush : ()V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: new java/io/IOException
    //   24: dup
    //   25: ldc 'closed'
    //   27: invokespecial <init> : (Ljava/lang/String;)V
    //   30: athrow
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	31	finally
    //   21	31	31	finally
  }
  
  public void frameHeader(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2) {
    if (logger.isLoggable(Level.FINE))
      logger.fine(Http2.frameLog(false, paramInt1, paramInt2, paramByte1, paramByte2)); 
    int i = this.maxFrameSize;
    if (paramInt2 <= i) {
      if ((Integer.MIN_VALUE & paramInt1) == 0) {
        writeMedium(this.sink, paramInt2);
        this.sink.writeByte(paramByte1 & 0xFF);
        this.sink.writeByte(paramByte2 & 0xFF);
        this.sink.writeInt(paramInt1 & Integer.MAX_VALUE);
        return;
      } 
      throw Http2.illegalArgument("reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) });
    } 
    throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
  }
  
  public void goAway(int paramInt, ErrorCode paramErrorCode, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 93
    //   9: aload_2
    //   10: getfield httpCode : I
    //   13: iconst_m1
    //   14: if_icmpeq -> 83
    //   17: aload_0
    //   18: iconst_0
    //   19: aload_3
    //   20: arraylength
    //   21: bipush #8
    //   23: iadd
    //   24: bipush #7
    //   26: iconst_0
    //   27: invokevirtual frameHeader : (IIBB)V
    //   30: aload_0
    //   31: getfield sink : Lj/d;
    //   34: iload_1
    //   35: invokeinterface writeInt : (I)Lj/d;
    //   40: pop
    //   41: aload_0
    //   42: getfield sink : Lj/d;
    //   45: aload_2
    //   46: getfield httpCode : I
    //   49: invokeinterface writeInt : (I)Lj/d;
    //   54: pop
    //   55: aload_3
    //   56: arraylength
    //   57: ifle -> 71
    //   60: aload_0
    //   61: getfield sink : Lj/d;
    //   64: aload_3
    //   65: invokeinterface write : ([B)Lj/d;
    //   70: pop
    //   71: aload_0
    //   72: getfield sink : Lj/d;
    //   75: invokeinterface flush : ()V
    //   80: aload_0
    //   81: monitorexit
    //   82: return
    //   83: ldc 'errorCode.httpCode == -1'
    //   85: iconst_0
    //   86: anewarray java/lang/Object
    //   89: invokestatic illegalArgument : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    //   92: athrow
    //   93: new java/io/IOException
    //   96: dup
    //   97: ldc 'closed'
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: athrow
    //   103: astore_2
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_2
    //   107: athrow
    // Exception table:
    //   from	to	target	type
    //   2	71	103	finally
    //   71	80	103	finally
    //   83	93	103	finally
    //   93	103	103	finally
  }
  
  public void headers(int paramInt, List<Header> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 19
    //   9: aload_0
    //   10: iconst_0
    //   11: iload_1
    //   12: aload_2
    //   13: invokevirtual headers : (ZILjava/util/List;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: new java/io/IOException
    //   22: dup
    //   23: ldc 'closed'
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: athrow
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	29	finally
    //   19	29	29	finally
  }
  
  void headers(boolean paramBoolean, int paramInt, List<Header> paramList) {
    if (!this.closed) {
      byte b1;
      this.hpackWriter.writeHeaders(paramList);
      long l1 = this.hpackBuffer.s();
      int i = (int)Math.min(this.maxFrameSize, l1);
      long l2 = i;
      if (l1 == l2) {
        b1 = 4;
      } else {
        b1 = 0;
      } 
      byte b2 = b1;
      if (paramBoolean)
        b2 = (byte)(b1 | 0x1); 
      frameHeader(paramInt, i, (byte)1, b2);
      this.sink.write(this.hpackBuffer, l2);
      if (l1 > l2)
        writeContinuationFrames(paramInt, l1 - l2); 
      return;
    } 
    throw new IOException("closed");
  }
  
  public int maxDataLength() {
    return this.maxFrameSize;
  }
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 64
    //   9: iload_1
    //   10: ifeq -> 81
    //   13: iconst_1
    //   14: istore #4
    //   16: goto -> 19
    //   19: aload_0
    //   20: iconst_0
    //   21: bipush #8
    //   23: bipush #6
    //   25: iload #4
    //   27: invokevirtual frameHeader : (IIBB)V
    //   30: aload_0
    //   31: getfield sink : Lj/d;
    //   34: iload_2
    //   35: invokeinterface writeInt : (I)Lj/d;
    //   40: pop
    //   41: aload_0
    //   42: getfield sink : Lj/d;
    //   45: iload_3
    //   46: invokeinterface writeInt : (I)Lj/d;
    //   51: pop
    //   52: aload_0
    //   53: getfield sink : Lj/d;
    //   56: invokeinterface flush : ()V
    //   61: aload_0
    //   62: monitorexit
    //   63: return
    //   64: new java/io/IOException
    //   67: dup
    //   68: ldc 'closed'
    //   70: invokespecial <init> : (Ljava/lang/String;)V
    //   73: athrow
    //   74: astore #5
    //   76: aload_0
    //   77: monitorexit
    //   78: aload #5
    //   80: athrow
    //   81: iconst_0
    //   82: istore #4
    //   84: goto -> 19
    // Exception table:
    //   from	to	target	type
    //   2	9	74	finally
    //   19	61	74	finally
    //   64	74	74	finally
  }
  
  public void pushPromise(int paramInt1, int paramInt2, List<Header> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 122
    //   9: aload_0
    //   10: getfield hpackWriter : Lokhttp3/internal/http2/Hpack$Writer;
    //   13: aload_3
    //   14: invokevirtual writeHeaders : (Ljava/util/List;)V
    //   17: aload_0
    //   18: getfield hpackBuffer : Lj/c;
    //   21: invokevirtual s : ()J
    //   24: lstore #6
    //   26: aload_0
    //   27: getfield maxFrameSize : I
    //   30: iconst_4
    //   31: isub
    //   32: i2l
    //   33: lload #6
    //   35: invokestatic min : (JJ)J
    //   38: l2i
    //   39: istore #5
    //   41: iload #5
    //   43: i2l
    //   44: lstore #8
    //   46: lload #6
    //   48: lload #8
    //   50: lcmp
    //   51: ifne -> 137
    //   54: iconst_4
    //   55: istore #4
    //   57: goto -> 60
    //   60: aload_0
    //   61: iload_1
    //   62: iload #5
    //   64: iconst_4
    //   65: iadd
    //   66: iconst_5
    //   67: iload #4
    //   69: invokevirtual frameHeader : (IIBB)V
    //   72: aload_0
    //   73: getfield sink : Lj/d;
    //   76: iload_2
    //   77: ldc 2147483647
    //   79: iand
    //   80: invokeinterface writeInt : (I)Lj/d;
    //   85: pop
    //   86: aload_0
    //   87: getfield sink : Lj/d;
    //   90: aload_0
    //   91: getfield hpackBuffer : Lj/c;
    //   94: lload #8
    //   96: invokeinterface write : (Lj/c;J)V
    //   101: lload #6
    //   103: lload #8
    //   105: lcmp
    //   106: ifle -> 119
    //   109: aload_0
    //   110: iload_1
    //   111: lload #6
    //   113: lload #8
    //   115: lsub
    //   116: invokespecial writeContinuationFrames : (IJ)V
    //   119: aload_0
    //   120: monitorexit
    //   121: return
    //   122: new java/io/IOException
    //   125: dup
    //   126: ldc 'closed'
    //   128: invokespecial <init> : (Ljava/lang/String;)V
    //   131: athrow
    //   132: astore_3
    //   133: aload_0
    //   134: monitorexit
    //   135: aload_3
    //   136: athrow
    //   137: iconst_0
    //   138: istore #4
    //   140: goto -> 60
    // Exception table:
    //   from	to	target	type
    //   2	41	132	finally
    //   60	101	132	finally
    //   109	119	132	finally
    //   122	132	132	finally
  }
  
  public void rstStream(int paramInt, ErrorCode paramErrorCode) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 59
    //   9: aload_2
    //   10: getfield httpCode : I
    //   13: iconst_m1
    //   14: if_icmpeq -> 51
    //   17: aload_0
    //   18: iload_1
    //   19: iconst_4
    //   20: iconst_3
    //   21: iconst_0
    //   22: invokevirtual frameHeader : (IIBB)V
    //   25: aload_0
    //   26: getfield sink : Lj/d;
    //   29: aload_2
    //   30: getfield httpCode : I
    //   33: invokeinterface writeInt : (I)Lj/d;
    //   38: pop
    //   39: aload_0
    //   40: getfield sink : Lj/d;
    //   43: invokeinterface flush : ()V
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: new java/lang/IllegalArgumentException
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: athrow
    //   59: new java/io/IOException
    //   62: dup
    //   63: ldc 'closed'
    //   65: invokespecial <init> : (Ljava/lang/String;)V
    //   68: athrow
    //   69: astore_2
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_2
    //   73: athrow
    // Exception table:
    //   from	to	target	type
    //   2	48	69	finally
    //   51	59	69	finally
    //   59	69	69	finally
  }
  
  public void settings(Settings paramSettings) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 85
    //   9: aload_1
    //   10: invokevirtual size : ()I
    //   13: istore_3
    //   14: iconst_0
    //   15: istore_2
    //   16: aload_0
    //   17: iconst_0
    //   18: iload_3
    //   19: bipush #6
    //   21: imul
    //   22: iconst_4
    //   23: iconst_0
    //   24: invokevirtual frameHeader : (IIBB)V
    //   27: iload_2
    //   28: bipush #10
    //   30: if_icmpge -> 73
    //   33: aload_1
    //   34: iload_2
    //   35: invokevirtual isSet : (I)Z
    //   38: ifne -> 106
    //   41: goto -> 132
    //   44: aload_0
    //   45: getfield sink : Lj/d;
    //   48: iload_3
    //   49: invokeinterface writeShort : (I)Lj/d;
    //   54: pop
    //   55: aload_0
    //   56: getfield sink : Lj/d;
    //   59: aload_1
    //   60: iload_2
    //   61: invokevirtual get : (I)I
    //   64: invokeinterface writeInt : (I)Lj/d;
    //   69: pop
    //   70: goto -> 132
    //   73: aload_0
    //   74: getfield sink : Lj/d;
    //   77: invokeinterface flush : ()V
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: new java/io/IOException
    //   88: dup
    //   89: ldc 'closed'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: athrow
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: goto -> 103
    //   101: aload_1
    //   102: athrow
    //   103: goto -> 101
    //   106: iload_2
    //   107: iconst_4
    //   108: if_icmpne -> 116
    //   111: iconst_3
    //   112: istore_3
    //   113: goto -> 44
    //   116: iload_2
    //   117: bipush #7
    //   119: if_icmpne -> 127
    //   122: iconst_4
    //   123: istore_3
    //   124: goto -> 44
    //   127: iload_2
    //   128: istore_3
    //   129: goto -> 44
    //   132: iload_2
    //   133: iconst_1
    //   134: iadd
    //   135: istore_2
    //   136: goto -> 27
    // Exception table:
    //   from	to	target	type
    //   2	14	95	finally
    //   16	27	95	finally
    //   33	41	95	finally
    //   44	70	95	finally
    //   73	82	95	finally
    //   85	95	95	finally
  }
  
  public void synReply(boolean paramBoolean, int paramInt, List<Header> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 19
    //   9: aload_0
    //   10: iload_1
    //   11: iload_2
    //   12: aload_3
    //   13: invokevirtual headers : (ZILjava/util/List;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: new java/io/IOException
    //   22: dup
    //   23: ldc 'closed'
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: athrow
    //   29: astore_3
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_3
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	29	finally
    //   19	29	29	finally
  }
  
  public void synStream(boolean paramBoolean, int paramInt1, int paramInt2, List<Header> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 20
    //   9: aload_0
    //   10: iload_1
    //   11: iload_2
    //   12: aload #4
    //   14: invokevirtual headers : (ZILjava/util/List;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: new java/io/IOException
    //   23: dup
    //   24: ldc 'closed'
    //   26: invokespecial <init> : (Ljava/lang/String;)V
    //   29: athrow
    //   30: astore #4
    //   32: aload_0
    //   33: monitorexit
    //   34: aload #4
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	30	finally
    //   20	30	30	finally
  }
  
  public void windowUpdate(int paramInt, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield closed : Z
    //   6: ifne -> 73
    //   9: lload_2
    //   10: lconst_0
    //   11: lcmp
    //   12: ifeq -> 56
    //   15: lload_2
    //   16: ldc2_w 2147483647
    //   19: lcmp
    //   20: ifgt -> 56
    //   23: aload_0
    //   24: iload_1
    //   25: iconst_4
    //   26: bipush #8
    //   28: iconst_0
    //   29: invokevirtual frameHeader : (IIBB)V
    //   32: aload_0
    //   33: getfield sink : Lj/d;
    //   36: lload_2
    //   37: l2i
    //   38: invokeinterface writeInt : (I)Lj/d;
    //   43: pop
    //   44: aload_0
    //   45: getfield sink : Lj/d;
    //   48: invokeinterface flush : ()V
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: ldc 'windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s'
    //   58: iconst_1
    //   59: anewarray java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: lload_2
    //   65: invokestatic valueOf : (J)Ljava/lang/Long;
    //   68: aastore
    //   69: invokestatic illegalArgument : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    //   72: athrow
    //   73: new java/io/IOException
    //   76: dup
    //   77: ldc 'closed'
    //   79: invokespecial <init> : (Ljava/lang/String;)V
    //   82: athrow
    //   83: astore #4
    //   85: aload_0
    //   86: monitorexit
    //   87: aload #4
    //   89: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	83	finally
    //   23	53	83	finally
    //   56	73	83	finally
    //   73	83	83	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Http2Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */