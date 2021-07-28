package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
  private final a k = new a(this);
  
  public boolean a(View paramView) {
    return this.k.a(paramView);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    this.k.a(paramCoordinatorLayout, paramView, paramMotionEvent);
    return super.a(paramCoordinatorLayout, paramView, paramMotionEvent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/snackbar/BaseTransientBottomBar$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */