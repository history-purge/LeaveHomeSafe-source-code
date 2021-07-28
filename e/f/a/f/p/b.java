package e.f.a.f.p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class b extends FrameLayout implements d {
  private final c c;
  
  public void a() {
    this.c.b();
    throw null;
  }
  
  public void b() {
    this.c.a();
    throw null;
  }
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {
    c c1 = this.c;
    if (c1 == null) {
      super.draw(paramCanvas);
      return;
    } 
    c1.a(paramCanvas);
    throw null;
  }
  
  public Drawable getCircularRevealOverlayDrawable() {
    this.c.c();
    throw null;
  }
  
  public int getCircularRevealScrimColor() {
    this.c.d();
    throw null;
  }
  
  public d.e getRevealInfo() {
    this.c.e();
    throw null;
  }
  
  public boolean isOpaque() {
    c c1 = this.c;
    if (c1 == null)
      return super.isOpaque(); 
    c1.f();
    throw null;
  }
  
  public void setCircularRevealOverlayDrawable(Drawable paramDrawable) {
    this.c.a(paramDrawable);
    throw null;
  }
  
  public void setCircularRevealScrimColor(int paramInt) {
    this.c.a(paramInt);
    throw null;
  }
  
  public void setRevealInfo(d.e parame) {
    this.c.a(parame);
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */