package e.a.a.j;

import java.io.UnsupportedEncodingException;

public class d {
  public static a a(a parama) {
    if ("UTF-8".equals(parama.b())) {
      byte[] arrayOfByte = new byte[8];
      a a1 = new a(parama.c() * 4 / 3);
      boolean bool = false;
      int i = 0;
      int m = 0;
      int j = 0;
      int k = 0;
      while (true) {
        if (i < parama.c()) {
          int n = parama.a(i);
          if (m != 11) {
            if (n < 127) {
              a1.a((byte)n);
            } else if (n >= 192) {
              j = -1;
              for (m = n; j < 8 && (m & 0x80) == 128; m <<= 1)
                j++; 
              arrayOfByte[k] = (byte)n;
              k++;
              m = 11;
            } else {
              a1.a(a((byte)n));
            } 
          } else {
            if (j > 0 && (n & 0xC0) == 128) {
              int i1 = k + 1;
              arrayOfByte[k] = (byte)n;
              if (--j == 0) {
                a1.a(arrayOfByte, 0, i1);
              } else {
                k = i1;
                i++;
              } 
            } else {
              a1.a(a(arrayOfByte[0]));
              i -= k;
            } 
            m = 0;
            k = 0;
          } 
        } else {
          break;
        } 
        i++;
      } 
      if (m == 11)
        for (i = bool; i < k; i++)
          a1.a(a(arrayOfByte[i]));  
      return a1;
    } 
    return parama;
  }
  
  private static byte[] a(byte paramByte) {
    int i = paramByte & 0xFF;
    if (i >= 128) {
      if (i == 129 || i == 141 || i == 143 || i == 144 || i == 157)
        return new byte[] { 32 }; 
      try {
        return (new String(new byte[] { paramByte }, "cp1252")).getBytes("UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {}
    } 
    return new byte[] { paramByte };
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */