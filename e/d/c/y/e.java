package e.d.c.y;

import e.d.a.l.a;
import e.d.c.y.g.e;
import e.d.c.y.h.c;
import e.d.c.y.h.g;
import e.d.c.y.h.j;
import e.d.c.y.h.m;
import e.d.c.y.h.p;

public class e {
  public static Long b;
  
  public static Long c;
  
  public static Long d;
  
  public static String e;
  
  private a a;
  
  public e(a parama) {
    this.a = parama;
  }
  
  public a a(e parame, e.d.c.e parame1) {
    String str = parame.a();
    return (a)(str.equals("soun") ? new j(parame1) : (str.equals("vide") ? new p(parame1) : (str.equals("hint") ? new c(parame1) : (str.equals("text") ? new m(parame1) : (str.equals("meta") ? new g(parame1) : this.a)))));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */