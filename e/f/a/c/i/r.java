package e.f.a.c.i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import e.f.a.c.b;
import e.f.a.c.g;
import e.f.a.c.h;
import e.f.a.c.i.x.e;
import e.f.a.c.i.z.a;
import java.util.Collections;
import java.util.Set;

public class r implements q {
  private static volatile s e;
  
  private final a a;
  
  private final a b;
  
  private final e c;
  
  private final o d;
  
  r(a parama1, a parama2, e parame, o paramo, q paramq) {
    this.a = parama1;
    this.b = parama2;
    this.c = parame;
    this.d = paramo;
    paramq.a();
  }
  
  private i a(m paramm) {
    i.a a1 = i.i();
    a1.a(this.a.a());
    a1.b(this.b.a());
    a1.a(paramm.f());
    a1.a(new h(paramm.a(), paramm.c()));
    a1.a(paramm.b().a());
    return a1.a();
  }
  
  public static void a(Context paramContext) {
    // Byte code:
    //   0: getstatic e/f/a/c/i/r.e : Le/f/a/c/i/s;
    //   3: ifnonnull -> 46
    //   6: ldc e/f/a/c/i/r
    //   8: monitorenter
    //   9: getstatic e/f/a/c/i/r.e : Le/f/a/c/i/s;
    //   12: ifnonnull -> 36
    //   15: invokestatic c : ()Le/f/a/c/i/s$a;
    //   18: astore_1
    //   19: aload_1
    //   20: aload_0
    //   21: invokeinterface a : (Landroid/content/Context;)Le/f/a/c/i/s$a;
    //   26: pop
    //   27: aload_1
    //   28: invokeinterface a : ()Le/f/a/c/i/s;
    //   33: putstatic e/f/a/c/i/r.e : Le/f/a/c/i/s;
    //   36: ldc e/f/a/c/i/r
    //   38: monitorexit
    //   39: return
    //   40: astore_0
    //   41: ldc e/f/a/c/i/r
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    //   46: return
    // Exception table:
    //   from	to	target	type
    //   9	36	40	finally
    //   36	39	40	finally
    //   41	44	40	finally
  }
  
  public static r b() {
    s s1 = e;
    if (s1 != null)
      return s1.b(); 
    throw new IllegalStateException("Not initialized!");
  }
  
  private static Set<b> b(f paramf) {
    return (paramf instanceof g) ? Collections.unmodifiableSet(((g)paramf).a()) : Collections.singleton(b.a("proto"));
  }
  
  public o a() {
    return this.d;
  }
  
  public g a(f paramf) {
    Set<b> set = b(paramf);
    n.a a1 = n.d();
    a1.a(paramf.getName());
    a1.a(paramf.b());
    return new o(set, a1.a(), this);
  }
  
  public void a(m paramm, h paramh) {
    this.c.a(paramm.e().a(paramm.b().c()), a(paramm), paramh);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */