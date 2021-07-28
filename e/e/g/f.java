package e.e.g;

import e.e.e.d.h;
import e.e.e.d.i;
import e.e.e.d.l;
import java.util.List;
import java.util.concurrent.Executor;

public class f<T> implements l<c<T>> {
  private final List<l<c<T>>> a;
  
  private f(List<l<c<T>>> paramList) {
    i.a(paramList.isEmpty() ^ true, "List of suppliers is empty!");
    this.a = paramList;
  }
  
  public static <T> f<T> a(List<l<c<T>>> paramList) {
    return new f<T>(paramList);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof f))
      return false; 
    paramObject = paramObject;
    return h.a(this.a, ((f)paramObject).a);
  }
  
  public c<T> get() {
    return new b(this);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    h.b b = h.a(this);
    b.a("list", this.a);
    return b.toString();
  }
  
  private class b extends a<T> {
    private int g = 0;
    
    private c<T> h = null;
    
    private c<T> i = null;
    
    public b(f this$0) {
      if (!l())
        a(new RuntimeException("No data source supplier or supplier returned null.")); 
    }
    
    private void a(c<T> param1c, boolean param1Boolean) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: aload_0
      //   4: getfield h : Le/e/g/c;
      //   7: if_acmpne -> 55
      //   10: aload_1
      //   11: aload_0
      //   12: getfield i : Le/e/g/c;
      //   15: if_acmpne -> 21
      //   18: goto -> 55
      //   21: aload_0
      //   22: getfield i : Le/e/g/c;
      //   25: ifnull -> 35
      //   28: iload_2
      //   29: ifeq -> 63
      //   32: goto -> 35
      //   35: aload_0
      //   36: getfield i : Le/e/g/c;
      //   39: astore_3
      //   40: aload_0
      //   41: aload_1
      //   42: putfield i : Le/e/g/c;
      //   45: aload_3
      //   46: astore_1
      //   47: aload_0
      //   48: monitorexit
      //   49: aload_0
      //   50: aload_1
      //   51: invokespecial b : (Le/e/g/c;)V
      //   54: return
      //   55: aload_0
      //   56: monitorexit
      //   57: return
      //   58: astore_1
      //   59: aload_0
      //   60: monitorexit
      //   61: aload_1
      //   62: athrow
      //   63: aconst_null
      //   64: astore_1
      //   65: goto -> 47
      // Exception table:
      //   from	to	target	type
      //   2	18	58	finally
      //   21	28	58	finally
      //   35	45	58	finally
      //   47	49	58	finally
      //   55	57	58	finally
      //   59	61	58	finally
    }
    
    private boolean a(c<T> param1c) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual h : ()Z
      //   6: ifne -> 31
      //   9: aload_1
      //   10: aload_0
      //   11: getfield h : Le/e/g/c;
      //   14: if_acmpeq -> 20
      //   17: goto -> 31
      //   20: aload_0
      //   21: aconst_null
      //   22: putfield h : Le/e/g/c;
      //   25: iconst_1
      //   26: istore_2
      //   27: aload_0
      //   28: monitorexit
      //   29: iload_2
      //   30: ireturn
      //   31: iconst_0
      //   32: istore_2
      //   33: goto -> 27
      //   36: astore_1
      //   37: aload_0
      //   38: monitorexit
      //   39: goto -> 44
      //   42: aload_1
      //   43: athrow
      //   44: goto -> 42
      // Exception table:
      //   from	to	target	type
      //   2	17	36	finally
      //   20	25	36	finally
    }
    
    private void b(c<T> param1c) {
      if (param1c != null)
        param1c.close(); 
    }
    
    private void c(c<T> param1c) {
      if (!a(param1c))
        return; 
      if (param1c != j())
        b(param1c); 
      if (!l())
        a(param1c.e()); 
    }
    
    private void d(c<T> param1c) {
      a(param1c, param1c.d());
      if (param1c == j())
        a((T)null, param1c.d()); 
    }
    
    private boolean e(c<T> param1c) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual h : ()Z
      //   6: istore_2
      //   7: iload_2
      //   8: ifeq -> 17
      //   11: iconst_0
      //   12: istore_2
      //   13: aload_0
      //   14: monitorexit
      //   15: iload_2
      //   16: ireturn
      //   17: aload_0
      //   18: aload_1
      //   19: putfield h : Le/e/g/c;
      //   22: iconst_1
      //   23: istore_2
      //   24: goto -> 13
      //   27: astore_1
      //   28: aload_0
      //   29: monitorexit
      //   30: goto -> 35
      //   33: aload_1
      //   34: athrow
      //   35: goto -> 33
      // Exception table:
      //   from	to	target	type
      //   2	7	27	finally
      //   17	22	27	finally
    }
    
    private c<T> j() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield i : Le/e/g/c;
      //   6: astore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: aload_1
      //   10: areturn
      //   11: astore_1
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_1
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    private l<c<T>> k() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual h : ()Z
      //   6: ifne -> 63
      //   9: aload_0
      //   10: getfield g : I
      //   13: aload_0
      //   14: getfield j : Le/e/g/f;
      //   17: invokestatic a : (Le/e/g/f;)Ljava/util/List;
      //   20: invokeinterface size : ()I
      //   25: if_icmpge -> 63
      //   28: aload_0
      //   29: getfield j : Le/e/g/f;
      //   32: invokestatic a : (Le/e/g/f;)Ljava/util/List;
      //   35: astore_2
      //   36: aload_0
      //   37: getfield g : I
      //   40: istore_1
      //   41: aload_0
      //   42: iload_1
      //   43: iconst_1
      //   44: iadd
      //   45: putfield g : I
      //   48: aload_2
      //   49: iload_1
      //   50: invokeinterface get : (I)Ljava/lang/Object;
      //   55: checkcast e/e/e/d/l
      //   58: astore_2
      //   59: aload_0
      //   60: monitorexit
      //   61: aload_2
      //   62: areturn
      //   63: aload_0
      //   64: monitorexit
      //   65: aconst_null
      //   66: areturn
      //   67: astore_2
      //   68: aload_0
      //   69: monitorexit
      //   70: aload_2
      //   71: athrow
      // Exception table:
      //   from	to	target	type
      //   2	59	67	finally
    }
    
    private boolean l() {
      l<c<T>> l = k();
      if (l != null) {
        c c1 = (c)l.get();
      } else {
        l = null;
      } 
      if (e((c)l) && l != null) {
        l.a(new a(null), (Executor)e.e.e.b.a.a());
        return true;
      } 
      b((c)l);
      return false;
    }
    
    public T a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial j : ()Le/e/g/c;
      //   6: astore_1
      //   7: aload_1
      //   8: ifnull -> 21
      //   11: aload_1
      //   12: invokeinterface a : ()Ljava/lang/Object;
      //   17: astore_1
      //   18: goto -> 23
      //   21: aconst_null
      //   22: astore_1
      //   23: aload_0
      //   24: monitorexit
      //   25: aload_1
      //   26: areturn
      //   27: astore_1
      //   28: aload_0
      //   29: monitorexit
      //   30: aload_1
      //   31: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	27	finally
      //   11	18	27	finally
    }
    
    public boolean c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial j : ()Le/e/g/c;
      //   6: astore_2
      //   7: aload_2
      //   8: ifnull -> 27
      //   11: aload_2
      //   12: invokeinterface c : ()Z
      //   17: istore_1
      //   18: iload_1
      //   19: ifeq -> 27
      //   22: iconst_1
      //   23: istore_1
      //   24: goto -> 29
      //   27: iconst_0
      //   28: istore_1
      //   29: aload_0
      //   30: monitorexit
      //   31: iload_1
      //   32: ireturn
      //   33: astore_2
      //   34: aload_0
      //   35: monitorexit
      //   36: aload_2
      //   37: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	33	finally
      //   11	18	33	finally
    }
    
    public boolean close() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial close : ()Z
      //   6: ifne -> 13
      //   9: aload_0
      //   10: monitorexit
      //   11: iconst_0
      //   12: ireturn
      //   13: aload_0
      //   14: getfield h : Le/e/g/c;
      //   17: astore_1
      //   18: aload_0
      //   19: aconst_null
      //   20: putfield h : Le/e/g/c;
      //   23: aload_0
      //   24: getfield i : Le/e/g/c;
      //   27: astore_2
      //   28: aload_0
      //   29: aconst_null
      //   30: putfield i : Le/e/g/c;
      //   33: aload_0
      //   34: monitorexit
      //   35: aload_0
      //   36: aload_2
      //   37: invokespecial b : (Le/e/g/c;)V
      //   40: aload_0
      //   41: aload_1
      //   42: invokespecial b : (Le/e/g/c;)V
      //   45: iconst_1
      //   46: ireturn
      //   47: astore_1
      //   48: aload_0
      //   49: monitorexit
      //   50: aload_1
      //   51: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	47	finally
      //   13	35	47	finally
      //   48	50	47	finally
    }
    
    private class a implements e<T> {
      private a(f.b this$0) {}
      
      public void a(c<T> param2c) {}
      
      public void b(c<T> param2c) {
        if (param2c.c()) {
          f.b.b(this.a, param2c);
          return;
        } 
        if (param2c.d())
          f.b.a(this.a, param2c); 
      }
      
      public void c(c<T> param2c) {
        f.b.a(this.a, param2c);
      }
      
      public void d(c<T> param2c) {
        float f = this.a.f();
        this.a.a(Math.max(f, param2c.f()));
      }
    }
  }
  
  private class a implements e<T> {
    private a(f this$0) {}
    
    public void a(c<T> param1c) {}
    
    public void b(c<T> param1c) {
      if (param1c.c()) {
        f.b.b(this.a, param1c);
        return;
      } 
      if (param1c.d())
        f.b.a(this.a, param1c); 
    }
    
    public void c(c<T> param1c) {
      f.b.a(this.a, param1c);
    }
    
    public void d(c<T> param1c) {
      float f = this.a.f();
      this.a.a(Math.max(f, param1c.f()));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */