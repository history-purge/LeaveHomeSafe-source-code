package e.f.a.e.i.d;

import java.util.List;

public final class h5 extends f1<h5, h5.a> implements m2 {
  private static volatile u2<h5> zzbg;
  
  private static final h5 zzbir = new h5();
  
  private k1<b> zzbiq = f1.h();
  
  static {
    f1.a(h5.class, zzbir);
  }
  
  public static h5 a(byte[] paramArrayOfbyte) {
    return f1.<h5>b(zzbir, paramArrayOfbyte);
  }
  
  public static h5 j() {
    return zzbir;
  }
  
  protected final Object a(int paramInt, Object<h5> paramObject1, Object<h5> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/d/i5.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 148, 2 -> 139, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/d/h5.zzbg : Le/f/a/e/i/d/u2;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/d/h5
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/d/h5.zzbg : Le/f/a/e/i/d/u2;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/d/f1$b
    //   87: dup
    //   88: getstatic e/f/a/e/i/d/h5.zzbir : Le/f/a/e/i/d/h5;
    //   91: invokespecial <init> : (Le/f/a/e/i/d/f1;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/d/h5.zzbg : Le/f/a/e/i/d/u2;
    //   99: ldc e/f/a/e/i/d/h5
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/d/h5
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/d/h5.zzbir : Le/f/a/e/i/d/h5;
    //   115: areturn
    //   116: getstatic e/f/a/e/i/d/h5.zzbir : Le/f/a/e/i/d/h5;
    //   119: ldc '    '
    //   121: iconst_2
    //   122: anewarray java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: ldc 'zzbiq'
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: ldc e/f/a/e/i/d/h5$b
    //   134: aastore
    //   135: invokestatic a : (Le/f/a/e/i/d/k2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   138: areturn
    //   139: new e/f/a/e/i/d/h5$a
    //   142: dup
    //   143: aconst_null
    //   144: invokespecial <init> : (Le/f/a/e/i/d/i5;)V
    //   147: areturn
    //   148: new e/f/a/e/i/d/h5
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: areturn
    // Exception table:
    //   from	to	target	type
    //   74	78	104	finally
    //   84	99	104	finally
    //   99	102	104	finally
    //   105	108	104	finally
  }
  
  public final List<b> i() {
    return this.zzbiq;
  }
  
  public static final class a extends f1.a<h5, a> implements m2 {
    private a() {
      super(h5.k());
    }
  }
  
  public static final class b extends f1<b, b.a> implements m2 {
    private static volatile u2<b> zzbg;
    
    private static final b zzbiv = new b();
    
    private int zzbb;
    
    private String zzbis = "";
    
    private long zzbit;
    
    private long zzbiu;
    
    private int zzya;
    
    static {
      f1.a(b.class, zzbiv);
    }
    
    private final void a(long param1Long) {
      this.zzbb |= 0x4;
      this.zzbit = param1Long;
    }
    
    private final void a(String param1String) {
      if (param1String != null) {
        this.zzbb |= 0x2;
        this.zzbis = param1String;
        return;
      } 
      throw new NullPointerException();
    }
    
    private final void b(long param1Long) {
      this.zzbb |= 0x8;
      this.zzbiu = param1Long;
    }
    
    public static a n() {
      return (a)zzbiv.a(f1.e.e, null, null);
    }
    
    protected final Object a(int param1Int, Object<b> param1Object1, Object<b> param1Object2) {
      // Byte code:
      //   0: getstatic e/f/a/e/i/d/i5.a : [I
      //   3: iload_1
      //   4: iconst_1
      //   5: isub
      //   6: iaload
      //   7: tableswitch default -> 48, 1 -> 163, 2 -> 154, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
      //   48: new java/lang/UnsupportedOperationException
      //   51: dup
      //   52: invokespecial <init> : ()V
      //   55: athrow
      //   56: aconst_null
      //   57: areturn
      //   58: iconst_1
      //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   62: areturn
      //   63: getstatic e/f/a/e/i/d/h5$b.zzbg : Le/f/a/e/i/d/u2;
      //   66: astore_2
      //   67: aload_2
      //   68: ifnonnull -> 110
      //   71: ldc e/f/a/e/i/d/h5$b
      //   73: monitorenter
      //   74: getstatic e/f/a/e/i/d/h5$b.zzbg : Le/f/a/e/i/d/u2;
      //   77: astore_3
      //   78: aload_3
      //   79: astore_2
      //   80: aload_3
      //   81: ifnonnull -> 99
      //   84: new e/f/a/e/i/d/f1$b
      //   87: dup
      //   88: getstatic e/f/a/e/i/d/h5$b.zzbiv : Le/f/a/e/i/d/h5$b;
      //   91: invokespecial <init> : (Le/f/a/e/i/d/f1;)V
      //   94: astore_2
      //   95: aload_2
      //   96: putstatic e/f/a/e/i/d/h5$b.zzbg : Le/f/a/e/i/d/u2;
      //   99: ldc e/f/a/e/i/d/h5$b
      //   101: monitorexit
      //   102: aload_2
      //   103: areturn
      //   104: astore_2
      //   105: ldc e/f/a/e/i/d/h5$b
      //   107: monitorexit
      //   108: aload_2
      //   109: athrow
      //   110: aload_2
      //   111: areturn
      //   112: getstatic e/f/a/e/i/d/h5$b.zzbiv : Le/f/a/e/i/d/h5$b;
      //   115: areturn
      //   116: getstatic e/f/a/e/i/d/h5$b.zzbiv : Le/f/a/e/i/d/h5$b;
      //   119: ldc '     \\b'
      //   121: iconst_5
      //   122: anewarray java/lang/Object
      //   125: dup
      //   126: iconst_0
      //   127: ldc 'zzbb'
      //   129: aastore
      //   130: dup
      //   131: iconst_1
      //   132: ldc 'zzya'
      //   134: aastore
      //   135: dup
      //   136: iconst_2
      //   137: ldc 'zzbis'
      //   139: aastore
      //   140: dup
      //   141: iconst_3
      //   142: ldc 'zzbit'
      //   144: aastore
      //   145: dup
      //   146: iconst_4
      //   147: ldc 'zzbiu'
      //   149: aastore
      //   150: invokestatic a : (Le/f/a/e/i/d/k2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      //   153: areturn
      //   154: new e/f/a/e/i/d/h5$b$a
      //   157: dup
      //   158: aconst_null
      //   159: invokespecial <init> : (Le/f/a/e/i/d/i5;)V
      //   162: areturn
      //   163: new e/f/a/e/i/d/h5$b
      //   166: dup
      //   167: invokespecial <init> : ()V
      //   170: areturn
      // Exception table:
      //   from	to	target	type
      //   74	78	104	finally
      //   84	99	104	finally
      //   99	102	104	finally
      //   105	108	104	finally
    }
    
    public final int i() {
      return this.zzya;
    }
    
    public final boolean j() {
      return ((this.zzbb & 0x1) == 1);
    }
    
    public final String k() {
      return this.zzbis;
    }
    
    public final long l() {
      return this.zzbit;
    }
    
    public final long m() {
      return this.zzbiu;
    }
    
    public static final class a extends f1.a<b, a> implements m2 {
      private a() {
        super(h5.b.o());
      }
      
      public final a a(long param2Long) {
        g();
        h5.b.a((h5.b)this.d, param2Long);
        return this;
      }
      
      public final a a(String param2String) {
        g();
        h5.b.a((h5.b)this.d, param2String);
        return this;
      }
      
      public final a b(long param2Long) {
        g();
        h5.b.b((h5.b)this.d, param2Long);
        return this;
      }
    }
  }
  
  public static final class a extends f1.a<b, b.a> implements m2 {
    private a() {
      super(h5.b.o());
    }
    
    public final a a(long param1Long) {
      g();
      h5.b.a((h5.b)this.d, param1Long);
      return this;
    }
    
    public final a a(String param1String) {
      g();
      h5.b.a((h5.b)this.d, param1String);
      return this;
    }
    
    public final a b(long param1Long) {
      g();
      h5.b.b((h5.b)this.d, param1Long);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/h5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */