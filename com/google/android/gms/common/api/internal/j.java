package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;

public final class j<L> {
  private final L a;
  
  private final String b;
  
  @RecentlyNonNull
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof j))
      return false; 
    paramObject = paramObject;
    return (this.a == ((j)paramObject).a && this.b.equals(((j)paramObject).b));
  }
  
  @RecentlyNonNull
  public final int hashCode() {
    return System.identityHashCode(this.a) * 31 + this.b.hashCode();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */