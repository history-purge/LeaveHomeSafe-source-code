package e.f.a.e.i.d;

final class v {
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, k1<?> paramk1, w paramw) {
    paramk1 = paramk1;
    paramInt2 = a(paramArrayOfbyte, paramInt2, paramw);
    while (true) {
      paramk1.b(paramw.a);
      if (paramInt2 < paramInt3) {
        int i = a(paramArrayOfbyte, paramInt2, paramw);
        if (paramInt1 == paramw.a) {
          paramInt2 = a(paramArrayOfbyte, i, paramw);
          continue;
        } 
      } 
      break;
    } 
    return paramInt2;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, u3 paramu3, w paramw) {
    if (paramInt1 >>> 3 != 0) {
      a0 a0;
      int i = paramInt1 & 0x7;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            int j;
            if (i != 3) {
              if (i == 5) {
                paramu3.a(paramInt1, Integer.valueOf(a(paramArrayOfbyte, paramInt2)));
                return paramInt2 + 4;
              } 
              throw l1.b();
            } 
            u3 u31 = u3.e();
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            while (true) {
              j = i;
              i = paramInt2;
              if (paramInt2 < paramInt3) {
                j = a(paramArrayOfbyte, paramInt2, paramw);
                i = paramw.a;
                paramInt2 = i;
                if (i != k) {
                  paramInt2 = a(paramInt2, paramArrayOfbyte, j, paramInt3, u31, paramw);
                  continue;
                } 
                i = j;
                j = paramInt2;
              } 
              break;
            } 
            if (i <= paramInt3 && j == k) {
              paramu3.a(paramInt1, u31);
              return i;
            } 
            throw l1.d();
          } 
          paramInt2 = a(paramArrayOfbyte, paramInt2, paramw);
          paramInt3 = paramw.a;
          if (paramInt3 == 0) {
            a0 = a0.c;
          } else {
            a0 = a0.a((byte[])a0, paramInt2, paramInt3);
          } 
          paramu3.a(paramInt1, a0);
          return paramInt2 + paramInt3;
        } 
        paramu3.a(paramInt1, Long.valueOf(b((byte[])a0, paramInt2)));
        return paramInt2 + 8;
      } 
      paramInt2 = b((byte[])a0, paramInt2, paramw);
      paramu3.a(paramInt1, Long.valueOf(paramw.b));
      return paramInt2;
    } 
    l1 l1 = l1.b();
    throw l1;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, w paramw) {
    if (paramInt1 >>> 3 != 0) {
      int i = paramInt1 & 0x7;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            int j;
            if (i != 3) {
              if (i == 5)
                return paramInt2 + 4; 
              throw l1.b();
            } 
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            while (true) {
              i = paramInt1;
              j = paramInt2;
              if (paramInt2 < paramInt3) {
                paramInt2 = a(paramArrayOfbyte, paramInt2, paramw);
                paramInt1 = paramw.a;
                i = paramInt1;
                j = paramInt2;
                if (paramInt1 != k) {
                  paramInt2 = a(paramInt1, paramArrayOfbyte, paramInt2, paramInt3, paramw);
                  continue;
                } 
              } 
              break;
            } 
            if (j <= paramInt3 && i == k)
              return j; 
            throw l1.d();
          } 
          return a(paramArrayOfbyte, paramInt2, paramw) + paramw.a;
        } 
        return paramInt2 + 8;
      } 
      return b(paramArrayOfbyte, paramInt2, paramw);
    } 
    l1 l1 = l1.b();
    throw l1;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, w paramw) {
    int j = paramInt1 & 0x7F;
    paramInt1 = paramInt2 + 1;
    paramInt2 = paramArrayOfbyte[paramInt2];
    if (paramInt2 >= 0) {
      int k = paramInt2 << 7;
      paramInt2 = j;
      paramw.a = paramInt2 | k;
      return paramInt1;
    } 
    paramInt2 = j | (paramInt2 & 0x7F) << 7;
    int i = paramInt1 + 1;
    paramInt1 = paramArrayOfbyte[paramInt1];
    if (paramInt1 >= 0) {
      j = paramInt1 << 14;
      paramInt1 = i;
      i = j;
      paramw.a = paramInt2 | i;
      return paramInt1;
    } 
    paramInt2 |= (paramInt1 & 0x7F) << 14;
    j = i + 1;
    paramInt1 = paramArrayOfbyte[i];
    if (paramInt1 >= 0) {
      i = paramInt1 << 21;
      paramInt1 = j;
      paramw.a = paramInt2 | i;
      return paramInt1;
    } 
    paramInt2 |= (paramInt1 & 0x7F) << 21;
    paramInt1 = j + 1;
    j = paramArrayOfbyte[j];
    if (j >= 0) {
      i = j << 28;
      paramw.a = paramInt2 | i;
      return paramInt1;
    } 
    while (true) {
      i = paramInt1 + 1;
      if (paramArrayOfbyte[paramInt1] >= 0) {
        paramw.a = paramInt2 | (j & 0x7F) << 28;
        return i;
      } 
      paramInt1 = i;
    } 
  }
  
  static int a(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24 | b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16;
  }
  
  static int a(byte[] paramArrayOfbyte, int paramInt, k1<?> paramk1, w paramw) {
    paramk1 = paramk1;
    paramInt = a(paramArrayOfbyte, paramInt, paramw);
    int i = paramw.a + paramInt;
    while (paramInt < i) {
      paramInt = a(paramArrayOfbyte, paramInt, paramw);
      paramk1.b(paramw.a);
    } 
    if (paramInt == i)
      return paramInt; 
    l1 l1 = l1.a();
    throw l1;
  }
  
  static int a(byte[] paramArrayOfbyte, int paramInt, w paramw) {
    int i = paramInt + 1;
    paramInt = paramArrayOfbyte[paramInt];
    if (paramInt >= 0) {
      paramw.a = paramInt;
      return i;
    } 
    return a(paramInt, paramArrayOfbyte, i, paramw);
  }
  
  static int b(byte[] paramArrayOfbyte, int paramInt, w paramw) {
    int i = paramInt + 1;
    long l = paramArrayOfbyte[paramInt];
    if (l >= 0L) {
      paramw.b = l;
      return i;
    } 
    paramInt = i + 1;
    byte b = paramArrayOfbyte[i];
    l = l & 0x7FL | (b & Byte.MAX_VALUE) << 7L;
    i = 7;
    while (b < 0) {
      b = paramArrayOfbyte[paramInt];
      i += 7;
      l |= (b & Byte.MAX_VALUE) << i;
      paramInt++;
    } 
    paramw.b = l;
    return paramInt;
  }
  
  static long b(byte[] paramArrayOfbyte, int paramInt) {
    long l1 = paramArrayOfbyte[paramInt];
    long l2 = paramArrayOfbyte[paramInt + 1];
    long l3 = paramArrayOfbyte[paramInt + 2];
    long l4 = paramArrayOfbyte[paramInt + 3];
    long l5 = paramArrayOfbyte[paramInt + 4];
    long l6 = paramArrayOfbyte[paramInt + 5];
    long l7 = paramArrayOfbyte[paramInt + 6];
    return (paramArrayOfbyte[paramInt + 7] & 0xFFL) << 56L | l1 & 0xFFL | (l2 & 0xFFL) << 8L | (l3 & 0xFFL) << 16L | (l4 & 0xFFL) << 24L | (l5 & 0xFFL) << 32L | (l6 & 0xFFL) << 40L | (l7 & 0xFFL) << 48L;
  }
  
  static double c(byte[] paramArrayOfbyte, int paramInt) {
    return Double.longBitsToDouble(b(paramArrayOfbyte, paramInt));
  }
  
  static int c(byte[] paramArrayOfbyte, int paramInt, w paramw) {
    paramInt = a(paramArrayOfbyte, paramInt, paramw);
    int i = paramw.a;
    if (i == 0) {
      paramw.c = "";
      return paramInt;
    } 
    paramw.c = new String(paramArrayOfbyte, paramInt, i, h1.a);
    return paramInt + i;
  }
  
  static float d(byte[] paramArrayOfbyte, int paramInt) {
    return Float.intBitsToFloat(a(paramArrayOfbyte, paramInt));
  }
  
  static int d(byte[] paramArrayOfbyte, int paramInt, w paramw) {
    paramInt = a(paramArrayOfbyte, paramInt, paramw);
    int i = paramw.a;
    if (i == 0) {
      paramw.c = "";
      return paramInt;
    } 
    int j = paramInt + i;
    if (c4.a(paramArrayOfbyte, paramInt, j)) {
      paramw.c = new String(paramArrayOfbyte, paramInt, i, h1.a);
      return j;
    } 
    throw l1.e();
  }
  
  static int e(byte[] paramArrayOfbyte, int paramInt, w paramw) {
    paramInt = a(paramArrayOfbyte, paramInt, paramw);
    int i = paramw.a;
    if (i == 0) {
      paramw.c = a0.c;
      return paramInt;
    } 
    paramw.c = a0.a(paramArrayOfbyte, paramInt, i);
    return paramInt + i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */