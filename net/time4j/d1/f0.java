package net.time4j.d1;

import net.time4j.tz.k;

public abstract class f0 {
  public static final f0 a = a(0);
  
  static {
    a(-21600);
    a(21600);
  }
  
  private static f0 a(int paramInt) {
    return new b(paramInt, null);
  }
  
  public abstract int a(g paramg, k paramk);
  
  private static class b extends f0 {
    private final int b;
    
    private b(int param1Int) {
      this.b = param1Int;
    }
    
    public int a(g param1g, k param1k) {
      return this.b;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object instanceof b) {
        param1Object = param1Object;
        return (this.b == ((b)param1Object).b);
      } 
      return false;
    }
    
    public int hashCode() {
      return this.b;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FixedStartOfDay[");
      stringBuilder.append(this.b);
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */