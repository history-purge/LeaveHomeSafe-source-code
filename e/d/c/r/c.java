package e.d.c.r;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.b;
import e.d.b.h;
import e.d.b.k;
import e.d.c.b;
import e.d.c.e;
import e.d.c.g;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

public class c implements d, g {
  public static String a(int paramInt) {
    return new String(new byte[] { (byte)((0xFF000000 & paramInt) >> 24), (byte)((0xFF0000 & paramInt) >> 16), (byte)((0xFF00 & paramInt) >> 8), (byte)(paramInt & 0xFF) });
  }
  
  private void a(b paramb, int paramInt, k paramk) {
    int i = paramk.g(paramInt);
    if (i != 0)
      paramb.a(paramInt, a(i)); 
  }
  
  private void a(b paramb, int paramInt, k paramk) {
    int i = paramk.k(paramInt);
    int j = paramk.k(paramInt + 2);
    int m = paramk.k(paramInt + 4);
    int n = paramk.k(paramInt + 6);
    int i1 = paramk.k(paramInt + 8);
    int i2 = paramk.k(paramInt + 10);
    if (h.a(i, j - 1, m) && h.b(n, i1, i2)) {
      paramb.a(paramInt, String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2) }));
      return;
    } 
    paramb.a(String.format("ICC data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2) }));
  }
  
  private void b(b paramb, int paramInt, k paramk) {
    int i = paramk.g(paramInt);
    if (i != 0)
      paramb.a(paramInt, i); 
  }
  
  private void c(b paramb, int paramInt, k paramk) {
    long l = paramk.h(paramInt);
    if (l != 0L)
      paramb.a(paramInt, l); 
  }
  
  public Iterable<f> a() {
    return Collections.singletonList(f.e);
  }
  
  public void a(k paramk, e parame) {
    a(paramk, parame, (b)null);
  }
  
  public void a(k paramk, e parame, b paramb) {
    b b1 = new b();
    if (paramb != null)
      b1.a(paramb); 
    int i = 0;
    try {
      b1.a(0, paramk.g(0));
      a(b1, 4, paramk);
      b(b1, 8, paramk);
      a(b1, 12, paramk);
      a(b1, 16, paramk);
      a(b1, 20, paramk);
      a(b1, 24, paramk);
      a(b1, 36, paramk);
      a(b1, 40, paramk);
      b(b1, 44, paramk);
      a(b1, 48, paramk);
      int j = paramk.g(52);
      if (j != 0)
        if (j <= 538976288) {
          b1.a(52, j);
        } else {
          b1.a(52, a(j));
        }  
      b(b1, 64, paramk);
      c(b1, 56, paramk);
      b1.a(68, new float[] { paramk.j(68), paramk.j(72), paramk.j(76) });
      j = paramk.g(128);
      b1.a(128, j);
      while (i < j) {
        int m = i * 12 + 132;
        b1.a(paramk.g(m), paramk.a(paramk.g(m + 4), paramk.g(m + 8)));
        i++;
      } 
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Exception reading ICC profile: ");
      stringBuilder.append(iOException.getMessage());
      b1.a(stringBuilder.toString());
    } 
    parame.a(b1);
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    byte[] arrayOfByte;
    Iterator<byte> iterator = paramIterable.iterator();
    paramIterable = null;
    while (iterator.hasNext()) {
      byte[] arrayOfByte2 = (byte[])iterator.next();
      if (arrayOfByte2.length < 11 || !"ICC_PROFILE".equalsIgnoreCase(new String(arrayOfByte2, 0, 11)))
        continue; 
      if (paramIterable == null) {
        arrayOfByte = new byte[arrayOfByte2.length - 14];
        System.arraycopy(arrayOfByte2, 14, arrayOfByte, 0, arrayOfByte2.length - 14);
        continue;
      } 
      byte[] arrayOfByte1 = new byte[arrayOfByte.length + arrayOfByte2.length - 14];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte.length);
      System.arraycopy(arrayOfByte2, 14, arrayOfByte1, arrayOfByte.length, arrayOfByte2.length - 14);
      arrayOfByte = arrayOfByte1;
    } 
    if (arrayOfByte != null)
      a((k)new b(arrayOfByte), parame); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */