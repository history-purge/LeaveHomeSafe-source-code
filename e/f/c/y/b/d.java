package e.f.c.y.b;

import e.f.c.e;
import e.f.c.f;
import e.f.c.s.c;
import e.f.c.s.e;
import e.f.c.s.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

final class d {
  private static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
  
  private static char a(int paramInt) {
    char[] arrayOfChar = a;
    if (paramInt < arrayOfChar.length)
      return arrayOfChar[paramInt]; 
    throw f.a();
  }
  
  private static int a(c paramc) {
    int i = paramc.a(8);
    if ((i & 0x80) == 0)
      return i & 0x7F; 
    if ((i & 0xC0) == 128)
      return paramc.a(8) | (i & 0x3F) << 8; 
    if ((i & 0xE0) == 192)
      return paramc.a(16) | (i & 0x1F) << 16; 
    throw f.a();
  }
  
  static e a(byte[] paramArrayOfbyte, j paramj, f paramf, Map<e, ?> paramMap) {
    c c = new c(paramArrayOfbyte);
    StringBuilder stringBuilder = new StringBuilder(50);
    ArrayList<byte[]> arrayList = new ArrayList(1);
    e.f.c.s.d d1 = null;
    boolean bool = false;
    int k = -1;
    int i = -1;
    while (true) {
      try {
        int i1;
        int i2;
        h h1;
        h h2;
        h h3;
        if (c.a() < 4) {
          h3 = h.c;
        } else {
          h3 = h.f(c.a(4));
        } 
        e.f.c.s.d d2 = d1;
        int m = k;
        int n = i;
        switch (a.a[h3.ordinal()]) {
          case 10:
            i1 = c.a(4);
            i2 = c.a(h3.a(paramj));
            d2 = d1;
            m = k;
            n = i;
            if (i1 == 1) {
              a(c, stringBuilder, i2);
              d2 = d1;
              m = k;
              n = i;
            } 
          case 9:
            d2 = e.f.c.s.d.f(a(c));
            if (d2 != null) {
              m = k;
              n = i;
            } else {
              throw f.a();
            } 
          case 8:
            if (c.a() >= 16) {
              m = c.a(8);
              n = c.a(8);
              d2 = d1;
            } else {
              throw f.a();
            } 
          default:
            m = h3.a(paramj);
            m = c.a(m);
            n = a.a[h3.ordinal()];
            if (n != 1) {
              if (n != 2) {
                if (n != 3) {
                  if (n == 4) {
                    b(c, stringBuilder, m);
                    d2 = d1;
                    m = k;
                    n = i;
                  } else {
                    throw f.a();
                  } 
                } else {
                  a(c, stringBuilder, m, d1, (Collection<byte[]>)arrayList, paramMap);
                  h2 = h.c;
                } 
              } else {
                a(c, stringBuilder, m, bool);
                h2 = h.c;
              } 
            } else {
              c(c, stringBuilder, m);
              h2 = h.c;
            } 
          case 5:
            h1 = h2;
            k = m;
            i = n;
            h2 = h.c;
          case 6:
          case 7:
            break;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        f f1 = f.a();
        throw f1;
      } 
      bool = true;
      h h = h.c;
    } 
  }
  
  private static void a(c paramc, StringBuilder paramStringBuilder, int paramInt) {
    if (paramInt * 13 <= paramc.a()) {
      byte[] arrayOfByte = new byte[paramInt * 2];
      int i = 0;
      while (paramInt > 0) {
        int j = paramc.a(13);
        int k = j % 96 | j / 96 << 8;
        if (k < 959) {
          j = 41377;
        } else {
          j = 42657;
        } 
        j = k + j;
        arrayOfByte[i] = (byte)(j >> 8);
        arrayOfByte[i + 1] = (byte)j;
        i += 2;
        paramInt--;
      } 
      try {
        paramStringBuilder.append(new String(arrayOfByte, "GB2312"));
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw f.a();
      } 
    } 
    f f = f.a();
    throw f;
  }
  
  private static void a(c paramc, StringBuilder paramStringBuilder, int paramInt, e.f.c.s.d paramd, Collection<byte[]> paramCollection, Map<e, ?> paramMap) {
    if (paramInt << 3 <= paramc.a()) {
      String str;
      byte[] arrayOfByte = new byte[paramInt];
      int i;
      for (i = 0; i < paramInt; i++)
        arrayOfByte[i] = (byte)paramc.a(8); 
      if (paramd == null) {
        str = l.a(arrayOfByte, paramMap);
      } else {
        str = paramd.name();
      } 
      try {
        paramStringBuilder.append(new String(arrayOfByte, str));
        paramCollection.add(arrayOfByte);
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw f.a();
      } 
    } 
    f f = f.a();
    throw f;
  }
  
  private static void a(c paramc, StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean) {
    int i = paramStringBuilder.length();
    while (paramInt > 1) {
      if (paramc.a() >= 11) {
        int j = paramc.a(11);
        paramStringBuilder.append(a(j / 45));
        paramStringBuilder.append(a(j % 45));
        paramInt -= 2;
        continue;
      } 
      throw f.a();
    } 
    if (paramInt == 1)
      if (paramc.a() >= 6) {
        paramStringBuilder.append(a(paramc.a(6)));
      } else {
        throw f.a();
      }  
    if (paramBoolean)
      for (paramInt = i; paramInt < paramStringBuilder.length(); paramInt++) {
        if (paramStringBuilder.charAt(paramInt) == '%') {
          if (paramInt < paramStringBuilder.length() - 1) {
            i = paramInt + 1;
            if (paramStringBuilder.charAt(i) == '%') {
              paramStringBuilder.deleteCharAt(i);
              continue;
            } 
          } 
          paramStringBuilder.setCharAt(paramInt, '\035');
        } 
        continue;
      }  
  }
  
  private static void b(c paramc, StringBuilder paramStringBuilder, int paramInt) {
    if (paramInt * 13 <= paramc.a()) {
      byte[] arrayOfByte = new byte[paramInt * 2];
      int i = 0;
      while (paramInt > 0) {
        int j = paramc.a(13);
        int k = j % 192 | j / 192 << 8;
        if (k < 7936) {
          j = 33088;
        } else {
          j = 49472;
        } 
        j = k + j;
        arrayOfByte[i] = (byte)(j >> 8);
        arrayOfByte[i + 1] = (byte)j;
        i += 2;
        paramInt--;
      } 
      try {
        paramStringBuilder.append(new String(arrayOfByte, "SJIS"));
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw f.a();
      } 
    } 
    f f = f.a();
    throw f;
  }
  
  private static void c(c paramc, StringBuilder paramStringBuilder, int paramInt) {
    while (paramInt >= 3) {
      if (paramc.a() >= 10) {
        int i = paramc.a(10);
        if (i < 1000) {
          paramStringBuilder.append(a(i / 100));
          paramStringBuilder.append(a(i / 10 % 10));
          paramStringBuilder.append(a(i % 10));
          paramInt -= 3;
          continue;
        } 
        throw f.a();
      } 
      throw f.a();
    } 
    if (paramInt == 2) {
      if (paramc.a() >= 7) {
        paramInt = paramc.a(7);
        if (paramInt < 100) {
          paramStringBuilder.append(a(paramInt / 10));
          paramStringBuilder.append(a(paramInt % 10));
          return;
        } 
        throw f.a();
      } 
      throw f.a();
    } 
    if (paramInt == 1) {
      if (paramc.a() >= 4) {
        paramInt = paramc.a(4);
        if (paramInt < 10) {
          paramStringBuilder.append(a(paramInt));
          return;
        } 
        throw f.a();
      } 
      throw f.a();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */