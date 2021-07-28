package e.f.a.e.i.n;

public final class x {
  private static final w a;
  
  static {
    // Byte code:
    //   0: invokestatic a : ()Ljava/lang/Integer;
    //   3: astore_1
    //   4: aload_1
    //   5: ifnull -> 28
    //   8: aload_1
    //   9: invokevirtual intValue : ()I
    //   12: bipush #19
    //   14: if_icmplt -> 28
    //   17: new e/f/a/e/i/n/q0
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore_0
    //   25: goto -> 144
    //   28: ldc 'com.google.devtools.build.android.desugar.runtime.twr_disable_mimic'
    //   30: invokestatic getBoolean : (Ljava/lang/String;)Z
    //   33: iconst_1
    //   34: ixor
    //   35: ifeq -> 49
    //   38: new e/f/a/e/i/n/a0
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore_0
    //   46: goto -> 144
    //   49: new e/f/a/e/i/n/x$a
    //   52: dup
    //   53: invokespecial <init> : ()V
    //   56: astore_0
    //   57: goto -> 144
    //   60: astore_0
    //   61: goto -> 67
    //   64: astore_0
    //   65: aconst_null
    //   66: astore_1
    //   67: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   70: astore_2
    //   71: ldc e/f/a/e/i/n/x$a
    //   73: invokevirtual getName : ()Ljava/lang/String;
    //   76: astore_3
    //   77: new java/lang/StringBuilder
    //   80: dup
    //   81: aload_3
    //   82: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   85: invokevirtual length : ()I
    //   88: sipush #133
    //   91: iadd
    //   92: invokespecial <init> : (I)V
    //   95: astore #4
    //   97: aload #4
    //   99: ldc 'An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy '
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #4
    //   107: aload_3
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload #4
    //   114: ldc 'will be used. The error is: '
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_2
    //   121: aload #4
    //   123: invokevirtual toString : ()Ljava/lang/String;
    //   126: invokevirtual println : (Ljava/lang/String;)V
    //   129: aload_0
    //   130: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   133: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   136: new e/f/a/e/i/n/x$a
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: astore_0
    //   144: aload_0
    //   145: putstatic e/f/a/e/i/n/x.a : Le/f/a/e/i/n/w;
    //   148: aload_1
    //   149: ifnonnull -> 153
    //   152: return
    //   153: aload_1
    //   154: invokevirtual intValue : ()I
    //   157: pop
    //   158: return
    // Exception table:
    //   from	to	target	type
    //   0	4	64	finally
    //   8	25	60	finally
    //   28	46	60	finally
    //   49	57	60	finally
  }
  
  private static Integer a() {
    try {
      return (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
    } catch (Exception exception) {
      System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
      exception.printStackTrace(System.err);
      return null;
    } 
  }
  
  public static void a(Throwable paramThrowable) {
    a.a(paramThrowable);
  }
  
  static final class a extends w {
    public final void a(Throwable param1Throwable) {
      param1Throwable.printStackTrace();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */