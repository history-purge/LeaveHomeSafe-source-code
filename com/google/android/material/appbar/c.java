package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class c<V extends View> extends CoordinatorLayout.c<V> {
  private d a;
  
  private int b = 0;
  
  private int c = 0;
  
  public c() {}
  
  public c(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(int paramInt) {
    d d1 = this.a;
    if (d1 != null)
      return d1.b(paramInt); 
    this.b = paramInt;
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    b(paramCoordinatorLayout, paramV, paramInt);
    if (this.a == null)
      this.a = new d((View)paramV); 
    this.a.c();
    this.a.a();
    paramInt = this.b;
    if (paramInt != 0) {
      this.a.b(paramInt);
      this.b = 0;
    } 
    paramInt = this.c;
    if (paramInt != 0) {
      this.a.a(paramInt);
      this.c = 0;
    } 
    return true;
  }
  
  public int b() {
    d d1 = this.a;
    return (d1 != null) ? d1.b() : 0;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    paramCoordinatorLayout.c((View)paramV, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */