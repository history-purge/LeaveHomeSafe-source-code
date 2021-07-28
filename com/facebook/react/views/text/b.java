package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public class b implements LineHeightSpan, l {
  private final int c;
  
  b(float paramFloat) {
    this.c = (int)Math.ceil(paramFloat);
  }
  
  public void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt) {
    paramInt2 = paramFontMetricsInt.descent;
    paramInt1 = this.c;
    if (paramInt2 > paramInt1) {
      paramInt1 = Math.min(paramInt1, paramInt2);
      paramFontMetricsInt.descent = paramInt1;
      paramFontMetricsInt.bottom = paramInt1;
      paramFontMetricsInt.ascent = 0;
      paramFontMetricsInt.top = 0;
      return;
    } 
    paramInt3 = paramFontMetricsInt.ascent;
    if (-paramInt3 + paramInt2 > paramInt1) {
      paramFontMetricsInt.bottom = paramInt2;
      paramInt1 = -paramInt1 + paramInt2;
      paramFontMetricsInt.ascent = paramInt1;
      paramFontMetricsInt.top = paramInt1;
      return;
    } 
    paramInt4 = -paramInt3;
    paramInt2 = paramFontMetricsInt.bottom;
    if (paramInt4 + paramInt2 > paramInt1) {
      paramFontMetricsInt.top = paramInt3;
      paramFontMetricsInt.bottom = paramInt3 + paramInt1;
      return;
    } 
    paramInt3 = paramFontMetricsInt.top;
    if (-paramInt3 + paramInt2 > paramInt1) {
      paramFontMetricsInt.top = paramInt2 - paramInt1;
      return;
    } 
    paramInt4 = -paramInt3;
    double d2 = paramInt3;
    double d1 = ((paramInt1 - paramInt4 + paramInt2) / 2.0F);
    double d3 = Math.ceil(d1);
    Double.isNaN(d2);
    paramFontMetricsInt.top = (int)(d2 - d3);
    d2 = paramFontMetricsInt.bottom;
    d1 = Math.floor(d1);
    Double.isNaN(d2);
    paramFontMetricsInt.bottom = (int)(d2 + d1);
    paramFontMetricsInt.ascent = paramFontMetricsInt.top;
    paramFontMetricsInt.descent = paramFontMetricsInt.bottom;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */