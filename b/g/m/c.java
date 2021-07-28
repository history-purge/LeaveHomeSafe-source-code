package b.g.m;

public final class c {
  private final Object a;
  
  private c(Object paramObject) {
    this.a = paramObject;
  }
  
  static c a(Object paramObject) {
    return (paramObject == null) ? null : new c(paramObject);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (c.class != paramObject.getClass())
        return false; 
      c c1 = (c)paramObject;
      paramObject = this.a;
      Object object = c1.a;
      return (paramObject == null) ? ((object == null)) : paramObject.equals(object);
    } 
    return false;
  }
  
  public int hashCode() {
    Object object = this.a;
    return (object == null) ? 0 : object.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DisplayCutoutCompat{");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */