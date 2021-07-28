package e.f.a.e.i.d;

public final class j5 extends r4<j5> implements Cloneable {
  private String[] e;
  
  private String[] f;
  
  private int[] g;
  
  private long[] h;
  
  private long[] i;
  
  public j5() {
    String[] arrayOfString = z4.c;
    this.e = arrayOfString;
    this.f = arrayOfString;
    this.g = z4.a;
    long[] arrayOfLong = z4.b;
    this.h = arrayOfLong;
    this.i = arrayOfLong;
    this.d = null;
    this.c = -1;
  }
  
  private final j5 f() {
    try {
      j5 j51 = super.d();
      String[] arrayOfString = this.e;
      if (arrayOfString != null && arrayOfString.length > 0)
        j51.e = (String[])arrayOfString.clone(); 
      arrayOfString = this.f;
      if (arrayOfString != null && arrayOfString.length > 0)
        j51.f = (String[])arrayOfString.clone(); 
      int[] arrayOfInt = this.g;
      if (arrayOfInt != null && arrayOfInt.length > 0)
        j51.g = (int[])arrayOfInt.clone(); 
      long[] arrayOfLong = this.h;
      if (arrayOfLong != null && arrayOfLong.length > 0)
        j51.h = (long[])arrayOfLong.clone(); 
      arrayOfLong = this.i;
      if (arrayOfLong != null && arrayOfLong.length > 0)
        j51.i = (long[])arrayOfLong.clone(); 
      return j51;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public final void a(p4 paramp4) {
    String[] arrayOfString = this.e;
    byte b = 0;
    if (arrayOfString != null && arrayOfString.length > 0) {
      int i = 0;
      while (true) {
        arrayOfString = this.e;
        if (i < arrayOfString.length) {
          String str = arrayOfString[i];
          if (str != null)
            paramp4.a(1, str); 
          i++;
          continue;
        } 
        break;
      } 
    } 
    arrayOfString = this.f;
    if (arrayOfString != null && arrayOfString.length > 0) {
      int i = 0;
      while (true) {
        arrayOfString = this.f;
        if (i < arrayOfString.length) {
          String str = arrayOfString[i];
          if (str != null)
            paramp4.a(2, str); 
          i++;
          continue;
        } 
        break;
      } 
    } 
    int[] arrayOfInt = this.g;
    if (arrayOfInt != null && arrayOfInt.length > 0) {
      int i = 0;
      while (true) {
        arrayOfInt = this.g;
        if (i < arrayOfInt.length) {
          paramp4.b(3, arrayOfInt[i]);
          i++;
          continue;
        } 
        break;
      } 
    } 
    long[] arrayOfLong = this.h;
    if (arrayOfLong != null && arrayOfLong.length > 0) {
      int i = 0;
      while (true) {
        arrayOfLong = this.h;
        if (i < arrayOfLong.length) {
          paramp4.a(4, arrayOfLong[i]);
          i++;
          continue;
        } 
        break;
      } 
    } 
    arrayOfLong = this.i;
    if (arrayOfLong != null && arrayOfLong.length > 0) {
      int i = b;
      while (true) {
        arrayOfLong = this.i;
        if (i < arrayOfLong.length) {
          paramp4.a(5, arrayOfLong[i]);
          i++;
          continue;
        } 
        break;
      } 
    } 
    super.a(paramp4);
  }
  
  protected final int b() {
    int k = super.b();
    String[] arrayOfString = this.e;
    boolean bool = false;
    int i = k;
    if (arrayOfString != null) {
      i = k;
      if (arrayOfString.length > 0) {
        i = 0;
        int m = 0;
        int n = 0;
        while (true) {
          arrayOfString = this.e;
          if (i < arrayOfString.length) {
            String str = arrayOfString[i];
            int i2 = m;
            int i1 = n;
            if (str != null) {
              i1 = n + 1;
              i2 = m + p4.a(str);
            } 
            i++;
            m = i2;
            n = i1;
            continue;
          } 
          i = k + m + n * 1;
          break;
        } 
      } 
    } 
    arrayOfString = this.f;
    int j = i;
    if (arrayOfString != null) {
      j = i;
      if (arrayOfString.length > 0) {
        j = 0;
        int m = 0;
        int n = 0;
        while (true) {
          arrayOfString = this.f;
          if (j < arrayOfString.length) {
            String str = arrayOfString[j];
            k = m;
            int i1 = n;
            if (str != null) {
              i1 = n + 1;
              k = m + p4.a(str);
            } 
            j++;
            m = k;
            n = i1;
            continue;
          } 
          j = i + m + n * 1;
          break;
        } 
      } 
    } 
    int[] arrayOfInt = this.g;
    i = j;
    if (arrayOfInt != null) {
      i = j;
      if (arrayOfInt.length > 0) {
        i = 0;
        int m = 0;
        while (true) {
          arrayOfInt = this.g;
          if (i < arrayOfInt.length) {
            m += p4.d(arrayOfInt[i]);
            i++;
            continue;
          } 
          i = j + m + arrayOfInt.length * 1;
          break;
        } 
      } 
    } 
    long[] arrayOfLong = this.h;
    j = i;
    if (arrayOfLong != null) {
      j = i;
      if (arrayOfLong.length > 0) {
        j = 0;
        int m = 0;
        while (true) {
          arrayOfLong = this.h;
          if (j < arrayOfLong.length) {
            m += p4.c(arrayOfLong[j]);
            j++;
            continue;
          } 
          j = i + m + arrayOfLong.length * 1;
          break;
        } 
      } 
    } 
    arrayOfLong = this.i;
    i = j;
    if (arrayOfLong != null) {
      i = j;
      if (arrayOfLong.length > 0) {
        int m = 0;
        i = bool;
        while (true) {
          arrayOfLong = this.i;
          if (i < arrayOfLong.length) {
            m += p4.c(arrayOfLong[i]);
            i++;
            continue;
          } 
          i = j + m + arrayOfLong.length * 1;
          break;
        } 
      } 
    } 
    return i;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof j5))
      return false; 
    paramObject = paramObject;
    if (!v4.a((Object[])this.e, (Object[])((j5)paramObject).e))
      return false; 
    if (!v4.a((Object[])this.f, (Object[])((j5)paramObject).f))
      return false; 
    if (!v4.a(this.g, ((j5)paramObject).g))
      return false; 
    if (!v4.a(this.h, ((j5)paramObject).h))
      return false; 
    if (!v4.a(this.i, ((j5)paramObject).i))
      return false; 
    t4 t4 = this.d;
    if (t4 == null || t4.a()) {
      paramObject = ((r4)paramObject).d;
      return (paramObject != null) ? (paramObject.a()) : true;
    } 
    return this.d.equals(((r4)paramObject).d);
  }
  
  public final int hashCode() {
    int j = j5.class.getName().hashCode();
    int k = v4.a((Object[])this.e);
    int m = v4.a((Object[])this.f);
    int n = v4.a(this.g);
    int i1 = v4.a(this.h);
    int i2 = v4.a(this.i);
    t4 t4 = this.d;
    if (t4 == null || t4.a()) {
      byte b = 0;
      return ((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + b;
    } 
    int i = this.d.hashCode();
    return ((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/j5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */