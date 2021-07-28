package e.f.a.e.i.d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class p0 extends t<Double> implements k1<Double>, RandomAccess {
  private double[] d;
  
  private int e;
  
  static {
    (new p0()).x();
  }
  
  p0() {
    this(new double[10], 0);
  }
  
  private p0(double[] paramArrayOfdouble, int paramInt) {
    this.d = paramArrayOfdouble;
    this.e = paramInt;
  }
  
  private final void a(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(b(paramInt));
  }
  
  private final void a(int paramInt, double paramDouble) {
    a();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        double[] arrayOfDouble = this.d;
        if (i < arrayOfDouble.length) {
          System.arraycopy(arrayOfDouble, paramInt, arrayOfDouble, paramInt + 1, i - paramInt);
        } else {
          double[] arrayOfDouble1 = new double[i * 3 / 2 + 1];
          System.arraycopy(arrayOfDouble, 0, arrayOfDouble1, 0, paramInt);
          System.arraycopy(this.d, paramInt, arrayOfDouble1, paramInt + 1, this.e - paramInt);
          this.d = arrayOfDouble1;
        } 
        this.d[paramInt] = paramDouble;
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
  
  public final void a(double paramDouble) {
    a(this.e, paramDouble);
  }
  
  public final boolean addAll(Collection<? extends Double> paramCollection) {
    a();
    h1.a(paramCollection);
    if (!(paramCollection instanceof p0))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((p0)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      double[] arrayOfDouble = this.d;
      if (i > arrayOfDouble.length)
        this.d = Arrays.copyOf(arrayOfDouble, i); 
      System.arraycopy(((p0)paramCollection).d, 0, this.d, this.e, ((p0)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof p0))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((p0)paramObject).e)
      return false; 
    paramObject = ((p0)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != paramObject[i])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + h1.a(Double.doubleToLongBits(this.d[i])); 
    return j;
  }
  
  public final boolean remove(Object paramObject) {
    a();
    for (int i = 0; i < this.e; i++) {
      if (paramObject.equals(Double.valueOf(this.d[i]))) {
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
      double[] arrayOfDouble = this.d;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, this.e - paramInt2);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */