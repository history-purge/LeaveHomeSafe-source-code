package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.imagepipeline.nativecode.a;
import e.e.e.d.d;
import e.e.e.d.i;
import java.io.Closeable;
import java.nio.ByteBuffer;

@d
public class NativeMemoryChunk implements u, Closeable {
  private final long c;
  
  private final int d;
  
  private boolean e;
  
  static {
    a.a();
  }
  
  public NativeMemoryChunk() {
    this.d = 0;
    this.c = 0L;
    this.e = true;
  }
  
  public NativeMemoryChunk(int paramInt) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    this.d = paramInt;
    this.c = nativeAllocate(this.d);
    this.e = false;
  }
  
  private void b(int paramInt1, u paramu, int paramInt2, int paramInt3) {
    if (paramu instanceof NativeMemoryChunk) {
      i.b(isClosed() ^ true);
      i.b(paramu.isClosed() ^ true);
      w.a(paramInt1, paramu.b(), paramInt2, paramInt3, this.d);
      nativeMemcpy(paramu.d() + paramInt2, this.c + paramInt1, paramInt3);
      return;
    } 
    throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
  }
  
  @d
  private static native long nativeAllocate(int paramInt);
  
  @d
  private static native void nativeCopyFromByteArray(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  @d
  private static native void nativeCopyToByteArray(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  @d
  private static native void nativeFree(long paramLong);
  
  @d
  private static native void nativeMemcpy(long paramLong1, long paramLong2, int paramInt);
  
  @d
  private static native byte nativeReadByte(long paramLong);
  
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
    //   11: ifne -> 76
    //   14: iconst_1
    //   15: istore_3
    //   16: goto -> 19
    //   19: iload_3
    //   20: invokestatic b : (Z)V
    //   23: iload_1
    //   24: iflt -> 81
    //   27: iconst_1
    //   28: istore_3
    //   29: goto -> 32
    //   32: iload_3
    //   33: invokestatic a : (Z)V
    //   36: iload_1
    //   37: aload_0
    //   38: getfield d : I
    //   41: if_icmpge -> 86
    //   44: iload #4
    //   46: istore_3
    //   47: goto -> 50
    //   50: iload_3
    //   51: invokestatic a : (Z)V
    //   54: aload_0
    //   55: getfield c : J
    //   58: iload_1
    //   59: i2l
    //   60: ladd
    //   61: invokestatic nativeReadByte : (J)B
    //   64: istore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: iload_2
    //   68: ireturn
    //   69: astore #5
    //   71: aload_0
    //   72: monitorexit
    //   73: aload #5
    //   75: athrow
    //   76: iconst_0
    //   77: istore_3
    //   78: goto -> 19
    //   81: iconst_0
    //   82: istore_3
    //   83: goto -> 32
    //   86: iconst_0
    //   87: istore_3
    //   88: goto -> 50
    // Exception table:
    //   from	to	target	type
    //   2	7	69	finally
    //   19	23	69	finally
    //   32	44	69	finally
    //   50	65	69	finally
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
    //   11: ifne -> 74
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
    //   51: getfield c : J
    //   54: iload_1
    //   55: i2l
    //   56: ladd
    //   57: aload_2
    //   58: iload_3
    //   59: iload #4
    //   61: invokestatic nativeCopyToByteArray : (J[BII)V
    //   64: aload_0
    //   65: monitorexit
    //   66: iload #4
    //   68: ireturn
    //   69: astore_2
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_2
    //   73: athrow
    //   74: iconst_0
    //   75: istore #5
    //   77: goto -> 20
    // Exception table:
    //   from	to	target	type
    //   2	14	69	finally
    //   20	64	69	finally
  }
  
  public long a() {
    return this.c;
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
    //   16: ifne -> 106
    //   19: new java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #5
    //   28: aload #5
    //   30: ldc 'Copying from NativeMemoryChunk '
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #5
    //   38: aload_0
    //   39: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   42: invokestatic toHexString : (I)Ljava/lang/String;
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload #5
    //   51: ldc ' to NativeMemoryChunk '
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: aload #5
    //   59: aload_2
    //   60: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   63: invokestatic toHexString : (I)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload #5
    //   72: ldc ' which share the same address '
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload #5
    //   80: aload_0
    //   81: getfield c : J
    //   84: invokestatic toHexString : (J)Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: ldc 'NativeMemoryChunk'
    //   93: aload #5
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   101: pop
    //   102: iconst_0
    //   103: invokestatic a : (Z)V
    //   106: aload_2
    //   107: invokeinterface a : ()J
    //   112: aload_0
    //   113: invokevirtual a : ()J
    //   116: lcmp
    //   117: ifge -> 152
    //   120: aload_2
    //   121: monitorenter
    //   122: aload_0
    //   123: monitorenter
    //   124: aload_0
    //   125: iload_1
    //   126: aload_2
    //   127: iload_3
    //   128: iload #4
    //   130: invokespecial b : (ILcom/facebook/imagepipeline/memory/u;II)V
    //   133: aload_0
    //   134: monitorexit
    //   135: aload_2
    //   136: monitorexit
    //   137: return
    //   138: astore #5
    //   140: aload_0
    //   141: monitorexit
    //   142: aload #5
    //   144: athrow
    //   145: astore #5
    //   147: aload_2
    //   148: monitorexit
    //   149: aload #5
    //   151: athrow
    //   152: aload_0
    //   153: monitorenter
    //   154: aload_2
    //   155: monitorenter
    //   156: aload_0
    //   157: iload_1
    //   158: aload_2
    //   159: iload_3
    //   160: iload #4
    //   162: invokespecial b : (ILcom/facebook/imagepipeline/memory/u;II)V
    //   165: aload_2
    //   166: monitorexit
    //   167: aload_0
    //   168: monitorexit
    //   169: return
    //   170: astore #5
    //   172: aload_2
    //   173: monitorexit
    //   174: aload #5
    //   176: athrow
    //   177: astore_2
    //   178: aload_0
    //   179: monitorexit
    //   180: aload_2
    //   181: athrow
    // Exception table:
    //   from	to	target	type
    //   122	124	145	finally
    //   124	135	138	finally
    //   135	137	145	finally
    //   140	142	138	finally
    //   142	145	145	finally
    //   147	149	145	finally
    //   154	156	177	finally
    //   156	167	170	finally
    //   167	169	177	finally
    //   172	174	170	finally
    //   174	177	177	finally
    //   178	180	177	finally
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
    //   11: ifne -> 74
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
    //   51: getfield c : J
    //   54: iload_1
    //   55: i2l
    //   56: ladd
    //   57: aload_2
    //   58: iload_3
    //   59: iload #4
    //   61: invokestatic nativeCopyFromByteArray : (J[BII)V
    //   64: aload_0
    //   65: monitorexit
    //   66: iload #4
    //   68: ireturn
    //   69: astore_2
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_2
    //   73: athrow
    //   74: iconst_0
    //   75: istore #5
    //   77: goto -> 20
    // Exception table:
    //   from	to	target	type
    //   2	14	69	finally
    //   20	64	69	finally
  }
  
  public ByteBuffer c() {
    return null;
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Z
    //   6: ifne -> 21
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield e : Z
    //   14: aload_0
    //   15: getfield c : J
    //   18: invokestatic nativeFree : (J)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
  }
  
  public long d() {
    return this.c;
  }
  
  protected void finalize() {
    if (isClosed())
      return; 
    null = new StringBuilder();
    null.append("finalize: Chunk ");
    null.append(Integer.toHexString(System.identityHashCode(this)));
    null.append(" still active. ");
    Log.w("NativeMemoryChunk", null.toString());
    try {
      close();
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public boolean isClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Z
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
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/NativeMemoryChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */