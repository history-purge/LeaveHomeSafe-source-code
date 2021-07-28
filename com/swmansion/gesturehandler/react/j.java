package com.swmansion.gesturehandler.react;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.x;
import com.facebook.react.views.view.f;
import e.h.a.l;
import e.h.a.p;

public class j implements p {
  public View a(ViewGroup paramViewGroup, int paramInt) {
    return (paramViewGroup instanceof f) ? paramViewGroup.getChildAt(((f)paramViewGroup).a(paramInt)) : paramViewGroup.getChildAt(paramInt);
  }
  
  public l a(View paramView) {
    r r;
    if (paramView instanceof x) {
      r = ((x)paramView).getPointerEvents();
    } else {
      r = r.f;
    } 
    if (!paramView.isEnabled()) {
      if (r == r.f)
        return l.d; 
      if (r == r.e)
        return l.c; 
    } 
    int i = a.a[r.ordinal()];
    return (i != 1) ? ((i != 2) ? ((i != 3) ? l.f : l.c) : l.d) : l.e;
  }
  
  public boolean a(ViewGroup paramViewGroup) {
    return (Build.VERSION.SDK_INT >= 18 && !paramViewGroup.getClipChildren()) ? ((paramViewGroup instanceof f) ? "hidden".equals(((f)paramViewGroup).getOverflow()) : false) : true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */