package e.f.a.e.i.g;

import java.io.FilterInputStream;
import java.io.InputStream;

final class q extends FilterInputStream {
  private long c;
  
  private long d = -1L;
  
  q(InputStream paramInputStream, long paramLong) {
    super(paramInputStream);
    if (paramInputStream != null) {
      this.c = 1048577L;
      return;
    } 
    throw null;
  }
  
  public final int available() {
    return (int)Math.min(this.in.available(), this.c);
  }
  
  public final void mark(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield in : Ljava/io/InputStream;
    //   6: iload_1
    //   7: invokevirtual mark : (I)V
    //   10: aload_0
    //   11: aload_0
    //   12: getfield c : J
    //   15: putfield d : J
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public final int read() {
    if (this.c == 0L)
      return -1; 
    int i = this.in.read();
    if (i != -1)
      this.c--; 
    return i;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = this.c;
    if (l == 0L)
      return -1; 
    l = Math.min(paramInt2, l);
    paramInt1 = this.in.read(paramArrayOfbyte, paramInt1, (int)l);
    if (paramInt1 != -1)
      this.c -= paramInt1; 
    return paramInt1;
  }
  
  public final void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield in : Ljava/io/InputStream;
    //   6: invokevirtual markSupported : ()Z
    //   9: ifeq -> 51
    //   12: aload_0
    //   13: getfield d : J
    //   16: ldc2_w -1
    //   19: lcmp
    //   20: ifeq -> 41
    //   23: aload_0
    //   24: getfield in : Ljava/io/InputStream;
    //   27: invokevirtual reset : ()V
    //   30: aload_0
    //   31: aload_0
    //   32: getfield d : J
    //   35: putfield c : J
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: new java/io/IOException
    //   44: dup
    //   45: ldc 'Mark not set'
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: new java/io/IOException
    //   54: dup
    //   55: ldc 'Mark not supported'
    //   57: invokespecial <init> : (Ljava/lang/String;)V
    //   60: athrow
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Exception table:
    //   from	to	target	type
    //   2	38	61	finally
    //   41	51	61	finally
    //   51	61	61	finally
  }
  
  public final long skip(long paramLong) {
    paramLong = Math.min(paramLong, this.c);
    paramLong = this.in.skip(paramLong);
    this.c -= paramLong;
    return paramLong;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */