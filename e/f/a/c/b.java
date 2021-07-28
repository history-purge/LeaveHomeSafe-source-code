package e.f.a.c;

public final class b {
  private final String a;
  
  private b(String paramString) {
    if (paramString != null) {
      this.a = paramString;
      return;
    } 
    throw new NullPointerException("name is null");
  }
  
  public static b a(String paramString) {
    return new b(paramString);
  }
  
  public String a() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!(paramObject instanceof b) ? false : this.a.equals(((b)paramObject).a));
  }
  
  public int hashCode() {
    return this.a.hashCode() ^ 0xF4243;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Encoding{name=\"");
    stringBuilder.append(this.a);
    stringBuilder.append("\"}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */