package okhttp3.internal.cache2;

import j.c;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

final class FileOperator {
  private final FileChannel fileChannel;
  
  FileOperator(FileChannel paramFileChannel) {
    this.fileChannel = paramFileChannel;
  }
  
  public void read(long paramLong1, c paramc, long paramLong2) {
    if (paramLong2 >= 0L) {
      while (paramLong2 > 0L) {
        long l = this.fileChannel.transferTo(paramLong1, paramLong2, (WritableByteChannel)paramc);
        paramLong1 += l;
        paramLong2 -= l;
      } 
      return;
    } 
    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    throw indexOutOfBoundsException;
  }
  
  public void write(long paramLong1, c paramc, long paramLong2) {
    if (paramLong2 >= 0L && paramLong2 <= paramc.s()) {
      long l = paramLong2;
      paramLong2 = paramLong1;
      for (paramLong1 = l; paramLong1 > 0L; paramLong1 -= l) {
        l = this.fileChannel.transferFrom((ReadableByteChannel)paramc, paramLong2, paramLong1);
        paramLong2 += l;
      } 
      return;
    } 
    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    throw indexOutOfBoundsException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/cache2/FileOperator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */