package e.e.l.n;

import e.e.e.g.h;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class z implements j0<d> {
  private final Executor a;
  
  private final h b;
  
  protected z(Executor paramExecutor, h paramh) {
    this.a = paramExecutor;
    this.b = paramh;
  }
  
  protected abstract d a(c paramc);
  
  protected d a(InputStream paramInputStream, int paramInt) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: iload_2
    //   4: ifgt -> 25
    //   7: aload #5
    //   9: astore_3
    //   10: aload_0
    //   11: getfield b : Le/e/e/g/h;
    //   14: aload_1
    //   15: invokeinterface a : (Ljava/io/InputStream;)Le/e/e/g/g;
    //   20: astore #4
    //   22: goto -> 41
    //   25: aload #5
    //   27: astore_3
    //   28: aload_0
    //   29: getfield b : Le/e/e/g/h;
    //   32: aload_1
    //   33: iload_2
    //   34: invokeinterface a : (Ljava/io/InputStream;I)Le/e/e/g/g;
    //   39: astore #4
    //   41: aload #5
    //   43: astore_3
    //   44: aload #4
    //   46: invokestatic a : (Ljava/io/Closeable;)Le/e/e/h/a;
    //   49: astore #4
    //   51: aload #4
    //   53: astore_3
    //   54: new e/e/l/k/d
    //   57: dup
    //   58: aload #4
    //   60: invokespecial <init> : (Le/e/e/h/a;)V
    //   63: astore #5
    //   65: aload_1
    //   66: invokestatic a : (Ljava/io/InputStream;)V
    //   69: aload #4
    //   71: invokestatic b : (Le/e/e/h/a;)V
    //   74: aload #5
    //   76: areturn
    //   77: astore #4
    //   79: aload_1
    //   80: invokestatic a : (Ljava/io/InputStream;)V
    //   83: aload_3
    //   84: invokestatic b : (Le/e/e/h/a;)V
    //   87: aload #4
    //   89: athrow
    // Exception table:
    //   from	to	target	type
    //   10	22	77	finally
    //   28	41	77	finally
    //   44	51	77	finally
    //   54	65	77	finally
  }
  
  protected abstract String a();
  
  public void a(k<d> paramk, k0 paramk0) {
    m0 m0 = paramk0.e();
    String str = paramk0.a();
    c c = paramk0.f();
    a a = new a(this, paramk, m0, a(), str, c, m0, str);
    paramk0.a(new b(this, a));
    this.a.execute((Runnable)a);
  }
  
  protected d b(InputStream paramInputStream, int paramInt) {
    return a(paramInputStream, paramInt);
  }
  
  class a extends q0<d> {
    a(z this$0, k<d> param1k, m0 param1m01, String param1String1, String param1String2, c param1c, m0 param1m02, String param1String3) {
      super(param1k, param1m01, param1String1, param1String2);
    }
    
    protected void a(d param1d) {
      d.c(param1d);
    }
    
    protected d b() {
      d d = this.k.a(this.h);
      if (d == null) {
        this.i.a(this.j, this.k.a(), false);
        return null;
      } 
      d.B();
      this.i.a(this.j, this.k.a(), true);
      return d;
    }
  }
  
  class b extends e {
    b(z this$0, q0 param1q0) {}
    
    public void a() {
      this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */