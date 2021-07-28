package e.f.c.w.r;

public class b {
  private final int a;
  
  private final int b;
  
  public b(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final int a() {
    return this.b;
  }
  
  public final int b() {
    return this.a;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (this.a == ((b)paramObject).a && this.b == ((b)paramObject).b);
  }
  
  public final int hashCode() {
    return this.a ^ this.b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append("(");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */