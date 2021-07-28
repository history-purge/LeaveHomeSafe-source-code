package e.d.c;

public class i {
  private final int a;
  
  private final b b;
  
  public i(int paramInt, b paramb) {
    this.a = paramInt;
    this.b = paramb;
  }
  
  public String a() {
    return this.b.e(this.a);
  }
  
  public String b() {
    return this.b.t(this.a);
  }
  
  public int c() {
    return this.a;
  }
  
  public String toString() {
    String str2 = a();
    String str1 = str2;
    if (str2 == null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.b.p(c()));
      stringBuilder1.append(" (unable to formulate description)");
      str1 = stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(this.b.a());
    stringBuilder.append("] ");
    stringBuilder.append(b());
    stringBuilder.append(" - ");
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */