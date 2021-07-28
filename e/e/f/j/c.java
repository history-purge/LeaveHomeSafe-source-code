package e.e.f.j;

import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.OutputStream;

public class c extends OutputStream {
  private final OutputStream c;
  
  private final NativeGCMCipher d;
  
  private final int e;
  
  private final byte[] f;
  
  private final byte[] g;
  
  private boolean h = false;
  
  public c(OutputStream paramOutputStream, NativeGCMCipher paramNativeGCMCipher, byte[] paramArrayOfbyte, int paramInt) {
    this.c = paramOutputStream;
    this.d = paramNativeGCMCipher;
    this.g = new byte[paramInt];
    paramInt = this.d.b();
    if (paramArrayOfbyte == null) {
      paramArrayOfbyte = new byte[paramInt + 256];
    } else {
      int i = paramInt + 1;
      if (paramArrayOfbyte.length < i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("encryptBuffer cannot be smaller than ");
        stringBuilder.append(i);
        stringBuilder.append("B");
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    } 
    this.e = paramArrayOfbyte.length - paramInt;
    this.f = paramArrayOfbyte;
  }
  
  private void a() {
    if (this.h)
      return; 
    this.h = true;
    try {
      this.d.b(this.g, this.g.length);
      this.c.write(this.g);
      return;
    } finally {
      this.d.a();
    } 
  }
  
  public void close() {
    try {
      a();
      return;
    } finally {
      this.c.close();
    } 
  }
  
  public void flush() {
    this.c.flush();
  }
  
  public void write(int paramInt) {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramArrayOfbyte.length;
    int j = paramInt1 + paramInt2;
    if (i >= j) {
      j = this.e;
      i = paramInt2 / j;
      j = paramInt2 % j;
      paramInt2 = paramInt1;
      for (paramInt1 = 0; paramInt1 < i; paramInt1++) {
        int k = this.d.a(paramArrayOfbyte, paramInt2, this.e, this.f, 0);
        this.c.write(this.f, 0, k);
        paramInt2 += this.e;
      } 
      if (j > 0) {
        paramInt1 = this.d.a(paramArrayOfbyte, paramInt2, j, this.f, 0);
        this.c.write(this.f, 0, paramInt1);
      } 
      return;
    } 
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(j);
    throw arrayIndexOutOfBoundsException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */