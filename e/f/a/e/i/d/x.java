package e.f.a.e.i.d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class x extends t<Boolean> implements k1<Boolean>, RandomAccess {
  private boolean[] d;
  
  private int e;
  
  static {
    (new x()).x();
  }
  
  x() {
    this(new boolean[10], 0);
  }
  
  private x(boolean[] paramArrayOfboolean, int paramInt) {
    this.d = paramArrayOfboolean;
    this.e = paramInt;
  }
  
  private final void a(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(b(paramInt));
  }
  
  private final void a(int paramInt, boolean paramBoolean) {
    a();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        boolean[] arrayOfBoolean = this.d;
        if (i < arrayOfBoolean.length) {
          System.arraycopy(arrayOfBoolean, paramInt, arrayOfBoolean, paramInt + 1, i - paramInt);
        } else {
          boolean[] arrayOfBoolean1 = new boolean[i * 3 / 2 + 1];
          System.arraycopy(arrayOfBoolean, 0, arrayOfBoolean1, 0, paramInt);
          System.arraycopy(this.d, paramInt, arrayOfBoolean1, paramInt + 1, this.e - paramInt);
          this.d = arrayOfBoolean1;
        } 
        this.d[paramInt] = paramBoolean;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
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
  
  public final void a(boolean paramBoolean) {
    a(this.e, paramBoolean);
  }
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection) {
    a();
    h1.a(paramCollection);
    if (!(paramCollection instanceof x))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((x)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      boolean[] arrayOfBoolean = this.d;
      if (i > arrayOfBoolean.length)
        this.d = Arrays.copyOf(arrayOfBoolean, i); 
      System.arraycopy(((x)paramCollection).d, 0, this.d, this.e, ((x)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof x))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((x)paramObject).e)
      return false; 
    paramObject = ((x)paramObject).d;
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
      if (paramObject.equals(Boolean.valueOf(this.d[i]))) {
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */