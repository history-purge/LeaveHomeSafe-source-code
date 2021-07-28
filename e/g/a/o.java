package e.g.a;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

class o extends h {
  SocketChannel d;
  
  o(SocketChannel paramSocketChannel) {
    super(paramSocketChannel);
    this.d = paramSocketChannel;
  }
  
  public int a(ByteBuffer[] paramArrayOfByteBuffer) {
    return (int)this.d.write(paramArrayOfByteBuffer);
  }
  
  public boolean a() {
    return this.d.isConnected();
  }
  
  public int read(ByteBuffer paramByteBuffer) {
    return this.d.read(paramByteBuffer);
  }
  
  public long read(ByteBuffer[] paramArrayOfByteBuffer) {
    return this.d.read(paramArrayOfByteBuffer);
  }
  
  public long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    return this.d.read(paramArrayOfByteBuffer, paramInt1, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */