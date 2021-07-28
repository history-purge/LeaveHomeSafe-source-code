package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.o;

public final class b<O extends a.d> {
  private final int a;
  
  private final a<O> b;
  
  private final O c;
  
  private b(a<O> parama, O paramO) {
    this.b = parama;
    this.c = paramO;
    this.a = o.a(new Object[] { this.b, this.c });
  }
  
  @RecentlyNonNull
  public static <O extends a.d> b<O> a(@RecentlyNonNull a<O> parama, O paramO) {
    return new b<O>(parama, paramO);
  }
  
  @RecentlyNonNull
  public final String a() {
    return this.b.c();
  }
  
  @RecentlyNonNull
  public final boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (o.a(this.b, ((b)paramObject).b) && o.a(this.c, ((b)paramObject).c));
  }
  
  @RecentlyNonNull
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */