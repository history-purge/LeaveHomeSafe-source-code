package b.n.b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class c<Params, Progress, Result> {
  private static final ThreadFactory h = new a();
  
  private static final BlockingQueue<Runnable> i = new LinkedBlockingQueue<Runnable>(10);
  
  public static final Executor j = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, i, h);
  
  private static f k;
  
  private final h<Params, Result> c = new b(this);
  
  private final FutureTask<Result> d = new c(this, this.c);
  
  private volatile g e = g.c;
  
  final AtomicBoolean f = new AtomicBoolean();
  
  final AtomicBoolean g = new AtomicBoolean();
  
  private static Handler d() {
    // Byte code:
    //   0: ldc b/n/b/c
    //   2: monitorenter
    //   3: getstatic b/n/b/c.k : Lb/n/b/c$f;
    //   6: ifnonnull -> 19
    //   9: new b/n/b/c$f
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic b/n/b/c.k : Lb/n/b/c$f;
    //   19: getstatic b/n/b/c.k : Lb/n/b/c$f;
    //   22: astore_0
    //   23: ldc b/n/b/c
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc b/n/b/c
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	26	28	finally
    //   29	32	28	finally
  }
  
  public final c<Params, Progress, Result> a(Executor paramExecutor, Params... paramVarArgs) {
    if (this.e != g.c) {
      int i = d.a[this.e.ordinal()];
      if (i != 1) {
        if (i != 2)
          throw new IllegalStateException("We should never reach this state"); 
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
      } 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    } 
    this.e = g.d;
    c();
    this.c.a = paramVarArgs;
    paramExecutor.execute(this.d);
    return this;
  }
  
  protected abstract Result a(Params... paramVarArgs);
  
  void a(Result paramResult) {
    if (a()) {
      b(paramResult);
    } else {
      c(paramResult);
    } 
    this.e = g.e;
  }
  
  public final boolean a() {
    return this.f.get();
  }
  
  public final boolean a(boolean paramBoolean) {
    this.f.set(true);
    return this.d.cancel(paramBoolean);
  }
  
  protected void b() {}
  
  protected void b(Result paramResult) {
    b();
  }
  
  protected void b(Progress... paramVarArgs) {}
  
  protected void c() {}
  
  protected void c(Result paramResult) {}
  
  Result d(Result paramResult) {
    d().obtainMessage(1, new e(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  void e(Result paramResult) {
    if (!this.g.get())
      d(paramResult); 
  }
  
  static final class a implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    
    public Thread newThread(Runnable param1Runnable) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ModernAsyncTask #");
      stringBuilder.append(this.a.getAndIncrement());
      return new Thread(param1Runnable, stringBuilder.toString());
    }
  }
  
  class b extends h<Params, Result> {
    b(c this$0) {}
    
    public Result call() {
      this.b.g.set(true);
      Object object2 = null;
      Object object1 = object2;
      try {
        Process.setThreadPriority(10);
        object1 = object2;
        object2 = this.b.a((Object[])this.a);
        object1 = object2;
        Binder.flushPendingCommands();
        return (Result)object2;
      } finally {
        object2 = null;
      } 
    }
  }
  
  class c extends FutureTask<Result> {
    c(c this$0, Callable<Result> param1Callable) {
      super(param1Callable);
    }
    
    protected void done() {
      try {
        V v = get();
        return;
      } catch (InterruptedException interruptedException) {
        return;
      } catch (ExecutionException executionException) {
        throw new RuntimeException("An error occurred while executing doInBackground()", executionException.getCause());
      } catch (CancellationException cancellationException) {
        return;
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  private static class e<Data> {
    final c a;
    
    final Data[] b;
    
    e(c param1c, Data... param1VarArgs) {
      this.a = param1c;
      this.b = param1VarArgs;
    }
  }
  
  private static class f extends Handler {
    f() {
      super(Looper.getMainLooper());
    }
    
    public void handleMessage(Message param1Message) {
      c.e e = (c.e)param1Message.obj;
      int i = param1Message.what;
      if (i != 1) {
        if (i != 2)
          return; 
        e.a.b((Object[])e.b);
        return;
      } 
      e.a.a(e.b[0]);
    }
  }
  
  public enum g {
    c, d, e;
  }
  
  private static abstract class h<Params, Result> implements Callable<Result> {
    Params[] a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/n/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */