package androidx.core.util;

public class Pools$SimplePool<T> implements d<T> {
  private final Object[] a;
  
  private int b;
  
  public Pools$SimplePool(int paramInt) {
    if (paramInt > 0) {
      this.a = new Object[paramInt];
      return;
    } 
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  private boolean b(T paramT) {
    for (int i = 0; i < this.b; i++) {
      if (this.a[i] == paramT)
        return true; 
    } 
    return false;
  }
  
  public T a() {
    int i = this.b;
    if (i > 0) {
      int j = i - 1;
      Object[] arrayOfObject = this.a;
      Object object = arrayOfObject[j];
      arrayOfObject[j] = null;
      this.b = i - 1;
      return (T)object;
    } 
    return null;
  }
  
  public boolean a(T paramT) {
    if (!b(paramT)) {
      int i = this.b;
      Object[] arrayOfObject = this.a;
      if (i < arrayOfObject.length) {
        arrayOfObject[i] = paramT;
        this.b = i + 1;
        return true;
      } 
      return false;
    } 
    throw new IllegalStateException("Already in the pool!");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/util/Pools$SimplePool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */