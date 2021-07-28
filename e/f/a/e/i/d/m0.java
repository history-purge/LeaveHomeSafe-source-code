package e.f.a.e.i.d;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class m0 extends z {
  private static final Logger b = Logger.getLogger(m0.class.getName());
  
  private static final boolean c = a4.b();
  
  o0 a;
  
  private m0() {}
  
  public static int a(int paramInt, s1 params1) {
    paramInt = e(paramInt);
    int i = params1.a();
    return paramInt + g(i) + i;
  }
  
  public static int a(a0 parama0) {
    int i = parama0.size();
    return g(i) + i;
  }
  
  public static int a(k2 paramk2) {
    int i = paramk2.f();
    return g(i) + i;
  }
  
  static int a(k2 paramk2, b3<k2> paramb3) {
    paramk2 = paramk2;
    int j = paramk2.g();
    int i = j;
    if (j == -1) {
      i = paramb3.b(paramk2);
      paramk2.a(i);
    } 
    return g(i) + i;
  }
  
  public static int a(s1 params1) {
    int i = params1.a();
    return g(i) + i;
  }
  
  public static int a(String paramString) {
    int i;
    try {
      i = c4.a(paramString);
    } catch (f4 f4) {
      i = (paramString.getBytes(h1.a)).length;
    } 
    return g(i) + i;
  }
  
  public static m0 a(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.hasArray())
      return new b(paramByteBuffer); 
    if (paramByteBuffer.isDirect() && !paramByteBuffer.isReadOnly())
      return (m0)(a4.c() ? new e(paramByteBuffer) : new d(paramByteBuffer)); 
    throw new IllegalArgumentException("ByteBuffer is read-only");
  }
  
  public static m0 a(byte[] paramArrayOfbyte) {
    return new a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static int b(double paramDouble) {
    return 8;
  }
  
  public static int b(float paramFloat) {
    return 4;
  }
  
  public static int b(int paramInt, double paramDouble) {
    return e(paramInt) + 8;
  }
  
  public static int b(int paramInt, float paramFloat) {
    return e(paramInt) + 4;
  }
  
  static int b(int paramInt, k2 paramk2, b3 paramb3) {
    return e(paramInt) + a(paramk2, paramb3);
  }
  
  public static int b(int paramInt, s1 params1) {
    return (e(1) << 1) + g(2, paramInt) + a(3, params1);
  }
  
  public static int b(int paramInt, String paramString) {
    return e(paramInt) + a(paramString);
  }
  
  public static int b(int paramInt, boolean paramBoolean) {
    return e(paramInt) + 1;
  }
  
  @Deprecated
  public static int b(k2 paramk2) {
    return paramk2.f();
  }
  
  public static int b(boolean paramBoolean) {
    return 1;
  }
  
  public static int b(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    return g(i) + i;
  }
  
  public static int c(int paramInt, a0 parama0) {
    paramInt = e(paramInt);
    int i = parama0.size();
    return paramInt + g(i) + i;
  }
  
  public static int c(int paramInt, k2 paramk2) {
    return e(paramInt) + a(paramk2);
  }
  
  @Deprecated
  static int c(int paramInt, k2 paramk2, b3<k2> paramb3) {
    int j = e(paramInt);
    paramk2 = paramk2;
    int i = paramk2.g();
    paramInt = i;
    if (i == -1) {
      paramInt = paramb3.b(paramk2);
      paramk2.a(paramInt);
    } 
    return (j << 1) + paramInt;
  }
  
  public static int d(int paramInt, long paramLong) {
    return e(paramInt) + e(paramLong);
  }
  
  public static int d(int paramInt, a0 parama0) {
    return (e(1) << 1) + g(2, paramInt) + c(3, parama0);
  }
  
  public static int d(int paramInt, k2 paramk2) {
    return (e(1) << 1) + g(2, paramInt) + c(3, paramk2);
  }
  
  public static int d(long paramLong) {
    return e(paramLong);
  }
  
  public static int e(int paramInt) {
    return g(paramInt << 3);
  }
  
  public static int e(int paramInt, long paramLong) {
    return e(paramInt) + e(paramLong);
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
    return e(paramInt1) + f(paramInt2);
  }
  
  public static int f(int paramInt, long paramLong) {
    return e(paramInt) + e(i(paramLong));
  }
  
  public static int f(long paramLong) {
    return e(i(paramLong));
  }
  
  public static int g(int paramInt) {
    return ((paramInt & 0xFFFFFF80) == 0) ? 1 : (((paramInt & 0xFFFFC000) == 0) ? 2 : (((0xFFE00000 & paramInt) == 0) ? 3 : (((paramInt & 0xF0000000) == 0) ? 4 : 5)));
  }
  
  public static int g(int paramInt1, int paramInt2) {
    return e(paramInt1) + g(paramInt2);
  }
  
  public static int g(int paramInt, long paramLong) {
    return e(paramInt) + 8;
  }
  
  public static int g(long paramLong) {
    return 8;
  }
  
  public static int h(int paramInt) {
    return g(l(paramInt));
  }
  
  public static int h(int paramInt1, int paramInt2) {
    return e(paramInt1) + g(l(paramInt2));
  }
  
  public static int h(int paramInt, long paramLong) {
    return e(paramInt) + 8;
  }
  
  public static int h(long paramLong) {
    return 8;
  }
  
  public static int i(int paramInt) {
    return 4;
  }
  
  public static int i(int paramInt1, int paramInt2) {
    return e(paramInt1) + 4;
  }
  
  private static long i(long paramLong) {
    return paramLong >> 63L ^ paramLong << 1L;
  }
  
  public static int j(int paramInt) {
    return 4;
  }
  
  public static int j(int paramInt1, int paramInt2) {
    return e(paramInt1) + 4;
  }
  
  public static int k(int paramInt) {
    return f(paramInt);
  }
  
  public static int k(int paramInt1, int paramInt2) {
    return e(paramInt1) + f(paramInt2);
  }
  
  private static int l(int paramInt) {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  @Deprecated
  public static int m(int paramInt) {
    return g(paramInt);
  }
  
  public abstract void a();
  
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
  
  public abstract void a(int paramInt, a0 parama0);
  
  public abstract void a(int paramInt, k2 paramk2);
  
  abstract void a(int paramInt, k2 paramk2, b3 paramb3);
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(int paramInt, boolean paramBoolean);
  
  public abstract void a(long paramLong);
  
  final void a(String paramString, f4 paramf4) {
    b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramf4);
    byte[] arrayOfByte = paramString.getBytes(h1.a);
    try {
      b(arrayOfByte.length);
      a(arrayOfByte, 0, arrayOfByte.length);
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new c(indexOutOfBoundsException);
    } catch (c c) {
      throw c;
    } 
  }
  
  public final void a(boolean paramBoolean) {
    a((byte)paramBoolean);
  }
  
  public abstract int b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt1, int paramInt2);
  
  public final void b(int paramInt, long paramLong) {
    a(paramInt, i(paramLong));
  }
  
  public abstract void b(int paramInt, a0 parama0);
  
  public abstract void b(int paramInt, k2 paramk2);
  
  public final void b(long paramLong) {
    a(i(paramLong));
  }
  
  public abstract void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  public final void c(int paramInt) {
    b(l(paramInt));
  }
  
  public abstract void c(int paramInt1, int paramInt2);
  
  public abstract void c(int paramInt, long paramLong);
  
  public abstract void c(long paramLong);
  
  public abstract void d(int paramInt);
  
  public final void d(int paramInt1, int paramInt2) {
    c(paramInt1, l(paramInt2));
  }
  
  public abstract void e(int paramInt1, int paramInt2);
  
  static class a extends m0 {
    private final byte[] d;
    
    private final int e;
    
    private final int f;
    
    private int g;
    
    a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      super(null);
      if (param1ArrayOfbyte != null) {
        int i = param1ArrayOfbyte.length;
        int j = param1Int1 + param1Int2;
        if ((param1Int1 | param1Int2 | i - j) >= 0) {
          this.d = param1ArrayOfbyte;
          this.e = param1Int1;
          this.g = param1Int1;
          this.f = j;
          return;
        } 
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(param1ArrayOfbyte.length), Integer.valueOf(param1Int1), Integer.valueOf(param1Int2) }));
      } 
      throw new NullPointerException("buffer");
    }
    
    public void a() {}
    
    public final void a(byte param1Byte) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = param1Byte;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
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
    
    public final void a(int param1Int, a0 param1a0) {
      a(param1Int, 2);
      b(param1a0);
    }
    
    public final void a(int param1Int, k2 param1k2) {
      a(param1Int, 2);
      c(param1k2);
    }
    
    final void a(int param1Int, k2 param1k2, b3<q> param1b3) {
      a(param1Int, 2);
      q q = (q)param1k2;
      int i = q.g();
      param1Int = i;
      if (i == -1) {
        param1Int = param1b3.b(q);
        q.a(param1Int);
      } 
      b(param1Int);
      param1b3.a(param1k2, this.a);
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
      if (m0.c()) {
        l = param1Long;
        if (b() >= 10)
          while (true) {
            if ((param1Long & 0xFFFFFFFFFFFFFF80L) == 0L) {
              byte[] arrayOfByte1 = this.d;
              int j = this.g;
              this.g = j + 1;
              a4.a(arrayOfByte1, j, (byte)(int)param1Long);
              return;
            } 
            byte[] arrayOfByte = this.d;
            int i = this.g;
            this.g = i + 1;
            a4.a(arrayOfByte, i, (byte)((int)param1Long & 0x7F | 0x80));
            param1Long >>>= 7L;
          }  
      } 
      while (true) {
        if ((l & 0xFFFFFFFFFFFFFF80L) == 0L)
          try {
            byte[] arrayOfByte1 = this.d;
            int j = this.g;
            this.g = j + 1;
            arrayOfByte1[j] = (byte)(int)l;
            return;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            m0.c c = new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
            throw c;
          }  
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)((int)l & 0x7F | 0x80);
        l >>>= 7L;
      } 
    }
    
    public final void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      b(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public final int b() {
      return this.f - this.g;
    }
    
    public final void b(int param1Int) {
      int i = param1Int;
      if (m0.c()) {
        i = param1Int;
        if (b() >= 10)
          while (true) {
            if ((param1Int & 0xFFFFFF80) == 0) {
              byte[] arrayOfByte1 = this.d;
              i = this.g;
              this.g = i + 1;
              a4.a(arrayOfByte1, i, (byte)param1Int);
              return;
            } 
            byte[] arrayOfByte = this.d;
            i = this.g;
            this.g = i + 1;
            a4.a(arrayOfByte, i, (byte)(param1Int & 0x7F | 0x80));
            param1Int >>>= 7;
          }  
      } 
      while (true) {
        if ((i & 0xFFFFFF80) == 0)
          try {
            byte[] arrayOfByte1 = this.d;
            param1Int = this.g;
            this.g = param1Int + 1;
            arrayOfByte1[param1Int] = (byte)i;
            return;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            m0.c c = new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
            throw c;
          }  
        byte[] arrayOfByte = this.d;
        param1Int = this.g;
        this.g = param1Int + 1;
        arrayOfByte[param1Int] = (byte)(i & 0x7F | 0x80);
        i >>>= 7;
      } 
    }
    
    public final void b(int param1Int1, int param1Int2) {
      a(param1Int1, 0);
      a(param1Int2);
    }
    
    public final void b(int param1Int, a0 param1a0) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1a0);
      a(1, 4);
    }
    
    public final void b(int param1Int, k2 param1k2) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1k2);
      a(1, 4);
    }
    
    public final void b(a0 param1a0) {
      b(param1a0.size());
      param1a0.a(this);
    }
    
    public final void b(String param1String) {
      int i = this.g;
      try {
        int k = m0.g(param1String.length() * 3);
        int j = m0.g(param1String.length());
        if (j == k) {
          this.g = i + j;
          k = c4.a(param1String, this.d, this.g, b());
          this.g = i;
          b(k - i - j);
          this.g = k;
          return;
        } 
        b(c4.a(param1String));
        this.g = c4.a(param1String, this.d, this.g, b());
        return;
      } catch (f4 f4) {
        this.g = i;
        a(param1String, f4);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(indexOutOfBoundsException);
      } 
    }
    
    public final void b(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      try {
        System.arraycopy(param1ArrayOfbyte, param1Int1, this.d, this.g, param1Int2);
        this.g += param1Int2;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(param1Int2) }), indexOutOfBoundsException);
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
        int i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)param1Long;
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 8L);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 16L);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 24L);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 32L);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 40L);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 48L);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(int)(param1Long >> 56L);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void c(k2 param1k2) {
      b(param1k2.f());
      param1k2.a(this);
    }
    
    public final int d() {
      return this.g - this.e;
    }
    
    public final void d(int param1Int) {
      try {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)param1Int;
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(param1Int >> 8);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = (byte)(param1Int >> 16);
        arrayOfByte = this.d;
        i = this.g;
        this.g = i + 1;
        arrayOfByte[i] = param1Int >> 24;
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), indexOutOfBoundsException);
      } 
    }
    
    public final void e(int param1Int1, int param1Int2) {
      a(param1Int1, 5);
      d(param1Int2);
    }
  }
  
  static final class b extends a {
    private final ByteBuffer h;
    
    private int i;
    
    b(ByteBuffer param1ByteBuffer) {
      super(param1ByteBuffer.array(), param1ByteBuffer.arrayOffset() + param1ByteBuffer.position(), param1ByteBuffer.remaining());
      this.h = param1ByteBuffer;
      this.i = param1ByteBuffer.position();
    }
    
    public final void a() {
      this.h.position(this.i + d());
    }
  }
  
  public static final class c extends IOException {
    c(String param1String) {
      super(param1String);
    }
    
    c(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
    
    c(Throwable param1Throwable) {
      super("CodedOutputStream was writing to a flat byte array and ran out of space.", param1Throwable);
    }
  }
  
  static final class d extends m0 {
    private final ByteBuffer d;
    
    private final ByteBuffer e;
    
    d(ByteBuffer param1ByteBuffer) {
      super(null);
      this.d = param1ByteBuffer;
      this.e = param1ByteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
      param1ByteBuffer.position();
    }
    
    private final void c(String param1String) {
      try {
        c4.a(param1String, this.e);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(indexOutOfBoundsException);
      } 
    }
    
    public final void a() {
      this.d.position(this.e.position());
    }
    
    public final void a(byte param1Byte) {
      try {
        this.e.put(param1Byte);
        return;
      } catch (BufferOverflowException bufferOverflowException) {
        throw new m0.c(bufferOverflowException);
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
    
    public final void a(int param1Int, a0 param1a0) {
      a(param1Int, 2);
      b(param1a0);
    }
    
    public final void a(int param1Int, k2 param1k2) {
      a(param1Int, 2);
      c(param1k2);
    }
    
    final void a(int param1Int, k2 param1k2, b3 param1b3) {
      a(param1Int, 2);
      b(param1k2, param1b3);
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
      while (true) {
        if ((0xFFFFFFFFFFFFFF80L & param1Long) == 0L)
          try {
            this.e.put((byte)(int)param1Long);
            return;
          } catch (BufferOverflowException bufferOverflowException) {
            m0.c c = new m0.c(bufferOverflowException);
            throw c;
          }  
        this.e.put((byte)((int)param1Long & 0x7F | 0x80));
        param1Long >>>= 7L;
      } 
    }
    
    public final void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      b(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public final int b() {
      return this.e.remaining();
    }
    
    public final void b(int param1Int) {
      while (true) {
        if ((param1Int & 0xFFFFFF80) == 0)
          try {
            this.e.put((byte)param1Int);
            return;
          } catch (BufferOverflowException bufferOverflowException) {
            m0.c c = new m0.c(bufferOverflowException);
            throw c;
          }  
        this.e.put((byte)(param1Int & 0x7F | 0x80));
        param1Int >>>= 7;
      } 
    }
    
    public final void b(int param1Int1, int param1Int2) {
      a(param1Int1, 0);
      a(param1Int2);
    }
    
    public final void b(int param1Int, a0 param1a0) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1a0);
      a(1, 4);
    }
    
    public final void b(int param1Int, k2 param1k2) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1k2);
      a(1, 4);
    }
    
    public final void b(a0 param1a0) {
      b(param1a0.size());
      param1a0.a(this);
    }
    
    final void b(k2 param1k2, b3<q> param1b3) {
      q q = (q)param1k2;
      int j = q.g();
      int i = j;
      if (j == -1) {
        i = param1b3.b(q);
        q.a(i);
      } 
      b(i);
      param1b3.a(param1k2, this.a);
    }
    
    public final void b(String param1String) {
      int i = this.e.position();
      try {
        int j = m0.g(param1String.length() * 3);
        int k = m0.g(param1String.length());
        if (k == j) {
          j = this.e.position() + k;
          this.e.position(j);
          c(param1String);
          k = this.e.position();
          this.e.position(i);
          b(k - j);
          this.e.position(k);
          return;
        } 
        b(c4.a(param1String));
        c(param1String);
        return;
      } catch (f4 f4) {
        this.e.position(i);
        a(param1String, f4);
        return;
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new m0.c(illegalArgumentException);
      } 
    }
    
    public final void b(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      try {
        this.e.put(param1ArrayOfbyte, param1Int1, param1Int2);
        return;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(indexOutOfBoundsException);
      } catch (BufferOverflowException bufferOverflowException) {
        throw new m0.c(bufferOverflowException);
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
        this.e.putLong(param1Long);
        return;
      } catch (BufferOverflowException bufferOverflowException) {
        throw new m0.c(bufferOverflowException);
      } 
    }
    
    public final void c(k2 param1k2) {
      b(param1k2.f());
      param1k2.a(this);
    }
    
    public final void d(int param1Int) {
      try {
        this.e.putInt(param1Int);
        return;
      } catch (BufferOverflowException bufferOverflowException) {
        throw new m0.c(bufferOverflowException);
      } 
    }
    
    public final void e(int param1Int1, int param1Int2) {
      a(param1Int1, 5);
      d(param1Int2);
    }
  }
  
  static final class e extends m0 {
    private final ByteBuffer d;
    
    private final ByteBuffer e;
    
    private final long f;
    
    private final long g;
    
    private final long h;
    
    private final long i;
    
    private long j;
    
    e(ByteBuffer param1ByteBuffer) {
      super(null);
      this.d = param1ByteBuffer;
      this.e = param1ByteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
      this.f = a4.a(param1ByteBuffer);
      this.g = this.f + param1ByteBuffer.position();
      this.h = this.f + param1ByteBuffer.limit();
      this.i = this.h - 10L;
      this.j = this.g;
    }
    
    private final void i(long param1Long) {
      this.e.position((int)(param1Long - this.f));
    }
    
    public final void a() {
      this.d.position((int)(this.j - this.f));
    }
    
    public final void a(byte param1Byte) {
      long l = this.j;
      if (l < this.h) {
        this.j = 1L + l;
        a4.a(l, param1Byte);
        return;
      } 
      throw new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l), Long.valueOf(this.h), Integer.valueOf(1) }));
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
    
    public final void a(int param1Int, a0 param1a0) {
      a(param1Int, 2);
      b(param1a0);
    }
    
    public final void a(int param1Int, k2 param1k2) {
      a(param1Int, 2);
      c(param1k2);
    }
    
    final void a(int param1Int, k2 param1k2, b3 param1b3) {
      a(param1Int, 2);
      b(param1k2, param1b3);
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
      if (this.j <= this.i)
        while (true) {
          long l1 = this.j;
          if ((param1Long & 0xFFFFFFFFFFFFFF80L) == 0L) {
            l = param1Long;
            param1Long = l1;
          } else {
            this.j = l1 + 1L;
            a4.a(l1, (byte)((int)param1Long & 0x7F | 0x80));
            param1Long >>>= 7L;
            continue;
          } 
          this.j = 1L + param1Long;
          a4.a(param1Long, (byte)(int)l);
          return;
        }  
      while (true) {
        param1Long = this.j;
        if (param1Long < this.h) {
          if ((l & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.j = param1Long + 1L;
            a4.a(param1Long, (byte)((int)l & 0x7F | 0x80));
            l >>>= 7L;
            continue;
          } 
        } else {
          m0.c c = new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(param1Long), Long.valueOf(this.h), Integer.valueOf(1) }));
          throw c;
        } 
        this.j = 1L + param1Long;
        a4.a(param1Long, (byte)(int)l);
        return;
      } 
    }
    
    public final void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      b(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public final int b() {
      return (int)(this.h - this.j);
    }
    
    public final void b(int param1Int) {
      int i = param1Int;
      if (this.j <= this.i)
        while (true) {
          long l;
          if ((param1Int & 0xFFFFFF80) == 0) {
            l = this.j;
          } else {
            l = this.j;
            this.j = l + 1L;
            a4.a(l, (byte)(param1Int & 0x7F | 0x80));
            param1Int >>>= 7;
            continue;
          } 
          this.j = 1L + l;
          a4.a(l, (byte)param1Int);
          return;
        }  
      while (true) {
        long l = this.j;
        if (l < this.h) {
          if ((i & 0xFFFFFF80) == 0) {
            param1Int = i;
          } else {
            this.j = l + 1L;
            a4.a(l, (byte)(i & 0x7F | 0x80));
            i >>>= 7;
            continue;
          } 
        } else {
          m0.c c = new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l), Long.valueOf(this.h), Integer.valueOf(1) }));
          throw c;
        } 
        this.j = 1L + l;
        a4.a(l, (byte)param1Int);
        return;
      } 
    }
    
    public final void b(int param1Int1, int param1Int2) {
      a(param1Int1, 0);
      a(param1Int2);
    }
    
    public final void b(int param1Int, a0 param1a0) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1a0);
      a(1, 4);
    }
    
    public final void b(int param1Int, k2 param1k2) {
      a(1, 3);
      c(2, param1Int);
      a(3, param1k2);
      a(1, 4);
    }
    
    public final void b(a0 param1a0) {
      b(param1a0.size());
      param1a0.a(this);
    }
    
    final void b(k2 param1k2, b3<q> param1b3) {
      q q = (q)param1k2;
      int j = q.g();
      int i = j;
      if (j == -1) {
        i = param1b3.b(q);
        q.a(i);
      } 
      b(i);
      param1b3.a(param1k2, this.a);
    }
    
    public final void b(String param1String) {
      long l = this.j;
      try {
        int i = m0.g(param1String.length() * 3);
        int j = m0.g(param1String.length());
        if (j == i) {
          i = (int)(this.j - this.f) + j;
          this.e.position(i);
          c4.a(param1String, this.e);
          i = this.e.position() - i;
          b(i);
          this.j += i;
          return;
        } 
        i = c4.a(param1String);
        b(i);
        i(this.j);
        c4.a(param1String, this.e);
        this.j += i;
        return;
      } catch (f4 f4) {
        this.j = l;
        i(this.j);
        a(param1String, f4);
        return;
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new m0.c(illegalArgumentException);
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw new m0.c(indexOutOfBoundsException);
      } 
    }
    
    public final void b(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (param1ArrayOfbyte != null && param1Int1 >= 0 && param1Int2 >= 0 && param1ArrayOfbyte.length - param1Int2 >= param1Int1) {
        long l1 = this.h;
        long l2 = param1Int2;
        long l3 = this.j;
        if (l1 - l2 >= l3) {
          a4.a(param1ArrayOfbyte, param1Int1, l3, l2);
          this.j += l2;
          return;
        } 
      } 
      if (param1ArrayOfbyte == null)
        throw new NullPointerException("value"); 
      throw new m0.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(param1Int2) }));
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
      this.e.putLong((int)(this.j - this.f), param1Long);
      this.j += 8L;
    }
    
    public final void c(k2 param1k2) {
      b(param1k2.f());
      param1k2.a(this);
    }
    
    public final void d(int param1Int) {
      this.e.putInt((int)(this.j - this.f), param1Int);
      this.j += 4L;
    }
    
    public final void e(int param1Int1, int param1Int2) {
      a(param1Int1, 5);
      d(param1Int2);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */