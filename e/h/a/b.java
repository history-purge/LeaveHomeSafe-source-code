package e.h.a;

import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

public class b<T extends b> {
  private static short A = 0;
  
  private static int x = 11;
  
  private static MotionEvent.PointerProperties[] y;
  
  private static MotionEvent.PointerCoords[] z;
  
  private final int[] a = new int[x];
  
  private int b = 0;
  
  private int c;
  
  private View d;
  
  private int e = 0;
  
  private float f;
  
  private float g;
  
  private boolean h;
  
  private boolean i = true;
  
  private float[] j;
  
  private short k;
  
  private float l;
  
  private float m;
  
  private float n;
  
  private float o;
  
  private boolean p;
  
  private int q = 0;
  
  private d r;
  
  private i<T> s;
  
  private c t;
  
  int u;
  
  boolean v;
  
  boolean w;
  
  private static boolean a(float paramFloat) {
    return Float.isNaN(paramFloat) ^ true;
  }
  
  private MotionEvent d(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial e : (Landroid/view/MotionEvent;)Z
    //   5: ifne -> 10
    //   8: aload_1
    //   9: areturn
    //   10: aload_1
    //   11: invokevirtual getActionMasked : ()I
    //   14: istore #4
    //   16: iconst_2
    //   17: istore #5
    //   19: iconst_5
    //   20: istore #7
    //   22: iconst_0
    //   23: istore #8
    //   25: iload #4
    //   27: ifeq -> 136
    //   30: iload #4
    //   32: iconst_5
    //   33: if_icmpne -> 39
    //   36: goto -> 136
    //   39: bipush #6
    //   41: istore #7
    //   43: iload #4
    //   45: iconst_1
    //   46: if_icmpeq -> 69
    //   49: iload #4
    //   51: bipush #6
    //   53: if_icmpne -> 59
    //   56: goto -> 69
    //   59: iload #4
    //   61: istore #5
    //   63: iconst_m1
    //   64: istore #4
    //   66: goto -> 191
    //   69: aload_1
    //   70: invokevirtual getActionIndex : ()I
    //   73: istore #6
    //   75: aload_1
    //   76: iload #6
    //   78: invokevirtual getPointerId : (I)I
    //   81: istore #9
    //   83: iload #6
    //   85: istore #4
    //   87: aload_0
    //   88: getfield a : [I
    //   91: iload #9
    //   93: iaload
    //   94: iconst_m1
    //   95: if_icmpeq -> 191
    //   98: iload #6
    //   100: istore #5
    //   102: iload #7
    //   104: istore #4
    //   106: aload_0
    //   107: getfield b : I
    //   110: iconst_1
    //   111: if_icmpne -> 121
    //   114: iconst_1
    //   115: istore #4
    //   117: iload #6
    //   119: istore #5
    //   121: iload #4
    //   123: istore #6
    //   125: iload #5
    //   127: istore #4
    //   129: iload #6
    //   131: istore #5
    //   133: goto -> 191
    //   136: aload_1
    //   137: invokevirtual getActionIndex : ()I
    //   140: istore #6
    //   142: aload_1
    //   143: iload #6
    //   145: invokevirtual getPointerId : (I)I
    //   148: istore #9
    //   150: iload #6
    //   152: istore #4
    //   154: aload_0
    //   155: getfield a : [I
    //   158: iload #9
    //   160: iaload
    //   161: iconst_m1
    //   162: if_icmpeq -> 191
    //   165: iload #6
    //   167: istore #5
    //   169: iload #7
    //   171: istore #4
    //   173: aload_0
    //   174: getfield b : I
    //   177: iconst_1
    //   178: if_icmpne -> 121
    //   181: iconst_0
    //   182: istore #4
    //   184: iload #6
    //   186: istore #5
    //   188: goto -> 121
    //   191: aload_0
    //   192: getfield b : I
    //   195: invokestatic d : (I)V
    //   198: aload_1
    //   199: invokevirtual getX : ()F
    //   202: fstore_2
    //   203: aload_1
    //   204: invokevirtual getY : ()F
    //   207: fstore_3
    //   208: aload_1
    //   209: aload_1
    //   210: invokevirtual getRawX : ()F
    //   213: aload_1
    //   214: invokevirtual getRawY : ()F
    //   217: invokevirtual setLocation : (FF)V
    //   220: aload_1
    //   221: invokevirtual getPointerCount : ()I
    //   224: istore #10
    //   226: iconst_0
    //   227: istore #7
    //   229: iload #8
    //   231: iload #10
    //   233: if_icmpge -> 347
    //   236: aload_1
    //   237: iload #8
    //   239: invokevirtual getPointerId : (I)I
    //   242: istore #11
    //   244: iload #5
    //   246: istore #6
    //   248: iload #7
    //   250: istore #9
    //   252: aload_0
    //   253: getfield a : [I
    //   256: iload #11
    //   258: iaload
    //   259: iconst_m1
    //   260: if_icmpeq -> 330
    //   263: aload_1
    //   264: iload #8
    //   266: getstatic e/h/a/b.y : [Landroid/view/MotionEvent$PointerProperties;
    //   269: iload #7
    //   271: aaload
    //   272: invokevirtual getPointerProperties : (ILandroid/view/MotionEvent$PointerProperties;)V
    //   275: getstatic e/h/a/b.y : [Landroid/view/MotionEvent$PointerProperties;
    //   278: iload #7
    //   280: aaload
    //   281: aload_0
    //   282: getfield a : [I
    //   285: iload #11
    //   287: iaload
    //   288: putfield id : I
    //   291: aload_1
    //   292: iload #8
    //   294: getstatic e/h/a/b.z : [Landroid/view/MotionEvent$PointerCoords;
    //   297: iload #7
    //   299: aaload
    //   300: invokevirtual getPointerCoords : (ILandroid/view/MotionEvent$PointerCoords;)V
    //   303: iload #5
    //   305: istore #6
    //   307: iload #8
    //   309: iload #4
    //   311: if_icmpne -> 324
    //   314: iload #5
    //   316: iload #7
    //   318: bipush #8
    //   320: ishl
    //   321: ior
    //   322: istore #6
    //   324: iload #7
    //   326: iconst_1
    //   327: iadd
    //   328: istore #9
    //   330: iload #8
    //   332: iconst_1
    //   333: iadd
    //   334: istore #8
    //   336: iload #6
    //   338: istore #5
    //   340: iload #9
    //   342: istore #7
    //   344: goto -> 229
    //   347: aload_1
    //   348: invokevirtual getDownTime : ()J
    //   351: aload_1
    //   352: invokevirtual getEventTime : ()J
    //   355: iload #5
    //   357: iload #7
    //   359: getstatic e/h/a/b.y : [Landroid/view/MotionEvent$PointerProperties;
    //   362: getstatic e/h/a/b.z : [Landroid/view/MotionEvent$PointerCoords;
    //   365: aload_1
    //   366: invokevirtual getMetaState : ()I
    //   369: aload_1
    //   370: invokevirtual getButtonState : ()I
    //   373: aload_1
    //   374: invokevirtual getXPrecision : ()F
    //   377: aload_1
    //   378: invokevirtual getYPrecision : ()F
    //   381: aload_1
    //   382: invokevirtual getDeviceId : ()I
    //   385: aload_1
    //   386: invokevirtual getEdgeFlags : ()I
    //   389: aload_1
    //   390: invokevirtual getSource : ()I
    //   393: aload_1
    //   394: invokevirtual getFlags : ()I
    //   397: invokestatic obtain : (JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;
    //   400: astore #12
    //   402: aload_1
    //   403: fload_2
    //   404: fload_3
    //   405: invokevirtual setLocation : (FF)V
    //   408: aload #12
    //   410: fload_2
    //   411: fload_3
    //   412: invokevirtual setLocation : (FF)V
    //   415: aload #12
    //   417: areturn
  }
  
  private static void d(int paramInt) {
    int j = paramInt;
    if (y == null) {
      j = x;
      y = new MotionEvent.PointerProperties[j];
      z = new MotionEvent.PointerCoords[j];
      j = paramInt;
    } 
    while (j > 0) {
      MotionEvent.PointerProperties[] arrayOfPointerProperties = y;
      paramInt = j - 1;
      if (arrayOfPointerProperties[paramInt] == null) {
        arrayOfPointerProperties[paramInt] = new MotionEvent.PointerProperties();
        z[paramInt] = new MotionEvent.PointerCoords();
        j--;
      } 
    } 
  }
  
  private void e(int paramInt) {
    int j = this.e;
    if (j == paramInt)
      return; 
    this.e = paramInt;
    if (this.e == 4) {
      short s = A;
      A = (short)(s + 1);
      this.k = s;
    } 
    this.r.a(this, paramInt, j);
    b(paramInt, j);
  }
  
  private boolean e(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getPointerCount() != this.b)
      return true; 
    int j = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (j < arrayOfInt.length) {
        if (arrayOfInt[j] != -1 && arrayOfInt[j] != j)
          return true; 
        j++;
        continue;
      } 
      return false;
    } 
  }
  
  private int u() {
    int j;
    for (j = 0; j < this.b; j++) {
      int k;
      for (k = 0;; k++) {
        int[] arrayOfInt = this.a;
        if (k >= arrayOfInt.length || arrayOfInt[k] == j)
          break; 
      } 
      if (k == this.a.length)
        return j; 
    } 
    return j;
  }
  
  public T a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    if (this.j == null)
      this.j = new float[6]; 
    float[] arrayOfFloat = this.j;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    arrayOfFloat[2] = paramFloat3;
    arrayOfFloat[3] = paramFloat4;
    arrayOfFloat[4] = paramFloat5;
    arrayOfFloat[5] = paramFloat6;
    if (!a(paramFloat5) || !a(paramFloat1) || !a(paramFloat3)) {
      if (!a(paramFloat5) || a(paramFloat1) || a(paramFloat3)) {
        if (!a(paramFloat6) || !a(paramFloat4) || !a(paramFloat2)) {
          if (a(paramFloat6) && !a(paramFloat4)) {
            if (a(paramFloat2))
              return (T)this; 
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
          } 
          return (T)this;
        } 
        throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
      } 
      throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
    } 
    throw new IllegalArgumentException("Cannot have all of left, right and width defined");
  }
  
  public T a(c paramc) {
    this.t = paramc;
    return (T)this;
  }
  
  public b a(i<T> parami) {
    this.s = parami;
    return this;
  }
  
  public T a(boolean paramBoolean) {
    if (this.d != null)
      c(); 
    this.i = paramBoolean;
    return (T)this;
  }
  
  public final void a() {
    int j = this.e;
    if (j == 0 || j == 2)
      e(4); 
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  void a(int paramInt1, int paramInt2) {
    i<T> i1 = this.s;
    if (i1 != null)
      i1.a((T)this, paramInt1, paramInt2); 
  }
  
  void a(MotionEvent paramMotionEvent) {
    i<T> i1 = this.s;
    if (i1 != null)
      i1.a((T)this, paramMotionEvent); 
  }
  
  public final void a(View paramView, d paramd) {
    if (this.d == null && this.r == null) {
      Arrays.fill(this.a, -1);
      this.b = 0;
      this.e = 0;
      this.d = paramView;
      this.r = paramd;
      return;
    } 
    throw new IllegalStateException("Already prepared or hasn't been reset");
  }
  
  public boolean a(View paramView, float paramFloat1, float paramFloat2) {
    float f2;
    float f6;
    float f7;
    float f3 = paramView.getWidth();
    float f4 = paramView.getHeight();
    float[] arrayOfFloat = this.j;
    float f5 = 0.0F;
    float f1 = 0.0F;
    if (arrayOfFloat != null) {
      f6 = arrayOfFloat[0];
      f5 = arrayOfFloat[1];
      f7 = arrayOfFloat[2];
      float f8 = arrayOfFloat[3];
      if (a(f6)) {
        f2 = 0.0F - f6;
      } else {
        f2 = 0.0F;
      } 
      if (a(f5))
        f1 = 0.0F - f8; 
      f5 = f3;
      if (a(f7))
        f5 = f3 + f7; 
      f3 = f4;
      if (a(f8))
        f3 = f4 + f8; 
      arrayOfFloat = this.j;
      float f10 = arrayOfFloat[4];
      float f9 = arrayOfFloat[5];
      f4 = f5;
      f8 = f2;
      if (a(f10))
        if (!a(f6)) {
          f8 = f5 - f10;
          f4 = f5;
        } else {
          f4 = f5;
          f8 = f2;
          if (!a(f7)) {
            f4 = f10 + f2;
            f8 = f2;
          } 
        }  
      f7 = f4;
      f5 = f1;
      f6 = f8;
      f2 = f3;
      if (a(f9))
        if (!a(f1)) {
          f5 = f3 - f9;
          f7 = f4;
          f6 = f8;
          f2 = f3;
        } else {
          f7 = f4;
          f5 = f1;
          f6 = f8;
          f2 = f3;
          if (!a(f3)) {
            f2 = f1 + f9;
            f7 = f4;
            f5 = f1;
            f6 = f8;
          } 
        }  
    } else {
      f6 = 0.0F;
      f2 = f4;
      f7 = f3;
    } 
    return (paramFloat1 >= f6 && paramFloat1 <= f7 && paramFloat2 >= f5 && paramFloat2 <= f2);
  }
  
  public boolean a(b paramb) {
    int j = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (j < arrayOfInt.length) {
        if (arrayOfInt[j] != -1 && paramb.a[j] != -1)
          return true; 
        j++;
        continue;
      } 
      return false;
    } 
  }
  
  public T b(boolean paramBoolean) {
    this.p = paramBoolean;
    return (T)this;
  }
  
  public final void b() {
    if (this.e == 0)
      e(2); 
  }
  
  public void b(int paramInt) {
    int[] arrayOfInt = this.a;
    if (arrayOfInt[paramInt] == -1) {
      arrayOfInt[paramInt] = u();
      this.b++;
    } 
  }
  
  protected void b(int paramInt1, int paramInt2) {}
  
  public final void b(MotionEvent paramMotionEvent) {
    if (this.i) {
      int j = this.e;
      if (j != 3 && j != 1 && j != 5) {
        if (this.b < 1)
          return; 
        MotionEvent motionEvent = d(paramMotionEvent);
        this.f = motionEvent.getX();
        this.g = motionEvent.getY();
        this.q = motionEvent.getPointerCount();
        this.h = a(this.d, this.f, this.g);
        if (this.p && !this.h) {
          j = this.e;
          if (j == 4) {
            c();
            return;
          } 
          if (j == 2)
            e(); 
          return;
        } 
        this.l = f.a(motionEvent, true);
        this.m = f.b(motionEvent, true);
        this.n = motionEvent.getRawX() - motionEvent.getX();
        this.o = motionEvent.getRawY() - motionEvent.getY();
        c(motionEvent);
        if (motionEvent != paramMotionEvent)
          motionEvent.recycle(); 
      } 
    } 
  }
  
  public boolean b(b paramb) {
    if (paramb == this)
      return false; 
    c c1 = this.t;
    return (c1 != null) ? c1.d(this, paramb) : false;
  }
  
  public final void c() {
    int j = this.e;
    if (j == 4 || j == 0 || j == 2) {
      q();
      e(3);
    } 
  }
  
  public void c(int paramInt) {
    int[] arrayOfInt = this.a;
    if (arrayOfInt[paramInt] != -1) {
      arrayOfInt[paramInt] = -1;
      this.b--;
    } 
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    e(1);
  }
  
  public boolean c(b paramb) {
    if (paramb == this)
      return true; 
    c c1 = this.t;
    return (c1 != null) ? c1.a(this, paramb) : false;
  }
  
  public final void d() {
    int j = this.e;
    if (j == 2 || j == 4)
      e(5); 
  }
  
  public boolean d(b paramb) {
    if (paramb != this) {
      c c1 = this.t;
      if (c1 != null)
        return c1.c(this, paramb); 
    } 
    return false;
  }
  
  public final void e() {
    int j = this.e;
    if (j == 4 || j == 0 || j == 2)
      e(1); 
  }
  
  public boolean e(b paramb) {
    if (paramb != this) {
      c c1 = this.t;
      if (c1 != null)
        return c1.b(this, paramb); 
    } 
    return false;
  }
  
  public short f() {
    return this.k;
  }
  
  public float g() {
    return this.l;
  }
  
  public float h() {
    return this.m;
  }
  
  public float i() {
    return this.l - this.n;
  }
  
  public float j() {
    return this.m - this.o;
  }
  
  public int k() {
    return this.q;
  }
  
  public int l() {
    return this.e;
  }
  
  public int m() {
    return this.c;
  }
  
  public View n() {
    return this.d;
  }
  
  public boolean o() {
    return this.i;
  }
  
  public boolean p() {
    return this.h;
  }
  
  protected void q() {}
  
  protected void r() {}
  
  public final void s() {
    this.d = null;
    this.r = null;
    Arrays.fill(this.a, -1);
    this.b = 0;
    r();
  }
  
  public boolean t() {
    if (this.i) {
      int j = this.e;
      if (j != 1 && j != 3 && j != 5 && this.b > 0)
        return true; 
    } 
    return false;
  }
  
  public String toString() {
    String str;
    View view = this.d;
    if (view == null) {
      view = null;
    } else {
      str = view.getClass().getSimpleName();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append("@[");
    stringBuilder.append(this.c);
    stringBuilder.append("]:");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */