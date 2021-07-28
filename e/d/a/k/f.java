package e.d.a.k;

import java.util.ArrayList;

public enum f {
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
  c((byte)-32, true),
  d((byte)-31, true),
  e((byte)-30, true),
  f((byte)-29, true),
  g((byte)-28, true),
  h((byte)-27, true),
  i((byte)-26, true),
  j((byte)-25, true),
  k((byte)-24, true),
  l((byte)-23, true),
  m((byte)-22, true),
  n((byte)-21, true),
  o((byte)-20, true),
  p((byte)-19, true),
  q((byte)-18, true),
  r((byte)-17, true),
  s((byte)-40, false),
  t((byte)-37, false),
  u((byte)-36, false),
  v((byte)-35, false),
  w((byte)-34, false),
  x((byte)-33, false),
  y((byte)-60, false),
  z((byte)-52, false);
  
  public final byte byteValue;
  
  public final boolean canContainMetadata;
  
  static {
    A = new f("SOF0", 24, (byte)-64, true);
    B = new f("SOF1", 25, (byte)-63, true);
    C = new f("SOF2", 26, (byte)-62, true);
    D = new f("SOF3", 27, (byte)-61, true);
    E = new f("SOF5", 28, (byte)-59, true);
    F = new f("SOF6", 29, (byte)-58, true);
    G = new f("SOF7", 30, (byte)-57, true);
    H = new f("JPG", 31, (byte)-56, true);
    I = new f("SOF9", 32, (byte)-55, true);
    J = new f("SOF10", 33, (byte)-54, true);
    K = new f("SOF11", 34, (byte)-53, true);
    L = new f("SOF13", 35, (byte)-51, true);
    M = new f("SOF14", 36, (byte)-50, true);
    N = new f("SOF15", 37, (byte)-49, true);
    O = new f("COM", 38, (byte)-2, true);
    P = new f[] { 
        c, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C, D, E, F, 
        G, H, I, J, K, L, M, N, O };
    ArrayList<f> arrayList = new ArrayList();
    f[] arrayOfF = f.class.getEnumConstants();
    int j = arrayOfF.length;
    while (i < j) {
      f f1 = arrayOfF[i];
      if (f1.canContainMetadata)
        arrayList.add(f1); 
      i++;
    } 
  }
  
  f(byte paramByte, boolean paramBoolean) {
    this.byteValue = paramByte;
    this.canContainMetadata = paramBoolean;
  }
  
  public static f a(byte paramByte) {
    for (f f1 : (f[])f.class.getEnumConstants()) {
      if (f1.byteValue == paramByte)
        return f1; 
    } 
    return null;
  }
  
  static {
    int i = 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */