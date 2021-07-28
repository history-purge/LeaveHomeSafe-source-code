package e.f.a.e.i.n;

public enum j1 implements k3 {
  c(0),
  d(1),
  e(2),
  f(3),
  g(4),
  h(5),
  i(6),
  j(7),
  k(8),
  l(9),
  m(10),
  n(11),
  o(12),
  p(13);
  
  private final int zzp;
  
  static {
    new m1();
  }
  
  j1(int paramInt1) {
    this.zzp = paramInt1;
  }
  
  public static j1 f(int paramInt) {
    switch (paramInt) {
      default:
        return null;
      case 13:
        return p;
      case 12:
        return o;
      case 11:
        return n;
      case 10:
        return m;
      case 9:
        return l;
      case 8:
        return k;
      case 7:
        return j;
      case 6:
        return i;
      case 5:
        return h;
      case 4:
        return g;
      case 3:
        return f;
      case 2:
        return e;
      case 1:
        return d;
      case 0:
        break;
    } 
    return c;
  }
  
  public static m3 zzb() {
    return l1.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(j1.class.getName());
    stringBuilder.append('@');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" number=");
    stringBuilder.append(this.zzp);
    stringBuilder.append(" name=");
    stringBuilder.append(name());
    stringBuilder.append('>');
    return stringBuilder.toString();
  }
  
  public final int zza() {
    return this.zzp;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/j1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */