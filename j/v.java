package j;

import java.nio.charset.Charset;

final class v {
  public static final Charset a = Charset.forName("UTF-8");
  
  public static int a(int paramInt) {
    return (paramInt & 0xFF) << 24 | (0xFF000000 & paramInt) >>> 24 | (0xFF0000 & paramInt) >>> 8 | (0xFF00 & paramInt) << 8;
  }
  
  public static short a(short paramShort) {
    int i = paramShort & 0xFFFF;
    return (short)((i & 0xFF) << 8 | (0xFF00 & i) >>> 8);
  }
  
  public static void a(long paramLong1, long paramLong2, long paramLong3) {
    if ((paramLong2 | paramLong3) >= 0L && paramLong2 <= paramLong1 && paramLong1 - paramLong2 >= paramLong3)
      return; 
    throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) }));
  }
  
  public static void a(Throwable paramThrowable) {
    b(paramThrowable);
    throw null;
  }
  
  public static boolean a(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    int i;
    for (i = 0; i < paramInt3; i++) {
      if (paramArrayOfbyte1[i + paramInt1] != paramArrayOfbyte2[i + paramInt2])
        return false; 
    } 
    return true;
  }
  
  private static <T extends Throwable> void b(Throwable paramThrowable) throws T {
    throw (T)paramThrowable;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */