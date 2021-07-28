package e.e.a.a.a;

import java.security.SecureRandom;

public class b extends SecureRandom {
  public void nextBytes(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic e : ()V
    //   5: aload_0
    //   6: aload_1
    //   7: invokespecial nextBytes : ([B)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	13	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */