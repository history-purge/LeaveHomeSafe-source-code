package e.f.a.e.i.n;

public abstract class m2 {
  private m2() {}
  
  public static int a(int paramInt) {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public static long a(long paramLong) {
    return -(paramLong & 0x1L) ^ paramLong >>> 1L;
  }
  
  static m2 a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    n2 n2 = new n2(paramArrayOfbyte, 0, paramInt2, false, null);
    try {
      n2.b(paramInt2);
      return n2;
    } catch (q3 q3) {
      throw new IllegalArgumentException(q3);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/m2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */