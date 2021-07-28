package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
  private static Boolean b;
  
  private static k c;
  
  private static m d;
  
  private static String e;
  
  private static int f = -1;
  
  private static final ThreadLocal<c> g = new ThreadLocal<c>();
  
  private static final b.b h = new b();
  
  @RecentlyNonNull
  public static final b i = new a();
  
  @RecentlyNonNull
  public static final b j = new h();
  
  private final Context a;
  
  static {
    new g();
  }
  
  private DynamiteModule(Context paramContext) {
    q.a(paramContext);
    this.a = paramContext;
  }
  
  @RecentlyNonNull
  public static int a(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString) {
    try {
      StringBuilder stringBuilder1;
      ClassLoader classLoader = paramContext.getApplicationContext().getClassLoader();
      StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(paramString).length() + 61);
      stringBuilder2.append("com.google.android.gms.dynamite.descriptors.");
      stringBuilder2.append(paramString);
      stringBuilder2.append(".ModuleDescriptor");
      Class<?> clazz = classLoader.loadClass(stringBuilder2.toString());
      Field field1 = clazz.getDeclaredField("MODULE_ID");
      Field field2 = clazz.getDeclaredField("MODULE_VERSION");
      if (!o.a(field1.get(null), paramString)) {
        String str = String.valueOf(field1.get(null));
        stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(paramString).length());
        stringBuilder1.append("Module descriptor id '");
        stringBuilder1.append(str);
        stringBuilder1.append("' didn't match expected id '");
        stringBuilder1.append(paramString);
        stringBuilder1.append("'");
        Log.e("DynamiteModule", stringBuilder1.toString());
        return 0;
      } 
      return stringBuilder1.getInt(null);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 45);
      stringBuilder.append("Local module descriptor class for ");
      stringBuilder.append(paramString);
      stringBuilder.append(" not found.");
      Log.w("DynamiteModule", stringBuilder.toString());
      return 0;
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Failed to load module descriptor class: ".concat(str);
      } else {
        str = new String("Failed to load module descriptor class: ");
      } 
      Log.e("DynamiteModule", str);
      return 0;
    } 
  }
  
  @RecentlyNonNull
  public static int a(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString, @RecentlyNonNull boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.b : Ljava/lang/Boolean;
    //   6: astore #6
    //   8: aload #6
    //   10: astore #5
    //   12: aload #6
    //   14: ifnonnull -> 351
    //   17: aload_0
    //   18: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   21: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   24: ldc com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader
    //   26: invokevirtual getName : ()Ljava/lang/String;
    //   29: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   32: ldc 'sClassLoader'
    //   34: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   37: astore #7
    //   39: aload #7
    //   41: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
    //   44: astore #6
    //   46: aload #6
    //   48: monitorenter
    //   49: aload #7
    //   51: aconst_null
    //   52: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   55: checkcast java/lang/ClassLoader
    //   58: astore #5
    //   60: aload #5
    //   62: ifnull -> 94
    //   65: aload #5
    //   67: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   70: if_acmpne -> 81
    //   73: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   76: astore #5
    //   78: goto -> 260
    //   81: aload #5
    //   83: invokestatic a : (Ljava/lang/ClassLoader;)V
    //   86: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   89: astore #5
    //   91: goto -> 260
    //   94: ldc 'com.google.android.gms'
    //   96: aload_0
    //   97: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   100: invokevirtual getPackageName : ()Ljava/lang/String;
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: ifeq -> 121
    //   109: aload #7
    //   111: aconst_null
    //   112: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   115: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   118: goto -> 73
    //   121: aload_0
    //   122: aload_1
    //   123: iload_2
    //   124: invokestatic c : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   127: istore_3
    //   128: getstatic com/google/android/gms/dynamite/DynamiteModule.e : Ljava/lang/String;
    //   131: ifnull -> 240
    //   134: getstatic com/google/android/gms/dynamite/DynamiteModule.e : Ljava/lang/String;
    //   137: invokevirtual isEmpty : ()Z
    //   140: ifeq -> 146
    //   143: goto -> 240
    //   146: getstatic android/os/Build$VERSION.SDK_INT : I
    //   149: bipush #29
    //   151: if_icmplt -> 185
    //   154: getstatic com/google/android/gms/dynamite/DynamiteModule.e : Ljava/lang/String;
    //   157: astore #5
    //   159: aload #5
    //   161: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   164: pop
    //   165: new dalvik/system/DelegateLastClassLoader
    //   168: dup
    //   169: aload #5
    //   171: checkcast java/lang/String
    //   174: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   177: invokespecial <init> : (Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   180: astore #5
    //   182: goto -> 213
    //   185: getstatic com/google/android/gms/dynamite/DynamiteModule.e : Ljava/lang/String;
    //   188: astore #5
    //   190: aload #5
    //   192: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   195: pop
    //   196: new com/google/android/gms/dynamite/i
    //   199: dup
    //   200: aload #5
    //   202: checkcast java/lang/String
    //   205: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   208: invokespecial <init> : (Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   211: astore #5
    //   213: aload #5
    //   215: invokestatic a : (Ljava/lang/ClassLoader;)V
    //   218: aload #7
    //   220: aconst_null
    //   221: aload #5
    //   223: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   226: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   229: putstatic com/google/android/gms/dynamite/DynamiteModule.b : Ljava/lang/Boolean;
    //   232: aload #6
    //   234: monitorexit
    //   235: ldc com/google/android/gms/dynamite/DynamiteModule
    //   237: monitorexit
    //   238: iload_3
    //   239: ireturn
    //   240: aload #6
    //   242: monitorexit
    //   243: ldc com/google/android/gms/dynamite/DynamiteModule
    //   245: monitorexit
    //   246: iload_3
    //   247: ireturn
    //   248: aload #7
    //   250: aconst_null
    //   251: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   254: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   257: goto -> 73
    //   260: aload #6
    //   262: monitorexit
    //   263: goto -> 346
    //   266: astore #5
    //   268: aload #6
    //   270: monitorexit
    //   271: aload #5
    //   273: athrow
    //   274: astore #5
    //   276: goto -> 286
    //   279: astore #5
    //   281: goto -> 286
    //   284: astore #5
    //   286: aload #5
    //   288: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   291: astore #5
    //   293: new java/lang/StringBuilder
    //   296: dup
    //   297: aload #5
    //   299: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   302: invokevirtual length : ()I
    //   305: bipush #30
    //   307: iadd
    //   308: invokespecial <init> : (I)V
    //   311: astore #6
    //   313: aload #6
    //   315: ldc_w 'Failed to load module via V2: '
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload #6
    //   324: aload #5
    //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: ldc 'DynamiteModule'
    //   332: aload #6
    //   334: invokevirtual toString : ()Ljava/lang/String;
    //   337: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   340: pop
    //   341: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   344: astore #5
    //   346: aload #5
    //   348: putstatic com/google/android/gms/dynamite/DynamiteModule.b : Ljava/lang/Boolean;
    //   351: ldc com/google/android/gms/dynamite/DynamiteModule
    //   353: monitorexit
    //   354: aload #5
    //   356: invokevirtual booleanValue : ()Z
    //   359: istore #4
    //   361: iload #4
    //   363: ifeq -> 422
    //   366: aload_0
    //   367: aload_1
    //   368: iload_2
    //   369: invokestatic c : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   372: istore_3
    //   373: iload_3
    //   374: ireturn
    //   375: astore_1
    //   376: aload_1
    //   377: invokevirtual getMessage : ()Ljava/lang/String;
    //   380: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   383: astore_1
    //   384: aload_1
    //   385: invokevirtual length : ()I
    //   388: ifeq -> 402
    //   391: ldc_w 'Failed to retrieve remote module version: '
    //   394: aload_1
    //   395: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   398: astore_1
    //   399: goto -> 413
    //   402: new java/lang/String
    //   405: dup
    //   406: ldc_w 'Failed to retrieve remote module version: '
    //   409: invokespecial <init> : (Ljava/lang/String;)V
    //   412: astore_1
    //   413: ldc 'DynamiteModule'
    //   415: aload_1
    //   416: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   419: pop
    //   420: iconst_0
    //   421: ireturn
    //   422: aload_0
    //   423: aload_1
    //   424: iload_2
    //   425: invokestatic b : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   428: istore_3
    //   429: iload_3
    //   430: ireturn
    //   431: astore_1
    //   432: ldc com/google/android/gms/dynamite/DynamiteModule
    //   434: monitorexit
    //   435: aload_1
    //   436: athrow
    //   437: astore_1
    //   438: aload_0
    //   439: aload_1
    //   440: invokestatic a : (Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   443: pop
    //   444: goto -> 449
    //   447: aload_1
    //   448: athrow
    //   449: goto -> 447
    //   452: astore #5
    //   454: goto -> 86
    //   457: astore #5
    //   459: goto -> 248
    // Exception table:
    //   from	to	target	type
    //   0	3	437	finally
    //   3	8	431	finally
    //   17	49	284	java/lang/ClassNotFoundException
    //   17	49	279	java/lang/IllegalAccessException
    //   17	49	274	java/lang/NoSuchFieldException
    //   17	49	431	finally
    //   49	60	266	finally
    //   65	73	266	finally
    //   73	78	266	finally
    //   81	86	452	com/google/android/gms/dynamite/DynamiteModule$a
    //   81	86	266	finally
    //   86	91	266	finally
    //   94	118	266	finally
    //   121	143	457	com/google/android/gms/dynamite/DynamiteModule$a
    //   121	143	266	finally
    //   146	182	457	com/google/android/gms/dynamite/DynamiteModule$a
    //   146	182	266	finally
    //   185	213	457	com/google/android/gms/dynamite/DynamiteModule$a
    //   185	213	266	finally
    //   213	232	457	com/google/android/gms/dynamite/DynamiteModule$a
    //   213	232	266	finally
    //   232	235	266	finally
    //   235	238	431	finally
    //   240	243	266	finally
    //   243	246	431	finally
    //   248	257	266	finally
    //   260	263	266	finally
    //   268	271	266	finally
    //   271	274	284	java/lang/ClassNotFoundException
    //   271	274	279	java/lang/IllegalAccessException
    //   271	274	274	java/lang/NoSuchFieldException
    //   271	274	431	finally
    //   286	346	431	finally
    //   346	351	431	finally
    //   351	354	431	finally
    //   354	361	437	finally
    //   366	373	375	com/google/android/gms/dynamite/DynamiteModule$a
    //   366	373	437	finally
    //   376	399	437	finally
    //   402	413	437	finally
    //   413	420	437	finally
    //   422	429	437	finally
    //   432	435	431	finally
    //   435	437	437	finally
  }
  
  @RecentlyNonNull
  public static DynamiteModule a(@RecentlyNonNull Context paramContext, @RecentlyNonNull b paramb, @RecentlyNonNull String paramString) {
    c c1 = g.get();
    c c2 = new c(null);
    g.set(c2);
    try {
      b.a a = paramb.a(paramContext, paramString, h);
      int i = a.a;
      int j = a.b;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 68 + String.valueOf(paramString).length());
      stringBuilder.append("Considering local module ");
      stringBuilder.append(paramString);
      stringBuilder.append(":");
      stringBuilder.append(i);
      stringBuilder.append(" and remote module ");
      stringBuilder.append(paramString);
      stringBuilder.append(":");
      stringBuilder.append(j);
    } finally {
      Cursor cursor = c2.a;
      if (cursor != null)
        cursor.close(); 
      g.set(c1);
    } 
  }
  
  private static DynamiteModule a(Context paramContext, String paramString, int paramInt) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.b : Ljava/lang/Boolean;
    //   6: astore #4
    //   8: ldc com/google/android/gms/dynamite/DynamiteModule
    //   10: monitorexit
    //   11: aload #4
    //   13: ifnull -> 270
    //   16: aload #4
    //   18: invokevirtual booleanValue : ()Z
    //   21: ifeq -> 31
    //   24: aload_0
    //   25: aload_1
    //   26: iload_2
    //   27: invokestatic b : (Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   30: areturn
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: aload_1
    //   36: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   39: invokevirtual length : ()I
    //   42: bipush #51
    //   44: iadd
    //   45: invokespecial <init> : (I)V
    //   48: astore #4
    //   50: aload #4
    //   52: ldc_w 'Selected remote version of '
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload #4
    //   61: aload_1
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload #4
    //   68: ldc_w ', version >= '
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload #4
    //   77: iload_2
    //   78: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: ldc 'DynamiteModule'
    //   84: aload #4
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   92: pop
    //   93: aload_0
    //   94: invokestatic a : (Landroid/content/Context;)Lcom/google/android/gms/dynamite/k;
    //   97: astore #4
    //   99: aload #4
    //   101: ifnull -> 258
    //   104: aload #4
    //   106: invokeinterface zzb : ()I
    //   111: istore_3
    //   112: iload_3
    //   113: iconst_3
    //   114: if_icmplt -> 170
    //   117: getstatic com/google/android/gms/dynamite/DynamiteModule.g : Ljava/lang/ThreadLocal;
    //   120: invokevirtual get : ()Ljava/lang/Object;
    //   123: checkcast com/google/android/gms/dynamite/DynamiteModule$c
    //   126: astore #5
    //   128: aload #5
    //   130: ifnull -> 158
    //   133: aload #4
    //   135: aload_0
    //   136: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   139: aload_1
    //   140: iload_2
    //   141: aload #5
    //   143: getfield a : Landroid/database/Cursor;
    //   146: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   149: invokeinterface a : (Le/f/a/e/f/a;Ljava/lang/String;ILe/f/a/e/f/a;)Le/f/a/e/f/a;
    //   154: astore_1
    //   155: goto -> 224
    //   158: new com/google/android/gms/dynamite/DynamiteModule$a
    //   161: dup
    //   162: ldc_w 'No cached result cursor holder'
    //   165: aconst_null
    //   166: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   169: athrow
    //   170: iload_3
    //   171: iconst_2
    //   172: if_icmpne -> 201
    //   175: ldc 'DynamiteModule'
    //   177: ldc_w 'IDynamite loader version = 2'
    //   180: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   183: pop
    //   184: aload #4
    //   186: aload_0
    //   187: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   190: aload_1
    //   191: iload_2
    //   192: invokeinterface a : (Le/f/a/e/f/a;Ljava/lang/String;I)Le/f/a/e/f/a;
    //   197: astore_1
    //   198: goto -> 224
    //   201: ldc 'DynamiteModule'
    //   203: ldc_w 'Dynamite loader version < 2, falling back to createModuleContext'
    //   206: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   209: pop
    //   210: aload #4
    //   212: aload_0
    //   213: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   216: aload_1
    //   217: iload_2
    //   218: invokeinterface b : (Le/f/a/e/f/a;Ljava/lang/String;I)Le/f/a/e/f/a;
    //   223: astore_1
    //   224: aload_1
    //   225: invokestatic a : (Le/f/a/e/f/a;)Ljava/lang/Object;
    //   228: ifnull -> 246
    //   231: new com/google/android/gms/dynamite/DynamiteModule
    //   234: dup
    //   235: aload_1
    //   236: invokestatic a : (Le/f/a/e/f/a;)Ljava/lang/Object;
    //   239: checkcast android/content/Context
    //   242: invokespecial <init> : (Landroid/content/Context;)V
    //   245: areturn
    //   246: new com/google/android/gms/dynamite/DynamiteModule$a
    //   249: dup
    //   250: ldc_w 'Failed to load remote module.'
    //   253: aconst_null
    //   254: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   257: athrow
    //   258: new com/google/android/gms/dynamite/DynamiteModule$a
    //   261: dup
    //   262: ldc_w 'Failed to create IDynamiteLoader.'
    //   265: aconst_null
    //   266: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   269: athrow
    //   270: new com/google/android/gms/dynamite/DynamiteModule$a
    //   273: dup
    //   274: ldc_w 'Failed to determine which loading route to use.'
    //   277: aconst_null
    //   278: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   281: athrow
    //   282: astore_1
    //   283: ldc com/google/android/gms/dynamite/DynamiteModule
    //   285: monitorexit
    //   286: aload_1
    //   287: athrow
    //   288: astore_1
    //   289: aload_0
    //   290: aload_1
    //   291: invokestatic a : (Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   294: pop
    //   295: new com/google/android/gms/dynamite/DynamiteModule$a
    //   298: dup
    //   299: ldc_w 'Failed to load remote module.'
    //   302: aload_1
    //   303: aconst_null
    //   304: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/b;)V
    //   307: athrow
    //   308: astore_0
    //   309: aload_0
    //   310: athrow
    //   311: astore_0
    //   312: new com/google/android/gms/dynamite/DynamiteModule$a
    //   315: dup
    //   316: ldc_w 'Failed to load remote module.'
    //   319: aload_0
    //   320: aconst_null
    //   321: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/b;)V
    //   324: athrow
    // Exception table:
    //   from	to	target	type
    //   0	3	311	android/os/RemoteException
    //   0	3	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   0	3	288	finally
    //   3	11	282	finally
    //   16	31	311	android/os/RemoteException
    //   16	31	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   16	31	288	finally
    //   31	99	311	android/os/RemoteException
    //   31	99	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   31	99	288	finally
    //   104	112	311	android/os/RemoteException
    //   104	112	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   104	112	288	finally
    //   117	128	311	android/os/RemoteException
    //   117	128	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   117	128	288	finally
    //   133	155	311	android/os/RemoteException
    //   133	155	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   133	155	288	finally
    //   158	170	311	android/os/RemoteException
    //   158	170	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   158	170	288	finally
    //   175	198	311	android/os/RemoteException
    //   175	198	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   175	198	288	finally
    //   201	224	311	android/os/RemoteException
    //   201	224	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   201	224	288	finally
    //   224	246	311	android/os/RemoteException
    //   224	246	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   224	246	288	finally
    //   246	258	311	android/os/RemoteException
    //   246	258	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   246	258	288	finally
    //   258	270	311	android/os/RemoteException
    //   258	270	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   258	270	288	finally
    //   270	282	311	android/os/RemoteException
    //   270	282	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   270	282	288	finally
    //   283	286	282	finally
    //   286	288	311	android/os/RemoteException
    //   286	288	308	com/google/android/gms/dynamite/DynamiteModule$a
    //   286	288	288	finally
  }
  
  private static k a(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.c : Lcom/google/android/gms/dynamite/k;
    //   6: ifnull -> 18
    //   9: getstatic com/google/android/gms/dynamite/DynamiteModule.c : Lcom/google/android/gms/dynamite/k;
    //   12: astore_0
    //   13: ldc com/google/android/gms/dynamite/DynamiteModule
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: aload_0
    //   19: ldc 'com.google.android.gms'
    //   21: iconst_3
    //   22: invokevirtual createPackageContext : (Ljava/lang/String;I)Landroid/content/Context;
    //   25: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   28: ldc_w 'com.google.android.gms.chimera.container.DynamiteLoaderImpl'
    //   31: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   34: invokevirtual newInstance : ()Ljava/lang/Object;
    //   37: checkcast android/os/IBinder
    //   40: astore_0
    //   41: aload_0
    //   42: ifnonnull -> 50
    //   45: aconst_null
    //   46: astore_0
    //   47: goto -> 84
    //   50: aload_0
    //   51: ldc_w 'com.google.android.gms.dynamite.IDynamiteLoader'
    //   54: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   59: astore_1
    //   60: aload_1
    //   61: instanceof com/google/android/gms/dynamite/k
    //   64: ifeq -> 75
    //   67: aload_1
    //   68: checkcast com/google/android/gms/dynamite/k
    //   71: astore_0
    //   72: goto -> 84
    //   75: new com/google/android/gms/dynamite/j
    //   78: dup
    //   79: aload_0
    //   80: invokespecial <init> : (Landroid/os/IBinder;)V
    //   83: astore_0
    //   84: aload_0
    //   85: ifnull -> 142
    //   88: aload_0
    //   89: putstatic com/google/android/gms/dynamite/DynamiteModule.c : Lcom/google/android/gms/dynamite/k;
    //   92: ldc com/google/android/gms/dynamite/DynamiteModule
    //   94: monitorexit
    //   95: aload_0
    //   96: areturn
    //   97: astore_0
    //   98: aload_0
    //   99: invokevirtual getMessage : ()Ljava/lang/String;
    //   102: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   105: astore_0
    //   106: aload_0
    //   107: invokevirtual length : ()I
    //   110: ifeq -> 124
    //   113: ldc_w 'Failed to load IDynamiteLoader from GmsCore: '
    //   116: aload_0
    //   117: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   120: astore_0
    //   121: goto -> 135
    //   124: new java/lang/String
    //   127: dup
    //   128: ldc_w 'Failed to load IDynamiteLoader from GmsCore: '
    //   131: invokespecial <init> : (Ljava/lang/String;)V
    //   134: astore_0
    //   135: ldc 'DynamiteModule'
    //   137: aload_0
    //   138: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: ldc com/google/android/gms/dynamite/DynamiteModule
    //   144: monitorexit
    //   145: aconst_null
    //   146: areturn
    //   147: astore_0
    //   148: ldc com/google/android/gms/dynamite/DynamiteModule
    //   150: monitorexit
    //   151: aload_0
    //   152: athrow
    // Exception table:
    //   from	to	target	type
    //   3	16	147	finally
    //   18	41	97	java/lang/Exception
    //   18	41	147	finally
    //   50	72	97	java/lang/Exception
    //   50	72	147	finally
    //   75	84	97	java/lang/Exception
    //   75	84	147	finally
    //   88	92	97	java/lang/Exception
    //   88	92	147	finally
    //   92	95	147	finally
    //   98	121	147	finally
    //   124	135	147	finally
    //   135	142	147	finally
    //   142	145	147	finally
    //   148	151	147	finally
  }
  
  private static Boolean a() {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.f : I
    //   6: iconst_2
    //   7: if_icmplt -> 29
    //   10: iconst_1
    //   11: istore_0
    //   12: goto -> 15
    //   15: ldc com/google/android/gms/dynamite/DynamiteModule
    //   17: monitorexit
    //   18: iload_0
    //   19: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   22: areturn
    //   23: astore_1
    //   24: ldc com/google/android/gms/dynamite/DynamiteModule
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    //   29: iconst_0
    //   30: istore_0
    //   31: goto -> 15
    // Exception table:
    //   from	to	target	type
    //   3	10	23	finally
    //   15	23	23	finally
    //   24	27	23	finally
  }
  
  private static void a(ClassLoader paramClassLoader) {
    try {
      m m1;
      IBinder iBinder = paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (iBinder == null) {
        iBinder = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if (iInterface instanceof m) {
          m1 = (m)iInterface;
        } else {
          m1 = new l((IBinder)m1);
        } 
      } 
      d = m1;
      return;
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (NoSuchMethodException noSuchMethodException) {}
    throw new a("Failed to instantiate dynamite loader", noSuchMethodException, null);
  }
  
  private static boolean a(Cursor paramCursor) {
    c c = g.get();
    if (c != null && c.a == null) {
      c.a = paramCursor;
      return true;
    } 
    return false;
  }
  
  @RecentlyNonNull
  public static int b(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString) {
    return a(paramContext, paramString, false);
  }
  
  private static int b(Context paramContext, String paramString, boolean paramBoolean) {
    Context context1;
    k k1 = a(paramContext);
    if (k1 == null)
      return 0; 
    Context context2 = null;
    Cursor cursor2 = null;
    Cursor cursor1 = cursor2;
    try {
      String str;
      null = k1.zzb();
      if (null >= 3) {
        cursor1 = cursor2;
        Cursor cursor = (Cursor)e.f.a.e.f.b.a(k1.b(e.f.a.e.f.b.a(paramContext), paramString, paramBoolean));
        if (cursor != null)
          try {
          
          } catch (RemoteException remoteException) {
          
          } finally {
            paramString = null;
            cursor1 = cursor;
          }  
        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
        if (str != null)
          str.close(); 
        return 0;
      } 
      if (null == 2) {
        cursor1 = cursor2;
        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
        cursor1 = cursor2;
        return k1.a(e.f.a.e.f.b.a(str), paramString, paramBoolean);
      } 
      cursor1 = cursor2;
      Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
      cursor1 = cursor2;
      return k1.c(e.f.a.e.f.b.a(str), paramString, paramBoolean);
    } catch (RemoteException remoteException) {
      paramContext = context2;
      context1 = paramContext;
      String str = String.valueOf(remoteException.getMessage());
      context1 = paramContext;
      if (str.length() != 0) {
        context1 = paramContext;
        str = "Failed to retrieve remote module version: ".concat(str);
      } else {
        context1 = paramContext;
        str = new String("Failed to retrieve remote module version: ");
      } 
      context1 = paramContext;
      Log.w("DynamiteModule", str);
      if (paramContext != null)
        paramContext.close(); 
      return 0;
    } finally {}
    if (context1 != null)
      context1.close(); 
    throw paramContext;
  }
  
  private static DynamiteModule b(Context paramContext, String paramString, int paramInt) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: aload_1
    //   5: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   8: invokevirtual length : ()I
    //   11: bipush #51
    //   13: iadd
    //   14: invokespecial <init> : (I)V
    //   17: astore_3
    //   18: aload_3
    //   19: ldc_w 'Selected remote version of '
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_3
    //   33: ldc_w ', version >= '
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_3
    //   41: iload_2
    //   42: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: ldc 'DynamiteModule'
    //   48: aload_3
    //   49: invokevirtual toString : ()Ljava/lang/String;
    //   52: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   55: pop
    //   56: ldc com/google/android/gms/dynamite/DynamiteModule
    //   58: monitorenter
    //   59: getstatic com/google/android/gms/dynamite/DynamiteModule.d : Lcom/google/android/gms/dynamite/m;
    //   62: astore_3
    //   63: ldc com/google/android/gms/dynamite/DynamiteModule
    //   65: monitorexit
    //   66: aload_3
    //   67: ifnull -> 222
    //   70: getstatic com/google/android/gms/dynamite/DynamiteModule.g : Ljava/lang/ThreadLocal;
    //   73: invokevirtual get : ()Ljava/lang/Object;
    //   76: checkcast com/google/android/gms/dynamite/DynamiteModule$c
    //   79: astore #4
    //   81: aload #4
    //   83: ifnull -> 210
    //   86: aload #4
    //   88: getfield a : Landroid/database/Cursor;
    //   91: ifnull -> 210
    //   94: aload_0
    //   95: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   98: astore_0
    //   99: aload #4
    //   101: getfield a : Landroid/database/Cursor;
    //   104: astore #4
    //   106: aconst_null
    //   107: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   110: pop
    //   111: invokestatic a : ()Ljava/lang/Boolean;
    //   114: invokevirtual booleanValue : ()Z
    //   117: ifeq -> 150
    //   120: ldc 'DynamiteModule'
    //   122: ldc_w 'Dynamite loader version >= 2, using loadModule2NoCrashUtils'
    //   125: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   128: pop
    //   129: aload_3
    //   130: aload_0
    //   131: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   134: aload_1
    //   135: iload_2
    //   136: aload #4
    //   138: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   141: invokeinterface b : (Le/f/a/e/f/a;Ljava/lang/String;ILe/f/a/e/f/a;)Le/f/a/e/f/a;
    //   146: astore_0
    //   147: goto -> 177
    //   150: ldc 'DynamiteModule'
    //   152: ldc_w 'Dynamite loader version < 2, falling back to loadModule2'
    //   155: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   158: pop
    //   159: aload_3
    //   160: aload_0
    //   161: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   164: aload_1
    //   165: iload_2
    //   166: aload #4
    //   168: invokestatic a : (Ljava/lang/Object;)Le/f/a/e/f/a;
    //   171: invokeinterface a : (Le/f/a/e/f/a;Ljava/lang/String;ILe/f/a/e/f/a;)Le/f/a/e/f/a;
    //   176: astore_0
    //   177: aload_0
    //   178: invokestatic a : (Le/f/a/e/f/a;)Ljava/lang/Object;
    //   181: checkcast android/content/Context
    //   184: astore_0
    //   185: aload_0
    //   186: ifnull -> 198
    //   189: new com/google/android/gms/dynamite/DynamiteModule
    //   192: dup
    //   193: aload_0
    //   194: invokespecial <init> : (Landroid/content/Context;)V
    //   197: areturn
    //   198: new com/google/android/gms/dynamite/DynamiteModule$a
    //   201: dup
    //   202: ldc_w 'Failed to get module context'
    //   205: aconst_null
    //   206: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   209: athrow
    //   210: new com/google/android/gms/dynamite/DynamiteModule$a
    //   213: dup
    //   214: ldc_w 'No result cursor'
    //   217: aconst_null
    //   218: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   221: athrow
    //   222: new com/google/android/gms/dynamite/DynamiteModule$a
    //   225: dup
    //   226: ldc_w 'DynamiteLoaderV2 was not cached.'
    //   229: aconst_null
    //   230: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   233: athrow
    //   234: astore_0
    //   235: ldc com/google/android/gms/dynamite/DynamiteModule
    //   237: monitorexit
    //   238: aload_0
    //   239: athrow
    // Exception table:
    //   from	to	target	type
    //   59	66	234	finally
    //   235	238	234	finally
  }
  
  private static int c(Context paramContext, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: aload_0
    //   4: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   7: astore #6
    //   9: iload_2
    //   10: ifeq -> 272
    //   13: ldc_w 'api_force_staging'
    //   16: astore_0
    //   17: goto -> 20
    //   20: new java/lang/StringBuilder
    //   23: dup
    //   24: aload_0
    //   25: invokevirtual length : ()I
    //   28: bipush #42
    //   30: iadd
    //   31: aload_1
    //   32: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   35: invokevirtual length : ()I
    //   38: iadd
    //   39: invokespecial <init> : (I)V
    //   42: astore #7
    //   44: aload #7
    //   46: ldc_w 'content://com.google.android.gms.chimera/'
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #7
    //   55: aload_0
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload #7
    //   62: ldc_w '/'
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload #7
    //   71: aload_1
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload #6
    //   78: aload #7
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   86: aconst_null
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   93: astore_0
    //   94: aload_0
    //   95: ifnull -> 198
    //   98: aload_0
    //   99: invokeinterface moveToFirst : ()Z
    //   104: ifeq -> 198
    //   107: aload_0
    //   108: iconst_0
    //   109: invokeinterface getInt : (I)I
    //   114: istore_3
    //   115: aload_0
    //   116: astore_1
    //   117: iload_3
    //   118: ifle -> 186
    //   121: ldc com/google/android/gms/dynamite/DynamiteModule
    //   123: monitorenter
    //   124: aload_0
    //   125: iconst_2
    //   126: invokeinterface getString : (I)Ljava/lang/String;
    //   131: putstatic com/google/android/gms/dynamite/DynamiteModule.e : Ljava/lang/String;
    //   134: aload_0
    //   135: ldc_w 'loaderVersion'
    //   138: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   143: istore #4
    //   145: iload #4
    //   147: iflt -> 161
    //   150: aload_0
    //   151: iload #4
    //   153: invokeinterface getInt : (I)I
    //   158: putstatic com/google/android/gms/dynamite/DynamiteModule.f : I
    //   161: ldc com/google/android/gms/dynamite/DynamiteModule
    //   163: monitorexit
    //   164: aload_0
    //   165: invokestatic a : (Landroid/database/Cursor;)Z
    //   168: istore_2
    //   169: aload_0
    //   170: astore_1
    //   171: iload_2
    //   172: ifeq -> 186
    //   175: aconst_null
    //   176: astore_1
    //   177: goto -> 186
    //   180: astore_1
    //   181: ldc com/google/android/gms/dynamite/DynamiteModule
    //   183: monitorexit
    //   184: aload_1
    //   185: athrow
    //   186: aload_1
    //   187: ifnull -> 196
    //   190: aload_1
    //   191: invokeinterface close : ()V
    //   196: iload_3
    //   197: ireturn
    //   198: ldc 'DynamiteModule'
    //   200: ldc_w 'Failed to retrieve remote module version.'
    //   203: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   206: pop
    //   207: new com/google/android/gms/dynamite/DynamiteModule$a
    //   210: dup
    //   211: ldc_w 'Failed to connect to dynamite module ContentResolver.'
    //   214: aconst_null
    //   215: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   218: athrow
    //   219: astore_1
    //   220: goto -> 260
    //   223: astore_1
    //   224: goto -> 237
    //   227: astore_1
    //   228: aload #5
    //   230: astore_0
    //   231: goto -> 260
    //   234: astore_1
    //   235: aconst_null
    //   236: astore_0
    //   237: aload_1
    //   238: instanceof com/google/android/gms/dynamite/DynamiteModule$a
    //   241: ifeq -> 246
    //   244: aload_1
    //   245: athrow
    //   246: new com/google/android/gms/dynamite/DynamiteModule$a
    //   249: dup
    //   250: ldc_w 'V2 version check failed'
    //   253: aload_1
    //   254: aconst_null
    //   255: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/b;)V
    //   258: athrow
    //   259: astore_1
    //   260: aload_0
    //   261: ifnull -> 270
    //   264: aload_0
    //   265: invokeinterface close : ()V
    //   270: aload_1
    //   271: athrow
    //   272: ldc_w 'api'
    //   275: astore_0
    //   276: goto -> 20
    // Exception table:
    //   from	to	target	type
    //   3	9	234	java/lang/Exception
    //   3	9	227	finally
    //   20	94	234	java/lang/Exception
    //   20	94	227	finally
    //   98	115	223	java/lang/Exception
    //   98	115	219	finally
    //   121	124	223	java/lang/Exception
    //   121	124	219	finally
    //   124	145	180	finally
    //   150	161	180	finally
    //   161	164	180	finally
    //   164	169	223	java/lang/Exception
    //   164	169	219	finally
    //   181	184	180	finally
    //   184	186	223	java/lang/Exception
    //   184	186	219	finally
    //   198	219	223	java/lang/Exception
    //   198	219	219	finally
    //   237	246	259	finally
    //   246	259	259	finally
  }
  
  private static DynamiteModule c(Context paramContext, String paramString) {
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Selected local version of ".concat(paramString);
    } else {
      paramString = new String("Selected local version of ");
    } 
    Log.i("DynamiteModule", paramString);
    return new DynamiteModule(paramContext.getApplicationContext());
  }
  
  @RecentlyNonNull
  public final IBinder a(@RecentlyNonNull String paramString) {
    try {
      return (IBinder)this.a.getClassLoader().loadClass(paramString).newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (IllegalAccessException illegalAccessException) {}
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Failed to instantiate module class: ".concat(paramString);
    } else {
      paramString = new String("Failed to instantiate module class: ");
    } 
    throw new a(paramString, illegalAccessException, null);
  }
  
  static {
    new d();
    new c();
    new f();
    new e();
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader {
    @RecentlyNullable
    public static ClassLoader sClassLoader;
  }
  
  public static class a extends Exception {
    private a(String param1String) {
      super(param1String);
    }
    
    private a(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
  }
  
  public static interface b {
    a a(Context param1Context, String param1String, b param1b);
    
    public static final class a {
      public int a = 0;
      
      public int b = 0;
      
      public int c = 0;
    }
    
    public static interface b {
      int a(Context param2Context, String param2String);
      
      int a(Context param2Context, String param2String, boolean param2Boolean);
    }
  }
  
  public static final class a {
    public int a = 0;
    
    public int b = 0;
    
    public int c = 0;
  }
  
  public static interface b {
    int a(Context param1Context, String param1String);
    
    int a(Context param1Context, String param1String, boolean param1Boolean);
  }
  
  private static final class c {
    public Cursor a;
    
    private c() {}
  }
  
  private static final class d implements b.b {
    private final int a;
    
    public d(int param1Int1, int param1Int2) {
      this.a = param1Int1;
    }
    
    public final int a(Context param1Context, String param1String) {
      return this.a;
    }
    
    public final int a(Context param1Context, String param1String, boolean param1Boolean) {
      return 0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */