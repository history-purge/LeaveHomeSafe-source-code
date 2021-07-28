package e.f.a.e.i.n;

import java.util.HashMap;
import java.util.Map;

public class t2 {
  private static volatile t2 b;
  
  private static volatile t2 c;
  
  private static final t2 d = new t2(true);
  
  private final Map<a, h3.d<?, ?>> a = new HashMap<a, h3.d<?, ?>>();
  
  t2() {}
  
  private t2(boolean paramBoolean) {}
  
  public static t2 a() {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/t2.b : Le/f/a/e/i/n/t2;
    //   3: astore_0
    //   4: aload_0
    //   5: ifnonnull -> 40
    //   8: ldc e/f/a/e/i/n/t2
    //   10: monitorenter
    //   11: getstatic e/f/a/e/i/n/t2.b : Le/f/a/e/i/n/t2;
    //   14: astore_1
    //   15: aload_1
    //   16: astore_0
    //   17: aload_1
    //   18: ifnonnull -> 29
    //   21: getstatic e/f/a/e/i/n/t2.d : Le/f/a/e/i/n/t2;
    //   24: astore_0
    //   25: aload_0
    //   26: putstatic e/f/a/e/i/n/t2.b : Le/f/a/e/i/n/t2;
    //   29: ldc e/f/a/e/i/n/t2
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: astore_0
    //   35: ldc e/f/a/e/i/n/t2
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    //   40: aload_0
    //   41: areturn
    // Exception table:
    //   from	to	target	type
    //   11	15	34	finally
    //   21	29	34	finally
    //   29	32	34	finally
    //   35	38	34	finally
  }
  
  public static t2 b() {
    // Byte code:
    //   0: getstatic e/f/a/e/i/n/t2.c : Le/f/a/e/i/n/t2;
    //   3: astore_0
    //   4: aload_0
    //   5: ifnull -> 10
    //   8: aload_0
    //   9: areturn
    //   10: ldc e/f/a/e/i/n/t2
    //   12: monitorenter
    //   13: getstatic e/f/a/e/i/n/t2.c : Le/f/a/e/i/n/t2;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnull -> 26
    //   21: ldc e/f/a/e/i/n/t2
    //   23: monitorexit
    //   24: aload_0
    //   25: areturn
    //   26: ldc e/f/a/e/i/n/t2
    //   28: invokestatic a : (Ljava/lang/Class;)Le/f/a/e/i/n/t2;
    //   31: astore_0
    //   32: aload_0
    //   33: putstatic e/f/a/e/i/n/t2.c : Le/f/a/e/i/n/t2;
    //   36: ldc e/f/a/e/i/n/t2
    //   38: monitorexit
    //   39: aload_0
    //   40: areturn
    //   41: astore_0
    //   42: ldc e/f/a/e/i/n/t2
    //   44: monitorexit
    //   45: aload_0
    //   46: athrow
    // Exception table:
    //   from	to	target	type
    //   13	17	41	finally
    //   21	24	41	finally
    //   26	39	41	finally
    //   42	45	41	finally
  }
  
  public final <ContainingType extends r4> h3.d<ContainingType, ?> a(ContainingType paramContainingType, int paramInt) {
    return (h3.d<ContainingType, ?>)this.a.get(new a(paramContainingType, paramInt));
  }
  
  private static final class a {
    private final Object a;
    
    private final int b;
    
    a(Object param1Object, int param1Int) {
      this.a = param1Object;
      this.b = param1Int;
    }
    
    public final boolean equals(Object param1Object) {
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (this.a == ((a)param1Object).a && this.b == ((a)param1Object).b);
    }
    
    public final int hashCode() {
      return System.identityHashCode(this.a) * 65535 + this.b;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/t2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */