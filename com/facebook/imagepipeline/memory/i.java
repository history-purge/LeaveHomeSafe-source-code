package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

public class i implements u, Closeable {
  private ByteBuffer c;
  
  private final int d;
  
  private final long e;
  
  public i(int paramInt) {
    this.c = ByteBuffer.allocateDirect(paramInt);
    this.d = paramInt;
    this.e = System.identityHashCode(this);
  }
  
  private void b(int paramInt1, u paramu, int paramInt2, int paramInt3) {
    if (paramu instanceof i) {
      e.e.e.d.i.b(isClosed() ^ true);
      e.e.e.d.i.b(paramu.isClosed() ^ true);
      w.a(paramInt1, paramu.b(), paramInt2, paramInt3, this.d);
      this.c.position(paramInt1);
      paramu.c().position(paramInt2);
      byte[] arrayOfByte = new byte[paramInt3];
      this.c.get(arrayOfByte, 0, paramInt3);
      paramu.c().put(arrayOfByte, 0, paramInt3);
      return;
    } 
    throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
  }
  
  public byte a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isClosed : ()Z
    //   6: istore_3
    //   7: iconst_1
    //   8: istore #4
    //   10: iload_3
    //   11: ifne -> 74
    //   14: iconst_1
    //   15: istore_3
    //   16: goto -> 19
    //   19: iload_3
    //   20: invokestatic b : (Z)V
    //   23: iload_1
    //   24: iflt -> 79
    //   27: iconst_1
    //   28: istore_3
    //   29: goto -> 32
    //   32: iload_3
    //   33: invokestatic a : (Z)V
    //   36: iload_1
    //   37: aload_0
    //   38: getfield d : I
    //   41: if_icmpge -> 84
    //   44: iload #4
    //   46: istore_3
    //   47: goto -> 50
    //   50: iload_3
    //   51: invokestatic a : (Z)V
    //   54: aload_0
    //   55: getfield c : Ljava/nio/ByteBuffer;
    //   58: iload_1
    //   59: invokevirtual get : (I)B
    //   62: istore_2
    //   63: aload_0
    //   64: monitorexit
    //   65: iload_2
    //   66: ireturn
    //   67: astore #5
    //   69: aload_0
    //   70: monitorexit
    //   71: aload #5
    //   73: athrow
    //   74: iconst_0
    //   75: istore_3
    //   76: goto -> 19
    //   79: iconst_0
    //   80: istore_3
    //   81: goto -> 32
    //   84: iconst_0
    //   85: istore_3
    //   86: goto -> 50
    // Exception table:
    //   from	to	target	type
    //   2	7	67	finally
    //   19	23	67	finally
    //   32	44	67	finally
    //   50	63	67	finally
  }
  
  public int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: invokevirtual isClosed : ()Z
    //   11: ifne -> 81
    //   14: iconst_1
    //   15: istore #5
    //   17: goto -> 20
    //   20: iload #5
    //   22: invokestatic b : (Z)V
    //   25: iload_1
    //   26: iload #4
    //   28: aload_0
    //   29: getfield d : I
    //   32: invokestatic a : (III)I
    //   35: istore #4
    //   37: iload_1
    //   38: aload_2
    //   39: arraylength
    //   40: iload_3
    //   41: iload #4
    //   43: aload_0
    //   44: getfield d : I
    //   47: invokestatic a : (IIIII)V
    //   50: aload_0
    //   51: getfield c : Ljava/nio/ByteBuffer;
    //   54: iload_1
    //   55: invokevirtual position : (I)Ljava/nio/Buffer;
    //   58: pop
    //   59: aload_0
    //   60: getfield c : Ljava/nio/ByteBuffer;
    //   63: aload_2
    //   64: iload_3
    //   65: iload #4
    //   67: invokevirtual get : ([BII)Ljava/nio/ByteBuffer;
    //   70: pop
    //   71: aload_0
    //   72: monitorexit
    //   73: iload #4
    //   75: ireturn
    //   76: astore_2
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    //   81: iconst_0
    //   82: istore #5
    //   84: goto -> 20
    // Exception table:
    //   from	to	target	type
    //   2	14	76	finally
    //   20	71	76	finally
  }
  
  public long a() {
    return this.e;
  }
  
  public void a(int paramInt1, u paramu, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: invokeinterface a : ()J
    //   11: aload_0
    //   12: invokevirtual a : ()J
    //   15: lcmp
    //   16: ifne -> 95
    //   19: new java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #5
    //   28: aload #5
    //   30: ldc 'Copying from BufferMemoryChunk '
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #5
    //   38: aload_0
    //   39: invokevirtual a : ()J
    //   42: invokestatic toHexString : (J)Ljava/lang/String;
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload #5
    //   51: ldc ' to BufferMemoryChunk '
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: aload #5
    //   59: aload_2
    //   60: invokeinterface a : ()J
    //   65: invokestatic toHexString : (J)Ljava/lang/String;
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload #5
    //   74: ldc ' which are the same '
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: ldc 'BufferMemoryChunk'
    //   82: aload #5
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   90: pop
    //   91: iconst_0
    //   92: invokestatic a : (Z)V
    //   95: aload_2
    //   96: invokeinterface a : ()J
    //   101: aload_0
    //   102: invokevirtual a : ()J
    //   105: lcmp
    //   106: ifge -> 141
    //   109: aload_2
    //   110: monitorenter
    //   111: aload_0
    //   112: monitorenter
    //   113: aload_0
    //   114: iload_1
    //   115: aload_2
    //   116: iload_3
    //   117: iload #4
    //   119: invokespecial b : (ILcom/facebook/imagepipeline/memory/u;II)V
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_2
    //   125: monitorexit
    //   126: return
    //   127: astore #5
    //   129: aload_0
    //   130: monitorexit
    //   131: aload #5
    //   133: athrow
    //   134: astore #5
    //   136: aload_2
    //   137: monitorexit
    //   138: aload #5
    //   140: athrow
    //   141: aload_0
    //   142: monitorenter
    //   143: aload_2
    //   144: monitorenter
    //   145: aload_0
    //   146: iload_1
    //   147: aload_2
    //   148: iload_3
    //   149: iload #4
    //   151: invokespecial b : (ILcom/facebook/imagepipeline/memory/u;II)V
    //   154: aload_2
    //   155: monitorexit
    //   156: aload_0
    //   157: monitorexit
    //   158: return
    //   159: astore #5
    //   161: aload_2
    //   162: monitorexit
    //   163: aload #5
    //   165: athrow
    //   166: astore_2
    //   167: aload_0
    //   168: monitorexit
    //   169: aload_2
    //   170: athrow
    // Exception table:
    //   from	to	target	type
    //   111	113	134	finally
    //   113	124	127	finally
    //   124	126	134	finally
    //   129	131	127	finally
    //   131	134	134	finally
    //   136	138	134	finally
    //   143	145	166	finally
    //   145	156	159	finally
    //   156	158	166	finally
    //   161	163	159	finally
    //   163	166	166	finally
    //   167	169	166	finally
  }
  
  public int b() {
    return this.d;
  }
  
  public int b(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: invokevirtual isClosed : ()Z
    //   11: ifne -> 81
    //   14: iconst_1
    //   15: istore #5
    //   17: goto -> 20
    //   20: iload #5
    //   22: invokestatic b : (Z)V
    //   25: iload_1
    //   26: iload #4
    //   28: aload_0
    //   29: getfield d : I
    //   32: invokestatic a : (III)I
    //   35: istore #4
    //   37: iload_1
    //   38: aload_2
    //   39: arraylength
    //   40: iload_3
    //   41: iload #4
    //   43: aload_0
    //   44: getfield d : I
    //   47: invokestatic a : (IIIII)V
    //   50: aload_0
    //   51: getfield c : Ljava/nio/ByteBuffer;
    //   54: iload_1
    //   55: invokevirtual position : (I)Ljava/nio/Buffer;
    //   58: pop
    //   59: aload_0
    //   60: getfield c : Ljava/nio/ByteBuffer;
    //   63: aload_2
    //   64: iload_3
    //   65: iload #4
    //   67: invokevirtual put : ([BII)Ljava/nio/ByteBuffer;
    //   70: pop
    //   71: aload_0
    //   72: monitorexit
    //   73: iload #4
    //   75: ireturn
    //   76: astore_2
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    //   81: iconst_0
    //   82: istore #5
    //   84: goto -> 20
    // Exception table:
    //   from	to	target	type
    //   2	14	76	finally
    //   20	71	76	finally
  }
  
  public ByteBuffer c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/nio/ByteBuffer;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield c : Ljava/nio/ByteBuffer;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public long d() {
    throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
  }
  
  public boolean isClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/nio/ByteBuffer;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull -> 16
    //   11: iconst_1
    //   12: istore_1
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */