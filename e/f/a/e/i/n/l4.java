package e.f.a.e.i.n;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class l4<K, V> extends LinkedHashMap<K, V> {
  private static final l4 c;
  
  private boolean zza = true;
  
  static {
    l4 l41 = new l4();
    c = l41;
    l41.zza = false;
  }
  
  private l4() {}
  
  private l4(Map<K, V> paramMap) {
    super(paramMap);
  }
  
  private static int a(Object paramObject) {
    if (paramObject instanceof byte[])
      return l3.c((byte[])paramObject); 
    if (!(paramObject instanceof k3))
      return paramObject.hashCode(); 
    throw new UnsupportedOperationException();
  }
  
  private final void e() {
    if (this.zza)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public static <K, V> l4<K, V> zza() {
    return c;
  }
  
  public final l4<K, V> a() {
    return isEmpty() ? new l4() : new l4(this);
  }
  
  public final void a(l4<K, V> paraml4) {
    e();
    if (!paraml4.isEmpty())
      putAll(paraml4); 
  }
  
  public final void b() {
    this.zza = false;
  }
  
  public final boolean c() {
    return this.zza;
  }
  
  public final void clear() {
    e();
    super.clear();
  }
  
  public final Set<Map.Entry<K, V>> entrySet() {
    return isEmpty() ? Collections.emptySet() : super.entrySet();
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/util/Map
    //   4: ifeq -> 171
    //   7: aload_1
    //   8: checkcast java/util/Map
    //   11: astore_1
    //   12: aload_0
    //   13: aload_1
    //   14: if_acmpeq -> 163
    //   17: aload_0
    //   18: invokeinterface size : ()I
    //   23: aload_1
    //   24: invokeinterface size : ()I
    //   29: if_icmpeq -> 37
    //   32: iconst_0
    //   33: istore_2
    //   34: goto -> 165
    //   37: aload_0
    //   38: invokeinterface entrySet : ()Ljava/util/Set;
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 163
    //   60: aload #4
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast java/util/Map$Entry
    //   70: astore #6
    //   72: aload_1
    //   73: aload #6
    //   75: invokeinterface getKey : ()Ljava/lang/Object;
    //   80: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   85: ifne -> 91
    //   88: goto -> 32
    //   91: aload #6
    //   93: invokeinterface getValue : ()Ljava/lang/Object;
    //   98: astore #5
    //   100: aload_1
    //   101: aload #6
    //   103: invokeinterface getKey : ()Ljava/lang/Object;
    //   108: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   113: astore #6
    //   115: aload #5
    //   117: instanceof [B
    //   120: ifeq -> 148
    //   123: aload #6
    //   125: instanceof [B
    //   128: ifeq -> 148
    //   131: aload #5
    //   133: checkcast [B
    //   136: aload #6
    //   138: checkcast [B
    //   141: invokestatic equals : ([B[B)Z
    //   144: istore_3
    //   145: goto -> 156
    //   148: aload #5
    //   150: aload #6
    //   152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   155: istore_3
    //   156: iload_3
    //   157: ifne -> 50
    //   160: goto -> 32
    //   163: iconst_1
    //   164: istore_2
    //   165: iload_2
    //   166: ifeq -> 171
    //   169: iconst_1
    //   170: ireturn
    //   171: iconst_0
    //   172: ireturn
  }
  
  public final int hashCode() {
    Iterator<Map.Entry> iterator = super.entrySet().iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += a(entry.getValue()) ^ j) {
      Map.Entry entry = iterator.next();
      int j = a(entry.getKey());
    } 
    return i;
  }
  
  public final V put(K paramK, V paramV) {
    e();
    l3.a(paramK);
    l3.a(paramV);
    return super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap) {
    e();
    for (K k : paramMap.keySet()) {
      l3.a(k);
      l3.a(paramMap.get(k));
    } 
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject) {
    e();
    return super.remove(paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/l4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */