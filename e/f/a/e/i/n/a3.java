package e.f.a.e.i.n;

public enum a3 {
  A,
  B,
  C,
  D,
  E,
  F,
  G,
  H,
  I,
  J,
  K,
  L,
  M,
  N,
  O,
  P,
  Q,
  R,
  S,
  T,
  U,
  V,
  W,
  X,
  Y,
  Z,
  a0,
  c(0, c3.c, s3.g),
  d(1, c3.c, s3.f),
  e(2, c3.c, s3.e),
  f(3, c3.c, s3.e),
  g(4, c3.c, s3.d),
  h(5, c3.c, s3.e),
  i(6, c3.c, s3.d),
  j(7, c3.c, s3.h),
  k(8, c3.c, s3.i),
  l(9, c3.c, s3.l),
  m(10, c3.c, s3.j),
  n(11, c3.c, s3.d),
  o(12, c3.c, s3.k),
  p(13, c3.c, s3.d),
  q(14, c3.c, s3.e),
  r(15, c3.c, s3.d),
  s(16, c3.c, s3.e),
  t(17, c3.c, s3.l),
  u(18, c3.d, s3.g),
  v(19, c3.d, s3.f),
  w(20, c3.d, s3.e),
  x(21, c3.d, s3.e),
  y(22, c3.d, s3.d),
  z(23, c3.d, s3.e);
  
  private static final a3[] b0;
  
  private final s3 zzaz;
  
  private final int zzba;
  
  private final c3 zzbb;
  
  private final Class<?> zzbc;
  
  private final boolean zzbd;
  
  static {
    A = new a3("FIXED32_LIST", 24, 24, c3.d, s3.d);
    B = new a3("BOOL_LIST", 25, 25, c3.d, s3.h);
    C = new a3("STRING_LIST", 26, 26, c3.d, s3.i);
    D = new a3("MESSAGE_LIST", 27, 27, c3.d, s3.l);
    E = new a3("BYTES_LIST", 28, 28, c3.d, s3.j);
    F = new a3("UINT32_LIST", 29, 29, c3.d, s3.d);
    G = new a3("ENUM_LIST", 30, 30, c3.d, s3.k);
    H = new a3("SFIXED32_LIST", 31, 31, c3.d, s3.d);
    I = new a3("SFIXED64_LIST", 32, 32, c3.d, s3.e);
    J = new a3("SINT32_LIST", 33, 33, c3.d, s3.d);
    K = new a3("SINT64_LIST", 34, 34, c3.d, s3.e);
    L = new a3("DOUBLE_LIST_PACKED", 35, 35, c3.e, s3.g);
    M = new a3("FLOAT_LIST_PACKED", 36, 36, c3.e, s3.f);
    N = new a3("INT64_LIST_PACKED", 37, 37, c3.e, s3.e);
    O = new a3("UINT64_LIST_PACKED", 38, 38, c3.e, s3.e);
    P = new a3("INT32_LIST_PACKED", 39, 39, c3.e, s3.d);
    Q = new a3("FIXED64_LIST_PACKED", 40, 40, c3.e, s3.e);
    R = new a3("FIXED32_LIST_PACKED", 41, 41, c3.e, s3.d);
    S = new a3("BOOL_LIST_PACKED", 42, 42, c3.e, s3.h);
    T = new a3("UINT32_LIST_PACKED", 43, 43, c3.e, s3.d);
    U = new a3("ENUM_LIST_PACKED", 44, 44, c3.e, s3.k);
    V = new a3("SFIXED32_LIST_PACKED", 45, 45, c3.e, s3.d);
    W = new a3("SFIXED64_LIST_PACKED", 46, 46, c3.e, s3.e);
    X = new a3("SINT32_LIST_PACKED", 47, 47, c3.e, s3.d);
    Y = new a3("SINT64_LIST_PACKED", 48, 48, c3.e, s3.e);
    Z = new a3("GROUP_LIST", 49, 49, c3.d, s3.l);
    a0 = new a3("MAP", 50, 50, c3.f, s3.c);
    a3 a31 = c;
    int i = 0;
    c0 = new a3[] { 
        a31, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C, D, E, F, 
        G, H, I, J, K, L, M, N, O, P, 
        Q, R, S, T, U, V, W, X, Y, Z, 
        a0 };
    a3[] arrayOfA3 = values();
    b0 = new a3[arrayOfA3.length];
    int j = arrayOfA3.length;
    while (i < j) {
      a3 a32 = arrayOfA3[i];
      b0[a32.zzba] = a32;
      i++;
    } 
  }
  
  a3(int paramInt1, c3 paramc3, s3 params3) {
    Class<?> clazz;
    this.zzba = paramInt1;
    this.zzbb = paramc3;
    this.zzaz = params3;
    this$enum$index = d3.a[paramc3.ordinal()];
    if (this$enum$index != 1 && this$enum$index != 2) {
      this$enum$name = null;
    } else {
      clazz = params3.zza();
    } 
    this.zzbc = clazz;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramc3 == c3.c) {
      this$enum$index = d3.b[params3.ordinal()];
      bool1 = bool2;
      if (this$enum$index != 1) {
        bool1 = bool2;
        if (this$enum$index != 2) {
          bool1 = bool2;
          if (this$enum$index != 3)
            bool1 = true; 
        } 
      } 
    } 
    this.zzbd = bool1;
  }
  
  public final int zza() {
    return this.zzba;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/a3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */