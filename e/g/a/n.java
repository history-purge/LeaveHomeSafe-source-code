package e.g.a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

class n extends h {
  ServerSocketChannel d;
  
  n(ServerSocketChannel paramServerSocketChannel) {
    super(paramServerSocketChannel);
    this.d = paramServerSocketChannel;
  }
  
  public int a(ByteBuffer[] paramArrayOfByteBuffer) {
    throw new IOException("Can't write ServerSocketChannel");
  }
  
  public SelectionKey a(Selector paramSelector) {
    return this.d.register(paramSelector, 16);
  }
  
  public boolean a() {
    return false;
  }
  
  public int read(ByteBuffer paramByteBuffer) {
    throw new IOException("Can't read ServerSocketChannel");
  }
  
  public long read(ByteBuffer[] paramArrayOfByteBuffer) {
    throw new IOException("Can't read ServerSocketChannel");
  }
  
  public long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    throw new IOException("Can't read ServerSocketChannel");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */