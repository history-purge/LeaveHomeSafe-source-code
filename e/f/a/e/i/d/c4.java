package e.f.a.e.i.d;

import java.nio.ByteBuffer;

final class c4 {
  private static final d4 a;
  
  static {
    boolean bool;
    e4 e4;
    if (a4.b() && a4.c()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      g4 g4 = new g4();
    } else {
      e4 = new e4();
    } 
    a = e4;
  }
  
  private static int a(int paramInt) {
    int i = paramInt;
    if (paramInt > -12)
      i = -1; 
    return i;
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return (paramInt1 > -12 || paramInt2 > -65) ? -1 : (paramInt1 ^ paramInt2 << 8);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 > -12 || paramInt2 > -65 || paramInt3 > -65) ? -1 : (paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16);
  }
  
  static int a(CharSequence paramCharSequence) {
    int k;
    int n = paramCharSequence.length();
    int m = 0;
    int j;
    for (j = 0; j < n && paramCharSequence.charAt(j) < ''; j++);
    int i = n;
    while (true) {
      k = i;
      if (j < n) {
        k = paramCharSequence.charAt(j);
        if (k < 2048) {
          i += 127 - k >>> 31;
          j++;
          continue;
        } 
        int i1 = paramCharSequence.length();
        k = m;
        while (j < i1) {
          char c = paramCharSequence.charAt(j);
          if (c < 'ࠀ') {
            k += 127 - c >>> 31;
            m = j;
          } else {
            int i2 = k + 2;
            k = i2;
            m = j;
            if ('?' <= c) {
              k = i2;
              m = j;
              if (c <= '?')
                if (Character.codePointAt(paramCharSequence, j) >= 65536) {
                  m = j + 1;
                  k = i2;
                } else {
                  throw new f4(j, i1);
                }  
            } 
          } 
          j = m + 1;
        } 
        k = i + k;
      } 
      break;
    } 
    if (k >= n)
      return k; 
    long l = k;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(paramCharSequence.toString());
    throw illegalArgumentException;
  }
  
  static int a(CharSequence paramCharSequence, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return a.a(paramCharSequence, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer) {
    d4 d41 = a;
    if (paramByteBuffer.hasArray()) {
      int i = paramByteBuffer.arrayOffset();
      paramByteBuffer.position(a(paramCharSequence, paramByteBuffer.array(), paramByteBuffer.position() + i, paramByteBuffer.remaining()) - i);
      return;
    } 
    if (paramByteBuffer.isDirect()) {
      d41.a(paramCharSequence, paramByteBuffer);
      return;
    } 
    d4.b(paramCharSequence, paramByteBuffer);
  }
  
  public static boolean a(byte[] paramArrayOfbyte) {
    return a.a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static boolean a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return a.a(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static int b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b = paramArrayOfbyte[paramInt1 - 1];
    paramInt2 -= paramInt1;
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2)
          return a(b, paramArrayOfbyte[paramInt1], paramArrayOfbyte[paramInt1 + 1]); 
        throw new AssertionError();
      } 
      return a(b, paramArrayOfbyte[paramInt1]);
    } 
    return a(b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/c4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */