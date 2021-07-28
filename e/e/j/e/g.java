package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import e.e.e.d.i;
import java.util.Arrays;

public class g extends a {
  private final Drawable[] k;
  
  private final boolean l;
  
  private final int m;
  
  int n;
  
  int o;
  
  long p;
  
  int[] q;
  
  int[] r;
  
  int s;
  
  boolean[] t;
  
  int u;
  
  public g(Drawable[] paramArrayOfDrawable) {
    this(paramArrayOfDrawable, false);
  }
  
  public g(Drawable[] paramArrayOfDrawable, boolean paramBoolean) {
    super(paramArrayOfDrawable);
    int i = paramArrayOfDrawable.length;
    boolean bool = true;
    if (i < 1)
      bool = false; 
    i.b(bool, "At least one layer required!");
    this.k = paramArrayOfDrawable;
    this.q = new int[paramArrayOfDrawable.length];
    this.r = new int[paramArrayOfDrawable.length];
    i = 255;
    this.s = 255;
    this.t = new boolean[paramArrayOfDrawable.length];
    this.u = 0;
    this.l = paramBoolean;
    if (!this.l)
      i = 0; 
    this.m = i;
    g();
  }
  
  private void a(Canvas paramCanvas, Drawable paramDrawable, int paramInt) {
    if (paramDrawable != null && paramInt > 0) {
      this.u++;
      paramDrawable.mutate().setAlpha(paramInt);
      this.u--;
      paramDrawable.draw(paramCanvas);
    } 
  }
  
  private boolean a(float paramFloat) {
    int i = 0;
    boolean bool = true;
    while (i < this.k.length) {
      byte b;
      if (this.t[i]) {
        b = 1;
      } else {
        b = -1;
      } 
      int[] arrayOfInt = this.r;
      arrayOfInt[i] = (int)(this.q[i] + (b * 255) * paramFloat);
      if (arrayOfInt[i] < 0)
        arrayOfInt[i] = 0; 
      arrayOfInt = this.r;
      if (arrayOfInt[i] > 255)
        arrayOfInt[i] = 255; 
      boolean bool1 = bool;
      if (this.t[i]) {
        bool1 = bool;
        if (this.r[i] < 255)
          bool1 = false; 
      } 
      bool = bool1;
      if (!this.t[i]) {
        bool = bool1;
        if (this.r[i] > 0)
          bool = false; 
      } 
      i++;
    } 
    return bool;
  }
  
  private void g() {
    this.n = 2;
    Arrays.fill(this.q, this.m);
    this.q[0] = 255;
    Arrays.fill(this.r, this.m);
    this.r[0] = 255;
    Arrays.fill(this.t, this.l);
    this.t[0] = true;
  }
  
  public void b() {
    this.u++;
  }
  
  public void c() {
    this.u--;
    invalidateSelf();
  }
  
  public void c(int paramInt) {
    this.n = 0;
    this.t[paramInt] = true;
    invalidateSelf();
  }
  
  public void d() {
    this.n = 0;
    Arrays.fill(this.t, true);
    invalidateSelf();
  }
  
  public void d(int paramInt) {
    this.n = 0;
    this.t[paramInt] = false;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : I
    //   4: istore #5
    //   6: iconst_2
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: iload #5
    //   13: ifeq -> 90
    //   16: iload #5
    //   18: iconst_1
    //   19: if_icmpeq -> 31
    //   22: iconst_1
    //   23: istore #6
    //   25: iload #4
    //   27: istore_3
    //   28: goto -> 163
    //   31: aload_0
    //   32: getfield o : I
    //   35: ifle -> 44
    //   38: iconst_1
    //   39: istore #6
    //   41: goto -> 47
    //   44: iconst_0
    //   45: istore #6
    //   47: iload #6
    //   49: invokestatic b : (Z)V
    //   52: aload_0
    //   53: aload_0
    //   54: invokevirtual f : ()J
    //   57: aload_0
    //   58: getfield p : J
    //   61: lsub
    //   62: l2f
    //   63: aload_0
    //   64: getfield o : I
    //   67: i2f
    //   68: fdiv
    //   69: invokespecial a : (F)Z
    //   72: istore #7
    //   74: iload #7
    //   76: istore #6
    //   78: iload #7
    //   80: ifeq -> 153
    //   83: iload #7
    //   85: istore #6
    //   87: goto -> 155
    //   90: aload_0
    //   91: getfield r : [I
    //   94: iconst_0
    //   95: aload_0
    //   96: getfield q : [I
    //   99: iconst_0
    //   100: aload_0
    //   101: getfield k : [Landroid/graphics/drawable/Drawable;
    //   104: arraylength
    //   105: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   108: aload_0
    //   109: aload_0
    //   110: invokevirtual f : ()J
    //   113: putfield p : J
    //   116: aload_0
    //   117: getfield o : I
    //   120: ifne -> 128
    //   123: fconst_1
    //   124: fstore_2
    //   125: goto -> 130
    //   128: fconst_0
    //   129: fstore_2
    //   130: aload_0
    //   131: fload_2
    //   132: invokespecial a : (F)Z
    //   135: istore #7
    //   137: iload #7
    //   139: istore #6
    //   141: iload #7
    //   143: ifeq -> 153
    //   146: iload #7
    //   148: istore #6
    //   150: goto -> 155
    //   153: iconst_1
    //   154: istore_3
    //   155: aload_0
    //   156: iload_3
    //   157: putfield n : I
    //   160: iload #4
    //   162: istore_3
    //   163: aload_0
    //   164: getfield k : [Landroid/graphics/drawable/Drawable;
    //   167: astore #8
    //   169: iload_3
    //   170: aload #8
    //   172: arraylength
    //   173: if_icmpge -> 207
    //   176: aload_0
    //   177: aload_1
    //   178: aload #8
    //   180: iload_3
    //   181: aaload
    //   182: aload_0
    //   183: getfield r : [I
    //   186: iload_3
    //   187: iaload
    //   188: aload_0
    //   189: getfield s : I
    //   192: imul
    //   193: sipush #255
    //   196: idiv
    //   197: invokespecial a : (Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;I)V
    //   200: iload_3
    //   201: iconst_1
    //   202: iadd
    //   203: istore_3
    //   204: goto -> 163
    //   207: iload #6
    //   209: ifne -> 216
    //   212: aload_0
    //   213: invokevirtual invalidateSelf : ()V
    //   216: return
  }
  
  public void e() {
    this.n = 2;
    for (int i = 0; i < this.k.length; i++) {
      boolean bool;
      int[] arrayOfInt = this.r;
      if (this.t[i]) {
        bool = true;
      } else {
        bool = false;
      } 
      arrayOfInt[i] = bool;
    } 
    invalidateSelf();
  }
  
  public void e(int paramInt) {
    this.o = paramInt;
    if (this.n == 1)
      this.n = 0; 
  }
  
  protected long f() {
    return SystemClock.uptimeMillis();
  }
  
  public int getAlpha() {
    return this.s;
  }
  
  public void invalidateSelf() {
    if (this.u == 0)
      super.invalidateSelf(); 
  }
  
  public void setAlpha(int paramInt) {
    if (this.s != paramInt) {
      this.s = paramInt;
      invalidateSelf();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */