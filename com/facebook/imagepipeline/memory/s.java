package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import e.e.e.g.b;
import e.e.e.g.c;

public class s implements d {
  protected final d0<Bitmap> a = new e();
  
  private final int b;
  
  private int c;
  
  private final h0 d;
  
  private int e;
  
  public s(int paramInt1, int paramInt2, h0 paramh0, c paramc) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramh0;
    if (paramc != null)
      paramc.a((b)this); 
  }
  
  private Bitmap a(int paramInt) {
    this.d.a(paramInt);
    return Bitmap.createBitmap(1, paramInt, Bitmap.Config.ALPHA_8);
  }
  
  private void b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : I
    //   6: iload_1
    //   7: if_icmple -> 64
    //   10: aload_0
    //   11: getfield a : Lcom/facebook/imagepipeline/memory/d0;
    //   14: invokeinterface pop : ()Ljava/lang/Object;
    //   19: checkcast android/graphics/Bitmap
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull -> 30
    //   27: goto -> 64
    //   30: aload_0
    //   31: getfield a : Lcom/facebook/imagepipeline/memory/d0;
    //   34: aload_3
    //   35: invokeinterface a : (Ljava/lang/Object;)I
    //   40: istore_2
    //   41: aload_0
    //   42: aload_0
    //   43: getfield e : I
    //   46: iload_2
    //   47: isub
    //   48: putfield e : I
    //   51: aload_0
    //   52: getfield d : Lcom/facebook/imagepipeline/memory/h0;
    //   55: iload_2
    //   56: invokeinterface c : (I)V
    //   61: goto -> 2
    //   64: aload_0
    //   65: monitorexit
    //   66: return
    //   67: astore_3
    //   68: aload_0
    //   69: monitorexit
    //   70: goto -> 75
    //   73: aload_3
    //   74: athrow
    //   75: goto -> 73
    // Exception table:
    //   from	to	target	type
    //   2	23	67	finally
    //   30	61	67	finally
  }
  
  public void a(Bitmap paramBitmap) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lcom/facebook/imagepipeline/memory/d0;
    //   4: aload_1
    //   5: invokeinterface a : (Ljava/lang/Object;)I
    //   10: istore_2
    //   11: iload_2
    //   12: aload_0
    //   13: getfield c : I
    //   16: if_icmpgt -> 59
    //   19: aload_0
    //   20: getfield d : Lcom/facebook/imagepipeline/memory/h0;
    //   23: iload_2
    //   24: invokeinterface d : (I)V
    //   29: aload_0
    //   30: getfield a : Lcom/facebook/imagepipeline/memory/d0;
    //   33: aload_1
    //   34: invokeinterface b : (Ljava/lang/Object;)V
    //   39: aload_0
    //   40: monitorenter
    //   41: aload_0
    //   42: aload_0
    //   43: getfield e : I
    //   46: iload_2
    //   47: iadd
    //   48: putfield e : I
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    //   59: return
    // Exception table:
    //   from	to	target	type
    //   41	53	54	finally
    //   55	57	54	finally
  }
  
  public Bitmap get(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : I
    //   6: aload_0
    //   7: getfield b : I
    //   10: if_icmple -> 21
    //   13: aload_0
    //   14: aload_0
    //   15: getfield b : I
    //   18: invokespecial b : (I)V
    //   21: aload_0
    //   22: getfield a : Lcom/facebook/imagepipeline/memory/d0;
    //   25: iload_1
    //   26: invokeinterface get : (I)Ljava/lang/Object;
    //   31: checkcast android/graphics/Bitmap
    //   34: astore_2
    //   35: aload_2
    //   36: ifnull -> 74
    //   39: aload_0
    //   40: getfield a : Lcom/facebook/imagepipeline/memory/d0;
    //   43: aload_2
    //   44: invokeinterface a : (Ljava/lang/Object;)I
    //   49: istore_1
    //   50: aload_0
    //   51: aload_0
    //   52: getfield e : I
    //   55: iload_1
    //   56: isub
    //   57: putfield e : I
    //   60: aload_0
    //   61: getfield d : Lcom/facebook/imagepipeline/memory/h0;
    //   64: iload_1
    //   65: invokeinterface b : (I)V
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_2
    //   73: areturn
    //   74: aload_0
    //   75: iload_1
    //   76: invokespecial a : (I)Landroid/graphics/Bitmap;
    //   79: astore_2
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_2
    //   83: areturn
    //   84: astore_2
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_2
    //   88: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	84	finally
    //   21	35	84	finally
    //   39	70	84	finally
    //   74	80	84	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */