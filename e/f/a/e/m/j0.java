package e.f.a.e.m;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class j0<TResult> extends l<TResult> {
  private final Object a = new Object();
  
  private final f0<TResult> b = new f0<TResult>();
  
  private boolean c;
  
  private volatile boolean d;
  
  private TResult e;
  
  private Exception f;
  
  private final void g() {
    q.b(this.c, "Task is not yet complete");
  }
  
  private final void h() {
    if (!this.c)
      return; 
    throw d.a(this);
  }
  
  private final void i() {
    if (!this.d)
      return; 
    throw new CancellationException("Task is already canceled.");
  }
  
  private final void j() {
    synchronized (this.a) {
      if (!this.c)
        return; 
      this.b.a(this);
      return;
    } 
  }
  
  public final <TContinuationResult> l<TContinuationResult> a(c<TResult, TContinuationResult> paramc) {
    return a(n.a, paramc);
  }
  
  public final l<TResult> a(f<TResult> paramf) {
    a(n.a, paramf);
    return this;
  }
  
  public final l<TResult> a(g paramg) {
    a(n.a, paramg);
    return this;
  }
  
  public final l<TResult> a(h<? super TResult> paramh) {
    a(n.a, paramh);
    return this;
  }
  
  public final <TContinuationResult> l<TContinuationResult> a(k<TResult, TContinuationResult> paramk) {
    return a(n.a, paramk);
  }
  
  public final <TContinuationResult> l<TContinuationResult> a(Executor paramExecutor, c<TResult, TContinuationResult> paramc) {
    j0<TContinuationResult> j01 = new j0();
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new r<TResult, TContinuationResult>(paramExecutor, paramc, j01));
    j();
    return j01;
  }
  
  public final l<TResult> a(Executor paramExecutor, e parame) {
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new w<TResult>(paramExecutor, parame));
    j();
    return this;
  }
  
  public final l<TResult> a(Executor paramExecutor, f<TResult> paramf) {
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new x<TResult>(paramExecutor, paramf));
    j();
    return this;
  }
  
  public final l<TResult> a(Executor paramExecutor, g paramg) {
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new a0<TResult>(paramExecutor, paramg));
    j();
    return this;
  }
  
  public final l<TResult> a(Executor paramExecutor, h<? super TResult> paramh) {
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new b0<TResult>(paramExecutor, paramh));
    j();
    return this;
  }
  
  public final <TContinuationResult> l<TContinuationResult> a(Executor paramExecutor, k<TResult, TContinuationResult> paramk) {
    j0<TContinuationResult> j01 = new j0();
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new e0<TResult, TContinuationResult>(paramExecutor, paramk, j01));
    j();
    return j01;
  }
  
  public final Exception a() {
    synchronized (this.a) {
      return this.f;
    } 
  }
  
  public final <X extends Throwable> TResult a(Class<X> paramClass) throws X {
    synchronized (this.a) {
      TResult tResult;
      g();
      i();
      if (!paramClass.isInstance(this.f)) {
        if (this.f == null) {
          tResult = this.e;
          return tResult;
        } 
        throw (X)new j(this.f);
      } 
      throw (X)tResult.cast(this.f);
    } 
  }
  
  public final void a(Exception paramException) {
    q.a(paramException, "Exception must not be null");
    synchronized (this.a) {
      h();
      this.c = true;
      this.f = paramException;
      this.b.a(this);
      return;
    } 
  }
  
  public final void a(TResult paramTResult) {
    synchronized (this.a) {
      h();
      this.c = true;
      this.e = paramTResult;
      this.b.a(this);
      return;
    } 
  }
  
  public final <TContinuationResult> l<TContinuationResult> b(Executor paramExecutor, c<TResult, l<TContinuationResult>> paramc) {
    j0<TContinuationResult> j01 = new j0();
    f0<TResult> f01 = this.b;
    k0.a(paramExecutor);
    f01.a(new s<TResult, TContinuationResult>(paramExecutor, paramc, j01));
    j();
    return j01;
  }
  
  public final TResult b() {
    synchronized (this.a) {
      g();
      i();
      if (this.f == null)
        return this.e; 
      throw new j(this.f);
    } 
  }
  
  public final boolean b(Exception paramException) {
    q.a(paramException, "Exception must not be null");
    synchronized (this.a) {
      if (this.c)
        return false; 
      this.c = true;
      this.f = paramException;
      this.b.a(this);
      return true;
    } 
  }
  
  public final boolean b(TResult paramTResult) {
    synchronized (this.a) {
      if (this.c)
        return false; 
      this.c = true;
      this.e = paramTResult;
      this.b.a(this);
      return true;
    } 
  }
  
  public final boolean c() {
    return this.d;
  }
  
  public final boolean d() {
    synchronized (this.a) {
      return this.c;
    } 
  }
  
  public final boolean e() {
    synchronized (this.a) {
      if (this.c && !this.d && this.f == null)
        return true; 
    } 
    boolean bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return bool;
  }
  
  public final boolean f() {
    synchronized (this.a) {
      if (this.c)
        return false; 
      this.c = true;
      this.d = true;
      this.b.a(this);
      return true;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */