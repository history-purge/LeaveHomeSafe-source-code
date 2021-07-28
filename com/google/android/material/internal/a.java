package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import b.g.l.d;
import b.g.l.e;
import b.g.m.v;
import e.f.a.f.x.d;
import e.f.a.f.x.f;

public final class a {
  private static final boolean V;
  
  private static final Paint W = null;
  
  private boolean A;
  
  private Bitmap B;
  
  private Paint C;
  
  private float D;
  
  private float E;
  
  private float F;
  
  private float G;
  
  private int[] H;
  
  private boolean I;
  
  private final TextPaint J;
  
  private final TextPaint K;
  
  private TimeInterpolator L;
  
  private TimeInterpolator M;
  
  private float N;
  
  private float O;
  
  private float P;
  
  private ColorStateList Q;
  
  private float R;
  
  private float S;
  
  private float T;
  
  private ColorStateList U;
  
  private final View a;
  
  private boolean b;
  
  private float c;
  
  private final Rect d;
  
  private final Rect e;
  
  private final RectF f;
  
  private int g = 16;
  
  private int h = 16;
  
  private float i = 15.0F;
  
  private float j = 15.0F;
  
  private ColorStateList k;
  
  private ColorStateList l;
  
  private float m;
  
  private float n;
  
  private float o;
  
  private float p;
  
  private float q;
  
  private float r;
  
  private Typeface s;
  
  private Typeface t;
  
  private Typeface u;
  
  private e.f.a.f.x.a v;
  
  private e.f.a.f.x.a w;
  
  private CharSequence x;
  
  private CharSequence y;
  
  private boolean z;
  
  static {
    Paint paint = W;
    if (paint != null) {
      paint.setAntiAlias(true);
      W.setColor(-65281);
    } 
  }
  
  public a(View paramView) {
    this.a = paramView;
    this.J = new TextPaint(129);
    this.K = new TextPaint((Paint)this.J);
    this.e = new Rect();
    this.d = new Rect();
    this.f = new RectF();
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, TimeInterpolator paramTimeInterpolator) {
    float f = paramFloat3;
    if (paramTimeInterpolator != null)
      f = paramTimeInterpolator.getInterpolation(paramFloat3); 
    return e.f.a.f.l.a.a(paramFloat1, paramFloat2, f);
  }
  
  private static int a(int paramInt1, int paramInt2, float paramFloat) {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1);
    float f3 = Color.alpha(paramInt2);
    float f4 = Color.red(paramInt1);
    float f5 = Color.red(paramInt2);
    float f6 = Color.green(paramInt1);
    float f7 = Color.green(paramInt2);
    float f8 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * f1 + f3 * paramFloat), (int)(f4 * f1 + f5 * paramFloat), (int)(f6 * f1 + f7 * paramFloat), (int)(f8 * f1 + f9 * paramFloat));
  }
  
  private void a(TextPaint paramTextPaint) {
    paramTextPaint.setTextSize(this.j);
    paramTextPaint.setTypeface(this.s);
  }
  
  private static boolean a(float paramFloat1, float paramFloat2) {
    return (Math.abs(paramFloat1 - paramFloat2) < 0.001F);
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramRect.left == paramInt1 && paramRect.top == paramInt2 && paramRect.right == paramInt3 && paramRect.bottom == paramInt4);
  }
  
  private void b(TextPaint paramTextPaint) {
    paramTextPaint.setTextSize(this.i);
    paramTextPaint.setTypeface(this.t);
  }
  
  private boolean b(CharSequence paramCharSequence) {
    d d;
    int i = v.p(this.a);
    boolean bool = true;
    if (i != 1)
      bool = false; 
    if (bool) {
      d = e.d;
    } else {
      d = e.c;
    } 
    return d.a(paramCharSequence, 0, paramCharSequence.length());
  }
  
  private int c(ColorStateList paramColorStateList) {
    if (paramColorStateList == null)
      return 0; 
    int[] arrayOfInt = this.H;
    return (arrayOfInt != null) ? paramColorStateList.getColorForState(arrayOfInt, 0) : paramColorStateList.getDefaultColor();
  }
  
  private void c(float paramFloat) {
    int i;
    TextPaint textPaint;
    e(paramFloat);
    this.q = a(this.o, this.p, paramFloat, this.L);
    this.r = a(this.m, this.n, paramFloat, this.L);
    f(a(this.i, this.j, paramFloat, this.M));
    if (this.l != this.k) {
      textPaint = this.J;
      i = a(n(), d(), paramFloat);
    } else {
      textPaint = this.J;
      i = d();
    } 
    textPaint.setColor(i);
    this.J.setShadowLayer(a(this.R, this.N, paramFloat, (TimeInterpolator)null), a(this.S, this.O, paramFloat, (TimeInterpolator)null), a(this.T, this.P, paramFloat, (TimeInterpolator)null), a(c(this.U), c(this.Q), paramFloat));
    v.M(this.a);
  }
  
  private boolean c(Typeface paramTypeface) {
    e.f.a.f.x.a a1 = this.w;
    if (a1 != null)
      a1.a(); 
    if (this.s != paramTypeface) {
      this.s = paramTypeface;
      return true;
    } 
    return false;
  }
  
  private void d(float paramFloat) {
    float f1;
    boolean bool1;
    if (this.x == null)
      return; 
    float f2 = this.e.width();
    float f3 = this.d.width();
    boolean bool = a(paramFloat, this.j);
    boolean bool3 = true;
    if (bool) {
      f1 = this.j;
      this.F = 1.0F;
      Typeface typeface1 = this.u;
      Typeface typeface2 = this.s;
      if (typeface1 != typeface2) {
        this.u = typeface2;
        bool1 = true;
      } else {
        bool1 = false;
      } 
      paramFloat = f2;
    } else {
      f1 = this.i;
      Typeface typeface1 = this.u;
      Typeface typeface2 = this.t;
      if (typeface1 != typeface2) {
        this.u = typeface2;
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (a(paramFloat, this.i)) {
        this.F = 1.0F;
      } else {
        this.F = paramFloat / this.i;
      } 
      paramFloat = this.j / this.i;
      if (f3 * paramFloat > f2) {
        paramFloat = Math.min(f2 / paramFloat, f3);
      } else {
        paramFloat = f3;
      } 
    } 
    boolean bool2 = bool1;
    if (paramFloat > 0.0F) {
      if (this.G != f1 || this.I || bool1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.G = f1;
      this.I = false;
      bool2 = bool1;
    } 
    if (this.y == null || bool2) {
      this.J.setTextSize(this.G);
      this.J.setTypeface(this.u);
      TextPaint textPaint = this.J;
      if (this.F == 1.0F)
        bool3 = false; 
      textPaint.setLinearText(bool3);
      CharSequence charSequence = TextUtils.ellipsize(this.x, this.J, paramFloat, TextUtils.TruncateAt.END);
      if (!TextUtils.equals(charSequence, this.y)) {
        this.y = charSequence;
        this.z = b(this.y);
      } 
    } 
  }
  
  private boolean d(Typeface paramTypeface) {
    e.f.a.f.x.a a1 = this.v;
    if (a1 != null)
      a1.a(); 
    if (this.t != paramTypeface) {
      this.t = paramTypeface;
      return true;
    } 
    return false;
  }
  
  private void e(float paramFloat) {
    this.f.left = a(this.d.left, this.e.left, paramFloat, this.L);
    this.f.top = a(this.m, this.n, paramFloat, this.L);
    this.f.right = a(this.d.right, this.e.right, paramFloat, this.L);
    this.f.bottom = a(this.d.bottom, this.e.bottom, paramFloat, this.L);
  }
  
  private void f(float paramFloat) {
    boolean bool;
    d(paramFloat);
    if (V && this.F != 1.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    this.A = bool;
    if (this.A)
      m(); 
    v.M(this.a);
  }
  
  private void j() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private void k() {
    c(this.c);
  }
  
  private void l() {
    Bitmap bitmap = this.B;
    if (bitmap != null) {
      bitmap.recycle();
      this.B = null;
    } 
  }
  
  private void m() {
    if (this.B == null && !this.d.isEmpty()) {
      if (TextUtils.isEmpty(this.y))
        return; 
      c(0.0F);
      this.D = this.J.ascent();
      this.E = this.J.descent();
      TextPaint textPaint = this.J;
      CharSequence charSequence = this.y;
      int i = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
      int j = Math.round(this.E - this.D);
      if (i > 0) {
        if (j <= 0)
          return; 
        this.B = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.B);
        charSequence = this.y;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0F, j - this.J.descent(), (Paint)this.J);
        if (this.C == null)
          this.C = new Paint(3); 
      } 
    } 
  }
  
  private int n() {
    return c(this.k);
  }
  
  public float a() {
    if (this.x == null)
      return 0.0F; 
    a(this.K);
    TextPaint textPaint = this.K;
    CharSequence charSequence = this.x;
    return textPaint.measureText(charSequence, 0, charSequence.length());
  }
  
  public void a(float paramFloat) {
    if (this.i != paramFloat) {
      this.i = paramFloat;
      i();
    } 
  }
  
  public void a(int paramInt) {
    d d = new d(this.a.getContext(), paramInt);
    ColorStateList colorStateList = d.b;
    if (colorStateList != null)
      this.l = colorStateList; 
    float f = d.a;
    if (f != 0.0F)
      this.j = f; 
    colorStateList = d.f;
    if (colorStateList != null)
      this.Q = colorStateList; 
    this.O = d.g;
    this.P = d.h;
    this.N = d.i;
    e.f.a.f.x.a a1 = this.w;
    if (a1 != null)
      a1.a(); 
    this.w = new e.f.a.f.x.a(new a(this), d.a());
    d.a(this.a.getContext(), (f)this.w);
    i();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a(this.e, paramInt1, paramInt2, paramInt3, paramInt4)) {
      this.e.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.I = true;
      h();
    } 
  }
  
  public void a(TimeInterpolator paramTimeInterpolator) {
    this.L = paramTimeInterpolator;
    i();
  }
  
  public void a(ColorStateList paramColorStateList) {
    if (this.l != paramColorStateList) {
      this.l = paramColorStateList;
      i();
    } 
  }
  
  public void a(Canvas paramCanvas) {
    int i = paramCanvas.save();
    if (this.y != null && this.b) {
      boolean bool;
      float f4 = this.q;
      float f3 = this.r;
      if (this.A && this.B != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        f2 = this.D * this.F;
      } else {
        f2 = this.J.ascent() * this.F;
        this.J.descent();
      } 
      float f1 = f3;
      if (bool)
        f1 = f3 + f2; 
      float f2 = this.F;
      if (f2 != 1.0F)
        paramCanvas.scale(f2, f2, f4, f1); 
      if (bool) {
        paramCanvas.drawBitmap(this.B, f4, f1, this.C);
      } else {
        CharSequence charSequence = this.y;
        paramCanvas.drawText(charSequence, 0, charSequence.length(), f4, f1, (Paint)this.J);
      } 
    } 
    paramCanvas.restoreToCount(i);
  }
  
  public void a(Rect paramRect) {
    a(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
  }
  
  public void a(RectF paramRectF) {
    float f;
    boolean bool = b(this.x);
    Rect rect = this.e;
    if (!bool) {
      f = rect.left;
    } else {
      f = rect.right - a();
    } 
    paramRectF.left = f;
    rect = this.e;
    paramRectF.top = rect.top;
    if (!bool) {
      f = paramRectF.left + a();
    } else {
      f = rect.right;
    } 
    paramRectF.right = f;
    paramRectF.bottom = this.e.top + c();
  }
  
  public void a(Typeface paramTypeface) {
    if (c(paramTypeface))
      i(); 
  }
  
  public void a(CharSequence paramCharSequence) {
    if (paramCharSequence == null || !TextUtils.equals(this.x, paramCharSequence)) {
      this.x = paramCharSequence;
      this.y = null;
      l();
      i();
    } 
  }
  
  public final boolean a(int[] paramArrayOfint) {
    this.H = paramArrayOfint;
    if (g()) {
      i();
      return true;
    } 
    return false;
  }
  
  public ColorStateList b() {
    return this.l;
  }
  
  public void b(float paramFloat) {
    paramFloat = b.g.i.a.a(paramFloat, 0.0F, 1.0F);
    if (paramFloat != this.c) {
      this.c = paramFloat;
      k();
    } 
  }
  
  public void b(int paramInt) {
    if (this.h != paramInt) {
      this.h = paramInt;
      i();
    } 
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a(this.d, paramInt1, paramInt2, paramInt3, paramInt4)) {
      this.d.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.I = true;
      h();
    } 
  }
  
  public void b(TimeInterpolator paramTimeInterpolator) {
    this.M = paramTimeInterpolator;
    i();
  }
  
  public void b(ColorStateList paramColorStateList) {
    if (this.k != paramColorStateList) {
      this.k = paramColorStateList;
      i();
    } 
  }
  
  public void b(Rect paramRect) {
    b(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
  }
  
  public void b(Typeface paramTypeface) {
    boolean bool1 = c(paramTypeface);
    boolean bool2 = d(paramTypeface);
    if (bool1 || bool2)
      i(); 
  }
  
  public float c() {
    a(this.K);
    return -this.K.ascent();
  }
  
  public void c(int paramInt) {
    if (this.g != paramInt) {
      this.g = paramInt;
      i();
    } 
  }
  
  public int d() {
    return c(this.l);
  }
  
  public float e() {
    b(this.K);
    return -this.K.ascent();
  }
  
  public float f() {
    return this.c;
  }
  
  public final boolean g() {
    ColorStateList colorStateList = this.l;
    if (colorStateList == null || !colorStateList.isStateful()) {
      colorStateList = this.k;
      if (colorStateList == null || !colorStateList.isStateful())
        return false; 
    } 
    return true;
  }
  
  void h() {
    boolean bool;
    if (this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
  }
  
  public void i() {
    if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
      j();
      k();
    } 
  }
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT < 18) {
      bool = true;
    } else {
      bool = false;
    } 
    V = bool;
  }
  
  class a implements e.f.a.f.x.a.a {
    a(a this$0) {}
    
    public void a(Typeface param1Typeface) {
      this.a.a(param1Typeface);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */