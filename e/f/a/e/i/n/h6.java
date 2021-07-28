package e.f.a.e.i.n;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class h6 {
  private static final Unsafe a = c();
  
  private static final Class<?> b = r1.b();
  
  private static final boolean c = d(long.class);
  
  private static final boolean d = d(int.class);
  
  private static final d e;
  
  private static final boolean f = e();
  
  private static final boolean g = d();
  
  private static final long h = b(byte[].class);
  
  static final boolean i;
  
  static {
    b(boolean[].class);
    c(boolean[].class);
    b(int[].class);
    c(int[].class);
    b(long[].class);
    c(long[].class);
    b(float[].class);
    c(float[].class);
    b(double[].class);
    c(double[].class);
    b(Object[].class);
    c(Object[].class);
    Field field = f();
    if (field != null) {
      d d1 = e;
      if (d1 != null)
        d1.a.objectFieldOffset(field); 
    } 
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool = true;
    } else {
      bool = false;
    } 
    i = bool;
  }
  
  static byte a(byte[] paramArrayOfbyte, long paramLong) {
    return e.a(paramArrayOfbyte, h + paramLong);
  }
  
  static int a(Object paramObject, long paramLong) {
    return e.e(paramObject, paramLong);
  }
  
  static <T> T a(Class<T> paramClass) {
    try {
      return (T)a.allocateInstance(paramClass);
    } catch (InstantiationException instantiationException) {
      throw new IllegalStateException(instantiationException);
    } 
  }
  
  private static Field a(Class<?> paramClass, String paramString) {
    try {
      return paramClass.getDeclaredField(paramString);
    } finally {
      paramClass = null;
    } 
  }
  
  static void a(Object paramObject, long paramLong, double paramDouble) {
    e.a(paramObject, paramLong, paramDouble);
  }
  
  static void a(Object paramObject, long paramLong, float paramFloat) {
    e.a(paramObject, paramLong, paramFloat);
  }
  
  static void a(Object paramObject, long paramLong, int paramInt) {
    e.a(paramObject, paramLong, paramInt);
  }
  
  static void a(Object paramObject, long paramLong1, long paramLong2) {
    e.a(paramObject, paramLong1, paramLong2);
  }
  
  static void a(Object paramObject1, long paramLong, Object paramObject2) {
    e.a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  static void a(Object paramObject, long paramLong, boolean paramBoolean) {
    e.a(paramObject, paramLong, paramBoolean);
  }
  
  static void a(byte[] paramArrayOfbyte, long paramLong, byte paramByte) {
    e.a(paramArrayOfbyte, h + paramLong, paramByte);
  }
  
  static boolean a() {
    return g;
  }
  
  private static int b(Class<?> paramClass) {
    return g ? e.a.arrayBaseOffset(paramClass) : -1;
  }
  
  static long b(Object paramObject, long paramLong) {
    return e.f(paramObject, paramLong);
  }
  
  static boolean b() {
    return f;
  }
  
  private static int c(Class<?> paramClass) {
    return g ? e.a.arrayIndexScale(paramClass) : -1;
  }
  
  static Unsafe c() {
    try {
      return AccessController.<Unsafe>doPrivileged(new j6());
    } finally {
      Exception exception = null;
    } 
  }
  
  private static void c(Object paramObject, long paramLong, byte paramByte) {
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = a(paramObject, l);
    int j = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    a(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  static boolean c(Object paramObject, long paramLong) {
    return e.b(paramObject, paramLong);
  }
  
  static float d(Object paramObject, long paramLong) {
    return e.c(paramObject, paramLong);
  }
  
  private static void d(Object paramObject, long paramLong, byte paramByte) {
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = a(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    a(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  private static void d(Object paramObject, long paramLong, boolean paramBoolean) {
    c(paramObject, paramLong, (byte)paramBoolean);
  }
  
  private static boolean d() {
    Unsafe unsafe = a;
    if (unsafe == null)
      return false; 
    try {
      Class<?> clazz = unsafe.getClass();
      clazz.getMethod("objectFieldOffset", new Class[] { Field.class });
      clazz.getMethod("arrayBaseOffset", new Class[] { Class.class });
      clazz.getMethod("arrayIndexScale", new Class[] { Class.class });
      clazz.getMethod("getInt", new Class[] { Object.class, long.class });
      clazz.getMethod("putInt", new Class[] { Object.class, long.class, int.class });
      clazz.getMethod("getLong", new Class[] { Object.class, long.class });
      clazz.getMethod("putLong", new Class[] { Object.class, long.class, long.class });
      clazz.getMethod("getObject", new Class[] { Object.class, long.class });
      clazz.getMethod("putObject", new Class[] { Object.class, long.class, Object.class });
      if (r1.a())
        return true; 
      return true;
    } finally {
      Exception exception = null;
      Logger logger = Logger.getLogger(h6.class.getName());
      Level level = Level.WARNING;
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      stringBuilder.append(str);
      logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
    } 
  }
  
  private static boolean d(Class<?> paramClass) {
    if (!r1.a())
      return false; 
    try {
      Class<?> clazz = b;
      clazz.getMethod("peekLong", new Class[] { paramClass, boolean.class });
      clazz.getMethod("pokeLong", new Class[] { paramClass, long.class, boolean.class });
      clazz.getMethod("pokeInt", new Class[] { paramClass, int.class, boolean.class });
      clazz.getMethod("peekInt", new Class[] { paramClass, boolean.class });
      clazz.getMethod("pokeByte", new Class[] { paramClass, byte.class });
      clazz.getMethod("peekByte", new Class[] { paramClass });
      clazz.getMethod("pokeByteArray", new Class[] { paramClass, byte[].class, int.class, int.class });
      return true;
    } finally {
      paramClass = null;
    } 
  }
  
  static double e(Object paramObject, long paramLong) {
    return e.d(paramObject, paramLong);
  }
  
  private static void e(Object paramObject, long paramLong, boolean paramBoolean) {
    d(paramObject, paramLong, (byte)paramBoolean);
  }
  
  private static boolean e() {
    Unsafe unsafe = a;
    if (unsafe == null)
      return false; 
    try {
      Class<?> clazz = unsafe.getClass();
      clazz.getMethod("objectFieldOffset", new Class[] { Field.class });
      clazz.getMethod("getLong", new Class[] { Object.class, long.class });
      if (f() == null)
        return false; 
      if (r1.a())
        return true; 
      return true;
    } finally {
      Exception exception = null;
      Logger logger = Logger.getLogger(h6.class.getName());
      Level level = Level.WARNING;
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      stringBuilder.append(str);
      logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
    } 
  }
  
  static Object f(Object paramObject, long paramLong) {
    return e.a.getObject(paramObject, paramLong);
  }
  
  private static Field f() {
    if (r1.a()) {
      Field field1 = a(Buffer.class, "effectiveDirectAddress");
      if (field1 != null)
        return field1; 
    } 
    Field field = a(Buffer.class, "address");
    return (field != null && field.getType() == long.class) ? field : null;
  }
  
  private static byte k(Object paramObject, long paramLong) {
    return (byte)(a(paramObject, 0xFFFFFFFFFFFFFFFCL & paramLong) >>> (int)(((paramLong ^ 0xFFFFFFFFFFFFFFFFL) & 0x3L) << 3L));
  }
  
  private static byte l(Object paramObject, long paramLong) {
    return (byte)(a(paramObject, 0xFFFFFFFFFFFFFFFCL & paramLong) >>> (int)((paramLong & 0x3L) << 3L));
  }
  
  private static boolean m(Object paramObject, long paramLong) {
    return (k(paramObject, paramLong) != 0);
  }
  
  private static boolean n(Object paramObject, long paramLong) {
    return (l(paramObject, paramLong) != 0);
  }
  
  static {
    boolean bool;
    b b;
  }
  
  static {
    Unsafe unsafe = a;
    c c = null;
    if (unsafe != null)
      if (r1.a()) {
        if (c) {
          c = new c(a);
        } else if (d) {
          a a = new a(a);
        } 
      } else {
        b = new b(a);
      }  
    e = b;
  }
  
  private static final class a extends d {
    a(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final byte a(Object param1Object, long param1Long) {
      return h6.i ? h6.g(param1Object, param1Long) : h6.h(param1Object, param1Long);
    }
    
    public final void a(Object param1Object, long param1Long, byte param1Byte) {
      if (h6.i) {
        h6.a(param1Object, param1Long, param1Byte);
        return;
      } 
      h6.b(param1Object, param1Long, param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      a(param1Object, param1Long, Double.doubleToLongBits(param1Double));
    }
    
    public final void a(Object param1Object, long param1Long, float param1Float) {
      a(param1Object, param1Long, Float.floatToIntBits(param1Float));
    }
    
    public final void a(Object param1Object, long param1Long, boolean param1Boolean) {
      if (h6.i) {
        h6.b(param1Object, param1Long, param1Boolean);
        return;
      } 
      h6.c(param1Object, param1Long, param1Boolean);
    }
    
    public final boolean b(Object param1Object, long param1Long) {
      return h6.i ? h6.i(param1Object, param1Long) : h6.j(param1Object, param1Long);
    }
    
    public final float c(Object param1Object, long param1Long) {
      return Float.intBitsToFloat(e(param1Object, param1Long));
    }
    
    public final double d(Object param1Object, long param1Long) {
      return Double.longBitsToDouble(f(param1Object, param1Long));
    }
  }
  
  private static final class b extends d {
    b(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final byte a(Object param1Object, long param1Long) {
      return this.a.getByte(param1Object, param1Long);
    }
    
    public final void a(Object param1Object, long param1Long, byte param1Byte) {
      this.a.putByte(param1Object, param1Long, param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      this.a.putDouble(param1Object, param1Long, param1Double);
    }
    
    public final void a(Object param1Object, long param1Long, float param1Float) {
      this.a.putFloat(param1Object, param1Long, param1Float);
    }
    
    public final void a(Object param1Object, long param1Long, boolean param1Boolean) {
      this.a.putBoolean(param1Object, param1Long, param1Boolean);
    }
    
    public final boolean b(Object param1Object, long param1Long) {
      return this.a.getBoolean(param1Object, param1Long);
    }
    
    public final float c(Object param1Object, long param1Long) {
      return this.a.getFloat(param1Object, param1Long);
    }
    
    public final double d(Object param1Object, long param1Long) {
      return this.a.getDouble(param1Object, param1Long);
    }
  }
  
  private static final class c extends d {
    c(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final byte a(Object param1Object, long param1Long) {
      return h6.i ? h6.g(param1Object, param1Long) : h6.h(param1Object, param1Long);
    }
    
    public final void a(Object param1Object, long param1Long, byte param1Byte) {
      if (h6.i) {
        h6.a(param1Object, param1Long, param1Byte);
        return;
      } 
      h6.b(param1Object, param1Long, param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      a(param1Object, param1Long, Double.doubleToLongBits(param1Double));
    }
    
    public final void a(Object param1Object, long param1Long, float param1Float) {
      a(param1Object, param1Long, Float.floatToIntBits(param1Float));
    }
    
    public final void a(Object param1Object, long param1Long, boolean param1Boolean) {
      if (h6.i) {
        h6.b(param1Object, param1Long, param1Boolean);
        return;
      } 
      h6.c(param1Object, param1Long, param1Boolean);
    }
    
    public final boolean b(Object param1Object, long param1Long) {
      return h6.i ? h6.i(param1Object, param1Long) : h6.j(param1Object, param1Long);
    }
    
    public final float c(Object param1Object, long param1Long) {
      return Float.intBitsToFloat(e(param1Object, param1Long));
    }
    
    public final double d(Object param1Object, long param1Long) {
      return Double.longBitsToDouble(f(param1Object, param1Long));
    }
  }
  
  private static abstract class d {
    Unsafe a;
    
    d(Unsafe param1Unsafe) {
      this.a = param1Unsafe;
    }
    
    public abstract byte a(Object param1Object, long param1Long);
    
    public abstract void a(Object param1Object, long param1Long, byte param1Byte);
    
    public abstract void a(Object param1Object, long param1Long, double param1Double);
    
    public abstract void a(Object param1Object, long param1Long, float param1Float);
    
    public final void a(Object param1Object, long param1Long, int param1Int) {
      this.a.putInt(param1Object, param1Long, param1Int);
    }
    
    public final void a(Object param1Object, long param1Long1, long param1Long2) {
      this.a.putLong(param1Object, param1Long1, param1Long2);
    }
    
    public abstract void a(Object param1Object, long param1Long, boolean param1Boolean);
    
    public abstract boolean b(Object param1Object, long param1Long);
    
    public abstract float c(Object param1Object, long param1Long);
    
    public abstract double d(Object param1Object, long param1Long);
    
    public final int e(Object param1Object, long param1Long) {
      return this.a.getInt(param1Object, param1Long);
    }
    
    public final long f(Object param1Object, long param1Long) {
      return this.a.getLong(param1Object, param1Long);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/h6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */