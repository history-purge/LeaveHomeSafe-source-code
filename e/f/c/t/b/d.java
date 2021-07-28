package e.f.c.t.b;

import e.f.c.s.b;
import e.f.c.s.e;
import e.f.c.s.n.a;
import e.f.c.s.n.c;

public final class d {
  private final c a = new c(a.m);
  
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
    } catch (e.f.c.s.n.d d2) {
      e.f.c.d d1 = e.f.c.d.a();
      throw d1;
    } 
  }
  
  public e a(b paramb) {
    a a = new a(paramb);
    e e = a.a();
    b[] arrayOfB = b.a(a.b(), e);
    int k = arrayOfB.length;
    int i = 0;
    int j = 0;
    while (i < k) {
      j += arrayOfB[i].b();
      i++;
    } 
    byte[] arrayOfByte = new byte[j];
    k = arrayOfB.length;
    for (i = 0; i < k; i++) {
      b b1 = arrayOfB[i];
      byte[] arrayOfByte1 = b1.a();
      int m = b1.b();
      a(arrayOfByte1, m);
      for (j = 0; j < m; j++)
        arrayOfByte[j * k + i] = arrayOfByte1[j]; 
    } 
    return c.a(arrayOfByte);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */