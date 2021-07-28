package e.d.c.x.h;

import e.d.b.o;
import e.d.c.x.i.i;
import java.util.ArrayList;

public class l extends i<l.a> {
  public l(o paramo, a parama) {
    super(paramo, parama);
  }
  
  a a(o paramo) {
    return null;
  }
  
  public void a(i parami) {
    String str;
    ArrayList<T> arrayList = this.d;
    boolean bool2 = false;
    a a = (a)arrayList.get(0);
    if ((a.b & 0x20000000) == 536870912) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    parami.a(1, bool1);
    if ((a.b & 0x40000000) == 1073741824) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    parami.a(2, bool1);
    boolean bool1 = bool2;
    if ((a.b & 0xC0000000) == -1073741824)
      bool1 = true; 
    parami.a(3, bool1);
    parami.a(4, a.c);
    parami.a(5, a.d);
    int j = a.e;
    if (j != 1) {
      if (j != 2) {
        if (j != 4) {
          parami.a(7, a.f);
          parami.a(8, a.g);
          return;
        } 
        str = "Underline";
      } else {
        str = "Italic";
      } 
    } else {
      str = "Bold";
    } 
    parami.a(6, str);
    parami.a(7, a.f);
    parami.a(8, a.g);
  }
  
  class a extends h {
    int b;
    
    long c;
    
    int d;
    
    int e;
    
    int f;
    
    int[] g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */