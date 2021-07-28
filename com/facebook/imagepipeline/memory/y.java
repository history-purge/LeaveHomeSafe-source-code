package com.facebook.imagepipeline.memory;

import e.e.e.d.n;
import e.e.e.g.g;
import e.e.e.g.h;
import e.e.e.g.j;
import e.e.e.g.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class y implements h {
  private final k a;
  
  private final v b;
  
  public y(v paramv, k paramk) {
    this.b = paramv;
    this.a = paramk;
  }
  
  public x a(InputStream paramInputStream) {
    z z = new z(this.b);
    try {
      return a(paramInputStream, z);
    } finally {
      z.close();
    } 
  }
  
  public x a(InputStream paramInputStream, int paramInt) {
    z z = new z(this.b, paramInt);
    try {
      return a(paramInputStream, z);
    } finally {
      z.close();
    } 
  }
  
  x a(InputStream paramInputStream, z paramz) {
    this.a.a(paramInputStream, (OutputStream)paramz);
    return paramz.a();
  }
  
  public x a(byte[] paramArrayOfbyte) {
    z z = new z(this.b, paramArrayOfbyte.length);
    try {
      z.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      x x = z.a();
      z.close();
      return x;
    } catch (IOException iOException) {
      n.a(iOException);
      throw null;
    } finally {}
    z.close();
    throw paramArrayOfbyte;
  }
  
  public z a() {
    return new z(this.b);
  }
  
  public z a(int paramInt) {
    return new z(this.b, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */