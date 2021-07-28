package net.time4j.e1.a0;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.time4j.a0;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.t;
import net.time4j.d1.x;

final class f<V> implements h<V> {
  private static final t<o, Void> j = new a();
  
  private final p<V> c;
  
  private final e<V> d;
  
  private final d<V> e;
  
  private final boolean f;
  
  private boolean g;
  
  private boolean h;
  
  private boolean i;
  
  f(p<V> paramp, e<V> parame, d<V> paramd) {
    this(paramp, parame, paramd, false, false, false);
  }
  
  private f(p<V> paramp, e<V> parame, d<V> paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramp != null) {
      if (parame != null) {
        if (paramd != null) {
          boolean bool;
          this.c = paramp;
          this.d = parame;
          this.e = paramd;
          if (parame instanceof c && paramp.getType() == a0.class) {
            bool = true;
          } else {
            bool = false;
          } 
          this.f = bool;
          this.g = paramBoolean1;
          this.h = paramBoolean2;
          this.i = paramBoolean3;
          return;
        } 
        throw new NullPointerException("Missing parser.");
      } 
      throw new NullPointerException("Missing printer.");
    } 
    throw new NullPointerException("Missing element.");
  }
  
  private static Map<p<?>, Object> a(Map<p<?>, Object> paramMap, c<?> paramc) {
    x<?> x = paramc.c();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (p<?> p1 : paramMap.keySet()) {
      if (x.d(p1))
        hashMap.put(p1, paramMap.get(p1)); 
    } 
    return (Map)hashMap;
  }
  
  private static <T> Set<g> a(c<T> paramc, Object paramObject, StringBuilder paramStringBuilder, d paramd) {
    return paramc.a(paramc.c().e().cast(paramObject), paramStringBuilder, paramd);
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    d d1 = paramd;
    if (paramBoolean) {
      d1 = paramd;
      if (this.g)
        d1 = ((c)c.class.cast(this.d)).a(); 
    } 
    if (this.f && paramo instanceof net.time4j.a1 && paramSet == null) {
      ((c)this.d).a(paramo, paramAppendable, d1, false);
      return Integer.MAX_VALUE;
    } 
    Object object = paramo.e(this.c);
    StringBuilder stringBuilder = new StringBuilder();
    if (paramAppendable instanceof CharSequence && paramSet != null) {
      int i = ((CharSequence)paramAppendable).length();
      e<V> e1 = this.d;
      if (e1 instanceof c) {
        Set<g> set = a(c.class.cast(e1), object, stringBuilder, d1);
        object = new LinkedHashSet();
        for (g g : set)
          object.add(new g(g.a(), g.c() + i, g.b() + i)); 
        paramSet.addAll((Collection<? extends g>)object);
      } else {
        g.a(object, stringBuilder, d1, j);
      } 
      paramSet.add(new g(this.c, i, stringBuilder.length() + i));
    } else {
      this.d.a((V)object, stringBuilder, d1, j);
    } 
    paramAppendable.append(stringBuilder);
    return stringBuilder.length();
  }
  
  public h<V> a(p<V> paramp) {
    return (this.c == paramp) ? this : new f(paramp, this.d, this.e);
  }
  
  public h<V> a(c<?> paramc, d paramd, int paramInt) {
    boolean bool;
    if (paramc.f() && this.c.getType().equals(paramc.c().e())) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramd instanceof b) {
      d<V> d1;
      boolean bool1;
      boolean bool2;
      e<V> e2 = this.d;
      d<V> d2 = this.e;
      Map<p<?>, Object> map = paramc.d();
      paramd = paramd;
      e<V> e1 = this.d;
      if (e1 instanceof c) {
        e1 = c.class.cast(e1);
        e1 = e1.a(a(map, (c<?>)e1), (b)paramd);
        bool1 = true;
      } else {
        e1 = e2;
        bool1 = false;
      } 
      d<V> d3 = this.e;
      if (d3 instanceof c) {
        d2 = c.class.cast(d3);
        d1 = d2.a(a(map, (c<?>)d2), (b)paramd);
        bool2 = true;
      } else {
        d1 = d2;
        bool2 = false;
      } 
      return new f(this.c, e1, d1, bool1, bool2, bool);
    } 
    return (this.g || this.h) ? new f(this.c, this.d, this.e) : this;
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual f : ()I
    //   4: istore #6
    //   6: aload_3
    //   7: astore #7
    //   9: iload #5
    //   11: ifeq -> 41
    //   14: aload_3
    //   15: astore #7
    //   17: aload_0
    //   18: getfield h : Z
    //   21: ifeq -> 41
    //   24: ldc net/time4j/e1/a0/c
    //   26: aload_0
    //   27: getfield e : Lnet/time4j/e1/a0/d;
    //   30: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast net/time4j/e1/a0/c
    //   36: invokevirtual a : ()Lnet/time4j/d1/d;
    //   39: astore #7
    //   41: aload_0
    //   42: getfield e : Lnet/time4j/e1/a0/d;
    //   45: aload_1
    //   46: aload_2
    //   47: aload #7
    //   49: invokeinterface a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;)Ljava/lang/Object;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnonnull -> 70
    //   59: aload_2
    //   60: iload #6
    //   62: aload_2
    //   63: invokevirtual d : ()Ljava/lang/String;
    //   66: invokevirtual a : (ILjava/lang/String;)V
    //   69: return
    //   70: aload_0
    //   71: getfield i : Z
    //   74: ifeq -> 92
    //   77: aload #4
    //   79: instanceof net/time4j/e1/a0/u
    //   82: ifeq -> 92
    //   85: aload #4
    //   87: aload_1
    //   88: invokevirtual a : (Ljava/lang/Object;)V
    //   91: return
    //   92: aload_2
    //   93: invokevirtual g : ()Lnet/time4j/d1/q;
    //   96: astore_3
    //   97: aload_3
    //   98: invokevirtual u : ()Ljava/util/Set;
    //   101: invokeinterface iterator : ()Ljava/util/Iterator;
    //   106: astore #7
    //   108: aload #7
    //   110: invokeinterface hasNext : ()Z
    //   115: ifeq -> 174
    //   118: aload #7
    //   120: invokeinterface next : ()Ljava/lang/Object;
    //   125: checkcast net/time4j/d1/p
    //   128: astore #8
    //   130: aload #8
    //   132: invokeinterface getType : ()Ljava/lang/Class;
    //   137: ldc java/lang/Integer
    //   139: if_acmpne -> 158
    //   142: aload #4
    //   144: aload #8
    //   146: aload_3
    //   147: aload #8
    //   149: invokevirtual a : (Lnet/time4j/d1/p;)I
    //   152: invokevirtual b : (Lnet/time4j/d1/p;I)V
    //   155: goto -> 108
    //   158: aload #4
    //   160: aload #8
    //   162: aload_3
    //   163: aload #8
    //   165: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
    //   168: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   171: goto -> 108
    //   174: aload #4
    //   176: aload_0
    //   177: getfield c : Lnet/time4j/d1/p;
    //   180: aload_1
    //   181: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   184: return
    //   185: astore_1
    //   186: aload_2
    //   187: iload #6
    //   189: aload_1
    //   190: invokevirtual getMessage : ()Ljava/lang/String;
    //   193: invokevirtual a : (ILjava/lang/String;)V
    //   196: return
    // Exception table:
    //   from	to	target	type
    //   17	41	185	java/lang/IndexOutOfBoundsException
    //   41	55	185	java/lang/IndexOutOfBoundsException
    //   59	69	185	java/lang/IndexOutOfBoundsException
    //   70	91	185	java/lang/IndexOutOfBoundsException
    //   92	108	185	java/lang/IndexOutOfBoundsException
    //   108	155	185	java/lang/IndexOutOfBoundsException
    //   158	171	185	java/lang/IndexOutOfBoundsException
    //   174	184	185	java/lang/IndexOutOfBoundsException
  }
  
  public boolean a() {
    return false;
  }
  
  public p<V> b() {
    return this.c;
  }
  
  boolean c() {
    return this.i;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return (this.c.equals(((f)paramObject).c) && this.d.equals(((f)paramObject).d) && this.e.equals(((f)paramObject).e));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode() * 7 + this.d.hashCode() * 31 + this.e.hashCode() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(f.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.c.name());
    stringBuilder.append(", printer=");
    stringBuilder.append(this.d);
    stringBuilder.append(", parser=");
    stringBuilder.append(this.e);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  static final class a implements t<o, Void> {
    public Void a(o param1o) {
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */