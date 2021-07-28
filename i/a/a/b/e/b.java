package i.a.a.b.e;

import i.a.a.h.d;

public class b {
  protected c a;
  
  protected d b;
  
  public b(c paramc) {
    this.a = paramc;
    this.b = null;
  }
  
  protected int a(int paramInt1, int paramInt2) {
    byte b1;
    if (paramInt1 % paramInt2 > 0) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    return paramInt1 / paramInt2 + b1;
  }
  
  protected void a(byte[] paramArrayOfbyte) {
    if (this.b == null)
      this.b = new a(this.a.a()); 
    this.b.b(paramArrayOfbyte);
  }
  
  protected void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1 + 0] = (byte)(paramInt2 / 16777216);
    paramArrayOfbyte[paramInt1 + 1] = (byte)(paramInt2 / 65536);
    paramArrayOfbyte[paramInt1 + 2] = (byte)(paramInt2 / 256);
    paramArrayOfbyte[paramInt1 + 3] = (byte)paramInt2;
  }
  
  protected void a(byte[] paramArrayOfbyte1, int paramInt1, d paramd, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    int i = paramd.a();
    byte[] arrayOfByte2 = new byte[i];
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte2.length + 4];
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte1, 0, paramArrayOfbyte2.length);
    a(arrayOfByte1, paramArrayOfbyte2.length, paramInt3);
    paramInt3 = 0;
    paramArrayOfbyte2 = arrayOfByte1;
    while (paramInt3 < paramInt2) {
      paramArrayOfbyte2 = paramd.a(paramArrayOfbyte2);
      a(arrayOfByte2, paramArrayOfbyte2);
      paramInt3++;
    } 
    System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte1, paramInt1, i);
  }
  
  protected void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    for (int i = 0; i < paramArrayOfbyte1.length; i++)
      paramArrayOfbyte1[i] = (byte)(paramArrayOfbyte1[i] ^ paramArrayOfbyte2[i]); 
  }
  
  protected byte[] a(d paramd, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      paramArrayOfbyte = new byte[0]; 
    int k = paramd.a();
    int m = a(paramInt2, k);
    byte[] arrayOfByte = new byte[m * k];
    int i = 1;
    int j = 0;
    while (i <= m) {
      a(arrayOfByte, j, paramd, paramArrayOfbyte, paramInt1, i);
      j += k;
      i++;
    } 
    if (paramInt2 - (m - 1) * k < k) {
      byte[] arrayOfByte1 = new byte[paramInt2];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, paramInt2);
      return arrayOfByte1;
    } 
    return arrayOfByte;
  }
  
  public byte[] a(char[] paramArrayOfchar, int paramInt) {
    if (paramArrayOfchar != null) {
      a(d.a(paramArrayOfchar));
      int i = paramInt;
      if (paramInt == 0)
        i = this.b.a(); 
      return a(this.b, this.a.c(), this.a.b(), i);
    } 
    throw new NullPointerException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */