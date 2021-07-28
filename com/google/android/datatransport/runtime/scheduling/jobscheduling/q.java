package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.f.a.c.i.n;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.y.b;
import java.util.concurrent.Executor;

public class q {
  private final Executor a;
  
  private final y b;
  
  private final s c;
  
  private final b d;
  
  q(Executor paramExecutor, y paramy, s params, b paramb) {
    this.a = paramExecutor;
    this.b = paramy;
    this.c = params;
    this.d = paramb;
  }
  
  public void a() {
    this.a.execute(new h(this));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */