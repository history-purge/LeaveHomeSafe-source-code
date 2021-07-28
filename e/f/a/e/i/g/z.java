package e.f.a.e.i.g;

public final class z {
  static final t a;
  
  static {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_0
    //   4: aload_2
    //   5: astore_1
    //   6: ldc 'android.os.Build$VERSION'
    //   8: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   11: ldc 'SDK_INT'
    //   13: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   16: aconst_null
    //   17: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast java/lang/Integer
    //   23: astore_3
    //   24: aload_3
    //   25: astore_0
    //   26: goto -> 49
    //   29: astore_3
    //   30: aload_2
    //   31: astore_1
    //   32: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   35: ldc 'Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.'
    //   37: invokevirtual println : (Ljava/lang/String;)V
    //   40: aload_2
    //   41: astore_1
    //   42: aload_3
    //   43: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   46: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   49: aload_0
    //   50: ifnull -> 79
    //   53: aload_0
    //   54: astore_1
    //   55: aload_0
    //   56: invokevirtual intValue : ()I
    //   59: bipush #19
    //   61: if_icmplt -> 79
    //   64: aload_0
    //   65: astore_1
    //   66: new e/f/a/e/i/g/y
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore_2
    //   74: aload_2
    //   75: astore_1
    //   76: goto -> 201
    //   79: aload_0
    //   80: astore_1
    //   81: ldc 'com.google.devtools.build.android.desugar.runtime.twr_disable_mimic'
    //   83: invokestatic getBoolean : (Ljava/lang/String;)Z
    //   86: ifne -> 104
    //   89: aload_0
    //   90: astore_1
    //   91: new e/f/a/e/i/g/w
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: astore_2
    //   99: aload_2
    //   100: astore_1
    //   101: goto -> 201
    //   104: aload_0
    //   105: astore_1
    //   106: new e/f/a/e/i/g/x
    //   109: dup
    //   110: invokespecial <init> : ()V
    //   113: astore_2
    //   114: aload_2
    //   115: astore_1
    //   116: goto -> 201
    //   119: astore_0
    //   120: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   123: astore_2
    //   124: ldc e/f/a/e/i/g/x
    //   126: invokevirtual getName : ()Ljava/lang/String;
    //   129: astore_3
    //   130: new java/lang/StringBuilder
    //   133: dup
    //   134: aload_3
    //   135: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   138: invokevirtual length : ()I
    //   141: sipush #133
    //   144: iadd
    //   145: invokespecial <init> : (I)V
    //   148: astore #4
    //   150: aload #4
    //   152: ldc 'An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy '
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload #4
    //   160: aload_3
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #4
    //   167: ldc 'will be used. The error is: '
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload_2
    //   174: aload #4
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: invokevirtual println : (Ljava/lang/String;)V
    //   182: aload_0
    //   183: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   186: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   189: new e/f/a/e/i/g/x
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore_2
    //   197: aload_1
    //   198: astore_0
    //   199: aload_2
    //   200: astore_1
    //   201: aload_1
    //   202: putstatic e/f/a/e/i/g/z.a : Le/f/a/e/i/g/t;
    //   205: aload_0
    //   206: ifnonnull -> 210
    //   209: return
    //   210: aload_0
    //   211: invokevirtual intValue : ()I
    //   214: pop
    //   215: return
    // Exception table:
    //   from	to	target	type
    //   6	24	29	java/lang/Exception
    //   6	24	119	finally
    //   32	40	119	finally
    //   42	49	119	finally
    //   55	64	119	finally
    //   66	74	119	finally
    //   81	89	119	finally
    //   91	99	119	finally
    //   106	114	119	finally
  }
  
  public static void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    a.a(paramThrowable1, paramThrowable2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */