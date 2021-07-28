package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import com.facebook.react.modules.core.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class d implements LifecycleEventListener {
  private static final Comparator<c> s = new a();
  
  private final Object c = new Object();
  
  private final Object d = new Object();
  
  private final ReactApplicationContext e;
  
  private final LongSparseArray<Integer> f = new LongSparseArray();
  
  private final Map<String, Short> g = f.b();
  
  private final c h = new c(null);
  
  private final ArrayList<c> i = new ArrayList<c>();
  
  private final ArrayList<e> j = new ArrayList<e>();
  
  private final List<a> k = new ArrayList<a>();
  
  private final d l = new d(null);
  
  private final AtomicInteger m = new AtomicInteger();
  
  private c[] n = new c[16];
  
  private int o = 0;
  
  private volatile ReactEventEmitter p;
  
  private short q = 0;
  
  private volatile boolean r = false;
  
  public d(ReactApplicationContext paramReactApplicationContext) {
    this.e = paramReactApplicationContext;
    this.e.addLifecycleEventListener(this);
    this.p = new ReactEventEmitter(this.e);
  }
  
  private long a(int paramInt, String paramString, short paramShort) {
    short s;
    Short short_ = this.g.get(paramString);
    if (short_ != null) {
      s = short_.shortValue();
    } else {
      s = this.q;
      this.q = (short)(s + 1);
      this.g.put(paramString, Short.valueOf(s));
    } 
    return a(paramInt, s, paramShort);
  }
  
  private static long a(int paramInt, short paramShort1, short paramShort2) {
    long l = paramInt;
    return (paramShort1 & 0xFFFFL) << 32L | l | (paramShort2 & 0xFFFFL) << 48L;
  }
  
  private void b(c paramc) {
    int i = this.o;
    c[] arrayOfC = this.n;
    if (i == arrayOfC.length)
      this.n = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    arrayOfC = this.n;
    i = this.o;
    this.o = i + 1;
    arrayOfC[i] = paramc;
  }
  
  private void d() {
    Arrays.fill((Object[])this.n, 0, this.o, (Object)null);
    this.o = 0;
  }
  
  private void e() {
    if (this.p != null)
      this.l.c(); 
  }
  
  private void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: astore #7
    //   6: aload #7
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield d : Ljava/lang/Object;
    //   13: astore #8
    //   15: aload #8
    //   17: monitorenter
    //   18: iconst_0
    //   19: istore_1
    //   20: iload_1
    //   21: aload_0
    //   22: getfield i : Ljava/util/ArrayList;
    //   25: invokevirtual size : ()I
    //   28: if_icmpge -> 205
    //   31: aload_0
    //   32: getfield i : Ljava/util/ArrayList;
    //   35: iload_1
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast com/facebook/react/uimanager/events/c
    //   42: astore #4
    //   44: aload #4
    //   46: invokevirtual a : ()Z
    //   49: ifne -> 61
    //   52: aload_0
    //   53: aload #4
    //   55: invokespecial b : (Lcom/facebook/react/uimanager/events/c;)V
    //   58: goto -> 251
    //   61: aload_0
    //   62: aload #4
    //   64: invokevirtual g : ()I
    //   67: aload #4
    //   69: invokevirtual d : ()Ljava/lang/String;
    //   72: aload #4
    //   74: invokevirtual c : ()S
    //   77: invokespecial a : (ILjava/lang/String;S)J
    //   80: lstore_2
    //   81: aload_0
    //   82: getfield f : Landroid/util/LongSparseArray;
    //   85: lload_2
    //   86: invokevirtual get : (J)Ljava/lang/Object;
    //   89: checkcast java/lang/Integer
    //   92: astore #9
    //   94: aconst_null
    //   95: astore #5
    //   97: aload #9
    //   99: ifnonnull -> 120
    //   102: aload_0
    //   103: getfield f : Landroid/util/LongSparseArray;
    //   106: lload_2
    //   107: aload_0
    //   108: getfield o : I
    //   111: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   114: invokevirtual put : (JLjava/lang/Object;)V
    //   117: goto -> 181
    //   120: aload_0
    //   121: getfield n : [Lcom/facebook/react/uimanager/events/c;
    //   124: aload #9
    //   126: invokevirtual intValue : ()I
    //   129: aaload
    //   130: astore #5
    //   132: aload #4
    //   134: aload #5
    //   136: invokevirtual a : (Lcom/facebook/react/uimanager/events/c;)Lcom/facebook/react/uimanager/events/c;
    //   139: astore #6
    //   141: aload #6
    //   143: aload #5
    //   145: if_acmpeq -> 241
    //   148: aload_0
    //   149: getfield f : Landroid/util/LongSparseArray;
    //   152: lload_2
    //   153: aload_0
    //   154: getfield o : I
    //   157: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   160: invokevirtual put : (JLjava/lang/Object;)V
    //   163: aload_0
    //   164: getfield n : [Lcom/facebook/react/uimanager/events/c;
    //   167: aload #9
    //   169: invokevirtual intValue : ()I
    //   172: aconst_null
    //   173: aastore
    //   174: aload #6
    //   176: astore #4
    //   178: goto -> 181
    //   181: aload #4
    //   183: ifnull -> 192
    //   186: aload_0
    //   187: aload #4
    //   189: invokespecial b : (Lcom/facebook/react/uimanager/events/c;)V
    //   192: aload #5
    //   194: ifnull -> 251
    //   197: aload #5
    //   199: invokevirtual b : ()V
    //   202: goto -> 251
    //   205: aload #8
    //   207: monitorexit
    //   208: aload_0
    //   209: getfield i : Ljava/util/ArrayList;
    //   212: invokevirtual clear : ()V
    //   215: aload #7
    //   217: monitorexit
    //   218: return
    //   219: astore #4
    //   221: aload #8
    //   223: monitorexit
    //   224: aload #4
    //   226: athrow
    //   227: astore #4
    //   229: aload #7
    //   231: monitorexit
    //   232: goto -> 238
    //   235: aload #4
    //   237: athrow
    //   238: goto -> 235
    //   241: aload #4
    //   243: astore #5
    //   245: aconst_null
    //   246: astore #4
    //   248: goto -> 181
    //   251: iload_1
    //   252: iconst_1
    //   253: iadd
    //   254: istore_1
    //   255: goto -> 20
    // Exception table:
    //   from	to	target	type
    //   9	18	227	finally
    //   20	58	219	finally
    //   61	94	219	finally
    //   102	117	219	finally
    //   120	141	219	finally
    //   148	174	219	finally
    //   186	192	219	finally
    //   197	202	219	finally
    //   205	208	219	finally
    //   208	218	227	finally
    //   221	224	219	finally
    //   224	227	227	finally
    //   229	232	227	finally
  }
  
  private void g() {
    UiThreadUtil.assertOnUiThread();
    this.l.d();
  }
  
  public void a() {
    e();
  }
  
  public void a(int paramInt, RCTEventEmitter paramRCTEventEmitter) {
    this.p.register(paramInt, paramRCTEventEmitter);
  }
  
  public void a(a parama) {
    this.k.add(parama);
  }
  
  public void a(c paramc) {
    e.e.m.a.a.a(paramc.h(), "Dispatched event hasn't been initialized");
    Iterator<e> iterator = this.j.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).a(paramc); 
    synchronized (this.c) {
      this.i.add(paramc);
      com.facebook.systrace.a.d(0L, paramc.d(), paramc.f());
      e();
      return;
    } 
  }
  
  public void a(e parame) {
    this.j.add(parame);
  }
  
  public void b() {
    UiThreadUtil.runOnUiThread(new b(this));
  }
  
  public void onHostDestroy() {
    g();
  }
  
  public void onHostPause() {
    g();
  }
  
  public void onHostResume() {
    e();
  }
  
  static final class a implements Comparator<c> {
    public int a(c param1c1, c param1c2) {
      if (param1c1 == null && param1c2 == null)
        return 0; 
      if (param1c1 == null)
        return -1; 
      if (param1c2 == null)
        return 1; 
      long l = param1c1.e() - param1c2.e();
      return (l == 0L) ? 0 : ((l < 0L) ? -1 : 1);
    }
  }
  
  class b implements Runnable {
    b(d this$0) {}
    
    public void run() {
      d.g(this.c);
    }
  }
  
  private class c implements Runnable {
    private c(d this$0) {}
    
    public void run() {
      com.facebook.systrace.a.a(0L, "DispatchEventsRunnable");
      try {
        com.facebook.systrace.a.b(0L, "ScheduleDispatchFrameCallback", d.j(this.c).getAndIncrement());
        d d1 = this.c;
        byte b = 0;
        d.a(d1, false);
        e.e.m.a.a.a(d.n(this.c));
      } finally {
        com.facebook.systrace.a.a(0L);
      } 
    }
  }
  
  private class d extends com.facebook.react.modules.core.a.a {
    private volatile boolean b = false;
    
    private boolean c = false;
    
    private d(d this$0) {}
    
    private void e() {
      g.a().a(g.c.f, d.m(this.d));
    }
    
    public void a(long param1Long) {
      UiThreadUtil.assertOnUiThread();
      if (this.c) {
        this.b = false;
      } else {
        e();
      } 
      com.facebook.systrace.a.a(0L, "ScheduleDispatchFrameCallback");
      try {
        d.h(this.d);
        if (!d.i(this.d)) {
          d.a(this.d, true);
          com.facebook.systrace.a.d(0L, "ScheduleDispatchFrameCallback", d.j(this.d).get());
          d.l(this.d).runOnJSQueueThread(d.k(this.d));
        } 
        return;
      } finally {
        com.facebook.systrace.a.a(0L);
      } 
    }
    
    public void b() {
      if (!this.b) {
        this.b = true;
        e();
      } 
    }
    
    public void c() {
      if (this.b)
        return; 
      if (d.l(this.d).isOnUiQueueThread()) {
        b();
        return;
      } 
      d.l(this.d).runOnUiQueueThread(new a(this));
    }
    
    public void d() {
      this.c = true;
    }
    
    class a implements Runnable {
      a(d.d this$0) {}
      
      public void run() {
        this.c.b();
      }
    }
  }
  
  class a implements Runnable {
    a(d this$0) {}
    
    public void run() {
      this.c.b();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */