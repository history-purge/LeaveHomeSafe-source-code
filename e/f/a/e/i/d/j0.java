package e.f.a.e.i.d;

public abstract class j0 {
  private j0() {}
  
  public static int a(int paramInt) {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public static long a(long paramLong) {
    return -(paramLong & 0x1L) ^ paramLong >>> 1L;
  }
  
  static j0 a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    l0 l0 = new l0(paramArrayOfbyte, 0, paramInt2, false, null);
    try {
      l0.b(paramInt2);
      return l0;
    } catch (l1 l1) {
      throw new IllegalArgumentException(l1);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */