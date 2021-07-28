package e.d.a.s;

public class a {
  public static final a c = new a("BYTE", 1, 1);
  
  public static final a d = new a("STRING", 2, 1);
  
  public static final a e = new a("USHORT", 3, 2);
  
  public static final a f = new a("ULONG", 4, 4);
  
  public static final a g = new a("URATIONAL", 5, 8);
  
  public static final a h = new a("SBYTE", 6, 1);
  
  public static final a i = new a("UNDEFINED", 7, 1);
  
  public static final a j = new a("SSHORT", 8, 2);
  
  public static final a k = new a("SLONG", 9, 4);
  
  public static final a l = new a("SRATIONAL", 10, 8);
  
  public static final a m = new a("SINGLE", 11, 4);
  
  public static final a n = new a("DOUBLE", 12, 8);
  
  private final String a;
  
  private final int b;
  
  private a(String paramString, int paramInt1, int paramInt2) {
    this.a = paramString;
    this.b = paramInt2;
  }
  
  public static a a(int paramInt) {
    switch (paramInt) {
      default:
        return null;
      case 12:
        return n;
      case 11:
        return m;
      case 10:
        return l;
      case 9:
        return k;
      case 8:
        return j;
      case 7:
        return i;
      case 6:
        return h;
      case 5:
        return g;
      case 4:
        return f;
      case 3:
        return e;
      case 2:
        return d;
      case 1:
        break;
    } 
    return c;
  }
  
  public int a() {
    return this.b;
  }
  
  public String toString() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */