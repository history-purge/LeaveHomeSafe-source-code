package e.d.c;

import java.util.HashMap;

public final class c extends b {
  public c() {}
  
  public c(String paramString) {
    a(paramString);
  }
  
  public String a() {
    return "Error";
  }
  
  public void a(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException(String.format("Cannot add value to %s.", new Object[] { c.class.getName() }));
  }
  
  protected HashMap<Integer, String> b() {
    return new HashMap<Integer, String>();
  }
  
  public String t(int paramInt) {
    return "";
  }
  
  public boolean u(int paramInt) {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */