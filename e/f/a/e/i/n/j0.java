package e.f.a.e.i.n;

public final class j0 extends h3<j0, j0.a> implements t4 {
  private static final j0 zzg;
  
  private static volatile d5<j0> zzh;
  
  private int zzc;
  
  private k0 zzd;
  
  private m0 zze;
  
  private r3<g0> zzf = h3.l();
  
  static {
    j0 j01 = new j0();
    zzg = j01;
    h3.a(j0.class, j01);
  }
  
  private final void a(k0 paramk0) {
    paramk0.getClass();
    this.zzd = paramk0;
    this.zzc |= 0x1;
  }
  
  private final void a(Iterable<? extends g0> paramIterable) {
    n();
    o1.a(paramIterable, this.zzf);
  }
  
  private final void n() {
    r3<g0> r31 = this.zzf;
    if (!r31.zza())
      this.zzf = h3.a(r31); 
  }
  
  public static a zza() {
    return (a)zzg.j();
  }
  
  protected final Object a(int paramInt, Object<j0> paramObject1, Object<j0> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/r0.a : [I
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
    //   63: getstatic e/f/a/e/i/n/j0.zzh : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/j0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/j0.zzh : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/j0.zzg : Le/f/a/e/i/n/j0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/j0.zzh : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/j0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/j0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/j0.zzg : Le/f/a/e/i/n/j0;
    //   115: areturn
    //   116: getstatic e/f/a/e/i/n/j0.zzg : Le/f/a/e/i/n/j0;
    //   119: ldc '   ??? ???'
    //   121: iconst_5
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
    //   140: dup
    //   141: iconst_3
    //   142: ldc 'zzf'
    //   144: aastore
    //   145: dup
    //   146: iconst_4
    //   147: ldc e/f/a/e/i/n/g0
    //   149: aastore
    //   150: invokestatic a : (Le/f/a/e/i/n/r4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   153: areturn
    //   154: new e/f/a/e/i/n/j0$a
    //   157: dup
    //   158: aconst_null
    //   159: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   162: areturn
    //   163: new e/f/a/e/i/n/j0
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
  
  public static final class a extends h3.b<j0, a> implements t4 {
    private a() {
      super(j0.m());
    }
    
    public final a a(k0 param1k0) {
      if (this.e) {
        h();
        this.e = false;
      } 
      j0.a((j0)this.d, param1k0);
      return this;
    }
    
    public final a a(Iterable<? extends g0> param1Iterable) {
      if (this.e) {
        h();
        this.e = false;
      } 
      j0.a((j0)this.d, param1Iterable);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */