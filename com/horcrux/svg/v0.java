package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;
import e.e.e.e.a;

@SuppressLint({"ViewConstructor"})
class v0 extends b0 {
  private String K0;
  
  private c0 L0;
  
  private c0 M0;
  
  private c0 N0;
  
  private c0 O0;
  
  public v0(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  int a(float[] paramArrayOffloat) {
    if (this.C) {
      StringBuilder stringBuilder;
      if (!this.D)
        return -1; 
      float[] arrayOfFloat = new float[2];
      this.A.mapPoints(arrayOfFloat, paramArrayOffloat);
      this.B.mapPoints(arrayOfFloat);
      x0 x0 = getSvgView().e(this.K0);
      if (x0 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("`Use` element expected a pre-defined svg template as `href` prop, template named: ");
        stringBuilder.append(this.K0);
        stringBuilder.append(" is not defined.");
        a.e("ReactNative", stringBuilder.toString());
        return -1;
      } 
      int i = stringBuilder.a(arrayOfFloat);
      if (i != -1) {
        int j = i;
        if (!stringBuilder.g()) {
          if (i != stringBuilder.getId())
            return i; 
          j = getId();
        } 
        return j;
      } 
    } 
    return -1;
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    StringBuilder stringBuilder;
    x0 x0 = getSvgView().e(this.K0);
    if (x0 == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("`Use` element expected a pre-defined svg template as `href` prop, template named: ");
      stringBuilder.append(this.K0);
      stringBuilder.append(" is not defined.");
      a.e("ReactNative", stringBuilder.toString());
      return;
    } 
    x0.e();
    stringBuilder.translate((float)c(this.L0), (float)a(this.M0));
    boolean bool = x0 instanceof b0;
    if (bool)
      ((b0)x0).a(this); 
    int i = x0.a((Canvas)stringBuilder, this.w);
    a((Canvas)stringBuilder, paramPaint);
    if (x0 instanceof g0) {
      ((g0)x0).a((Canvas)stringBuilder, paramPaint, paramFloat, (float)c(this.N0), (float)a(this.O0));
    } else {
      x0.a((Canvas)stringBuilder, paramPaint, paramFloat * this.v);
    } 
    setClientRect(x0.getClientRect());
    x0.a((Canvas)stringBuilder, i);
    if (bool)
      ((b0)x0).j(); 
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    StringBuilder stringBuilder;
    x0 x0 = getSvgView().e(this.K0);
    if (x0 == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("`Use` element expected a pre-defined svg template as `href` prop, template named: ");
      stringBuilder.append(this.K0);
      stringBuilder.append(" is not defined.");
      a.e("ReactNative", stringBuilder.toString());
      return null;
    } 
    Path path1 = x0.c((Canvas)stringBuilder, paramPaint);
    Path path2 = new Path();
    Matrix matrix = new Matrix();
    matrix.setTranslate((float)c(this.L0), (float)a(this.M0));
    path1.transform(matrix, path2);
    return path2;
  }
  
  @a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    this.O0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "href")
  public void setHref(String paramString) {
    this.K0 = paramString;
    invalidate();
  }
  
  @a(name = "width")
  public void setWidth(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "x")
  public void setX(Dynamic paramDynamic) {
    this.L0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y")
  public void setY(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */