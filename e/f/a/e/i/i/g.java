package e.f.a.e.i.i;

import java.util.List;

final class g extends h {
  final transient int e;
  
  final transient int f;
  
  g(h paramh, int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  final int a() {
    return this.zzc.a() + this.e;
  }
  
  public final h a(int paramInt1, int paramInt2) {
    k0.a(paramInt1, paramInt2, this.f);
    h h1 = this.zzc;
    int i = this.e;
    return h1.a(paramInt1 + i, paramInt2 + i);
  }
  
  final int f() {
    return this.zzc.a() + this.e + this.f;
  }
  
  public final Object get(int paramInt) {
    k0.a(paramInt, this.f, "index");
    return this.zzc.get(paramInt + this.e);
  }
  
  public final int size() {
    return this.f;
  }
  
  final Object[] zzb() {
    return this.zzc.zzb();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */