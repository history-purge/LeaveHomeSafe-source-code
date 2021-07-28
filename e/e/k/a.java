package e.e.k;

import e.e.e.d.g;
import e.e.e.d.i;
import e.e.e.l.c;

public class a implements c.a {
  private static final byte[] b = new byte[] { -1, -40, -1 };
  
  private static final int c = b.length;
  
  private static final byte[] d = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
  
  private static final int e = d.length;
  
  private static final byte[] f = e.a("GIF87a");
  
  private static final byte[] g = e.a("GIF89a");
  
  private static final byte[] h = e.a("BM");
  
  private static final int i = h.length;
  
  private static final byte[] j = new byte[] { 0, 0, 1, 0 };
  
  private static final int k = j.length;
  
  private static final String[] l = new String[] { "heic", "heix", "hevc", "hevx", "mif1", "msf1" };
  
  private static final int m;
  
  final int a = g.a(new int[] { 21, 20, c, e, 6, i, k, m });
  
  static {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ftyp");
    stringBuilder.append(l[0]);
    m = (e.a(stringBuilder.toString())).length;
  }
  
  private static c b(byte[] paramArrayOfbyte, int paramInt) {
    i.a(c.b(paramArrayOfbyte, 0, paramInt));
    return c.d(paramArrayOfbyte, 0) ? b.f : (c.c(paramArrayOfbyte, 0) ? b.g : (c.a(paramArrayOfbyte, 0, paramInt) ? (c.a(paramArrayOfbyte, 0) ? b.j : (c.b(paramArrayOfbyte, 0) ? b.i : b.h)) : c.b));
  }
  
  private static boolean c(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = h;
    return (paramInt < arrayOfByte.length) ? false : e.a(paramArrayOfbyte, arrayOfByte);
  }
  
  private static boolean d(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = false;
    if (paramInt < 6)
      return false; 
    if (e.a(paramArrayOfbyte, f) || e.a(paramArrayOfbyte, g))
      bool = true; 
    return bool;
  }
  
  private static boolean e(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt < m)
      return false; 
    if (paramArrayOfbyte[3] < 8)
      return false; 
    String[] arrayOfString = l;
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      String str = arrayOfString[paramInt];
      int j = paramArrayOfbyte.length;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ftyp");
      stringBuilder.append(str);
      if (e.a(paramArrayOfbyte, j, e.a(stringBuilder.toString()), m) > -1)
        return true; 
    } 
    return false;
  }
  
  private static boolean f(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = j;
    return (paramInt < arrayOfByte.length) ? false : e.a(paramArrayOfbyte, arrayOfByte);
  }
  
  private static boolean g(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = b;
    return (paramInt >= arrayOfByte.length && e.a(paramArrayOfbyte, arrayOfByte));
  }
  
  private static boolean h(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = d;
    return (paramInt >= arrayOfByte.length && e.a(paramArrayOfbyte, arrayOfByte));
  }
  
  public int a() {
    return this.a;
  }
  
  public final c a(byte[] paramArrayOfbyte, int paramInt) {
    i.a(paramArrayOfbyte);
    return c.b(paramArrayOfbyte, 0, paramInt) ? b(paramArrayOfbyte, paramInt) : (g(paramArrayOfbyte, paramInt) ? b.a : (h(paramArrayOfbyte, paramInt) ? b.b : (d(paramArrayOfbyte, paramInt) ? b.c : (c(paramArrayOfbyte, paramInt) ? b.d : (f(paramArrayOfbyte, paramInt) ? b.e : (e(paramArrayOfbyte, paramInt) ? b.k : c.b))))));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */