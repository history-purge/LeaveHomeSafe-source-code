package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

@TargetApi(21)
public class a extends MetricAffectingSpan implements l {
  private final float c;
  
  public a(float paramFloat) {
    this.c = paramFloat;
  }
  
  private void a(TextPaint paramTextPaint) {
    if (!Float.isNaN(this.c))
      paramTextPaint.setLetterSpacing(this.c); 
  }
  
  public void updateDrawState(TextPaint paramTextPaint) {
    a(paramTextPaint);
  }
  
  public void updateMeasureState(TextPaint paramTextPaint) {
    a(paramTextPaint);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */