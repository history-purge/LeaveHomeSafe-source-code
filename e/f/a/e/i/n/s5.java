package e.f.a.e.i.n;

import java.util.Map;

final class s5 implements Comparable<s5>, Map.Entry<K, V> {
  private final K c;
  
  private V d;
  
  s5(n5 paramn5, K paramK, V paramV) {
    this.c = paramK;
    this.d = paramV;
  }
  
  s5(n5 paramn5, Map.Entry<K, V> paramEntry) {
    this(paramn5, paramEntry.getKey(), paramEntry.getValue());
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof Map.Entry))
      return false; 
    paramObject = paramObject;
    return (a(this.c, paramObject.getKey()) && a(this.d, paramObject.getValue()));
  }
  
  public final V getValue() {
    return this.d;
  }
  
  public final int hashCode() {
    int i;
    K k = this.c;
    int j = 0;
    if (k == null) {
      i = 0;
    } else {
      i = k.hashCode();
    } 
    V v = this.d;
    if (v != null)
      j = v.hashCode(); 
    return i ^ j;
  }
  
  public final V setValue(V paramV) {
    n5.a(this.e);
    V v = this.d;
    this.d = paramV;
    return v;
  }
  
  public final String toString() {
    String str1 = String.valueOf(this.c);
    String str2 = String.valueOf(this.d);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/s5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */