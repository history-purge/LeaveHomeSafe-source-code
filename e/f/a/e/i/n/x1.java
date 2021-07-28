package e.f.a.e.i.n;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class x1 extends s1<Boolean> implements r3<Boolean>, c5, RandomAccess {
  private boolean[] d;
  
  private int e;
  
  static {
    (new x1(new boolean[0], 0)).zzb();
  }
  
  x1() {
    this(new boolean[10], 0);
  }
  
  private x1(boolean[] paramArrayOfboolean, int paramInt) {
    this.d = paramArrayOfboolean;
    this.e = paramInt;
  }
  
  private final String a(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  private final void g(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(a(paramInt));
  }
  
  public final void a(boolean paramBoolean) {
    a();
    int i = this.e;
    boolean[] arrayOfBoolean = this.d;
    if (i == arrayOfBoolean.length) {
      boolean[] arrayOfBoolean1 = new boolean[i * 3 / 2 + 1];
      System.arraycopy(arrayOfBoolean, 0, arrayOfBoolean1, 0, i);
      this.d = arrayOfBoolean1;
    } 
    arrayOfBoolean = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfBoolean[i] = paramBoolean;
  }
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection) {
    a();
    l3.a(paramCollection);
    if (!(paramCollection instanceof x1))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((x1)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      boolean[] arrayOfBoolean = this.d;
      if (i > arrayOfBoolean.length)
        this.d = Arrays.copyOf(arrayOfBoolean, i); 
      System.arraycopy(((x1)paramCollection).d, 0, this.d, this.e, ((x1)paramCollection).e);
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
    if (!(paramObject instanceof x1))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((x1)paramObject).e)
      return false; 
    paramObject = ((x1)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + l3.a(this.d[i]); 
    return j;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Boolean))
      return -1; 
    boolean bool = ((Boolean)paramObject).booleanValue();
    int j = size();
    for (int i = 0; i < j; i++) {
      if (this.d[i] == bool)
        return i; 
    } 
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      boolean[] arrayOfBoolean = this.d;
      System.arraycopy(arrayOfBoolean, paramInt2, arrayOfBoolean, paramInt1, this.e - paramInt2);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/x1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */