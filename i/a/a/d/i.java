package i.a.a.d;

import i.a.a.e.l;
import java.io.OutputStream;

public class i extends d {
  public i(OutputStream paramOutputStream, l paraml) {
    super(paramOutputStream, paraml);
  }
  
  public void write(int paramInt) {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.k.update(paramArrayOfbyte, paramInt1, paramInt2);
    c(paramInt2);
    super.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */