package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;

public class a extends u {
  private static int i = 128;
  
  private double d = 0.0D;
  
  private double e = 0.0D;
  
  private double f = 0.0D;
  
  private double g = 0.0D;
  
  private double h = 0.0D;
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23 && i < 26)
      setStateListAnimator(null); 
  }
  
  private void b() {
    if (this.g == 0.0D) {
      double d1 = this.e;
      double d2 = this.d;
      double d3 = i;
      Double.isNaN(d3);
      this.h = (d1 - d2) / d3;
    } 
    setMax(getTotalSteps());
    c();
  }
  
  private void c() {
    double d1 = this.f;
    double d2 = this.d;
    d1 = (d1 - d2) / (this.e - d2);
    d2 = getTotalSteps();
    Double.isNaN(d2);
    setProgress((int)Math.round(d1 * d2));
  }
  
  private double getStepValue() {
    double d = this.g;
    return (d > 0.0D) ? d : this.h;
  }
  
  private int getTotalSteps() {
    return (int)Math.ceil((this.e - this.d) / getStepValue());
  }
  
  public double a(int paramInt) {
    if (paramInt == getMax())
      return this.e; 
    double d1 = paramInt;
    double d2 = getStepValue();
    Double.isNaN(d1);
    return d1 * d2 + this.d;
  }
  
  void setMaxValue(double paramDouble) {
    this.e = paramDouble;
    b();
  }
  
  void setMinValue(double paramDouble) {
    this.d = paramDouble;
    b();
  }
  
  void setStep(double paramDouble) {
    this.g = paramDouble;
    b();
  }
  
  void setValue(double paramDouble) {
    this.f = paramDouble;
    c();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/slider/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */