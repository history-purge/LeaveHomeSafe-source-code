package com.facebook.yoga;

public class v {
  public final float a;
  
  public final u b;
  
  static {
    new v(Float.NaN, u.c);
    new v(0.0F, u.d);
    new v(Float.NaN, u.f);
  }
  
  v(float paramFloat, int paramInt) {
    this(paramFloat, u.f(paramInt));
  }
  
  public v(float paramFloat, u paramu) {
    this.a = paramFloat;
    this.b = paramu;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool1 = paramObject instanceof v;
    boolean bool = false;
    null = bool;
    if (bool1) {
      paramObject = paramObject;
      u u1 = this.b;
      null = bool;
      if (u1 == ((v)paramObject).b) {
        if (u1 != u.c && u1 != u.f) {
          null = bool;
          return (Float.compare(this.a, ((v)paramObject).a) == 0) ? true : null;
        } 
      } else {
        return null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public int hashCode() {
    return Float.floatToIntBits(this.a) + this.b.a();
  }
  
  public String toString() {
    int i = a.a[this.b.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i == 4)
            return "auto"; 
          throw new IllegalStateException();
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("%");
        return stringBuilder.toString();
      } 
      return Float.toString(this.a);
    } 
    return "undefined";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */