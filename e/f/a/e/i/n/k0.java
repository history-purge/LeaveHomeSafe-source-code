package e.f.a.e.i.n;

public final class k0 extends h3<k0, k0.b> implements t4 {
  private static final k0 zzi;
  
  private static volatile d5<k0> zzj;
  
  private int zzc;
  
  private int zzd;
  
  private long zze;
  
  private long zzf;
  
  private long zzg;
  
  private long zzh;
  
  static {
    k0 k01 = new k0();
    zzi = k01;
    h3.a(k0.class, k01);
  }
  
  private final void a(long paramLong) {
    this.zzc |= 0x2;
    this.zze = paramLong;
  }
  
  private final void b(long paramLong) {
    this.zzc |= 0x4;
    this.zzf = paramLong;
  }
  
  private final void c(long paramLong) {
    this.zzc |= 0x8;
    this.zzg = paramLong;
  }
  
  private final void d(long paramLong) {
    this.zzc |= 0x10;
    this.zzh = paramLong;
  }
  
  public static b zza() {
    return (b)zzi.j();
  }
  
  protected final Object a(int paramInt, Object<k0> paramObject1, Object<k0> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/r0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 178, 2 -> 169, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/n/k0.zzj : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/k0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/k0.zzj : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/k0.zzi : Le/f/a/e/i/n/k0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/k0.zzj : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/k0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/k0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/k0.zzi : Le/f/a/e/i/n/k0;
    //   115: areturn
    //   116: invokestatic zzb : ()Le/f/a/e/i/n/m3;
    //   119: astore_2
    //   120: getstatic e/f/a/e/i/n/k0.zzi : Le/f/a/e/i/n/k0;
    //   123: ldc '    ??? ????????????'
    //   125: bipush #7
    //   127: anewarray java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: ldc 'zzc'
    //   134: aastore
    //   135: dup
    //   136: iconst_1
    //   137: ldc 'zzd'
    //   139: aastore
    //   140: dup
    //   141: iconst_2
    //   142: aload_2
    //   143: aastore
    //   144: dup
    //   145: iconst_3
    //   146: ldc 'zze'
    //   148: aastore
    //   149: dup
    //   150: iconst_4
    //   151: ldc 'zzf'
    //   153: aastore
    //   154: dup
    //   155: iconst_5
    //   156: ldc 'zzh'
    //   158: aastore
    //   159: dup
    //   160: bipush #6
    //   162: ldc 'zzg'
    //   164: aastore
    //   165: invokestatic a : (Le/f/a/e/i/n/r4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   168: areturn
    //   169: new e/f/a/e/i/n/k0$b
    //   172: dup
    //   173: aconst_null
    //   174: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   177: areturn
    //   178: new e/f/a/e/i/n/k0
    //   181: dup
    //   182: invokespecial <init> : ()V
    //   185: areturn
    // Exception table:
    //   from	to	target	type
    //   74	78	104	finally
    //   84	99	104	finally
    //   99	102	104	finally
    //   105	108	104	finally
  }
  
  public enum a implements k3 {
    c(0),
    d(1),
    e(2),
    f(3);
    
    private final int zzf;
    
    static {
      new e1();
    }
    
    a(int param1Int1) {
      this.zzf = param1Int1;
    }
    
    public static a f(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? null : f) : e) : d) : c;
    }
    
    public static m3 zzb() {
      return d1.a;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(a.class.getName());
      stringBuilder.append('@');
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" number=");
      stringBuilder.append(this.zzf);
      stringBuilder.append(" name=");
      stringBuilder.append(name());
      stringBuilder.append('>');
      return stringBuilder.toString();
    }
    
    public final int zza() {
      return this.zzf;
    }
  }
  
  public static final class b extends h3.b<k0, b> implements t4 {
    private b() {
      super(k0.m());
    }
    
    public final b a(long param1Long) {
      if (this.e) {
        h();
        this.e = false;
      } 
      k0.a((k0)this.d, param1Long);
      return this;
    }
    
    public final b b(long param1Long) {
      if (this.e) {
        h();
        this.e = false;
      } 
      k0.b((k0)this.d, param1Long);
      return this;
    }
    
    public final b c(long param1Long) {
      if (this.e) {
        h();
        this.e = false;
      } 
      k0.c((k0)this.d, param1Long);
      return this;
    }
    
    public final b d(long param1Long) {
      if (this.e) {
        h();
        this.e = false;
      } 
      k0.d((k0)this.d, param1Long);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */