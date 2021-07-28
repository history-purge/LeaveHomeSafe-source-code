package i.a.a.b;

import i.a.a.b.e.a;
import i.a.a.b.e.b;
import i.a.a.b.e.c;
import i.a.a.b.h.a;
import i.a.a.c.a;
import i.a.a.h.d;
import java.util.Random;

public class b implements d {
  private char[] a;
  
  private int b;
  
  private a c;
  
  private a d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private byte[] h;
  
  private byte[] i;
  
  private byte[] j;
  
  private byte[] k;
  
  private boolean l;
  
  private int m = 1;
  
  private int n = 0;
  
  private byte[] o;
  
  private byte[] p;
  
  public b(char[] paramArrayOfchar, int paramInt) {
    if (paramArrayOfchar != null && paramArrayOfchar.length != 0) {
      if (paramInt == 1 || paramInt == 3) {
        this.a = paramArrayOfchar;
        this.b = paramInt;
        this.l = false;
        this.p = new byte[16];
        this.o = new byte[16];
        d();
        return;
      } 
      throw new a("Invalid key strength in AES encrypter constructor");
    } 
    throw new a("input password is empty or null in AES encrypter constructor");
  }
  
  private static byte[] a(int paramInt) {
    if (paramInt == 8 || paramInt == 16) {
      byte b1;
      int i = 0;
      if (paramInt == 8) {
        b1 = 2;
      } else {
        b1 = 0;
      } 
      if (paramInt == 16)
        b1 = 4; 
      byte[] arrayOfByte = new byte[paramInt];
      for (paramInt = i; paramInt < b1; paramInt++) {
        i = (new Random()).nextInt();
        int j = paramInt * 4;
        arrayOfByte[j + 0] = (byte)(i >> 24);
        arrayOfByte[j + 1] = (byte)(i >> 16);
        arrayOfByte[j + 2] = (byte)(i >> 8);
        arrayOfByte[j + 3] = (byte)i;
      } 
      return arrayOfByte;
    } 
    throw new a("invalid salt size, cannot generate salt");
  }
  
  private byte[] a(byte[] paramArrayOfbyte, char[] paramArrayOfchar) {
    try {
      return (new b(new c("HmacSHA1", "ISO-8859-1", paramArrayOfbyte, 1000))).a(paramArrayOfchar, this.e + this.f + 2);
    } catch (Exception exception) {
      throw new a(exception);
    } 
  }
  
  private void d() {
    int i = this.b;
    if (i != 1) {
      if (i == 3) {
        this.e = 32;
        this.f = 32;
        this.g = 16;
      } else {
        throw new a("invalid aes key strength, cannot determine key sizes");
      } 
    } else {
      this.e = 16;
      this.f = 16;
      this.g = 8;
    } 
    this.k = a(this.g);
    byte[] arrayOfByte = a(this.k, this.a);
    if (arrayOfByte != null) {
      i = arrayOfByte.length;
      int j = this.e;
      int k = this.f;
      if (i == j + k + 2) {
        this.h = new byte[j];
        this.i = new byte[k];
        this.j = new byte[2];
        System.arraycopy(arrayOfByte, 0, this.h, 0, j);
        System.arraycopy(arrayOfByte, this.e, this.i, 0, this.f);
        System.arraycopy(arrayOfByte, this.e + this.f, this.j, 0, 2);
        this.c = new a(this.h);
        this.d = new a("HmacSHA1");
        this.d.b(this.i);
        return;
      } 
    } 
    throw new a("invalid key generated, cannot decrypt file");
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.l) {
      if (paramInt2 % 16 != 0)
        this.l = true; 
      int i = paramInt1;
      while (true) {
        int j = paramInt1 + paramInt2;
        if (i < j) {
          int k = i + 16;
          if (k <= j) {
            j = 16;
          } else {
            j -= i;
          } 
          this.n = j;
          d.a(this.o, this.m, 16);
          this.c.a(this.o, this.p);
          j = 0;
          while (true) {
            int m = this.n;
            if (j < m) {
              m = i + j;
              paramArrayOfbyte[m] = (byte)(paramArrayOfbyte[m] ^ this.p[j]);
              j++;
              continue;
            } 
            this.d.a(paramArrayOfbyte, i, m);
            this.m++;
            i = k;
          } 
          break;
        } 
        return paramInt2;
      } 
    } 
    a a1 = new a("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
    throw a1;
  }
  
  public byte[] a() {
    return this.j;
  }
  
  public byte[] b() {
    byte[] arrayOfByte1 = this.d.b();
    byte[] arrayOfByte2 = new byte[10];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
    return arrayOfByte2;
  }
  
  public byte[] c() {
    return this.k;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */