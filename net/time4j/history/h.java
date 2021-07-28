package net.time4j.history;

public final class h implements Comparable<h> {
  private final j c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  h(j paramj, int paramInt1, int paramInt2, int paramInt3) {
    this.c = paramj;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
  }
  
  public static h a(j paramj, int paramInt1, int paramInt2, int paramInt3) {
    return a(paramj, paramInt1, paramInt2, paramInt3, p.c, o.d);
  }
  
  public static h a(j paramj, int paramInt1, int paramInt2, int paramInt3, p paramp, o paramo) {
    if (paramj != null) {
      if (paramInt3 >= 1 && paramInt3 <= 31) {
        if (paramInt2 >= 1 && paramInt2 <= 12) {
          StringBuilder stringBuilder2;
          if (paramj == j.f) {
            if (paramInt1 < 0 || (paramInt1 == 0 && paramInt2 < 9)) {
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Before creation of the world: ");
              stringBuilder2.append(b(paramj, paramInt1, paramInt2, paramInt3));
              throw new IllegalArgumentException(stringBuilder2.toString());
            } 
          } else if (paramInt1 < 1) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Year of era must be positive: ");
            stringBuilder2.append(b(paramj, paramInt1, paramInt2, paramInt3));
            throw new IllegalArgumentException(stringBuilder2.toString());
          } 
          int i = paramInt1;
          if (!stringBuilder2.equals(p.c)) {
            boolean bool;
            n n = paramo.b(paramj, paramInt1);
            if (stringBuilder2 == p.d) {
              bool = true;
            } else {
              bool = false;
            } 
            i = n.a(bool, paramo, paramj, paramInt1, paramInt2, paramInt3);
          } 
          return new h(paramj, i, paramInt2, paramInt3);
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Month out of range: ");
        stringBuilder1.append(b(paramj, paramInt1, paramInt2, paramInt3));
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Day of month out of range: ");
      stringBuilder.append(b(paramj, paramInt1, paramInt2, paramInt3));
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing historic era.");
  }
  
  private static String b(j paramj, int paramInt1, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramj);
    stringBuilder.append('-');
    String str = String.valueOf(paramInt1);
    for (paramInt1 = 4 - str.length(); paramInt1 > 0; paramInt1--)
      stringBuilder.append('0'); 
    stringBuilder.append(str);
    stringBuilder.append('-');
    if (paramInt2 < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(paramInt2);
    stringBuilder.append('-');
    if (paramInt3 < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(paramInt3);
    return stringBuilder.toString();
  }
  
  public int a() {
    return this.f;
  }
  
  public int a(h paramh) {
    int i = this.c.f(this.d);
    int k = paramh.c.f(paramh.d);
    if (i < k)
      return -1; 
    if (i > k)
      return 1; 
    k = getMonth() - paramh.getMonth();
    i = k;
    if (k == 0)
      i = a() - paramh.a(); 
    return (i < 0) ? -1 : ((i > 0) ? 1 : 0);
  }
  
  public int a(o paramo) {
    return paramo.a(this);
  }
  
  public j b() {
    return this.c;
  }
  
  public int c() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h) {
      paramObject = paramObject;
      return (this.c == ((h)paramObject).c && this.d == ((h)paramObject).d && this.e == ((h)paramObject).e && this.f == ((h)paramObject).f);
    } 
    return false;
  }
  
  public int getMonth() {
    return this.e;
  }
  
  public int hashCode() {
    int i = this.d * 1000 + this.e * 32 + this.f;
    return (this.c == j.d) ? i : -i;
  }
  
  public String toString() {
    return b(this.c, this.d, this.e, this.f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */