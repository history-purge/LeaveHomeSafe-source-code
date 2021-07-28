package b.e.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f implements d {
  public d a = null;
  
  public boolean b = false;
  
  public boolean c = false;
  
  m d;
  
  a e = a.c;
  
  int f;
  
  public int g;
  
  int h = 1;
  
  g i = null;
  
  public boolean j = false;
  
  List<d> k = new ArrayList<d>();
  
  List<f> l = new ArrayList<f>();
  
  public f(m paramm) {
    this.d = paramm;
  }
  
  public void a() {
    this.l.clear();
    this.k.clear();
    this.j = false;
    this.g = 0;
    this.c = false;
    this.b = false;
  }
  
  public void a(int paramInt) {
    if (this.j)
      return; 
    this.j = true;
    this.g = paramInt;
    for (d d1 : this.k)
      d1.a(d1); 
  }
  
  public void a(d paramd) {
    Iterator<f> iterator = this.l.iterator();
    while (iterator.hasNext()) {
      if (!((f)iterator.next()).j)
        return; 
    } 
    this.c = true;
    d d1 = this.a;
    if (d1 != null)
      d1.a(this); 
    if (this.b) {
      this.d.a(this);
      return;
    } 
    d1 = null;
    int i = 0;
    for (f f1 : this.l) {
      if (f1 instanceof g)
        continue; 
      i++;
      d1 = f1;
    } 
    if (d1 != null && i == 1 && ((f)d1).j) {
      g g1 = this.i;
      if (g1 != null)
        if (g1.j) {
          this.f = this.h * g1.g;
        } else {
          return;
        }  
      a(((f)d1).g + this.f);
    } 
    d1 = this.a;
    if (d1 != null)
      d1.a(this); 
  }
  
  public void b(d paramd) {
    this.k.add(paramd);
    if (this.j)
      paramd.a(paramd); 
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.b.g());
    stringBuilder.append(":");
    stringBuilder.append(this.e);
    stringBuilder.append("(");
    if (this.j) {
      Integer integer = Integer.valueOf(this.g);
    } else {
      str = "unresolved";
    } 
    stringBuilder.append(str);
    stringBuilder.append(") <t=");
    stringBuilder.append(this.l.size());
    stringBuilder.append(":d=");
    stringBuilder.append(this.k.size());
    stringBuilder.append(">");
    return stringBuilder.toString();
  }
  
  enum a {
    c, d, e, f, g, h, i, j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */