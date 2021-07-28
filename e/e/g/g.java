package e.e.g;

import e.e.e.d.h;
import e.e.e.d.i;
import e.e.e.d.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class g<T> implements l<c<T>> {
  private final List<l<c<T>>> a;
  
  private final boolean b;
  
  private g(List<l<c<T>>> paramList, boolean paramBoolean) {
    i.a(paramList.isEmpty() ^ true, "List of suppliers is empty!");
    this.a = paramList;
    this.b = paramBoolean;
  }
  
  public static <T> g<T> a(List<l<c<T>>> paramList, boolean paramBoolean) {
    return new g<T>(paramList, paramBoolean);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof g))
      return false; 
    paramObject = paramObject;
    return h.a(this.a, ((g)paramObject).a);
  }
  
  public c<T> get() {
    return new a(this);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    h.b b = h.a(this);
    b.a("list", this.a);
    return b.toString();
  }
  
  private class a extends a<T> {
    private ArrayList<c<T>> g;
    
    private int h;
    
    private int i;
    
    private AtomicInteger j;
    
    private Throwable k;
    
    public a(g this$0) {
      if (!g.a(this$0))
        j(); 
    }
    
    private c<T> a(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield g : Ljava/util/ArrayList;
      //   6: astore #4
      //   8: aconst_null
      //   9: astore_3
      //   10: aload_3
      //   11: astore_2
      //   12: aload #4
      //   14: ifnull -> 43
      //   17: aload_3
      //   18: astore_2
      //   19: iload_1
      //   20: aload_0
      //   21: getfield g : Ljava/util/ArrayList;
      //   24: invokevirtual size : ()I
      //   27: if_icmpge -> 43
      //   30: aload_0
      //   31: getfield g : Ljava/util/ArrayList;
      //   34: iload_1
      //   35: aconst_null
      //   36: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
      //   39: checkcast e/e/g/c
      //   42: astore_2
      //   43: aload_0
      //   44: monitorexit
      //   45: aload_2
      //   46: areturn
      //   47: astore_2
      //   48: aload_0
      //   49: monitorexit
      //   50: aload_2
      //   51: athrow
      // Exception table:
      //   from	to	target	type
      //   2	8	47	finally
      //   19	43	47	finally
    }
    
    private void a(int param1Int, c<T> param1c) {
      a(c(param1Int, param1c));
      if (param1Int == 0)
        this.k = param1c.e(); 
      l();
    }
    
    private void a(int param1Int, c<T> param1c, boolean param1Boolean) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield h : I
      //   6: istore #4
      //   8: aload_0
      //   9: getfield h : I
      //   12: istore #5
      //   14: aload_2
      //   15: aload_0
      //   16: iload_1
      //   17: invokespecial b : (I)Le/e/g/c;
      //   20: if_acmpne -> 89
      //   23: iload_1
      //   24: aload_0
      //   25: getfield h : I
      //   28: if_icmpne -> 34
      //   31: goto -> 89
      //   34: aload_0
      //   35: invokespecial k : ()Le/e/g/c;
      //   38: ifnull -> 56
      //   41: iload_3
      //   42: ifeq -> 103
      //   45: iload_1
      //   46: aload_0
      //   47: getfield h : I
      //   50: if_icmpge -> 103
      //   53: goto -> 56
      //   56: aload_0
      //   57: iload_1
      //   58: putfield h : I
      //   61: aload_0
      //   62: monitorexit
      //   63: iload #4
      //   65: iload_1
      //   66: if_icmple -> 88
      //   69: aload_0
      //   70: aload_0
      //   71: iload #4
      //   73: invokespecial a : (I)Le/e/g/c;
      //   76: invokespecial a : (Le/e/g/c;)V
      //   79: iload #4
      //   81: iconst_1
      //   82: isub
      //   83: istore #4
      //   85: goto -> 63
      //   88: return
      //   89: aload_0
      //   90: monitorexit
      //   91: return
      //   92: astore_2
      //   93: aload_0
      //   94: monitorexit
      //   95: goto -> 100
      //   98: aload_2
      //   99: athrow
      //   100: goto -> 98
      //   103: iload #5
      //   105: istore_1
      //   106: goto -> 61
      // Exception table:
      //   from	to	target	type
      //   2	31	92	finally
      //   34	41	92	finally
      //   45	53	92	finally
      //   56	61	92	finally
      //   61	63	92	finally
      //   89	91	92	finally
      //   93	95	92	finally
    }
    
    private void a(c<T> param1c) {
      if (param1c != null)
        param1c.close(); 
    }
    
    private c<T> b(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield g : Ljava/util/ArrayList;
      //   6: ifnull -> 35
      //   9: iload_1
      //   10: aload_0
      //   11: getfield g : Ljava/util/ArrayList;
      //   14: invokevirtual size : ()I
      //   17: if_icmpge -> 35
      //   20: aload_0
      //   21: getfield g : Ljava/util/ArrayList;
      //   24: iload_1
      //   25: invokevirtual get : (I)Ljava/lang/Object;
      //   28: checkcast e/e/g/c
      //   31: astore_2
      //   32: goto -> 37
      //   35: aconst_null
      //   36: astore_2
      //   37: aload_0
      //   38: monitorexit
      //   39: aload_2
      //   40: areturn
      //   41: astore_2
      //   42: aload_0
      //   43: monitorexit
      //   44: aload_2
      //   45: athrow
      // Exception table:
      //   from	to	target	type
      //   2	32	41	finally
    }
    
    private void b(int param1Int, c<T> param1c) {
      a(param1Int, param1c, param1c.d());
      if (param1c == k()) {
        boolean bool;
        if (param1Int == 0 && param1c.d()) {
          bool = true;
        } else {
          bool = false;
        } 
        a((T)null, bool);
      } 
      l();
    }
    
    private c<T> c(int param1Int, c<T> param1c) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial k : ()Le/e/g/c;
      //   6: astore_3
      //   7: aload_2
      //   8: aload_3
      //   9: if_acmpne -> 16
      //   12: aload_0
      //   13: monitorexit
      //   14: aconst_null
      //   15: areturn
      //   16: aload_2
      //   17: aload_0
      //   18: iload_1
      //   19: invokespecial b : (I)Le/e/g/c;
      //   22: if_acmpne -> 35
      //   25: aload_0
      //   26: iload_1
      //   27: invokespecial a : (I)Le/e/g/c;
      //   30: astore_2
      //   31: aload_0
      //   32: monitorexit
      //   33: aload_2
      //   34: areturn
      //   35: aload_0
      //   36: monitorexit
      //   37: aload_2
      //   38: areturn
      //   39: astore_2
      //   40: aload_0
      //   41: monitorexit
      //   42: aload_2
      //   43: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	39	finally
      //   16	31	39	finally
    }
    
    private void j() {
      // Byte code:
      //   0: aload_0
      //   1: getfield j : Ljava/util/concurrent/atomic/AtomicInteger;
      //   4: ifnull -> 8
      //   7: return
      //   8: aload_0
      //   9: monitorenter
      //   10: aload_0
      //   11: getfield j : Ljava/util/concurrent/atomic/AtomicInteger;
      //   14: ifnonnull -> 135
      //   17: iconst_0
      //   18: istore_1
      //   19: aload_0
      //   20: new java/util/concurrent/atomic/AtomicInteger
      //   23: dup
      //   24: iconst_0
      //   25: invokespecial <init> : (I)V
      //   28: putfield j : Ljava/util/concurrent/atomic/AtomicInteger;
      //   31: aload_0
      //   32: getfield l : Le/e/g/g;
      //   35: invokestatic b : (Le/e/g/g;)Ljava/util/List;
      //   38: invokeinterface size : ()I
      //   43: istore_2
      //   44: aload_0
      //   45: iload_2
      //   46: putfield i : I
      //   49: aload_0
      //   50: iload_2
      //   51: putfield h : I
      //   54: aload_0
      //   55: new java/util/ArrayList
      //   58: dup
      //   59: iload_2
      //   60: invokespecial <init> : (I)V
      //   63: putfield g : Ljava/util/ArrayList;
      //   66: iload_1
      //   67: iload_2
      //   68: if_icmpge -> 135
      //   71: aload_0
      //   72: getfield l : Le/e/g/g;
      //   75: invokestatic b : (Le/e/g/g;)Ljava/util/List;
      //   78: iload_1
      //   79: invokeinterface get : (I)Ljava/lang/Object;
      //   84: checkcast e/e/e/d/l
      //   87: invokeinterface get : ()Ljava/lang/Object;
      //   92: checkcast e/e/g/c
      //   95: astore_3
      //   96: aload_0
      //   97: getfield g : Ljava/util/ArrayList;
      //   100: aload_3
      //   101: invokevirtual add : (Ljava/lang/Object;)Z
      //   104: pop
      //   105: aload_3
      //   106: new e/e/g/g$a$a
      //   109: dup
      //   110: aload_0
      //   111: iload_1
      //   112: invokespecial <init> : (Le/e/g/g$a;I)V
      //   115: invokestatic a : ()Le/e/e/b/a;
      //   118: invokeinterface a : (Le/e/g/e;Ljava/util/concurrent/Executor;)V
      //   123: aload_3
      //   124: invokeinterface c : ()Z
      //   129: ifeq -> 149
      //   132: goto -> 135
      //   135: aload_0
      //   136: monitorexit
      //   137: return
      //   138: astore_3
      //   139: aload_0
      //   140: monitorexit
      //   141: goto -> 146
      //   144: aload_3
      //   145: athrow
      //   146: goto -> 144
      //   149: iload_1
      //   150: iconst_1
      //   151: iadd
      //   152: istore_1
      //   153: goto -> 66
      // Exception table:
      //   from	to	target	type
      //   10	17	138	finally
      //   19	66	138	finally
      //   71	132	138	finally
      //   135	137	138	finally
      //   139	141	138	finally
    }
    
    private c<T> k() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aload_0
      //   4: getfield h : I
      //   7: invokespecial b : (I)Le/e/g/c;
      //   10: astore_1
      //   11: aload_0
      //   12: monitorexit
      //   13: aload_1
      //   14: areturn
      //   15: astore_1
      //   16: aload_0
      //   17: monitorexit
      //   18: aload_1
      //   19: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	15	finally
    }
    
    private void l() {
      if (this.j.incrementAndGet() == this.i) {
        Throwable throwable = this.k;
        if (throwable != null)
          a(throwable); 
      } 
    }
    
    public T a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield l : Le/e/g/g;
      //   6: invokestatic a : (Le/e/g/g;)Z
      //   9: ifeq -> 16
      //   12: aload_0
      //   13: invokespecial j : ()V
      //   16: aload_0
      //   17: invokespecial k : ()Le/e/g/c;
      //   20: astore_1
      //   21: aload_1
      //   22: ifnull -> 35
      //   25: aload_1
      //   26: invokeinterface a : ()Ljava/lang/Object;
      //   31: astore_1
      //   32: goto -> 37
      //   35: aconst_null
      //   36: astore_1
      //   37: aload_0
      //   38: monitorexit
      //   39: aload_1
      //   40: areturn
      //   41: astore_1
      //   42: aload_0
      //   43: monitorexit
      //   44: aload_1
      //   45: athrow
      // Exception table:
      //   from	to	target	type
      //   2	16	41	finally
      //   16	21	41	finally
      //   25	32	41	finally
    }
    
    public boolean c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield l : Le/e/g/g;
      //   6: invokestatic a : (Le/e/g/g;)Z
      //   9: ifeq -> 16
      //   12: aload_0
      //   13: invokespecial j : ()V
      //   16: aload_0
      //   17: invokespecial k : ()Le/e/g/c;
      //   20: astore_2
      //   21: aload_2
      //   22: ifnull -> 41
      //   25: aload_2
      //   26: invokeinterface c : ()Z
      //   31: istore_1
      //   32: iload_1
      //   33: ifeq -> 41
      //   36: iconst_1
      //   37: istore_1
      //   38: goto -> 43
      //   41: iconst_0
      //   42: istore_1
      //   43: aload_0
      //   44: monitorexit
      //   45: iload_1
      //   46: ireturn
      //   47: astore_2
      //   48: aload_0
      //   49: monitorexit
      //   50: aload_2
      //   51: athrow
      // Exception table:
      //   from	to	target	type
      //   2	16	47	finally
      //   16	21	47	finally
      //   25	32	47	finally
    }
    
    public boolean close() {
      // Byte code:
      //   0: aload_0
      //   1: getfield l : Le/e/g/g;
      //   4: invokestatic a : (Le/e/g/g;)Z
      //   7: ifeq -> 14
      //   10: aload_0
      //   11: invokespecial j : ()V
      //   14: aload_0
      //   15: monitorenter
      //   16: aload_0
      //   17: invokespecial close : ()Z
      //   20: istore_2
      //   21: iconst_0
      //   22: istore_1
      //   23: iload_2
      //   24: ifne -> 31
      //   27: aload_0
      //   28: monitorexit
      //   29: iconst_0
      //   30: ireturn
      //   31: aload_0
      //   32: getfield g : Ljava/util/ArrayList;
      //   35: astore_3
      //   36: aload_0
      //   37: aconst_null
      //   38: putfield g : Ljava/util/ArrayList;
      //   41: aload_0
      //   42: monitorexit
      //   43: aload_3
      //   44: ifnull -> 74
      //   47: iload_1
      //   48: aload_3
      //   49: invokevirtual size : ()I
      //   52: if_icmpge -> 74
      //   55: aload_0
      //   56: aload_3
      //   57: iload_1
      //   58: invokevirtual get : (I)Ljava/lang/Object;
      //   61: checkcast e/e/g/c
      //   64: invokespecial a : (Le/e/g/c;)V
      //   67: iload_1
      //   68: iconst_1
      //   69: iadd
      //   70: istore_1
      //   71: goto -> 47
      //   74: iconst_1
      //   75: ireturn
      //   76: astore_3
      //   77: aload_0
      //   78: monitorexit
      //   79: goto -> 84
      //   82: aload_3
      //   83: athrow
      //   84: goto -> 82
      // Exception table:
      //   from	to	target	type
      //   16	21	76	finally
      //   27	29	76	finally
      //   31	43	76	finally
      //   77	79	76	finally
    }
    
    private class a implements e<T> {
      private int a;
      
      public a(g.a this$0, int param2Int) {
        this.a = param2Int;
      }
      
      public void a(c<T> param2c) {}
      
      public void b(c<T> param2c) {
        if (param2c.c()) {
          g.a.a(this.b, this.a, param2c);
          return;
        } 
        if (param2c.d())
          g.a.b(this.b, this.a, param2c); 
      }
      
      public void c(c<T> param2c) {
        g.a.b(this.b, this.a, param2c);
      }
      
      public void d(c<T> param2c) {
        if (this.a == 0)
          this.b.a(param2c.f()); 
      }
    }
  }
  
  private class a implements e<T> {
    private int a;
    
    public a(g this$0, int param1Int) {
      this.a = param1Int;
    }
    
    public void a(c<T> param1c) {}
    
    public void b(c<T> param1c) {
      if (param1c.c()) {
        g.a.a(this.b, this.a, param1c);
        return;
      } 
      if (param1c.d())
        g.a.b(this.b, this.a, param1c); 
    }
    
    public void c(c<T> param1c) {
      g.a.b(this.b, this.a, param1c);
    }
    
    public void d(c<T> param1c) {
      if (this.a == 0)
        this.b.a(param1c.f()); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */