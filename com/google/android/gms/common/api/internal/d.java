package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.q;

public abstract class d<R extends l, A extends a.b> extends BasePendingResult<R> implements e<R> {
  protected d(@RecentlyNonNull a<?> parama, @RecentlyNonNull f paramf) {
    super(paramf);
    q.a(parama, "Api must not be null");
    parama.b();
  }
  
  private void a(RemoteException paramRemoteException) {
    c(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  protected abstract void a(@RecentlyNonNull A paramA);
  
  public final void b(@RecentlyNonNull A paramA) {
    try {
      a(paramA);
      return;
    } catch (DeadObjectException deadObjectException) {
      a((RemoteException)deadObjectException);
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      a(remoteException);
      return;
    } 
  }
  
  public final void c(@RecentlyNonNull Status paramStatus) {
    q.a(paramStatus.r() ^ true, "Failed result must not be success");
    paramStatus = (Status)a(paramStatus);
    a((R)paramStatus);
    c((R)paramStatus);
  }
  
  protected void c(@RecentlyNonNull R paramR) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */