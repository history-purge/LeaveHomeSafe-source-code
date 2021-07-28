package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.q;
import e.f.a.e.i.c.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends l> extends h<R> {
  static final ThreadLocal<Boolean> n = new u0();
  
  private final Object a;
  
  private final a<R> b;
  
  private final CountDownLatch c;
  
  private final ArrayList<h.a> d;
  
  private m<? super R> e;
  
  private final AtomicReference<l0> f;
  
  private R g;
  
  private Status h;
  
  private volatile boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private volatile k0<R> l;
  
  private boolean m;
  
  @Deprecated
  BasePendingResult() {
    this.a = new Object();
    this.c = new CountDownLatch(1);
    this.d = new ArrayList<h.a>();
    this.f = new AtomicReference<l0>();
    this.m = false;
    this.b = new a<R>(Looper.getMainLooper());
    new WeakReference(null);
  }
  
  protected BasePendingResult(f paramf) {
    Looper looper;
    this.a = new Object();
    this.c = new CountDownLatch(1);
    this.d = new ArrayList<h.a>();
    this.f = new AtomicReference<l0>();
    this.m = false;
    if (paramf != null) {
      looper = paramf.a();
    } else {
      looper = Looper.getMainLooper();
    } 
    this.b = new a<R>(looper);
    new WeakReference<f>(paramf);
  }
  
  private static <R extends l> m<R> b(m<R> paramm) {
    return paramm;
  }
  
  public static void b(l paraml) {
    if (paraml instanceof j)
      try {
        ((j)paraml).a();
        return;
      } catch (RuntimeException runtimeException) {
        String str = String.valueOf(paraml);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
        stringBuilder.append("Unable to release ");
        stringBuilder.append(str);
        Log.w("BasePendingResult", stringBuilder.toString(), runtimeException);
      }  
  }
  
  private final R c() {
    synchronized (this.a) {
      boolean bool;
      if (!this.i) {
        bool = true;
      } else {
        bool = false;
      } 
      q.b(bool, "Result has already been consumed.");
      q.b(a(), "Result is not ready.");
      R r = this.g;
      this.g = null;
      this.e = null;
      this.i = true;
      null = this.f.getAndSet(null);
      if (null != null)
        null.a(this); 
      q.a(r);
      return r;
    } 
  }
  
  private final void c(R paramR) {
    this.g = paramR;
    this.h = paramR.a();
    this.c.countDown();
    if (this.j) {
      this.e = null;
    } else {
      m<? super R> m1 = this.e;
      if (m1 == null) {
        if (this.g instanceof j)
          new b(null); 
      } else {
        this.b.removeMessages(2);
        this.b.a(m1, c());
      } 
    } 
    ArrayList<h.a> arrayList = this.d;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      h.a a1 = (h.a)arrayList.get(i);
      i++;
      ((h.a)a1).a(this.h);
    } 
    this.d.clear();
  }
  
  @RecentlyNonNull
  public final R a(@RecentlyNonNull long paramLong, @RecentlyNonNull TimeUnit paramTimeUnit) {
    if (paramLong > 0L)
      q.c("await must not be called on the UI thread when time is greater than zero."); 
    boolean bool1 = this.i;
    boolean bool = true;
    q.b(bool1 ^ true, "Result has already been consumed.");
    if (this.l != null)
      bool = false; 
    q.b(bool, "Cannot await if then() has been called.");
    try {
      if (!this.c.await(paramLong, paramTimeUnit))
        b(Status.k); 
    } catch (InterruptedException interruptedException) {
      b(Status.i);
    } 
    q.b(a(), "Result is not ready.");
    return c();
  }
  
  protected abstract R a(@RecentlyNonNull Status paramStatus);
  
  public final void a(@RecentlyNonNull h.a parama) {
    boolean bool;
    if (parama != null) {
      bool = true;
    } else {
      bool = false;
    } 
    q.a(bool, "Callback cannot be null.");
    synchronized (this.a) {
      if (a()) {
        parama.a(this.h);
      } else {
        this.d.add(parama);
      } 
      return;
    } 
  }
  
  public final void a(@RecentlyNonNull R paramR) {
    synchronized (this.a) {
      if (!this.k && !this.j) {
        a();
        boolean bool = a();
        boolean bool1 = true;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        } 
        q.b(bool, "Results have already been set");
        if (!this.i) {
          bool = bool1;
        } else {
          bool = false;
        } 
        q.b(bool, "Result has already been consumed");
        c(paramR);
        return;
      } 
      b((l)paramR);
      return;
    } 
  }
  
  @RecentlyNonNull
  public final boolean a() {
    return (this.c.getCount() == 0L);
  }
  
  public final void b() {
    boolean bool;
    if (this.m || ((Boolean)n.get()).booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.m = bool;
  }
  
  @Deprecated
  public final void b(@RecentlyNonNull Status paramStatus) {
    synchronized (this.a) {
      if (!a()) {
        a(a(paramStatus));
        this.k = true;
      } 
      return;
    } 
  }
  
  public static class a<R extends l> extends d {
    public a(@RecentlyNonNull Looper param1Looper) {
      super(param1Looper);
    }
    
    public final void a(@RecentlyNonNull m<? super R> param1m, @RecentlyNonNull R param1R) {
      BasePendingResult.a(param1m);
      q.a(param1m);
      sendMessage(obtainMessage(1, new Pair(param1m, param1R)));
    }
    
    public void handleMessage(@RecentlyNonNull Message param1Message) {
      StringBuilder stringBuilder;
      int i = param1Message.what;
      if (i != 1) {
        if (i != 2) {
          stringBuilder = new StringBuilder(45);
          stringBuilder.append("Don't know how to handle message: ");
          stringBuilder.append(i);
          Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
          return;
        } 
        ((BasePendingResult)((Message)stringBuilder).obj).b(Status.k);
        return;
      } 
      Pair pair = (Pair)((Message)stringBuilder).obj;
      m m = (m)pair.first;
      l l = (l)pair.second;
      try {
        m.a(l);
        return;
      } catch (RuntimeException runtimeException) {
        BasePendingResult.b(l);
        throw runtimeException;
      } 
    }
  }
  
  private final class b {
    private b(BasePendingResult this$0) {}
    
    protected final void finalize() {
      BasePendingResult.b(BasePendingResult.a(this.a));
      super.finalize();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */