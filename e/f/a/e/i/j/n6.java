package e.f.a.e.i.j;

import java.util.List;

final class n6 extends o6 {
  final transient int e;
  
  final transient int f;
  
  n6(o6 paramo6, int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  final int a() {
    return this.zzc.a() + this.e;
  }
  
  public final o6 a(int paramInt1, int paramInt2) {
    f4.a(paramInt1, paramInt2, this.f);
    o6 o61 = this.zzc;
    int i = this.e;
    return o61.a(paramInt1 + i, paramInt2 + i);
  }
  
  final int f() {
    return this.zzc.a() + this.e + this.f;
  }
  
  public final Object get(int paramInt) {
    f4.a(paramInt, this.f, "index");
    return this.zzc.get(paramInt + this.e);
  }
  
  public final int size() {
    return this.f;
  }
  
  final Object[] zzb() {
    return this.zzc.zzb();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/n6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */