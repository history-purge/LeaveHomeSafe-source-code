package e.f.a.e.i.d;

import java.util.Arrays;

public final class m5 extends r4<m5> implements Cloneable {
  public long e = 0L;
  
  public long f = 0L;
  
  private String g = "";
  
  public int h = 0;
  
  private String i = "";
  
  private n5[] j = n5.f();
  
  private byte[] k;
  
  private a5 l;
  
  public byte[] m;
  
  private String n;
  
  private String o;
  
  private j5 p;
  
  private String q;
  
  public long r;
  
  private k5 s;
  
  public byte[] t;
  
  private String u;
  
  private int[] v;
  
  private b5 w;
  
  public boolean x;
  
  public m5() {
    byte[] arrayOfByte = z4.e;
    this.k = arrayOfByte;
    this.l = null;
    this.m = arrayOfByte;
    this.n = "";
    this.o = "";
    this.p = null;
    this.q = "";
    this.r = 180000L;
    this.s = null;
    this.t = arrayOfByte;
    this.u = "";
    this.v = z4.a;
    this.w = null;
    this.x = false;
    this.d = null;
    this.c = -1;
  }
  
  private final m5 f() {
    try {
      m5 m51 = super.d();
      n5[] arrayOfN5 = this.j;
      if (arrayOfN5 != null && arrayOfN5.length > 0) {
        m51.j = new n5[arrayOfN5.length];
        int i = 0;
        while (true) {
          arrayOfN5 = this.j;
          if (i < arrayOfN5.length) {
            if (arrayOfN5[i] != null)
              m51.j[i] = (n5)arrayOfN5[i].clone(); 
            i++;
            continue;
          } 
          break;
        } 
      } 
      a5 a51 = this.l;
      if (a51 != null)
        m51.l = a51; 
      j5 j51 = this.p;
      if (j51 != null)
        m51.p = (j5)j51.clone(); 
      k5 k51 = this.s;
      if (k51 != null)
        m51.s = (k5)k51.clone(); 
      int[] arrayOfInt = this.v;
      if (arrayOfInt != null && arrayOfInt.length > 0)
        m51.v = (int[])arrayOfInt.clone(); 
      b5 b51 = this.w;
      if (b51 != null)
        m51.w = b51; 
      return m51;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      AssertionError assertionError = new AssertionError(cloneNotSupportedException);
      throw assertionError;
    } 
  }
  
  public final void a(p4 paramp4) {
    long l = this.e;
    if (l != 0L)
      paramp4.a(1, l); 
    String str4 = this.g;
    if (str4 != null && !str4.equals(""))
      paramp4.a(2, this.g); 
    n5[] arrayOfN5 = this.j;
    boolean bool = false;
    if (arrayOfN5 != null && arrayOfN5.length > 0) {
      int j = 0;
      while (true) {
        arrayOfN5 = this.j;
        if (j < arrayOfN5.length) {
          n5 n51 = arrayOfN5[j];
          if (n51 != null)
            paramp4.a(3, n51); 
          j++;
          continue;
        } 
        break;
      } 
    } 
    if (!Arrays.equals(this.k, z4.e))
      paramp4.a(4, this.k); 
    if (!Arrays.equals(this.m, z4.e))
      paramp4.a(6, this.m); 
    j5 j51 = this.p;
    if (j51 != null)
      paramp4.a(7, j51); 
    String str3 = this.n;
    if (str3 != null && !str3.equals(""))
      paramp4.a(8, this.n); 
    a5 a51 = this.l;
    if (a51 != null)
      paramp4.a(9, a51); 
    int i = this.h;
    if (i != 0)
      paramp4.b(11, i); 
    String str2 = this.o;
    if (str2 != null && !str2.equals(""))
      paramp4.a(13, this.o); 
    str2 = this.q;
    if (str2 != null && !str2.equals(""))
      paramp4.a(14, this.q); 
    l = this.r;
    if (l != 180000L) {
      paramp4.a(15, 0);
      paramp4.a(p4.b(l));
    } 
    k5 k51 = this.s;
    if (k51 != null)
      paramp4.a(16, k51); 
    l = this.f;
    if (l != 0L)
      paramp4.a(17, l); 
    if (!Arrays.equals(this.t, z4.e))
      paramp4.a(18, this.t); 
    int[] arrayOfInt = this.v;
    if (arrayOfInt != null && arrayOfInt.length > 0) {
      i = bool;
      while (true) {
        arrayOfInt = this.v;
        if (i < arrayOfInt.length) {
          paramp4.b(20, arrayOfInt[i]);
          i++;
          continue;
        } 
        break;
      } 
    } 
    b5 b51 = this.w;
    if (b51 != null)
      paramp4.a(23, b51); 
    String str1 = this.u;
    if (str1 != null && !str1.equals(""))
      paramp4.a(24, this.u); 
    boolean bool1 = this.x;
    if (bool1)
      paramp4.a(25, bool1); 
    str1 = this.i;
    if (str1 != null && !str1.equals(""))
      paramp4.a(26, this.i); 
    super.a(paramp4);
  }
  
  protected final int b() {
    int i = super.b();
    long l = this.e;
    int j = i;
    if (l != 0L)
      j = i + p4.b(1, l); 
    String str4 = this.g;
    i = j;
    if (str4 != null) {
      i = j;
      if (!str4.equals(""))
        i = j + p4.b(2, this.g); 
    } 
    n5[] arrayOfN5 = this.j;
    boolean bool = false;
    j = i;
    if (arrayOfN5 != null) {
      j = i;
      if (arrayOfN5.length > 0) {
        j = 0;
        while (true) {
          arrayOfN5 = this.j;
          if (j < arrayOfN5.length) {
            n5 n51 = arrayOfN5[j];
            int m = i;
            if (n51 != null)
              m = i + p4.b(3, n51); 
            j++;
            i = m;
            continue;
          } 
          j = i;
          break;
        } 
      } 
    } 
    i = j;
    if (!Arrays.equals(this.k, z4.e))
      i = j + p4.b(4, this.k); 
    j = i;
    if (!Arrays.equals(this.m, z4.e))
      j = i + p4.b(6, this.m); 
    j5 j51 = this.p;
    i = j;
    if (j51 != null)
      i = j + p4.b(7, j51); 
    String str3 = this.n;
    j = i;
    if (str3 != null) {
      j = i;
      if (!str3.equals(""))
        j = i + p4.b(8, this.n); 
    } 
    a5 a51 = this.l;
    i = j;
    if (a51 != null)
      i = j + m0.c(9, a51); 
    int k = this.h;
    j = i;
    if (k != 0)
      j = i + p4.c(11) + p4.d(k); 
    String str2 = this.o;
    i = j;
    if (str2 != null) {
      i = j;
      if (!str2.equals(""))
        i = j + p4.b(13, this.o); 
    } 
    str2 = this.q;
    j = i;
    if (str2 != null) {
      j = i;
      if (!str2.equals(""))
        j = i + p4.b(14, this.q); 
    } 
    l = this.r;
    i = j;
    if (l != 180000L)
      i = j + p4.c(15) + p4.c(p4.b(l)); 
    k5 k51 = this.s;
    j = i;
    if (k51 != null)
      j = i + p4.b(16, k51); 
    l = this.f;
    k = j;
    if (l != 0L)
      k = j + p4.b(17, l); 
    i = k;
    if (!Arrays.equals(this.t, z4.e))
      i = k + p4.b(18, this.t); 
    int[] arrayOfInt = this.v;
    j = i;
    if (arrayOfInt != null) {
      j = i;
      if (arrayOfInt.length > 0) {
        k = 0;
        j = bool;
        while (true) {
          arrayOfInt = this.v;
          if (j < arrayOfInt.length) {
            k += p4.d(arrayOfInt[j]);
            j++;
            continue;
          } 
          j = i + k + arrayOfInt.length * 2;
          break;
        } 
      } 
    } 
    b5 b51 = this.w;
    i = j;
    if (b51 != null)
      i = j + m0.c(23, b51); 
    String str1 = this.u;
    j = i;
    if (str1 != null) {
      j = i;
      if (!str1.equals(""))
        j = i + p4.b(24, this.u); 
    } 
    i = j;
    if (this.x)
      i = j + p4.c(25) + 1; 
    str1 = this.i;
    j = i;
    if (str1 != null) {
      j = i;
      if (!str1.equals(""))
        j = i + p4.b(26, this.i); 
    } 
    return j;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof m5))
      return false; 
    paramObject = paramObject;
    if (this.e != ((m5)paramObject).e)
      return false; 
    if (this.f != ((m5)paramObject).f)
      return false; 
    String str4 = this.g;
    if (str4 == null) {
      if (((m5)paramObject).g != null)
        return false; 
    } else if (!str4.equals(((m5)paramObject).g)) {
      return false;
    } 
    if (this.h != ((m5)paramObject).h)
      return false; 
    str4 = this.i;
    if (str4 == null) {
      if (((m5)paramObject).i != null)
        return false; 
    } else if (!str4.equals(((m5)paramObject).i)) {
      return false;
    } 
    if (!v4.a((Object[])this.j, (Object[])((m5)paramObject).j))
      return false; 
    if (!Arrays.equals(this.k, ((m5)paramObject).k))
      return false; 
    a5 a51 = this.l;
    if (a51 == null) {
      if (((m5)paramObject).l != null)
        return false; 
    } else if (!a51.equals(((m5)paramObject).l)) {
      return false;
    } 
    if (!Arrays.equals(this.m, ((m5)paramObject).m))
      return false; 
    String str3 = this.n;
    if (str3 == null) {
      if (((m5)paramObject).n != null)
        return false; 
    } else if (!str3.equals(((m5)paramObject).n)) {
      return false;
    } 
    str3 = this.o;
    if (str3 == null) {
      if (((m5)paramObject).o != null)
        return false; 
    } else if (!str3.equals(((m5)paramObject).o)) {
      return false;
    } 
    j5 j51 = this.p;
    if (j51 == null) {
      if (((m5)paramObject).p != null)
        return false; 
    } else if (!j51.equals(((m5)paramObject).p)) {
      return false;
    } 
    String str2 = this.q;
    if (str2 == null) {
      if (((m5)paramObject).q != null)
        return false; 
    } else if (!str2.equals(((m5)paramObject).q)) {
      return false;
    } 
    if (this.r != ((m5)paramObject).r)
      return false; 
    k5 k51 = this.s;
    if (k51 == null) {
      if (((m5)paramObject).s != null)
        return false; 
    } else if (!k51.equals(((m5)paramObject).s)) {
      return false;
    } 
    if (!Arrays.equals(this.t, ((m5)paramObject).t))
      return false; 
    String str1 = this.u;
    if (str1 == null) {
      if (((m5)paramObject).u != null)
        return false; 
    } else if (!str1.equals(((m5)paramObject).u)) {
      return false;
    } 
    if (!v4.a(this.v, ((m5)paramObject).v))
      return false; 
    b5 b51 = this.w;
    if (b51 == null) {
      if (((m5)paramObject).w != null)
        return false; 
    } else if (!b51.equals(((m5)paramObject).w)) {
      return false;
    } 
    if (this.x != ((m5)paramObject).x)
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
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i7 = m5.class.getName().hashCode();
    long l = this.e;
    int i8 = (int)(l ^ l >>> 32L);
    l = this.f;
    int i9 = (int)(l ^ l >>> 32L);
    String str4 = this.g;
    byte b = 0;
    if (str4 == null) {
      i = 0;
    } else {
      i = str4.hashCode();
    } 
    int i10 = this.h;
    str4 = this.i;
    if (str4 == null) {
      j = 0;
    } else {
      j = str4.hashCode();
    } 
    char c = 'ӕ';
    int i11 = v4.a((Object[])this.j);
    int i12 = Arrays.hashCode(this.k);
    a5 a51 = this.l;
    if (a51 == null) {
      k = 0;
    } else {
      k = a51.hashCode();
    } 
    int i13 = Arrays.hashCode(this.m);
    String str3 = this.n;
    if (str3 == null) {
      m = 0;
    } else {
      m = str3.hashCode();
    } 
    str3 = this.o;
    if (str3 == null) {
      n = 0;
    } else {
      n = str3.hashCode();
    } 
    j5 j51 = this.p;
    if (j51 == null) {
      i1 = 0;
    } else {
      i1 = j51.hashCode();
    } 
    String str2 = this.q;
    if (str2 == null) {
      i2 = 0;
    } else {
      i2 = str2.hashCode();
    } 
    l = this.r;
    int i14 = (int)(l ^ l >>> 32L);
    k5 k51 = this.s;
    if (k51 == null) {
      i3 = 0;
    } else {
      i3 = k51.hashCode();
    } 
    int i15 = Arrays.hashCode(this.t);
    String str1 = this.u;
    if (str1 == null) {
      i4 = 0;
    } else {
      i4 = str1.hashCode();
    } 
    int i16 = v4.a(this.v);
    b5 b51 = this.w;
    if (b51 == null) {
      i5 = 0;
    } else {
      i5 = b51.hashCode();
    } 
    if (this.x)
      c = 'ӏ'; 
    t4 t4 = this.d;
    int i6 = b;
    if (t4 != null)
      if (t4.a()) {
        i6 = b;
      } else {
        i6 = this.d.hashCode();
      }  
    return ((((((((((((((((((((((i7 + 527) * 31 + i8) * 31 + i9) * 31 * 31 + i) * 31 + i10) * 31 + j) * 31 * 31 + 1237) * 31 + i11) * 31 + i12) * 31 + k) * 31 + i13) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i14) * 31 + i3) * 31 + i15) * 31 + i4) * 31 * 31 + i16) * 31 * 31 + i5) * 31 + c) * 31 + i6;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/m5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */