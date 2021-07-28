package b.c.a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

public class a extends FrameLayout {
  private static final f g;
  
  private boolean c;
  
  private boolean d;
  
  final Rect e;
  
  private final e f;
  
  static {
    d d;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      c c = new c();
    } else if (i >= 17) {
      d = new b();
    } else {
      d = new d();
    } 
    g = d;
    g.a();
  }
  
  public ColorStateList getCardBackgroundColor() {
    return g.b(this.f);
  }
  
  public float getCardElevation() {
    return g.c(this.f);
  }
  
  public int getContentPaddingBottom() {
    return this.e.bottom;
  }
  
  public int getContentPaddingLeft() {
    return this.e.left;
  }
  
  public int getContentPaddingRight() {
    return this.e.right;
  }
  
  public int getContentPaddingTop() {
    return this.e.top;
  }
  
  public float getMaxCardElevation() {
    return g.a(this.f);
  }
  
  public boolean getPreventCornerOverlap() {
    return this.d;
  }
  
  public float getRadius() {
    return g.d(this.f);
  }
  
  public boolean getUseCompatPadding() {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int j = paramInt1;
    int i = paramInt2;
    if (!(g instanceof c)) {
      i = View.MeasureSpec.getMode(paramInt1);
      if (i == Integer.MIN_VALUE || i == 1073741824)
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(g.f(this.f)), View.MeasureSpec.getSize(paramInt1)), i); 
      i = View.MeasureSpec.getMode(paramInt2);
      if (i != Integer.MIN_VALUE && i != 1073741824) {
        j = paramInt1;
        i = paramInt2;
      } else {
        i = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(g.e(this.f)), View.MeasureSpec.getSize(paramInt2)), i);
        j = paramInt1;
      } 
    } 
    super.onMeasure(j, i);
  }
  
  public void setCardBackgroundColor(int paramInt) {
    g.a(this.f, ColorStateList.valueOf(paramInt));
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    g.a(this.f, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat) {
    g.b(this.f, paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat) {
    g.c(this.f, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt) {
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt) {
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    if (paramBoolean != this.d) {
      this.d = paramBoolean;
      g.h(this.f);
    } 
  }
  
  public void setRadius(float paramFloat) {
    g.a(this.f, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.c != paramBoolean) {
      this.c = paramBoolean;
      g.g(this.f);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */