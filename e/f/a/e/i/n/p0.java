package e.f.a.e.i.n;

public final class p0 extends h3<p0, p0.a> implements t4 {
  private static final p0 zzi;
  
  private static volatile d5<p0> zzj;
  
  private int zzc;
  
  private f0 zzd;
  
  private l0 zze;
  
  private j0 zzf;
  
  private int zzg;
  
  private boolean zzh;
  
  static {
    p0 p01 = new p0();
    zzi = p01;
    h3.a(p0.class, p01);
  }
  
  private final void a(j0 paramj0) {
    paramj0.getClass();
    this.zzf = paramj0;
    this.zzc |= 0x4;
  }
  
  public static a zza() {
    return (a)zzi.j();
  }
  
  protected final Object a(int paramInt, Object<p0> paramObject1, Object<p0> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/r0.a : [I
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
    //   63: getstatic e/f/a/e/i/n/p0.zzj : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/p0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/p0.zzj : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/p0.zzi : Le/f/a/e/i/n/p0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/p0.zzj : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/p0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/p0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/p0.zzi : Le/f/a/e/i/n/p0;
    //   115: areturn
    //   116: getstatic e/f/a/e/i/n/p0.zzi : Le/f/a/e/i/n/p0;
    //   119: ldc '    ??? ????????????'
    //   121: bipush #6
    //   123: anewarray java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: ldc 'zzc'
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: ldc 'zzd'
    //   135: aastore
    //   136: dup
    //   137: iconst_2
    //   138: ldc 'zze'
    //   140: aastore
    //   141: dup
    //   142: iconst_3
    //   143: ldc 'zzf'
    //   145: aastore
    //   146: dup
    //   147: iconst_4
    //   148: ldc 'zzg'
    //   150: aastore
    //   151: dup
    //   152: iconst_5
    //   153: ldc 'zzh'
    //   155: aastore
    //   156: invokestatic a : (Le/f/a/e/i/n/r4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   159: areturn
    //   160: new e/f/a/e/i/n/p0$a
    //   163: dup
    //   164: aconst_null
    //   165: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   168: areturn
    //   169: new e/f/a/e/i/n/p0
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
  
  public static final class a extends h3.b<p0, a> implements t4 {
    private a() {
      super(p0.m());
    }
    
    public final a a(j0 param1j0) {
      if (this.e) {
        h();
        this.e = false;
      } 
      p0.a((p0)this.d, param1j0);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */