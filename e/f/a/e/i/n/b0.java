package e.f.a.e.i.n;

public final class b0 extends h3<b0, b0.a> implements t4 {
  private static final b0 zzf;
  
  private static volatile d5<b0> zzg;
  
  private int zzc;
  
  private String zzd = "";
  
  private String zze = "";
  
  static {
    b0 b01 = new b0();
    zzf = b01;
    h3.a(b0.class, b01);
  }
  
  private final void a(String paramString) {
    paramString.getClass();
    this.zzc |= 0x1;
    this.zzd = paramString;
  }
  
  private final void b(String paramString) {
    paramString.getClass();
    this.zzc |= 0x2;
    this.zze = paramString;
  }
  
  public static a zza() {
    return (a)zzf.j();
  }
  
  protected final Object a(int paramInt, Object<b0> paramObject1, Object<b0> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/r0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 153, 2 -> 144, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/n/b0.zzg : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/b0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/b0.zzg : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/b0.zzf : Le/f/a/e/i/n/b0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/b0.zzg : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/b0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/b0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/b0.zzf : Le/f/a/e/i/n/b0;
    //   115: areturn
    //   116: getstatic e/f/a/e/i/n/b0.zzf : Le/f/a/e/i/n/b0;
    //   119: ldc '    ဈ ဈ'
    //   121: iconst_3
    //   122: anewarray java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: ldc 'zzc'
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: ldc 'zzd'
    //   134: aastore
    //   135: dup
    //   136: iconst_2
    //   137: ldc 'zze'
    //   139: aastore
    //   140: invokestatic a : (Le/f/a/e/i/n/r4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   143: areturn
    //   144: new e/f/a/e/i/n/b0$a
    //   147: dup
    //   148: aconst_null
    //   149: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   152: areturn
    //   153: new e/f/a/e/i/n/b0
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   74	78	104	finally
    //   84	99	104	finally
    //   99	102	104	finally
    //   105	108	104	finally
  }
  
  public static final class a extends h3.b<b0, a> implements t4 {
    private a() {
      super(b0.m());
    }
    
    public final a a(String param1String) {
      if (this.e) {
        h();
        this.e = false;
      } 
      b0.a((b0)this.d, param1String);
      return this;
    }
    
    public final a b(String param1String) {
      if (this.e) {
        h();
        this.e = false;
      } 
      b0.b((b0)this.d, param1String);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */