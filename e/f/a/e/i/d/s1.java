package e.f.a.e.i.d;

public class s1 {
  private volatile k2 a;
  
  private volatile a0 b;
  
  static {
    r0.b();
  }
  
  private final k2 b(k2 paramk2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/f/a/e/i/d/k2;
    //   4: ifnonnull -> 56
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield a : Le/f/a/e/i/d/k2;
    //   13: ifnull -> 21
    //   16: aload_0
    //   17: monitorexit
    //   18: goto -> 56
    //   21: aload_0
    //   22: aload_1
    //   23: putfield a : Le/f/a/e/i/d/k2;
    //   26: aload_0
    //   27: getstatic e/f/a/e/i/d/a0.c : Le/f/a/e/i/d/a0;
    //   30: putfield b : Le/f/a/e/i/d/a0;
    //   33: goto -> 16
    //   36: aload_0
    //   37: aload_1
    //   38: putfield a : Le/f/a/e/i/d/k2;
    //   41: aload_0
    //   42: getstatic e/f/a/e/i/d/a0.c : Le/f/a/e/i/d/a0;
    //   45: putfield b : Le/f/a/e/i/d/a0;
    //   48: goto -> 16
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    //   56: aload_0
    //   57: getfield a : Le/f/a/e/i/d/k2;
    //   60: areturn
    //   61: astore_2
    //   62: goto -> 36
    // Exception table:
    //   from	to	target	type
    //   9	16	51	finally
    //   16	18	51	finally
    //   21	33	61	e/f/a/e/i/d/l1
    //   21	33	51	finally
    //   36	48	51	finally
    //   52	54	51	finally
  }
  
  public final int a() {
    return (this.b != null) ? this.b.size() : ((this.a != null) ? this.a.f() : 0);
  }
  
  public final k2 a(k2 paramk2) {
    k2 k21 = this.a;
    this.b = null;
    this.a = paramk2;
    return k21;
  }
  
  public final a0 b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Le/f/a/e/i/d/a0;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield b : Le/f/a/e/i/d/a0;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield b : Le/f/a/e/i/d/a0;
    //   18: ifnull -> 30
    //   21: aload_0
    //   22: getfield b : Le/f/a/e/i/d/a0;
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: areturn
    //   30: aload_0
    //   31: getfield a : Le/f/a/e/i/d/k2;
    //   34: ifnonnull -> 49
    //   37: getstatic e/f/a/e/i/d/a0.c : Le/f/a/e/i/d/a0;
    //   40: astore_1
    //   41: aload_0
    //   42: aload_1
    //   43: putfield b : Le/f/a/e/i/d/a0;
    //   46: goto -> 62
    //   49: aload_0
    //   50: getfield a : Le/f/a/e/i/d/k2;
    //   53: invokeinterface c : ()Le/f/a/e/i/d/a0;
    //   58: astore_1
    //   59: goto -> 41
    //   62: aload_0
    //   63: getfield b : Le/f/a/e/i/d/a0;
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: areturn
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: goto -> 79
    //   77: aload_1
    //   78: athrow
    //   79: goto -> 77
    // Exception table:
    //   from	to	target	type
    //   14	28	71	finally
    //   30	41	71	finally
    //   41	46	71	finally
    //   49	59	71	finally
    //   62	69	71	finally
    //   72	74	71	finally
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof s1))
      return false; 
    paramObject = paramObject;
    k2 k21 = this.a;
    k2 k22 = ((s1)paramObject).a;
    return (k21 == null && k22 == null) ? b().equals(paramObject.b()) : ((k21 != null && k22 != null) ? k21.equals(k22) : ((k21 != null) ? k21.equals(paramObject.b(k21.b())) : b(k22.b()).equals(k22)));
  }
  
  public int hashCode() {
    return 1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/s1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */