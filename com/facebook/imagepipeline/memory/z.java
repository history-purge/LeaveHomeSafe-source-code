package com.facebook.imagepipeline.memory;

import e.e.e.d.i;
import e.e.e.g.g;
import e.e.e.g.j;
import e.e.e.h.c;

public class z extends j {
  private final v c;
  
  private e.e.e.h.a<u> d;
  
  private int e;
  
  public z(v paramv) {
    this(paramv, paramv.d());
  }
  
  public z(v paramv, int paramInt) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    i.a(paramv);
    this.c = paramv;
    this.e = 0;
    this.d = e.e.e.h.a.a(this.c.get(paramInt), (c)this.c);
  }
  
  private void b() {
    if (e.e.e.h.a.c(this.d))
      return; 
    throw new a();
  }
  
  public x a() {
    b();
    return new x(this.d, this.e);
  }
  
  void b(int paramInt) {
    b();
    if (paramInt <= ((u)this.d.b()).b())
      return; 
    u u = this.c.get(paramInt);
    ((u)this.d.b()).a(0, u, 0, this.e);
    this.d.close();
    this.d = e.e.e.h.a.a(u, (c)this.c);
  }
  
  public void close() {
    e.e.e.h.a.b(this.d);
    this.d = null;
    this.e = -1;
    super.close();
  }
  
  public int size() {
    return this.e;
  }
  
  public void write(int paramInt) {
    write(new byte[] { (byte)paramInt });
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt2 >= 0 && paramInt1 + paramInt2 <= paramArrayOfbyte.length) {
      b();
      b(this.e + paramInt2);
      ((u)this.d.b()).b(this.e, paramArrayOfbyte, paramInt1, paramInt2);
      this.e += paramInt2;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("length=");
    stringBuilder.append(paramArrayOfbyte.length);
    stringBuilder.append("; regionStart=");
    stringBuilder.append(paramInt1);
    stringBuilder.append("; regionLength=");
    stringBuilder.append(paramInt2);
    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public static class a extends RuntimeException {
    public a() {
      super("OutputStream no longer valid");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */