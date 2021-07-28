package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import b.a.j;

class q extends PopupWindow {
  private static final boolean b;
  
  private boolean a;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
  }
  
  public q(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    x0 x0 = x0.a(paramContext, paramAttributeSet, j.PopupWindow, paramInt1, paramInt2);
    if (x0.g(j.PopupWindow_overlapAnchor))
      a(x0.a(j.PopupWindow_overlapAnchor, false)); 
    setBackgroundDrawable(x0.b(j.PopupWindow_android_popupBackground));
    x0.b();
  }
  
  private void a(boolean paramBoolean) {
    if (b) {
      this.a = paramBoolean;
      return;
    } 
    h.a(this, paramBoolean);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (b) {
      i = paramInt2;
      if (this.a)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2;
    if (b) {
      i = paramInt2;
      if (this.a)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2;
    if (b) {
      i = paramInt2;
      if (this.a)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.update(paramView, paramInt1, i, paramInt3, paramInt4);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */