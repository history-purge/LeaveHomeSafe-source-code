package e.f.a.e.i.d;

import java.util.Arrays;

public final class k5 extends r4<k5> implements Cloneable {
  private byte[] e = z4.e;
  
  private String f = "";
  
  private byte[][] g = z4.d;
  
  public k5() {
    this.d = null;
    this.c = -1;
  }
  
  private final k5 f() {
    try {
      k5 k51 = super.d();
      byte[][] arrayOfByte = this.g;
      if (arrayOfByte != null && arrayOfByte.length > 0)
        k51.g = (byte[][])arrayOfByte.clone(); 
      return k51;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public final void a(p4 paramp4) {
    if (!Arrays.equals(this.e, z4.e))
      paramp4.a(1, this.e); 
    byte[][] arrayOfByte = this.g;
    if (arrayOfByte != null && arrayOfByte.length > 0) {
      int i = 0;
      while (true) {
        arrayOfByte = this.g;
        if (i < arrayOfByte.length) {
          byte[] arrayOfByte1 = arrayOfByte[i];
          if (arrayOfByte1 != null)
            paramp4.a(2, arrayOfByte1); 
          i++;
          continue;
        } 
        break;
      } 
    } 
    String str = this.f;
    if (str != null && !str.equals(""))
      paramp4.a(4, this.f); 
    super.a(paramp4);
  }
  
  protected final int b() {
    int j = super.b();
    int i = j;
    if (!Arrays.equals(this.e, z4.e))
      i = j + p4.b(1, this.e); 
    byte[][] arrayOfByte = this.g;
    j = i;
    if (arrayOfByte != null) {
      j = i;
      if (arrayOfByte.length > 0) {
        j = 0;
        int k = 0;
        int m = 0;
        while (true) {
          arrayOfByte = this.g;
          if (j < arrayOfByte.length) {
            byte[] arrayOfByte1 = arrayOfByte[j];
            int i1 = k;
            int n = m;
            if (arrayOfByte1 != null) {
              n = m + 1;
              i1 = k + p4.b(arrayOfByte1);
            } 
            j++;
            k = i1;
            m = n;
            continue;
          } 
          j = i + k + m * 1;
          break;
        } 
      } 
    } 
    String str = this.f;
    i = j;
    if (str != null) {
      i = j;
      if (!str.equals(""))
        i = j + p4.b(4, this.f); 
    } 
    return i;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof k5))
      return false; 
    paramObject = paramObject;
    if (!Arrays.equals(this.e, ((k5)paramObject).e))
      return false; 
    String str = this.f;
    if (str == null) {
      if (((k5)paramObject).f != null)
        return false; 
    } else if (!str.equals(((k5)paramObject).f)) {
      return false;
    } 
    if (!v4.a(this.g, ((k5)paramObject).g))
      return false; 
    t4 t4 = this.d;
    if (t4 == null || t4.a()) {
      paramObject = ((r4)paramObject).d;
      return (paramObject != null) ? (paramObject.a()) : true;
    } 
    return this.d.equals(((r4)paramObject).d);
  }
  
  public final int hashCode() {
    int i;
    int k = k5.class.getName().hashCode();
    int m = Arrays.hashCode(this.e);
    String str = this.f;
    byte b = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    int n = v4.a(this.g);
    t4 t4 = this.d;
    int j = b;
    if (t4 != null)
      if (t4.a()) {
        j = b;
      } else {
        j = this.d.hashCode();
      }  
    return (((((k + 527) * 31 + m) * 31 + i) * 31 + n) * 31 + 1237) * 31 + j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/k5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */