package e.f.a.e.i.n;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class o2 extends w1 {
  private static final Logger b = Logger.getLogger(o2.class.getName());
  
  private static final boolean c = h6.a();
  
  q2 a;
  
  private o2() {}
  
  public static int a(int paramInt, z3 paramz3) {
    paramInt = g(paramInt << 3);
    int i = paramz3.a();
    return paramInt + g(i) + i;
  }
  
  public static int a(r4 paramr4) {
    int i = paramr4.f();
    return g(i) + i;
  }
  
  static int a(r4 paramr4, j5<r4> paramj5) {
    paramr4 = paramr4;
    int j = paramr4.i();
    int i = j;
    if (j == -1) {
      i = paramj5.b(paramr4);
      paramr4.a(i);
    } 
    return g(i) + i;
  }
  
  public static int a(z1 paramz1) {
    int i = paramz1.zza();
    return g(i) + i;
  }
  
  public static int a(z3 paramz3) {
    int i = paramz3.a();
    return g(i) + i;
  }
  
  public static int a(String paramString) {
    int i;
    try {
      i = k6.a(paramString);
    } catch (n6 n6) {
      i = (paramString.getBytes(l3.a)).length;
    } 
    return g(i) + i;
  }
  
  public static o2 a(byte[] paramArrayOfbyte) {
    return new a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static int b(double paramDouble) {
    return 8;
  }
  
  public static int b(float paramFloat) {
    return 4;
  }
  
  public static int b(int paramInt, double paramDouble) {
    return g(paramInt << 3) + 8;
  }
  
  public static int b(int paramInt, float paramFloat) {
    return g(paramInt << 3) + 4;
  }
  
  public static int b(int paramInt, r4 paramr4) {
    return (g(8) << 1) + g(2, paramInt) + g(24) + a(paramr4);
  }
  
  static int b(int paramInt, r4 paramr4, j5 paramj5) {
    return g(paramInt << 3) + a(paramr4, paramj5);
  }
  
  public static int b(int paramInt, z3 paramz3) {
    return (g(8) << 1) + g(2, paramInt) + a(3, paramz3);
  }
  
  public static int b(int paramInt, String paramString) {
    return g(paramInt << 3) + a(paramString);
  }
  
  public static int b(int paramInt, boolean paramBoolean) {
    return g(paramInt << 3) + 1;
  }
  
  @Deprecated
  public static int b(r4 paramr4) {
    return paramr4.f();
  }
  
  public static int b(boolean paramBoolean) {
    return 1;
  }
  
  public static int b(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    return g(i) + i;
  }
  
  @Deprecated
  static int c(int paramInt, r4 paramr4, j5<r4> paramj5) {
    int j = g(paramInt << 3);
    paramr4 = paramr4;
    int i = paramr4.i();
    paramInt = i;
    if (i == -1) {
      paramInt = paramj5.b(paramr4);
      paramr4.a(paramInt);
    } 
    return (j << 1) + paramInt;
  }
  
  public static int c(int paramInt, z1 paramz1) {
    paramInt = g(paramInt << 3);
    int i = paramz1.zza();
    return paramInt + g(i) + i;
  }
  
  public static int d(int paramInt, long paramLong) {
    return g(paramInt << 3) + e(paramLong);
  }
  
  public static int d(int paramInt, z1 paramz1) {
    return (g(8) << 1) + g(2, paramInt) + c(3, paramz1);
  }
  
  public static int d(long paramLong) {
    return e(paramLong);
  }
  
  public static int e(int paramInt) {
    return g(paramInt << 3);
  }
  
  public static int e(int paramInt, long paramLong) {
    return g(paramInt << 3) + e(paramLong);
  }
  
  public static int e(long paramLong) {
    if ((0xFFFFFFFFFFFFFF80L & paramLong) == 0L)
      return 1; 
    if (paramLong < 0L)
      return 10; 
    if ((0xFFFFFFF800000000L & paramLong) != 0L) {
      j = 6;
      paramLong >>>= 28L;
    } else {
      j = 2;
    } 
    int i = j;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000L & paramLong) != 0L) {
      i = j + 2;
      l = paramLong >>> 14L;
    } 
    int j = i;
    if ((l & 0xFFFFFFFFFFFFC000L) != 0L)
      j = i + 1; 
    return j;
  }
  
  public static int f(int paramInt) {
    return (paramInt >= 0) ? g(paramInt) : 10;
  }
  
  public static int f(int paramInt1, int paramInt2) {
    return g(paramInt1 << 3) + f(paramInt2);
  }
  
  public static int f(int paramInt, long paramLong) {
    return g(paramInt << 3) + e(i(paramLong));
  }
  
  public static int f(long paramLong) {
    return e(i(paramLong));
  }
  
  public static int g(int paramInt) {
    return ((paramInt & 0xFFFFFF80) == 0) ? 1 : (((paramInt & 0xFFFFC000) == 0) ? 2 : (((0xFFE00000 & paramInt) == 0) ? 3 : (((paramInt & 0xF0000000) == 0) ? 4 : 5)));
  }
  
  public static int g(int paramInt1, int paramInt2) {
    return g(paramInt1 << 3) + g(paramInt2);
  }
  
  public static int g(int paramInt, long paramLong) {
    return g(paramInt << 3) + 8;
  }
  
  public static int g(long paramLong) {
    return 8;
  }
  
  public static int h(int paramInt) {
    return g(m(paramInt));
  }
  
  public static int h(int paramInt1, int paramInt2) {
    return g(paramInt1 << 3) + g(m(paramInt2));
  }
  
  public static int h(int paramInt, long paramLong) {
    return g(paramInt << 3) + 8;
  }
  
  public static int h(long paramLong) {
    return 8;
  }
  
  public static int i(int paramInt) {
    return 4;
  }
  
  public static int i(int paramInt1, int paramInt2) {
    return g(paramInt1 << 3) + 4;
  }
  
  private static long i(long paramLong) {
    return paramLong >> 63L ^ paramLong << 1L;
  }
  
  public static int j(int paramInt) {
    return 4;
  }
  
  public static int j(int paramInt1, int paramInt2) {
    return g(paramInt1 << 3) + 4;
  }
  
  public static int k(int paramInt) {
    return f(paramInt);
  }
  
  public static int k(int paramInt1, int paramInt2) {
    return g(paramInt1 << 3) + f(paramInt2);
  }
  
  @Deprecated
  public static int l(int paramInt) {
    return g(paramInt);
  }
  
  private static int m(int paramInt) {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public abstract int a();
  
  public abstract void a(byte paramByte);
  
  public final void a(double paramDouble) {
    c(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(float paramFloat) {
    d(Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void a(int paramInt);
  
  public final void a(int paramInt, double paramDouble) {
    c(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(int paramInt, float paramFloat) {
    e(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract void a(int paramInt, long paramLong);
  
  public abstract void a(int paramInt, r4 paramr4);
  
  abstract void a(int paramInt, r4 paramr4, j5 paramj5);
  
  public abstract void a(int paramInt, z1 paramz1);
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(int paramInt, boolean paramBoolean);
  
  public abstract void a(long paramLong);
  
  final void a(String paramString, n6 paramn6) {
    b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramn6);
    byte[] arrayOfByte = paramString.getBytes(l3.a);
    try {
      b(arrayOfByte.length);
      a(arrayOfByte, 0, arrayOfByte.length);
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new b(indexOutOfBoundsException);
    } catch (b b) {
      throw b;
    } 
  }
  
  public final void a(boolean paramBoolean) {
    a((byte)paramBoolean);
  }
  
  public final void b() {
    if (a() == 0)
      return; 
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt1, int paramInt2);
  
  public final void b(int paramInt, long paramLong) {
    a(paramInt, i(paramLong));
  }
  
  public abstract void b(int paramInt, z1 paramz1);
  
  public final void b(long paramLong) {
    a(i(paramLong));
  }
  
  public final void c(int paramInt) {
    b(m(paramInt));
  }
  
  public abstract void c(int paramInt1, int paramInt2);
  
  public abstract void c(int paramInt, long paramLong);
  
  public abstract void c(long paramLong);
  
  public abstract void d(int paramInt);
  
  public final void d(int paramInt1, int paramInt2) {
    c(paramInt1, m(paramInt2));
  }
  
  public abstract void e(int paramInt1, int paramInt2);
  
  private static final class a extends o2 {
    private final byte[] d;
    
    private final int e;
    
    private int f;
    
    a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      super(null);
      if (param1ArrayOfbyte != null) {
        if ((param1Int2 | 0x0 | param1ArrayOfbyte.length - param1Int2) >= 0) {
          this.d = param1ArrayOfbyte;
          this.f = 0;
          this.e = param1Int2;
          return;
        } 
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(param1ArrayOfbyte.length), Integer.valueOf(0), Integer.valueOf(param1Int2) }));
      } 
      throw new NullPointerException("buffer");
    }
    
    private final void b(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      try {
        System.arraycopy(param1ArrayOfbyte, param1Int1, this.d, this.f, param1Int2);
        this.f += param1Int2;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new o2.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(param1Int2) }), indexOutOfBoundsException);
      } 
    }
    
    public final int a() {
      return this.e - this.f;
    }
    
    public final void a(byte param1Byte) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = param1Byte;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new o2.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void a(int param1Int) {
      if (param1Int >= 0) {
        b(param1Int);
        return;
      } 
      a(param1Int);
    }
    
    public final void a(int param1Int1, int param1Int2) {
      b(param1Int1 << 3 | param1Int2);
    }
    
    public final void a(int param1Int, long param1Long) {
      a(param1Int, 0);
      a(param1Long);
    }
    
    public final void a(int param1Int, r4 param1r4) {
      a(1, 3);
      c(2, param1Int);
      a(3, 2);
      c(param1r4);
      a(1, 4);
    }
    
    final void a(int param1Int, r4 param1r4, j5<o1> param1j5) {
      a(param1Int, 2);
      o1 o1 = (o1)param1r4;
      int i = o1.i();
      param1Int = i;
      if (i == -1) {
        param1Int = param1j5.b(o1);
        o1.a(param1Int);
      } 
      b(param1Int);
      param1j5.a(param1r4, this.a);
    }
    
    public final void a(int param1Int, z1 param1z1) {
      a(param1Int, 2);
      b(param1z1);
    }
    
    public final void a(int param1Int, String param1String) {
      a(param1Int, 2);
      b(param1String);
    }
    
    public final void a(int param1Int, boolean param1Boolean) {
      a(param1Int, 0);
      a((byte)param1Boolean);
    }
    
    public final void a(long param1Long) {
      long l = param1Long;
      if (o2.c()) {
        l = param1Long;
        if (a() >= 10)
          while (true) {
            if ((param1Long & 0xFFFFFFFFFFFFFF80L) == 0L) {
              byte[] arrayOfByte1 = this.d;
              int j = this.f;
              this.f = j + 1;
              h6.a(arrayOfByte1, j, (byte)(int)param1Long);
              return;
            } 
            byte[] arrayOfByte = this.d;
            int i = this.f;
            this.f = i + 1;
            h6.a(arrayOfByte, i, (byte)((int)param1Long & 0x7F | 0x80));
            param1Long >>>= 7L;
          }  
      } 
      while (true) {
        if ((l & 0xFFFFFFFFFFFFFF80L) == 0L)
          try {
            byte[] arrayOfByte1 = this.d;
            int j = this.f;
            this.f = j + 1;
            arrayOfByte1[j] = (byte)(int)l;
            return;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            o2.b b = new o2.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1) }), indexOutOfBoundsException);
            throw b;
          }  
        byte[] arrayOfByte = this.d;
        int i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)((int)l & 0x7F | 0x80);
        l >>>= 7L;
      } 
    }
    
    public final void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      b(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public final void b(int param1Int) {
      int i = param1Int;
      if (o2.c()) {
        i = param1Int;
        if (!r1.a()) {
          i = param1Int;
          if (a() >= 5) {
            if ((param1Int & 0xFFFFFF80) == 0) {
              byte[] arrayOfByte1 = this.d;
              i = this.f;
              this.f = i + 1;
              h6.a(arrayOfByte1, i, (byte)param1Int);
              return;
            } 
            byte[] arrayOfByte = this.d;
            i = this.f;
            this.f = i + 1;
            h6.a(arrayOfByte, i, (byte)(param1Int | 0x80));
            param1Int >>>= 7;
            if ((param1Int & 0xFFFFFF80) == 0) {
              arrayOfByte = this.d;
              i = this.f;
              this.f = i + 1;
              h6.a(arrayOfByte, i, (byte)param1Int);
              return;
            } 
            arrayOfByte = this.d;
            i = this.f;
            this.f = i + 1;
            h6.a(arrayOfByte, i, (byte)(param1Int | 0x80));
            param1Int >>>= 7;
            if ((param1Int & 0xFFFFFF80) == 0) {
              arrayOfByte = this.d;
              i = this.f;
              this.f = i + 1;
              h6.a(arrayOfByte, i, (byte)param1Int);
              return;
            } 
            arrayOfByte = this.d;
            i = this.f;
            this.f = i + 1;
            h6.a(arrayOfByte, i, (byte)(param1Int | 0x80));
            param1Int >>>= 7;
            if ((param1Int & 0xFFFFFF80) == 0) {
              arrayOfByte = this.d;
              i = this.f;
              this.f = i + 1;
              h6.a(arrayOfByte, i, (byte)param1Int);
              return;
            } 
            arrayOfByte = this.d;
            i = this.f;
            this.f = i + 1;
            h6.a(arrayOfByte, i, (byte)(param1Int | 0x80));
            arrayOfByte = this.d;
            i = this.f;
            this.f = i + 1;
            h6.a(arrayOfByte, i, (byte)(param1Int >>> 7));
            return;
          } 
        } 
      } 
      while (true) {
        if ((i & 0xFFFFFF80) == 0)
          try {
            byte[] arrayOfByte1 = this.d;
            param1Int = this.f;
            this.f = param1Int + 1;
            arrayOfByte1[param1Int] = (byte)i;
            return;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            o2.b b = new o2.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1) }), indexOutOfBoundsException);
            throw b;
          }  
        byte[] arrayOfByte = this.d;
        param1Int = this.f;
        this.f = param1Int + 1;
        arrayOfByte[param1Int] = (byte)(i & 0x7F | 0x80);
        i >>>= 7;
      } 
    }
    
    public final void b(int param1Int1, int param1Int2) {
      a(param1Int1, 0);
      a(param1Int2);
    }
    
    public final void b(int param1Int, z1 param1z1) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1z1);
      a(1, 4);
    }
    
    public final void b(z1 param1z1) {
      b(param1z1.zza());
      param1z1.a(this);
    }
    
    public final void b(String param1String) {
      int i = this.f;
      try {
        int k = o2.g(param1String.length() * 3);
        int j = o2.g(param1String.length());
        if (j == k) {
          this.f = i + j;
          k = k6.a(param1String, this.d, this.f, a());
          this.f = i;
          b(k - i - j);
          this.f = k;
          return;
        } 
        b(k6.a(param1String));
        this.f = k6.a(param1String, this.d, this.f, a());
        return;
      } catch (n6 n6) {
        this.f = i;
        a(param1String, n6);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new o2.b(indexOutOfBoundsException);
      } 
    }
    
    public final void c(int param1Int1, int param1Int2) {
      a(param1Int1, 0);
      b(param1Int2);
    }
    
    public final void c(int param1Int, long param1Long) {
      a(param1Int, 1);
      c(param1Long);
    }
    
    public final void c(long param1Long) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)param1Long;
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 8L);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 16L);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 24L);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 32L);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 40L);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 48L);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 56L);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new o2.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void c(r4 param1r4) {
      b(param1r4.f());
      param1r4.a(this);
    }
    
    public final void d(int param1Int) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)param1Int;
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(param1Int >> 8);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(param1Int >> 16);
        arrayOfByte = this.d;
        i = this.f;
        this.f = i + 1;
        arrayOfByte[i] = (byte)(param1Int >>> 24);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new o2.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void e(int param1Int1, int param1Int2) {
      a(param1Int1, 5);
      d(param1Int2);
    }
  }
  
  public static final class b extends IOException {
    b(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
    
    b(Throwable param1Throwable) {
      super("CodedOutputStream was writing to a flat byte array and ran out of space.", param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/o2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */