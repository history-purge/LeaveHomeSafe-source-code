package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;

public class q {
  private final Spannable a;
  
  private final int b;
  
  private final boolean c;
  
  private final float d;
  
  private final float e;
  
  private final float f;
  
  private final float g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  private final int k;
  
  private final int l;
  
  public ReadableMap m = null;
  
  public q(Spannable paramSpannable, int paramInt1, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2, int paramInt3, int paramInt4) {
    this(paramSpannable, paramInt1, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt2, paramInt3, paramInt4, -1, -1);
  }
  
  public q(Spannable paramSpannable, int paramInt1, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.a = paramSpannable;
    this.b = paramInt1;
    this.c = paramBoolean;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramFloat3;
    this.g = paramFloat4;
    this.h = paramInt2;
    this.i = paramInt3;
    this.j = paramInt5;
    this.k = paramInt6;
    this.l = paramInt4;
  }
  
  public q(Spannable paramSpannable, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4) {
    this(paramSpannable, paramInt1, paramBoolean, -1.0F, -1.0F, -1.0F, -1.0F, paramInt2, paramInt3, paramInt4, -1, -1);
  }
  
  public static q a(Spannable paramSpannable, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, ReadableMap paramReadableMap) {
    q q1 = new q(paramSpannable, paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4);
    q1.m = paramReadableMap;
    return q1;
  }
  
  public boolean a() {
    return this.c;
  }
  
  public int b() {
    return this.b;
  }
  
  public int c() {
    return this.l;
  }
  
  public float d() {
    return this.g;
  }
  
  public float e() {
    return this.d;
  }
  
  public float f() {
    return this.f;
  }
  
  public float g() {
    return this.e;
  }
  
  public int h() {
    return this.k;
  }
  
  public int i() {
    return this.j;
  }
  
  public Spannable j() {
    return this.a;
  }
  
  public int k() {
    return this.h;
  }
  
  public int l() {
    return this.i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */