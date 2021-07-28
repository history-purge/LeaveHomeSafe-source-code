package e.f.a.f.a0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;

public class g extends Drawable implements b, n {
  private static final Paint x = new Paint(1);
  
  private c c;
  
  private final m.g[] d = new m.g[4];
  
  private final m.g[] e = new m.g[4];
  
  private boolean f;
  
  private final Matrix g = new Matrix();
  
  private final Path h = new Path();
  
  private final Path i = new Path();
  
  private final RectF j = new RectF();
  
  private final RectF k = new RectF();
  
  private final Region l = new Region();
  
  private final Region m = new Region();
  
  private k n;
  
  private final Paint o = new Paint(1);
  
  private final Paint p = new Paint(1);
  
  private final e.f.a.f.z.a q = new e.f.a.f.z.a();
  
  private final l.a r;
  
  private final l s = new l();
  
  private PorterDuffColorFilter t;
  
  private PorterDuffColorFilter u;
  
  private Rect v;
  
  private final RectF w = new RectF();
  
  public g() {
    this(new k());
  }
  
  public g(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this(k.a(paramContext, paramAttributeSet, paramInt1, paramInt2).a());
  }
  
  private g(c paramc) {
    this.c = paramc;
    this.p.setStyle(Paint.Style.STROKE);
    this.o.setStyle(Paint.Style.FILL);
    x.setColor(-1);
    x.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    A();
    a(getState());
    this.r = new a(this);
  }
  
  public g(k paramk) {
    this(new c(paramk, null));
  }
  
  private boolean A() {
    PorterDuffColorFilter porterDuffColorFilter1 = this.t;
    PorterDuffColorFilter porterDuffColorFilter2 = this.u;
    c c2 = this.c;
    ColorStateList colorStateList = c2.g;
    PorterDuff.Mode mode = c2.h;
    Paint paint = this.o;
    boolean bool = true;
    this.t = a(colorStateList, mode, paint, true);
    c c1 = this.c;
    this.u = a(c1.f, c1.h, this.p, false);
    c1 = this.c;
    if (c1.u)
      this.q.a(c1.g.getColorForState(getState(), 0)); 
    if (androidx.core.util.b.a(porterDuffColorFilter1, this.t)) {
      if (!androidx.core.util.b.a(porterDuffColorFilter2, this.u))
        return true; 
      bool = false;
    } 
    return bool;
  }
  
  private void B() {
    float f = p();
    this.c.r = (int)Math.ceil((0.75F * f));
    this.c.s = (int)Math.ceil((f * 0.25F));
    A();
    y();
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return paramInt1 * (paramInt2 + (paramInt2 >>> 7)) >>> 8;
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, Paint paramPaint, boolean paramBoolean) {
    return (paramColorStateList == null || paramMode == null) ? a(paramPaint, paramBoolean) : a(paramColorStateList, paramMode, paramBoolean);
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, boolean paramBoolean) {
    int j = paramColorStateList.getColorForState(getState(), 0);
    int i = j;
    if (paramBoolean)
      i = b(j); 
    return new PorterDuffColorFilter(i, paramMode);
  }
  
  private PorterDuffColorFilter a(Paint paramPaint, boolean paramBoolean) {
    if (paramBoolean) {
      int i = paramPaint.getColor();
      int j = b(i);
      if (j != i)
        return new PorterDuffColorFilter(j, PorterDuff.Mode.SRC_IN); 
    } 
    return null;
  }
  
  public static g a(Context paramContext, float paramFloat) {
    int i = e.f.a.f.q.a.a(paramContext, e.f.a.f.b.colorSurface, g.class.getSimpleName());
    g g1 = new g();
    g1.a(paramContext);
    g1.a(ColorStateList.valueOf(i));
    g1.a(paramFloat);
    return g1;
  }
  
  private void a(Canvas paramCanvas) {
    if (this.c.s != 0)
      paramCanvas.drawPath(this.h, this.q.a()); 
    int i;
    for (i = 0; i < 4; i++) {
      this.d[i].a(this.q, this.c.r, paramCanvas);
      this.e[i].a(this.q, this.c.r, paramCanvas);
    } 
    i = h();
    int j = i();
    paramCanvas.translate(-i, -j);
    paramCanvas.drawPath(this.h, x);
    paramCanvas.translate(i, j);
  }
  
  private void a(Canvas paramCanvas, Paint paramPaint, Path paramPath, k paramk, RectF paramRectF) {
    if (paramk.a(paramRectF)) {
      float f = paramk.l().a(paramRectF);
      paramCanvas.drawRoundRect(paramRectF, f, f, paramPaint);
      return;
    } 
    paramCanvas.drawPath(paramPath, paramPaint);
  }
  
  private boolean a(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Le/f/a/f/a0/g$c;
    //   4: getfield d : Landroid/content/res/ColorStateList;
    //   7: ifnull -> 50
    //   10: aload_0
    //   11: getfield o : Landroid/graphics/Paint;
    //   14: invokevirtual getColor : ()I
    //   17: istore_2
    //   18: aload_0
    //   19: getfield c : Le/f/a/f/a0/g$c;
    //   22: getfield d : Landroid/content/res/ColorStateList;
    //   25: aload_1
    //   26: iload_2
    //   27: invokevirtual getColorForState : ([II)I
    //   30: istore_3
    //   31: iload_2
    //   32: iload_3
    //   33: if_icmpeq -> 50
    //   36: aload_0
    //   37: getfield o : Landroid/graphics/Paint;
    //   40: iload_3
    //   41: invokevirtual setColor : (I)V
    //   44: iconst_1
    //   45: istore #4
    //   47: goto -> 53
    //   50: iconst_0
    //   51: istore #4
    //   53: iload #4
    //   55: istore #5
    //   57: aload_0
    //   58: getfield c : Le/f/a/f/a0/g$c;
    //   61: getfield e : Landroid/content/res/ColorStateList;
    //   64: ifnull -> 108
    //   67: aload_0
    //   68: getfield p : Landroid/graphics/Paint;
    //   71: invokevirtual getColor : ()I
    //   74: istore_2
    //   75: aload_0
    //   76: getfield c : Le/f/a/f/a0/g$c;
    //   79: getfield e : Landroid/content/res/ColorStateList;
    //   82: aload_1
    //   83: iload_2
    //   84: invokevirtual getColorForState : ([II)I
    //   87: istore_3
    //   88: iload #4
    //   90: istore #5
    //   92: iload_2
    //   93: iload_3
    //   94: if_icmpeq -> 108
    //   97: aload_0
    //   98: getfield p : Landroid/graphics/Paint;
    //   101: iload_3
    //   102: invokevirtual setColor : (I)V
    //   105: iconst_1
    //   106: istore #5
    //   108: iload #5
    //   110: ireturn
  }
  
  private int b(int paramInt) {
    float f1 = p();
    float f2 = g();
    e.f.a.f.t.a a1 = this.c.b;
    int i = paramInt;
    if (a1 != null)
      i = a1.b(paramInt, f1 + f2); 
    return i;
  }
  
  private void b(Canvas paramCanvas) {
    a(paramCanvas, this.o, this.h, this.c.a, d());
  }
  
  private void b(RectF paramRectF, Path paramPath) {
    a(paramRectF, paramPath);
    if (this.c.j != 1.0F) {
      this.g.reset();
      Matrix matrix = this.g;
      float f = this.c.j;
      matrix.setScale(f, f, paramRectF.width() / 2.0F, paramRectF.height() / 2.0F);
      paramPath.transform(this.g);
    } 
    paramPath.computeBounds(this.w, true);
  }
  
  private void c(Canvas paramCanvas) {
    a(paramCanvas, this.p, this.i, this.n, t());
  }
  
  private void d(Canvas paramCanvas) {
    int i = h();
    int j = i();
    if (Build.VERSION.SDK_INT < 21) {
      Rect rect = paramCanvas.getClipBounds();
      int m = this.c.r;
      rect.inset(-m, -m);
      rect.offset(i, j);
      paramCanvas.clipRect(rect, Region.Op.REPLACE);
    } 
    paramCanvas.translate(i, j);
  }
  
  private void s() {
    float f = -u();
    this.n = k().a(new b(this, f));
    this.s.a(this.n, this.c.k, t(), this.i);
  }
  
  private RectF t() {
    RectF rectF = d();
    float f = u();
    this.k.set(rectF.left + f, rectF.top + f, rectF.right - f, rectF.bottom - f);
    return this.k;
  }
  
  private float u() {
    return x() ? (this.p.getStrokeWidth() / 2.0F) : 0.0F;
  }
  
  private boolean v() {
    c c1 = this.c;
    int i = c1.q;
    null = true;
    if (i != 1 && c1.r > 0)
      if (i != 2) {
        if (z())
          return true; 
      } else {
        return null;
      }  
    return false;
  }
  
  private boolean w() {
    Paint.Style style = this.c.v;
    return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL);
  }
  
  private boolean x() {
    Paint.Style style = this.c.v;
    return ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0F);
  }
  
  private void y() {
    super.invalidateSelf();
  }
  
  private boolean z() {
    return (Build.VERSION.SDK_INT < 21 || (!r() && !this.h.isConvex()));
  }
  
  public void a(float paramFloat) {
    c c1 = this.c;
    if (c1.o != paramFloat) {
      c1.o = paramFloat;
      B();
    } 
  }
  
  public void a(float paramFloat, int paramInt) {
    d(paramFloat);
    b(ColorStateList.valueOf(paramInt));
  }
  
  public void a(float paramFloat, ColorStateList paramColorStateList) {
    d(paramFloat);
    b(paramColorStateList);
  }
  
  public void a(int paramInt) {
    c c1 = this.c;
    if (c1.t != paramInt) {
      c1.t = paramInt;
      y();
    } 
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    c c1 = this.c;
    if (c1.i == null)
      c1.i = new Rect(); 
    this.c.i.set(paramInt1, paramInt2, paramInt3, paramInt4);
    this.v = this.c.i;
    invalidateSelf();
  }
  
  public void a(Context paramContext) {
    this.c.b = new e.f.a.f.t.a(paramContext);
    B();
  }
  
  public void a(ColorStateList paramColorStateList) {
    c c1 = this.c;
    if (c1.d != paramColorStateList) {
      c1.d = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  protected void a(Canvas paramCanvas, Paint paramPaint, Path paramPath, RectF paramRectF) {
    a(paramCanvas, paramPaint, paramPath, this.c.a, paramRectF);
  }
  
  protected final void a(RectF paramRectF, Path paramPath) {
    l l1 = this.s;
    c c1 = this.c;
    l1.a(c1.a, c1.k, paramRectF, this.r, paramPath);
  }
  
  public float b() {
    return this.c.a.c().a(d());
  }
  
  public void b(float paramFloat) {
    c c1 = this.c;
    if (c1.k != paramFloat) {
      c1.k = paramFloat;
      this.f = true;
      invalidateSelf();
    } 
  }
  
  public void b(ColorStateList paramColorStateList) {
    c c1 = this.c;
    if (c1.e != paramColorStateList) {
      c1.e = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public float c() {
    return this.c.a.e().a(d());
  }
  
  public void c(float paramFloat) {
    c c1 = this.c;
    if (c1.n != paramFloat) {
      c1.n = paramFloat;
      B();
    } 
  }
  
  protected RectF d() {
    Rect rect = getBounds();
    this.j.set(rect.left, rect.top, rect.right, rect.bottom);
    return this.j;
  }
  
  public void d(float paramFloat) {
    this.c.l = paramFloat;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) {
    this.o.setColorFilter((ColorFilter)this.t);
    int i = this.o.getAlpha();
    this.o.setAlpha(a(i, this.c.m));
    this.p.setColorFilter((ColorFilter)this.u);
    this.p.setStrokeWidth(this.c.l);
    int j = this.p.getAlpha();
    this.p.setAlpha(a(j, this.c.m));
    if (this.f) {
      s();
      b(d(), this.h);
      this.f = false;
    } 
    if (v()) {
      paramCanvas.save();
      d(paramCanvas);
      int m = (int)(this.w.width() - getBounds().width());
      int i1 = (int)(this.w.height() - getBounds().height());
      Bitmap bitmap = Bitmap.createBitmap((int)this.w.width() + this.c.r * 2 + m, (int)this.w.height() + this.c.r * 2 + i1, Bitmap.Config.ARGB_8888);
      Canvas canvas = new Canvas(bitmap);
      float f1 = ((getBounds()).left - this.c.r - m);
      float f2 = ((getBounds()).top - this.c.r - i1);
      canvas.translate(-f1, -f2);
      a(canvas);
      paramCanvas.drawBitmap(bitmap, f1, f2, null);
      bitmap.recycle();
      paramCanvas.restore();
    } 
    if (w())
      b(paramCanvas); 
    if (x())
      c(paramCanvas); 
    this.o.setAlpha(i);
    this.p.setAlpha(j);
  }
  
  public float e() {
    return this.c.o;
  }
  
  public ColorStateList f() {
    return this.c.d;
  }
  
  public float g() {
    return this.c.n;
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.c;
  }
  
  public int getOpacity() {
    return -3;
  }
  
  @TargetApi(21)
  public void getOutline(Outline paramOutline) {
    if (this.c.q == 2)
      return; 
    if (r()) {
      float f = m();
      paramOutline.setRoundRect(getBounds(), f);
      return;
    } 
    b(d(), this.h);
    if (this.h.isConvex())
      paramOutline.setConvexPath(this.h); 
  }
  
  public boolean getPadding(Rect paramRect) {
    Rect rect = this.v;
    if (rect != null) {
      paramRect.set(rect);
      return true;
    } 
    return super.getPadding(paramRect);
  }
  
  public Region getTransparentRegion() {
    Rect rect = getBounds();
    this.l.set(rect);
    b(d(), this.h);
    this.m.setPath(this.h, this.l);
    this.l.op(this.m, Region.Op.DIFFERENCE);
    return this.l;
  }
  
  public int h() {
    c c1 = this.c;
    double d1 = c1.s;
    double d2 = Math.sin(Math.toRadians(c1.t));
    Double.isNaN(d1);
    return (int)(d1 * d2);
  }
  
  public int i() {
    c c1 = this.c;
    double d1 = c1.s;
    double d2 = Math.cos(Math.toRadians(c1.t));
    Double.isNaN(d1);
    return (int)(d1 * d2);
  }
  
  public void invalidateSelf() {
    this.f = true;
    super.invalidateSelf();
  }
  
  public boolean isStateful() {
    if (!super.isStateful()) {
      ColorStateList colorStateList = this.c.g;
      if (colorStateList == null || !colorStateList.isStateful()) {
        colorStateList = this.c.f;
        if (colorStateList == null || !colorStateList.isStateful()) {
          colorStateList = this.c.e;
          if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.c.d;
            if (colorStateList == null || !colorStateList.isStateful())
              return false; 
          } 
        } 
      } 
    } 
    return true;
  }
  
  public int j() {
    return this.c.r;
  }
  
  public k k() {
    return this.c.a;
  }
  
  public ColorStateList l() {
    return this.c.g;
  }
  
  public float m() {
    return this.c.a.j().a(d());
  }
  
  public Drawable mutate() {
    this.c = new c(this.c);
    return this;
  }
  
  public float n() {
    return this.c.a.l().a(d());
  }
  
  public float o() {
    return this.c.p;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    this.f = true;
    super.onBoundsChange(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool1 = a(paramArrayOfint);
    boolean bool2 = A();
    if (bool1 || bool2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1)
      invalidateSelf(); 
    return bool1;
  }
  
  public float p() {
    return e() + o();
  }
  
  public boolean q() {
    e.f.a.f.t.a a1 = this.c.b;
    return (a1 != null && a1.a());
  }
  
  public boolean r() {
    return this.c.a.a(d());
  }
  
  public void setAlpha(int paramInt) {
    c c1 = this.c;
    if (c1.m != paramInt) {
      c1.m = paramInt;
      y();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.c.c = paramColorFilter;
    y();
  }
  
  public void setShapeAppearanceModel(k paramk) {
    this.c.a = paramk;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.c.g = paramColorStateList;
    A();
    y();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    c c1 = this.c;
    if (c1.h != paramMode) {
      c1.h = paramMode;
      A();
      y();
    } 
  }
  
  class a implements l.a {
    a(g this$0) {}
    
    public void a(m param1m, Matrix param1Matrix, int param1Int) {
      g.b(this.a)[param1Int] = param1m.a(param1Matrix);
    }
    
    public void b(m param1m, Matrix param1Matrix, int param1Int) {
      g.a(this.a)[param1Int] = param1m.a(param1Matrix);
    }
  }
  
  class b implements k.c {
    b(g this$0, float param1Float) {}
    
    public c a(c param1c) {
      return (param1c instanceof i) ? param1c : new b(this.a, param1c);
    }
  }
  
  static final class c extends Drawable.ConstantState {
    public k a;
    
    public e.f.a.f.t.a b;
    
    public ColorFilter c;
    
    public ColorStateList d = null;
    
    public ColorStateList e = null;
    
    public ColorStateList f = null;
    
    public ColorStateList g = null;
    
    public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    
    public Rect i = null;
    
    public float j = 1.0F;
    
    public float k = 1.0F;
    
    public float l;
    
    public int m = 255;
    
    public float n = 0.0F;
    
    public float o = 0.0F;
    
    public float p = 0.0F;
    
    public int q = 0;
    
    public int r = 0;
    
    public int s = 0;
    
    public int t = 0;
    
    public boolean u = false;
    
    public Paint.Style v = Paint.Style.FILL_AND_STROKE;
    
    public c(c param1c) {
      this.a = param1c.a;
      this.b = param1c.b;
      this.l = param1c.l;
      this.c = param1c.c;
      this.d = param1c.d;
      this.e = param1c.e;
      this.h = param1c.h;
      this.g = param1c.g;
      this.m = param1c.m;
      this.j = param1c.j;
      this.s = param1c.s;
      this.q = param1c.q;
      this.u = param1c.u;
      this.k = param1c.k;
      this.n = param1c.n;
      this.o = param1c.o;
      this.p = param1c.p;
      this.r = param1c.r;
      this.t = param1c.t;
      this.f = param1c.f;
      this.v = param1c.v;
      Rect rect = param1c.i;
      if (rect != null)
        this.i = new Rect(rect); 
    }
    
    public c(k param1k, e.f.a.f.t.a param1a) {
      this.a = param1k;
      this.b = param1a;
    }
    
    public int getChangingConfigurations() {
      return 0;
    }
    
    public Drawable newDrawable() {
      g g = new g(this, null);
      g.a(g, true);
      return g;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */