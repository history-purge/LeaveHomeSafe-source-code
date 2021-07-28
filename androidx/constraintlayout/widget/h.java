package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

public class h extends View {
  public h(Context paramContext) {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public void draw(Canvas paramCanvas) {}
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(0, 0);
  }
  
  public void setGuidelineBegin(int paramInt) {
    ConstraintLayout.b b = (ConstraintLayout.b)getLayoutParams();
    b.a = paramInt;
    setLayoutParams((ViewGroup.LayoutParams)b);
  }
  
  public void setGuidelineEnd(int paramInt) {
    ConstraintLayout.b b = (ConstraintLayout.b)getLayoutParams();
    b.b = paramInt;
    setLayoutParams((ViewGroup.LayoutParams)b);
  }
  
  public void setGuidelinePercent(float paramFloat) {
    ConstraintLayout.b b = (ConstraintLayout.b)getLayoutParams();
    b.c = paramFloat;
    setLayoutParams((ViewGroup.LayoutParams)b);
  }
  
  public void setVisibility(int paramInt) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */