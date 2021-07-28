package b.g.k;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {
  private final Object a = new Object();
  
  private HandlerThread b;
  
  private Handler c;
  
  private int d;
  
  private Handler.Callback e = new a(this);
  
  private final int f;
  
  private final int g;
  
  private final String h;
  
  public c(String paramString, int paramInt1, int paramInt2) {
    this.h = paramString;
    this.g = paramInt1;
    this.f = paramInt2;
    this.d = 0;
  }
  
  private void b(Runnable paramRunnable) {
    synchronized (this.a) {
      if (this.b == null) {
        this.b = new HandlerThread(this.h, this.g);
        this.b.start();
        this.c = new Handler(this.b.getLooper(), this.e);
        this.d++;
      } 
      this.c.removeMessages(0);
      this.c.sendMessage(this.c.obtainMessage(1, paramRunnable));
      return;
    } 
  }
  
  public <T> T a(Callable<T> paramCallable, int paramInt) {
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();
    AtomicReference<Callable<T>> atomicReference = new AtomicReference();
    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
    b(new c(this, atomicReference, paramCallable, reentrantLock, atomicBoolean, condition));
    reentrantLock.lock();
    try {
      if (!atomicBoolean.get()) {
        paramCallable = atomicReference.get();
        return (T)paramCallable;
      } 
      long l = TimeUnit.MILLISECONDS.toNanos(paramInt);
      while (true) {
        try {
          long l1 = condition.awaitNanos(l);
          l = l1;
        } catch (InterruptedException interruptedException) {}
        if (!atomicBoolean.get()) {
          paramCallable = atomicReference.get();
          return (T)paramCallable;
        } 
        if (l > 0L)
          continue; 
        throw new InterruptedException("timeout");
      } 
    } finally {
      reentrantLock.unlock();
    } 
  }
  
  void a() {
    synchronized (this.a) {
      if (this.c.hasMessages(1))
        return; 
      this.b.quit();
      this.b = null;
      this.c = null;
      return;
    } 
  }
  
  void a(Runnable paramRunnable) {
    paramRunnable.run();
    synchronized (this.a) {
      this.c.removeMessages(0);
      this.c.sendMessageDelayed(this.c.obtainMessage(0), this.f);
      return;
    } 
  }
  
  public <T> void a(Callable<T> paramCallable, d<T> paramd) {
    b(new b(this, paramCallable, new Handler(), paramd));
  }
  
  class a implements Handler.Callback {
    a(c this$0) {}
    
    public boolean handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 0) {
        if (i != 1)
          return true; 
        this.a.a((Runnable)param1Message.obj);
        return true;
      } 
      this.a.a();
      return true;
    }
  }
  
  class b implements Runnable {
    b(c this$0, Callable param1Callable, Handler param1Handler, c.d param1d) {}
    
    public void run() {
      try {
        exception = (Exception)this.c.call();
      } catch (Exception exception) {
        exception = null;
      } 
      this.d.post(new a(this, exception));
    }
    
    class a implements Runnable {
      a(c.b this$0, Object param2Object) {}
      
      public void run() {
        this.d.e.a(this.c);
      }
    }
  }
  
  class a implements Runnable {
    a(c this$0, Object param1Object) {}
    
    public void run() {
      this.d.e.a(this.c);
    }
  }
  
  class c implements Runnable {
    c(c this$0, AtomicReference param1AtomicReference, Callable param1Callable, ReentrantLock param1ReentrantLock, AtomicBoolean param1AtomicBoolean, Condition param1Condition) {}
    
    public void run() {
      try {
        this.c.set(this.d.call());
      } catch (Exception exception) {}
      this.e.lock();
      try {
        this.f.set(false);
        this.g.signal();
        return;
      } finally {
        this.e.unlock();
      } 
    }
  }
  
  public static interface d<T> {
    void a(T param1T);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */