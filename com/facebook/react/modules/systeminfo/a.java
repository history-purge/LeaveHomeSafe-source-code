package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;

public class a {
  private static final String a = "a";
  
  private static String b;
  
  public static String a() {
    if (c())
      return Build.MODEL; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Build.MODEL);
    stringBuilder.append(" - ");
    stringBuilder.append(Build.VERSION.RELEASE);
    stringBuilder.append(" - API ");
    stringBuilder.append(Build.VERSION.SDK_INT);
    return stringBuilder.toString();
  }
  
  private static String a(int paramInt) {
    String str = b();
    if (str.equals(""))
      if (c()) {
        str = "10.0.3.2";
      } else if (d()) {
        str = "10.0.2.2";
      } else {
        str = "localhost";
      }  
    return String.format(Locale.US, "%s:%d", new Object[] { str, Integer.valueOf(paramInt) });
  }
  
  public static String a(Integer paramInteger) {
    return a(paramInteger.intValue());
  }
  
  private static String b() {
    // Byte code:
    //   0: ldc com/facebook/react/modules/systeminfo/a
    //   2: monitorenter
    //   3: getstatic com/facebook/react/modules/systeminfo/a.b : Ljava/lang/String;
    //   6: ifnull -> 18
    //   9: getstatic com/facebook/react/modules/systeminfo/a.b : Ljava/lang/String;
    //   12: astore_0
    //   13: ldc com/facebook/react/modules/systeminfo/a
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: aconst_null
    //   19: astore_3
    //   20: aconst_null
    //   21: astore_2
    //   22: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   25: iconst_2
    //   26: anewarray java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc '/system/bin/getprop'
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: ldc 'metro.host'
    //   38: aastore
    //   39: invokevirtual exec : ([Ljava/lang/String;)Ljava/lang/Process;
    //   42: astore_0
    //   43: new java/io/BufferedReader
    //   46: dup
    //   47: new java/io/InputStreamReader
    //   50: dup
    //   51: aload_0
    //   52: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   55: ldc 'UTF-8'
    //   57: invokestatic forName : (Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   60: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   63: invokespecial <init> : (Ljava/io/Reader;)V
    //   66: astore_1
    //   67: ldc ''
    //   69: astore_2
    //   70: aload_1
    //   71: invokevirtual readLine : ()Ljava/lang/String;
    //   74: astore_3
    //   75: aload_3
    //   76: ifnull -> 84
    //   79: aload_3
    //   80: astore_2
    //   81: goto -> 70
    //   84: aload_2
    //   85: putstatic com/facebook/react/modules/systeminfo/a.b : Ljava/lang/String;
    //   88: aload_1
    //   89: invokevirtual close : ()V
    //   92: goto -> 95
    //   95: aload_0
    //   96: ifnull -> 182
    //   99: aload_0
    //   100: invokevirtual destroy : ()V
    //   103: goto -> 182
    //   106: astore_3
    //   107: aload_1
    //   108: astore_2
    //   109: aload_0
    //   110: astore_1
    //   111: aload_3
    //   112: astore_0
    //   113: goto -> 196
    //   116: astore_3
    //   117: aload_1
    //   118: astore_2
    //   119: aload_3
    //   120: astore_1
    //   121: goto -> 149
    //   124: astore_2
    //   125: aload_0
    //   126: astore_1
    //   127: aload_2
    //   128: astore_0
    //   129: aload_3
    //   130: astore_2
    //   131: goto -> 196
    //   134: astore_1
    //   135: goto -> 149
    //   138: astore_0
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_3
    //   142: astore_2
    //   143: goto -> 196
    //   146: astore_1
    //   147: aconst_null
    //   148: astore_0
    //   149: getstatic com/facebook/react/modules/systeminfo/a.a : Ljava/lang/String;
    //   152: ldc 'Failed to query for metro.host prop:'
    //   154: aload_1
    //   155: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   158: ldc ''
    //   160: putstatic com/facebook/react/modules/systeminfo/a.b : Ljava/lang/String;
    //   163: aload_2
    //   164: ifnull -> 174
    //   167: aload_2
    //   168: invokevirtual close : ()V
    //   171: goto -> 174
    //   174: aload_0
    //   175: ifnull -> 182
    //   178: aload_0
    //   179: invokevirtual destroy : ()V
    //   182: getstatic com/facebook/react/modules/systeminfo/a.b : Ljava/lang/String;
    //   185: astore_0
    //   186: ldc com/facebook/react/modules/systeminfo/a
    //   188: monitorexit
    //   189: aload_0
    //   190: areturn
    //   191: astore_3
    //   192: aload_0
    //   193: astore_1
    //   194: aload_3
    //   195: astore_0
    //   196: aload_2
    //   197: ifnull -> 207
    //   200: aload_2
    //   201: invokevirtual close : ()V
    //   204: goto -> 207
    //   207: aload_1
    //   208: ifnull -> 215
    //   211: aload_1
    //   212: invokevirtual destroy : ()V
    //   215: aload_0
    //   216: athrow
    //   217: astore_0
    //   218: ldc com/facebook/react/modules/systeminfo/a
    //   220: monitorexit
    //   221: goto -> 226
    //   224: aload_0
    //   225: athrow
    //   226: goto -> 224
    //   229: astore_1
    //   230: goto -> 95
    //   233: astore_1
    //   234: goto -> 174
    //   237: astore_2
    //   238: goto -> 207
    // Exception table:
    //   from	to	target	type
    //   3	13	217	finally
    //   22	43	146	java/lang/Exception
    //   22	43	138	finally
    //   43	67	134	java/lang/Exception
    //   43	67	124	finally
    //   70	75	116	java/lang/Exception
    //   70	75	106	finally
    //   84	88	116	java/lang/Exception
    //   84	88	106	finally
    //   88	92	229	java/lang/Exception
    //   88	92	217	finally
    //   99	103	217	finally
    //   149	163	191	finally
    //   167	171	233	java/lang/Exception
    //   167	171	217	finally
    //   178	182	217	finally
    //   182	186	217	finally
    //   200	204	237	java/lang/Exception
    //   200	204	217	finally
    //   211	215	217	finally
    //   215	217	217	finally
  }
  
  private static boolean c() {
    return Build.FINGERPRINT.contains("vbox");
  }
  
  private static boolean d() {
    return Build.FINGERPRINT.contains("generic");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/systeminfo/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */