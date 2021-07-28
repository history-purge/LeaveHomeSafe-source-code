package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import b.e.b.k.e;

public class i extends View {
  private int c;
  
  private View d;
  
  private int e;
  
  public void a(ConstraintLayout paramConstraintLayout) {
    if (this.d == null)
      return; 
    ConstraintLayout.b b1 = (ConstraintLayout.b)getLayoutParams();
    ConstraintLayout.b b2 = (ConstraintLayout.b)this.d.getLayoutParams();
    b2.m0.o(0);
    if (b1.m0.m() != e.b.c)
      b1.m0.p(b2.m0.z()); 
    if (b1.m0.w() != e.b.c)
      b1.m0.h(b2.m0.j()); 
    b2.m0.o(8);
  }
  
  public void b(ConstraintLayout paramConstraintLayout) {
    if (this.c == -1 && !isInEditMode())
      setVisibility(this.e); 
    this.d = paramConstraintLayout.findViewById(this.c);
    View view = this.d;
    if (view != null) {
      ((ConstraintLayout.b)view.getLayoutParams()).a0 = true;
      this.d.setVisibility(0);
      setVisibility(0);
    } 
  }
  
  public View getContent() {
    return this.d;
  }
  
  public int getEmptyVisibility() {
    return this.e;
  }
  
  public void onDraw(Canvas paramCanvas) {
    if (isInEditMode()) {
      paramCanvas.drawRGB(223, 223, 223);
      Paint paint = new Paint();
      paint.setARGB(255, 210, 210, 210);
      paint.setTextAlign(Paint.Align.CENTER);
      paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect rect = new Rect();
      paramCanvas.getClipBounds(rect);
      paint.setTextSize(rect.height());
      int j = rect.height();
      int k = rect.width();
      paint.setTextAlign(Paint.Align.LEFT);
      paint.getTextBounds("?", 0, 1, rect);
      paramCanvas.drawText("?", k / 2.0F - rect.width() / 2.0F - rect.left, j / 2.0F + rect.height() / 2.0F - rect.bottom, paint);
    } 
  }
  
  public void setContentId(int paramInt) {
    if (this.c == paramInt)
      return; 
    View view = this.d;
    if (view != null) {
      view.setVisibility(0);
      ((ConstraintLayout.b)this.d.getLayoutParams()).a0 = false;
      this.d = null;
    } 
    this.c = paramInt;
    if (paramInt != -1) {
      view = ((View)getParent()).findViewById(paramInt);
      if (view != null)
        view.setVisibility(8); 
    } 
  }
  
  public void setEmptyVisibility(int paramInt) {
    this.e = paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */