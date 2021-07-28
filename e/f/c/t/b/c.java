package e.f.c.t.b;

import e.f.c.f;
import e.f.c.s.e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

final class c {
  private static final char[] a = new char[] { 
      '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
      '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 
      'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
      'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
  
  private static final char[] b = new char[] { 
      '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', 
      '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', 
      '?', '@', '[', '\\', ']', '^', '_' };
  
  private static final char[] c = new char[] { 
      '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
      '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 
      'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
      'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
  
  private static final char[] d = b;
  
  private static final char[] e = new char[] { 
      '`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
      'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
      'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', 
      '~', '' };
  
  private static int a(int paramInt1, int paramInt2) {
    paramInt1 -= paramInt2 * 149 % 255 + 1;
    return (paramInt1 >= 0) ? paramInt1 : (paramInt1 + 256);
  }
  
  static e a(byte[] paramArrayOfbyte) {
    e.f.c.s.c c1 = new e.f.c.s.c(paramArrayOfbyte);
    StringBuilder stringBuilder1 = new StringBuilder(100);
    StringBuilder stringBuilder2 = new StringBuilder(0);
    ArrayList<byte[]> arrayList2 = new ArrayList(1);
    b b = b.d;
    do {
      if (b == b.d) {
        b = a(c1, stringBuilder1, stringBuilder2);
      } else {
        int i = a.a[b.ordinal()];
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i != 4) {
                if (i == 5) {
                  a(c1, stringBuilder1, (Collection<byte[]>)arrayList2);
                } else {
                  throw f.a();
                } 
              } else {
                c(c1, stringBuilder1);
              } 
            } else {
              a(c1, stringBuilder1);
            } 
          } else {
            d(c1, stringBuilder1);
          } 
        } else {
          b(c1, stringBuilder1);
        } 
        b = b.d;
      } 
    } while (b != b.c && c1.a() > 0);
    if (stringBuilder2.length() > 0)
      stringBuilder1.append(stringBuilder2); 
    String str = stringBuilder1.toString();
    ArrayList<byte[]> arrayList1 = arrayList2;
    if (arrayList2.isEmpty())
      arrayList1 = null; 
    return new e(paramArrayOfbyte, str, arrayList1, null);
  }
  
  private static b a(e.f.c.s.c paramc, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2) {
    boolean bool = false;
    while (true) {
      int i = paramc.a(8);
      if (i != 0) {
        boolean bool1;
        if (i <= 128) {
          bool1 = i;
          if (bool)
            bool1 = i + 128; 
          paramStringBuilder1.append((char)(bool1 - 1));
          return b.d;
        } 
        if (i == 129)
          return b.c; 
        if (i <= 229) {
          bool1 = i - 130;
          if (bool1 < 10)
            paramStringBuilder1.append('0'); 
          paramStringBuilder1.append(bool1);
          bool1 = bool;
        } else {
          String str;
          bool1 = bool;
          switch (i) {
            default:
              if (i == 254) {
                if (paramc.a() == 0) {
                  bool1 = bool;
                  break;
                } 
                continue;
              } 
              throw f.a();
            case 240:
              return b.h;
            case 239:
              return b.f;
            case 238:
              return b.g;
            case 237:
              str = "[)>\03606\035";
              paramStringBuilder1.append(str);
              paramStringBuilder2.insert(0, "\036\004");
              bool1 = bool;
              break;
            case 236:
              str = "[)>\03605\035";
              paramStringBuilder1.append(str);
              paramStringBuilder2.insert(0, "\036\004");
              bool1 = bool;
              break;
            case 235:
              bool1 = true;
              break;
            case 232:
              paramStringBuilder1.append('\035');
              bool1 = bool;
              break;
            case 231:
              return b.i;
            case 230:
              return b.e;
            case 233:
            case 234:
            case 241:
              break;
          } 
        } 
        bool = bool1;
        if (paramc.a() <= 0)
          return b.d; 
        continue;
      } 
      f f = f.a();
      throw f;
    } 
  }
  
  private static void a(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    paramInt1 = (paramInt1 << 8) + paramInt2 - 1;
    paramInt2 = paramInt1 / 1600;
    paramArrayOfint[0] = paramInt2;
    paramInt1 -= paramInt2 * 1600;
    paramInt2 = paramInt1 / 40;
    paramArrayOfint[1] = paramInt2;
    paramArrayOfint[2] = paramInt1 - paramInt2 * 40;
  }
  
  private static void a(e.f.c.s.c paramc, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = new int[3];
    do {
      if (paramc.a() == 8)
        return; 
      int i = paramc.a(8);
      if (i == 254)
        return; 
      a(i, paramc.a(8), arrayOfInt);
      for (i = 0; i < 3; i++) {
        byte b;
        int j = arrayOfInt[i];
        if (j != 0) {
          if (j != 1) {
            if (j != 2) {
              if (j != 3) {
                if (j < 14) {
                  j += 44;
                } else if (j < 40) {
                  j += 51;
                } else {
                  throw f.a();
                } 
                b = (char)j;
              } else {
                b = 32;
              } 
            } else {
              b = 62;
            } 
          } else {
            b = 42;
          } 
        } else {
          b = 13;
        } 
        paramStringBuilder.append(b);
      } 
    } while (paramc.a() > 0);
  }
  
  private static void a(e.f.c.s.c paramc, StringBuilder paramStringBuilder, Collection<byte[]> paramCollection) {
    int i = paramc.c() + 1;
    int k = paramc.a(8);
    int j = i + 1;
    i = a(k, i);
    if (i == 0) {
      i = paramc.a() / 8;
    } else if (i >= 250) {
      i = (i - 249) * 250 + a(paramc.a(8), j);
      j++;
    } 
    if (i >= 0) {
      byte[] arrayOfByte = new byte[i];
      k = 0;
      while (k < i) {
        if (paramc.a() >= 8) {
          arrayOfByte[k] = (byte)a(paramc.a(8), j);
          k++;
          j++;
          continue;
        } 
        throw f.a();
      } 
      paramCollection.add(arrayOfByte);
      try {
        paramStringBuilder.append(new String(arrayOfByte, "ISO8859_1"));
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(unsupportedEncodingException)));
      } 
    } 
    f f = f.a();
    throw f;
  }
  
  private static void b(e.f.c.s.c paramc, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = new int[3];
    boolean bool1 = false;
    boolean bool2 = false;
    while (true) {
      if (paramc.a() == 8)
        return; 
      int i = paramc.a(8);
      if (i == 254)
        return; 
      a(i, paramc.a(8), arrayOfInt);
      i = 0;
      while (true)
        i++; 
      continue;
      if (paramc.a() <= 0)
        break; 
    } 
  }
  
  private static void c(e.f.c.s.c paramc, StringBuilder paramStringBuilder) {
    do {
      if (paramc.a() <= 16)
        return; 
      for (int i = 0; i < 4; i++) {
        int k = paramc.a(6);
        if (k == 31) {
          i = 8 - paramc.b();
          if (i != 8)
            paramc.a(i); 
          return;
        } 
        int j = k;
        if ((k & 0x20) == 0)
          j = k | 0x40; 
        paramStringBuilder.append((char)j);
      } 
    } while (paramc.a() > 0);
  }
  
  private static void d(e.f.c.s.c paramc, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = new int[3];
    boolean bool1 = false;
    boolean bool2 = false;
    while (true) {
      if (paramc.a() == 8)
        return; 
      int i = paramc.a(8);
      if (i == 254)
        return; 
      a(i, paramc.a(8), arrayOfInt);
      i = 0;
      while (true)
        i++; 
      continue;
      if (paramc.a() <= 0)
        break; 
    } 
  }
  
  private enum b {
    c, d, e, f, g, h, i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */