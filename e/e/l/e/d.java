package e.e.l.e;

public enum d {
  c, d, e;
  
  public static d a(d paramd1, d paramd2) {
    return (paramd1 == null) ? paramd2 : ((paramd2 == null) ? paramd1 : ((paramd1.ordinal() > paramd2.ordinal()) ? paramd1 : paramd2));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */