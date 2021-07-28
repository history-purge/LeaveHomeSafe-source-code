package e.e.e.h;

import e.e.e.d.i;
import java.util.IdentityHashMap;
import java.util.Map;

public class d<T> {
  private static final Map<Object, Integer> d = new IdentityHashMap<Object, Integer>();
  
  private T a;
  
  private int b;
  
  private final c<T> c;
  
  public d(T paramT, c<T> paramc) {
    i.a(paramT);
    this.a = paramT;
    i.a(paramc);
    this.c = paramc;
    this.b = 1;
    a(paramT);
  }
  
  private static void a(Object paramObject) {
    synchronized (d) {
      Integer integer = d.get(paramObject);
      if (integer == null) {
        d.put(paramObject, Integer.valueOf(1));
      } else {
        d.put(paramObject, Integer.valueOf(integer.intValue() + 1));
      } 
      return;
    } 
  }
  
  public static boolean a(d<?> paramd) {
    return (paramd != null && paramd.d());
  }
  
  private static void b(Object paramObject) {
    synchronized (d) {
      Integer integer = d.get(paramObject);
      if (integer == null) {
        e.e.e.e.a.d("SharedReference", "No entry in sLiveObjects for value of type %s", new Object[] { paramObject.getClass() });
      } else if (integer.intValue() == 1) {
        d.remove(paramObject);
      } else {
        d.put(paramObject, Integer.valueOf(integer.intValue() - 1));
      } 
      return;
    } 
  }
  
  private int e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial f : ()V
    //   6: aload_0
    //   7: getfield b : I
    //   10: ifle -> 46
    //   13: iconst_1
    //   14: istore_2
    //   15: goto -> 18
    //   18: iload_2
    //   19: invokestatic a : (Z)V
    //   22: aload_0
    //   23: aload_0
    //   24: getfield b : I
    //   27: iconst_1
    //   28: isub
    //   29: putfield b : I
    //   32: aload_0
    //   33: getfield b : I
    //   36: istore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: iload_1
    //   40: ireturn
    //   41: astore_3
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_3
    //   45: athrow
    //   46: iconst_0
    //   47: istore_2
    //   48: goto -> 18
    // Exception table:
    //   from	to	target	type
    //   2	13	41	finally
    //   18	37	41	finally
  }
  
  private void f() {
    if (a(this))
      return; 
    throw new a();
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial f : ()V
    //   6: aload_0
    //   7: aload_0
    //   8: getfield b : I
    //   11: iconst_1
    //   12: iadd
    //   13: putfield b : I
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally
  }
  
  public void b() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial e : ()I
    //   4: ifne -> 41
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield a : Ljava/lang/Object;
    //   13: astore_1
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield a : Ljava/lang/Object;
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_0
    //   22: getfield c : Le/e/e/h/c;
    //   25: aload_1
    //   26: invokeinterface a : (Ljava/lang/Object;)V
    //   31: aload_1
    //   32: invokestatic b : (Ljava/lang/Object;)V
    //   35: return
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    //   41: return
    // Exception table:
    //   from	to	target	type
    //   9	21	36	finally
    //   37	39	36	finally
  }
  
  public T c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/lang/Object;
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
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : I
    //   6: istore_1
    //   7: iload_1
    //   8: ifle -> 16
    //   11: iconst_1
    //   12: istore_2
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_2
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_2
    //   21: ireturn
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_3
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public static class a extends RuntimeException {
    public a() {
      super("Null shared reference");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */