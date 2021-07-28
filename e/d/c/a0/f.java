package e.d.c.a0;

import e.d.a.d;
import e.d.a.k.d;
import e.d.b.b;
import e.d.b.k;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import e.d.c.f0.c;
import e.d.c.o.i;
import e.d.c.r.c;
import e.d.c.t.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class f implements d {
  public Iterable<e.d.a.k.f> a() {
    return Collections.singletonList(e.d.a.k.f.p);
  }
  
  public void a(o paramo, int paramInt, e parame) {
    e e1 = new e();
    parame.a(e1);
    int j = 0;
    int i;
    for (i = 0;; i = k) {
      int k;
      if (j < paramInt) {
        try {
          String str = paramo.c(4);
          int m = paramo.h();
          k = paramo.j();
          j = j + 4 + 2 + 1;
          if (k >= 0) {
            k = k + j;
            if (k <= paramInt) {
              StringBuilder stringBuilder = new StringBuilder();
              k = (short)k;
              while (j < k) {
                stringBuilder.append((char)paramo.j());
                j++;
              } 
              k = j;
              if (j % 2 != 0) {
                paramo.a(1L);
                k = j + 1;
              } 
              j = paramo.d();
              byte[] arrayOfByte = paramo.a(j);
              k = k + 4 + j;
              j = k;
              if (k % 2 != 0) {
                paramo.a(1L);
                j = k + 1;
              } 
              k = i;
              if (str.equals("8BIM")) {
                StringBuilder stringBuilder1;
                if (m == 1028) {
                  (new c()).a((o)new n(arrayOfByte), parame, arrayOfByte.length, e1);
                  continue;
                } 
                if (m == 1039) {
                  (new c()).a((k)new b(arrayOfByte), parame, e1);
                  continue;
                } 
                if (m == 1058 || m == 1059) {
                  (new i()).a((k)new b(arrayOfByte), parame, 0, e1);
                  continue;
                } 
                if (m == 1060) {
                  (new c()).a(arrayOfByte, parame, e1);
                  continue;
                } 
                if (m >= 2000 && m <= 2998) {
                  k = i + 1;
                  byte[] arrayOfByte1 = Arrays.copyOf(arrayOfByte, arrayOfByte.length + stringBuilder.length() + 1);
                  for (i = arrayOfByte1.length - stringBuilder.length() - 1;; i++) {
                    if (i < arrayOfByte1.length) {
                      if (i % (arrayOfByte1.length - stringBuilder.length() - 1 + stringBuilder.length()) == 0) {
                        arrayOfByte1[i] = (byte)stringBuilder.length();
                      } else {
                        arrayOfByte1[i] = (byte)stringBuilder.charAt(i - arrayOfByte1.length - stringBuilder.length() - 1);
                      } 
                    } else {
                      HashMap<Integer, String> hashMap = e.e;
                      i = k + 1999;
                      stringBuilder1 = new StringBuilder();
                      stringBuilder1.append("Path Info ");
                      stringBuilder1.append(k);
                      hashMap.put(Integer.valueOf(i), stringBuilder1.toString());
                      e1.a(i, arrayOfByte1);
                      i = k;
                      k = i;
                      if (m >= 4000) {
                        k = i;
                        if (m <= 4999) {
                          e.e.put(Integer.valueOf(m), String.format("Plug-in %d Data", new Object[] { Integer.valueOf(m - 4000 + 1) }));
                          k = i;
                        } 
                      } 
                      break;
                    } 
                  } 
                } else {
                  e1.a(m, (byte[])stringBuilder1);
                  continue;
                } 
              } 
            } else {
              throw new d("Invalid string length");
            } 
          } else {
            throw new d("Invalid string length");
          } 
        } catch (Exception exception) {
          e1.a(exception.getMessage());
          return;
        } 
      } else {
        return;
      } 
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, e.d.a.k.f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length < 14 || !"Photoshop 3.0".equals(new String(arrayOfByte, 0, 13)))
        continue; 
      a((o)new n(arrayOfByte, 14), arrayOfByte.length - 13 - 1, parame);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */