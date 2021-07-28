package e.e.l.n;

import e.e.l.e.e;
import e.e.l.k.d;

public final class x0 {
  public static int a(int paramInt) {
    return (int)(paramInt * 1.3333334F);
  }
  
  public static boolean a(int paramInt1, int paramInt2, e parame) {
    paramInt1 = a(paramInt1);
    return (parame == null) ? ((paramInt1 >= 2048.0F && a(paramInt2) >= 2048)) : ((paramInt1 >= parame.a && a(paramInt2) >= parame.b));
  }
  
  public static boolean a(d paramd, e parame) {
    if (paramd == null)
      return false; 
    int i = paramd.v();
    if (i != 90 && i != 270) {
      i = paramd.z();
      int k = paramd.r();
      return a(i, k, parame);
    } 
    i = paramd.r();
    int j = paramd.z();
    return a(i, j, parame);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */