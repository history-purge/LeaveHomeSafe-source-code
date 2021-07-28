package com.google.firebase.messaging;

import com.google.android.gms.common.util.p.a;
import e.f.a.e.i.g.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class p {
  private static Executor a(String paramString) {
    return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new a("Firebase-Messaging-Trigger-Topics-Io"));
  }
  
  static ScheduledExecutorService a() {
    return new ScheduledThreadPoolExecutor(1, (ThreadFactory)new a("Firebase-Messaging-Init"));
  }
  
  static ExecutorService b() {
    o.a();
    a a = new a("Firebase-Messaging-Intent-Handle");
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)a);
    threadPoolExecutor.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(threadPoolExecutor);
  }
  
  static ExecutorService c() {
    return Executors.newSingleThreadExecutor((ThreadFactory)new a("Firebase-Messaging-Network-Io"));
  }
  
  static ExecutorService d() {
    return Executors.newSingleThreadExecutor((ThreadFactory)new a("Firebase-Messaging-Task"));
  }
  
  static ScheduledExecutorService e() {
    return new ScheduledThreadPoolExecutor(1, (ThreadFactory)new a("Firebase-Messaging-Topics-Io"));
  }
  
  static Executor f() {
    return a("Firebase-Messaging-Trigger-Topics-Io");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */