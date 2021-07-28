package e.f.a.e.i.i;

import java.util.Arrays;

public final class h0 {
  private final String a;
  
  private final g0 b = new g0(null);
  
  private g0 c = this.b;
  
  private final h0 b(String paramString, Object paramObject) {
    g0 g01 = new g0(null);
    this.c.c = g01;
    this.c = g01;
    g01.b = paramObject;
    g01.a = paramString;
    return this;
  }
  
  public final h0 a(String paramString, Object paramObject) {
    b(paramString, paramObject);
    return this;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append(this.a);
    stringBuilder.append('{');
    g0 g01 = this.b.c;
    for (String str = ""; g01 != null; str = ", ") {
      Object object = g01.b;
      stringBuilder.append(str);
      str = g01.a;
      if (str != null) {
        stringBuilder.append(str);
        stringBuilder.append('=');
      } 
      if (object != null && object.getClass().isArray()) {
        str = Arrays.deepToString(new Object[] { object });
        stringBuilder.append(str, 1, str.length() - 1);
      } else {
        stringBuilder.append(object);
      } 
      g01 = g01.c;
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */