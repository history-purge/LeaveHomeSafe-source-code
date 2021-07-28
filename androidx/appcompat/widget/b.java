package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class b extends Drawable {
  final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer) {
    this.a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.j) {
      drawable = actionBarContainer.i;
      if (drawable != null) {
        drawable.draw(paramCanvas);
        return;
      } 
    } else {
      drawable = ((ActionBarContainer)drawable).g;
      if (drawable != null)
        drawable.draw(paramCanvas); 
      ActionBarContainer actionBarContainer1 = this.a;
      Drawable drawable1 = actionBarContainer1.h;
      if (drawable1 != null && actionBarContainer1.k)
        drawable1.draw(paramCanvas); 
    } 
  }
  
  public int getOpacity() {
    return 0;
  }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.j) {
      drawable = actionBarContainer.i;
      if (drawable != null) {
        drawable.getOutline(paramOutline);
        return;
      } 
    } else {
      drawable = ((ActionBarContainer)drawable).g;
      if (drawable != null) {
        drawable.getOutline(paramOutline);
        return;
      } 
    } 
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */