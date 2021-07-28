package com.google.firebase.installations;

import com.google.firebase.installations.r.d;
import e.f.a.e.m.m;

class k implements o {
  private final p a;
  
  private final m<m> b;
  
  public k(p paramp, m<m> paramm) {
    this.a = paramp;
    this.b = paramm;
  }
  
  public boolean a(d paramd) {
    if (paramd.j() && !this.a.a(paramd)) {
      m<m> m1 = this.b;
      m.a a = m.d();
      a.a(paramd.a());
      a.b(paramd.b());
      a.a(paramd.g());
      m1.a(a.a());
      return true;
    } 
    return false;
  }
  
  public boolean a(Exception paramException) {
    this.b.b(paramException);
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */