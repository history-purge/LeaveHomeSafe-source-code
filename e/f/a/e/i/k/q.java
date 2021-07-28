package e.f.a.e.i.k;

import java.util.List;

final class q extends r {
  final transient int e;
  
  final transient int f;
  
  q(r paramr, int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  final int a() {
    return this.zzc.a() + this.e;
  }
  
  public final r a(int paramInt1, int paramInt2) {
    e4.a(paramInt1, paramInt2, this.f);
    r r1 = this.zzc;
    int i = this.e;
    return r1.a(paramInt1 + i, paramInt2 + i);
  }
  
  final int f() {
    return this.zzc.a() + this.e + this.f;
  }
  
  public final Object get(int paramInt) {
    e4.a(paramInt, this.f, "index");
    return this.zzc.get(paramInt + this.e);
  }
  
  public final int size() {
    return this.f;
  }
  
  final Object[] zzb() {
    return this.zzc.zzb();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */