package e.f.a.c.i;

import android.util.Base64;
import e.f.a.c.d;

public abstract class n {
  public static a d() {
    d.b b = new d.b();
    b.a(d.c);
    return b;
  }
  
  public n a(d paramd) {
    a a = d();
    a.a(a());
    a.a(paramd);
    a.a(b());
    return a.a();
  }
  
  public abstract String a();
  
  public abstract byte[] b();
  
  public abstract d c();
  
  public final String toString() {
    String str1;
    String str2 = a();
    d d = c();
    if (b() == null) {
      str1 = "";
    } else {
      str1 = Base64.encodeToString(b(), 2);
    } 
    return String.format("TransportContext(%s, %s, %s)", new Object[] { str2, d, str1 });
  }
  
  public static abstract class a {
    public abstract a a(d param1d);
    
    public abstract a a(String param1String);
    
    public abstract a a(byte[] param1ArrayOfbyte);
    
    public abstract n a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */