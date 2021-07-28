package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.r;
import com.facebook.react.views.view.f;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
public abstract class x0 extends f {
  private static final float[] r0 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
  
  Matrix A = new Matrix();
  
  final Matrix B = new Matrix();
  
  boolean C = true;
  
  boolean D = true;
  
  private RectF E;
  
  int F;
  
  private String G;
  
  String H;
  
  String I;
  
  String J;
  
  String K;
  
  final float L;
  
  private boolean M;
  
  private boolean N;
  
  String O;
  
  String P;
  
  private f0 Q;
  
  private Path R;
  
  private l S;
  
  private double T = -1.0D;
  
  private double U = -1.0D;
  
  private float V = -1.0F;
  
  private float W = -1.0F;
  
  private j a0;
  
  Path b0;
  
  Path c0;
  
  Path d0;
  
  Path e0;
  
  Path f0;
  
  RectF g0;
  
  RectF h0;
  
  RectF i0;
  
  RectF j0;
  
  RectF k0;
  
  Region l0;
  
  Region m0;
  
  Region n0;
  
  Region o0;
  
  ArrayList<r> p0;
  
  r q0;
  
  final ReactContext u;
  
  float v = 1.0F;
  
  Matrix w = new Matrix();
  
  Matrix x = new Matrix();
  
  Matrix y = new Matrix();
  
  Matrix z = new Matrix();
  
  x0(ReactContext paramReactContext) {
    super((Context)paramReactContext);
    this.u = paramReactContext;
    this.L = (c.a()).density;
  }
  
  private double d(c0 paramc0) {
    switch (a.a[paramc0.b.ordinal()]) {
      default:
        d1 = 1.0D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 7:
        d1 = 15.0D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 6:
        d1 = 1.25D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 5:
        d1 = 90.0D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 4:
        d1 = 3.543307D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 3:
        d1 = 35.43307D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 2:
        d1 = getFontSizeFromContext() / 2.0D;
        d2 = paramc0.a;
        d3 = this.L;
        Double.isNaN(d3);
        return d2 * d1 * d3;
      case 1:
        break;
    } 
    double d1 = getFontSizeFromContext();
    double d2 = paramc0.a;
    double d3 = this.L;
    Double.isNaN(d3);
    return d2 * d1 * d3;
  }
  
  private double getCanvasDiagonal() {
    double d = this.U;
    if (d != -1.0D)
      return d; 
    this.U = Math.sqrt(Math.pow(getCanvasWidth(), 2.0D) + Math.pow(getCanvasHeight(), 2.0D)) * 0.7071067811865476D;
    return this.U;
  }
  
  private float getCanvasHeight() {
    float f1 = this.V;
    if (f1 != -1.0F)
      return f1; 
    l l1 = getTextRoot();
    if (l1 == null) {
      f1 = getSvgView().getCanvasBounds().height();
    } else {
      f1 = l1.k().c();
    } 
    this.V = f1;
    return this.V;
  }
  
  private float getCanvasWidth() {
    float f1 = this.W;
    if (f1 != -1.0F)
      return f1; 
    l l1 = getTextRoot();
    if (l1 == null) {
      f1 = getSvgView().getCanvasBounds().width();
    } else {
      f1 = l1.k().d();
    } 
    this.W = f1;
    return this.W;
  }
  
  private double getFontSizeFromContext() {
    double d = this.T;
    if (d != -1.0D)
      return d; 
    l l1 = getTextRoot();
    if (l1 == null)
      return 12.0D; 
    if (this.a0 == null)
      this.a0 = l1.k(); 
    this.T = this.a0.b();
    return this.T;
  }
  
  private void i() {
    x0 x01 = this;
    while (true) {
      ViewParent viewParent = x01.getParent();
      if (!(viewParent instanceof x0))
        return; 
      x0 x02 = (x0)viewParent;
      if (x02.b0 == null)
        return; 
      x02.e();
    } 
  }
  
  double a(c0 paramc0) {
    c0.b b = paramc0.b;
    if (b == c0.b.d) {
      double d1 = paramc0.a;
      float f1 = this.L;
      double d2 = f1;
      Double.isNaN(d2);
      return d1 * d2;
    } 
    if (b == c0.b.e) {
      double d1 = paramc0.a / 100.0D;
      float f1 = getCanvasHeight();
      double d2 = f1;
      Double.isNaN(d2);
      return d1 * d2;
    } 
    return d(paramc0);
  }
  
  int a(Canvas paramCanvas, Matrix paramMatrix) {
    int i = paramCanvas.save();
    this.w.setConcat(this.x, this.y);
    paramCanvas.concat(this.w);
    this.w.preConcat(paramMatrix);
    this.w.invert(this.z);
    return i;
  }
  
  abstract int a(float[] paramArrayOffloat);
  
  void a(Canvas paramCanvas, int paramInt) {
    paramCanvas.restoreToCount(paramInt);
  }
  
  void a(Canvas paramCanvas, Paint paramPaint) {
    Path path = b(paramCanvas, paramPaint);
    if (path != null)
      paramCanvas.clipPath(path); 
  }
  
  abstract void a(Canvas paramCanvas, Paint paramPaint, float paramFloat);
  
  double b(c0 paramc0) {
    c0.b b = paramc0.b;
    if (b == c0.b.d) {
      double d1 = paramc0.a;
      double d2 = this.L;
      Double.isNaN(d2);
      return d1 * d2;
    } 
    if (b == c0.b.e) {
      double d1 = paramc0.a / 100.0D;
      double d2 = getCanvasDiagonal();
      return d1 * d2;
    } 
    return d(paramc0);
  }
  
  Path b(Canvas paramCanvas, Paint paramPaint) {
    if (this.G != null) {
      c c = (c)getSvgView().b(this.G);
      if (c != null) {
        Path path;
        if (c.F == 0) {
          path = c.c(paramCanvas, paramPaint);
        } else {
          path = c.a((Canvas)path, paramPaint, Region.Op.UNION);
        } 
        path.transform(c.x);
        path.transform(c.y);
        int i = c.F;
        if (i != 0) {
          if (i != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RNSVG: clipRule: ");
            stringBuilder.append(this.F);
            stringBuilder.append(" unrecognized");
            e.e.e.e.a.e("ReactNative", stringBuilder.toString());
          } 
        } else {
          path.setFillType(Path.FillType.EVEN_ODD);
        } 
        this.R = path;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RNSVG: Undefined clipPath: ");
        stringBuilder.append(this.G);
        e.e.e.e.a.e("ReactNative", stringBuilder.toString());
      } 
    } 
    return getClipPath();
  }
  
  void b(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    a(paramCanvas, paramPaint, paramFloat);
  }
  
  double c(c0 paramc0) {
    c0.b b = paramc0.b;
    if (b == c0.b.d) {
      double d1 = paramc0.a;
      float f1 = this.L;
      double d2 = f1;
      Double.isNaN(d2);
      return d1 * d2;
    } 
    if (b == c0.b.e) {
      double d1 = paramc0.a / 100.0D;
      float f1 = getCanvasWidth();
      double d2 = f1;
      Double.isNaN(d2);
      return d1 * d2;
    } 
    return d(paramc0);
  }
  
  abstract Path c(Canvas paramCanvas, Paint paramPaint);
  
  void e() {
    this.U = -1.0D;
    this.V = -1.0F;
    this.W = -1.0F;
    this.T = -1.0D;
    this.n0 = null;
    this.m0 = null;
    this.l0 = null;
    this.b0 = null;
  }
  
  void f() {
    e();
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view instanceof x0)
        ((x0)view).f(); 
    } 
  }
  
  boolean g() {
    return this.M;
  }
  
  RectF getClientRect() {
    return this.E;
  }
  
  Path getClipPath() {
    return this.R;
  }
  
  l getParentTextRoot() {
    ViewParent viewParent = getParent();
    return !(viewParent instanceof x0) ? null : ((x0)viewParent).getTextRoot();
  }
  
  f0 getSvgView() {
    f0 f01;
    StringBuilder stringBuilder;
    f0 f02 = this.Q;
    if (f02 != null)
      return f02; 
    ViewParent viewParent = getParent();
    if (viewParent == null)
      return null; 
    if (viewParent instanceof f0) {
      f01 = (f0)viewParent;
    } else if (f01 instanceof x0) {
      f01 = ((x0)f01).getSvgView();
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("RNSVG: ");
      stringBuilder.append(getClass().getName());
      stringBuilder.append(" should be descendant of a SvgView.");
      e.e.e.e.a.b("ReactNative", stringBuilder.toString());
      return this.Q;
    } 
    this.Q = (f0)stringBuilder;
    return this.Q;
  }
  
  l getTextRoot() {
    if (this.S == null) {
      x0 x01 = this;
      while (x01 != null) {
        if (x01 instanceof l) {
          l l1 = (l)x01;
          if (l1.k() != null) {
            this.S = l1;
            break;
          } 
        } 
        ViewParent viewParent = x01.getParent();
        if (!(viewParent instanceof x0)) {
          viewParent = null;
          continue;
        } 
        x0 x02 = (x0)viewParent;
      } 
    } 
    return this.S;
  }
  
  void h() {
    if (this.P != null)
      getSvgView().d(this, this.P); 
  }
  
  public void invalidate() {
    if (this instanceof b0 && this.b0 == null)
      return; 
    e();
    i();
    super.invalidate();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    RectF rectF = this.E;
    if (rectF == null)
      return; 
    if (!(this instanceof l)) {
      paramInt1 = (int)Math.floor(rectF.left);
      paramInt2 = (int)Math.floor(this.E.top);
      paramInt3 = (int)Math.ceil(this.E.right);
      paramInt4 = (int)Math.ceil(this.E.bottom);
      setLeft(paramInt1);
      setTop(paramInt2);
      setRight(paramInt3);
      setBottom(paramInt4);
    } 
    setMeasuredDimension((int)Math.ceil(this.E.width()), (int)Math.ceil(this.E.height()));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    RectF rectF = this.E;
    if (rectF != null) {
      paramInt1 = (int)Math.ceil(rectF.width());
    } else {
      paramInt1 = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    } 
    rectF = this.E;
    if (rectF != null) {
      paramInt2 = (int)Math.ceil(rectF.height());
    } else {
      paramInt2 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
    } 
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  void setClientRect(RectF paramRectF) {
    RectF rectF = this.E;
    if (rectF != null && rectF.equals(paramRectF))
      return; 
    this.E = paramRectF;
    paramRectF = this.E;
    if (paramRectF == null)
      return; 
    int i = (int)Math.ceil(paramRectF.width());
    int k = (int)Math.ceil(this.E.height());
    int m = (int)Math.floor(this.E.left);
    int n = (int)Math.floor(this.E.top);
    int i1 = (int)Math.ceil(this.E.right);
    int i2 = (int)Math.ceil(this.E.bottom);
    setMeasuredDimension(i, k);
    if (!(this instanceof l)) {
      setLeft(m);
      setTop(n);
      setRight(i1);
      setBottom(i2);
    } 
    if (!this.N)
      return; 
    ((UIManagerModule)this.u.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((c)p.b(getId(), m, n, i, k));
  }
  
  @com.facebook.react.uimanager.e1.a(name = "clipPath")
  public void setClipPath(String paramString) {
    this.R = null;
    this.G = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "clipRule")
  public void setClipRule(int paramInt) {
    this.F = paramInt;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "display")
  public void setDisplay(String paramString) {
    this.O = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "markerEnd")
  public void setMarkerEnd(String paramString) {
    this.K = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "markerMid")
  public void setMarkerMid(String paramString) {
    this.J = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "markerStart")
  public void setMarkerStart(String paramString) {
    this.I = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "mask")
  public void setMask(String paramString) {
    this.H = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "matrix")
  public void setMatrix(Dynamic paramDynamic) {
    boolean bool;
    ReadableType readableType = paramDynamic.getType();
    if (!paramDynamic.isNull() && readableType.equals(ReadableType.Array)) {
      int i = w.a(paramDynamic.asArray(), r0, this.L);
      if (i == 6) {
        if (this.x == null) {
          this.x = new Matrix();
          this.A = new Matrix();
        } 
        this.x.setValues(r0);
        bool = this.x.invert(this.A);
      } else {
        if (i != -1)
          e.e.e.e.a.e("ReactNative", "RNSVG: Transform matrices must be of size 6"); 
        super.invalidate();
        i();
      } 
    } else {
      this.x.reset();
      this.A.reset();
      bool = true;
    } 
    this.C = bool;
    super.invalidate();
    i();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "name")
  public void setName(String paramString) {
    this.P = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "onLayout")
  public void setOnLayout(boolean paramBoolean) {
    this.N = paramBoolean;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0F, name = "opacity")
  public void setOpacity(float paramFloat) {
    this.v = paramFloat;
    invalidate();
  }
  
  void setPointerEvents(r paramr) {
    this.q0 = paramr;
  }
  
  @com.facebook.react.uimanager.e1.a(name = "responsible")
  public void setResponsible(boolean paramBoolean) {
    this.M = paramBoolean;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */