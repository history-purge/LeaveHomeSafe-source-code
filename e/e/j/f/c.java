package e.e.j.f;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import e.e.j.e.h;
import e.e.j.e.u;
import e.e.j.e.v;

public class c extends h implements u {
  Drawable f = null;
  
  private v g;
  
  public c(Drawable paramDrawable) {
    super(paramDrawable);
  }
  
  public void a(v paramv) {
    this.g = paramv;
  }
  
  public void d(Drawable paramDrawable) {
    this.f = paramDrawable;
    invalidateSelf();
  }
  
  @SuppressLint({"WrongCall"})
  public void draw(Canvas paramCanvas) {
    if (!isVisible())
      return; 
    v v1 = this.g;
    if (v1 != null)
      v1.a(); 
    super.draw(paramCanvas);
    Drawable drawable = this.f;
    if (drawable != null) {
      drawable.setBounds(getBounds());
      this.f.draw(paramCanvas);
    } 
  }
  
  public int getIntrinsicHeight() {
    return -1;
  }
  
  public int getIntrinsicWidth() {
    return -1;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    v v1 = this.g;
    if (v1 != null)
      v1.a(paramBoolean1); 
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */