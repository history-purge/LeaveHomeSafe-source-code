package e.e.k;

import e.e.e.d.a;
import e.e.e.d.i;
import e.e.e.d.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class d {
  private static d d;
  
  private int a;
  
  private List<c.a> b;
  
  private final c.a c = new a();
  
  private d() {
    b();
  }
  
  private static int a(int paramInt, InputStream paramInputStream, byte[] paramArrayOfbyte) {
    boolean bool;
    i.a(paramInputStream);
    i.a(paramArrayOfbyte);
    if (paramArrayOfbyte.length >= paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    if (paramInputStream.markSupported())
      try {
        paramInputStream.mark(paramInt);
        paramInt = a.a(paramInputStream, paramArrayOfbyte, 0, paramInt);
        return paramInt;
      } finally {
        paramInputStream.reset();
      }  
    return a.a(paramInputStream, paramArrayOfbyte, 0, paramInt);
  }
  
  public static d a() {
    // Byte code:
    //   0: ldc e/e/k/d
    //   2: monitorenter
    //   3: getstatic e/e/k/d.d : Le/e/k/d;
    //   6: ifnonnull -> 19
    //   9: new e/e/k/d
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/k/d.d : Le/e/k/d;
    //   19: getstatic e/e/k/d.d : Le/e/k/d;
    //   22: astore_0
    //   23: ldc e/e/k/d
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/k/d
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public static c b(InputStream paramInputStream) {
    return a().a(paramInputStream);
  }
  
  private void b() {
    this.a = this.c.a();
    List<c.a> list = this.b;
    if (list != null)
      for (c.a a1 : list)
        this.a = Math.max(this.a, a1.a());  
  }
  
  public static c c(InputStream paramInputStream) {
    try {
      return b(paramInputStream);
    } catch (IOException iOException) {
      n.a(iOException);
      throw null;
    } 
  }
  
  public c a(InputStream paramInputStream) {
    i.a(paramInputStream);
    int i = this.a;
    byte[] arrayOfByte = new byte[i];
    i = a(i, paramInputStream, arrayOfByte);
    c c = this.c.a(arrayOfByte, i);
    if (c != null && c != c.b)
      return c; 
    List<c.a> list = this.b;
    if (list != null) {
      Iterator<c.a> iterator = list.iterator();
      while (iterator.hasNext()) {
        c c1 = ((c.a)iterator.next()).a(arrayOfByte, i);
        if (c1 != null && c1 != c.b)
          return c1; 
      } 
    } 
    return c.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */