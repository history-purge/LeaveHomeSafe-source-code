package e.f.a.e.i.n;

public final class g0 extends h3<g0, g0.b> implements t4 {
  private static final g0 zzl;
  
  private static volatile d5<g0> zzm;
  
  private int zzc;
  
  private String zzd = "";
  
  private String zze = "";
  
  private r3<String> zzf = h3.l();
  
  private int zzg;
  
  private String zzh = "";
  
  private long zzi;
  
  private long zzj;
  
  private r3<o0> zzk = h3.l();
  
  static {
    g0 g01 = new g0();
    zzl = g01;
    h3.a(g0.class, g01);
  }
  
  private final void a(long paramLong) {
    this.zzc |= 0x10;
    this.zzi = paramLong;
  }
  
  private final void a(Iterable<? extends o0> paramIterable) {
    r3<o0> r31 = this.zzk;
    if (!r31.zza())
      this.zzk = h3.a(r31); 
    o1.a(paramIterable, this.zzk);
  }
  
  private final void a(String paramString) {
    paramString.getClass();
    this.zzc |= 0x1;
    this.zzd = paramString;
  }
  
  private final void b(long paramLong) {
    this.zzc |= 0x20;
    this.zzj = paramLong;
  }
  
  public static b zza() {
    return (b)zzl.j();
  }
  
  protected final Object a(int paramInt, Object<g0> paramObject1, Object<g0> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/r0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 202, 2 -> 193, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/n/g0.zzm : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/g0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/g0.zzm : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/g0.zzl : Le/f/a/e/i/n/g0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/g0.zzm : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/g0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/g0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/g0.zzl : Le/f/a/e/i/n/g0;
    //   115: areturn
    //   116: invokestatic zzb : ()Le/f/a/e/i/n/m3;
    //   119: astore_2
    //   120: getstatic e/f/a/e/i/n/g0.zzl : Le/f/a/e/i/n/g0;
    //   123: ldc '\\b \\b\\b  ??? ???????????????\\b'
    //   125: bipush #11
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
    //   142: ldc 'zze'
    //   144: aastore
    //   145: dup
    //   146: iconst_3
    //   147: ldc 'zzf'
    //   149: aastore
    //   150: dup
    //   151: iconst_4
    //   152: ldc 'zzg'
    //   154: aastore
    //   155: dup
    //   156: iconst_5
    //   157: aload_2
    //   158: aastore
    //   159: dup
    //   160: bipush #6
    //   162: ldc 'zzh'
    //   164: aastore
    //   165: dup
    //   166: bipush #7
    //   168: ldc 'zzi'
    //   170: aastore
    //   171: dup
    //   172: bipush #8
    //   174: ldc 'zzj'
    //   176: aastore
    //   177: dup
    //   178: bipush #9
    //   180: ldc 'zzk'
    //   182: aastore
    //   183: dup
    //   184: bipush #10
    //   186: ldc e/f/a/e/i/n/o0
    //   188: aastore
    //   189: invokestatic a : (Le/f/a/e/i/n/r4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   192: areturn
    //   193: new e/f/a/e/i/n/g0$b
    //   196: dup
    //   197: aconst_null
    //   198: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   201: areturn
    //   202: new e/f/a/e/i/n/g0
    //   205: dup
    //   206: invokespecial <init> : ()V
    //   209: areturn
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
      new w0();
    }
    
    a(int param1Int1) {
      this.zzf = param1Int1;
    }
    
    public static a f(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? null : f) : e) : d) : c;
    }
    
    public static m3 zzb() {
      return v0.a;
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
  
  public static final class b extends h3.b<g0, b> implements t4 {
    private b() {
      super(g0.m());
    }
    
    public final b a(long param1Long) {
      if (this.e) {
        h();
        this.e = false;
      } 
      g0.a((g0)this.d, param1Long);
      return this;
    }
    
    public final b a(Iterable<? extends o0> param1Iterable) {
      if (this.e) {
        h();
        this.e = false;
      } 
      g0.a((g0)this.d, param1Iterable);
      return this;
    }
    
    public final b a(String param1String) {
      if (this.e) {
        h();
        this.e = false;
      } 
      g0.a((g0)this.d, param1String);
      return this;
    }
    
    public final b b(long param1Long) {
      if (this.e) {
        h();
        this.e = false;
      } 
      g0.b((g0)this.d, param1Long);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */