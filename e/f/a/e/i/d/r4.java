package e.f.a.e.i.d;

public class r4<M extends r4<M>> extends w4 {
  protected t4 d;
  
  public void a(p4 paramp4) {
    if (this.d == null)
      return; 
    for (int i = 0; i < this.d.b(); i++)
      this.d.a(i).a(paramp4); 
  }
  
  protected int b() {
    if (this.d != null)
      for (int i = 0; i < this.d.b(); i++)
        this.d.a(i).a();  
    return 0;
  }
  
  public M d() {
    r4 r41 = (r4)super.c();
    v4.a(this, r41);
    return (M)r41;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/r4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */