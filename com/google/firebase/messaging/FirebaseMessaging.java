package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.f;
import com.google.firebase.g;
import com.google.firebase.installations.i;
import com.google.firebase.n.b;
import com.google.firebase.n.d;
import com.google.firebase.o.f;
import com.google.firebase.p.b;
import com.google.firebase.r.i;
import e.f.a.c.g;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
  private static final long l = TimeUnit.HOURS.toSeconds(8L);
  
  @SuppressLint({"StaticFieldLeak"})
  private static r0 m;
  
  @SuppressLint({"FirebaseUnknownNullness"})
  static g n;
  
  static ScheduledExecutorService o;
  
  private final g a;
  
  private final com.google.firebase.iid.w.a b;
  
  private final i c;
  
  private final Context d;
  
  private final c0 e;
  
  private final m0 f;
  
  private final a g;
  
  private final l<w0> h;
  
  private final h0 i;
  
  private boolean j;
  
  private final Application.ActivityLifecycleCallbacks k;
  
  FirebaseMessaging(g paramg, com.google.firebase.iid.w.a parama, i parami, g paramg1, d paramd, h0 paramh0, c0 paramc0, Executor paramExecutor1, Executor paramExecutor2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield j : Z
    //   9: aload #4
    //   11: putstatic com/google/firebase/messaging/FirebaseMessaging.n : Le/f/a/c/g;
    //   14: aload_0
    //   15: aload_1
    //   16: putfield a : Lcom/google/firebase/g;
    //   19: aload_0
    //   20: aload_2
    //   21: putfield b : Lcom/google/firebase/iid/w/a;
    //   24: aload_0
    //   25: aload_3
    //   26: putfield c : Lcom/google/firebase/installations/i;
    //   29: aload_0
    //   30: new com/google/firebase/messaging/FirebaseMessaging$a
    //   33: dup
    //   34: aload_0
    //   35: aload #5
    //   37: invokespecial <init> : (Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/n/d;)V
    //   40: putfield g : Lcom/google/firebase/messaging/FirebaseMessaging$a;
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual b : ()Landroid/content/Context;
    //   48: putfield d : Landroid/content/Context;
    //   51: aload_0
    //   52: new com/google/firebase/messaging/q
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: putfield k : Landroid/app/Application$ActivityLifecycleCallbacks;
    //   62: aload_0
    //   63: aload #6
    //   65: putfield i : Lcom/google/firebase/messaging/h0;
    //   68: aload_0
    //   69: aload #7
    //   71: putfield e : Lcom/google/firebase/messaging/c0;
    //   74: aload_0
    //   75: new com/google/firebase/messaging/m0
    //   78: dup
    //   79: aload #8
    //   81: invokespecial <init> : (Ljava/util/concurrent/Executor;)V
    //   84: putfield f : Lcom/google/firebase/messaging/m0;
    //   87: aload_1
    //   88: invokevirtual b : ()Landroid/content/Context;
    //   91: astore_1
    //   92: aload_1
    //   93: instanceof android/app/Application
    //   96: ifeq -> 113
    //   99: aload_1
    //   100: checkcast android/app/Application
    //   103: aload_0
    //   104: getfield k : Landroid/app/Application$ActivityLifecycleCallbacks;
    //   107: invokevirtual registerActivityLifecycleCallbacks : (Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //   110: goto -> 171
    //   113: aload_1
    //   114: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   117: astore_1
    //   118: new java/lang/StringBuilder
    //   121: dup
    //   122: aload_1
    //   123: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   126: invokevirtual length : ()I
    //   129: bipush #125
    //   131: iadd
    //   132: invokespecial <init> : (I)V
    //   135: astore #4
    //   137: aload #4
    //   139: ldc 'Context '
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload #4
    //   147: aload_1
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload #4
    //   154: ldc ' was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.'
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: ldc 'FirebaseMessaging'
    //   162: aload #4
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   170: pop
    //   171: aload_2
    //   172: ifnull -> 189
    //   175: aload_2
    //   176: new com/google/firebase/messaging/r
    //   179: dup
    //   180: aload_0
    //   181: invokespecial <init> : (Lcom/google/firebase/messaging/FirebaseMessaging;)V
    //   184: invokeinterface a : (Lcom/google/firebase/iid/w/a$a;)V
    //   189: ldc com/google/firebase/messaging/FirebaseMessaging
    //   191: monitorenter
    //   192: getstatic com/google/firebase/messaging/FirebaseMessaging.m : Lcom/google/firebase/messaging/r0;
    //   195: ifnonnull -> 212
    //   198: new com/google/firebase/messaging/r0
    //   201: dup
    //   202: aload_0
    //   203: getfield d : Landroid/content/Context;
    //   206: invokespecial <init> : (Landroid/content/Context;)V
    //   209: putstatic com/google/firebase/messaging/FirebaseMessaging.m : Lcom/google/firebase/messaging/r0;
    //   212: ldc com/google/firebase/messaging/FirebaseMessaging
    //   214: monitorexit
    //   215: aload #9
    //   217: new com/google/firebase/messaging/s
    //   220: dup
    //   221: aload_0
    //   222: invokespecial <init> : (Lcom/google/firebase/messaging/FirebaseMessaging;)V
    //   225: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   230: aload_0
    //   231: aload_0
    //   232: aload_3
    //   233: aload #6
    //   235: aload #7
    //   237: aload_0
    //   238: getfield d : Landroid/content/Context;
    //   241: invokestatic e : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   244: invokestatic a : (Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/installations/i;Lcom/google/firebase/messaging/h0;Lcom/google/firebase/messaging/c0;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Le/f/a/e/m/l;
    //   247: putfield h : Le/f/a/e/m/l;
    //   250: aload_0
    //   251: getfield h : Le/f/a/e/m/l;
    //   254: invokestatic f : ()Ljava/util/concurrent/Executor;
    //   257: new com/google/firebase/messaging/t
    //   260: dup
    //   261: aload_0
    //   262: invokespecial <init> : (Lcom/google/firebase/messaging/FirebaseMessaging;)V
    //   265: invokevirtual a : (Ljava/util/concurrent/Executor;Le/f/a/e/m/h;)Le/f/a/e/m/l;
    //   268: pop
    //   269: return
    //   270: astore_1
    //   271: ldc com/google/firebase/messaging/FirebaseMessaging
    //   273: monitorexit
    //   274: aload_1
    //   275: athrow
    // Exception table:
    //   from	to	target	type
    //   192	212	270	finally
    //   212	215	270	finally
    //   271	274	270	finally
  }
  
  FirebaseMessaging(g paramg, com.google.firebase.iid.w.a parama, b<i> paramb, b<f> paramb1, i parami, g paramg1, d paramd) {
    this(paramg, parama, paramb, paramb1, parami, paramg1, paramd, new h0(paramg.b()));
  }
  
  FirebaseMessaging(g paramg, com.google.firebase.iid.w.a parama, b<i> paramb, b<f> paramb1, i parami, g paramg1, d paramd, h0 paramh0) {
    this(paramg, parama, parami, paramg1, paramd, paramh0, new c0(paramg, paramh0, paramb, paramb1, parami), p.d(), p.a());
  }
  
  private void d(String paramString) {
    if ("[DEFAULT]".equals(this.a.c())) {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        String str = String.valueOf(this.a.c());
        if (str.length() != 0) {
          str = "Invoking onNewToken for app: ".concat(str);
        } else {
          str = new String("Invoking onNewToken for app: ");
        } 
        Log.d("FirebaseMessaging", str);
      } 
      Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
      intent.putExtra("token", paramString);
      (new o(this.d)).a(intent);
    } 
  }
  
  public static FirebaseMessaging g() {
    // Byte code:
    //   0: ldc com/google/firebase/messaging/FirebaseMessaging
    //   2: monitorenter
    //   3: invokestatic k : ()Lcom/google/firebase/g;
    //   6: invokestatic getInstance : (Lcom/google/firebase/g;)Lcom/google/firebase/messaging/FirebaseMessaging;
    //   9: astore_0
    //   10: ldc com/google/firebase/messaging/FirebaseMessaging
    //   12: monitorexit
    //   13: aload_0
    //   14: areturn
    //   15: astore_0
    //   16: ldc com/google/firebase/messaging/FirebaseMessaging
    //   18: monitorexit
    //   19: aload_0
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   3	10	15	finally
  }
  
  @Keep
  static FirebaseMessaging getInstance(g paramg) {
    // Byte code:
    //   0: ldc com/google/firebase/messaging/FirebaseMessaging
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc com/google/firebase/messaging/FirebaseMessaging
    //   6: invokevirtual a : (Ljava/lang/Class;)Ljava/lang/Object;
    //   9: checkcast com/google/firebase/messaging/FirebaseMessaging
    //   12: astore_0
    //   13: aload_0
    //   14: ldc_w 'Firebase Messaging component is not present'
    //   17: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   20: pop
    //   21: ldc com/google/firebase/messaging/FirebaseMessaging
    //   23: monitorexit
    //   24: aload_0
    //   25: areturn
    //   26: astore_0
    //   27: ldc com/google/firebase/messaging/FirebaseMessaging
    //   29: monitorexit
    //   30: aload_0
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   3	21	26	finally
  }
  
  private String h() {
    return "[DEFAULT]".equals(this.a.c()) ? "" : this.a.e();
  }
  
  public static g i() {
    return n;
  }
  
  private void j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Z
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
  
  private void k() {
    com.google.firebase.iid.w.a a1 = this.b;
    if (a1 != null) {
      a1.a();
      return;
    } 
    if (a(c()))
      j(); 
  }
  
  String a() {
    com.google.firebase.iid.w.a a2 = this.b;
    if (a2 != null) {
      try {
        return (String)o.a(a2.b());
      } catch (ExecutionException executionException) {
      
      } catch (InterruptedException null) {}
      throw new IOException(interruptedException);
    } 
    r0.a a1 = c();
    if (!a(a1))
      return a1.a; 
    String str = h0.a(this.a);
    l l1 = this.c.a().b(p.c(), new w(this, str));
    try {
      String str1 = (String)o.a(l1);
      m.a(h(), str, str1, this.i.a());
      if (a1 == null || !str1.equals(a1.a))
        d(str1); 
      return str1;
    } catch (ExecutionException executionException) {
    
    } catch (InterruptedException interruptedException) {}
    throw new IOException(interruptedException);
  }
  
  void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: new com/google/firebase/messaging/s0
    //   6: dup
    //   7: aload_0
    //   8: ldc2_w 30
    //   11: lload_1
    //   12: lload_1
    //   13: ladd
    //   14: invokestatic max : (JJ)J
    //   17: getstatic com/google/firebase/messaging/FirebaseMessaging.l : J
    //   20: invokestatic min : (JJ)J
    //   23: invokespecial <init> : (Lcom/google/firebase/messaging/FirebaseMessaging;J)V
    //   26: lload_1
    //   27: invokevirtual a : (Ljava/lang/Runnable;J)V
    //   30: aload_0
    //   31: iconst_1
    //   32: putfield j : Z
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
  
  public void a(j0 paramj0) {
    if (!TextUtils.isEmpty(paramj0.v())) {
      boolean bool;
      Intent intent1 = new Intent("com.google.android.gcm.intent.SEND");
      Intent intent2 = new Intent();
      intent2.setPackage("com.google.example.invalidpackage");
      Context context = this.d;
      if (Build.VERSION.SDK_INT >= 23) {
        bool = true;
      } else {
        bool = false;
      } 
      intent1.putExtra("app", (Parcelable)PendingIntent.getBroadcast(context, 0, intent2, bool));
      intent1.setPackage("com.google.android.gms");
      paramj0.a(intent1);
      this.d.sendOrderedBroadcast(intent1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
      return;
    } 
    throw new IllegalArgumentException("Missing 'to'");
  }
  
  void a(Runnable paramRunnable, long paramLong) {
    // Byte code:
    //   0: ldc com/google/firebase/messaging/FirebaseMessaging
    //   2: monitorenter
    //   3: getstatic com/google/firebase/messaging/FirebaseMessaging.o : Ljava/util/concurrent/ScheduledExecutorService;
    //   6: ifnonnull -> 30
    //   9: new java/util/concurrent/ScheduledThreadPoolExecutor
    //   12: dup
    //   13: iconst_1
    //   14: new com/google/android/gms/common/util/p/a
    //   17: dup
    //   18: ldc_w 'TAG'
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: invokespecial <init> : (ILjava/util/concurrent/ThreadFactory;)V
    //   27: putstatic com/google/firebase/messaging/FirebaseMessaging.o : Ljava/util/concurrent/ScheduledExecutorService;
    //   30: getstatic com/google/firebase/messaging/FirebaseMessaging.o : Ljava/util/concurrent/ScheduledExecutorService;
    //   33: aload_1
    //   34: lload_2
    //   35: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   38: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   43: pop
    //   44: ldc com/google/firebase/messaging/FirebaseMessaging
    //   46: monitorexit
    //   47: return
    //   48: astore_1
    //   49: ldc com/google/firebase/messaging/FirebaseMessaging
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	30	48	finally
    //   30	47	48	finally
    //   49	52	48	finally
  }
  
  public void a(boolean paramBoolean) {
    this.g.a(paramBoolean);
  }
  
  boolean a(r0.a parama) {
    return (parama == null || parama.a(this.i.a()));
  }
  
  Context b() {
    return this.d;
  }
  
  public l<Void> b(String paramString) {
    return this.h.a(new u(paramString));
  }
  
  void b(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield j : Z
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
  
  r0.a c() {
    return m.a(h(), h0.a(this.a));
  }
  
  public l<Void> c(String paramString) {
    return this.h.a(new v(paramString));
  }
  
  public boolean d() {
    return this.g.b();
  }
  
  boolean e() {
    return this.i.e();
  }
  
  private class a {
    private final d a;
    
    private boolean b;
    
    private b<f> c;
    
    private Boolean d;
    
    a(FirebaseMessaging this$0, d param1d) {
      this.a = param1d;
    }
    
    private Boolean c() {
      Context context = FirebaseMessaging.a(this.e).b();
      SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
      if (sharedPreferences.contains("auto_init"))
        return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false)); 
      try {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
          ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
          if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
            boolean bool = applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled");
            return Boolean.valueOf(bool);
          } 
        } 
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
      return null;
    }
    
    void a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Z
      //   6: istore_1
      //   7: iload_1
      //   8: ifeq -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_0
      //   15: aload_0
      //   16: invokespecial c : ()Ljava/lang/Boolean;
      //   19: putfield d : Ljava/lang/Boolean;
      //   22: aload_0
      //   23: getfield d : Ljava/lang/Boolean;
      //   26: ifnonnull -> 56
      //   29: aload_0
      //   30: new com/google/firebase/messaging/y
      //   33: dup
      //   34: aload_0
      //   35: invokespecial <init> : (Lcom/google/firebase/messaging/FirebaseMessaging$a;)V
      //   38: putfield c : Lcom/google/firebase/n/b;
      //   41: aload_0
      //   42: getfield a : Lcom/google/firebase/n/d;
      //   45: ldc com/google/firebase/f
      //   47: aload_0
      //   48: getfield c : Lcom/google/firebase/n/b;
      //   51: invokeinterface a : (Ljava/lang/Class;Lcom/google/firebase/n/b;)V
      //   56: aload_0
      //   57: iconst_1
      //   58: putfield b : Z
      //   61: aload_0
      //   62: monitorexit
      //   63: return
      //   64: astore_2
      //   65: aload_0
      //   66: monitorexit
      //   67: aload_2
      //   68: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	64	finally
      //   14	56	64	finally
      //   56	61	64	finally
    }
    
    void a(boolean param1Boolean) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual a : ()V
      //   6: aload_0
      //   7: getfield c : Lcom/google/firebase/n/b;
      //   10: astore_2
      //   11: aload_2
      //   12: ifnull -> 32
      //   15: aload_0
      //   16: getfield a : Lcom/google/firebase/n/d;
      //   19: ldc com/google/firebase/f
      //   21: aload_2
      //   22: invokeinterface b : (Ljava/lang/Class;Lcom/google/firebase/n/b;)V
      //   27: aload_0
      //   28: aconst_null
      //   29: putfield c : Lcom/google/firebase/n/b;
      //   32: aload_0
      //   33: getfield e : Lcom/google/firebase/messaging/FirebaseMessaging;
      //   36: invokestatic a : (Lcom/google/firebase/messaging/FirebaseMessaging;)Lcom/google/firebase/g;
      //   39: invokevirtual b : ()Landroid/content/Context;
      //   42: ldc 'com.google.firebase.messaging'
      //   44: iconst_0
      //   45: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
      //   48: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
      //   53: astore_2
      //   54: aload_2
      //   55: ldc 'auto_init'
      //   57: iload_1
      //   58: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
      //   63: pop
      //   64: aload_2
      //   65: invokeinterface apply : ()V
      //   70: iload_1
      //   71: ifeq -> 81
      //   74: aload_0
      //   75: getfield e : Lcom/google/firebase/messaging/FirebaseMessaging;
      //   78: invokestatic b : (Lcom/google/firebase/messaging/FirebaseMessaging;)V
      //   81: aload_0
      //   82: iload_1
      //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
      //   86: putfield d : Ljava/lang/Boolean;
      //   89: aload_0
      //   90: monitorexit
      //   91: return
      //   92: astore_2
      //   93: aload_0
      //   94: monitorexit
      //   95: aload_2
      //   96: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	92	finally
      //   15	32	92	finally
      //   32	70	92	finally
      //   74	81	92	finally
      //   81	89	92	finally
    }
    
    boolean b() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual a : ()V
      //   6: aload_0
      //   7: getfield d : Ljava/lang/Boolean;
      //   10: astore_2
      //   11: aload_2
      //   12: ifnull -> 23
      //   15: aload_2
      //   16: invokevirtual booleanValue : ()Z
      //   19: istore_1
      //   20: goto -> 34
      //   23: aload_0
      //   24: getfield e : Lcom/google/firebase/messaging/FirebaseMessaging;
      //   27: invokestatic a : (Lcom/google/firebase/messaging/FirebaseMessaging;)Lcom/google/firebase/g;
      //   30: invokevirtual f : ()Z
      //   33: istore_1
      //   34: aload_0
      //   35: monitorexit
      //   36: iload_1
      //   37: ireturn
      //   38: astore_2
      //   39: aload_0
      //   40: monitorexit
      //   41: aload_2
      //   42: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	38	finally
      //   15	20	38	finally
      //   23	34	38	finally
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/FirebaseMessaging.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */