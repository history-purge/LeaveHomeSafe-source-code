package e.f.a.e.i.n;

public class z3 {
  private volatile r4 a;
  
  private volatile z1 b;
  
  static {
    t2.a();
  }
  
  private final r4 b(r4 paramr4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/f/a/e/i/n/r4;
    //   4: ifnonnull -> 56
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield a : Le/f/a/e/i/n/r4;
    //   13: ifnull -> 21
    //   16: aload_0
    //   17: monitorexit
    //   18: goto -> 56
    //   21: aload_0
    //   22: aload_1
    //   23: putfield a : Le/f/a/e/i/n/r4;
    //   26: aload_0
    //   27: getstatic e/f/a/e/i/n/z1.c : Le/f/a/e/i/n/z1;
    //   30: putfield b : Le/f/a/e/i/n/z1;
    //   33: goto -> 16
    //   36: aload_0
    //   37: aload_1
    //   38: putfield a : Le/f/a/e/i/n/r4;
    //   41: aload_0
    //   42: getstatic e/f/a/e/i/n/z1.c : Le/f/a/e/i/n/z1;
    //   45: putfield b : Le/f/a/e/i/n/z1;
    //   48: goto -> 16
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    //   56: aload_0
    //   57: getfield a : Le/f/a/e/i/n/r4;
    //   60: areturn
    //   61: astore_2
    //   62: goto -> 36
    // Exception table:
    //   from	to	target	type
    //   9	16	51	finally
    //   16	18	51	finally
    //   21	33	61	e/f/a/e/i/n/q3
    //   21	33	51	finally
    //   36	48	51	finally
    //   52	54	51	finally
  }
  
  public final int a() {
    return (this.b != null) ? this.b.zza() : ((this.a != null) ? this.a.f() : 0);
  }
  
  public final r4 a(r4 paramr4) {
    r4 r41 = this.a;
    this.b = null;
    this.a = paramr4;
    return r41;
  }
  
  public final z1 b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Le/f/a/e/i/n/z1;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield b : Le/f/a/e/i/n/z1;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield b : Le/f/a/e/i/n/z1;
    //   18: ifnull -> 30
    //   21: aload_0
    //   22: getfield b : Le/f/a/e/i/n/z1;
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: areturn
    //   30: aload_0
    //   31: getfield a : Le/f/a/e/i/n/r4;
    //   34: ifnonnull -> 49
    //   37: getstatic e/f/a/e/i/n/z1.c : Le/f/a/e/i/n/z1;
    //   40: astore_1
    //   41: aload_0
    //   42: aload_1
    //   43: putfield b : Le/f/a/e/i/n/z1;
    //   46: goto -> 62
    //   49: aload_0
    //   50: getfield a : Le/f/a/e/i/n/r4;
    //   53: invokeinterface g : ()Le/f/a/e/i/n/z1;
    //   58: astore_1
    //   59: goto -> 41
    //   62: aload_0
    //   63: getfield b : Le/f/a/e/i/n/z1;
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
    if (!(paramObject instanceof z3))
      return false; 
    paramObject = paramObject;
    r4 r41 = this.a;
    r4 r42 = ((z3)paramObject).a;
    return (r41 == null && r42 == null) ? b().equals(paramObject.b()) : ((r41 != null && r42 != null) ? r41.equals(r42) : ((r41 != null) ? r41.equals(paramObject.b(r41.c())) : b(r42.c()).equals(r42)));
  }
  
  public int hashCode() {
    return 1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/z3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */