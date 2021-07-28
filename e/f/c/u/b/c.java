package e.f.c.u.b;

import e.f.c.d;
import e.f.c.e;
import e.f.c.f;
import e.f.c.s.b;
import e.f.c.s.e;
import e.f.c.s.n.a;
import e.f.c.s.n.d;
import java.util.Map;

public final class c {
  private final e.f.c.s.n.c a = new e.f.c.s.n.c(a.o);
  
  private void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b;
    int j = paramInt2 + paramInt3;
    if (paramInt4 == 0) {
      b = 1;
    } else {
      b = 2;
    } 
    int[] arrayOfInt = new int[j / b];
    boolean bool = false;
    int i;
    for (i = 0; i < j; i++) {
      if (paramInt4 == 0 || i % 2 == paramInt4 - 1)
        arrayOfInt[i / b] = paramArrayOfbyte[i + paramInt1] & 0xFF; 
    } 
    try {
      this.a.a(arrayOfInt, paramInt3 / b);
      for (paramInt3 = bool; paramInt3 < paramInt2; paramInt3++) {
        if (paramInt4 == 0 || paramInt3 % 2 == paramInt4 - 1)
          paramArrayOfbyte[paramInt3 + paramInt1] = (byte)arrayOfInt[paramInt3 / b]; 
      } 
      return;
    } catch (d d1) {
      d d = d.a();
      throw d;
    } 
  }
  
  public e a(b paramb, Map<e, ?> paramMap) {
    byte b1;
    byte[] arrayOfByte1 = (new a(paramb)).a();
    a(arrayOfByte1, 0, 10, 10, 0);
    int i = arrayOfByte1[0] & 0xF;
    if (i != 2 && i != 3 && i != 4) {
      if (i == 5) {
        a(arrayOfByte1, 20, 68, 56, 1);
        a(arrayOfByte1, 20, 68, 56, 2);
        b1 = 78;
      } else {
        throw f.a();
      } 
    } else {
      a(arrayOfByte1, 20, 84, 40, 1);
      a(arrayOfByte1, 20, 84, 40, 2);
      b1 = 94;
    } 
    byte[] arrayOfByte2 = new byte[b1];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
    System.arraycopy(arrayOfByte1, 20, arrayOfByte2, 10, arrayOfByte2.length - 10);
    return b.a(arrayOfByte2, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/u/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */