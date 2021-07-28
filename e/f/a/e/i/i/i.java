package e.f.a.e.i.i;

final class i<E> extends h<E> {
  static final h<Object> g = new i(new Object[0], 0);
  
  final transient Object[] e;
  
  private final transient int f;
  
  i(Object[] paramArrayOfObject, int paramInt) {
    this.e = paramArrayOfObject;
    this.f = paramInt;
  }
  
  final int a() {
    return 0;
  }
  
  final int a(Object[] paramArrayOfObject, int paramInt) {
    System.arraycopy(this.e, 0, paramArrayOfObject, 0, this.f);
    return this.f;
  }
  
  final int f() {
    return this.f;
  }
  
  public final E get(int paramInt) {
    k0.a(paramInt, this.f, "index");
    return (E)this.e[paramInt];
  }
  
  public final int size() {
    return this.f;
  }
  
  final Object[] zzb() {
    return this.e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */