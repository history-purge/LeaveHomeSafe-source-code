package b.n.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.g;
import b.g.j.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class a<D> extends b<D> {
  private final Executor i;
  
  volatile a j;
  
  volatile a k;
  
  long l;
  
  long m = -10000L;
  
  Handler n;
  
  public a(Context paramContext) {
    this(paramContext, c.j);
  }
  
  private a(Context paramContext, Executor paramExecutor) {
    super(paramContext);
    this.i = paramExecutor;
  }
  
  void a(a parama, D paramD) {
    c(paramD);
    if (this.k == parama) {
      o();
      this.m = SystemClock.uptimeMillis();
      this.k = null;
      d();
      s();
    } 
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.j != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.j.m);
    } 
    if (this.k != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.k.m);
    } 
    if (this.l != 0L) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      g.a(this.l, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      g.a(this.m, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    } 
  }
  
  void b(a parama, D paramD) {
    if (this.j != parama) {
      a(parama, paramD);
      return;
    } 
    if (f()) {
      c(paramD);
      return;
    } 
    c();
    this.m = SystemClock.uptimeMillis();
    this.j = null;
    b(paramD);
  }
  
  public void c(D paramD) {}
  
  protected boolean h() {
    if (this.j != null) {
      if (!this.d)
        this.g = true; 
      if (this.k != null) {
        if (this.j.m) {
          this.j.m = false;
          this.n.removeCallbacks(this.j);
        } 
        this.j = null;
        return false;
      } 
      if (this.j.m) {
        this.j.m = false;
        this.n.removeCallbacks(this.j);
        this.j = null;
        return false;
      } 
      boolean bool = this.j.a(false);
      if (bool) {
        this.k = this.j;
        r();
      } 
      this.j = null;
      return bool;
    } 
    return false;
  }
  
  protected void j() {
    super.j();
    b();
    this.j = new a(this);
    s();
  }
  
  public void r() {}
  
  void s() {
    if (this.k == null && this.j != null) {
      if (this.j.m) {
        this.j.m = false;
        this.n.removeCallbacks(this.j);
      } 
      if (this.l > 0L && SystemClock.uptimeMillis() < this.m + this.l) {
        this.j.m = true;
        this.n.postAtTime(this.j, this.m + this.l);
        return;
      } 
      this.j.a(this.i, null);
    } 
  }
  
  public abstract D t();
  
  protected D u() {
    return t();
  }
  
  final class a extends c<Void, Void, D> implements Runnable {
    private final CountDownLatch l = new CountDownLatch(1);
    
    boolean m;
    
    a(a this$0) {}
    
    protected D a(Void... param1VarArgs) {
      try {
        return (D)this.n.u();
      } catch (g g) {
        if (a())
          return null; 
        throw g;
      } 
    }
    
    protected void b(D param1D) {
      try {
        this.n.a(this, param1D);
        return;
      } finally {
        this.l.countDown();
      } 
    }
    
    protected void c(D param1D) {
      try {
        this.n.b(this, param1D);
        return;
      } finally {
        this.l.countDown();
      } 
    }
    
    public void run() {
      this.m = false;
      this.n.s();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/n/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */