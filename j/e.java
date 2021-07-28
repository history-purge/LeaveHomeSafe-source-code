package j;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface e extends t, ReadableByteChannel {
  long a(byte paramByte);
  
  String a(Charset paramCharset);
  
  void a(c paramc, long paramLong);
  
  boolean a(long paramLong, f paramf);
  
  f c(long paramLong);
  
  boolean d(long paramLong);
  
  byte[] e(long paramLong);
  
  c f();
  
  String f(long paramLong);
  
  String g();
  
  void g(long paramLong);
  
  byte[] h();
  
  int i();
  
  boolean j();
  
  short k();
  
  long l();
  
  long m();
  
  InputStream n();
  
  byte readByte();
  
  void readFully(byte[] paramArrayOfbyte);
  
  int readInt();
  
  long readLong();
  
  short readShort();
  
  void skip(long paramLong);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */