package e.e.j.a.a;

import android.content.res.Resources;
import e.e.c.a.d;
import e.e.e.d.e;
import e.e.e.d.l;
import e.e.j.b.a;
import e.e.l.d.p;
import e.e.l.j.a;
import e.e.l.k.b;
import java.util.concurrent.Executor;

public class g {
  private Resources a;
  
  private a b;
  
  private a c;
  
  private Executor d;
  
  private p<d, b> e;
  
  private e<a> f;
  
  private l<Boolean> g;
  
  public d a() {
    d d = a(this.a, this.b, this.c, this.d, this.e, this.f);
    l<Boolean> l1 = this.g;
    if (l1 != null)
      d.b(((Boolean)l1.get()).booleanValue()); 
    return d;
  }
  
  protected d a(Resources paramResources, a parama, a parama1, Executor paramExecutor, p<d, b> paramp, e<a> parame) {
    return new d(paramResources, parama, parama1, paramExecutor, paramp, parame);
  }
  
  public void a(Resources paramResources, a parama, a parama1, Executor paramExecutor, p<d, b> paramp, e<a> parame, l<Boolean> paraml) {
    this.a = paramResources;
    this.b = parama;
    this.c = parama1;
    this.d = paramExecutor;
    this.e = paramp;
    this.f = parame;
    this.g = paraml;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */