package e.f.a.e.i.d;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class z5 {
  private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
  
  private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
  
  public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
  
  public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
  
  private static final AtomicBoolean e = new AtomicBoolean();
  
  private static HashMap<String, String> f;
  
  private static final HashMap<String, Boolean> g = new HashMap<String, Boolean>();
  
  private static final HashMap<String, Integer> h = new HashMap<String, Integer>();
  
  private static final HashMap<String, Long> i = new HashMap<String, Long>();
  
  private static final HashMap<String, Float> j = new HashMap<String, Float>();
  
  private static Object k;
  
  private static boolean l;
  
  private static String[] m = new String[0];
  
  public static long a(ContentResolver paramContentResolver, String paramString, long paramLong) {
    Long long_1;
    Object object = b(paramContentResolver);
    HashMap<String, Long> hashMap = i;
    paramLong = 0L;
    Long long_2 = a(hashMap, paramString, Long.valueOf(0L));
    if (long_2 != null)
      return long_2.longValue(); 
    String str = a(paramContentResolver, paramString, (String)null);
    if (str == null) {
      long_1 = long_2;
    } else {
      try {
        long l = Long.parseLong((String)long_1);
        long_1 = Long.valueOf(l);
        paramLong = l;
      } catch (NumberFormatException numberFormatException) {
        long_1 = long_2;
      } 
    } 
    a(object, i, paramString, long_1);
    return paramLong;
  }
  
  private static <T> T a(HashMap<String, T> paramHashMap, String paramString, T paramT) {
    // Byte code:
    //   0: ldc e/f/a/e/i/d/z5
    //   2: monitorenter
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   8: ifeq -> 29
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnull -> 40
    //   21: goto -> 24
    //   24: ldc e/f/a/e/i/d/z5
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: ldc e/f/a/e/i/d/z5
    //   31: monitorexit
    //   32: aconst_null
    //   33: areturn
    //   34: astore_0
    //   35: ldc e/f/a/e/i/d/z5
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    //   40: aload_2
    //   41: astore_0
    //   42: goto -> 24
    // Exception table:
    //   from	to	target	type
    //   3	17	34	finally
    //   24	27	34	finally
    //   29	32	34	finally
    //   35	38	34	finally
  }
  
  public static String a(ContentResolver paramContentResolver, String paramString1, String paramString2) {
    // Byte code:
    //   0: ldc e/f/a/e/i/d/z5
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic a : (Landroid/content/ContentResolver;)V
    //   7: getstatic e/f/a/e/i/d/z5.k : Ljava/lang/Object;
    //   10: astore #6
    //   12: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   15: aload_1
    //   16: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   19: ifeq -> 45
    //   22: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   25: aload_1
    //   26: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast java/lang/String
    //   32: astore_0
    //   33: aload_0
    //   34: ifnull -> 289
    //   37: goto -> 40
    //   40: ldc e/f/a/e/i/d/z5
    //   42: monitorexit
    //   43: aload_0
    //   44: areturn
    //   45: getstatic e/f/a/e/i/d/z5.m : [Ljava/lang/String;
    //   48: astore_2
    //   49: aload_2
    //   50: arraylength
    //   51: istore #4
    //   53: iconst_0
    //   54: istore_3
    //   55: iload_3
    //   56: iload #4
    //   58: if_icmpge -> 143
    //   61: aload_1
    //   62: aload_2
    //   63: iload_3
    //   64: aaload
    //   65: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   68: ifeq -> 299
    //   71: getstatic e/f/a/e/i/d/z5.l : Z
    //   74: ifeq -> 86
    //   77: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   80: invokevirtual isEmpty : ()Z
    //   83: ifeq -> 138
    //   86: getstatic e/f/a/e/i/d/z5.m : [Ljava/lang/String;
    //   89: astore_2
    //   90: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   93: aload_0
    //   94: aload_2
    //   95: invokestatic a : (Landroid/content/ContentResolver;[Ljava/lang/String;)Ljava/util/Map;
    //   98: invokevirtual putAll : (Ljava/util/Map;)V
    //   101: iconst_1
    //   102: putstatic e/f/a/e/i/d/z5.l : Z
    //   105: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   108: aload_1
    //   109: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   112: ifeq -> 138
    //   115: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   118: aload_1
    //   119: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   122: checkcast java/lang/String
    //   125: astore_0
    //   126: aload_0
    //   127: ifnull -> 294
    //   130: goto -> 133
    //   133: ldc e/f/a/e/i/d/z5
    //   135: monitorexit
    //   136: aload_0
    //   137: areturn
    //   138: ldc e/f/a/e/i/d/z5
    //   140: monitorexit
    //   141: aconst_null
    //   142: areturn
    //   143: ldc e/f/a/e/i/d/z5
    //   145: monitorexit
    //   146: aload_0
    //   147: getstatic e/f/a/e/i/d/z5.a : Landroid/net/Uri;
    //   150: aconst_null
    //   151: aconst_null
    //   152: iconst_1
    //   153: anewarray java/lang/String
    //   156: dup
    //   157: iconst_0
    //   158: aload_1
    //   159: aastore
    //   160: aconst_null
    //   161: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   164: astore #5
    //   166: aload #5
    //   168: ifnull -> 241
    //   171: aload #5
    //   173: invokeinterface moveToFirst : ()Z
    //   178: ifne -> 184
    //   181: goto -> 241
    //   184: aload #5
    //   186: iconst_1
    //   187: invokeinterface getString : (I)Ljava/lang/String;
    //   192: astore_2
    //   193: aload_2
    //   194: astore_0
    //   195: aload_2
    //   196: ifnull -> 211
    //   199: aload_2
    //   200: astore_0
    //   201: aload_2
    //   202: aconst_null
    //   203: invokevirtual equals : (Ljava/lang/Object;)Z
    //   206: ifeq -> 211
    //   209: aconst_null
    //   210: astore_0
    //   211: aload #6
    //   213: aload_1
    //   214: aload_0
    //   215: invokestatic a : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   218: aload_0
    //   219: ifnull -> 225
    //   222: goto -> 227
    //   225: aconst_null
    //   226: astore_0
    //   227: aload #5
    //   229: ifnull -> 239
    //   232: aload #5
    //   234: invokeinterface close : ()V
    //   239: aload_0
    //   240: areturn
    //   241: aload #6
    //   243: aload_1
    //   244: aconst_null
    //   245: invokestatic a : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload #5
    //   250: ifnull -> 260
    //   253: aload #5
    //   255: invokeinterface close : ()V
    //   260: aconst_null
    //   261: areturn
    //   262: astore_0
    //   263: aload #5
    //   265: ifnull -> 275
    //   268: aload #5
    //   270: invokeinterface close : ()V
    //   275: aload_0
    //   276: athrow
    //   277: astore_0
    //   278: ldc e/f/a/e/i/d/z5
    //   280: monitorexit
    //   281: goto -> 286
    //   284: aload_0
    //   285: athrow
    //   286: goto -> 284
    //   289: aconst_null
    //   290: astore_0
    //   291: goto -> 40
    //   294: aconst_null
    //   295: astore_0
    //   296: goto -> 133
    //   299: iload_3
    //   300: iconst_1
    //   301: iadd
    //   302: istore_3
    //   303: goto -> 55
    // Exception table:
    //   from	to	target	type
    //   3	33	277	finally
    //   40	43	277	finally
    //   45	53	277	finally
    //   61	86	277	finally
    //   86	126	277	finally
    //   133	136	277	finally
    //   138	141	277	finally
    //   143	146	277	finally
    //   171	181	262	finally
    //   184	193	262	finally
    //   201	209	262	finally
    //   211	218	262	finally
    //   241	248	262	finally
    //   278	281	277	finally
  }
  
  private static Map<String, String> a(ContentResolver paramContentResolver, String... paramVarArgs) {
    Cursor cursor = paramContentResolver.query(b, null, null, paramVarArgs, null);
    null = new TreeMap<Object, Object>();
    if (cursor == null)
      return (Map)null; 
    try {
      while (cursor.moveToNext())
        null.put(cursor.getString(0), cursor.getString(1)); 
      return (Map)null;
    } finally {
      cursor.close();
    } 
  }
  
  private static void a(ContentResolver paramContentResolver) {
    if (f == null) {
      e.set(false);
      f = new HashMap<String, String>();
      k = new Object();
      l = false;
      paramContentResolver.registerContentObserver(a, true, new a6(null));
      return;
    } 
    if (e.getAndSet(false)) {
      f.clear();
      g.clear();
      h.clear();
      i.clear();
      j.clear();
      k = new Object();
      l = false;
    } 
  }
  
  private static void a(Object paramObject, String paramString1, String paramString2) {
    // Byte code:
    //   0: ldc e/f/a/e/i/d/z5
    //   2: monitorenter
    //   3: aload_0
    //   4: getstatic e/f/a/e/i/d/z5.k : Ljava/lang/Object;
    //   7: if_acmpne -> 19
    //   10: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   13: aload_1
    //   14: aload_2
    //   15: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   18: pop
    //   19: ldc e/f/a/e/i/d/z5
    //   21: monitorexit
    //   22: return
    //   23: astore_0
    //   24: ldc e/f/a/e/i/d/z5
    //   26: monitorexit
    //   27: aload_0
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	23	finally
    //   19	22	23	finally
    //   24	27	23	finally
  }
  
  private static <T> void a(Object paramObject, HashMap<String, T> paramHashMap, String paramString, T paramT) {
    // Byte code:
    //   0: ldc e/f/a/e/i/d/z5
    //   2: monitorenter
    //   3: aload_0
    //   4: getstatic e/f/a/e/i/d/z5.k : Ljava/lang/Object;
    //   7: if_acmpne -> 25
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: getstatic e/f/a/e/i/d/z5.f : Ljava/util/HashMap;
    //   20: aload_2
    //   21: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   24: pop
    //   25: ldc e/f/a/e/i/d/z5
    //   27: monitorexit
    //   28: return
    //   29: astore_0
    //   30: ldc e/f/a/e/i/d/z5
    //   32: monitorexit
    //   33: aload_0
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   3	25	29	finally
    //   25	28	29	finally
    //   30	33	29	finally
  }
  
  public static boolean a(ContentResolver paramContentResolver, String paramString, boolean paramBoolean) {
    Object object = b(paramContentResolver);
    Boolean bool2 = a(g, paramString, Boolean.valueOf(paramBoolean));
    if (bool2 != null)
      return bool2.booleanValue(); 
    String str = a(paramContentResolver, paramString, (String)null);
    Boolean bool1 = bool2;
    boolean bool = paramBoolean;
    if (str != null)
      if (str.equals("")) {
        bool1 = bool2;
        bool = paramBoolean;
      } else if (c.matcher(str).matches()) {
        bool1 = Boolean.valueOf(true);
        bool = true;
      } else if (d.matcher(str).matches()) {
        bool1 = Boolean.valueOf(false);
        bool = false;
      } else {
        StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
        stringBuilder.append(paramString);
        stringBuilder.append(" (value \"");
        stringBuilder.append(str);
        stringBuilder.append("\") as boolean");
        Log.w("Gservices", stringBuilder.toString());
        bool = paramBoolean;
        bool1 = bool2;
      }  
    a(object, g, paramString, bool1);
    return bool;
  }
  
  private static Object b(ContentResolver paramContentResolver) {
    // Byte code:
    //   0: ldc e/f/a/e/i/d/z5
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic a : (Landroid/content/ContentResolver;)V
    //   7: getstatic e/f/a/e/i/d/z5.k : Ljava/lang/Object;
    //   10: astore_0
    //   11: ldc e/f/a/e/i/d/z5
    //   13: monitorexit
    //   14: aload_0
    //   15: areturn
    //   16: astore_0
    //   17: ldc e/f/a/e/i/d/z5
    //   19: monitorexit
    //   20: aload_0
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   3	14	16	finally
    //   17	20	16	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/z5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */