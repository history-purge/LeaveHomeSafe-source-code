package e.g.a.s;

public class f implements b {
  boolean c;
  
  boolean d;
  
  private a e;
  
  static {
    new a();
  }
  
  public f a(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isDone : ()Z
    //   6: ifne -> 14
    //   9: aload_0
    //   10: aload_1
    //   11: putfield e : Le/g/a/s/a;
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
    //   14	16	18	finally
    //   19	21	18	finally
  }
  
  protected void a() {}
  
  protected void b() {}
  
  protected void c() {}
  
  public boolean cancel() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: ifeq -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: getfield d : Z
    //   17: ifeq -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: iconst_1
    //   23: ireturn
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield d : Z
    //   29: aload_0
    //   30: getfield e : Le/g/a/s/a;
    //   33: astore_1
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield e : Le/g/a/s/a;
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: ifnull -> 52
    //   45: aload_1
    //   46: invokeinterface cancel : ()Z
    //   51: pop
    //   52: aload_0
    //   53: invokevirtual a : ()V
    //   56: aload_0
    //   57: invokevirtual b : ()V
    //   60: iconst_1
    //   61: ireturn
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	62	finally
    //   13	22	62	finally
    //   24	41	62	finally
    //   63	65	62	finally
  }
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: ifeq -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: getfield c : Z
    //   17: ifeq -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: iconst_1
    //   23: ireturn
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield c : Z
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield e : Le/g/a/s/a;
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_0
    //   37: invokevirtual c : ()V
    //   40: aload_0
    //   41: invokevirtual b : ()V
    //   44: iconst_1
    //   45: ireturn
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	46	finally
    //   13	22	46	finally
    //   24	36	46	finally
    //   47	49	46	finally
  }
  
  public boolean isCancelled() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: ifne -> 45
    //   9: aload_0
    //   10: getfield e : Le/g/a/s/a;
    //   13: ifnull -> 40
    //   16: aload_0
    //   17: getfield e : Le/g/a/s/a;
    //   20: invokeinterface isCancelled : ()Z
    //   25: ifeq -> 40
    //   28: goto -> 45
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_1
    //   34: ireturn
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    //   40: iconst_0
    //   41: istore_1
    //   42: goto -> 31
    //   45: iconst_1
    //   46: istore_1
    //   47: goto -> 31
    // Exception table:
    //   from	to	target	type
    //   2	28	35	finally
    //   31	33	35	finally
    //   36	38	35	finally
  }
  
  public boolean isDone() {
    return this.c;
  }
  
  static final class a extends f {
    a() {
      d();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/s/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */