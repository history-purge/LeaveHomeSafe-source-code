package e.d.c.x;

import e.d.a.p.a;
import e.d.c.x.i.d;
import e.d.c.x.i.g;
import e.d.c.x.i.j;
import e.d.c.x.i.m;
import e.d.c.x.i.p;
import e.d.c.x.i.s;
import e.d.c.x.j.a;
import e.d.c.x.j.b;

public class e {
  public static Long b;
  
  public static Long c;
  
  public static Long d;
  
  private a a;
  
  public e(a parama) {
    this.a = parama;
  }
  
  public a a(String paramString, e.d.c.e parame) {
    return (a)(paramString.equals("mdir") ? new b(parame) : (paramString.equals("mdta") ? new a(parame) : (paramString.equals("soun") ? new g(parame) : (paramString.equals("vide") ? new s(parame) : (paramString.equals("tmcd") ? new p(parame) : (paramString.equals("text") ? new m(parame) : (paramString.equals("sbtl") ? new j(parame) : (paramString.equals("musi") ? new d(parame) : this.a))))))));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */