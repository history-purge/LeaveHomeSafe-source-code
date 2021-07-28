package b.d;

public class d<E> implements Cloneable {
  private static final Object g = new Object();
  
  private boolean c = false;
  
  private long[] d;
  
  private Object[] e;
  
  private int f;
  
  public d() {
    this(10);
  }
  
  public d(int paramInt) {
    if (paramInt == 0) {
      this.d = c.b;
      this.e = c.c;
      return;
    } 
    paramInt = c.c(paramInt);
    this.d = new long[paramInt];
    this.e = new Object[paramInt];
  }
  
  private void c() {
    int k = this.f;
    long[] arrayOfLong = this.d;
    Object[] arrayOfObject = this.e;
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      Object object = arrayOfObject[i];
      int m = j;
      if (object != g) {
        if (i != j) {
          arrayOfLong[j] = arrayOfLong[i];
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
  
  public long a(int paramInt) {
    if (this.c)
      c(); 
    return this.d[paramInt];
  }
  
  public E a(long paramLong) {
    return b(paramLong, null);
  }
  
  public void a() {
    int j = this.f;
    Object[] arrayOfObject = this.e;
    for (int i = 0; i < j; i++)
      arrayOfObject[i] = null; 
    this.f = 0;
    this.c = false;
  }
  
  public void a(long paramLong, E paramE) {
    int i = this.f;
    if (i != 0 && paramLong <= this.d[i - 1]) {
      c(paramLong, paramE);
      return;
    } 
    if (this.c && this.f >= this.d.length)
      c(); 
    i = this.f;
    if (i >= this.d.length) {
      int j = c.c(i + 1);
      long[] arrayOfLong1 = new long[j];
      Object[] arrayOfObject1 = new Object[j];
      long[] arrayOfLong2 = this.d;
      System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
      Object[] arrayOfObject2 = this.e;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.d = arrayOfLong1;
      this.e = arrayOfObject1;
    } 
    this.d[i] = paramLong;
    this.e[i] = paramE;
    this.f = i + 1;
  }
  
  public int b() {
    if (this.c)
      c(); 
    return this.f;
  }
  
  public int b(long paramLong) {
    if (this.c)
      c(); 
    return c.a(this.d, this.f, paramLong);
  }
  
  public E b(long paramLong, E paramE) {
    int i = c.a(this.d, this.f, paramLong);
    if (i >= 0) {
      Object[] arrayOfObject = this.e;
      return (E)((arrayOfObject[i] == g) ? (Object)paramE : arrayOfObject[i]);
    } 
    return paramE;
  }
  
  public void b(int paramInt) {
    Object[] arrayOfObject = this.e;
    Object object1 = arrayOfObject[paramInt];
    Object object2 = g;
    if (object1 != object2) {
      arrayOfObject[paramInt] = object2;
      this.c = true;
    } 
  }
  
  public E c(int paramInt) {
    if (this.c)
      c(); 
    return (E)this.e[paramInt];
  }
  
  public void c(long paramLong) {
    int i = c.a(this.d, this.f, paramLong);
    if (i >= 0) {
      Object[] arrayOfObject = this.e;
      Object object1 = arrayOfObject[i];
      Object object2 = g;
      if (object1 != object2) {
        arrayOfObject[i] = object2;
        this.c = true;
      } 
    } 
  }
  
  public void c(long paramLong, E paramE) {
    int i = c.a(this.d, this.f, paramLong);
    if (i >= 0) {
      this.e[i] = paramE;
      return;
    } 
    int j = i ^ 0xFFFFFFFF;
    if (j < this.f) {
      Object[] arrayOfObject = this.e;
      if (arrayOfObject[j] == g) {
        this.d[j] = paramLong;
        arrayOfObject[j] = paramE;
        return;
      } 
    } 
    i = j;
    if (this.c) {
      i = j;
      if (this.f >= this.d.length) {
        c();
        i = c.a(this.d, this.f, paramLong) ^ 0xFFFFFFFF;
      } 
    } 
    j = this.f;
    if (j >= this.d.length) {
      j = c.c(j + 1);
      long[] arrayOfLong1 = new long[j];
      Object[] arrayOfObject1 = new Object[j];
      long[] arrayOfLong2 = this.d;
      System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
      Object[] arrayOfObject2 = this.e;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.d = arrayOfLong1;
      this.e = arrayOfObject1;
    } 
    j = this.f;
    if (j - i != 0) {
      long[] arrayOfLong = this.d;
      int k = i + 1;
      System.arraycopy(arrayOfLong, i, arrayOfLong, k, j - i);
      Object[] arrayOfObject = this.e;
      System.arraycopy(arrayOfObject, i, arrayOfObject, k, this.f - i);
    } 
    this.d[i] = paramLong;
    this.e[i] = paramE;
    this.f++;
  }
  
  public d<E> clone() {
    try {
      d<E> d1 = (d)super.clone();
      d1.d = (long[])this.d.clone();
      d1.e = (Object[])this.e.clone();
      return d1;
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
      stringBuilder.append(a(i));
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */