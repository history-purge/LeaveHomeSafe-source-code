package e.f.c.w.r.g;

import e.f.c.w.r.c;

final class b {
  private final e.f.c.w.r.b a;
  
  private final e.f.c.w.r.b b;
  
  private final c c;
  
  b(e.f.c.w.r.b paramb1, e.f.c.w.r.b paramb2, c paramc, boolean paramBoolean) {
    this.a = paramb1;
    this.b = paramb2;
    this.c = paramc;
  }
  
  private static int a(Object paramObject) {
    return (paramObject == null) ? 0 : paramObject.hashCode();
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  c a() {
    return this.c;
  }
  
  e.f.c.w.r.b b() {
    return this.a;
  }
  
  e.f.c.w.r.b c() {
    return this.b;
  }
  
  public boolean d() {
    return (this.b == null);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (a(this.a, ((b)paramObject).a) && a(this.b, ((b)paramObject).b) && a(this.c, ((b)paramObject).c));
  }
  
  public int hashCode() {
    return a(this.a) ^ a(this.b) ^ a(this.c);
  }
  
  public String toString() {
    String str;
    Integer integer;
    StringBuilder stringBuilder = new StringBuilder("[ ");
    stringBuilder.append(this.a);
    stringBuilder.append(" , ");
    stringBuilder.append(this.b);
    stringBuilder.append(" : ");
    c c1 = this.c;
    if (c1 == null) {
      str = "null";
    } else {
      integer = Integer.valueOf(str.c());
    } 
    stringBuilder.append(integer);
    stringBuilder.append(" ]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */