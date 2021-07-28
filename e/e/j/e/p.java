package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import e.e.l.p.b;

public class p extends o {
  public p(NinePatchDrawable paramNinePatchDrawable) {
    super((Drawable)paramNinePatchDrawable);
  }
  
  public void draw(Canvas paramCanvas) {
    if (b.c())
      b.a("RoundedNinePatchDrawable#draw"); 
    if (!b()) {
      super.draw(paramCanvas);
      if (b.c())
        b.a(); 
      return;
    } 
    d();
    c();
    paramCanvas.clipPath(this.g);
    super.draw(paramCanvas);
    if (b.c())
      b.a(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */