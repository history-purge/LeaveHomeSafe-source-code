package net.time4j.e1.a0;

import net.time4j.d1.c;
import net.time4j.d1.d;

final class p implements d {
  private final d a;
  
  private final d b;
  
  p(d paramd1, d paramd2) {
    this.a = paramd1;
    this.b = paramd2;
  }
  
  public <A> A a(c<A> paramc) {
    if (this.a.b(paramc)) {
      d d2 = this.a;
      return (A)d2.a(paramc);
    } 
    d d1 = this.b;
    return (A)d1.a(paramc);
  }
  
  public <A> A a(c<A> paramc, A paramA) {
    return (A)(this.a.b(paramc) ? this.a.a(paramc) : this.b.a(paramc, paramA));
  }
  
  public boolean b(c<?> paramc) {
    return (this.a.b(paramc) || this.b.b(paramc));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */