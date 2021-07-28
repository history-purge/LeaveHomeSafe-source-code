package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import e.f.a.e.m.m;

abstract class n0<T> extends s {
  protected final m<T> b;
  
  public n0(int paramInt, m<T> paramm) {
    super(paramInt);
    this.b = paramm;
  }
  
  public void a(Status paramStatus) {
    this.b.b((Exception)new b(paramStatus));
  }
  
  public final void a(g.a<?> parama) {
    try {
      d(parama);
      return;
    } catch (DeadObjectException deadObjectException) {
      a(f0.a((RemoteException)deadObjectException));
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      a(f0.a(remoteException));
      return;
    } catch (RuntimeException runtimeException) {
      a(runtimeException);
      return;
    } 
  }
  
  public void a(Exception paramException) {
    this.b.b(paramException);
  }
  
  protected abstract void d(g.a<?> parama);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */