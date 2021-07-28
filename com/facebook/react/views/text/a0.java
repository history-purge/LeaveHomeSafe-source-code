package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public class a0 extends ReplacementSpan implements l {
  private int c;
  
  private int d;
  
  private int e;
  
  public a0(int paramInt1, int paramInt2, int paramInt3) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  public int a() {
    return this.e;
  }
  
  public int b() {
    return this.c;
  }
  
  public int c() {
    return this.d;
  }
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint) {}
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt) {
    if (paramFontMetricsInt != null) {
      paramFontMetricsInt.ascent = -this.e;
      paramFontMetricsInt.descent = 0;
      paramFontMetricsInt.top = paramFontMetricsInt.ascent;
      paramFontMetricsInt.bottom = 0;
    } 
    return this.d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */