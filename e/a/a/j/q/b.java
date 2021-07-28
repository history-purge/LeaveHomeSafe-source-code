package e.a.a.j.q;

import java.util.ArrayList;
import java.util.List;

public class b {
  private List a = new ArrayList(5);
  
  public int a() {
    return this.a.size();
  }
  
  public d a(int paramInt) {
    return this.a.get(paramInt);
  }
  
  public void a(d paramd) {
    this.a.add(paramd);
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 1; i < a(); i++) {
      stringBuffer.append(a(i));
      if (i < a() - 1) {
        int j = a(i + 1).b();
        if (j == 1 || j == 2)
          stringBuffer.append('/'); 
      } 
    } 
    return stringBuffer.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/q/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */