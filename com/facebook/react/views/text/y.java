package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.q;

public class y {
  private boolean a = true;
  
  private float b = Float.NaN;
  
  private float c = Float.NaN;
  
  private float d = Float.NaN;
  
  private float e = Float.NaN;
  
  private float f = Float.NaN;
  
  private c0 g = c0.g;
  
  public y a(y paramy) {
    float f;
    y y1 = new y();
    y1.a = this.a;
    if (!Float.isNaN(paramy.b)) {
      f = paramy.b;
    } else {
      f = this.b;
    } 
    y1.b = f;
    if (!Float.isNaN(paramy.c)) {
      f = paramy.c;
    } else {
      f = this.c;
    } 
    y1.c = f;
    if (!Float.isNaN(paramy.d)) {
      f = paramy.d;
    } else {
      f = this.d;
    } 
    y1.d = f;
    if (!Float.isNaN(paramy.e)) {
      f = paramy.e;
    } else {
      f = this.e;
    } 
    y1.e = f;
    if (!Float.isNaN(paramy.f)) {
      f = paramy.f;
    } else {
      f = this.f;
    } 
    y1.f = f;
    c0 c01 = paramy.g;
    if (c01 == c0.g)
      c01 = this.g; 
    y1.g = c01;
    return y1;
  }
  
  public void a(float paramFloat) {
    this.b = paramFloat;
  }
  
  public void a(c0 paramc0) {
    this.g = paramc0;
  }
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public boolean a() {
    return this.a;
  }
  
  public int b() {
    float f;
    if (!Float.isNaN(this.b)) {
      f = this.b;
    } else {
      f = 14.0F;
    } 
    if (this.a) {
      f = q.a(f, e());
    } else {
      f = q.b(f);
    } 
    return (int)Math.ceil(f);
  }
  
  public void b(float paramFloat) {
    this.f = paramFloat;
  }
  
  public float c() {
    float f;
    if (Float.isNaN(this.d))
      return Float.NaN; 
    if (this.a) {
      f = q.a(this.d, e());
    } else {
      f = q.b(this.d);
    } 
    return f / b();
  }
  
  public void c(float paramFloat) {
    this.d = paramFloat;
  }
  
  public float d() {
    float f;
    boolean bool;
    if (Float.isNaN(this.c))
      return Float.NaN; 
    if (this.a) {
      f = q.a(this.c, e());
    } else {
      f = q.b(this.c);
    } 
    if (!Float.isNaN(this.f) && this.f > f) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      f = this.f; 
    return f;
  }
  
  public void d(float paramFloat) {
    this.c = paramFloat;
  }
  
  public float e() {
    return !Float.isNaN(this.e) ? this.e : 0.0F;
  }
  
  public void e(float paramFloat) {
    if (paramFloat == 0.0F || paramFloat >= 1.0F) {
      this.e = paramFloat;
      return;
    } 
    throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
  }
  
  public float f() {
    return this.b;
  }
  
  public float g() {
    return this.f;
  }
  
  public float h() {
    return this.d;
  }
  
  public float i() {
    return this.c;
  }
  
  public float j() {
    return this.e;
  }
  
  public c0 k() {
    return this.g;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TextAttributes {\n  getAllowFontScaling(): ");
    stringBuilder.append(a());
    stringBuilder.append("\n  getFontSize(): ");
    stringBuilder.append(f());
    stringBuilder.append("\n  getEffectiveFontSize(): ");
    stringBuilder.append(b());
    stringBuilder.append("\n  getHeightOfTallestInlineViewOrImage(): ");
    stringBuilder.append(g());
    stringBuilder.append("\n  getLetterSpacing(): ");
    stringBuilder.append(h());
    stringBuilder.append("\n  getEffectiveLetterSpacing(): ");
    stringBuilder.append(c());
    stringBuilder.append("\n  getLineHeight(): ");
    stringBuilder.append(i());
    stringBuilder.append("\n  getEffectiveLineHeight(): ");
    stringBuilder.append(d());
    stringBuilder.append("\n  getTextTransform(): ");
    stringBuilder.append(k());
    stringBuilder.append("\n  getMaxFontSizeMultiplier(): ");
    stringBuilder.append(j());
    stringBuilder.append("\n  getEffectiveMaxFontSizeMultiplier(): ");
    stringBuilder.append(e());
    stringBuilder.append("\n}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */