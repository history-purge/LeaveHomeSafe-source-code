package e.f.a.e.i.n;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class j3 extends s1<Integer> implements r3<Integer>, c5, RandomAccess {
  private static final j3 f;
  
  private int[] d;
  
  private int e;
  
  static {
    j3 j31 = new j3(new int[0], 0);
    f = j31;
    j31.zzb();
  }
  
  j3() {
    this(new int[10], 0);
  }
  
  private j3(int[] paramArrayOfint, int paramInt) {
    this.d = paramArrayOfint;
    this.e = paramInt;
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
  
  public static j3 f() {
    return f;
  }
  
  public final void a(int paramInt) {
    a();
    int i = this.e;
    int[] arrayOfInt = this.d;
    if (i == arrayOfInt.length) {
      int[] arrayOfInt1 = new int[i * 3 / 2 + 1];
      System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, i);
      this.d = arrayOfInt1;
    } 
    arrayOfInt = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfInt[i] = paramInt;
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection) {
    a();
    l3.a(paramCollection);
    if (!(paramCollection instanceof j3))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((j3)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      int[] arrayOfInt = this.d;
      if (i > arrayOfInt.length)
        this.d = Arrays.copyOf(arrayOfInt, i); 
      System.arraycopy(((j3)paramCollection).d, 0, this.d, this.e, ((j3)paramCollection).e);
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
    if (!(paramObject instanceof j3))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((j3)paramObject).e)
      return false; 
    paramObject = ((j3)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final int g(int paramInt) {
    b(paramInt);
    return this.d[paramInt];
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + this.d[i]; 
    return j;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Integer))
      return -1; 
    int j = ((Integer)paramObject).intValue();
    int k = size();
    for (int i = 0; i < k; i++) {
      if (this.d[i] == j)
        return i; 
    } 
    return -1;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/j3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */