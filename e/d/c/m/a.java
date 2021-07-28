package e.d.c.m;

import e.d.c.j;
import java.text.DecimalFormat;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public static String a(long paramLong) {
    double d = paramLong;
    Double.isNaN(d);
    d /= 65536.0D;
    return (new DecimalFormat("0.###")).format(Double.valueOf(d));
  }
  
  public static String a(long paramLong, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("0x%0");
    stringBuilder.append(paramInt);
    stringBuilder.append("X");
    return String.format(stringBuilder.toString(), new Object[] { Long.valueOf(paramLong) });
  }
  
  public static String a(Long paramLong) {
    return (paramLong == null) ? null : a(paramLong.longValue());
  }
  
  public static String a(Long paramLong, int paramInt) {
    return (paramLong == null) ? null : a(paramLong.longValue(), paramInt);
  }
  
  public String a() {
    b.b b = ((b)this.a).f();
    return (b == null) ? null : b.toString();
  }
  
  public String b() {
    b.c c = ((b)this.a).g();
    return (c == null) ? null : c.toString();
  }
  
  public String c() {
    b.d d = ((b)this.a).h();
    return (d == null) ? null : d.toString();
  }
  
  public String c(int paramInt) {
    if (paramInt != -2) {
      if (paramInt != 5) {
        switch (paramInt) {
          default:
            return super.c(paramInt);
          case 20:
            return f();
          case 17:
          case 18:
          case 19:
            return a(((b)this.a).l(paramInt));
          case 16:
            return c();
          case 12:
          case 13:
          case 14:
          case 15:
            return a(((b)this.a).l(paramInt), 8);
          case 11:
            return b();
          case 10:
            break;
        } 
        return e();
      } 
      return d();
    } 
    return a();
  }
  
  public String d() {
    b.e e = ((b)this.a).i();
    if (e != null)
      return e.toString(); 
    Integer integer = ((b)this.a).k(5);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Illegal value 0x");
    stringBuilder.append(Integer.toHexString(integer.intValue()));
    return stringBuilder.toString();
  }
  
  public String e() {
    b.f f = ((b)this.a).j();
    return (f == null) ? null : f.toString();
  }
  
  public String f() {
    b.g g = ((b)this.a).k();
    return (g == null) ? null : g.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */