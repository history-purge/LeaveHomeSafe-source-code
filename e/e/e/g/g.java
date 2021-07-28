package e.e.e.g;

import java.io.Closeable;

public interface g extends Closeable {
  byte a(int paramInt);
  
  int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3);
  
  boolean isClosed();
  
  int size();
  
  public static class a extends RuntimeException {
    public a() {
      super("Invalid bytebuf. Already closed");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */