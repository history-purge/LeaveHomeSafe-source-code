package com.google.android.gms.common.util.p;

import android.os.Process;

final class b implements Runnable {
  private final Runnable c;
  
  private final int d;
  
  public b(Runnable paramRunnable, int paramInt) {
    this.c = paramRunnable;
    this.d = 0;
  }
  
  public final void run() {
    Process.setThreadPriority(this.d);
    this.c.run();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */