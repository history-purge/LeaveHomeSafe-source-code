package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.i;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class d {
  private final ReactApplicationContext a;
  
  private final c b;
  
  private final g c;
  
  private final com.facebook.react.devsupport.h.c d;
  
  private final Object e = new Object();
  
  private final Object f = new Object();
  
  private final PriorityQueue<e> g;
  
  private final SparseArray<e> h;
  
  private final AtomicBoolean i = new AtomicBoolean(true);
  
  private final AtomicBoolean j = new AtomicBoolean(false);
  
  private final f k = new f(null);
  
  private final d l = new d(null);
  
  private c m;
  
  private boolean n = false;
  
  private boolean o = false;
  
  private boolean p = false;
  
  public d(ReactApplicationContext paramReactApplicationContext, c paramc, g paramg, com.facebook.react.devsupport.h.c paramc1) {
    this.a = paramReactApplicationContext;
    this.b = paramc;
    this.c = paramg;
    this.d = paramc1;
    this.g = new PriorityQueue<e>(11, new a(this));
    this.h = new SparseArray();
  }
  
  private static boolean a(e parame, long paramLong) {
    return (!e.c(parame) && e.d(parame) < paramLong);
  }
  
  private void e() {
    if (this.o) {
      this.c.b(g.c.g, this.l);
      this.o = false;
    } 
  }
  
  private void f() {
    e.e.o.c0.b b = e.e.o.c0.b.a((ReactContext)this.a);
    if (this.n && this.i.get() && !b.a()) {
      this.c.b(g.c.f, this.k);
      this.n = false;
    } 
  }
  
  private void g() {
    if (this.i.get() && !this.j.get())
      f(); 
  }
  
  private void h() {
    synchronized (this.f) {
      if (this.p)
        j(); 
      return;
    } 
  }
  
  private void i() {
    if (!this.n) {
      this.c.a(g.c.f, this.k);
      this.n = true;
    } 
  }
  
  private void j() {
    if (!this.o) {
      this.c.a(g.c.g, this.l);
      this.o = true;
    } 
  }
  
  public void a() {
    f();
    g();
  }
  
  public void a(int paramInt) {
    if (!e.e.o.c0.b.a((ReactContext)this.a).a()) {
      this.j.set(false);
      f();
      g();
    } 
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble, boolean paramBoolean) {
    long l1 = i.a();
    long l2 = (long)paramDouble;
    if (this.d.a() && Math.abs(l2 - l1) > 60000L)
      this.b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine."); 
    l1 = Math.max(0L, l2 - l1 + paramInt2);
    if (paramInt2 == 0 && !paramBoolean) {
      WritableArray writableArray = Arguments.createArray();
      writableArray.pushInt(paramInt1);
      this.b.callTimers(writableArray);
      return;
    } 
    createTimer(paramInt1, l1, paramBoolean);
  }
  
  boolean a(long paramLong) {
    synchronized (this.e) {
      e e = this.g.peek();
      if (e == null)
        return false; 
      if (a(e, paramLong))
        return true; 
      Iterator<e> iterator = this.g.iterator();
      while (iterator.hasNext()) {
        if (a(iterator.next(), paramLong))
          return true; 
      } 
      return false;
    } 
  }
  
  public void b() {
    this.i.set(true);
    f();
    g();
  }
  
  public void b(int paramInt) {
    if (!this.j.getAndSet(true)) {
      i();
      h();
    } 
  }
  
  public void c() {
    this.i.set(false);
    i();
    h();
  }
  
  @e.e.n.a.a
  public void createTimer(int paramInt, long paramLong, boolean paramBoolean) {
    null = new e(paramInt, i.b() / 1000000L + paramLong, (int)paramLong, paramBoolean, null);
    synchronized (this.e) {
      this.g.add(null);
      this.h.put(paramInt, null);
      return;
    } 
  }
  
  public void d() {
    f();
    e();
  }
  
  @e.e.n.a.a
  public void deleteTimer(int paramInt) {
    synchronized (this.e) {
      e e = (e)this.h.get(paramInt);
      if (e == null)
        return; 
      this.h.remove(paramInt);
      this.g.remove(e);
      return;
    } 
  }
  
  @e.e.n.a.a
  public void setSendIdleEvents(boolean paramBoolean) {
    synchronized (this.f) {
      this.p = paramBoolean;
      UiThreadUtil.runOnUiThread(new b(this, paramBoolean));
      return;
    } 
  }
  
  class a implements Comparator<e> {
    a(d this$0) {}
    
    public int a(d.e param1e1, d.e param1e2) {
      long l = d.e.a(param1e1) - d.e.a(param1e2);
      return (l == 0L) ? 0 : ((l < 0L) ? -1 : 1);
    }
  }
  
  class b implements Runnable {
    b(d this$0, boolean param1Boolean) {}
    
    public void run() {
      synchronized (d.f(this.d)) {
        if (this.c) {
          d.h(this.d);
        } else {
          d.i(this.d);
        } 
        return;
      } 
    }
  }
  
  private class c implements Runnable {
    private volatile boolean c = false;
    
    private final long d;
    
    public c(d this$0, long param1Long) {
      this.d = param1Long;
    }
    
    public void a() {
      this.c = true;
    }
    
    public void run() {
      if (this.c)
        return; 
      long l1 = this.d / 1000000L;
      l1 = i.c() - l1;
      long l2 = i.a();
      if (16.666666F - (float)l1 < 1.0F)
        return; 
      synchronized (d.f(this.e)) {
        boolean bool = d.g(this.e);
        if (bool)
          d.m(this.e).callIdleCallbacks((l2 - l1)); 
        d.a(this.e, (c)null);
        return;
      } 
    }
  }
  
  private class d extends a.a {
    private d(d this$0) {}
    
    public void a(long param1Long) {
      if (d.a(this.b).get() && !d.b(this.b).get())
        return; 
      if (d.d(this.b) != null)
        d.d(this.b).a(); 
      d d1 = this.b;
      d.a(d1, new d.c(d1, param1Long));
      d.e(this.b).runOnJSQueueThread(d.d(this.b));
      d.c(this.b).a(g.c.g, this);
    }
  }
  
  private static class e {
    private final int a;
    
    private final boolean b;
    
    private final int c;
    
    private long d;
    
    private e(int param1Int1, long param1Long, int param1Int2, boolean param1Boolean) {
      this.a = param1Int1;
      this.d = param1Long;
      this.c = param1Int2;
      this.b = param1Boolean;
    }
  }
  
  private class f extends a.a {
    private WritableArray b = null;
    
    private f(d this$0) {}
    
    public void a(long param1Long) {
      if (d.a(this.c).get() && !d.b(this.c).get())
        return; 
      param1Long /= 1000000L;
      synchronized (d.j(this.c)) {
        while (!d.k(this.c).isEmpty() && d.e.a(d.k(this.c).peek()) < param1Long) {
          d.e e = d.k(this.c).poll();
          if (this.b == null)
            this.b = Arguments.createArray(); 
          this.b.pushInt(d.e.b(e));
          if (d.e.c(e)) {
            d.e.a(e, d.e.d(e) + param1Long);
            d.k(this.c).add(e);
            continue;
          } 
          d.l(this.c).remove(d.e.b(e));
        } 
        if (this.b != null) {
          d.m(this.c).callTimers(this.b);
          this.b = null;
        } 
        d.c(this.c).a(g.c.f, this);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */