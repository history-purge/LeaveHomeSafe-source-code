package j;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

public interface d extends s, WritableByteChannel {
  long a(t paramt);
  
  d a(f paramf);
  
  d a(String paramString);
  
  c f();
  
  void flush();
  
  d h(long paramLong);
  
  d i(long paramLong);
  
  d o();
  
  d p();
  
  OutputStream q();
  
  d write(byte[] paramArrayOfbyte);
  
  d write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  d writeByte(int paramInt);
  
  d writeInt(int paramInt);
  
  d writeShort(int paramInt);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */