package e.f.a.e.i.n;

public final class m0 extends h3<m0, m0.a> implements t4 {
  private static final m0 zzf;
  
  private static volatile d5<m0> zzg;
  
  private int zzc;
  
  private long zzd;
  
  private long zze;
  
  static {
    m0 m01 = new m0();
    zzf = m01;
    h3.a(m0.class, m01);
  }
  
  protected final Object a(int paramInt, Object<m0> paramObject1, Object<m0> paramObject2) {
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
    //   63: getstatic e/f/a/e/i/n/m0.zzg : Le/f/a/e/i/n/d5;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnonnull -> 110
    //   71: ldc e/f/a/e/i/n/m0
    //   73: monitorenter
    //   74: getstatic e/f/a/e/i/n/m0.zzg : Le/f/a/e/i/n/d5;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: ifnonnull -> 99
    //   84: new e/f/a/e/i/n/h3$a
    //   87: dup
    //   88: getstatic e/f/a/e/i/n/m0.zzf : Le/f/a/e/i/n/m0;
    //   91: invokespecial <init> : (Le/f/a/e/i/n/h3;)V
    //   94: astore_2
    //   95: aload_2
    //   96: putstatic e/f/a/e/i/n/m0.zzg : Le/f/a/e/i/n/d5;
    //   99: ldc e/f/a/e/i/n/m0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: astore_2
    //   105: ldc e/f/a/e/i/n/m0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: aload_2
    //   111: areturn
    //   112: getstatic e/f/a/e/i/n/m0.zzf : Le/f/a/e/i/n/m0;
    //   115: areturn
    //   116: getstatic e/f/a/e/i/n/m0.zzf : Le/f/a/e/i/n/m0;
    //   119: ldc '    ဂ ဂ'
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
    //   144: new e/f/a/e/i/n/m0$a
    //   147: dup
    //   148: aconst_null
    //   149: invokespecial <init> : (Le/f/a/e/i/n/r0;)V
    //   152: areturn
    //   153: new e/f/a/e/i/n/m0
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
  
  public static final class a extends h3.b<m0, a> implements t4 {
    private a() {
      super(m0.zza());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */