package com.google.firebase.installations.r;

public abstract class d {
  static {
    p().a();
  }
  
  public static a p() {
    a.b b = new a.b();
    b.b(0L);
    b.a(c.a.c);
    b.a(0L);
    return b;
  }
  
  public d a(String paramString) {
    a a = m();
    a.c(paramString);
    a.a(c.a.g);
    return a.a();
  }
  
  public d a(String paramString, long paramLong1, long paramLong2) {
    a a = m();
    a.a(paramString);
    a.a(paramLong1);
    a.b(paramLong2);
    return a.a();
  }
  
  public d a(String paramString1, String paramString2, long paramLong1, String paramString3, long paramLong2) {
    a a = m();
    a.b(paramString1);
    a.a(c.a.f);
    a.a(paramString3);
    a.d(paramString2);
    a.a(paramLong2);
    a.b(paramLong1);
    return a.a();
  }
  
  public abstract String a();
  
  public abstract long b();
  
  public d b(String paramString) {
    a a = m();
    a.b(paramString);
    a.a(c.a.e);
    return a.a();
  }
  
  public abstract String c();
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract c.a f();
  
  public abstract long g();
  
  public boolean h() {
    return (f() == c.a.g);
  }
  
  public boolean i() {
    return (f() == c.a.d || f() == c.a.c);
  }
  
  public boolean j() {
    return (f() == c.a.f);
  }
  
  public boolean k() {
    return (f() == c.a.e);
  }
  
  public boolean l() {
    return (f() == c.a.c);
  }
  
  public abstract a m();
  
  public d n() {
    a a = m();
    a.a((String)null);
    return a.a();
  }
  
  public d o() {
    a a = m();
    a.a(c.a.d);
    return a.a();
  }
  
  public static abstract class a {
    public abstract a a(long param1Long);
    
    public abstract a a(c.a param1a);
    
    public abstract a a(String param1String);
    
    public abstract d a();
    
    public abstract a b(long param1Long);
    
    public abstract a b(String param1String);
    
    public abstract a c(String param1String);
    
    public abstract a d(String param1String);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/r/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */