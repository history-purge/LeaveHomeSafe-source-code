package com.google.android.gms.common.util.p;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {
  private final String a;
  
  private final ThreadFactory b = Executors.defaultThreadFactory();
  
  public a(@RecentlyNonNull String paramString) {
    this(paramString, 0);
  }
  
  private a(String paramString, int paramInt) {
    q.a(paramString, "Name must not be null");
    this.a = paramString;
  }
  
  @RecentlyNonNull
  public Thread newThread(@RecentlyNonNull Runnable paramRunnable) {
    paramRunnable = this.b.newThread(new b(paramRunnable, 0));
    paramRunnable.setName(this.a);
    return (Thread)paramRunnable;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */