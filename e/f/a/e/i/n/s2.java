package e.f.a.e.i.n;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class s2 extends s1<Double> implements r3<Double>, c5, RandomAccess {
  private double[] d;
  
  private int e;
  
  static {
    (new s2(new double[0], 0)).zzb();
  }
  
  s2() {
    this(new double[10], 0);
  }
  
  private s2(double[] paramArrayOfdouble, int paramInt) {
    this.d = paramArrayOfdouble;
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
  
  public final void a(double paramDouble) {
    a();
    int i = this.e;
    double[] arrayOfDouble = this.d;
    if (i == arrayOfDouble.length) {
      double[] arrayOfDouble1 = new double[i * 3 / 2 + 1];
      System.arraycopy(arrayOfDouble, 0, arrayOfDouble1, 0, i);
      this.d = arrayOfDouble1;
    } 
    arrayOfDouble = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfDouble[i] = paramDouble;
  }
  
  public final boolean addAll(Collection<? extends Double> paramCollection) {
    a();
    l3.a(paramCollection);
    if (!(paramCollection instanceof s2))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((s2)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      double[] arrayOfDouble = this.d;
      if (i > arrayOfDouble.length)
        this.d = Arrays.copyOf(arrayOfDouble, i); 
      System.arraycopy(((s2)paramCollection).d, 0, this.d, this.e, ((s2)paramCollection).e);
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
    if (!(paramObject instanceof s2))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((s2)paramObject).e)
      return false; 
    paramObject = ((s2)paramObject).d;
    for (int i = 0; i < this.e; i++) {
      if (Double.doubleToLongBits(this.d[i]) != Double.doubleToLongBits(paramObject[i]))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = 1;
    for (int i = 0; i < this.e; i++)
      j = j * 31 + l3.a(Double.doubleToLongBits(this.d[i])); 
    return j;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Double))
      return -1; 
    double d = ((Double)paramObject).doubleValue();
    int j = size();
    int i;
    for (i = 0; i < j; i++) {
      if (this.d[i] == d)
        return i; 
    } 
    return -1;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/s2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */