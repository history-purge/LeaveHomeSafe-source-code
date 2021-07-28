package com.facebook.react.views.scroll;

import android.content.Context;
import android.widget.HorizontalScrollView;
import com.facebook.react.views.view.f;

public class c extends f {
  private int u;
  
  private int v;
  
  public c(Context paramContext) {}
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.u == 1) {
      setLeft(0);
      setRight(paramInt3 - paramInt1 + 0);
      HorizontalScrollView horizontalScrollView = (HorizontalScrollView)getParent();
      horizontalScrollView.scrollTo(horizontalScrollView.getScrollX() + getWidth() - this.v, horizontalScrollView.getScrollY());
    } 
    this.v = getWidth();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */