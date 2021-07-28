package b.d;

public class h<E> implements Cloneable {
  private static final Object g = new Object();
  
  private boolean c = false;
  
  private int[] d;
  
  private Object[] e;
  
  private int f;
  
  public h() {
    this(10);
  }
  
  public h(int paramInt) {
    if (paramInt == 0) {
      this.d = c.a;
      this.e = c.c;
      return;
    } 
    paramInt = c.b(paramInt);
    this.d = new int[paramInt];
    this.e = new Object[paramInt];
  }
  
  private void c() {
    int k = this.f;
    int[] arrayOfInt = this.d;
    Object[] arrayOfObject = this.e;
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      Object object = arrayOfObject[i];
      int m = j;
      if (object != g) {
        if (i != j) {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfObject[j] = object;
          arrayOfObject[i] = null;
        } 
        m = j + 1;
      } 
      i++;
    } 
    this.c = false;
    this.f = j;
  }
  
  public int a(E paramE) {
    if (this.c)
      c(); 
    for (int i = 0; i < this.f; i++) {
      if (this.e[i] == paramE)
        return i; 
    } 
    return -1;
  }
  
  public E a(int paramInt) {
    return b(paramInt, null);
  }
  
  public void a() {
    int j = this.f;
    Object[] arrayOfObject = this.e;
    for (int i = 0; i < j; i++)
      arrayOfObject[i] = null; 
    this.f = 0;
    this.c = false;
  }
  
  public void a(int paramInt, E paramE) {
    int i = this.f;
    if (i != 0 && paramInt <= this.d[i - 1]) {
      c(paramInt, paramE);
      return;
    } 
    if (this.c && this.f >= this.d.length)
      c(); 
    i = this.f;
    if (i >= this.d.length) {
      int j = c.b(i + 1);
      int[] arrayOfInt1 = new int[j];
      Object[] arrayOfObject1 = new Object[j];
      int[] arrayOfInt2 = this.d;
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
      Object[] arrayOfObject2 = this.e;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.d = arrayOfInt1;
      this.e = arrayOfObject1;
    } 
    this.d[i] = paramInt;
    this.e[i] = paramE;
    this.f = i + 1;
  }
  
  public int b() {
    if (this.c)
      c(); 
    return this.f;
  }
  
  public int b(int paramInt) {
    if (this.c)
      c(); 
    return this.d[paramInt];
  }
  
  public E b(int paramInt, E paramE) {
    paramInt = c.a(this.d, this.f, paramInt);
    if (paramInt >= 0) {
      Object[] arrayOfObject = this.e;
      return (E)((arrayOfObject[paramInt] == g) ? (Object)paramE : arrayOfObject[paramInt]);
    } 
    return paramE;
  }
  
  public E c(int paramInt) {
    if (this.c)
      c(); 
    return (E)this.e[paramInt];
  }
  
  public void c(int paramInt, E paramE) {
    int i = c.a(this.d, this.f, paramInt);
    if (i >= 0) {
      this.e[i] = paramE;
      return;
    } 
    int j = i ^ 0xFFFFFFFF;
    if (j < this.f) {
      Object[] arrayOfObject = this.e;
      if (arrayOfObject[j] == g) {
        this.d[j] = paramInt;
        arrayOfObject[j] = paramE;
        return;
      } 
    } 
    i = j;
    if (this.c) {
      i = j;
      if (this.f >= this.d.length) {
        c();
        i = c.a(this.d, this.f, paramInt) ^ 0xFFFFFFFF;
      } 
    } 
    j = this.f;
    if (j >= this.d.length) {
      j = c.b(j + 1);
      int[] arrayOfInt1 = new int[j];
      Object[] arrayOfObject1 = new Object[j];
      int[] arrayOfInt2 = this.d;
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
      Object[] arrayOfObject2 = this.e;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.d = arrayOfInt1;
      this.e = arrayOfObject1;
    } 
    j = this.f;
    if (j - i != 0) {
      int[] arrayOfInt = this.d;
      int k = i + 1;
      System.arraycopy(arrayOfInt, i, arrayOfInt, k, j - i);
      Object[] arrayOfObject = this.e;
      System.arraycopy(arrayOfObject, i, arrayOfObject, k, this.f - i);
    } 
    this.d[i] = paramInt;
    this.e[i] = paramE;
    this.f++;
  }
  
  public h<E> clone() {
    try {
      h<E> h1 = (h)super.clone();
      h1.d = (int[])this.d.clone();
      h1.e = (Object[])this.e.clone();
      return h1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public String toString() {
    if (b() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.f * 28);
    stringBuilder.append('{');
    for (int i = 0; i < this.f; i++) {
      if (i > 0)
        stringBuilder.append(", "); 
      stringBuilder.append(b(i));
      stringBuilder.append('=');
      E e = c(i);
      if (e != this) {
        stringBuilder.append(e);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */