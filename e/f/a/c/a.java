package e.f.a.c;

final class a<T> extends c<T> {
  private final Integer a;
  
  private final T b;
  
  private final d c;
  
  a(Integer paramInteger, T paramT, d paramd) {
    this.a = paramInteger;
    if (paramT != null) {
      this.b = paramT;
      if (paramd != null) {
        this.c = paramd;
        return;
      } 
      throw new NullPointerException("Null priority");
    } 
    throw new NullPointerException("Null payload");
  }
  
  public Integer a() {
    return this.a;
  }
  
  public T b() {
    return this.b;
  }
  
  public d c() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof c) {
      paramObject = paramObject;
      Integer integer = this.a;
      return (((integer == null) ? (paramObject.a() == null) : integer.equals(paramObject.a())) && this.b.equals(paramObject.b()) && this.c.equals(paramObject.c()));
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    Integer integer = this.a;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    return ((i ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Event{code=");
    stringBuilder.append(this.a);
    stringBuilder.append(", payload=");
    stringBuilder.append(this.b);
    stringBuilder.append(", priority=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */