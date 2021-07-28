package e.d.c;

public class a {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = paramInt6;
  }
  
  public static a a(String paramString) {
    if (paramString.length() == 19) {
      if (paramString.startsWith("9999:99:99"))
        return null; 
      try {
        return new a(Integer.parseInt(paramString.substring(0, 4)), Integer.parseInt(paramString.substring(5, 7)), Integer.parseInt(paramString.substring(8, 10)), Integer.parseInt(paramString.substring(11, 13)), Integer.parseInt(paramString.substring(14, 16)), Integer.parseInt(paramString.substring(17, 19)));
      } catch (NumberFormatException numberFormatException) {
        return null;
      } 
    } 
    return null;
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt, String paramString) {
    if (paramInt == 0)
      return; 
    if (paramStringBuilder.length() != 0)
      paramStringBuilder.append(' '); 
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append(' ');
    paramStringBuilder.append(paramString);
    if (paramInt != 1)
      paramStringBuilder.append('s'); 
  }
  
  public String a() {
    StringBuilder stringBuilder = new StringBuilder();
    a(stringBuilder, this.a, "year");
    a(stringBuilder, this.b, "month");
    a(stringBuilder, this.c, "day");
    a(stringBuilder, this.d, "hour");
    a(stringBuilder, this.e, "minute");
    a(stringBuilder, this.f, "second");
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (a.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      return (this.c != ((a)paramObject).c) ? false : ((this.d != ((a)paramObject).d) ? false : ((this.e != ((a)paramObject).e) ? false : ((this.b != ((a)paramObject).b) ? false : ((this.f != ((a)paramObject).f) ? false : (!(this.a != ((a)paramObject).a))))));
    } 
    return false;
  }
  
  public int hashCode() {
    return ((((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f;
  }
  
  public String toString() {
    return String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */