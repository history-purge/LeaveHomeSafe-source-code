package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class a {
  private f.b a;
  
  public a(SwipeDismissBehavior<?> paramSwipeDismissBehavior) {
    paramSwipeDismissBehavior.b(0.1F);
    paramSwipeDismissBehavior.a(0.6F);
    paramSwipeDismissBehavior.a(0);
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1 && i != 3)
        return; 
      f.a().b(this.a);
      return;
    } 
    if (paramCoordinatorLayout.a(paramView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      f.a().a(this.a); 
  }
  
  public boolean a(View paramView) {
    return paramView instanceof d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/snackbar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */