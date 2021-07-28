package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;

public class g {
  private static g g;
  
  private volatile a a;
  
  private final d b;
  
  private final Object c = new Object();
  
  private final ArrayDeque<a.a>[] d;
  
  private int e;
  
  private boolean f;
  
  private g() {
    int i = 0;
    this.e = 0;
    this.f = false;
    this.b = new d(null);
    this.d = (ArrayDeque<a.a>[])new ArrayDeque[(c.values()).length];
    while (true) {
      ArrayDeque<a.a>[] arrayOfArrayDeque = this.d;
      if (i < arrayOfArrayDeque.length) {
        arrayOfArrayDeque[i] = new ArrayDeque<a.a>();
        i++;
        continue;
      } 
      a((Runnable)null);
      return;
    } 
  }
  
  public static g a() {
    e.e.m.a.a.a(g, "ReactChoreographer needs to be initialized.");
    return g;
  }
  
  public static void b() {
    if (g == null)
      g = new g(); 
  }
  
  private void c() {
    boolean bool;
    if (this.e >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.m.a.a.a(bool);
    if (this.e == 0 && this.f) {
      if (this.a != null)
        this.a.b(this.b); 
      this.f = false;
    } 
  }
  
  private void d() {
    this.a.a(this.b);
    this.f = true;
  }
  
  public void a(c paramc, a.a parama) {
    synchronized (this.c) {
      this.d[paramc.a()].addLast(parama);
      int i = this.e;
      boolean bool = true;
      this.e = i + 1;
      if (this.e <= 0)
        bool = false; 
      e.e.m.a.a.a(bool);
      if (!this.f)
        if (this.a == null) {
          a(new a(this));
        } else {
          d();
        }  
      return;
    } 
  }
  
  public void a(Runnable paramRunnable) {
    UiThreadUtil.runOnUiThread(new b(this, paramRunnable));
  }
  
  public void b(c paramc, a.a parama) {
    synchronized (this.c) {
      if (this.d[paramc.a()].removeFirstOccurrence(parama)) {
        this.e--;
        c();
      } else {
        e.e.e.e.a.b("ReactNative", "Tried to remove non-existent frame callback");
      } 
      return;
    } 
  }
  
  class a implements Runnable {
    a(g this$0) {}
    
    public void run() {
      g.a(this.c);
    }
  }
  
  class b implements Runnable {
    b(g this$0, Runnable param1Runnable) {}
    
    public void run() {
      // Byte code:
      //   0: ldc com/facebook/react/modules/core/g
      //   2: monitorenter
      //   3: aload_0
      //   4: getfield d : Lcom/facebook/react/modules/core/g;
      //   7: invokestatic b : (Lcom/facebook/react/modules/core/g;)Lcom/facebook/react/modules/core/a;
      //   10: ifnonnull -> 24
      //   13: aload_0
      //   14: getfield d : Lcom/facebook/react/modules/core/g;
      //   17: invokestatic b : ()Lcom/facebook/react/modules/core/a;
      //   20: invokestatic a : (Lcom/facebook/react/modules/core/g;Lcom/facebook/react/modules/core/a;)Lcom/facebook/react/modules/core/a;
      //   23: pop
      //   24: ldc com/facebook/react/modules/core/g
      //   26: monitorexit
      //   27: aload_0
      //   28: getfield c : Ljava/lang/Runnable;
      //   31: astore_1
      //   32: aload_1
      //   33: ifnull -> 42
      //   36: aload_1
      //   37: invokeinterface run : ()V
      //   42: return
      //   43: astore_1
      //   44: ldc com/facebook/react/modules/core/g
      //   46: monitorexit
      //   47: aload_1
      //   48: athrow
      // Exception table:
      //   from	to	target	type
      //   3	24	43	finally
      //   24	27	43	finally
      //   44	47	43	finally
    }
  }
  
  public enum c {
    c(0),
    d(1),
    e(2),
    f(3),
    g(4);
    
    private final int mOrder;
    
    c(int param1Int1) {
      this.mOrder = param1Int1;
    }
    
    int a() {
      return this.mOrder;
    }
  }
  
  private class d extends a.a {
    private d(g this$0) {}
    
    public void a(long param1Long) {
      synchronized (g.c(this.b)) {
        g.a(this.b, false);
        for (int i = 0;; i++) {
          if (i < (g.d(this.b)).length) {
            ArrayDeque<a.a> arrayDeque = g.d(this.b)[i];
            int k = arrayDeque.size();
            int j;
            for (j = 0; j < k; j++) {
              a.a a1 = arrayDeque.pollFirst();
              if (a1 != null) {
                a1.a(param1Long);
                g.e(this.b);
              } else {
                e.e.e.e.a.b("ReactNative", "Tried to execute non-existent frame callback");
              } 
            } 
          } else {
            g.f(this.b);
            return;
          } 
        } 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */