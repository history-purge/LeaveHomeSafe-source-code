package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import e.e.e.d.i;
import e.e.e.h.c;

public class b {
  private int a;
  
  private long b;
  
  private final int c;
  
  private final int d;
  
  private final c<Bitmap> e;
  
  public b(int paramInt1, int paramInt2) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt1 > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt2 > 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = new a(this);
  }
  
  public int a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
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
  
  public void a(Bitmap paramBitmap) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Landroid/graphics/Bitmap;)I
    //   6: istore_2
    //   7: aload_0
    //   8: getfield a : I
    //   11: ifle -> 100
    //   14: iconst_1
    //   15: istore_3
    //   16: goto -> 19
    //   19: iload_3
    //   20: ldc 'No bitmaps registered.'
    //   22: invokestatic a : (ZLjava/lang/Object;)V
    //   25: iload_2
    //   26: i2l
    //   27: lstore #4
    //   29: lload #4
    //   31: aload_0
    //   32: getfield b : J
    //   35: lcmp
    //   36: ifgt -> 105
    //   39: iconst_1
    //   40: istore_3
    //   41: goto -> 44
    //   44: iload_3
    //   45: ldc 'Bitmap size bigger than the total registered size: %d, %d'
    //   47: iconst_2
    //   48: anewarray java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: iload_2
    //   54: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: aload_0
    //   61: getfield b : J
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: aastore
    //   68: invokestatic a : (ZLjava/lang/String;[Ljava/lang/Object;)V
    //   71: aload_0
    //   72: aload_0
    //   73: getfield b : J
    //   76: lload #4
    //   78: lsub
    //   79: putfield b : J
    //   82: aload_0
    //   83: aload_0
    //   84: getfield a : I
    //   87: iconst_1
    //   88: isub
    //   89: putfield a : I
    //   92: aload_0
    //   93: monitorexit
    //   94: return
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    //   100: iconst_0
    //   101: istore_3
    //   102: goto -> 19
    //   105: iconst_0
    //   106: istore_3
    //   107: goto -> 44
    // Exception table:
    //   from	to	target	type
    //   2	14	95	finally
    //   19	25	95	finally
    //   29	39	95	finally
    //   44	92	95	finally
  }
  
  public int b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : I
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
  
  public boolean b(Bitmap paramBitmap) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Landroid/graphics/Bitmap;)I
    //   6: istore_2
    //   7: aload_0
    //   8: getfield a : I
    //   11: aload_0
    //   12: getfield c : I
    //   15: if_icmpge -> 68
    //   18: aload_0
    //   19: getfield b : J
    //   22: lstore_3
    //   23: iload_2
    //   24: i2l
    //   25: lstore #5
    //   27: lload_3
    //   28: lload #5
    //   30: ladd
    //   31: aload_0
    //   32: getfield d : I
    //   35: i2l
    //   36: lcmp
    //   37: ifle -> 43
    //   40: goto -> 68
    //   43: aload_0
    //   44: aload_0
    //   45: getfield a : I
    //   48: iconst_1
    //   49: iadd
    //   50: putfield a : I
    //   53: aload_0
    //   54: aload_0
    //   55: getfield b : J
    //   58: lload #5
    //   60: ladd
    //   61: putfield b : J
    //   64: aload_0
    //   65: monitorexit
    //   66: iconst_1
    //   67: ireturn
    //   68: aload_0
    //   69: monitorexit
    //   70: iconst_0
    //   71: ireturn
    //   72: astore_1
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	72	finally
    //   27	40	72	finally
    //   43	64	72	finally
  }
  
  public int c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : I
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
  
  public c<Bitmap> d() {
    return this.e;
  }
  
  public long e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : J
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
  
  class a implements c<Bitmap> {
    a(b this$0) {}
    
    public void a(Bitmap param1Bitmap) {
      try {
        this.a.a(param1Bitmap);
        return;
      } finally {
        param1Bitmap.recycle();
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */