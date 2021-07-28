package e.f.a.e.i.d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class g1 extends t<Integer> implements k1<Integer>, RandomAccess {
  private int[] d;
  
  private int e;
  
  static {
    (new g1()).x();
  }
  
  g1() {
    this(new int[10], 0);
  }
  
  private g1(int[] paramArrayOfint, int paramInt) {
    this.d = paramArrayOfint;
    this.e = paramInt;
  }
  
  private final void a(int paramInt1, int paramInt2) {
    a();
    if (paramInt1 >= 0) {
      int i = this.e;
      if (paramInt1 <= i) {
        int[] arrayOfInt = this.d;
        if (i < arrayOfInt.length) {
          System.arraycopy(arrayOfInt, paramInt1, arrayOfInt, paramInt1 + 1, i - paramInt1);
        } else {
          int[] arrayOfInt1 = new int[i * 3 / 2 + 1];
          System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, paramInt1);
          System.arraycopy(this.d, paramInt1, arrayOfInt1, paramInt1 + 1, this.e - paramInt1);
          this.d = arrayOfInt1;
        } 
        this.d[paramInt1] = paramInt2;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    throw new IndexOutOfBoundsException(d(paramInt1));
  }
  
  private final void c(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(d(paramInt));
  }
  
  private final String d(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final int a(int paramInt) {
    c(paramInt);
    return this.d[paramInt];
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection) {
    a();
    h1.a(paramCollection);
    if (!(paramCollection instanceof g1))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((g1)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      int[] arrayOfInt = this.d;
      if (i > arrayOfInt.length)
        this.d = Arrays.copyOf(arrayOfInt, i); 
      System.arraycopy(((g1)paramCollection).d, 0, this.d, this.e, ((g1)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final void b(int paramInt) {
    a(this.e, paramInt);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof g1))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((g1)paramObject).e)
      return false; 
    paramObject = ((g1)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + this.d[i]; 
    return j;
  }
  
  public final boolean remove(Object paramObject) {
    a();
    for (int i = 0; i < this.e; i++) {
      if (paramObject.equals(Integer.valueOf(this.d[i]))) {
        paramObject = this.d;
        System.arraycopy(paramObject, i + 1, paramObject, i, this.e - i);
        this.e--;
        this.modCount++;
        return true;
      } 
    } 
    return false;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      int[] arrayOfInt = this.d;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, this.e - paramInt2);
      this.e -= paramInt2 - paramInt1;
      this.modCount++;
      return;
    } 
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/g1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */