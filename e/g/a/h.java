package e.g.a;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

abstract class h implements ReadableByteChannel, ScatteringByteChannel {
  private AbstractSelectableChannel c;
  
  h(AbstractSelectableChannel paramAbstractSelectableChannel) {
    paramAbstractSelectableChannel.configureBlocking(false);
    this.c = paramAbstractSelectableChannel;
  }
  
  public abstract int a(ByteBuffer[] paramArrayOfByteBuffer);
  
  public abstract boolean a();
  
  public void close() {
    this.c.close();
  }
  
  public boolean isOpen() {
    return this.c.isOpen();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */