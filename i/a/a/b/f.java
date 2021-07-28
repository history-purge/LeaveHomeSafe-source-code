package i.a.a.b;

import i.a.a.b.h.b;
import i.a.a.c.a;

public class f implements c {
  private i.a.a.e.f a;
  
  private byte[] b = new byte[4];
  
  private b c;
  
  public f(i.a.a.e.f paramf, byte[] paramArrayOfbyte) {
    if (paramf != null) {
      this.a = paramf;
      this.c = new b();
      a(paramArrayOfbyte);
      return;
    } 
    throw new a("one of more of the input parameters were null in StandardDecryptor");
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt2 >= 0) {
      int i = paramInt1;
      while (i < paramInt1 + paramInt2) {
        byte b1 = paramArrayOfbyte[i];
        try {
          byte b3 = this.c.a();
          b b4 = this.c;
          byte b2 = (byte)((b1 & 0xFF ^ b3) & 0xFF);
          b4.a(b2);
          paramArrayOfbyte[i] = b2;
          i++;
        } catch (Exception exception) {
          throw new a(exception);
        } 
      } 
      return paramInt2;
    } 
    a a = new a("one of the input parameters were null in standard decrpyt data");
    throw a;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = this.a.e();
    byte[] arrayOfByte2 = this.b;
    arrayOfByte2[3] = (byte)(arrayOfByte1[3] & 0xFF);
    arrayOfByte2[2] = (byte)(arrayOfByte1[3] >> 8 & 0xFF);
    arrayOfByte2[1] = (byte)(arrayOfByte1[3] >> 16 & 0xFF);
    byte b1 = (byte)(arrayOfByte1[3] >> 24 & 0xFF);
    int i = 0;
    arrayOfByte2[0] = b1;
    if (arrayOfByte2[2] <= 0 && arrayOfByte2[1] <= 0 && arrayOfByte2[0] <= 0) {
      if (this.a.p() != null && (this.a.p()).length > 0) {
        this.c.a(this.a.p());
        byte b2 = paramArrayOfbyte[0];
        while (true) {
          if (i < 12) {
            try {
              this.c.a((byte)(this.c.a() ^ b2));
              int j = i + 1;
              i = j;
              if (j != 12) {
                b2 = paramArrayOfbyte[j];
                i = j;
              } 
            } catch (Exception exception) {
              throw new a(exception);
            } 
            continue;
          } 
          return;
        } 
      } 
      throw new a("Wrong password!", 5);
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Invalid CRC in File Header");
    throw illegalStateException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */