package net.time4j.e1.a0;

import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.tz.f;
import net.time4j.tz.k;
import net.time4j.tz.p;

enum b0 implements p<k> {
  c, d;
  
  public char a() {
    return Character.MIN_VALUE;
  }
  
  public int a(o paramo1, o paramo2) {
    k k1 = paramo1.c();
    k k2 = paramo2.c();
    return k1.a().compareTo(k2.a());
  }
  
  public k b() {
    return (k)p.a(f.d, 14);
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return false;
  }
  
  public Class<k> getType() {
    return k.class;
  }
  
  public k q() {
    return (k)p.a(f.c, 14);
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */