package e.f.a.e.i.k;

import java.util.Map;

abstract class n8<K, V> implements Map.Entry<K, V> {
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      paramObject = paramObject;
      if (a0.a(getKey(), paramObject.getKey()) && a0.a(getValue(), paramObject.getValue()))
        return true; 
    } 
    return false;
  }
  
  public abstract K getKey();
  
  public abstract V getValue();
  
  public final int hashCode() {
    int i;
    K k = getKey();
    V v = getValue();
    int j = 0;
    if (k == null) {
      i = 0;
    } else {
      i = k.hashCode();
    } 
    if (v != null)
      j = v.hashCode(); 
    return i ^ j;
  }
  
  public final String toString() {
    String str1 = String.valueOf(getKey());
    String str2 = String.valueOf(getValue());
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/n8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */