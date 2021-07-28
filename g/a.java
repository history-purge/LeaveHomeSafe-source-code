package g;

import g.c.a.a;
import g.c.a.b;

public final class a implements Comparable<a> {
  public static final a g = new a(1, 3, 50);
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  public a(int paramInt1, int paramInt2, int paramInt3) {
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.c = a(this.d, this.e, this.f);
  }
  
  private final int a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool;
    if (paramInt1 >= 0 && 255 >= paramInt1 && paramInt2 >= 0 && 255 >= paramInt2 && paramInt3 >= 0 && 255 >= paramInt3) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      return (paramInt1 << 16) + (paramInt2 << 8) + paramInt3; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Version components are out of range: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append('.');
    stringBuilder.append(paramInt2);
    stringBuilder.append('.');
    stringBuilder.append(paramInt3);
    throw new IllegalArgumentException(stringBuilder.toString().toString());
  }
  
  public int a(a parama) {
    b.b(parama, "other");
    return this.c - parama.c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    Object object = paramObject;
    if (!(paramObject instanceof a))
      object = null; 
    paramObject = object;
    return (paramObject != null) ? ((this.c == ((a)paramObject).c)) : false;
  }
  
  public int hashCode() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d);
    stringBuilder.append('.');
    stringBuilder.append(this.e);
    stringBuilder.append('.');
    stringBuilder.append(this.f);
    return stringBuilder.toString();
  }
  
  static {
    new a(null);
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */