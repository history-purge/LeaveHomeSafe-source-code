package org.reactnative.camera.g;

import android.os.AsyncTask;
import e.f.c.b;
import e.f.c.c;
import e.f.c.h;
import e.f.c.i;
import e.f.c.j;
import e.f.c.k;
import e.f.c.n;
import e.f.c.s.j;

public class a extends AsyncTask<Void, Void, n> {
  private byte[] a;
  
  private int b;
  
  private int c;
  
  private b d;
  
  private final i e;
  
  private boolean f;
  
  private float g;
  
  private float h;
  
  private float i;
  
  private float j;
  
  private int k;
  
  private int l;
  
  private float m;
  
  public a(b paramb, i parami, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt3, int paramInt4, float paramFloat5) {
    this.a = paramArrayOfbyte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramb;
    this.e = parami;
    this.f = paramBoolean;
    this.g = paramFloat1;
    this.h = paramFloat2;
    this.i = paramFloat3;
    this.j = paramFloat4;
    this.k = paramInt3;
    this.l = paramInt4;
    this.m = paramFloat5;
  }
  
  private c a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    k k;
    if (this.f) {
      k = new k(paramArrayOfbyte, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, false);
    } else {
      k = new k((byte[])k, paramInt1, paramInt2, 0, 0, paramInt1, paramInt2, false);
    } 
    if (paramBoolean) {
      j j1 = new j(k.d());
      return new c((b)j1);
    } 
    j j = new j((h)k);
    return new c((b)j);
  }
  
  private byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    int j;
    for (j = 0; j < paramInt2; j++) {
      int k;
      for (k = 0; k < paramInt1; k++)
        arrayOfByte[k * paramInt2 + paramInt2 - j - 1] = paramArrayOfbyte[j * paramInt1 + k]; 
    } 
    return arrayOfByte;
  }
  
  protected n a(Void... paramVarArgs) {
    if (!isCancelled()) {
      if (this.d == null)
        return null; 
      int j = (int)(this.l / this.m);
      int n = this.k;
      float f2 = ((j - n) / 2);
      float f3 = this.h;
      float f4 = n;
      float f1 = j;
      f2 = (f2 + f3 * f4) / f1;
      f3 = this.g;
      int i1 = this.b;
      j = (int)(f3 * i1);
      int i2 = this.c;
      int k = (int)(f2 * i2);
      int m = (int)(this.i * i1);
      n = (int)(this.j * n / f1 * i2);
      try {
        return this.e.a(c);
      } catch (j j1) {
        byte[] arrayOfByte = a(this.a, this.b, this.c);
        i1 = this.c;
      } finally {
        paramVarArgs = null;
        paramVarArgs.printStackTrace();
      } 
      return (n)paramVarArgs;
    } 
    return null;
  }
  
  protected void a(n paramn) {
    super.onPostExecute(paramn);
    if (paramn != null)
      this.d.a(paramn, this.b, this.c, this.a); 
    this.d.b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */