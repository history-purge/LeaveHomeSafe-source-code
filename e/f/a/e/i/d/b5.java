package e.f.a.e.i.d;

public final class b5 extends f1<b5, b5.a> implements m2 {
  private static final b5 zzbfc = new b5();
  
  private static volatile u2<b5> zzbg;
  
  private int zzbb;
  
  private int zzbfa = -1;
  
  private int zzbfb;
  
  static {
    f1.a(b5.class, zzbfc);
  }
  
  protected final Object a(int paramInt, Object<b5> paramObject1, Object<b5> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/d/d5.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 169, 2 -> 160, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/d/b5.zzbg : Le/f/a/e/i/d/u2;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/d/b5
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/d/b5.zzbg : Le/f/a/e/i/d/u2;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/d/f1$b
    //   87: dup
    //   88: getstatic e/f/a/e/i/d/b5.zzbfc : Le/f/a/e/i/d/b5;
    //   91: invokespecial <init> : (Le/f/a/e/i/d/f1;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/d/b5.zzbg : Le/f/a/e/i/d/u2;
    //   99: ldc e/f/a/e/i/d/b5
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/d/b5
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/d/b5.zzbfc : Le/f/a/e/i/d/b5;
    //   115: areturn
    //   116: invokestatic f : ()Le/f/a/e/i/d/j1;
    //   119: astore_2
    //   120: invokestatic f : ()Le/f/a/e/i/d/j1;
    //   123: astore_3
    //   124: getstatic e/f/a/e/i/d/b5.zzbfc : Le/f/a/e/i/d/b5;
    //   127: ldc '    \\f \\f'
    //   129: iconst_5
    //   130: anewarray java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: ldc 'zzbb'
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: ldc 'zzbfa'
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: aload_2
    //   146: aastore
    //   147: dup
    //   148: iconst_3
    //   149: ldc 'zzbfb'
    //   151: aastore
    //   152: dup
    //   153: iconst_4
    //   154: aload_3
    //   155: aastore
    //   156: invokestatic a : (Le/f/a/e/i/d/k2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   159: areturn
    //   160: new e/f/a/e/i/d/b5$a
    //   163: dup
    //   164: aconst_null
    //   165: invokespecial <init> : (Le/f/a/e/i/d/d5;)V
    //   168: areturn
    //   169: new e/f/a/e/i/d/b5
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   74	78	104	finally
    //   84	99	104	finally
    //   99	102	104	finally
    //   105	108	104	finally
  }
  
  public static final class a extends f1.a<b5, a> implements m2 {
    private a() {
      super(b5.i());
    }
  }
  
  public enum b implements i1 {
    c(0),
    d(1),
    e(2),
    f(3),
    g(4),
    h(5),
    i(6),
    j(7),
    k(8),
    l(9),
    m(10),
    n(11),
    o(12),
    p(13),
    q(14),
    r(15),
    s(16),
    t(17),
    u(18),
    v(19),
    w(100);
    
    private static final j1<b> x = new e5();
    
    private final int value;
    
    static {
    
    }
    
    b(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static b f(int param1Int) {
      if (param1Int != 100) {
        switch (param1Int) {
          default:
            return null;
          case 19:
            return v;
          case 18:
            return u;
          case 17:
            return t;
          case 16:
            return s;
          case 15:
            return r;
          case 14:
            return q;
          case 13:
            return p;
          case 12:
            return o;
          case 11:
            return n;
          case 10:
            return m;
          case 9:
            return l;
          case 8:
            return k;
          case 7:
            return j;
          case 6:
            return i;
          case 5:
            return h;
          case 4:
            return g;
          case 3:
            return f;
          case 2:
            return e;
          case 1:
            return d;
          case 0:
            break;
        } 
        return c;
      } 
      return w;
    }
    
    public static j1<b> f() {
      return x;
    }
    
    public final int g() {
      return this.value;
    }
  }
  
  public enum c implements i1 {
    c(-1),
    d(0),
    e(1),
    f(2),
    g(3),
    h(4),
    i(5),
    j(6),
    k(7),
    l(8),
    m(9),
    n(10),
    o(11),
    p(12),
    q(13),
    r(14),
    s(15),
    t(16),
    u(17);
    
    private static final j1<c> v = new f5();
    
    private final int value;
    
    static {
    
    }
    
    c(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static c f(int param1Int) {
      switch (param1Int) {
        default:
          return null;
        case 17:
          return u;
        case 16:
          return t;
        case 15:
          return s;
        case 14:
          return r;
        case 13:
          return q;
        case 12:
          return p;
        case 11:
          return o;
        case 10:
          return n;
        case 9:
          return m;
        case 8:
          return l;
        case 7:
          return k;
        case 6:
          return j;
        case 5:
          return i;
        case 4:
          return h;
        case 3:
          return g;
        case 2:
          return f;
        case 1:
          return e;
        case 0:
          return d;
        case -1:
          break;
      } 
      return c;
    }
    
    public static j1<c> f() {
      return v;
    }
    
    public final int g() {
      return this.value;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/b5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */