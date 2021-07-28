package j;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class n implements d {
  public final c c = new c();
  
  public final s d;
  
  boolean e;
  
  n(s params) {
    if (params != null) {
      this.d = params;
      return;
    } 
    throw new NullPointerException("sink == null");
  }
  
  public long a(t paramt) {
    if (paramt != null) {
      long l = 0L;
      while (true) {
        long l1 = paramt.read(this.c, 8192L);
        if (l1 != -1L) {
          l += l1;
          p();
          continue;
        } 
        return l;
      } 
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("source == null");
    throw illegalArgumentException;
  }
  
  public d a(f paramf) {
    if (!this.e) {
      this.c.a(paramf);
      p();
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  public d a(String paramString) {
    if (!this.e) {
      this.c.a(paramString);
      return p();
    } 
    throw new IllegalStateException("closed");
  }
  
  public void close() {
    Exception exception1;
    Exception exception2;
    if (this.e)
      return; 
    try {
      if (this.c.d > 0L)
        this.d.write(this.c, this.c.d); 
      exception1 = null;
    } finally {}
    try {
    
    } finally {
      Exception exception = null;
      exception2 = exception1;
    } 
    this.e = true;
    if (exception2 == null)
      return; 
    v.a(exception2);
    throw null;
  }
  
  public c f() {
    return this.c;
  }
  
  public void flush() {
    if (!this.e) {
      c c1 = this.c;
      long l = c1.d;
      if (l > 0L)
        this.d.write(c1, l); 
      this.d.flush();
      return;
    } 
    throw new IllegalStateException("closed");
  }
  
  public d h(long paramLong) {
    if (!this.e) {
      this.c.h(paramLong);
      return p();
    } 
    throw new IllegalStateException("closed");
  }
  
  public d i(long paramLong) {
    if (!this.e) {
      this.c.i(paramLong);
      p();
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  public boolean isOpen() {
    return this.e ^ true;
  }
  
  public d o() {
    if (!this.e) {
      long l = this.c.s();
      if (l > 0L)
        this.d.write(this.c, l); 
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  public d p() {
    if (!this.e) {
      long l = this.c.b();
      if (l > 0L)
        this.d.write(this.c, l); 
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  public OutputStream q() {
    return new a(this);
  }
  
  public u timeout() {
    return this.d.timeout();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("buffer(");
    stringBuilder.append(this.d);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public int write(ByteBuffer paramByteBuffer) {
    if (!this.e) {
      int i = this.c.write(paramByteBuffer);
      p();
      return i;
    } 
    throw new IllegalStateException("closed");
  }
  
  public d write(byte[] paramArrayOfbyte) {
    if (!this.e) {
      this.c.write(paramArrayOfbyte);
      p();
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  public d write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.e) {
      this.c.write(paramArrayOfbyte, paramInt1, paramInt2);
      p();
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  public void write(c paramc, long paramLong) {
    if (!this.e) {
      this.c.write(paramc, paramLong);
      p();
      return;
    } 
    throw new IllegalStateException("closed");
  }
  
  public d writeByte(int paramInt) {
    if (!this.e) {
      this.c.writeByte(paramInt);
      return p();
    } 
    throw new IllegalStateException("closed");
  }
  
  public d writeInt(int paramInt) {
    if (!this.e) {
      this.c.writeInt(paramInt);
      return p();
    } 
    throw new IllegalStateException("closed");
  }
  
  public d writeShort(int paramInt) {
    if (!this.e) {
      this.c.writeShort(paramInt);
      p();
      return this;
    } 
    throw new IllegalStateException("closed");
  }
  
  class a extends OutputStream {
    a(n this$0) {}
    
    public void close() {
      this.c.close();
    }
    
    public void flush() {
      n n1 = this.c;
      if (!n1.e)
        n1.flush(); 
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.c);
      stringBuilder.append(".outputStream()");
      return stringBuilder.toString();
    }
    
    public void write(int param1Int) {
      n n1 = this.c;
      if (!n1.e) {
        n1.c.writeByte((byte)param1Int);
        this.c.p();
        return;
      } 
      throw new IOException("closed");
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      n n1 = this.c;
      if (!n1.e) {
        n1.c.write(param1ArrayOfbyte, param1Int1, param1Int2);
        this.c.p();
        return;
      } 
      throw new IOException("closed");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */