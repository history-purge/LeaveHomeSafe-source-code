package e.e.f.j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class a extends ByteArrayOutputStream {
  public a(int paramInt) {
    super(paramInt);
  }
  
  public byte[] a() {
    byte[] arrayOfByte = this.buf;
    if (arrayOfByte.length == this.count)
      return arrayOfByte; 
    throw new IOException("Size supplied is too small");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */