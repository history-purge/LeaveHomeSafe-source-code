package e.e.l.f;

import e.e.e.h.c;
import e.e.e.h.d;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;

public class a {
  private final e.e.e.h.a.c a;
  
  public a(e.e.l.h.a parama) {
    this.a = new a(this, parama);
  }
  
  private static String b(Throwable paramThrowable) {
    if (paramThrowable == null)
      return ""; 
    StringWriter stringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(stringWriter));
    return stringWriter.toString();
  }
  
  public <U extends Closeable> e.e.e.h.a<U> a(U paramU) {
    return e.e.e.h.a.a((Closeable)paramU, this.a);
  }
  
  public <T> e.e.e.h.a<T> a(T paramT, c<T> paramc) {
    return e.e.e.h.a.a(paramT, paramc, this.a);
  }
  
  class a implements e.e.e.h.a.c {
    a(a this$0, e.e.l.h.a param1a) {}
    
    public void a(d<Object> param1d, Throwable param1Throwable) {
      this.a.a(param1d, param1Throwable);
      e.e.e.e.a.c("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", new Object[] { Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(param1d)), param1d.c().getClass().getName(), a.a(param1Throwable) });
    }
    
    public boolean a() {
      return this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */