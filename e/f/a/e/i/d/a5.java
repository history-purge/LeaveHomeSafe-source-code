package e.f.a.e.i.d;

public final class a5 extends f1<a5, a5.a> implements m2 {
  private static volatile u2<a5> zzbg;
  
  private static final a5 zztx = new a5();
  
  private int zzbb;
  
  private int zztu;
  
  private String zztv = "";
  
  private String zztw = "";
  
  static {
    f1.a(a5.class, zztx);
  }
  
  protected final Object a(int paramInt, Object<a5> paramObject1, Object<a5> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/d/d5.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 158, 2 -> 149, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/d/a5.zzbg : Le/f/a/e/i/d/u2;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/d/a5
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/d/a5.zzbg : Le/f/a/e/i/d/u2;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/d/f1$b
    //   87: dup
    //   88: getstatic e/f/a/e/i/d/a5.zztx : Le/f/a/e/i/d/a5;
    //   91: invokespecial <init> : (Le/f/a/e/i/d/f1;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/d/a5.zzbg : Le/f/a/e/i/d/u2;
    //   99: ldc e/f/a/e/i/d/a5
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/d/a5
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/d/a5.zztx : Le/f/a/e/i/d/a5;
    //   115: areturn
    //   116: getstatic e/f/a/e/i/d/a5.zztx : Le/f/a/e/i/d/a5;
    //   119: ldc '     \\b\\b'
    //   121: iconst_4
    //   122: anewarray java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: ldc 'zzbb'
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: ldc 'zztu'
    //   134: aastore
    //   135: dup
    //   136: iconst_2
    //   137: ldc 'zztv'
    //   139: aastore
    //   140: dup
    //   141: iconst_3
    //   142: ldc 'zztw'
    //   144: aastore
    //   145: invokestatic a : (Le/f/a/e/i/d/k2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   148: areturn
    //   149: new e/f/a/e/i/d/a5$a
    //   152: dup
    //   153: aconst_null
    //   154: invokespecial <init> : (Le/f/a/e/i/d/d5;)V
    //   157: areturn
    //   158: new e/f/a/e/i/d/a5
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: areturn
    // Exception table:
    //   from	to	target	type
    //   74	78	104	finally
    //   84	99	104	finally
    //   99	102	104	finally
    //   105	108	104	finally
  }
  
  public static final class a extends f1.a<a5, a> implements m2 {
    private a() {
      super(a5.i());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */