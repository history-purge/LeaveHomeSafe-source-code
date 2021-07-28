package e.f.a.e.i.d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class z1 extends t<Long> implements k1<Long>, RandomAccess {
  private long[] d;
  
  private int e;
  
  static {
    (new z1()).x();
  }
  
  z1() {
    this(new long[10], 0);
  }
  
  private z1(long[] paramArrayOflong, int paramInt) {
    this.d = paramArrayOflong;
    this.e = paramInt;
  }
  
  private final void a(int paramInt, long paramLong) {
    a();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        long[] arrayOfLong = this.d;
        if (i < arrayOfLong.length) {
          System.arraycopy(arrayOfLong, paramInt, arrayOfLong, paramInt + 1, i - paramInt);
        } else {
          long[] arrayOfLong1 = new long[i * 3 / 2 + 1];
          System.arraycopy(arrayOfLong, 0, arrayOfLong1, 0, paramInt);
          System.arraycopy(this.d, paramInt, arrayOfLong1, paramInt + 1, this.e - paramInt);
          this.d = arrayOfLong1;
        } 
        this.d[paramInt] = paramLong;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    throw new IndexOutOfBoundsException(c(paramInt));
  }
  
  private final void b(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(c(paramInt));
  }
  
  private final String c(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final long a(int paramInt) {
    b(paramInt);
    return this.d[paramInt];
  }
  
  public final void a(long paramLong) {
    a(this.e, paramLong);
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection) {
    a();
    h1.a(paramCollection);
    if (!(paramCollection instanceof z1))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((z1)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      long[] arrayOfLong = this.d;
      if (i > arrayOfLong.length)
        this.d = Arrays.copyOf(arrayOfLong, i); 
      System.arraycopy(((z1)paramCollection).d, 0, this.d, this.e, ((z1)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof z1))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((z1)paramObject).e)
      return false; 
    paramObject = ((z1)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + h1.a(this.d[i]); 
    return j;
  }
  
  public final boolean remove(Object paramObject) {
    a();
    for (int i = 0; i < this.e; i++) {
      if (paramObject.equals(Long.valueOf(this.d[i]))) {
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
      long[] arrayOfLong = this.d;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, this.e - paramInt2);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/z1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */