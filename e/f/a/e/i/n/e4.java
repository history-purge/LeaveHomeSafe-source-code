package e.f.a.e.i.n;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class e4 extends s1<Long> implements r3<Long>, c5, RandomAccess {
  private long[] d;
  
  private int e;
  
  static {
    (new e4(new long[0], 0)).zzb();
  }
  
  e4() {
    this(new long[10], 0);
  }
  
  private e4(long[] paramArrayOflong, int paramInt) {
    this.d = paramArrayOflong;
    this.e = paramInt;
  }
  
  private final void a(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(b(paramInt));
  }
  
  private final String b(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final void a(long paramLong) {
    a();
    int i = this.e;
    long[] arrayOfLong = this.d;
    if (i == arrayOfLong.length) {
      long[] arrayOfLong1 = new long[i * 3 / 2 + 1];
      System.arraycopy(arrayOfLong, 0, arrayOfLong1, 0, i);
      this.d = arrayOfLong1;
    } 
    arrayOfLong = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfLong[i] = paramLong;
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection) {
    a();
    l3.a(paramCollection);
    if (!(paramCollection instanceof e4))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((e4)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      long[] arrayOfLong = this.d;
      if (i > arrayOfLong.length)
        this.d = Arrays.copyOf(arrayOfLong, i); 
      System.arraycopy(((e4)paramCollection).d, 0, this.d, this.e, ((e4)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof e4))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((e4)paramObject).e)
      return false; 
    paramObject = ((e4)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final long g(int paramInt) {
    a(paramInt);
    return this.d[paramInt];
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + l3.a(this.d[i]); 
    return j;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Long))
      return -1; 
    long l = ((Long)paramObject).longValue();
    int j = size();
    for (int i = 0; i < j; i++) {
      if (this.d[i] == l)
        return i; 
    } 
    return -1;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/e4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */