package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;

public final class a0<O extends a.d> extends z0 {
  private final e<O> b;
  
  public a0(e<O> parame) {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    this.b = parame;
  }
  
  public final Looper a() {
    return this.b.e();
  }
  
  public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.l, A>> T a(T paramT) {
    this.b.b((d)paramT);
    return paramT;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */