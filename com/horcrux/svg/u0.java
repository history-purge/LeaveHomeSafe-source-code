package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
class u0 extends l {
  c0 M0 = null;
  
  c0 N0 = null;
  
  private String O0 = null;
  
  p0 P0 = p0.c;
  
  private j0 Q0;
  
  private ArrayList<c0> R0;
  
  private ArrayList<c0> S0;
  
  private ArrayList<c0> T0;
  
  private ArrayList<c0> U0;
  
  private ArrayList<c0> V0;
  
  double W0 = Double.NaN;
  
  public u0(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  double a(Paint paramPaint) {
    if (!Double.isNaN(this.W0))
      return this.W0; 
    double d = 0.0D;
    int i = 0;
    while (i < getChildCount()) {
      View view = getChildAt(i);
      double d1 = d;
      if (view instanceof u0)
        d1 = d + ((u0)view).a(paramPaint); 
      i++;
      d = d1;
    } 
    this.W0 = d;
    return d;
  }
  
  Path a(Canvas paramCanvas, Paint paramPaint, Region.Op paramOp) {
    return c(paramCanvas, paramPaint);
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    a(paramCanvas);
    a(paramCanvas, paramPaint);
    d(paramCanvas, paramPaint);
    n();
    d(paramCanvas, paramPaint, paramFloat);
    m();
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    Path path = this.b0;
    if (path != null)
      return path; 
    a(paramCanvas);
    return d(paramCanvas, paramPaint);
  }
  
  Path d(Canvas paramCanvas, Paint paramPaint) {
    Path path = this.b0;
    if (path != null)
      return path; 
    n();
    this.b0 = super.c(paramCanvas, paramPaint);
    m();
    return this.b0;
  }
  
  void e() {
    this.W0 = Double.NaN;
    super.e();
  }
  
  public void invalidate() {
    if (this.b0 == null)
      return; 
    super.invalidate();
    r().f();
  }
  
  void n() {
    boolean bool;
    if (!(this instanceof i0) && !(this instanceof h0)) {
      bool = true;
    } else {
      bool = false;
    } 
    l().a(bool, this, this.K0, this.R0, this.S0, this.U0, this.V0, this.T0);
  }
  
  j0 o() {
    if (this.Q0 == null)
      for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent()) {
        if (viewParent instanceof u0) {
          j0 j01 = ((u0)viewParent).Q0;
          if (j01 != null) {
            this.Q0 = j01;
            return j01;
          } 
        } 
      }  
    if (this.Q0 == null)
      this.Q0 = j0.c; 
    return this.Q0;
  }
  
  String p() {
    if (this.O0 == null)
      for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent()) {
        if (viewParent instanceof u0) {
          String str = ((u0)viewParent).O0;
          if (str != null) {
            this.O0 = str;
            return str;
          } 
        } 
      }  
    return this.O0;
  }
  
  u0 q() {
    ArrayList<h> arrayList = (l()).a;
    ViewParent viewParent = getParent();
    int i = arrayList.size() - 1;
    u0 u01 = this;
    while (i >= 0 && viewParent instanceof u0 && ((h)arrayList.get(i)).j != n0.c) {
      if (u01.R0 != null)
        return u01; 
      u01 = (u0)viewParent;
      viewParent = u01.getParent();
      i--;
    } 
    return u01;
  }
  
  u0 r() {
    ViewParent viewParent = getParent();
    u0 u01 = this;
    while (viewParent instanceof u0) {
      u01 = (u0)viewParent;
      viewParent = u01.getParent();
    } 
    return u01;
  }
  
  @a(name = "baselineShift")
  public void setBaselineShift(Dynamic paramDynamic) {
    this.O0 = c0.c(paramDynamic);
    invalidate();
  }
  
  @a(name = "dx")
  public void setDeltaX(Dynamic paramDynamic) {
    this.U0 = c0.a(paramDynamic);
    invalidate();
  }
  
  @a(name = "dy")
  public void setDeltaY(Dynamic paramDynamic) {
    this.V0 = c0.a(paramDynamic);
    invalidate();
  }
  
  @a(name = "inlineSize")
  public void setInlineSize(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "lengthAdjust")
  public void setLengthAdjust(String paramString) {
    this.P0 = p0.valueOf(paramString);
    invalidate();
  }
  
  @a(name = "alignmentBaseline")
  public void setMethod(String paramString) {
    this.Q0 = j0.a(paramString);
    invalidate();
  }
  
  @a(name = "x")
  public void setPositionX(Dynamic paramDynamic) {
    this.R0 = c0.a(paramDynamic);
    invalidate();
  }
  
  @a(name = "y")
  public void setPositionY(Dynamic paramDynamic) {
    this.S0 = c0.a(paramDynamic);
    invalidate();
  }
  
  @a(name = "rotate")
  public void setRotate(Dynamic paramDynamic) {
    this.T0 = c0.a(paramDynamic);
    invalidate();
  }
  
  @a(name = "textLength")
  public void setTextLength(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "verticalAlign")
  public void setVerticalAlign(String paramString) {
    if (paramString != null) {
      paramString = paramString.trim();
      int i = paramString.lastIndexOf(' ');
      try {
        this.Q0 = j0.a(paramString.substring(i));
      } catch (IllegalArgumentException illegalArgumentException) {
        this.Q0 = j0.c;
      } 
      try {
        this.O0 = paramString.substring(0, i);
        invalidate();
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
    } else {
      this.Q0 = j0.c;
    } 
    this.O0 = null;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */