package e.f.a.c.i.x;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import e.f.a.c.h;
import e.f.a.c.i.i;
import e.f.a.c.i.n;
import e.f.a.c.i.r;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.y.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {
  private static final Logger f = Logger.getLogger(r.class.getName());
  
  private final s a;
  
  private final Executor b;
  
  private final e c;
  
  private final y d;
  
  private final b e;
  
  public c(Executor paramExecutor, e parame, s params, y paramy, b paramb) {
    this.b = paramExecutor;
    this.c = parame;
    this.a = params;
    this.d = paramy;
    this.e = paramb;
  }
  
  public void a(n paramn, i parami, h paramh) {
    this.b.execute(new a(this, paramn, paramh, parami));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */