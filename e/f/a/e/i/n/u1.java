package e.f.a.e.i.n;

final class u1 {
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, d6 paramd6, v1 paramv1) {
    if (paramInt1 >>> 3 != 0) {
      z1 z1;
      int i = paramInt1 & 0x7;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            int j;
            if (i != 3) {
              if (i == 5) {
                paramd6.a(paramInt1, Integer.valueOf(a(paramArrayOfbyte, paramInt2)));
                return paramInt2 + 4;
              } 
              throw q3.c();
            } 
            d6 d61 = d6.e();
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            while (true) {
              j = i;
              i = paramInt2;
              if (paramInt2 < paramInt3) {
                j = a(paramArrayOfbyte, paramInt2, paramv1);
                i = paramv1.a;
                paramInt2 = i;
                if (i != k) {
                  paramInt2 = a(paramInt2, paramArrayOfbyte, j, paramInt3, d61, paramv1);
                  continue;
                } 
                i = j;
                j = paramInt2;
              } 
              break;
            } 
            if (i <= paramInt3 && j == k) {
              paramd6.a(paramInt1, d61);
              return i;
            } 
            throw q3.e();
          } 
          paramInt2 = a(paramArrayOfbyte, paramInt2, paramv1);
          paramInt3 = paramv1.a;
          if (paramInt3 >= 0) {
            if (paramInt3 <= paramArrayOfbyte.length - paramInt2) {
              if (paramInt3 == 0) {
                z1 = z1.c;
              } else {
                z1 = z1.a((byte[])z1, paramInt2, paramInt3);
              } 
              paramd6.a(paramInt1, z1);
              return paramInt2 + paramInt3;
            } 
            throw q3.a();
          } 
          throw q3.b();
        } 
        paramd6.a(paramInt1, Long.valueOf(b((byte[])z1, paramInt2)));
        return paramInt2 + 8;
      } 
      paramInt2 = b((byte[])z1, paramInt2, paramv1);
      paramd6.a(paramInt1, Long.valueOf(paramv1.b));
      return paramInt2;
    } 
    q3 q3 = q3.c();
    throw q3;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, r3<?> paramr3, v1 paramv1) {
    paramr3 = paramr3;
    paramInt2 = a(paramArrayOfbyte, paramInt2, paramv1);
    while (true) {
      paramr3.a(paramv1.a);
      if (paramInt2 < paramInt3) {
        int i = a(paramArrayOfbyte, paramInt2, paramv1);
        if (paramInt1 == paramv1.a) {
          paramInt2 = a(paramArrayOfbyte, i, paramv1);
          continue;
        } 
      } 
      break;
    } 
    return paramInt2;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, v1 paramv1) {
    if (paramInt1 >>> 3 != 0) {
      int i = paramInt1 & 0x7;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            int j;
            if (i != 3) {
              if (i == 5)
                return paramInt2 + 4; 
              throw q3.c();
            } 
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            while (true) {
              i = paramInt1;
              j = paramInt2;
              if (paramInt2 < paramInt3) {
                paramInt2 = a(paramArrayOfbyte, paramInt2, paramv1);
                paramInt1 = paramv1.a;
                i = paramInt1;
                j = paramInt2;
                if (paramInt1 != k) {
                  paramInt2 = a(paramInt1, paramArrayOfbyte, paramInt2, paramInt3, paramv1);
                  continue;
                } 
              } 
              break;
            } 
            if (j <= paramInt3 && i == k)
              return j; 
            throw q3.e();
          } 
          return a(paramArrayOfbyte, paramInt2, paramv1) + paramv1.a;
        } 
        return paramInt2 + 8;
      } 
      return b(paramArrayOfbyte, paramInt2, paramv1);
    } 
    q3 q3 = q3.c();
    throw q3;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, v1 paramv1) {
    int j = paramInt1 & 0x7F;
    paramInt1 = paramInt2 + 1;
    paramInt2 = paramArrayOfbyte[paramInt2];
    if (paramInt2 >= 0) {
      int k = paramInt2 << 7;
      paramInt2 = j;
      paramv1.a = paramInt2 | k;
      return paramInt1;
    } 
    paramInt2 = j | (paramInt2 & 0x7F) << 7;
    int i = paramInt1 + 1;
    paramInt1 = paramArrayOfbyte[paramInt1];
    if (paramInt1 >= 0) {
      j = paramInt1 << 14;
      paramInt1 = i;
      i = j;
      paramv1.a = paramInt2 | i;
      return paramInt1;
    } 
    paramInt2 |= (paramInt1 & 0x7F) << 14;
    j = i + 1;
    paramInt1 = paramArrayOfbyte[i];
    if (paramInt1 >= 0) {
      i = paramInt1 << 21;
      paramInt1 = j;
      paramv1.a = paramInt2 | i;
      return paramInt1;
    } 
    paramInt2 |= (paramInt1 & 0x7F) << 21;
    paramInt1 = j + 1;
    j = paramArrayOfbyte[j];
    if (j >= 0) {
      i = j << 28;
      paramv1.a = paramInt2 | i;
      return paramInt1;
    } 
    while (true) {
      i = paramInt1 + 1;
      if (paramArrayOfbyte[paramInt1] >= 0) {
        paramv1.a = paramInt2 | (j & 0x7F) << 28;
        return i;
      } 
      paramInt1 = i;
    } 
  }
  
  static int a(j5<?> paramj5, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, r3<?> paramr3, v1 paramv1) {
    paramInt2 = a(paramj5, paramArrayOfbyte, paramInt2, paramInt3, paramv1);
    while (true) {
      paramr3.add(paramv1.c);
      if (paramInt2 < paramInt3) {
        int i = a(paramArrayOfbyte, paramInt2, paramv1);
        if (paramInt1 == paramv1.a) {
          paramInt2 = a(paramj5, paramArrayOfbyte, i, paramInt3, paramv1);
          continue;
        } 
      } 
      break;
    } 
    return paramInt2;
  }
  
  static int a(j5<Object> paramj5, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, v1 paramv1) {
    paramj5 = paramj5;
    Object object = paramj5.zza();
    paramInt1 = paramj5.a(object, paramArrayOfbyte, paramInt1, paramInt2, paramInt3, paramv1);
    paramj5.a(object);
    paramv1.c = object;
    return paramInt1;
  }
  
  static int a(j5<Object> paramj5, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, v1 paramv1) {
    int j = paramInt1 + 1;
    byte b = paramArrayOfbyte[paramInt1];
    paramInt1 = j;
    int i = b;
    if (b < 0) {
      paramInt1 = a(b, paramArrayOfbyte, j, paramv1);
      i = paramv1.a;
    } 
    if (i >= 0 && i <= paramInt2 - paramInt1) {
      Object object = paramj5.zza();
      paramInt2 = i + paramInt1;
      paramj5.a(object, paramArrayOfbyte, paramInt1, paramInt2, paramv1);
      paramj5.a(object);
      paramv1.c = object;
      return paramInt2;
    } 
    throw q3.a();
  }
  
  static int a(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24 | b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16;
  }
  
  static int a(byte[] paramArrayOfbyte, int paramInt, r3<?> paramr3, v1 paramv1) {
    paramr3 = paramr3;
    paramInt = a(paramArrayOfbyte, paramInt, paramv1);
    int i = paramv1.a + paramInt;
    while (paramInt < i) {
      paramInt = a(paramArrayOfbyte, paramInt, paramv1);
      paramr3.a(paramv1.a);
    } 
    if (paramInt == i)
      return paramInt; 
    q3 q3 = q3.a();
    throw q3;
  }
  
  static int a(byte[] paramArrayOfbyte, int paramInt, v1 paramv1) {
    int i = paramInt + 1;
    paramInt = paramArrayOfbyte[paramInt];
    if (paramInt >= 0) {
      paramv1.a = paramInt;
      return i;
    } 
    return a(paramInt, paramArrayOfbyte, i, paramv1);
  }
  
  static int b(byte[] paramArrayOfbyte, int paramInt, v1 paramv1) {
    int i = paramInt + 1;
    long l = paramArrayOfbyte[paramInt];
    if (l >= 0L) {
      paramv1.b = l;
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
    paramv1.b = l;
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
  
  static int c(byte[] paramArrayOfbyte, int paramInt, v1 paramv1) {
    paramInt = a(paramArrayOfbyte, paramInt, paramv1);
    int i = paramv1.a;
    if (i >= 0) {
      if (i == 0) {
        paramv1.c = "";
        return paramInt;
      } 
      paramv1.c = new String(paramArrayOfbyte, paramInt, i, l3.a);
      return paramInt + i;
    } 
    throw q3.b();
  }
  
  static float d(byte[] paramArrayOfbyte, int paramInt) {
    return Float.intBitsToFloat(a(paramArrayOfbyte, paramInt));
  }
  
  static int d(byte[] paramArrayOfbyte, int paramInt, v1 paramv1) {
    paramInt = a(paramArrayOfbyte, paramInt, paramv1);
    int i = paramv1.a;
    if (i >= 0) {
      if (i == 0) {
        paramv1.c = "";
        return paramInt;
      } 
      paramv1.c = k6.b(paramArrayOfbyte, paramInt, i);
      return paramInt + i;
    } 
    throw q3.b();
  }
  
  static int e(byte[] paramArrayOfbyte, int paramInt, v1 paramv1) {
    paramInt = a(paramArrayOfbyte, paramInt, paramv1);
    int i = paramv1.a;
    if (i >= 0) {
      if (i <= paramArrayOfbyte.length - paramInt) {
        if (i == 0) {
          paramv1.c = z1.c;
          return paramInt;
        } 
        paramv1.c = z1.a(paramArrayOfbyte, paramInt, i);
        return paramInt + i;
      } 
      throw q3.a();
    } 
    throw q3.b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/u1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */