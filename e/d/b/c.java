package e.d.b;

public class c {
  public static int a(byte[] paramArrayOfbyte) {
    byte b1 = paramArrayOfbyte[0];
    byte b2 = paramArrayOfbyte[1];
    byte b3 = paramArrayOfbyte[2];
    return paramArrayOfbyte[3] & 0xFF | b1 << 24 & 0xFF000000 | b2 << 16 & 0xFF0000 | b3 << 8 & 0xFF00;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */