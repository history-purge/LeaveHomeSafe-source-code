package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class c extends MetricAffectingSpan implements l {
  private final AssetManager c;
  
  private final int d;
  
  private final int e;
  
  private final String f;
  
  private final String g;
  
  public c(int paramInt1, int paramInt2, String paramString1, String paramString2, AssetManager paramAssetManager) {
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramString1;
    this.g = paramString2;
    this.c = paramAssetManager;
  }
  
  private static void a(Paint paramPaint, int paramInt1, int paramInt2, String paramString1, String paramString2, AssetManager paramAssetManager) {
    Typeface typeface = t.a(paramPaint.getTypeface(), paramInt1, paramInt2, paramString2, paramAssetManager);
    if (Build.VERSION.SDK_INT >= 21)
      paramPaint.setFontFeatureSettings(paramString1); 
    paramPaint.setTypeface(typeface);
    paramPaint.setSubpixelText(true);
  }
  
  public void updateDrawState(TextPaint paramTextPaint) {
    a((Paint)paramTextPaint, this.d, this.e, this.f, this.g, this.c);
  }
  
  public void updateMeasureState(TextPaint paramTextPaint) {
    a((Paint)paramTextPaint, this.d, this.e, this.f, this.g, this.c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */