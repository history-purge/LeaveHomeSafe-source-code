package com.google.firebase.components;

import com.google.firebase.l.a;
import com.google.firebase.n.c;
import com.google.firebase.n.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class s extends m implements a {
  private static final com.google.firebase.p.b<Set<Object>> g = l.a;
  
  private final Map<n<?>, com.google.firebase.p.b<?>> a = new HashMap<n<?>, com.google.firebase.p.b<?>>();
  
  private final Map<Class<?>, com.google.firebase.p.b<?>> b = new HashMap<Class<?>, com.google.firebase.p.b<?>>();
  
  private final Map<Class<?>, a0<?>> c = new HashMap<Class<?>, a0<?>>();
  
  private final List<com.google.firebase.p.b<r>> d;
  
  private final x e;
  
  private final AtomicReference<Boolean> f = new AtomicReference<Boolean>();
  
  private s(Executor paramExecutor, Iterable<com.google.firebase.p.b<r>> paramIterable, Collection<n<?>> paramCollection) {
    this.e = new x(paramExecutor);
    ArrayList<n> arrayList = new ArrayList();
    arrayList.add(n.a(this.e, x.class, (Class<? super x>[])new Class[] { d.class, c.class }));
    arrayList.add(n.a(this, a.class, (Class<? super a>[])new Class[0]));
    for (n<?> n : paramCollection) {
      if (n != null)
        arrayList.add(n); 
    } 
    this.d = a(paramIterable);
    a((List)arrayList);
  }
  
  @Deprecated
  public s(Executor paramExecutor, Iterable<r> paramIterable, n<?>... paramVarArgs) {
    this(paramExecutor, b(paramIterable), Arrays.asList(paramVarArgs));
  }
  
  public static b a(Executor paramExecutor) {
    return new b(paramExecutor);
  }
  
  private static <T> List<T> a(Iterable<T> paramIterable) {
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = paramIterable.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  private void a() {
    Boolean bool = this.f.get();
    if (bool != null)
      a(this.a, bool.booleanValue()); 
  }
  
  private void a(List<n<?>> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield d : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 101
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast com/google/firebase/p/b
    //   38: astore #4
    //   40: aload #4
    //   42: invokeinterface get : ()Ljava/lang/Object;
    //   47: checkcast com/google/firebase/components/r
    //   50: astore #4
    //   52: aload #4
    //   54: ifnull -> 20
    //   57: aload_1
    //   58: aload #4
    //   60: invokeinterface getComponents : ()Ljava/util/List;
    //   65: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   70: pop
    //   71: aload_3
    //   72: invokeinterface remove : ()V
    //   77: goto -> 20
    //   80: astore #4
    //   82: aload_3
    //   83: invokeinterface remove : ()V
    //   88: ldc 'ComponentDiscovery'
    //   90: ldc 'Invalid component registrar.'
    //   92: aload #4
    //   94: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   97: pop
    //   98: goto -> 20
    //   101: aload_0
    //   102: getfield a : Ljava/util/Map;
    //   105: invokeinterface isEmpty : ()Z
    //   110: ifeq -> 120
    //   113: aload_1
    //   114: invokestatic a : (Ljava/util/List;)V
    //   117: goto -> 147
    //   120: new java/util/ArrayList
    //   123: dup
    //   124: aload_0
    //   125: getfield a : Ljava/util/Map;
    //   128: invokeinterface keySet : ()Ljava/util/Set;
    //   133: invokespecial <init> : (Ljava/util/Collection;)V
    //   136: astore_3
    //   137: aload_3
    //   138: aload_1
    //   139: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   142: pop
    //   143: aload_3
    //   144: invokestatic a : (Ljava/util/List;)V
    //   147: aload_1
    //   148: invokeinterface iterator : ()Ljava/util/Iterator;
    //   153: astore_3
    //   154: aload_3
    //   155: invokeinterface hasNext : ()Z
    //   160: ifeq -> 210
    //   163: aload_3
    //   164: invokeinterface next : ()Ljava/lang/Object;
    //   169: checkcast com/google/firebase/components/n
    //   172: astore #4
    //   174: new com/google/firebase/components/z
    //   177: dup
    //   178: new com/google/firebase/components/e
    //   181: dup
    //   182: aload_0
    //   183: aload #4
    //   185: invokespecial <init> : (Lcom/google/firebase/components/s;Lcom/google/firebase/components/n;)V
    //   188: invokespecial <init> : (Lcom/google/firebase/p/b;)V
    //   191: astore #5
    //   193: aload_0
    //   194: getfield a : Ljava/util/Map;
    //   197: aload #4
    //   199: aload #5
    //   201: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   206: pop
    //   207: goto -> 154
    //   210: aload_2
    //   211: aload_0
    //   212: aload_1
    //   213: invokespecial b : (Ljava/util/List;)Ljava/util/List;
    //   216: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   221: pop
    //   222: aload_2
    //   223: aload_0
    //   224: invokespecial c : ()Ljava/util/List;
    //   227: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   232: pop
    //   233: aload_0
    //   234: invokespecial b : ()V
    //   237: aload_0
    //   238: monitorexit
    //   239: aload_2
    //   240: invokeinterface iterator : ()Ljava/util/Iterator;
    //   245: astore_1
    //   246: aload_1
    //   247: invokeinterface hasNext : ()Z
    //   252: ifeq -> 272
    //   255: aload_1
    //   256: invokeinterface next : ()Ljava/lang/Object;
    //   261: checkcast java/lang/Runnable
    //   264: invokeinterface run : ()V
    //   269: goto -> 246
    //   272: aload_0
    //   273: invokespecial a : ()V
    //   276: return
    //   277: astore_1
    //   278: aload_0
    //   279: monitorexit
    //   280: goto -> 285
    //   283: aload_1
    //   284: athrow
    //   285: goto -> 283
    // Exception table:
    //   from	to	target	type
    //   10	20	277	finally
    //   20	40	277	finally
    //   40	52	80	com/google/firebase/components/y
    //   40	52	277	finally
    //   57	77	80	com/google/firebase/components/y
    //   57	77	277	finally
    //   82	98	277	finally
    //   101	117	277	finally
    //   120	147	277	finally
    //   147	154	277	finally
    //   154	207	277	finally
    //   210	239	277	finally
    //   278	280	277	finally
  }
  
  private void a(Map<n<?>, com.google.firebase.p.b<?>> paramMap, boolean paramBoolean) {
    for (Map.Entry<n<?>, com.google.firebase.p.b<?>> entry : paramMap.entrySet()) {
      n n = (n)entry.getKey();
      com.google.firebase.p.b b1 = (com.google.firebase.p.b)entry.getValue();
      if (n.e() || (n.f() && paramBoolean))
        b1.get(); 
    } 
    this.e.a();
  }
  
  private static Iterable<com.google.firebase.p.b<r>> b(Iterable<r> paramIterable) {
    ArrayList<f> arrayList = new ArrayList();
    Iterator<r> iterator = paramIterable.iterator();
    while (iterator.hasNext())
      arrayList.add(new f(iterator.next())); 
    return (Iterable)arrayList;
  }
  
  private List<Runnable> b(List<n<?>> paramList) {
    ArrayList<g> arrayList = new ArrayList();
    for (n<?> n : paramList) {
      if (!n.g())
        continue; 
      com.google.firebase.p.b<?> b1 = this.a.get(n);
      for (Class<?> clazz : (Iterable<Class<?>>)n.c()) {
        if (!this.b.containsKey(clazz)) {
          this.b.put(clazz, b1);
          continue;
        } 
        arrayList.add(new g((c0)this.b.get(clazz), b1));
      } 
    } 
    return (List)arrayList;
  }
  
  private void b() {
    for (n<?> n : this.a.keySet()) {
      for (u u : n.a()) {
        Class<?> clazz;
        Map<Class<?>, com.google.firebase.p.b<?>> map;
        c0<?> c0;
        if (u.e() && !this.c.containsKey(u.a())) {
          Map<Class<?>, a0<?>> map1 = this.c;
          clazz = u.a();
          a0<?> a0 = a0.a(Collections.emptySet());
        } else if (!this.b.containsKey(clazz.a())) {
          if (!clazz.d()) {
            if (!clazz.e()) {
              map = this.b;
              clazz = clazz.a();
              c0 = c0.a();
            } else {
              continue;
            } 
          } else {
            throw new b0(String.format("Unsatisfied dependency for component %s: %s", new Object[] { n, clazz.a() }));
          } 
        } else {
          continue;
        } 
        map.put(clazz, c0);
      } 
    } 
  }
  
  private List<Runnable> c() {
    ArrayList<h> arrayList = new ArrayList();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (Map.Entry<n<?>, com.google.firebase.p.b<?>> entry : this.a.entrySet()) {
      n n = (n)entry.getKey();
      if (n.g())
        continue; 
      com.google.firebase.p.b b1 = (com.google.firebase.p.b)entry.getValue();
      for (Class clazz : n.c()) {
        if (!hashMap.containsKey(clazz))
          hashMap.put(clazz, new HashSet()); 
        ((Set<com.google.firebase.p.b>)hashMap.get(clazz)).add(b1);
      } 
    } 
    for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
      if (!this.c.containsKey(entry.getKey())) {
        this.c.put((Class)entry.getKey(), a0.a((Collection<com.google.firebase.p.b<?>>)entry.getValue()));
        continue;
      } 
      a0 a0 = this.c.get(entry.getKey());
      Iterator<com.google.firebase.p.b> iterator = ((Set)entry.getValue()).iterator();
      while (iterator.hasNext())
        arrayList.add(new h(a0, iterator.next())); 
    } 
    return (List)arrayList;
  }
  
  public void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/util/concurrent/atomic/AtomicReference;
    //   4: aconst_null
    //   5: iload_1
    //   6: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   12: ifne -> 16
    //   15: return
    //   16: aload_0
    //   17: monitorenter
    //   18: new java/util/HashMap
    //   21: dup
    //   22: aload_0
    //   23: getfield a : Ljava/util/Map;
    //   26: invokespecial <init> : (Ljava/util/Map;)V
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_0
    //   33: aload_2
    //   34: iload_1
    //   35: invokespecial a : (Ljava/util/Map;Z)V
    //   38: return
    //   39: astore_2
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_2
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   18	32	39	finally
    //   40	42	39	finally
  }
  
  public <T> com.google.firebase.p.b<T> c(Class<T> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ldc_w 'Null interface requested.'
    //   6: invokestatic a : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_0
    //   11: getfield b : Ljava/util/Map;
    //   14: aload_1
    //   15: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast com/google/firebase/p/b
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	28	finally
  }
  
  public <T> com.google.firebase.p.b<Set<T>> d(Class<T> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/google/firebase/components/a0
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: getstatic com/google/firebase/components/s.g : Lcom/google/firebase/p/b;
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: areturn
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	32	finally
    //   24	28	32	finally
  }
  
  public static final class b {
    private final Executor a;
    
    private final List<com.google.firebase.p.b<r>> b = new ArrayList<com.google.firebase.p.b<r>>();
    
    private final List<n<?>> c = new ArrayList<n<?>>();
    
    b(Executor param1Executor) {
      this.a = param1Executor;
    }
    
    public b a(n<?> param1n) {
      this.c.add(param1n);
      return this;
    }
    
    public b a(r param1r) {
      this.b.add(new d(param1r));
      return this;
    }
    
    public b a(Collection<com.google.firebase.p.b<r>> param1Collection) {
      this.b.addAll(param1Collection);
      return this;
    }
    
    public s a() {
      return new s(this.a, this.b, this.c, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */