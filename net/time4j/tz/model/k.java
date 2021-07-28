package net.time4j.tz.model;

import java.util.Comparator;
import net.time4j.d1.m;

enum k implements Comparator<d> {
  c;
  
  public int a(d paramd1, d paramd2) {
    int j = paramd1.a(2000).a((m)paramd2.a(2000));
    int i = j;
    if (j == 0)
      i = paramd1.e().a(paramd2.e()); 
    return i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */