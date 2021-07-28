package e.f.b.a.c;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import e.f.a.e.m.a;
import e.f.a.e.m.b;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import e.f.a.e.m.o;
import e.f.b.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class k {
  @RecentlyNonNull
  protected final n a = new n();
  
  private final AtomicInteger b = new AtomicInteger(0);
  
  private final AtomicBoolean c = new AtomicBoolean(false);
  
  @RecentlyNonNull
  public <T> l<T> a(@RecentlyNonNull Executor paramExecutor, @RecentlyNonNull Callable<T> paramCallable, @RecentlyNonNull a parama) {
    boolean bool;
    if (this.b.get() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    q.b(bool);
    if (parama.a())
      return o.a(); 
    b b = new b();
    m m = new m(b.b());
    paramExecutor = new z(paramExecutor, parama, b, m);
    this.a.a(paramExecutor, new a0(this, parama, b, paramCallable, m));
    return m.a();
  }
  
  public abstract void a();
  
  public void a(@RecentlyNonNull Executor paramExecutor) {
    boolean bool;
    if (this.b.get() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    q.b(bool);
    this.a.a(paramExecutor, new y(this));
  }
  
  public void b() {
    this.b.incrementAndGet();
  }
  
  protected abstract void c();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */