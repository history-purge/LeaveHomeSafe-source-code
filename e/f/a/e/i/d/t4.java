package e.f.a.e.i.d;

public final class t4 implements Cloneable {
  private int[] c;
  
  private u4[] d;
  
  private int e;
  
  static {
    new u4();
  }
  
  t4() {
    this(10);
  }
  
  private t4(int paramInt) {
    int i;
    int j = paramInt << 2;
    paramInt = 4;
    while (true) {
      i = j;
      if (paramInt < 32) {
        i = (1 << paramInt) - 12;
        if (j <= i)
          break; 
        paramInt++;
        continue;
      } 
      break;
    } 
    paramInt = i / 4;
    this.c = new int[paramInt];
    this.d = new u4[paramInt];
    this.e = 0;
  }
  
  final u4 a(int paramInt) {
    return this.d[paramInt];
  }
  
  public final boolean a() {
    return (this.e == 0);
  }
  
  final int b() {
    return this.e;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof t4))
      return false; 
    paramObject = paramObject;
    int j = this.e;
    if (j != ((t4)paramObject).e)
      return false; 
    int[] arrayOfInt1 = this.c;
    int[] arrayOfInt2 = ((t4)paramObject).c;
    int i = 0;
    while (true) {
      if (i < j) {
        if (arrayOfInt1[i] != arrayOfInt2[i]) {
          i = 0;
          break;
        } 
        i++;
        continue;
      } 
      i = 1;
      break;
    } 
    if (i != 0) {
      u4[] arrayOfU4 = this.d;
      paramObject = ((t4)paramObject).d;
      j = this.e;
      i = 0;
      while (true) {
        if (i < j) {
          if (!arrayOfU4[i].equals(paramObject[i])) {
            i = 0;
            break;
          } 
          i++;
          continue;
        } 
        i = 1;
        break;
      } 
      if (i != 0)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = 17;
    for (int i = 0; i < this.e; i++)
      j = (j * 31 + this.c[i]) * 31 + this.d[i].hashCode(); 
    return j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/t4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */