package e.d.c.o.a0;

import e.d.c.j;

public class o extends j<p> {
  public o(p paramp) {
    super(paramp);
  }
  
  private String a() {
    return i(787);
  }
  
  private String b() {
    return a(800, "%d C");
  }
  
  private String c() {
    return i(785);
  }
  
  private String d() {
    return i(786);
  }
  
  private String e() {
    return a(768, 1, new String[] { "Fine", "Basic" });
  }
  
  private String f() {
    return a(768, 1, new String[] { "User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)" });
  }
  
  private String g() {
    return a(772, new String[] { "Auto or Manual", "Daylight", "Fluorescent", "Tungsten", "Flash", "Cloudy", "Shadow" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 768) {
      if (paramInt != 770) {
        if (paramInt != 772) {
          if (paramInt != 800) {
            switch (paramInt) {
              default:
                switch (paramInt) {
                  default:
                    return super.c(paramInt);
                  case 802:
                  case 803:
                  case 804:
                    break;
                } 
                return i(paramInt);
              case 787:
                return a();
              case 786:
                return d();
              case 785:
                break;
            } 
            return c();
          } 
          return b();
        } 
        return g();
      } 
      return f();
    } 
    return e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */