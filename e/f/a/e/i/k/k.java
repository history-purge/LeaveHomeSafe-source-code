package e.f.a.e.i.k;

import java.util.Arrays;

class k<E> extends l<E> {
  Object[] a = new Object[4];
  
  int b = 0;
  
  boolean c;
  
  k(int paramInt) {}
  
  private final void a(int paramInt) {
    Object[] arrayOfObject = this.a;
    int i = arrayOfObject.length;
    if (i < paramInt) {
      int j = i + (i >> 1) + 1;
      i = j;
      if (j < paramInt) {
        paramInt = Integer.highestOneBit(paramInt - 1);
        i = paramInt + paramInt;
      } 
      paramInt = i;
      if (i < 0)
        paramInt = Integer.MAX_VALUE; 
      this.a = Arrays.copyOf(arrayOfObject, paramInt);
    } else if (this.c) {
      this.a = (Object[])arrayOfObject.clone();
    } else {
      return;
    } 
    this.c = false;
  }
  
  public final k<E> a(E paramE) {
    if (paramE != null) {
      a(this.b + 1);
      Object[] arrayOfObject = this.a;
      int i = this.b;
      this.b = i + 1;
      arrayOfObject[i] = paramE;
      return this;
    } 
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */