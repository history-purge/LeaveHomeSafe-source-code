package e.f.a.e.n.e;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.face.internal.client.b;
import com.google.android.gms.vision.face.internal.client.f;
import e.f.a.e.n.a;
import e.f.a.e.n.b;
import e.f.a.e.n.h;

public final class c extends a<b> {
  private final h c = new h();
  
  private final b d;
  
  private final Object e = new Object();
  
  private boolean f = true;
  
  private c(b paramb) {
    this.d = paramb;
  }
  
  private static boolean b(f paramf) {
    boolean bool1;
    if (paramf.c != 2 && paramf.d == 2) {
      Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
      bool1 = false;
    } else {
      bool1 = true;
    } 
    boolean bool2 = bool1;
    if (paramf.d == 2) {
      bool2 = bool1;
      if (paramf.e == 1) {
        Log.e("FaceDetector", "Classification is not supported with contour.");
        bool2 = false;
      } 
    } 
    return bool2;
  }
  
  @RecentlyNonNull
  public final SparseArray<b> a(@RecentlyNonNull b paramb) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 337
    //   4: getstatic android/os/Build$VERSION.SDK_INT : I
    //   7: bipush #19
    //   9: if_icmplt -> 112
    //   12: aload_1
    //   13: invokevirtual d : ()[Landroid/media/Image$Plane;
    //   16: ifnull -> 112
    //   19: aload_1
    //   20: invokevirtual d : ()[Landroid/media/Image$Plane;
    //   23: astore #8
    //   25: aload #8
    //   27: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload #8
    //   33: checkcast [Landroid/media/Image$Plane;
    //   36: arraylength
    //   37: iconst_3
    //   38: if_icmpne -> 112
    //   41: aload_0
    //   42: getfield e : Ljava/lang/Object;
    //   45: astore #8
    //   47: aload #8
    //   49: monitorenter
    //   50: aload_0
    //   51: getfield f : Z
    //   54: ifeq -> 96
    //   57: aload_0
    //   58: getfield d : Lcom/google/android/gms/vision/face/internal/client/b;
    //   61: astore #9
    //   63: aload_1
    //   64: invokevirtual d : ()[Landroid/media/Image$Plane;
    //   67: astore #10
    //   69: aload #10
    //   71: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   74: pop
    //   75: aload #9
    //   77: aload #10
    //   79: checkcast [Landroid/media/Image$Plane;
    //   82: aload_1
    //   83: invokestatic a : (Le/f/a/e/n/b;)Le/f/a/e/i/n/c7;
    //   86: invokevirtual a : ([Landroid/media/Image$Plane;Le/f/a/e/i/n/c7;)[Le/f/a/e/n/e/b;
    //   89: astore_1
    //   90: aload #8
    //   92: monitorexit
    //   93: goto -> 197
    //   96: new java/lang/IllegalStateException
    //   99: dup
    //   100: ldc 'Cannot use detector after release()'
    //   102: invokespecial <init> : (Ljava/lang/String;)V
    //   105: athrow
    //   106: astore_1
    //   107: aload #8
    //   109: monitorexit
    //   110: aload_1
    //   111: athrow
    //   112: aload_1
    //   113: invokevirtual a : ()Landroid/graphics/Bitmap;
    //   116: ifnull -> 145
    //   119: aload_1
    //   120: invokevirtual a : ()Landroid/graphics/Bitmap;
    //   123: astore #8
    //   125: aload #8
    //   127: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   130: pop
    //   131: aload #8
    //   133: checkcast android/graphics/Bitmap
    //   136: iconst_1
    //   137: invokestatic a : (Landroid/graphics/Bitmap;Z)Ljava/nio/ByteBuffer;
    //   140: astore #8
    //   142: goto -> 151
    //   145: aload_1
    //   146: invokevirtual b : ()Ljava/nio/ByteBuffer;
    //   149: astore #8
    //   151: aload_0
    //   152: getfield e : Ljava/lang/Object;
    //   155: astore #9
    //   157: aload #9
    //   159: monitorenter
    //   160: aload_0
    //   161: getfield f : Z
    //   164: ifeq -> 321
    //   167: aload_0
    //   168: getfield d : Lcom/google/android/gms/vision/face/internal/client/b;
    //   171: astore #10
    //   173: aload #8
    //   175: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   178: pop
    //   179: aload #10
    //   181: aload #8
    //   183: checkcast java/nio/ByteBuffer
    //   186: aload_1
    //   187: invokestatic a : (Le/f/a/e/n/b;)Le/f/a/e/i/n/c7;
    //   190: invokevirtual a : (Ljava/nio/ByteBuffer;Le/f/a/e/i/n/c7;)[Le/f/a/e/n/e/b;
    //   193: astore_1
    //   194: aload #9
    //   196: monitorexit
    //   197: new java/util/HashSet
    //   200: dup
    //   201: invokespecial <init> : ()V
    //   204: astore #8
    //   206: new android/util/SparseArray
    //   209: dup
    //   210: aload_1
    //   211: arraylength
    //   212: invokespecial <init> : (I)V
    //   215: astore #9
    //   217: aload_1
    //   218: arraylength
    //   219: istore #7
    //   221: iconst_0
    //   222: istore_3
    //   223: iconst_0
    //   224: istore_2
    //   225: iload_3
    //   226: iload #7
    //   228: if_icmpge -> 318
    //   231: aload_1
    //   232: iload_3
    //   233: aaload
    //   234: astore #10
    //   236: aload #10
    //   238: invokevirtual d : ()I
    //   241: istore #5
    //   243: iload_2
    //   244: iload #5
    //   246: invokestatic max : (II)I
    //   249: istore #6
    //   251: iload #6
    //   253: istore_2
    //   254: iload #5
    //   256: istore #4
    //   258: aload #8
    //   260: iload #5
    //   262: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   265: invokeinterface contains : (Ljava/lang/Object;)Z
    //   270: ifeq -> 282
    //   273: iload #6
    //   275: iconst_1
    //   276: iadd
    //   277: istore #4
    //   279: iload #4
    //   281: istore_2
    //   282: aload #8
    //   284: iload #4
    //   286: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   289: invokeinterface add : (Ljava/lang/Object;)Z
    //   294: pop
    //   295: aload #9
    //   297: aload_0
    //   298: getfield c : Le/f/a/e/n/h;
    //   301: iload #4
    //   303: invokevirtual a : (I)I
    //   306: aload #10
    //   308: invokevirtual append : (ILjava/lang/Object;)V
    //   311: iload_3
    //   312: iconst_1
    //   313: iadd
    //   314: istore_3
    //   315: goto -> 225
    //   318: aload #9
    //   320: areturn
    //   321: new java/lang/IllegalStateException
    //   324: dup
    //   325: ldc 'Cannot use detector after release()'
    //   327: invokespecial <init> : (Ljava/lang/String;)V
    //   330: athrow
    //   331: astore_1
    //   332: aload #9
    //   334: monitorexit
    //   335: aload_1
    //   336: athrow
    //   337: new java/lang/IllegalArgumentException
    //   340: dup
    //   341: ldc 'No frame supplied.'
    //   343: invokespecial <init> : (Ljava/lang/String;)V
    //   346: astore_1
    //   347: goto -> 352
    //   350: aload_1
    //   351: athrow
    //   352: goto -> 350
    // Exception table:
    //   from	to	target	type
    //   50	93	106	finally
    //   96	106	106	finally
    //   107	110	106	finally
    //   160	197	331	finally
    //   321	331	331	finally
    //   332	335	331	finally
  }
  
  public final void a() {
    super.a();
    synchronized (this.e) {
      if (!this.f)
        return; 
      this.d.c();
      this.f = false;
      return;
    } 
  }
  
  public final boolean b() {
    return this.d.b();
  }
  
  protected final void finalize() {
    try {
    
    } finally {
      super.finalize();
    } 
  }
  
  public static class a {
    private final Context a;
    
    private int b = 0;
    
    private boolean c = false;
    
    private int d = 0;
    
    private boolean e = true;
    
    private int f = 0;
    
    private float g = -1.0F;
    
    public a(@RecentlyNonNull Context param1Context) {
      this.a = param1Context;
    }
    
    @RecentlyNonNull
    public a a(float param1Float) {
      if (param1Float >= 0.0F && param1Float <= 1.0F) {
        this.g = param1Float;
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder(47);
      stringBuilder.append("Invalid proportional face size: ");
      stringBuilder.append(param1Float);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    @RecentlyNonNull
    public a a(int param1Int) {
      if (param1Int == 0 || param1Int == 1) {
        this.d = param1Int;
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder(40);
      stringBuilder.append("Invalid classification type: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    @RecentlyNonNull
    public a a(boolean param1Boolean) {
      this.e = param1Boolean;
      return this;
    }
    
    @RecentlyNonNull
    public c a() {
      f f = new f();
      f.c = this.f;
      f.d = this.b;
      f.e = this.d;
      f.f = this.c;
      f.g = this.e;
      f.h = this.g;
      if (c.a(f))
        return new c(new b(this.a, f), null); 
      throw new IllegalArgumentException("Invalid build options");
    }
    
    @RecentlyNonNull
    public a b(int param1Int) {
      if (param1Int == 0 || param1Int == 1 || param1Int == 2) {
        this.b = param1Int;
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder(34);
      stringBuilder.append("Invalid landmark type: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    @RecentlyNonNull
    public a c(int param1Int) {
      if (param1Int == 0 || param1Int == 1 || param1Int == 2) {
        this.f = param1Int;
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder(25);
      stringBuilder.append("Invalid mode: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */