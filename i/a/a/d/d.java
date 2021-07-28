package i.a.a.d;

import i.a.a.c.a;
import i.a.a.e.l;
import i.a.a.e.m;
import java.io.File;
import java.io.OutputStream;
import java.util.zip.Deflater;

public class d extends c {
  private byte[] p = new byte[4096];
  
  protected Deflater q = new Deflater();
  
  private boolean r = false;
  
  public d(OutputStream paramOutputStream, l paraml) {
    super(paramOutputStream, paraml);
  }
  
  private void c() {
    Deflater deflater = this.q;
    byte[] arrayOfByte = this.p;
    int i = deflater.deflate(arrayOfByte, 0, arrayOfByte.length);
    if (i > 0) {
      int j = i;
      if (this.q.finished()) {
        if (i == 4)
          return; 
        if (i < 4) {
          b(4 - i);
          return;
        } 
        j = i - 4;
      } 
      if (!this.r) {
        super.write(this.p, 2, j - 2);
        this.r = true;
        return;
      } 
      super.write(this.p, 0, j);
    } 
  }
  
  public void a() {
    if (this.h.c() == 8) {
      if (!this.q.finished()) {
        this.q.finish();
        while (!this.q.finished())
          c(); 
      } 
      this.r = false;
    } 
    super.a();
  }
  
  public void a(File paramFile, m paramm) {
    super.a(paramFile, paramm);
    if (paramm.c() == 8) {
      this.q.reset();
      if ((paramm.b() >= 0 && paramm.b() <= 9) || paramm.b() == -1) {
        this.q.setLevel(paramm.b());
        return;
      } 
      throw new a("invalid compression level for deflater. compression level should be in the range of 0-9");
    } 
  }
  
  public void b() {
    super.b();
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.h.c() != 8) {
      super.write(paramArrayOfbyte, paramInt1, paramInt2);
      return;
    } 
    this.q.setInput(paramArrayOfbyte, paramInt1, paramInt2);
    while (!this.q.needsInput())
      c(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */