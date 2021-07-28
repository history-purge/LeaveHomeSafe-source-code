package b.e.b.k;

import b.e.b.d;

public class j {
  static boolean[] a = new boolean[3];
  
  static void a(f paramf, d paramd, e parame) {
    parame.h = -1;
    parame.i = -1;
    if (paramf.J[0] != e.b.d && parame.J[0] == e.b.f) {
      int i = parame.y.e;
      int k = paramf.z() - parame.A.e;
      d d1 = parame.y;
      d1.g = paramd.a(d1);
      d1 = parame.A;
      d1.g = paramd.a(d1);
      paramd.a(parame.y.g, i);
      paramd.a(parame.A.g, k);
      parame.h = 2;
      parame.a(i, k);
    } 
    if (paramf.J[1] != e.b.d && parame.J[1] == e.b.f) {
      int i = parame.z.e;
      int k = paramf.j() - parame.B.e;
      d d1 = parame.z;
      d1.g = paramd.a(d1);
      d1 = parame.B;
      d1.g = paramd.a(d1);
      paramd.a(parame.z.g, i);
      paramd.a(parame.B.g, k);
      if (parame.R > 0 || parame.y() == 8) {
        d1 = parame.C;
        d1.g = paramd.a(d1);
        paramd.a(parame.C.g, parame.R + i);
      } 
      parame.i = 2;
      parame.c(i, k);
    } 
  }
  
  public static final boolean a(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) == paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */