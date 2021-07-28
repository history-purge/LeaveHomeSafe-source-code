package e.e.j.a.a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e.e.j.e.j;
import e.e.l.j.a;
import e.e.l.k.b;
import e.e.l.k.c;
import e.e.l.p.b;

public class a implements a {
  private final Resources a;
  
  private final a b;
  
  public a(Resources paramResources, a parama) {
    this.a = paramResources;
    this.b = parama;
  }
  
  private static boolean a(c paramc) {
    return (paramc.t() != 1 && paramc.t() != 0);
  }
  
  private static boolean b(c paramc) {
    return (paramc.u() != 0 && paramc.u() != -1);
  }
  
  public boolean a(b paramb) {
    return true;
  }
  
  public Drawable b(b paramb) {
    try {
      j j;
      if (b.c())
        b.a("DefaultDrawableFactory#createDrawable"); 
      if (paramb instanceof c) {
        c c = (c)paramb;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, c.r());
        if (!b(c)) {
          boolean bool = a(c);
          if (!bool)
            return (Drawable)bitmapDrawable; 
        } 
        j = new j((Drawable)bitmapDrawable, c.u(), c.t());
        return (Drawable)j;
      } 
      if (this.b != null && this.b.a((b)j))
        return this.b.b((b)j); 
      return null;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */