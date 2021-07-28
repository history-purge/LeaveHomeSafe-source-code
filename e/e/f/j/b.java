package e.e.f.j;

import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.InputStream;

public class b extends InputStream {
  private final d c;
  
  private final NativeGCMCipher d;
  
  private byte[] e;
  
  private boolean f = false;
  
  public b(InputStream paramInputStream, NativeGCMCipher paramNativeGCMCipher, int paramInt) {
    this.c = new d(paramInputStream, paramInt);
    this.d = paramNativeGCMCipher;
  }
  
  private void a() {
    if (this.f)
      return; 
    this.f = true;
    try {
      byte[] arrayOfByte = this.c.a();
      this.d.a(arrayOfByte, arrayOfByte.length);
      return;
    } finally {
      this.d.a();
    } 
  }
  
  public int available() {
    return this.c.available();
  }
  
  public void close() {
    try {
      a();
      return;
    } finally {
      this.c.close();
    } 
  }
  
  public void mark(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public int read() {
    throw new UnsupportedOperationException();
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramArrayOfbyte.length;
    int j = paramInt1 + paramInt2;
    if (i >= j) {
      paramInt2 = this.c.read(paramArrayOfbyte, paramInt1, paramInt2);
      if (paramInt2 == -1) {
        a();
        return -1;
      } 
      return this.d.a(paramArrayOfbyte, paramInt1, paramInt2, paramArrayOfbyte, paramInt1);
    } 
    throw new ArrayIndexOutOfBoundsException(j);
  }
  
  public void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/UnsupportedOperationException
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: athrow
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	10	finally
  }
  
  public long skip(long paramLong) {
    if (this.e == null)
      this.e = new byte[256]; 
    long l2 = 0L;
    long l1 = paramLong;
    paramLong = l2;
    while (l1 > 0L) {
      int i = (int)Math.min(l1, 256L);
      i = read(this.e, 0, i);
      if (i < 0)
        break; 
      l2 = i;
      paramLong += l2;
      l1 -= l2;
    } 
    l1 = paramLong;
    if (paramLong == 0L)
      l1 = -1L; 
    return l1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */