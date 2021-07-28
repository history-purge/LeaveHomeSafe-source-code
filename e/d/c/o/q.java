package e.d.c.o;

import e.d.b.m;
import e.d.c.j;

public class q extends j<r> {
  public q(r paramr) {
    super(paramr);
  }
  
  public String a() {
    Integer integer = ((r)this.a).k(7);
    if (integer == null)
      return null; 
    int i = integer.intValue() & 0xF;
    if (i != 0) {
      if (i != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
      return "On";
    } 
    return "Off";
  }
  
  public String b() {
    Integer integer = ((r)this.a).k(2);
    return (integer == null) ? null : (new m(integer.intValue(), 32678L)).toString();
  }
  
  public String c() {
    Integer integer = ((r)this.a).k(4);
    return (integer == null) ? null : (new m(integer.intValue(), 32678L)).toString();
  }
  
  public String c(int paramInt) {
    return (paramInt != 2) ? ((paramInt != 11) ? ((paramInt != 4) ? ((paramInt != 5) ? ((paramInt != 7) ? ((paramInt != 8) ? ((paramInt != 9) ? super.c(paramInt) : e()) : d()) : a()) : g()) : c()) : f()) : b();
  }
  
  public String d() {
    Integer integer = ((r)this.a).k(8);
    return (integer == null) ? null : (new m(integer.intValue(), 32678L)).toString();
  }
  
  public String e() {
    Integer integer = ((r)this.a).k(9);
    return (integer == null) ? null : (new m(integer.intValue(), 32678L)).toString();
  }
  
  public String f() {
    Integer integer = ((r)this.a).k(11);
    return (integer == null) ? null : (new m(integer.intValue(), 32678L)).toString();
  }
  
  public String g() {
    Integer integer = ((r)this.a).k(5);
    return (integer == null) ? null : Integer.toString(1 / (integer.intValue() / 32768 + 1));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */