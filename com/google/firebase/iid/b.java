package com.google.firebase.iid;

import com.google.android.gms.common.util.p.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class b {
  private static final Executor a = a.c;
  
  static Executor a() {
    return a;
  }
  
  static ExecutorService b() {
    return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new a("firebase-iid-executor"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */