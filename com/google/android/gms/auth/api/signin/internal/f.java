package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import b.n.b.a;
import com.google.android.gms.common.api.internal.m;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class f extends a<Void> implements m {
  private Semaphore o = new Semaphore(0);
  
  private Set<com.google.android.gms.common.api.f> p;
  
  public f(Context paramContext, Set<com.google.android.gms.common.api.f> paramSet) {
    super(paramContext);
    this.p = paramSet;
  }
  
  private final Void v() {
    Iterator<com.google.android.gms.common.api.f> iterator = this.p.iterator();
    if (!iterator.hasNext())
      try {
        this.o.tryAcquire(0, 5L, TimeUnit.SECONDS);
        return null;
      } catch (InterruptedException interruptedException) {
        Log.i("GACSignInLoader", "Unexpected InterruptedException", interruptedException);
        Thread.currentThread().interrupt();
        return null;
      }  
    ((com.google.android.gms.common.api.f)interruptedException.next()).a(this);
    throw null;
  }
  
  protected final void l() {
    this.o.drainPermits();
    e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */