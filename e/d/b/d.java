package e.d.b;

import java.util.HashMap;
import java.util.Map;

public class d<T> {
  private final a<T> a = new a<T>();
  
  private int b;
  
  public int a() {
    return this.b;
  }
  
  public T a(byte[] paramArrayOfbyte) {
    a<T> a1 = this.a;
    Object object = a.a(a1);
    int j = paramArrayOfbyte.length;
    for (int i = 0; i < j; i++) {
      byte b = paramArrayOfbyte[i];
      a1 = (a<T>)a.b(a1).get(Byte.valueOf(b));
      if (a1 == null)
        return (T)object; 
      if (a.a(a1) != null)
        object = a.a(a1); 
    } 
    return (T)object;
  }
  
  public void a(T paramT) {
    this.a.a(paramT);
  }
  
  public void a(T paramT, byte[]... paramVarArgs) {
    a<T> a1 = this.a;
    int k = paramVarArgs.length;
    int j = 0;
    int i = 0;
    while (j < k) {
      for (byte b : paramVarArgs[j]) {
        a<T> a3 = (a)a.b(a1).get(Byte.valueOf(b));
        a<T> a2 = a3;
        if (a3 == null) {
          a2 = new a();
          a.b(a1).put(Byte.valueOf(b), a2);
        } 
        a1 = a2;
        i++;
      } 
      j++;
    } 
    if (i != 0) {
      a1.a(paramT);
      this.b = Math.max(this.b, i);
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parts must contain at least one byte.");
    throw illegalArgumentException;
  }
  
  static class a<T> {
    private final Map<Byte, a<T>> a = new HashMap<Byte, a<T>>();
    
    private T b = null;
    
    public void a(T param1T) {
      if (this.b == null) {
        this.b = param1T;
        return;
      } 
      throw new RuntimeException("Value already set for this trie node");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */