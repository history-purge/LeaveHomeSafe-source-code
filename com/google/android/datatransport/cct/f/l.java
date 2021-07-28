package com.google.android.datatransport.cct.f;

public abstract class l {
  public static a a(String paramString) {
    a a = h();
    a.a(paramString);
    return a;
  }
  
  public static a a(byte[] paramArrayOfbyte) {
    a a = h();
    a.a(paramArrayOfbyte);
    return a;
  }
  
  private static a h() {
    return new f.b();
  }
  
  public abstract Integer a();
  
  public abstract long b();
  
  public abstract long c();
  
  public abstract o d();
  
  public abstract byte[] e();
  
  public abstract String f();
  
  public abstract long g();
  
  public static abstract class a {
    public abstract a a(long param1Long);
    
    public abstract a a(o param1o);
    
    public abstract a a(Integer param1Integer);
    
    abstract a a(String param1String);
    
    abstract a a(byte[] param1ArrayOfbyte);
    
    public abstract l a();
    
    public abstract a b(long param1Long);
    
    public abstract a c(long param1Long);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */