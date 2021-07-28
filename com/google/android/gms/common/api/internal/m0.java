package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.q;

public final class m0<A extends d<? extends l, a.b>> extends f0 {
  private final A b;
  
  public m0(int paramInt, A paramA) {
    super(paramInt);
    q.a(paramA, "Null methods are not runnable.");
    this.b = paramA;
  }
  
  public final void a(Status paramStatus) {
    try {
      this.b.c(paramStatus);
      return;
    } catch (IllegalStateException illegalStateException) {
      Log.w("ApiCallRunner", "Exception reporting failure", illegalStateException);
      return;
    } 
  }
  
  public final void a(g.a<?> parama) {
    try {
      this.b.b(parama.b());
      return;
    } catch (RuntimeException runtimeException) {
      a(runtimeException);
      return;
    } 
  }
  
  public final void a(x0 paramx0, boolean paramBoolean) {
    paramx0.a((BasePendingResult<? extends l>)this.b, paramBoolean);
  }
  
  public final void a(Exception paramException) {
    String str2 = paramException.getClass().getSimpleName();
    String str1 = paramException.getLocalizedMessage();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str1).length());
    stringBuilder.append(str2);
    stringBuilder.append(": ");
    stringBuilder.append(str1);
    Status status = new Status(10, stringBuilder.toString());
    try {
      this.b.c(status);
      return;
    } catch (IllegalStateException illegalStateException) {
      Log.w("ApiCallRunner", "Exception reporting failure", illegalStateException);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */