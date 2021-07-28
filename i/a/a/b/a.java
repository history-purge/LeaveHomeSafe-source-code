package i.a.a.b;

import i.a.a.b.e.a;
import i.a.a.b.e.b;
import i.a.a.b.e.c;
import i.a.a.b.h.a;
import i.a.a.e.g;
import i.a.a.h.d;
import java.util.Arrays;

public class a implements c {
  private g a;
  
  private a b;
  
  private a c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private byte[] g;
  
  private byte[] h;
  
  private byte[] i;
  
  private byte[] j;
  
  private int k = 1;
  
  private byte[] l;
  
  private byte[] m;
  
  private int n = 0;
  
  public a(g paramg, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramg != null) {
      this.a = paramg;
      this.j = null;
      this.l = new byte[16];
      this.m = new byte[16];
      a(paramArrayOfbyte1, paramArrayOfbyte2);
      return;
    } 
    throw new i.a.a.c.a("one of the input parameters is null in AESDecryptor Constructor");
  }
  
  private void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    g g1 = this.a;
    if (g1 != null) {
      i.a.a.e.a a1 = g1.a();
      if (a1 != null) {
        StringBuilder stringBuilder;
        int i = a1.a();
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              this.d = 32;
              this.e = 32;
              this.f = 16;
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("invalid aes key strength for file: ");
              stringBuilder.append(this.a.h());
              throw new i.a.a.c.a(stringBuilder.toString());
            } 
          } else {
            this.d = 24;
            this.e = 24;
            i = 12;
            this.f = i;
          } 
        } else {
          this.d = 16;
          this.e = 16;
          i = 8;
          this.f = i;
        } 
        if (this.a.m() != null && (this.a.m()).length > 0) {
          byte[] arrayOfByte = a((byte[])stringBuilder, this.a.m());
          if (arrayOfByte != null) {
            i = arrayOfByte.length;
            int j = this.d;
            int k = this.e;
            if (i == j + k + 2) {
              this.g = new byte[j];
              this.h = new byte[k];
              this.i = new byte[2];
              System.arraycopy(arrayOfByte, 0, this.g, 0, j);
              System.arraycopy(arrayOfByte, this.d, this.h, 0, this.e);
              System.arraycopy(arrayOfByte, this.d + this.e, this.i, 0, 2);
              arrayOfByte = this.i;
              if (arrayOfByte != null) {
                if (Arrays.equals(paramArrayOfbyte2, arrayOfByte)) {
                  this.b = new a(this.g);
                  this.c = new a("HmacSHA1");
                  this.c.b(this.h);
                  return;
                } 
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Wrong Password for file: ");
                stringBuilder1.append(this.a.h());
                throw new i.a.a.c.a(stringBuilder1.toString(), 5);
              } 
              throw new i.a.a.c.a("invalid derived password verifier for AES");
            } 
          } 
          throw new i.a.a.c.a("invalid derived key");
        } 
        throw new i.a.a.c.a("empty or null password provided for AES Decryptor");
      } 
      throw new i.a.a.c.a("invalid aes extra data record - in init method of AESDecryptor");
    } 
    throw new i.a.a.c.a("invalid file header in init method of AESDecryptor");
  }
  
  private byte[] a(byte[] paramArrayOfbyte, char[] paramArrayOfchar) {
    try {
      return (new b(new c("HmacSHA1", "ISO-8859-1", paramArrayOfbyte, 1000))).a(paramArrayOfchar, this.d + this.e + 2);
    } catch (Exception exception) {
      throw new i.a.a.c.a(exception);
    } 
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.b != null) {
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
          try {
            this.n = j;
            this.c.a(paramArrayOfbyte, i, this.n);
            d.a(this.l, this.k, 16);
            this.b.a(this.l, this.m);
            for (j = 0; j < this.n; j++) {
              int m = i + j;
              paramArrayOfbyte[m] = (byte)(paramArrayOfbyte[m] ^ this.m[j]);
            } 
            this.k++;
            i = k;
          } catch (i.a.a.c.a a2) {
            throw a2;
          } catch (Exception exception) {
            throw new i.a.a.c.a(exception);
          } 
          continue;
        } 
        return paramInt2;
      } 
    } 
    i.a.a.c.a a1 = new i.a.a.c.a("AES not initialized properly");
    throw a1;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.j = paramArrayOfbyte;
  }
  
  public byte[] a() {
    return this.c.b();
  }
  
  public int b() {
    return 2;
  }
  
  public int c() {
    return this.f;
  }
  
  public byte[] d() {
    return this.j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */