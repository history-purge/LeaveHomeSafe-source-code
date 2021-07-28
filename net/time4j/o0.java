package net.time4j;

import net.time4j.c1.c;
import net.time4j.c1.e;
import net.time4j.g1.d;
import net.time4j.g1.e;
import net.time4j.g1.f;

public final class o0 implements e<a0> {
  private static final e c;
  
  private static final boolean d;
  
  public static final o0 e;
  
  private final boolean a;
  
  private final long b;
  
  static {
    // Byte code:
    //   0: ldc 'java.vm.name'
    //   2: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_1
    //   6: invokestatic c : ()Lnet/time4j/c1/d;
    //   9: ldc net/time4j/g1/e
    //   11: invokevirtual a : (Ljava/lang/Class;)Ljava/lang/Iterable;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 55
    //   29: aload_2
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast net/time4j/g1/e
    //   38: astore_0
    //   39: aload_1
    //   40: aload_0
    //   41: invokeinterface b : ()Ljava/lang/String;
    //   46: invokevirtual equals : (Ljava/lang/Object;)Z
    //   49: ifeq -> 20
    //   52: goto -> 57
    //   55: aconst_null
    //   56: astore_0
    //   57: aload_0
    //   58: astore_1
    //   59: aload_0
    //   60: ifnonnull -> 72
    //   63: new net/time4j/o0$b
    //   66: dup
    //   67: aconst_null
    //   68: invokespecial <init> : (Lnet/time4j/o0$a;)V
    //   71: astore_1
    //   72: aload_1
    //   73: putstatic net/time4j/o0.c : Lnet/time4j/g1/e;
    //   76: ldc 'net.time4j.systemclock.nanoTime'
    //   78: invokestatic getBoolean : (Ljava/lang/String;)Z
    //   81: putstatic net/time4j/o0.d : Z
    //   84: new net/time4j/o0
    //   87: dup
    //   88: iconst_0
    //   89: invokestatic b : ()J
    //   92: invokespecial <init> : (ZJ)V
    //   95: putstatic net/time4j/o0.e : Lnet/time4j/o0;
    //   98: new net/time4j/o0
    //   101: dup
    //   102: iconst_1
    //   103: invokestatic b : ()J
    //   106: invokespecial <init> : (ZJ)V
    //   109: pop
    //   110: return
  }
  
  private o0(boolean paramBoolean, long paramLong) {
    this.a = paramBoolean;
    this.b = paramLong;
  }
  
  private static long b() {
    long l2 = System.currentTimeMillis();
    long l1 = 0L;
    int i = 0;
    while (i < 10) {
      if (d) {
        l1 = System.nanoTime();
      } else {
        l1 = c.a();
      } 
      long l = System.currentTimeMillis();
      if (l2 == l)
        break; 
      i++;
      l2 = l;
    } 
    return c.c(c.b(d.k().a(c.a(l2, 1000)), 1000000000L) + (c.b(l2, 1000) * 1000000), l1);
  }
  
  public static a0 c() {
    return e.a();
  }
  
  private long d() {
    long l;
    if (d) {
      l = System.nanoTime();
    } else {
      l = c.a();
    } 
    return c.a(l, this.b);
  }
  
  public a0 a() {
    if ((this.a || d) && d.k().h()) {
      long l4 = d();
      long l3 = c.a(l4, 1000000000);
      int j = c.b(l4, 1000000000);
      f f1 = f.d;
      return a0.a(l3, j, f1);
    } 
    long l2 = System.currentTimeMillis();
    long l1 = c.a(l2, 1000);
    int i = c.b(l2, 1000) * 1000000;
    f f = f.c;
    return a0.a(l1, i, f);
  }
  
  private static class b implements e {
    private b() {}
    
    public long a() {
      return System.nanoTime();
    }
    
    public String b() {
      return "";
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */