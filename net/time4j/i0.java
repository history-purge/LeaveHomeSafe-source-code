package net.time4j;

import java.util.concurrent.TimeUnit;
import net.time4j.d1.o;
import net.time4j.d1.p;

class i0<U extends Comparable<U>> implements p<U> {
  static final p<g> f = new i0((Class)g.class, (U)g.c, (U)g.h);
  
  static final p<TimeUnit> g = new i0((Class)TimeUnit.class, (U)TimeUnit.DAYS, (U)TimeUnit.NANOSECONDS);
  
  private final Class<U> c;
  
  private final transient U d;
  
  private final transient U e;
  
  private i0(Class<U> paramClass, U paramU1, U paramU2) {
    this.c = paramClass;
    this.d = paramU1;
    this.e = paramU2;
  }
  
  public char a() {
    return Character.MIN_VALUE;
  }
  
  public int a(o paramo1, o paramo2) {
    Comparable<Comparable> comparable = (Comparable)paramo1.e(this);
    Comparable<Comparable<Comparable>> comparable1 = (Comparable)paramo2.e(this);
    return (this.c == g.class) ? comparable.compareTo(comparable1) : comparable1.compareTo(comparable);
  }
  
  public U b() {
    return this.e;
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return false;
  }
  
  public Class<U> getType() {
    return this.c;
  }
  
  public String name() {
    return "PRECISION";
  }
  
  public U q() {
    return this.d;
  }
  
  public boolean s() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */