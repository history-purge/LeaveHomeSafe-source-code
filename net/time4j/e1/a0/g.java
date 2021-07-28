package net.time4j.e1.a0;

import net.time4j.d1.p;

public final class g {
  private final p<?> a;
  
  private final int b;
  
  private final int c;
  
  public g(p<?> paramp, int paramInt1, int paramInt2) {
    if (paramp != null) {
      if (paramInt1 >= 0) {
        if (paramInt2 > paramInt1) {
          this.a = paramp;
          this.b = paramInt1;
          this.c = paramInt2;
          return;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("End index ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" must be greater than start index ");
        stringBuilder1.append(paramInt1);
        stringBuilder1.append(" (");
        stringBuilder1.append(paramp.name());
        stringBuilder1.append(")");
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Negative start index: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" (");
      stringBuilder.append(paramp.name());
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing chronological element.");
  }
  
  public p<?> a() {
    return this.a;
  }
  
  public int b() {
    return this.c;
  }
  
  public int c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof g) {
      paramObject = paramObject;
      return (this.a.equals(((g)paramObject).a) && this.b == ((g)paramObject).b && this.c == ((g)paramObject).c);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode() + (this.b | this.c << 16) * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(80);
    stringBuilder.append(g.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.a.name());
    stringBuilder.append(",start-index=");
    stringBuilder.append(this.b);
    stringBuilder.append(",end-index=");
    stringBuilder.append(this.c);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */