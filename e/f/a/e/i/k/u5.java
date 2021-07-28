package e.f.a.e.i.k;

public enum u5 {
  A,
  B,
  C,
  D,
  c(0),
  d(1),
  e(2),
  f(3),
  g(4),
  h(6),
  i(7),
  j(8),
  k(9),
  l(5),
  m(100),
  n(101),
  o(102),
  p(103),
  q(104),
  r(105),
  s(106),
  t(107),
  u(108),
  v(109),
  w(110),
  x(111),
  y(112),
  z(113);
  
  static {
    A = new u5("MODEL_NOT_REGISTERED", 24, 114);
    B = new u5("MODEL_TYPE_MISUSE", 25, 115);
    C = new u5("MODEL_HASH_MISMATCH", 26, 116);
    D = new u5("UNKNOWN_ERROR", 27, 9999);
    E = new u5[] { 
        c, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C, D };
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/u5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */