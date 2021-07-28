package b.e.b.k;

import b.e.b.c;
import b.e.b.i;
import java.util.HashSet;
import java.util.Iterator;

public class d {
  private HashSet<d> a = null;
  
  public final e b;
  
  public final b c;
  
  public d d;
  
  public int e = 0;
  
  int f = -1;
  
  i g;
  
  public d(e parame, b paramb) {
    this.b = parame;
    this.c = paramb;
  }
  
  public int a() {
    if (this.b.y() == 8)
      return 0; 
    if (this.f > -1) {
      d d1 = this.d;
      if (d1 != null && d1.b.y() == 8)
        return this.f; 
    } 
    return this.e;
  }
  
  public void a(c paramc) {
    i i1 = this.g;
    if (i1 == null) {
      this.g = new i(i.a.c, null);
      return;
    } 
    i1.a();
  }
  
  public boolean a(d paramd) {
    boolean bool2 = false;
    if (paramd == null)
      return false; 
    b b1 = paramd.f();
    b b2 = this.c;
    if (b1 == b2)
      return !(b2 == b.h && (!paramd.c().C() || !c().C())); 
    switch (a.a[b2.ordinal()]) {
      default:
        throw new AssertionError(this.c.name());
      case 6:
      case 7:
      case 8:
      case 9:
        return false;
      case 4:
      case 5:
        if (b1 == b.e || b1 == b.g) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        bool2 = bool1;
        return (paramd.c() instanceof g) ? ((bool1 || b1 == b.k)) : bool2;
      case 2:
      case 3:
        if (b1 == b.d || b1 == b.f) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        bool2 = bool1;
        return (paramd.c() instanceof g) ? ((bool1 || b1 == b.j)) : bool2;
      case 1:
        break;
    } 
    boolean bool1 = bool2;
    if (b1 != b.h) {
      bool1 = bool2;
      if (b1 != b.j) {
        bool1 = bool2;
        if (b1 != b.k)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public boolean a(d paramd, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramd == null) {
      i();
      return true;
    } 
    if (!paramBoolean && !a(paramd))
      return false; 
    this.d = paramd;
    paramd = this.d;
    if (paramd.a == null)
      paramd.a = new HashSet<d>(); 
    this.d.a.add(this);
    if (paramInt1 > 0) {
      this.e = paramInt1;
    } else {
      this.e = 0;
    } 
    this.f = paramInt2;
    return true;
  }
  
  public final d b() {
    switch (a.a[this.c.ordinal()]) {
      default:
        throw new AssertionError(this.c.name());
      case 5:
        return this.b.z;
      case 4:
        return this.b.B;
      case 3:
        return this.b.y;
      case 2:
        return this.b.A;
      case 1:
      case 6:
      case 7:
      case 8:
      case 9:
        break;
    } 
    return null;
  }
  
  public e c() {
    return this.b;
  }
  
  public i d() {
    return this.g;
  }
  
  public d e() {
    return this.d;
  }
  
  public b f() {
    return this.c;
  }
  
  public boolean g() {
    HashSet<d> hashSet = this.a;
    if (hashSet == null)
      return false; 
    Iterator<d> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      if (((d)iterator.next()).b().h())
        return true; 
    } 
    return false;
  }
  
  public boolean h() {
    return (this.d != null);
  }
  
  public void i() {
    d d1 = this.d;
    if (d1 != null) {
      HashSet<d> hashSet = d1.a;
      if (hashSet != null)
        hashSet.remove(this); 
    } 
    this.d = null;
    this.e = 0;
    this.f = -1;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.g());
    stringBuilder.append(":");
    stringBuilder.append(this.c.toString());
    return stringBuilder.toString();
  }
  
  public enum b {
    c, d, e, f, g, h, i, j, k;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */