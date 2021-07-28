package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public class w extends CharacterStyle implements l {
  private final float c;
  
  private final float d;
  
  private final float e;
  
  private final int f;
  
  public w(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = paramInt;
  }
  
  public void updateDrawState(TextPaint paramTextPaint) {
    paramTextPaint.setShadowLayer(this.e, this.c, this.d, this.f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */