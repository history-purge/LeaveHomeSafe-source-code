package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

class a extends FrameLayout {
  private Integer c;
  
  private boolean d = true;
  
  private boolean e = true;
  
  private double f;
  
  private ProgressBar g;
  
  public a(Context paramContext) {
    super(paramContext);
  }
  
  private void a(ProgressBar paramProgressBar) {
    Drawable drawable;
    if (paramProgressBar.isIndeterminate()) {
      drawable = paramProgressBar.getIndeterminateDrawable();
    } else {
      drawable = drawable.getProgressDrawable();
    } 
    if (drawable == null)
      return; 
    Integer integer = this.c;
    if (integer != null) {
      drawable.setColorFilter(integer.intValue(), PorterDuff.Mode.SRC_IN);
      return;
    } 
    drawable.clearColorFilter();
  }
  
  public void a() {
    ProgressBar progressBar = this.g;
    if (progressBar != null) {
      byte b;
      progressBar.setIndeterminate(this.d);
      a(this.g);
      this.g.setProgress((int)(this.f * 1000.0D));
      if (this.e) {
        progressBar = this.g;
        b = 0;
      } else {
        progressBar = this.g;
        b = 4;
      } 
      progressBar.setVisibility(b);
      return;
    } 
    throw new JSApplicationIllegalArgumentException("setStyle() not called");
  }
  
  public void a(double paramDouble) {
    this.f = paramDouble;
  }
  
  public void a(Integer paramInteger) {
    this.c = paramInteger;
  }
  
  public void a(String paramString) {
    int i = ReactProgressBarViewManager.getStyleFromString(paramString);
    this.g = ReactProgressBarViewManager.createProgressBar(getContext(), i);
    this.g.setMax(1000);
    removeAllViews();
    addView((View)this.g, new ViewGroup.LayoutParams(-1, -1));
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void b(boolean paramBoolean) {
    this.d = paramBoolean;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/progressbar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */