package com.google.android.material.appbar;

import android.view.View;
import b.g.m.v;

class d {
  private final View a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private boolean f = true;
  
  private boolean g = true;
  
  public d(View paramView) {
    this.a = paramView;
  }
  
  void a() {
    View view = this.a;
    v.e(view, this.d - view.getTop() - this.b);
    view = this.a;
    v.d(view, this.e - view.getLeft() - this.c);
  }
  
  public boolean a(int paramInt) {
    if (this.g && this.e != paramInt) {
      this.e = paramInt;
      a();
      return true;
    } 
    return false;
  }
  
  public int b() {
    return this.d;
  }
  
  public boolean b(int paramInt) {
    if (this.f && this.d != paramInt) {
      this.d = paramInt;
      a();
      return true;
    } 
    return false;
  }
  
  void c() {
    this.b = this.a.getTop();
    this.c = this.a.getLeft();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */