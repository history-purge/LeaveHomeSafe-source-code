package e.f.a.e.i.n;

public final class h0 extends h3<h0, h0.a> implements t4 {
  private static final h0 zzj;
  
  private static volatile d5<h0> zzk;
  
  private int zzc;
  
  private int zzd;
  
  private int zze;
  
  private int zzf;
  
  private boolean zzg;
  
  private boolean zzh;
  
  private float zzi;
  
  static {
    h0 h01 = new h0();
    zzj = h01;
    h3.a(h0.class, h01);
  }
  
  protected final Object a(int paramInt, Object<h0> paramObject1, Object<h0> paramObject2) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/r0.a : [I
    //   3: iload_1
    //   4: iconst_1
    //   5: isub
    //   6: iaload
    //   7: tableswitch default -> 48, 1 -> 204, 2 -> 195, 3 -> 116, 4 -> 112, 5 -> 63, 6 -> 58, 7 -> 56
    //   48: new java/lang/UnsupportedOperationException
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: aconst_null
    //   57: areturn
    //   58: iconst_1
    //   59: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   62: areturn
    //   63: getstatic e/f/a/e/i/n/h0.zzk : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/h0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/h0.zzk : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/h0.zzj : Le/f/a/e/i/n/h0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/h0.zzk : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/h0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/h0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/h0.zzj : Le/f/a/e/i/n/h0;
    //   115: areturn
    //   116: invokestatic zzb : ()Le/f/a/e/i/n/m3;
    //   119: astore_2
    //   120: invokestatic zzb : ()Le/f/a/e/i/n/m3;
    //   123: astore_3
    //   124: invokestatic zzb : ()Le/f/a/e/i/n/m3;
    //   127: astore #4
    //   129: getstatic e/f/a/e/i/n/h0.zzj : Le/f/a/e/i/n/h0;
    //   132: ldc '    ဌ ဌဌဇဇခ'
    //   134: bipush #10
    //   136: anewarray java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: ldc 'zzc'
    //   143: aastore
    //   144: dup
    //   145: iconst_1
    //   146: ldc 'zzd'
    //   148: aastore
    //   149: dup
    //   150: iconst_2
    //   151: aload_2
    //   152: aastore
    //   153: dup
    //   154: iconst_3
    //   155: ldc 'zze'
    //   157: aastore
    //   158: dup
    //   159: iconst_4
    //   160: aload_3
    //   161: aastore
    //   162: dup
    //   163: iconst_5
    //   164: ldc 'zzf'
    //   166: aastore
    //   167: dup
    //   168: bipush #6
    //   170: aload #4
    //   172: aastore
    //   173: dup
    //   174: bipush #7
    //   176: ldc 'zzg'
    //   178: aastore
    //   179: dup
    //   180: bipush #8
    //   182: ldc 'zzh'
    //   184: aastore
    //   185: dup
    //   186: bipush #9
    //   188: ldc 'zzi'
    //   190: aastore
    //   191: invokestatic a : (Le/f/a/e/i/n/r4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   194: areturn
    //   195: new e/f/a/e/i/n/h0$a
    //   198: dup
    //   199: aconst_null
    //   200: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   203: areturn
    //   204: new e/f/a/e/i/n/h0
    //   207: dup
    //   208: invokespecial <init> : ()V
    //   211: areturn
    // Exception table:
    //   from	to	target	type
    //   74	78	104	finally
    //   84	99	104	finally
    //   99	102	104	finally
    //   105	108	104	finally
  }
  
  public static final class a extends h3.b<h0, a> implements t4 {
    private a() {
      super(h0.m());
    }
  }
  
  public enum b implements k3 {
    c(0),
    d(1),
    e(2);
    
    private final int zze;
    
    static {
      new x0();
    }
    
    b(int param1Int1) {
      this.zze = param1Int1;
    }
    
    public static b f(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? null : e) : d) : c;
    }
    
    public static m3 zzb() {
      return y0.a;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(b.class.getName());
      stringBuilder.append('@');
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" number=");
      stringBuilder.append(this.zze);
      stringBuilder.append(" name=");
      stringBuilder.append(name());
      stringBuilder.append('>');
      return stringBuilder.toString();
    }
    
    public final int zza() {
      return this.zze;
    }
  }
  
  public enum c implements k3 {
    c(0),
    d(1),
    e(2),
    f(3);
    
    private final int zzf;
    
    static {
      new a1();
    }
    
    c(int param1Int1) {
      this.zzf = param1Int1;
    }
    
    public static c f(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? null : f) : e) : d) : c;
    }
    
    public static m3 zzb() {
      return z0.a;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(c.class.getName());
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
  
  public enum d implements k3 {
    c(0),
    d(1),
    e(2),
    f(3);
    
    private final int zzf;
    
    static {
      new b1();
    }
    
    d(int param1Int1) {
      this.zzf = param1Int1;
    }
    
    public static d f(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? ((param1Int != 3) ? null : f) : e) : d) : c;
    }
    
    public static m3 zzb() {
      return c1.a;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(d.class.getName());
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
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */