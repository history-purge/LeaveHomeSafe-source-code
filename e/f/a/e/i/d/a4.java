package e.f.a.e.i.d;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class a4 {
  private static final Logger a;
  
  private static final Unsafe b;
  
  private static final Class<?> c;
  
  private static final boolean d;
  
  private static final boolean e;
  
  private static final d f;
  
  private static final boolean g;
  
  private static final boolean h;
  
  private static final long i;
  
  private static final long j;
  
  private static final boolean k;
  
  static {
    // Byte code:
    //   0: ldc e/f/a/e/i/d/a4
    //   2: invokevirtual getName : ()Ljava/lang/String;
    //   5: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   8: putstatic e/f/a/e/i/d/a4.a : Ljava/util/logging/Logger;
    //   11: invokestatic d : ()Lsun/misc/Unsafe;
    //   14: putstatic e/f/a/e/i/d/a4.b : Lsun/misc/Unsafe;
    //   17: invokestatic b : ()Ljava/lang/Class;
    //   20: putstatic e/f/a/e/i/d/a4.c : Ljava/lang/Class;
    //   23: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   26: invokestatic c : (Ljava/lang/Class;)Z
    //   29: putstatic e/f/a/e/i/d/a4.d : Z
    //   32: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   35: invokestatic c : (Ljava/lang/Class;)Z
    //   38: putstatic e/f/a/e/i/d/a4.e : Z
    //   41: getstatic e/f/a/e/i/d/a4.b : Lsun/misc/Unsafe;
    //   44: ifnonnull -> 52
    //   47: aconst_null
    //   48: astore_1
    //   49: goto -> 109
    //   52: invokestatic a : ()Z
    //   55: ifeq -> 98
    //   58: getstatic e/f/a/e/i/d/a4.d : Z
    //   61: ifeq -> 78
    //   64: new e/f/a/e/i/d/a4$b
    //   67: dup
    //   68: getstatic e/f/a/e/i/d/a4.b : Lsun/misc/Unsafe;
    //   71: invokespecial <init> : (Lsun/misc/Unsafe;)V
    //   74: astore_1
    //   75: goto -> 109
    //   78: getstatic e/f/a/e/i/d/a4.e : Z
    //   81: ifeq -> 47
    //   84: new e/f/a/e/i/d/a4$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/d/a4.b : Lsun/misc/Unsafe;
    //   91: invokespecial <init> : (Lsun/misc/Unsafe;)V
    //   94: astore_1
    //   95: goto -> 109
    //   98: new e/f/a/e/i/d/a4$c
    //   101: dup
    //   102: getstatic e/f/a/e/i/d/a4.b : Lsun/misc/Unsafe;
    //   105: invokespecial <init> : (Lsun/misc/Unsafe;)V
    //   108: astore_1
    //   109: aload_1
    //   110: putstatic e/f/a/e/i/d/a4.f : Le/f/a/e/i/d/a4$d;
    //   113: invokestatic f : ()Z
    //   116: putstatic e/f/a/e/i/d/a4.g : Z
    //   119: invokestatic e : ()Z
    //   122: putstatic e/f/a/e/i/d/a4.h : Z
    //   125: ldc [B
    //   127: invokestatic a : (Ljava/lang/Class;)I
    //   130: i2l
    //   131: putstatic e/f/a/e/i/d/a4.i : J
    //   134: ldc [Z
    //   136: invokestatic a : (Ljava/lang/Class;)I
    //   139: pop
    //   140: ldc [Z
    //   142: invokestatic b : (Ljava/lang/Class;)I
    //   145: pop
    //   146: ldc [I
    //   148: invokestatic a : (Ljava/lang/Class;)I
    //   151: pop
    //   152: ldc [I
    //   154: invokestatic b : (Ljava/lang/Class;)I
    //   157: pop
    //   158: ldc [J
    //   160: invokestatic a : (Ljava/lang/Class;)I
    //   163: pop
    //   164: ldc [J
    //   166: invokestatic b : (Ljava/lang/Class;)I
    //   169: pop
    //   170: ldc [F
    //   172: invokestatic a : (Ljava/lang/Class;)I
    //   175: pop
    //   176: ldc [F
    //   178: invokestatic b : (Ljava/lang/Class;)I
    //   181: pop
    //   182: ldc [D
    //   184: invokestatic a : (Ljava/lang/Class;)I
    //   187: pop
    //   188: ldc [D
    //   190: invokestatic b : (Ljava/lang/Class;)I
    //   193: pop
    //   194: ldc [Ljava/lang/Object;
    //   196: invokestatic a : (Ljava/lang/Class;)I
    //   199: pop
    //   200: ldc [Ljava/lang/Object;
    //   202: invokestatic b : (Ljava/lang/Class;)I
    //   205: pop
    //   206: invokestatic g : ()Ljava/lang/reflect/Field;
    //   209: invokestatic b : (Ljava/lang/reflect/Field;)J
    //   212: putstatic e/f/a/e/i/d/a4.j : J
    //   215: ldc java/lang/String
    //   217: ldc 'value'
    //   219: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   222: astore_1
    //   223: aload_1
    //   224: ifnull -> 239
    //   227: aload_1
    //   228: invokevirtual getType : ()Ljava/lang/Class;
    //   231: ldc [C
    //   233: if_acmpne -> 239
    //   236: goto -> 241
    //   239: aconst_null
    //   240: astore_1
    //   241: aload_1
    //   242: invokestatic b : (Ljava/lang/reflect/Field;)J
    //   245: pop2
    //   246: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
    //   249: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   252: if_acmpne -> 260
    //   255: iconst_1
    //   256: istore_0
    //   257: goto -> 262
    //   260: iconst_0
    //   261: istore_0
    //   262: iload_0
    //   263: putstatic e/f/a/e/i/d/a4.k : Z
    //   266: return
  }
  
  static byte a(byte[] paramArrayOfbyte, long paramLong) {
    return f.f(paramArrayOfbyte, i + paramLong);
  }
  
  private static int a(Class<?> paramClass) {
    return h ? f.a.arrayBaseOffset(paramClass) : -1;
  }
  
  static int a(Object paramObject, long paramLong) {
    return f.a(paramObject, paramLong);
  }
  
  static long a(Field paramField) {
    return f.a(paramField);
  }
  
  static long a(ByteBuffer paramByteBuffer) {
    return f.b(paramByteBuffer, j);
  }
  
  private static Field a(Class<?> paramClass, String paramString) {
    try {
      Field field = paramClass.getDeclaredField(paramString);
      return field;
    } finally {
      paramClass = null;
    } 
  }
  
  static void a(long paramLong, byte paramByte) {
    f.a(paramLong, paramByte);
  }
  
  private static void a(Object paramObject, long paramLong, byte paramByte) {
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = a(paramObject, l);
    int j = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    a(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  static void a(Object paramObject, long paramLong, double paramDouble) {
    f.a(paramObject, paramLong, paramDouble);
  }
  
  static void a(Object paramObject, long paramLong, float paramFloat) {
    f.a(paramObject, paramLong, paramFloat);
  }
  
  static void a(Object paramObject, long paramLong, int paramInt) {
    f.a(paramObject, paramLong, paramInt);
  }
  
  static void a(Object paramObject, long paramLong1, long paramLong2) {
    f.a(paramObject, paramLong1, paramLong2);
  }
  
  static void a(Object paramObject1, long paramLong, Object paramObject2) {
    f.a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  static void a(Object paramObject, long paramLong, boolean paramBoolean) {
    f.a(paramObject, paramLong, paramBoolean);
  }
  
  static void a(byte[] paramArrayOfbyte, long paramLong, byte paramByte) {
    f.a(paramArrayOfbyte, i + paramLong, paramByte);
  }
  
  static void a(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, long paramLong3) {
    f.a(paramArrayOfbyte, paramLong1, paramLong2, paramLong3);
  }
  
  private static int b(Class<?> paramClass) {
    return h ? f.a.arrayIndexScale(paramClass) : -1;
  }
  
  static long b(Object paramObject, long paramLong) {
    return f.b(paramObject, paramLong);
  }
  
  private static long b(Field paramField) {
    if (paramField != null) {
      d d1 = f;
      if (d1 != null)
        return d1.a(paramField); 
    } 
    return -1L;
  }
  
  private static void b(Object paramObject, long paramLong, byte paramByte) {
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = a(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    a(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  private static void b(Object paramObject, long paramLong, boolean paramBoolean) {
    a(paramObject, paramLong, (byte)paramBoolean);
  }
  
  static boolean b() {
    return h;
  }
  
  private static void c(Object paramObject, long paramLong, boolean paramBoolean) {
    b(paramObject, paramLong, (byte)paramBoolean);
  }
  
  static boolean c() {
    return g;
  }
  
  private static boolean c(Class<?> paramClass) {
    if (!u.a())
      return false; 
    try {
      Class<?> clazz = c;
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
  
  static boolean c(Object paramObject, long paramLong) {
    return f.c(paramObject, paramLong);
  }
  
  static float d(Object paramObject, long paramLong) {
    return f.d(paramObject, paramLong);
  }
  
  static Unsafe d() {
    try {
      return AccessController.<Unsafe>doPrivileged(new b4());
    } finally {
      Exception exception = null;
    } 
  }
  
  static double e(Object paramObject, long paramLong) {
    return f.e(paramObject, paramLong);
  }
  
  private static boolean e() {
    Unsafe unsafe = b;
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
      if (u.a())
        return true; 
      return true;
    } finally {
      Exception exception = null;
      Logger logger = a;
      Level level = Level.WARNING;
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      stringBuilder.append(str);
      logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
    } 
  }
  
  static Object f(Object paramObject, long paramLong) {
    return f.a.getObject(paramObject, paramLong);
  }
  
  private static boolean f() {
    Unsafe unsafe = b;
    if (unsafe == null)
      return false; 
    try {
      Class<?> clazz = unsafe.getClass();
      clazz.getMethod("objectFieldOffset", new Class[] { Field.class });
      clazz.getMethod("getLong", new Class[] { Object.class, long.class });
      if (g() == null)
        return false; 
      if (u.a())
        return true; 
      return true;
    } finally {
      Exception exception = null;
      Logger logger = a;
      Level level = Level.WARNING;
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      stringBuilder.append(str);
      logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
    } 
  }
  
  private static byte g(Object paramObject, long paramLong) {
    return (byte)(a(paramObject, 0xFFFFFFFFFFFFFFFCL & paramLong) >>> (int)(((paramLong ^ 0xFFFFFFFFFFFFFFFFL) & 0x3L) << 3L));
  }
  
  private static Field g() {
    if (u.a()) {
      Field field1 = a(Buffer.class, "effectiveDirectAddress");
      if (field1 != null)
        return field1; 
    } 
    Field field = a(Buffer.class, "address");
    return (field != null && field.getType() == long.class) ? field : null;
  }
  
  private static byte h(Object paramObject, long paramLong) {
    return (byte)(a(paramObject, 0xFFFFFFFFFFFFFFFCL & paramLong) >>> (int)((paramLong & 0x3L) << 3L));
  }
  
  private static boolean i(Object paramObject, long paramLong) {
    return (g(paramObject, paramLong) != 0);
  }
  
  private static boolean j(Object paramObject, long paramLong) {
    return (h(paramObject, paramLong) != 0);
  }
  
  static final class a extends d {
    a(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final void a(long param1Long, byte param1Byte) {
      Memory.pokeByte((int)(param1Long & 0xFFFFFFFFFFFFFFFFL), param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, byte param1Byte) {
      if (a4.a()) {
        a4.c(param1Object, param1Long, param1Byte);
        return;
      } 
      a4.d(param1Object, param1Long, param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      a(param1Object, param1Long, Double.doubleToLongBits(param1Double));
    }
    
    public final void a(Object param1Object, long param1Long, float param1Float) {
      a(param1Object, param1Long, Float.floatToIntBits(param1Float));
    }
    
    public final void a(Object param1Object, long param1Long, boolean param1Boolean) {
      if (a4.a()) {
        a4.d(param1Object, param1Long, param1Boolean);
        return;
      } 
      a4.e(param1Object, param1Long, param1Boolean);
    }
    
    public final void a(byte[] param1ArrayOfbyte, long param1Long1, long param1Long2, long param1Long3) {
      Memory.pokeByteArray((int)(param1Long2 & 0xFFFFFFFFFFFFFFFFL), param1ArrayOfbyte, (int)param1Long1, (int)param1Long3);
    }
    
    public final boolean c(Object param1Object, long param1Long) {
      return a4.a() ? a4.m(param1Object, param1Long) : a4.n(param1Object, param1Long);
    }
    
    public final float d(Object param1Object, long param1Long) {
      return Float.intBitsToFloat(a(param1Object, param1Long));
    }
    
    public final double e(Object param1Object, long param1Long) {
      return Double.longBitsToDouble(b(param1Object, param1Long));
    }
    
    public final byte f(Object param1Object, long param1Long) {
      return a4.a() ? a4.k(param1Object, param1Long) : a4.l(param1Object, param1Long);
    }
  }
  
  static final class b extends d {
    b(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final void a(long param1Long, byte param1Byte) {
      Memory.pokeByte(param1Long, param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, byte param1Byte) {
      if (a4.a()) {
        a4.c(param1Object, param1Long, param1Byte);
        return;
      } 
      a4.d(param1Object, param1Long, param1Byte);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      a(param1Object, param1Long, Double.doubleToLongBits(param1Double));
    }
    
    public final void a(Object param1Object, long param1Long, float param1Float) {
      a(param1Object, param1Long, Float.floatToIntBits(param1Float));
    }
    
    public final void a(Object param1Object, long param1Long, boolean param1Boolean) {
      if (a4.a()) {
        a4.d(param1Object, param1Long, param1Boolean);
        return;
      } 
      a4.e(param1Object, param1Long, param1Boolean);
    }
    
    public final void a(byte[] param1ArrayOfbyte, long param1Long1, long param1Long2, long param1Long3) {
      Memory.pokeByteArray(param1Long2, param1ArrayOfbyte, (int)param1Long1, (int)param1Long3);
    }
    
    public final boolean c(Object param1Object, long param1Long) {
      return a4.a() ? a4.m(param1Object, param1Long) : a4.n(param1Object, param1Long);
    }
    
    public final float d(Object param1Object, long param1Long) {
      return Float.intBitsToFloat(a(param1Object, param1Long));
    }
    
    public final double e(Object param1Object, long param1Long) {
      return Double.longBitsToDouble(b(param1Object, param1Long));
    }
    
    public final byte f(Object param1Object, long param1Long) {
      return a4.a() ? a4.k(param1Object, param1Long) : a4.l(param1Object, param1Long);
    }
  }
  
  static final class c extends d {
    c(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final void a(long param1Long, byte param1Byte) {
      this.a.putByte(param1Long, param1Byte);
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
    
    public final void a(byte[] param1ArrayOfbyte, long param1Long1, long param1Long2, long param1Long3) {
      this.a.copyMemory(param1ArrayOfbyte, a4.h() + param1Long1, null, param1Long2, param1Long3);
    }
    
    public final boolean c(Object param1Object, long param1Long) {
      return this.a.getBoolean(param1Object, param1Long);
    }
    
    public final float d(Object param1Object, long param1Long) {
      return this.a.getFloat(param1Object, param1Long);
    }
    
    public final double e(Object param1Object, long param1Long) {
      return this.a.getDouble(param1Object, param1Long);
    }
    
    public final byte f(Object param1Object, long param1Long) {
      return this.a.getByte(param1Object, param1Long);
    }
  }
  
  static abstract class d {
    Unsafe a;
    
    d(Unsafe param1Unsafe) {
      this.a = param1Unsafe;
    }
    
    public final int a(Object param1Object, long param1Long) {
      return this.a.getInt(param1Object, param1Long);
    }
    
    public final long a(Field param1Field) {
      return this.a.objectFieldOffset(param1Field);
    }
    
    public abstract void a(long param1Long, byte param1Byte);
    
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
    
    public abstract void a(byte[] param1ArrayOfbyte, long param1Long1, long param1Long2, long param1Long3);
    
    public final long b(Object param1Object, long param1Long) {
      return this.a.getLong(param1Object, param1Long);
    }
    
    public abstract boolean c(Object param1Object, long param1Long);
    
    public abstract float d(Object param1Object, long param1Long);
    
    public abstract double e(Object param1Object, long param1Long);
    
    public abstract byte f(Object param1Object, long param1Long);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */