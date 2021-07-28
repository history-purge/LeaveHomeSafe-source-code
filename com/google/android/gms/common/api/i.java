package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.q;

public final class i {
  @RecentlyNonNull
  public static h<Status> a(@RecentlyNonNull Status paramStatus, @RecentlyNonNull f paramf) {
    q.a(paramStatus, "Result must not be null");
    o o = new o(paramf);
    o.a(paramStatus);
    return (h<Status>)o;
  }
  
  @RecentlyNonNull
  public static <R extends l> h<R> a(@RecentlyNonNull R paramR, @RecentlyNonNull f paramf) {
    q.a(paramR, "Result must not be null");
    q.a(paramR.a().r() ^ true, "Status code must not be SUCCESS");
    a<R> a = new a<R>(paramf, paramR);
    a.a((l)paramR);
    return (h<R>)a;
  }
  
  private static final class a<R extends l> extends BasePendingResult<R> {
    private final R o;
    
    public a(f param1f, R param1R) {
      super(param1f);
      this.o = param1R;
    }
    
    protected final R a(Status param1Status) {
      return this.o;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */