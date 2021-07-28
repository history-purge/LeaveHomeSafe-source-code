package e.e.f;

import e.e.f.i.a;
import e.e.f.j.a;
import e.e.f.k.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class c {
  private final a a;
  
  private final b b;
  
  private final d c;
  
  public c(a parama, b paramb, f paramf) {
    this.a = new a(parama, paramf);
    this.b = paramb;
    this.c = new e(this.b, this.a, paramf);
  }
  
  int a() {
    return this.c.a();
  }
  
  public InputStream a(InputStream paramInputStream, g paramg) {
    return this.c.a(paramInputStream, paramg);
  }
  
  public OutputStream a(OutputStream paramOutputStream, g paramg, byte[] paramArrayOfbyte) {
    return this.c.a(paramOutputStream, paramg, paramArrayOfbyte);
  }
  
  public byte[] a(byte[] paramArrayOfbyte, g paramg) {
    int i = paramArrayOfbyte.length;
    InputStream inputStream = a(new ByteArrayInputStream(paramArrayOfbyte), paramg);
    a a1 = new a(i - a());
    byte[] arrayOfByte = new byte[1024];
    while (true) {
      i = inputStream.read(arrayOfByte);
      if (i != -1) {
        a1.write(arrayOfByte, 0, i);
        continue;
      } 
      inputStream.close();
      return a1.a();
    } 
  }
  
  public boolean b() {
    try {
      return true;
    } finally {
      Exception exception = null;
    } 
  }
  
  public byte[] b(byte[] paramArrayOfbyte, g paramg) {
    a a1 = new a(paramArrayOfbyte.length + a());
    OutputStream outputStream = a((OutputStream)a1, paramg, null);
    outputStream.write(paramArrayOfbyte);
    outputStream.close();
    return a1.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */