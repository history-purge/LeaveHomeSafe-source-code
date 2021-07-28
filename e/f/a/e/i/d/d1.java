package e.f.a.e.i.d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class d1 extends t<Float> implements k1<Float>, RandomAccess {
  private float[] d;
  
  private int e;
  
  static {
    (new d1()).x();
  }
  
  d1() {
    this(new float[10], 0);
  }
  
  private d1(float[] paramArrayOffloat, int paramInt) {
    this.d = paramArrayOffloat;
    this.e = paramInt;
  }
  
  private final void a(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(b(paramInt));
  }
  
  private final void a(int paramInt, float paramFloat) {
    a();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        float[] arrayOfFloat = this.d;
        if (i < arrayOfFloat.length) {
          System.arraycopy(arrayOfFloat, paramInt, arrayOfFloat, paramInt + 1, i - paramInt);
        } else {
          float[] arrayOfFloat1 = new float[i * 3 / 2 + 1];
          System.arraycopy(arrayOfFloat, 0, arrayOfFloat1, 0, paramInt);
          System.arraycopy(this.d, paramInt, arrayOfFloat1, paramInt + 1, this.e - paramInt);
          this.d = arrayOfFloat1;
        } 
        this.d[paramInt] = paramFloat;
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
  
  public final void a(float paramFloat) {
    a(this.e, paramFloat);
  }
  
  public final boolean addAll(Collection<? extends Float> paramCollection) {
    a();
    h1.a(paramCollection);
    if (!(paramCollection instanceof d1))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((d1)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      float[] arrayOfFloat = this.d;
      if (i > arrayOfFloat.length)
        this.d = Arrays.copyOf(arrayOfFloat, i); 
      System.arraycopy(((d1)paramCollection).d, 0, this.d, this.e, ((d1)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof d1))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((d1)paramObject).e)
      return false; 
    paramObject = ((d1)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + Float.floatToIntBits(this.d[i]); 
    return j;
  }
  
  public final boolean remove(Object paramObject) {
    a();
    for (int i = 0; i < this.e; i++) {
      if (paramObject.equals(Float.valueOf(this.d[i]))) {
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
      float[] arrayOfFloat = this.d;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, this.e - paramInt2);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/d1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */