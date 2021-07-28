package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.f;

public class j extends f {
  private int u;
  
  private int v;
  
  private a w = a.e;
  
  public j(ReactContext paramReactContext) {
    super((Context)paramReactContext);
  }
  
  public a getType() {
    return this.w;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824 && View.MeasureSpec.getMode(paramInt2) == 1073741824) {
      this.u = View.MeasureSpec.getSize(paramInt1);
      this.v = View.MeasureSpec.getSize(paramInt2);
      ViewParent viewParent = getParent();
      if (viewParent != null) {
        forceLayout();
        ((View)viewParent).requestLayout();
      } 
    } 
    setMeasuredDimension(this.u, this.v);
  }
  
  public void setType(a parama) {
    this.w = parama;
  }
  
  public enum a {
    c, d, e, f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */