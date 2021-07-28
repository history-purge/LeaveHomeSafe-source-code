package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.o.a;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
  static final boolean a;
  
  static k b;
  
  private static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
  
  private static l[] d = null;
  
  private static volatile int e = 0;
  
  private static n[] f;
  
  private static b g;
  
  private static final HashSet<String> h = new HashSet<String>();
  
  private static final Map<String, Object> i = new HashMap<String, Object>();
  
  private static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
  
  private static m k = null;
  
  private static int l;
  
  private static boolean m;
  
  static {
    try {
      int i = Build.VERSION.SDK_INT;
      if (i >= 18)
        bool = true; 
    } catch (NoClassDefFoundError|UnsatisfiedLinkError noClassDefFoundError) {}
    a = bool;
  }
  
  private static void a() {
    c.readLock().lock();
    try {
      l[] arrayOfL = d;
      if (arrayOfL != null)
        return; 
      throw new RuntimeException("SoLoader.init() not yet called");
    } finally {
      c.readLock().unlock();
    } 
  }
  
  public static void a(Context paramContext, int paramInt) {
    a(paramContext, paramInt, (k)null);
  }
  
  public static void a(Context paramContext, int paramInt, k paramk) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskWrites();
    try {
      m = a(paramContext);
      a(paramk);
      b(paramContext, paramInt, paramk);
      if (!a.a())
        a.a(new j()); 
      return;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  public static void a(Context paramContext, boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    try {
      a(paramContext, bool);
      return;
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
  
  private static void a(k paramk) {
    // Byte code:
    //   0: ldc com/facebook/soloader/SoLoader
    //   2: monitorenter
    //   3: aload_0
    //   4: ifnull -> 15
    //   7: aload_0
    //   8: putstatic com/facebook/soloader/SoLoader.b : Lcom/facebook/soloader/k;
    //   11: ldc com/facebook/soloader/SoLoader
    //   13: monitorexit
    //   14: return
    //   15: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   18: astore_2
    //   19: invokestatic b : ()Ljava/lang/reflect/Method;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnull -> 71
    //   27: iconst_1
    //   28: istore_1
    //   29: goto -> 32
    //   32: iload_1
    //   33: ifeq -> 76
    //   36: invokestatic a : ()Ljava/lang/String;
    //   39: astore_0
    //   40: goto -> 43
    //   43: new com/facebook/soloader/SoLoader$a
    //   46: dup
    //   47: iload_1
    //   48: aload_0
    //   49: aload_0
    //   50: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   53: aload_2
    //   54: aload_3
    //   55: invokespecial <init> : (ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Runtime;Ljava/lang/reflect/Method;)V
    //   58: putstatic com/facebook/soloader/SoLoader.b : Lcom/facebook/soloader/k;
    //   61: ldc com/facebook/soloader/SoLoader
    //   63: monitorexit
    //   64: return
    //   65: astore_0
    //   66: ldc com/facebook/soloader/SoLoader
    //   68: monitorexit
    //   69: aload_0
    //   70: athrow
    //   71: iconst_0
    //   72: istore_1
    //   73: goto -> 32
    //   76: aconst_null
    //   77: astore_0
    //   78: goto -> 43
    // Exception table:
    //   from	to	target	type
    //   7	11	65	finally
    //   15	23	65	finally
    //   36	40	65	finally
    //   43	61	65	finally
  }
  
  private static void a(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    c.readLock().lock();
    try {
      l[] arrayOfL = d;
      if (arrayOfL != null) {
        boolean bool;
        c.readLock().unlock();
        if (paramThreadPolicy == null) {
          paramThreadPolicy = StrictMode.allowThreadDiskReads();
          bool = true;
        } else {
          bool = false;
        } 
        if (a)
          Api18TraceUtils.a("SoLoader.loadLibrary[", paramString, "]"); 
        int i = 0;
        while (true) {
          StringBuilder stringBuilder1;
          int j = i;
          try {
            int i1;
            boolean bool1;
            c.readLock().lock();
            j = i;
            int i2 = e;
            j = 0;
            while (true) {
              i1 = i;
              if (!i) {
                bool1 = i;
                i1 = i;
                try {
                  if (j < d.length) {
                    bool1 = i;
                    i = d[j].a(paramString, paramInt, paramThreadPolicy);
                    if (i == 3) {
                      bool1 = i;
                      if (f != null) {
                        bool1 = i;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        bool1 = i;
                        stringBuilder2.append("Trying backup SoSource for ");
                        bool1 = i;
                        stringBuilder2.append(paramString);
                        bool1 = i;
                        Log.d("SoLoader", stringBuilder2.toString());
                        bool1 = i;
                        n[] arrayOfN = f;
                        bool1 = i;
                        int i3 = arrayOfN.length;
                        j = 0;
                        while (true) {
                          i1 = i;
                          if (j < i3) {
                            n n1 = arrayOfN[j];
                            bool1 = i;
                            n1.b(paramString);
                            bool1 = i;
                            i1 = n1.a(paramString, paramInt, paramThreadPolicy);
                            if (i1 == 1)
                              break; 
                            j++;
                            continue;
                          } 
                          break;
                        } 
                        break;
                      } 
                    } 
                    j++;
                    continue;
                  } 
                } finally {
                  j = bool1;
                  c.readLock().unlock();
                  j = bool1;
                } 
              } 
              break;
            } 
            j = i1;
          } finally {
            arrayOfL = null;
            if (a)
              Api18TraceUtils.a(); 
            if (bool)
              StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)stringBuilder1); 
            if (j == 0 || j == 3) {
              stringBuilder1 = new StringBuilder();
              stringBuilder1.append("couldn't find DSO to load: ");
              stringBuilder1.append(paramString);
              String str2 = stringBuilder1.toString();
              String str1 = arrayOfL.getMessage();
              paramString = str1;
              if (str1 == null)
                paramString = arrayOfL.toString(); 
              StringBuilder stringBuilder2 = new StringBuilder();
              stringBuilder2.append(str2);
              stringBuilder2.append(" caused by: ");
              stringBuilder2.append(paramString);
              paramString = stringBuilder2.toString();
              arrayOfL.printStackTrace();
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append(paramString);
              stringBuilder2.append(" result: ");
              stringBuilder2.append(j);
              paramString = stringBuilder2.toString();
              Log.e("SoLoader", paramString);
              throw new UnsatisfiedLinkError(paramString);
            } 
          } 
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not load: ");
      stringBuilder.append(paramString);
      stringBuilder.append(" because no SO source exists");
      Log.e("SoLoader", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("couldn't find DSO to load: ");
      stringBuilder.append(paramString);
      throw new UnsatisfiedLinkError(stringBuilder.toString());
    } finally {
      c.readLock().unlock();
    } 
  }
  
  private static boolean a(Context paramContext) {
    return (paramContext != null && ((paramContext.getApplicationInfo()).flags & 0x81) != 0);
  }
  
  public static boolean a(String paramString) {
    return a(paramString, 0);
  }
  
  public static boolean a(String paramString, int paramInt) {
    // Byte code:
    //   0: getstatic com/facebook/soloader/SoLoader.c : Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   3: invokevirtual readLock : ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   6: invokevirtual lock : ()V
    //   9: getstatic com/facebook/soloader/SoLoader.d : [Lcom/facebook/soloader/l;
    //   12: ifnonnull -> 95
    //   15: ldc_w 'http://www.android.com/'
    //   18: ldc_w 'java.vendor.url'
    //   21: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   24: invokevirtual equals : (Ljava/lang/Object;)Z
    //   27: ifeq -> 36
    //   30: invokestatic a : ()V
    //   33: goto -> 95
    //   36: ldc com/facebook/soloader/SoLoader
    //   38: monitorenter
    //   39: getstatic com/facebook/soloader/SoLoader.h : Ljava/util/HashSet;
    //   42: aload_0
    //   43: invokevirtual contains : (Ljava/lang/Object;)Z
    //   46: iconst_1
    //   47: ixor
    //   48: istore_2
    //   49: iload_2
    //   50: ifeq -> 75
    //   53: getstatic com/facebook/soloader/SoLoader.k : Lcom/facebook/soloader/m;
    //   56: ifnull -> 71
    //   59: getstatic com/facebook/soloader/SoLoader.k : Lcom/facebook/soloader/m;
    //   62: aload_0
    //   63: invokeinterface a : (Ljava/lang/String;)V
    //   68: goto -> 75
    //   71: aload_0
    //   72: invokestatic loadLibrary : (Ljava/lang/String;)V
    //   75: ldc com/facebook/soloader/SoLoader
    //   77: monitorexit
    //   78: getstatic com/facebook/soloader/SoLoader.c : Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   81: invokevirtual readLock : ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   84: invokevirtual unlock : ()V
    //   87: iload_2
    //   88: ireturn
    //   89: astore_0
    //   90: ldc com/facebook/soloader/SoLoader
    //   92: monitorexit
    //   93: aload_0
    //   94: athrow
    //   95: getstatic com/facebook/soloader/SoLoader.c : Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   98: invokevirtual readLock : ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   101: invokevirtual unlock : ()V
    //   104: getstatic com/facebook/soloader/SoLoader.m : Z
    //   107: ifeq -> 127
    //   110: getstatic com/facebook/soloader/SoLoader.k : Lcom/facebook/soloader/m;
    //   113: astore_3
    //   114: aload_3
    //   115: ifnull -> 127
    //   118: aload_3
    //   119: aload_0
    //   120: invokeinterface a : (Ljava/lang/String;)V
    //   125: iconst_1
    //   126: ireturn
    //   127: aload_0
    //   128: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   131: astore #4
    //   133: aload #4
    //   135: ifnull -> 144
    //   138: aload #4
    //   140: astore_3
    //   141: goto -> 146
    //   144: aload_0
    //   145: astore_3
    //   146: aload_3
    //   147: invokestatic mapLibraryName : (Ljava/lang/String;)Ljava/lang/String;
    //   150: aload_0
    //   151: aload #4
    //   153: iload_1
    //   154: iconst_2
    //   155: ior
    //   156: aconst_null
    //   157: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Z
    //   160: ireturn
    //   161: astore_0
    //   162: getstatic com/facebook/soloader/SoLoader.c : Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   165: invokevirtual readLock : ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   168: invokevirtual unlock : ()V
    //   171: aload_0
    //   172: athrow
    // Exception table:
    //   from	to	target	type
    //   9	33	161	finally
    //   36	39	161	finally
    //   39	49	89	finally
    //   53	68	89	finally
    //   71	75	89	finally
    //   75	78	89	finally
    //   90	93	89	finally
    //   93	95	161	finally
  }
  
  private static boolean a(String paramString1, String paramString2, String paramString3, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4: istore #8
    //   6: iconst_0
    //   7: istore #7
    //   9: iload #8
    //   11: ifne -> 28
    //   14: getstatic com/facebook/soloader/SoLoader.j : Ljava/util/Set;
    //   17: aload_1
    //   18: invokeinterface contains : (Ljava/lang/Object;)Z
    //   23: ifeq -> 28
    //   26: iconst_0
    //   27: ireturn
    //   28: ldc com/facebook/soloader/SoLoader
    //   30: monitorenter
    //   31: getstatic com/facebook/soloader/SoLoader.h : Ljava/util/HashSet;
    //   34: aload_0
    //   35: invokevirtual contains : (Ljava/lang/Object;)Z
    //   38: ifeq -> 463
    //   41: aload_2
    //   42: ifnonnull -> 457
    //   45: ldc com/facebook/soloader/SoLoader
    //   47: monitorexit
    //   48: iconst_0
    //   49: ireturn
    //   50: getstatic com/facebook/soloader/SoLoader.i : Ljava/util/Map;
    //   53: aload_0
    //   54: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   59: ifeq -> 76
    //   62: getstatic com/facebook/soloader/SoLoader.i : Ljava/util/Map;
    //   65: aload_0
    //   66: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   71: astore #9
    //   73: goto -> 97
    //   76: new java/lang/Object
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: astore #9
    //   85: getstatic com/facebook/soloader/SoLoader.i : Ljava/util/Map;
    //   88: aload_0
    //   89: aload #9
    //   91: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   96: pop
    //   97: ldc com/facebook/soloader/SoLoader
    //   99: monitorexit
    //   100: aload #9
    //   102: monitorenter
    //   103: iload #5
    //   105: istore #6
    //   107: iload #5
    //   109: ifne -> 316
    //   112: ldc com/facebook/soloader/SoLoader
    //   114: monitorenter
    //   115: getstatic com/facebook/soloader/SoLoader.h : Ljava/util/HashSet;
    //   118: aload_0
    //   119: invokevirtual contains : (Ljava/lang/Object;)Z
    //   122: ifeq -> 140
    //   125: aload_2
    //   126: ifnonnull -> 137
    //   129: ldc com/facebook/soloader/SoLoader
    //   131: monitorexit
    //   132: aload #9
    //   134: monitorexit
    //   135: iconst_0
    //   136: ireturn
    //   137: iconst_1
    //   138: istore #5
    //   140: ldc com/facebook/soloader/SoLoader
    //   142: monitorexit
    //   143: iload #5
    //   145: istore #6
    //   147: iload #5
    //   149: ifne -> 316
    //   152: new java/lang/StringBuilder
    //   155: dup
    //   156: invokespecial <init> : ()V
    //   159: astore #10
    //   161: aload #10
    //   163: ldc_w 'About to load: '
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload #10
    //   172: aload_0
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: ldc 'SoLoader'
    //   179: aload #10
    //   181: invokevirtual toString : ()Ljava/lang/String;
    //   184: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   187: pop
    //   188: aload_0
    //   189: iload_3
    //   190: aload #4
    //   192: invokestatic a : (Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V
    //   195: ldc com/facebook/soloader/SoLoader
    //   197: monitorenter
    //   198: new java/lang/StringBuilder
    //   201: dup
    //   202: invokespecial <init> : ()V
    //   205: astore #4
    //   207: aload #4
    //   209: ldc_w 'Loaded: '
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload #4
    //   218: aload_0
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: ldc 'SoLoader'
    //   225: aload #4
    //   227: invokevirtual toString : ()Ljava/lang/String;
    //   230: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   233: pop
    //   234: getstatic com/facebook/soloader/SoLoader.h : Ljava/util/HashSet;
    //   237: aload_0
    //   238: invokevirtual add : (Ljava/lang/Object;)Z
    //   241: pop
    //   242: ldc com/facebook/soloader/SoLoader
    //   244: monitorexit
    //   245: iload #5
    //   247: istore #6
    //   249: goto -> 316
    //   252: astore_0
    //   253: ldc com/facebook/soloader/SoLoader
    //   255: monitorexit
    //   256: aload_0
    //   257: athrow
    //   258: astore_0
    //   259: aload_0
    //   260: invokevirtual getMessage : ()Ljava/lang/String;
    //   263: astore_1
    //   264: aload_1
    //   265: ifnull -> 298
    //   268: aload_1
    //   269: ldc_w 'unexpected e_machine:'
    //   272: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   275: ifeq -> 298
    //   278: new com/facebook/soloader/SoLoader$b
    //   281: dup
    //   282: aload_0
    //   283: aload_1
    //   284: aload_1
    //   285: ldc_w 'unexpected e_machine:'
    //   288: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   291: invokevirtual substring : (I)Ljava/lang/String;
    //   294: invokespecial <init> : (Ljava/lang/Throwable;Ljava/lang/String;)V
    //   297: athrow
    //   298: aload_0
    //   299: athrow
    //   300: astore_0
    //   301: new java/lang/RuntimeException
    //   304: dup
    //   305: aload_0
    //   306: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   309: athrow
    //   310: astore_0
    //   311: ldc com/facebook/soloader/SoLoader
    //   313: monitorexit
    //   314: aload_0
    //   315: athrow
    //   316: iload_3
    //   317: bipush #16
    //   319: iand
    //   320: ifne -> 437
    //   323: iload #7
    //   325: istore_3
    //   326: aload_1
    //   327: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   330: ifne -> 350
    //   333: iload #7
    //   335: istore_3
    //   336: getstatic com/facebook/soloader/SoLoader.j : Ljava/util/Set;
    //   339: aload_1
    //   340: invokeinterface contains : (Ljava/lang/Object;)Z
    //   345: ifeq -> 350
    //   348: iconst_1
    //   349: istore_3
    //   350: aload_2
    //   351: ifnull -> 437
    //   354: iload_3
    //   355: ifne -> 437
    //   358: getstatic com/facebook/soloader/SoLoader.a : Z
    //   361: ifeq -> 373
    //   364: ldc_w 'MergedSoMapping.invokeJniOnload['
    //   367: aload_1
    //   368: ldc ']'
    //   370: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   373: new java/lang/StringBuilder
    //   376: dup
    //   377: invokespecial <init> : ()V
    //   380: astore_2
    //   381: aload_2
    //   382: ldc_w 'About to merge: '
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: aload_2
    //   390: aload_1
    //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: aload_2
    //   396: ldc_w ' / '
    //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: pop
    //   403: aload_2
    //   404: aload_0
    //   405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: ldc 'SoLoader'
    //   411: aload_2
    //   412: invokevirtual toString : ()Ljava/lang/String;
    //   415: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   418: pop
    //   419: aload_1
    //   420: invokestatic a : (Ljava/lang/String;)V
    //   423: aconst_null
    //   424: athrow
    //   425: astore_0
    //   426: getstatic com/facebook/soloader/SoLoader.a : Z
    //   429: ifeq -> 435
    //   432: invokestatic a : ()V
    //   435: aload_0
    //   436: athrow
    //   437: aload #9
    //   439: monitorexit
    //   440: iload #6
    //   442: iconst_1
    //   443: ixor
    //   444: ireturn
    //   445: astore_0
    //   446: aload #9
    //   448: monitorexit
    //   449: aload_0
    //   450: athrow
    //   451: astore_0
    //   452: ldc com/facebook/soloader/SoLoader
    //   454: monitorexit
    //   455: aload_0
    //   456: athrow
    //   457: iconst_1
    //   458: istore #5
    //   460: goto -> 50
    //   463: iconst_0
    //   464: istore #5
    //   466: goto -> 50
    // Exception table:
    //   from	to	target	type
    //   31	41	451	finally
    //   45	48	451	finally
    //   50	73	451	finally
    //   76	97	451	finally
    //   97	100	451	finally
    //   112	115	445	finally
    //   115	125	310	finally
    //   129	132	310	finally
    //   132	135	445	finally
    //   140	143	310	finally
    //   152	195	300	java/io/IOException
    //   152	195	258	java/lang/UnsatisfiedLinkError
    //   152	195	445	finally
    //   195	198	445	finally
    //   198	245	252	finally
    //   253	256	252	finally
    //   256	258	445	finally
    //   259	264	445	finally
    //   268	298	445	finally
    //   298	300	445	finally
    //   301	310	445	finally
    //   311	314	310	finally
    //   314	316	445	finally
    //   326	333	445	finally
    //   336	348	445	finally
    //   358	373	445	finally
    //   373	423	425	finally
    //   426	435	445	finally
    //   435	437	445	finally
    //   437	440	445	finally
    //   446	449	445	finally
    //   452	455	451	finally
  }
  
  public static String b(String paramString) {
    if (paramString == null)
      return null; 
    String[] arrayOfString = paramString.split(":");
    ArrayList<String> arrayList = new ArrayList(arrayOfString.length);
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++) {
      String str = arrayOfString[i];
      if (!str.contains("!"))
        arrayList.add(str); 
    } 
    return TextUtils.join(":", arrayList);
  }
  
  private static Method b() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      if (i > 27)
        return null; 
      try {
        Method method = Runtime.class.getDeclaredMethod("nativeLoad", new Class[] { String.class, ClassLoader.class, String.class });
        method.setAccessible(true);
        return method;
      } catch (NoSuchMethodException noSuchMethodException) {
      
      } catch (SecurityException securityException) {}
      Log.w("SoLoader", "Cannot get nativeLoad method", securityException);
    } 
    return null;
  }
  
  private static void b(Context paramContext, int paramInt, k paramk) {
    c.writeLock().lock();
    try {
      if (d == null) {
        Log.d("SoLoader", "init start");
        l = paramInt;
        ArrayList<c> arrayList = new ArrayList();
        String str2 = System.getenv("LD_LIBRARY_PATH");
        String str1 = str2;
        if (str2 == null)
          str1 = "/vendor/lib:/system/lib"; 
        String[] arrayOfString = str1.split(":");
        int i;
        for (i = 0; i < arrayOfString.length; i++) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("adding system library source: ");
          stringBuilder.append(arrayOfString[i]);
          Log.d("SoLoader", stringBuilder.toString());
          arrayList.add(new c(new File(arrayOfString[i]), 2));
        } 
        if (paramContext != null)
          if ((paramInt & 0x1) != 0) {
            f = null;
            Log.d("SoLoader", "adding exo package source: lib-main");
            arrayList.add(0, new e(paramContext, "lib-main"));
          } else {
            if (m) {
              paramInt = 0;
            } else {
              if (Build.VERSION.SDK_INT <= 17) {
                paramInt = 1;
              } else {
                paramInt = 0;
              } 
              g = new b(paramContext, paramInt);
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("adding application source: ");
              stringBuilder.append(g.toString());
              Log.d("SoLoader", stringBuilder.toString());
              arrayList.add(0, g);
              paramInt = 1;
            } 
            if ((l & 0x8) != 0) {
              f = null;
            } else {
              File file = new File((paramContext.getApplicationInfo()).sourceDir);
              ArrayList<a> arrayList1 = new ArrayList();
              a a = new a(paramContext, file, "lib-main", paramInt);
              arrayList1.add(a);
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("adding backup source from : ");
              stringBuilder.append(a.toString());
              Log.d("SoLoader", stringBuilder.toString());
              if (Build.VERSION.SDK_INT >= 21 && (paramContext.getApplicationInfo()).splitSourceDirs != null) {
                Log.d("SoLoader", "adding backup sources from split apks");
                String[] arrayOfString1 = (paramContext.getApplicationInfo()).splitSourceDirs;
                int i2 = arrayOfString1.length;
                int i1 = 0;
                for (i = 0; i1 < i2; i++) {
                  File file1 = new File(arrayOfString1[i1]);
                  StringBuilder stringBuilder1 = new StringBuilder();
                  stringBuilder1.append("lib-");
                  stringBuilder1.append(i);
                  a a1 = new a(paramContext, file1, stringBuilder1.toString(), paramInt);
                  stringBuilder1 = new StringBuilder();
                  stringBuilder1.append("adding backup source: ");
                  stringBuilder1.append(a1.toString());
                  Log.d("SoLoader", stringBuilder1.toString());
                  arrayList1.add(a1);
                  i1++;
                } 
              } 
              f = arrayList1.<n>toArray(new n[arrayList1.size()]);
              arrayList.addAll(0, (Collection)arrayList1);
            } 
          }  
        l[] arrayOfL = arrayList.<l>toArray(new l[arrayList.size()]);
        int j = c();
        paramInt = arrayOfL.length;
        while (true) {
          i = paramInt - 1;
          if (paramInt > 0) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Preparing SO source: ");
            stringBuilder1.append(arrayOfL[i]);
            Log.d("SoLoader", stringBuilder1.toString());
            arrayOfL[i].a(j);
            paramInt = i;
            continue;
          } 
          d = arrayOfL;
          e++;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("init finish: ");
          stringBuilder.append(d.length);
          stringBuilder.append(" SO sources prepared");
          Log.d("SoLoader", stringBuilder.toString());
          break;
        } 
      } 
      return;
    } finally {
      Log.d("SoLoader", "init exiting");
      c.writeLock().unlock();
    } 
  }
  
  static void b(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    a(paramString, null, null, paramInt, paramThreadPolicy);
  }
  
  private static int c() {
    c.writeLock().lock();
    try {
      int i = l;
      if ((i & 0x2) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      return i;
    } finally {
      c.writeLock().unlock();
    } 
  }
  
  public static File c(String paramString) {
    a();
    try {
      return d(System.mapLibraryName(paramString));
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
  
  static File d(String paramString) {
    c.readLock().lock();
    int i = 0;
    try {
      while (i < d.length) {
        File file = d[i].a(paramString);
        if (file != null)
          return file; 
        i++;
      } 
      c.readLock().unlock();
      throw new FileNotFoundException(paramString);
    } finally {
      c.readLock().unlock();
    } 
  }
  
  static {
    boolean bool = false;
  }
  
  @TargetApi(14)
  @d
  private static class Api14Utils {
    public static String a() {
      ClassLoader classLoader = SoLoader.class.getClassLoader();
      if (classLoader instanceof BaseDexClassLoader)
        try {
          BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader)classLoader;
          return (String)BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke(baseDexClassLoader, new Object[0]);
        } catch (Exception exception) {
          throw new RuntimeException("Cannot call getLdLibraryPath", exception);
        }  
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ClassLoader ");
      stringBuilder.append(exception.getClass().getName());
      stringBuilder.append(" should be of type BaseDexClassLoader");
      throw new IllegalStateException(stringBuilder.toString());
    }
  }
  
  static final class a implements k {
    a(boolean param1Boolean, String param1String1, String param1String2, Runtime param1Runtime, Method param1Method) {}
    
    private String a(String param1String) {
      try {
        File file = new File(param1String);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
          byte[] arrayOfByte = new byte[4096];
          while (true) {
            int i = fileInputStream.read(arrayOfByte);
            if (i > 0) {
              messageDigest.update(arrayOfByte, 0, i);
              continue;
            } 
            return String.format("%32x", new Object[] { new BigInteger(1, messageDigest.digest()) });
          } 
        } finally {
          messageDigest = null;
        } 
      } catch (IOException iOException) {
        return iOException.toString();
      } catch (SecurityException securityException) {
        return securityException.toString();
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        return noSuchAlgorithmException.toString();
      } 
    }
    
    public void a(String param1String, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield a : Z
      //   4: ifeq -> 501
      //   7: iload_2
      //   8: iconst_4
      //   9: iand
      //   10: iconst_4
      //   11: if_icmpne -> 19
      //   14: iconst_1
      //   15: istore_2
      //   16: goto -> 21
      //   19: iconst_0
      //   20: istore_2
      //   21: iload_2
      //   22: ifeq -> 33
      //   25: aload_0
      //   26: getfield b : Ljava/lang/String;
      //   29: astore_3
      //   30: goto -> 38
      //   33: aload_0
      //   34: getfield c : Ljava/lang/String;
      //   37: astore_3
      //   38: aconst_null
      //   39: astore #13
      //   41: aconst_null
      //   42: astore #14
      //   44: aconst_null
      //   45: astore #15
      //   47: aconst_null
      //   48: astore #16
      //   50: aconst_null
      //   51: astore #12
      //   53: aload #13
      //   55: astore #5
      //   57: aload_3
      //   58: astore #6
      //   60: aload #14
      //   62: astore #10
      //   64: aload_3
      //   65: astore #7
      //   67: aload #15
      //   69: astore #11
      //   71: aload_3
      //   72: astore #8
      //   74: aload #16
      //   76: astore #9
      //   78: aload_3
      //   79: astore #4
      //   81: aload_0
      //   82: getfield d : Ljava/lang/Runtime;
      //   85: astore #17
      //   87: aload #13
      //   89: astore #5
      //   91: aload_3
      //   92: astore #6
      //   94: aload #14
      //   96: astore #10
      //   98: aload_3
      //   99: astore #7
      //   101: aload #15
      //   103: astore #11
      //   105: aload_3
      //   106: astore #8
      //   108: aload #16
      //   110: astore #9
      //   112: aload_3
      //   113: astore #4
      //   115: aload #17
      //   117: monitorenter
      //   118: aload #12
      //   120: astore #5
      //   122: aload_3
      //   123: astore #6
      //   125: aload_0
      //   126: getfield e : Ljava/lang/reflect/Method;
      //   129: aload_0
      //   130: getfield d : Ljava/lang/Runtime;
      //   133: iconst_3
      //   134: anewarray java/lang/Object
      //   137: dup
      //   138: iconst_0
      //   139: aload_1
      //   140: aastore
      //   141: dup
      //   142: iconst_1
      //   143: ldc com/facebook/soloader/SoLoader
      //   145: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
      //   148: aastore
      //   149: dup
      //   150: iconst_2
      //   151: aload_3
      //   152: aastore
      //   153: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   156: checkcast java/lang/String
      //   159: astore #4
      //   161: aload #4
      //   163: ifnonnull -> 250
      //   166: aload #17
      //   168: monitorexit
      //   169: aload #4
      //   171: ifnull -> 505
      //   174: new java/lang/StringBuilder
      //   177: dup
      //   178: invokespecial <init> : ()V
      //   181: astore #5
      //   183: aload #5
      //   185: ldc 'Error when loading lib: '
      //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   190: pop
      //   191: aload #5
      //   193: aload #4
      //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   198: pop
      //   199: aload #5
      //   201: ldc ' lib hash: '
      //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   206: pop
      //   207: aload #5
      //   209: aload_0
      //   210: aload_1
      //   211: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
      //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   217: pop
      //   218: aload #5
      //   220: ldc ' search path is '
      //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   225: pop
      //   226: aload #5
      //   228: aload_3
      //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   232: pop
      //   233: ldc 'SoLoader'
      //   235: aload #5
      //   237: invokevirtual toString : ()Ljava/lang/String;
      //   240: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
      //   243: pop
      //   244: return
      //   245: astore #12
      //   247: goto -> 269
      //   250: new java/lang/UnsatisfiedLinkError
      //   253: dup
      //   254: aload #4
      //   256: invokespecial <init> : (Ljava/lang/String;)V
      //   259: athrow
      //   260: astore #12
      //   262: aload #6
      //   264: astore_3
      //   265: aload #5
      //   267: astore #4
      //   269: aload #4
      //   271: astore #5
      //   273: aload_3
      //   274: astore #6
      //   276: aload #17
      //   278: monitorexit
      //   279: aload #4
      //   281: astore #5
      //   283: aload_3
      //   284: astore #6
      //   286: aload #4
      //   288: astore #10
      //   290: aload_3
      //   291: astore #7
      //   293: aload #4
      //   295: astore #11
      //   297: aload_3
      //   298: astore #8
      //   300: aload #4
      //   302: astore #9
      //   304: aload_3
      //   305: astore #4
      //   307: aload #12
      //   309: athrow
      //   310: astore_3
      //   311: goto -> 423
      //   314: astore #4
      //   316: aload #10
      //   318: astore_3
      //   319: aload #4
      //   321: astore #10
      //   323: aload #7
      //   325: astore #4
      //   327: goto -> 347
      //   330: astore #10
      //   332: aload #11
      //   334: astore_3
      //   335: aload #8
      //   337: astore #4
      //   339: goto -> 347
      //   342: astore #10
      //   344: aload #9
      //   346: astore_3
      //   347: aload_3
      //   348: astore #5
      //   350: aload #4
      //   352: astore #6
      //   354: new java/lang/StringBuilder
      //   357: dup
      //   358: invokespecial <init> : ()V
      //   361: astore #7
      //   363: aload_3
      //   364: astore #5
      //   366: aload #4
      //   368: astore #6
      //   370: aload #7
      //   372: ldc 'Error: Cannot load '
      //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   377: pop
      //   378: aload_3
      //   379: astore #5
      //   381: aload #4
      //   383: astore #6
      //   385: aload #7
      //   387: aload_1
      //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   391: pop
      //   392: aload_3
      //   393: astore #5
      //   395: aload #4
      //   397: astore #6
      //   399: aload #7
      //   401: invokevirtual toString : ()Ljava/lang/String;
      //   404: astore_3
      //   405: aload_3
      //   406: astore #5
      //   408: aload #4
      //   410: astore #6
      //   412: new java/lang/RuntimeException
      //   415: dup
      //   416: aload_3
      //   417: aload #10
      //   419: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
      //   422: athrow
      //   423: aload #5
      //   425: ifnull -> 499
      //   428: new java/lang/StringBuilder
      //   431: dup
      //   432: invokespecial <init> : ()V
      //   435: astore #4
      //   437: aload #4
      //   439: ldc 'Error when loading lib: '
      //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   444: pop
      //   445: aload #4
      //   447: aload #5
      //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   452: pop
      //   453: aload #4
      //   455: ldc ' lib hash: '
      //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   460: pop
      //   461: aload #4
      //   463: aload_0
      //   464: aload_1
      //   465: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
      //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   471: pop
      //   472: aload #4
      //   474: ldc ' search path is '
      //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   479: pop
      //   480: aload #4
      //   482: aload #6
      //   484: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   487: pop
      //   488: ldc 'SoLoader'
      //   490: aload #4
      //   492: invokevirtual toString : ()Ljava/lang/String;
      //   495: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
      //   498: pop
      //   499: aload_3
      //   500: athrow
      //   501: aload_1
      //   502: invokestatic load : (Ljava/lang/String;)V
      //   505: return
      // Exception table:
      //   from	to	target	type
      //   81	87	342	java/lang/IllegalAccessException
      //   81	87	330	java/lang/IllegalArgumentException
      //   81	87	314	java/lang/reflect/InvocationTargetException
      //   81	87	310	finally
      //   115	118	342	java/lang/IllegalAccessException
      //   115	118	330	java/lang/IllegalArgumentException
      //   115	118	314	java/lang/reflect/InvocationTargetException
      //   115	118	310	finally
      //   125	161	260	finally
      //   166	169	245	finally
      //   250	260	245	finally
      //   276	279	260	finally
      //   307	310	342	java/lang/IllegalAccessException
      //   307	310	330	java/lang/IllegalArgumentException
      //   307	310	314	java/lang/reflect/InvocationTargetException
      //   307	310	310	finally
      //   354	363	310	finally
      //   370	378	310	finally
      //   385	392	310	finally
      //   399	405	310	finally
      //   412	423	310	finally
    }
  }
  
  public static final class b extends UnsatisfiedLinkError {
    b(Throwable param1Throwable, String param1String) {
      super(stringBuilder.toString());
      initCause(param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/SoLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */