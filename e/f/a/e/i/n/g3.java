package e.f.a.e.i.n;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class g3 extends s1<Float> implements r3<Float>, c5, RandomAccess {
  private float[] d;
  
  private int e;
  
  static {
    (new g3(new float[0], 0)).zzb();
  }
  
  g3() {
    this(new float[10], 0);
  }
  
  private g3(float[] paramArrayOffloat, int paramInt) {
    this.d = paramArrayOffloat;
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
  
  public final void a(float paramFloat) {
    a();
    int i = this.e;
    float[] arrayOfFloat = this.d;
    if (i == arrayOfFloat.length) {
      float[] arrayOfFloat1 = new float[i * 3 / 2 + 1];
      System.arraycopy(arrayOfFloat, 0, arrayOfFloat1, 0, i);
      this.d = arrayOfFloat1;
    } 
    arrayOfFloat = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfFloat[i] = paramFloat;
  }
  
  public final boolean addAll(Collection<? extends Float> paramCollection) {
    a();
    l3.a(paramCollection);
    if (!(paramCollection instanceof g3))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((g3)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      float[] arrayOfFloat = this.d;
      if (i > arrayOfFloat.length)
        this.d = Arrays.copyOf(arrayOfFloat, i); 
      System.arraycopy(((g3)paramCollection).d, 0, this.d, this.e, ((g3)paramCollection).e);
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
    if (!(paramObject instanceof g3))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((g3)paramObject).e)
      return false; 
    paramObject = ((g3)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (Float.floatToIntBits(this.d[i]) != Float.floatToIntBits(paramObject[i]))
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
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Float))
      return -1; 
    float f = ((Float)paramObject).floatValue();
    int j = size();
    for (int i = 0; i < j; i++) {
      if (this.d[i] == f)
        return i; 
    } 
    return -1;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/g3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */