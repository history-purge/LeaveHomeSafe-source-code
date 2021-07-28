package e.e.f;

import java.nio.charset.Charset;

public class g {
  private static final Charset b = Charset.forName("UTF-8");
  
  private byte[] a;
  
  private g(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }
  
  public static g a(String paramString) {
    return new g(paramString.getBytes(b));
  }
  
  public byte[] a() {
    return this.a;
  }
  
  static {
    Charset.forName("UTF-16");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */