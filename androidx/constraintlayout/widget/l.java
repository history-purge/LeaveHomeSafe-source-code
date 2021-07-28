package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import b.e.b.k.k;

public abstract class l extends c {
  private boolean j;
  
  private boolean k;
  
  protected void a(AttributeSet paramAttributeSet) {
    super.a(paramAttributeSet);
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.ConstraintLayout_Layout);
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        if (k == k.ConstraintLayout_Layout_android_visibility) {
          this.j = true;
        } else if (k == k.ConstraintLayout_Layout_android_elevation) {
          this.k = true;
        } 
      } 
    } 
  }
  
  public void a(k paramk, int paramInt1, int paramInt2) {}
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.j || this.k) {
      ViewParent viewParent = getParent();
      if (viewParent != null && viewParent instanceof ConstraintLayout) {
        float f;
        ConstraintLayout constraintLayout = (ConstraintLayout)viewParent;
        int j = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
          f = getElevation();
        } else {
          f = 0.0F;
        } 
        for (int i = 0; i < this.d; i++) {
          View view = constraintLayout.a(this.c[i]);
          if (view != null) {
            if (this.j)
              view.setVisibility(j); 
            if (this.k && f > 0.0F && Build.VERSION.SDK_INT >= 21)
              view.setTranslationZ(view.getTranslationZ() + f); 
          } 
        } 
      } 
    } 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    a();
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */