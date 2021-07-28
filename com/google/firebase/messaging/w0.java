package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import b.d.a;
import com.google.firebase.installations.i;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import e.f.a.e.m.o;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class w0 {
  private static final long j = TimeUnit.HOURS.toSeconds(8L);
  
  private final Context a;
  
  private final h0 b;
  
  private final c0 c;
  
  private final FirebaseMessaging d;
  
  private final i e;
  
  private final Map<String, ArrayDeque<m<Void>>> f = (Map<String, ArrayDeque<m<Void>>>)new a();
  
  private final ScheduledExecutorService g;
  
  private boolean h = false;
  
  private final u0 i;
  
  private w0(FirebaseMessaging paramFirebaseMessaging, i parami, h0 paramh0, u0 paramu0, c0 paramc0, Context paramContext, ScheduledExecutorService paramScheduledExecutorService) {
    this.d = paramFirebaseMessaging;
    this.e = parami;
    this.b = paramh0;
    this.i = paramu0;
    this.c = paramc0;
    this.a = paramContext;
    this.g = paramScheduledExecutorService;
  }
  
  static l<w0> a(FirebaseMessaging paramFirebaseMessaging, i parami, h0 paramh0, c0 paramc0, Context paramContext, ScheduledExecutorService paramScheduledExecutorService) {
    return o.a(paramScheduledExecutorService, new v0(paramContext, paramScheduledExecutorService, paramFirebaseMessaging, parami, paramh0, paramc0));
  }
  
  private static <T> T a(l<T> paraml) {
    try {
      return (T)o.a(paraml, 30L, TimeUnit.SECONDS);
    } catch (ExecutionException executionException) {
      Throwable throwable = executionException.getCause();
      if (!(throwable instanceof IOException)) {
        if (throwable instanceof RuntimeException)
          throw (RuntimeException)throwable; 
        throw new IOException(executionException);
      } 
      throw (IOException)throwable;
    } catch (InterruptedException interruptedException) {
      throw new IOException("SERVICE_NOT_AVAILABLE", interruptedException);
    } catch (TimeoutException timeoutException) {
      throw new IOException("SERVICE_NOT_AVAILABLE", timeoutException);
    } 
  }
  
  private void a(t0 paramt0, m<Void> paramm) {
    synchronized (this.f) {
      ArrayDeque<m<Void>> arrayDeque;
      String str = paramt0.c();
      if (this.f.containsKey(str)) {
        arrayDeque = this.f.get(str);
      } else {
        arrayDeque = new ArrayDeque();
        this.f.put(str, arrayDeque);
      } 
      arrayDeque.add(paramm);
      return;
    } 
  }
  
  private void c(t0 paramt0) {
    synchronized (this.f) {
      String str = paramt0.c();
      if (!this.f.containsKey(str))
        return; 
      ArrayDeque<m> arrayDeque = (ArrayDeque)this.f.get(str);
      m m = arrayDeque.poll();
      if (m != null)
        m.a(null); 
      if (arrayDeque.isEmpty())
        this.f.remove(str); 
      return;
    } 
  }
  
  private void c(String paramString) {
    String str = a(this.e.a());
    a(this.c.a(str, this.d.a(), paramString));
  }
  
  private void d(String paramString) {
    String str = a(this.e.a());
    a(this.c.b(str, this.d.a(), paramString));
  }
  
  static boolean e() {
    boolean bool1 = Log.isLoggable("FirebaseMessaging", 3);
    boolean bool = true;
    if (!bool1) {
      if (Build.VERSION.SDK_INT == 23)
        return Log.isLoggable("FirebaseMessaging", 3); 
      bool = false;
    } 
    return bool;
  }
  
  private void f() {
    if (!b())
      a(0L); 
  }
  
  l<Void> a(String paramString) {
    l<Void> l = b(t0.b(paramString));
    c();
    return l;
  }
  
  void a(long paramLong) {
    long l = Math.min(Math.max(30L, paramLong + paramLong), j);
    a(new x0(this, this.a, this.b, l), paramLong);
    a(true);
  }
  
  void a(Runnable paramRunnable, long paramLong) {
    this.g.schedule(paramRunnable, paramLong, TimeUnit.SECONDS);
  }
  
  void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield h : Z
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
  
  boolean a() {
    return (this.i.a() != null);
  }
  
  boolean a(t0 paramt0) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual a : ()Ljava/lang/String;
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual hashCode : ()I
    //   9: istore_2
    //   10: iload_2
    //   11: bipush #83
    //   13: if_icmpeq -> 39
    //   16: iload_2
    //   17: bipush #85
    //   19: if_icmpeq -> 25
    //   22: goto -> 54
    //   25: aload_3
    //   26: ldc 'U'
    //   28: invokevirtual equals : (Ljava/lang/Object;)Z
    //   31: ifeq -> 54
    //   34: iconst_1
    //   35: istore_2
    //   36: goto -> 56
    //   39: aload_3
    //   40: ldc_w 'S'
    //   43: invokevirtual equals : (Ljava/lang/Object;)Z
    //   46: ifeq -> 54
    //   49: iconst_0
    //   50: istore_2
    //   51: goto -> 56
    //   54: iconst_m1
    //   55: istore_2
    //   56: iload_2
    //   57: ifeq -> 197
    //   60: iload_2
    //   61: iconst_1
    //   62: if_icmpeq -> 130
    //   65: invokestatic e : ()Z
    //   68: ifeq -> 264
    //   71: aload_1
    //   72: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   75: astore_1
    //   76: new java/lang/StringBuilder
    //   79: dup
    //   80: aload_1
    //   81: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   84: invokevirtual length : ()I
    //   87: bipush #24
    //   89: iadd
    //   90: invokespecial <init> : (I)V
    //   93: astore_3
    //   94: aload_3
    //   95: ldc_w 'Unknown topic operation'
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload_3
    //   103: aload_1
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_3
    //   109: ldc_w '.'
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_3
    //   117: invokevirtual toString : ()Ljava/lang/String;
    //   120: astore_1
    //   121: ldc 'FirebaseMessaging'
    //   123: aload_1
    //   124: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   127: pop
    //   128: iconst_1
    //   129: ireturn
    //   130: aload_0
    //   131: aload_1
    //   132: invokevirtual b : ()Ljava/lang/String;
    //   135: invokespecial d : (Ljava/lang/String;)V
    //   138: invokestatic e : ()Z
    //   141: ifeq -> 264
    //   144: aload_1
    //   145: invokevirtual b : ()Ljava/lang/String;
    //   148: astore_1
    //   149: new java/lang/StringBuilder
    //   152: dup
    //   153: aload_1
    //   154: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   157: invokevirtual length : ()I
    //   160: bipush #35
    //   162: iadd
    //   163: invokespecial <init> : (I)V
    //   166: astore_3
    //   167: aload_3
    //   168: ldc_w 'Unsubscribe from topic: '
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_3
    //   176: aload_1
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_3
    //   182: ldc_w ' succeeded.'
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload_3
    //   190: invokevirtual toString : ()Ljava/lang/String;
    //   193: astore_1
    //   194: goto -> 121
    //   197: aload_0
    //   198: aload_1
    //   199: invokevirtual b : ()Ljava/lang/String;
    //   202: invokespecial c : (Ljava/lang/String;)V
    //   205: invokestatic e : ()Z
    //   208: ifeq -> 264
    //   211: aload_1
    //   212: invokevirtual b : ()Ljava/lang/String;
    //   215: astore_1
    //   216: new java/lang/StringBuilder
    //   219: dup
    //   220: aload_1
    //   221: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   224: invokevirtual length : ()I
    //   227: bipush #31
    //   229: iadd
    //   230: invokespecial <init> : (I)V
    //   233: astore_3
    //   234: aload_3
    //   235: ldc_w 'Subscribe to topic: '
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload_3
    //   243: aload_1
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_3
    //   249: ldc_w ' succeeded.'
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload_3
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: astore_1
    //   261: goto -> 121
    //   264: iconst_1
    //   265: ireturn
    //   266: astore_1
    //   267: ldc 'SERVICE_NOT_AVAILABLE'
    //   269: aload_1
    //   270: invokevirtual getMessage : ()Ljava/lang/String;
    //   273: invokevirtual equals : (Ljava/lang/Object;)Z
    //   276: ifne -> 317
    //   279: ldc_w 'INTERNAL_SERVER_ERROR'
    //   282: aload_1
    //   283: invokevirtual getMessage : ()Ljava/lang/String;
    //   286: invokevirtual equals : (Ljava/lang/Object;)Z
    //   289: ifeq -> 295
    //   292: goto -> 317
    //   295: aload_1
    //   296: invokevirtual getMessage : ()Ljava/lang/String;
    //   299: ifnonnull -> 315
    //   302: ldc_w 'Topic operation failed without exception message. Will retry Topic operation.'
    //   305: astore_1
    //   306: ldc 'FirebaseMessaging'
    //   308: aload_1
    //   309: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   312: pop
    //   313: iconst_0
    //   314: ireturn
    //   315: aload_1
    //   316: athrow
    //   317: aload_1
    //   318: invokevirtual getMessage : ()Ljava/lang/String;
    //   321: astore_1
    //   322: new java/lang/StringBuilder
    //   325: dup
    //   326: aload_1
    //   327: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   330: invokevirtual length : ()I
    //   333: bipush #53
    //   335: iadd
    //   336: invokespecial <init> : (I)V
    //   339: astore_3
    //   340: aload_3
    //   341: ldc_w 'Topic operation failed: '
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: aload_3
    //   349: aload_1
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: aload_3
    //   355: ldc_w '. Will retry Topic operation.'
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: pop
    //   362: aload_3
    //   363: invokevirtual toString : ()Ljava/lang/String;
    //   366: astore_1
    //   367: goto -> 306
    // Exception table:
    //   from	to	target	type
    //   0	10	266	java/io/IOException
    //   65	121	266	java/io/IOException
    //   121	128	266	java/io/IOException
    //   130	194	266	java/io/IOException
    //   197	261	266	java/io/IOException
  }
  
  l<Void> b(t0 paramt0) {
    this.i.a(paramt0);
    m<Void> m = new m();
    a(paramt0, m);
    return m.a();
  }
  
  l<Void> b(String paramString) {
    l<Void> l = b(t0.c(paramString));
    c();
    return l;
  }
  
  boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  void c() {
    if (a())
      f(); 
  }
  
  boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/firebase/messaging/u0;
    //   6: invokevirtual a : ()Lcom/google/firebase/messaging/t0;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnonnull -> 33
    //   14: invokestatic e : ()Z
    //   17: ifeq -> 29
    //   20: ldc 'FirebaseMessaging'
    //   22: ldc_w 'topic sync succeeded'
    //   25: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   28: pop
    //   29: aload_0
    //   30: monitorexit
    //   31: iconst_1
    //   32: ireturn
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual a : (Lcom/google/firebase/messaging/t0;)Z
    //   40: ifne -> 45
    //   43: iconst_0
    //   44: ireturn
    //   45: aload_0
    //   46: getfield i : Lcom/google/firebase/messaging/u0;
    //   49: aload_1
    //   50: invokevirtual b : (Lcom/google/firebase/messaging/t0;)Z
    //   53: pop
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial c : (Lcom/google/firebase/messaging/t0;)V
    //   59: goto -> 0
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: goto -> 70
    //   68: aload_1
    //   69: athrow
    //   70: goto -> 68
    // Exception table:
    //   from	to	target	type
    //   2	10	62	finally
    //   14	29	62	finally
    //   29	31	62	finally
    //   33	35	62	finally
    //   63	65	62	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */