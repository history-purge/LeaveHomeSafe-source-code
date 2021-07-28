package e.f.c.y.b;

import e.f.c.d;
import e.f.c.f;
import e.f.c.s.b;
import e.f.c.s.n.a;
import e.f.c.s.n.c;
import e.f.c.s.n.d;
import java.util.Map;

public final class e {
  private final c a = new c(a.l);
  
  private e.f.c.s.e a(a parama, Map<e.f.c.e, ?> paramMap) {
    j j1 = parama.d();
    f f = parama.c().b();
    b[] arrayOfB = b.a(parama.b(), j1, f);
    int k = arrayOfB.length;
    int i = 0;
    int j = 0;
    while (i < k) {
      j += arrayOfB[i].b();
      i++;
    } 
    byte[] arrayOfByte = new byte[j];
    int m = arrayOfB.length;
    j = 0;
    i = 0;
    while (j < m) {
      b b = arrayOfB[j];
      byte[] arrayOfByte1 = b.a();
      int n = b.b();
      a(arrayOfByte1, n);
      k = 0;
      while (k < n) {
        arrayOfByte[i] = arrayOfByte1[k];
        k++;
        i++;
      } 
      j++;
    } 
    return d.a(arrayOfByte, j1, f, paramMap);
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt) {
    int j = paramArrayOfbyte.length;
    int[] arrayOfInt = new int[j];
    boolean bool = false;
    int i;
    for (i = 0; i < j; i++)
      arrayOfInt[i] = paramArrayOfbyte[i] & 0xFF; 
    try {
      this.a.a(arrayOfInt, paramArrayOfbyte.length - paramInt);
      for (i = bool; i < paramInt; i++)
        paramArrayOfbyte[i] = (byte)arrayOfInt[i]; 
      return;
    } catch (d d1) {
      d d = d.a();
      throw d;
    } 
  }
  
  public e.f.c.s.e a(b paramb, Map<e.f.c.e, ?> paramMap) {
    a a = new a(paramb);
    f = null;
    try {
      return a(a, paramMap);
    } catch (f f) {
      paramb = null;
    } catch (d d) {}
    try {
      a.e();
      a.a(true);
      a.d();
      a.c();
      a.a();
      e.f.c.s.e e1 = a(a, paramMap);
      e1.a(new i(true));
      return e1;
    } catch (f|d f1) {
      if (f != null)
        throw f; 
      throw d;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */