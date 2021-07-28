package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public final class i {
  private final String a;
  
  private final String b;
  
  public i(@RecentlyNonNull String paramString) {
    this(paramString, null);
  }
  
  public i(@RecentlyNonNull String paramString1, String paramString2) {
    boolean bool;
    q.a(paramString1, "log tag cannot be null");
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    q.a(bool, "tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) });
    this.a = paramString1;
    if (paramString2 == null || paramString2.length() <= 0) {
      this.b = null;
      return;
    } 
    this.b = paramString2;
  }
  
  private final String a(String paramString) {
    String str = this.b;
    return (str == null) ? paramString : str.concat(paramString);
  }
  
  public final void a(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2) {
    if (a(3))
      Log.d(paramString1, a(paramString2)); 
  }
  
  public final void a(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, @RecentlyNonNull Throwable paramThrowable) {
    if (a(6))
      Log.e(paramString1, a(paramString2), paramThrowable); 
  }
  
  @RecentlyNonNull
  public final boolean a(@RecentlyNonNull int paramInt) {
    return Log.isLoggable(this.a, paramInt);
  }
  
  public final void b(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2) {
    if (a(6))
      Log.e(paramString1, a(paramString2)); 
  }
  
  public final void c(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2) {
    if (a(2))
      Log.v(paramString1, a(paramString2)); 
  }
  
  public final void d(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2) {
    if (a(5))
      Log.w(paramString1, a(paramString2)); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */