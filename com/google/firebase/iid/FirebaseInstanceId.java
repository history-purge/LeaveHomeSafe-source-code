package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.firebase.g;
import com.google.firebase.iid.w.a;
import com.google.firebase.installations.i;
import com.google.firebase.o.f;
import com.google.firebase.p.b;
import com.google.firebase.r.i;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@Deprecated
public class FirebaseInstanceId {
  private static final long i = TimeUnit.HOURS.toSeconds(8L);
  
  private static u j;
  
  private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
  
  static ScheduledExecutorService l;
  
  final Executor a;
  
  private final g b;
  
  private final n c;
  
  private final k d;
  
  private final s e;
  
  private final i f;
  
  private boolean g;
  
  private final List<a.a> h;
  
  FirebaseInstanceId(g paramg, n paramn, Executor paramExecutor1, Executor paramExecutor2, b<i> paramb, b<f> paramb1, i parami) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield g : Z
    //   9: aload_0
    //   10: new java/util/ArrayList
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield h : Ljava/util/List;
    //   20: aload_1
    //   21: invokestatic a : (Lcom/google/firebase/g;)Ljava/lang/String;
    //   24: ifnull -> 113
    //   27: ldc com/google/firebase/iid/FirebaseInstanceId
    //   29: monitorenter
    //   30: getstatic com/google/firebase/iid/FirebaseInstanceId.j : Lcom/google/firebase/iid/u;
    //   33: ifnonnull -> 50
    //   36: new com/google/firebase/iid/u
    //   39: dup
    //   40: aload_1
    //   41: invokevirtual b : ()Landroid/content/Context;
    //   44: invokespecial <init> : (Landroid/content/Context;)V
    //   47: putstatic com/google/firebase/iid/FirebaseInstanceId.j : Lcom/google/firebase/iid/u;
    //   50: ldc com/google/firebase/iid/FirebaseInstanceId
    //   52: monitorexit
    //   53: aload_0
    //   54: aload_1
    //   55: putfield b : Lcom/google/firebase/g;
    //   58: aload_0
    //   59: aload_2
    //   60: putfield c : Lcom/google/firebase/iid/n;
    //   63: aload_0
    //   64: new com/google/firebase/iid/k
    //   67: dup
    //   68: aload_1
    //   69: aload_2
    //   70: aload #5
    //   72: aload #6
    //   74: aload #7
    //   76: invokespecial <init> : (Lcom/google/firebase/g;Lcom/google/firebase/iid/n;Lcom/google/firebase/p/b;Lcom/google/firebase/p/b;Lcom/google/firebase/installations/i;)V
    //   79: putfield d : Lcom/google/firebase/iid/k;
    //   82: aload_0
    //   83: aload #4
    //   85: putfield a : Ljava/util/concurrent/Executor;
    //   88: aload_0
    //   89: new com/google/firebase/iid/s
    //   92: dup
    //   93: aload_3
    //   94: invokespecial <init> : (Ljava/util/concurrent/Executor;)V
    //   97: putfield e : Lcom/google/firebase/iid/s;
    //   100: aload_0
    //   101: aload #7
    //   103: putfield f : Lcom/google/firebase/installations/i;
    //   106: return
    //   107: astore_1
    //   108: ldc com/google/firebase/iid/FirebaseInstanceId
    //   110: monitorexit
    //   111: aload_1
    //   112: athrow
    //   113: new java/lang/IllegalStateException
    //   116: dup
    //   117: ldc 'FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID'
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    // Exception table:
    //   from	to	target	type
    //   30	50	107	finally
    //   50	53	107	finally
    //   108	111	107	finally
  }
  
  FirebaseInstanceId(g paramg, b<i> paramb, b<f> paramb1, i parami) {
    this(paramg, new n(paramg.b()), b.b(), b.b(), paramb, paramb1, parami);
  }
  
  private <T> T a(l<T> paraml) {
    try {
      return (T)o.a(paraml, 30000L, TimeUnit.MILLISECONDS);
    } catch (ExecutionException executionException) {
      Throwable throwable = executionException.getCause();
      if (throwable instanceof IOException) {
        if ("INSTANCE_ID_RESET".equals(throwable.getMessage()))
          i(); 
        throw (IOException)throwable;
      } 
      if (throwable instanceof RuntimeException)
        throw (RuntimeException)throwable; 
      throw new IOException(executionException);
    } catch (InterruptedException|java.util.concurrent.TimeoutException interruptedException) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    } 
  }
  
  private static void a(g paramg) {
    q.a(paramg.d().f(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
    q.a(paramg.d().b(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
    q.a(paramg.d().a(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
    q.a(b(paramg.d().b()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    q.a(a(paramg.d().a()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
  }
  
  static boolean a(String paramString) {
    return k.matcher(paramString).matches();
  }
  
  private static <T> T b(l<T> paraml) {
    q.a(paraml, "Task must not be null");
    CountDownLatch countDownLatch = new CountDownLatch(1);
    paraml.a(d.c, new e(countDownLatch));
    countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
    return c(paraml);
  }
  
  static boolean b(String paramString) {
    return paramString.contains(":");
  }
  
  private static <T> T c(l<T> paraml) {
    if (paraml.e())
      return (T)paraml.b(); 
    if (!paraml.c()) {
      if (paraml.d())
        throw new IllegalStateException(paraml.a()); 
      throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    } 
    throw new CancellationException("Task is already canceled");
  }
  
  private static String c(String paramString) {
    return (paramString.isEmpty() || paramString.equalsIgnoreCase("fcm") || paramString.equalsIgnoreCase("gcm")) ? "*" : paramString;
  }
  
  private l<l> d(String paramString1, String paramString2) {
    paramString2 = c(paramString2);
    return o.a(null).b(this.a, new c(this, paramString1, paramString2));
  }
  
  @Keep
  public static FirebaseInstanceId getInstance(g paramg) {
    a(paramg);
    FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)paramg.a(FirebaseInstanceId.class);
    q.a(firebaseInstanceId, "Firebase Instance ID component is not present");
    return firebaseInstanceId;
  }
  
  public static FirebaseInstanceId k() {
    return getInstance(g.k());
  }
  
  private String l() {
    return "[DEFAULT]".equals(this.b.c()) ? "" : this.b.e();
  }
  
  static boolean m() {
    boolean bool1 = Log.isLoggable("FirebaseInstanceId", 3);
    boolean bool = true;
    if (!bool1) {
      if (Build.VERSION.SDK_INT == 23)
        return Log.isLoggable("FirebaseInstanceId", 3); 
      bool = false;
    } 
    return bool;
  }
  
  String a() {
    return b(n.a(this.b), "*");
  }
  
  void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: new com/google/firebase/iid/v
    //   6: dup
    //   7: aload_0
    //   8: ldc2_w 30
    //   11: lload_1
    //   12: lload_1
    //   13: ladd
    //   14: invokestatic max : (JJ)J
    //   17: getstatic com/google/firebase/iid/FirebaseInstanceId.i : J
    //   20: invokestatic min : (JJ)J
    //   23: invokespecial <init> : (Lcom/google/firebase/iid/FirebaseInstanceId;J)V
    //   26: lload_1
    //   27: invokevirtual a : (Ljava/lang/Runnable;J)V
    //   30: aload_0
    //   31: iconst_1
    //   32: putfield g : Z
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_3
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_3
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	35	38	finally
  }
  
  void a(a.a parama) {
    this.h.add(parama);
  }
  
  void a(Runnable paramRunnable, long paramLong) {
    // Byte code:
    //   0: ldc com/google/firebase/iid/FirebaseInstanceId
    //   2: monitorenter
    //   3: getstatic com/google/firebase/iid/FirebaseInstanceId.l : Ljava/util/concurrent/ScheduledExecutorService;
    //   6: ifnonnull -> 30
    //   9: new java/util/concurrent/ScheduledThreadPoolExecutor
    //   12: dup
    //   13: iconst_1
    //   14: new com/google/android/gms/common/util/p/a
    //   17: dup
    //   18: ldc_w 'FirebaseInstanceId'
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: invokespecial <init> : (ILjava/util/concurrent/ThreadFactory;)V
    //   27: putstatic com/google/firebase/iid/FirebaseInstanceId.l : Ljava/util/concurrent/ScheduledExecutorService;
    //   30: getstatic com/google/firebase/iid/FirebaseInstanceId.l : Ljava/util/concurrent/ScheduledExecutorService;
    //   33: aload_1
    //   34: lload_2
    //   35: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   38: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   43: pop
    //   44: ldc com/google/firebase/iid/FirebaseInstanceId
    //   46: monitorexit
    //   47: return
    //   48: astore_1
    //   49: ldc com/google/firebase/iid/FirebaseInstanceId
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	30	48	finally
    //   30	47	48	finally
    //   49	52	48	finally
  }
  
  @Deprecated
  public void a(String paramString1, String paramString2) {
    a(this.b);
    if (Looper.getMainLooper() != Looper.myLooper()) {
      paramString2 = c(paramString2);
      String str = d();
      a(this.d.a(str, paramString1, paramString2));
      j.a(l(), paramString1, paramString2);
      return;
    } 
    throw new IOException("MAIN_THREAD");
  }
  
  void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield g : Z
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  boolean a(u.a parama) {
    return (parama == null || parama.a(this.c.a()));
  }
  
  @Deprecated
  public String b(String paramString1, String paramString2) {
    a(this.b);
    if (Looper.getMainLooper() != Looper.myLooper())
      return ((l)a(d(paramString1, paramString2))).a(); 
    throw new IOException("MAIN_THREAD");
  }
  
  @Deprecated
  public void b() {
    a(this.b);
    if (Looper.getMainLooper() != Looper.myLooper()) {
      a(this.f.b());
      i();
      return;
    } 
    throw new IOException("MAIN_THREAD");
  }
  
  g c() {
    return this.b;
  }
  
  u.a c(String paramString1, String paramString2) {
    return j.b(l(), paramString1, paramString2);
  }
  
  String d() {
    try {
      j.a(this.b.e());
      return b(this.f.a());
    } catch (InterruptedException interruptedException) {
      throw new IllegalStateException(interruptedException);
    } 
  }
  
  @Deprecated
  public l<l> e() {
    a(this.b);
    return d(n.a(this.b), "*");
  }
  
  @Deprecated
  public String f() {
    a(this.b);
    u.a a = g();
    if (a(a))
      j(); 
    return u.a.a(a);
  }
  
  u.a g() {
    return c(n.a(this.b), "*");
  }
  
  public boolean h() {
    return this.c.e();
  }
  
  void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/firebase/iid/FirebaseInstanceId.j : Lcom/google/firebase/iid/u;
    //   5: invokevirtual a : ()V
    //   8: aload_0
    //   9: monitorexit
    //   10: return
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
  }
  
  void j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Z
    //   6: ifne -> 17
    //   9: aload_0
    //   10: lconst_0
    //   11: invokevirtual a : (J)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	20	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/FirebaseInstanceId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */