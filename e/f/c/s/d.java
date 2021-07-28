package e.f.c.s;

import e.f.c.f;
import java.util.HashMap;
import java.util.Map;

public enum d {
  A,
  B,
  C,
  c(new int[] { 0, 2 }, new String[0]),
  d(new int[] { 1, 3 }, new String[] { "ISO-8859-1" }),
  e(4, new String[] { "ISO-8859-2" }),
  f(5, new String[] { "ISO-8859-3" }),
  g(6, new String[] { "ISO-8859-4" }),
  h(7, new String[] { "ISO-8859-5" }),
  i(8, new String[] { "ISO-8859-6" }),
  j(9, new String[] { "ISO-8859-7" }),
  k(10, new String[] { "ISO-8859-8" }),
  l(11, new String[] { "ISO-8859-9" }),
  m(12, new String[] { "ISO-8859-10" }),
  n(13, new String[] { "ISO-8859-11" }),
  o(15, new String[] { "ISO-8859-13" }),
  p(16, new String[] { "ISO-8859-14" }),
  q(17, new String[] { "ISO-8859-15" }),
  r(18, new String[] { "ISO-8859-16" }),
  s(20, new String[] { "Shift_JIS" }),
  t(21, new String[] { "windows-1250" }),
  u(22, new String[] { "windows-1251" }),
  v(23, new String[] { "windows-1252" }),
  w(24, new String[] { "windows-1256" }),
  x(25, new String[] { "UTF-16BE", "UnicodeBig" }),
  y(26, new String[] { "UTF-8" }),
  z(new int[] { 27, 170 }, new String[] { "US-ASCII" });
  
  private static final Map<Integer, d> D;
  
  private static final Map<String, d> E;
  
  private final String[] otherEncodingNames;
  
  private final int[] values;
  
  static {
    A = new d("Big5", 24, 28);
    B = new d("GB18030", 25, 29, new String[] { "GB2312", "EUC_CN", "GBK" });
    C = new d("EUC_KR", 26, 30, new String[] { "EUC-KR" });
    F = new d[] { 
        c, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C };
    D = new HashMap<Integer, d>();
    E = new HashMap<String, d>();
    for (d d1 : values()) {
      for (int i : d1.values)
        D.put(Integer.valueOf(i), d1); 
      E.put(d1.name(), d1);
      for (String str : d1.otherEncodingNames)
        E.put(str, d1); 
    } 
  }
  
  d(int paramInt1, String... paramVarArgs) {
    this.values = new int[] { paramInt1 };
    this.otherEncodingNames = paramVarArgs;
  }
  
  d(int[] paramArrayOfint, String... paramVarArgs) {
    this.values = paramArrayOfint;
    this.otherEncodingNames = paramVarArgs;
  }
  
  public static d f(int paramInt) {
    if (paramInt >= 0 && paramInt < 900)
      return D.get(Integer.valueOf(paramInt)); 
    throw f.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */