package e.d.b;

public class e {
  public static int a(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      int j = (paramArrayOfbyte[paramInt] & 0xFF) << 24 | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 8;
      paramInt = paramArrayOfbyte[paramInt + 3] & 0xFF;
      return paramInt | j;
    } 
    int i = paramArrayOfbyte[paramInt] & 0xFF | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 16;
    paramInt = (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24;
    return paramInt | i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */