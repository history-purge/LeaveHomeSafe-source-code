package com.google.firebase.r;

import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.u;
import java.util.Iterator;
import java.util.Set;

public class d implements i {
  private final String a;
  
  private final e b;
  
  d(Set<g> paramSet, e parame) {
    this.a = a(paramSet);
    this.b = parame;
  }
  
  private static String a(Set<g> paramSet) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<g> iterator = paramSet.iterator();
    while (iterator.hasNext()) {
      g g = iterator.next();
      stringBuilder.append(g.a());
      stringBuilder.append('/');
      stringBuilder.append(g.b());
      if (iterator.hasNext())
        stringBuilder.append(' '); 
    } 
    return stringBuilder.toString();
  }
  
  public static n<i> b() {
    n.b b = n.a(i.class);
    b.a(u.e(g.class));
    b.a(a.a);
    return b.b();
  }
  
  public String a() {
    if (this.b.a().isEmpty())
      return this.a; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append(' ');
    stringBuilder.append(a(this.b.a()));
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/r/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */