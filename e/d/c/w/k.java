package e.d.c.w;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.n;
import e.d.c.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class k implements d {
  public Iterable<f> a() {
    return Arrays.asList(new f[] { 
          f.A, f.B, f.C, f.D, f.E, f.F, f.G, f.I, f.J, f.K, 
          f.L, f.M, f.N });
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    Iterator<byte> iterator = paramIterable.iterator();
    while (iterator.hasNext())
      a((byte[])iterator.next(), parame, paramf); 
  }
  
  public void a(byte[] paramArrayOfbyte, e parame, f paramf) {
    i i = new i();
    parame.a(i);
    i.a(-3, paramf.byteValue - f.A.byteValue);
    n n = new n(paramArrayOfbyte);
    try {
      short s = n.j();
      int j = 0;
      i.a(0, s);
      i.a(1, n.h());
      i.a(3, n.h());
      s = n.j();
      i.a(5, s);
      while (j < s) {
        i.a(j + 6, new f(n.j(), n.j(), n.j()));
        j++;
      } 
    } catch (IOException iOException) {
      i.a(iOException.getMessage());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */