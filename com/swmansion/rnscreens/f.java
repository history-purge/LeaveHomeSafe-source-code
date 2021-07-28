package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

public class f extends Fragment {
  protected b b0;
  
  public f() {
    throw new IllegalStateException("Screen fragments should never be restored");
  }
  
  @SuppressLint({"ValidFragment"})
  public f(b paramb) {
    this.b0 = paramb;
  }
  
  protected static View c(View paramView) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent != null) {
      ViewGroup viewGroup = (ViewGroup)viewParent;
      viewGroup.endViewTransition(paramView);
      viewGroup.removeView(paramView);
    } 
    paramView.setVisibility(0);
    return paramView;
  }
  
  private void y0() {
    ((UIManagerModule)((ReactContext)this.b0.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new c(this.b0.getId()));
  }
  
  public void Z() {
    super.Z();
    d d = this.b0.getContainer();
    if (d == null || !d.a(this))
      ((UIManagerModule)((ReactContext)this.b0.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new e(this.b0.getId())); 
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    FrameLayout frameLayout = new FrameLayout(o());
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.b0.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    b b1 = this.b0;
    c((View)b1);
    frameLayout.addView((View)b1);
    return (View)frameLayout;
  }
  
  public b w0() {
    return this.b0;
  }
  
  public void x0() {
    y0();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */