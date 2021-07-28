package e.f.c.w;

import e.f.c.a;
import e.f.c.j;
import e.f.c.n;
import e.f.c.o;
import e.f.c.p;
import e.f.c.s.a;
import java.util.EnumMap;
import java.util.Map;

final class m {
  private final int[] a = new int[4];
  
  private final StringBuilder b = new StringBuilder();
  
  private int a(a parama, int[] paramArrayOfint, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = this.a;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i1 = parama.c();
    int i = paramArrayOfint[1];
    int k = 0;
    int n;
    for (n = 0; k < 2 && i < i1; n = i2) {
      int i3 = p.a(parama, arrayOfInt, i, p.g);
      paramStringBuilder.append((char)(i3 % 10 + 48));
      int i4 = arrayOfInt.length;
      int i2;
      for (i2 = 0; i2 < i4; i2++)
        i += arrayOfInt[i2]; 
      i2 = n;
      if (i3 >= 10)
        i2 = 1 << 1 - k | n; 
      if (k != 1)
        i = parama.c(parama.b(i)); 
      k++;
    } 
    if (paramStringBuilder.length() == 2) {
      if (Integer.parseInt(paramStringBuilder.toString()) % 4 == n)
        return i; 
      throw j.a();
    } 
    j j = j.a();
    throw j;
  }
  
  private static Map<o, Object> a(String paramString) {
    if (paramString.length() != 2)
      return null; 
    EnumMap<o, Object> enumMap = new EnumMap<o, Object>(o.class);
    enumMap.put(o.g, Integer.valueOf(paramString));
    return enumMap;
  }
  
  n a(int paramInt, a parama, int[] paramArrayOfint) {
    StringBuilder stringBuilder = this.b;
    stringBuilder.setLength(0);
    int i = a(parama, paramArrayOfint, stringBuilder);
    String str = stringBuilder.toString();
    Map<o, Object> map = a(str);
    float f1 = (paramArrayOfint[0] + paramArrayOfint[1]) / 2.0F;
    float f2 = paramInt;
    p p1 = new p(f1, f2);
    p p2 = new p(i, f2);
    a a1 = a.s;
    n n = new n(str, null, new p[] { p1, p2 }, a1);
    if (map != null)
      n.a(map); 
    return n;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */