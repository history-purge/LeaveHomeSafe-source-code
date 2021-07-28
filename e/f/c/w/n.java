package e.f.c.w;

import e.f.c.a;
import e.f.c.j;
import e.f.c.o;
import e.f.c.p;
import e.f.c.s.a;
import java.util.EnumMap;
import java.util.Map;

final class n {
  private static final int[] c = new int[] { 24, 20, 18, 17, 12, 6, 3, 10, 9, 5 };
  
  private final int[] a = new int[4];
  
  private final StringBuilder b = new StringBuilder();
  
  private static int a(int paramInt) {
    for (int i = 0; i < 10; i++) {
      if (paramInt == c[i])
        return i; 
    } 
    j j = j.a();
    throw j;
  }
  
  private int a(a parama, int[] paramArrayOfint, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = this.a;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i1 = parama.c();
    int i = paramArrayOfint[1];
    int k = 0;
    int m;
    for (m = 0; k < 5 && i < i1; m = i2) {
      int i3 = p.a(parama, arrayOfInt, i, p.g);
      paramStringBuilder.append((char)(i3 % 10 + 48));
      int i4 = arrayOfInt.length;
      int i2;
      for (i2 = 0; i2 < i4; i2++)
        i += arrayOfInt[i2]; 
      i2 = m;
      if (i3 >= 10)
        i2 = m | 1 << 4 - k; 
      if (k != 4)
        i = parama.c(parama.b(i)); 
      k++;
    } 
    if (paramStringBuilder.length() == 5) {
      k = a(m);
      if (a(paramStringBuilder.toString()) == k)
        return i; 
      throw j.a();
    } 
    j j = j.a();
    throw j;
  }
  
  private static int a(CharSequence paramCharSequence) {
    int k = paramCharSequence.length();
    int i = k - 2;
    int j = 0;
    while (i >= 0) {
      j += paramCharSequence.charAt(i) - 48;
      i -= 2;
    } 
    j *= 3;
    for (i = k - 1; i >= 0; i -= 2)
      j += paramCharSequence.charAt(i) - 48; 
    return j * 3 % 10;
  }
  
  private static String a(String paramString) {
    int i = 0;
    char c = paramString.charAt(0);
    String str = "";
    if (c != '0') {
      if (c != '5') {
        if (c == '9') {
          switch (paramString.hashCode()) {
            default:
              i = -1;
              break;
            case 54395377:
              if (paramString.equals("99991")) {
                i = 1;
                break;
              } 
            case 54395376:
              if (paramString.equals("99990")) {
                i = 2;
                break;
              } 
            case 54118329:
              if (paramString.equals("90000"))
                break; 
          } 
          if (i != 0) {
            if (i != 1) {
              if (i == 2)
                return "Used"; 
            } else {
              return "0.00";
            } 
          } else {
            return null;
          } 
        } 
      } else {
        str = "$";
      } 
    } else {
      str = "£";
    } 
    int j = Integer.parseInt(paramString.substring(1));
    i = j / 100;
    j %= 100;
    if (j < 10) {
      paramString = "0".concat(String.valueOf(j));
    } else {
      paramString = String.valueOf(j);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(String.valueOf(i));
    stringBuilder.append('.');
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  private static Map<o, Object> b(String paramString) {
    if (paramString.length() != 5)
      return null; 
    paramString = a(paramString);
    if (paramString == null)
      return null; 
    EnumMap<o, Object> enumMap = new EnumMap<o, Object>(o.class);
    enumMap.put(o.h, paramString);
    return enumMap;
  }
  
  e.f.c.n a(int paramInt, a parama, int[] paramArrayOfint) {
    StringBuilder stringBuilder = this.b;
    stringBuilder.setLength(0);
    int i = a(parama, paramArrayOfint, stringBuilder);
    String str = stringBuilder.toString();
    Map<o, Object> map = b(str);
    float f1 = (paramArrayOfint[0] + paramArrayOfint[1]) / 2.0F;
    float f2 = paramInt;
    p p1 = new p(f1, f2);
    p p2 = new p(i, f2);
    a a1 = a.s;
    e.f.c.n n1 = new e.f.c.n(str, null, new p[] { p1, p2 }, a1);
    if (map != null)
      n1.a(map); 
    return n1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */