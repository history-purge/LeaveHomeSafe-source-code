package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class f0 {
  public final int a;
  
  public f0(int paramInt) {
    this.a = paramInt;
  }
  
  private static Status b(RemoteException paramRemoteException) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramRemoteException.getClass().getSimpleName());
    stringBuilder.append(": ");
    stringBuilder.append(paramRemoteException.getLocalizedMessage());
    return new Status(19, stringBuilder.toString());
  }
  
  public abstract void a(Status paramStatus);
  
  public abstract void a(g.a<?> parama);
  
  public abstract void a(x0 paramx0, boolean paramBoolean);
  
  public abstract void a(Exception paramException);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */