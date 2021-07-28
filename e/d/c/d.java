package e.d.c;

public class d {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final String e;
  
  private final a f;
  
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, a parama) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramString;
    this.f = parama;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (d.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      if (this.d != ((d)paramObject).d)
        return false; 
      if (this.c != ((d)paramObject).c)
        return false; 
      if (this.a != ((d)paramObject).a)
        return false; 
      if (this.b != ((d)paramObject).b)
        return false; 
      a a1 = this.f;
      if (a1 != null) {
        if (!a1.equals(((d)paramObject).f))
          return false; 
      } else if (((d)paramObject).f != null) {
        return false;
      } 
      String str = this.e;
      paramObject = ((d)paramObject).e;
      if (str != null) {
        if (!str.equals(paramObject))
          return false; 
      } else if (paramObject != null) {
        return false;
      } 
      return true;
    } 
    return false;
  }
  
  public int hashCode() {
    byte b;
    int j = this.a;
    int k = this.b;
    int m = this.c;
    int n = this.d;
    String str = this.e;
    int i = 0;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    a a1 = this.f;
    if (a1 != null)
      i = a1.hashCode(); 
    return ((((j * 31 + k) * 31 + m) * 31 + n) * 31 + b) * 31 + i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("x: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" y: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" width: ");
    stringBuilder.append(this.c);
    stringBuilder.append(" height: ");
    stringBuilder.append(this.d);
    if (this.e != null) {
      stringBuilder.append(" name: ");
      stringBuilder.append(this.e);
    } 
    if (this.f != null) {
      stringBuilder.append(" age: ");
      stringBuilder.append(this.f.a());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */