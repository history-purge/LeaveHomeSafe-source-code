package com.google.firebase.installations;

import com.google.firebase.installations.r.d;
import e.f.a.e.m.m;

class l implements o {
  final m<String> a;
  
  public l(m<String> paramm) {
    this.a = paramm;
  }
  
  public boolean a(d paramd) {
    if (paramd.k() || paramd.j() || paramd.h()) {
      this.a.b(paramd.c());
      return true;
    } 
    return false;
  }
  
  public boolean a(Exception paramException) {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */