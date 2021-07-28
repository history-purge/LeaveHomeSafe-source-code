package e.f.a.e.i.d;

public enum a1 {
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
  c(0, c1.c, n1.g),
  d(1, c1.c, n1.f),
  e(2, c1.c, n1.e),
  f(3, c1.c, n1.e),
  g(4, c1.c, n1.d),
  h(5, c1.c, n1.e),
  i(6, c1.c, n1.d),
  j(7, c1.c, n1.h),
  k(8, c1.c, n1.i),
  l(9, c1.c, n1.l),
  m(10, c1.c, n1.j),
  n(11, c1.c, n1.d),
  o(12, c1.c, n1.k),
  p(13, c1.c, n1.d),
  q(14, c1.c, n1.e),
  r(15, c1.c, n1.d),
  s(16, c1.c, n1.e),
  t(17, c1.c, n1.l),
  u(18, c1.d, n1.g),
  v(19, c1.d, n1.f),
  w(20, c1.d, n1.e),
  x(21, c1.d, n1.e),
  y(22, c1.d, n1.d),
  z(23, c1.d, n1.e);
  
  private static final a1[] b0;
  
  private final int id;
  
  private final n1 zzix;
  
  private final c1 zziy;
  
  private final Class<?> zziz;
  
  private final boolean zzja;
  
  static {
    A = new a1("FIXED32_LIST", 24, 24, c1.d, n1.d);
    B = new a1("BOOL_LIST", 25, 25, c1.d, n1.h);
    C = new a1("STRING_LIST", 26, 26, c1.d, n1.i);
    D = new a1("MESSAGE_LIST", 27, 27, c1.d, n1.l);
    E = new a1("BYTES_LIST", 28, 28, c1.d, n1.j);
    F = new a1("UINT32_LIST", 29, 29, c1.d, n1.d);
    G = new a1("ENUM_LIST", 30, 30, c1.d, n1.k);
    H = new a1("SFIXED32_LIST", 31, 31, c1.d, n1.d);
    I = new a1("SFIXED64_LIST", 32, 32, c1.d, n1.e);
    J = new a1("SINT32_LIST", 33, 33, c1.d, n1.d);
    K = new a1("SINT64_LIST", 34, 34, c1.d, n1.e);
    L = new a1("DOUBLE_LIST_PACKED", 35, 35, c1.e, n1.g);
    M = new a1("FLOAT_LIST_PACKED", 36, 36, c1.e, n1.f);
    N = new a1("INT64_LIST_PACKED", 37, 37, c1.e, n1.e);
    O = new a1("UINT64_LIST_PACKED", 38, 38, c1.e, n1.e);
    P = new a1("INT32_LIST_PACKED", 39, 39, c1.e, n1.d);
    Q = new a1("FIXED64_LIST_PACKED", 40, 40, c1.e, n1.e);
    R = new a1("FIXED32_LIST_PACKED", 41, 41, c1.e, n1.d);
    S = new a1("BOOL_LIST_PACKED", 42, 42, c1.e, n1.h);
    T = new a1("UINT32_LIST_PACKED", 43, 43, c1.e, n1.d);
    U = new a1("ENUM_LIST_PACKED", 44, 44, c1.e, n1.k);
    V = new a1("SFIXED32_LIST_PACKED", 45, 45, c1.e, n1.d);
    W = new a1("SFIXED64_LIST_PACKED", 46, 46, c1.e, n1.e);
    X = new a1("SINT32_LIST_PACKED", 47, 47, c1.e, n1.d);
    Y = new a1("SINT64_LIST_PACKED", 48, 48, c1.e, n1.e);
    Z = new a1("GROUP_LIST", 49, 49, c1.d, n1.l);
    a0 = new a1("MAP", 50, 50, c1.f, n1.c);
    a1 a11 = c;
    int i = 0;
    c0 = new a1[] { 
        a11, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C, D, E, F, 
        G, H, I, J, K, L, M, N, O, P, 
        Q, R, S, T, U, V, W, X, Y, Z, 
        a0 };
    a1[] arrayOfA1 = values();
    b0 = new a1[arrayOfA1.length];
    int j = arrayOfA1.length;
    while (i < j) {
      a1 a12 = arrayOfA1[i];
      b0[a12.id] = a12;
      i++;
    } 
  }
  
  a1(int paramInt1, c1 paramc1, n1 paramn1) {
    Class<?> clazz;
    this.id = paramInt1;
    this.zziy = paramc1;
    this.zzix = paramn1;
    this$enum$index = b1.a[paramc1.ordinal()];
    if (this$enum$index != 1 && this$enum$index != 2) {
      this$enum$name = null;
    } else {
      clazz = paramn1.a();
    } 
    this.zziz = clazz;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramc1 == c1.c) {
      this$enum$index = b1.b[paramn1.ordinal()];
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
    this.zzja = bool1;
  }
  
  public final int a() {
    return this.id;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */