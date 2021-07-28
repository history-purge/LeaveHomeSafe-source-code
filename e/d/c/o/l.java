package e.d.c.o;

public class l extends a<m> {
  public l(m paramm) {
    super(paramm);
  }
  
  public String c(int paramInt) {
    return (paramInt != 513) ? ((paramInt != 514) ? super.c(paramInt) : s0()) : t0();
  }
  
  public String s0() {
    String str = ((m)this.a).p(514);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" bytes");
    return stringBuilder.toString();
  }
  
  public String t0() {
    String str = ((m)this.a).p(513);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" bytes");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */