package b.e.b.k;

import b.e.b.c;
import java.util.ArrayList;

public class l extends e {
  public ArrayList<e> g0 = new ArrayList<e>();
  
  public void G() {
    this.g0.clear();
    super.G();
  }
  
  public void H() {
    ArrayList<e> arrayList = this.g0;
    if (arrayList == null)
      return; 
    int j = arrayList.size();
    for (int i = 0; i < j; i++) {
      e e1 = this.g0.get(i);
      if (e1 instanceof l)
        ((l)e1).H(); 
    } 
  }
  
  public void I() {
    this.g0.clear();
  }
  
  public void a(c paramc) {
    super.a(paramc);
    int j = this.g0.size();
    for (int i = 0; i < j; i++)
      ((e)this.g0.get(i)).a(paramc); 
  }
  
  public void a(e parame) {
    this.g0.add(parame);
    if (parame.s() != null)
      ((l)parame.s()).c(parame); 
    parame.b(this);
  }
  
  public void c(e parame) {
    this.g0.remove(parame);
    parame.b((e)null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */