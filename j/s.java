package j;

import java.io.Closeable;
import java.io.Flushable;

public interface s extends Closeable, Flushable {
  void close();
  
  void flush();
  
  u timeout();
  
  void write(c paramc, long paramLong);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */