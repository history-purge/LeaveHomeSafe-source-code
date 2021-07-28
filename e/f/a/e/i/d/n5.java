package e.f.a.e.i.d;

public final class n5 extends r4<n5> implements Cloneable {
  private static volatile n5[] g;
  
  private String e = "";
  
  private String f = "";
  
  public n5() {
    this.d = null;
    this.c = -1;
  }
  
  public static n5[] f() {
    if (g == null)
      synchronized (v4.a) {
        if (g == null)
          g = new n5[0]; 
      }  
    return g;
  }
  
  private final n5 g() {
    try {
      return super.d();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public final void a(p4 paramp4) {
    String str = this.e;
    if (str != null && !str.equals(""))
      paramp4.a(1, this.e); 
    str = this.f;
    if (str != null && !str.equals(""))
      paramp4.a(2, this.f); 
    super.a(paramp4);
  }
  
  protected final int b() {
    int j = super.b();
    String str = this.e;
    int i = j;
    if (str != null) {
      i = j;
      if (!str.equals(""))
        i = j + p4.b(1, this.e); 
    } 
    str = this.f;
    j = i;
    if (str != null) {
      j = i;
      if (!str.equals(""))
        j = i + p4.b(2, this.f); 
    } 
    return j;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof n5))
      return false; 
    paramObject = paramObject;
    String str = this.e;
    if (str == null) {
      if (((n5)paramObject).e != null)
        return false; 
    } else if (!str.equals(((n5)paramObject).e)) {
      return false;
    } 
    str = this.f;
    if (str == null) {
      if (((n5)paramObject).f != null)
        return false; 
    } else if (!str.equals(((n5)paramObject).f)) {
      return false;
    } 
    t4 t4 = this.d;
    if (t4 == null || t4.a()) {
      paramObject = ((r4)paramObject).d;
      return (paramObject != null) ? (paramObject.a()) : true;
    } 
    return this.d.equals(((r4)paramObject).d);
  }
  
  public final int hashCode() {
    int i;
    int j;
    int m = n5.class.getName().hashCode();
    String str = this.e;
    byte b = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    str = this.f;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    t4 t4 = this.d;
    int k = b;
    if (t4 != null)
      if (t4.a()) {
        k = b;
      } else {
        k = this.d.hashCode();
      }  
    return (((m + 527) * 31 + i) * 31 + j) * 31 + k;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/n5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */