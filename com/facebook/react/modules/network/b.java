package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class b extends FilterOutputStream {
  private long c = 0L;
  
  public b(OutputStream paramOutputStream) {
    super(paramOutputStream);
  }
  
  public long a() {
    return this.c;
  }
  
  public void close() {
    this.out.close();
  }
  
  public void write(int paramInt) {
    this.out.write(paramInt);
    this.c++;
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.out.write(paramArrayOfbyte, paramInt1, paramInt2);
    this.c += paramInt2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */