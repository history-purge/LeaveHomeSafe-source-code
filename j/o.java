package j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class o implements e {
  public final c c = new c();
  
  public final t d;
  
  boolean e;
  
  o(t paramt) {
    if (paramt != null) {
      this.d = paramt;
      return;
    } 
    throw new NullPointerException("source == null");
  }
  
  public long a(byte paramByte) {
    return a(paramByte, 0L, Long.MAX_VALUE);
  }
  
  public long a(byte paramByte, long paramLong1, long paramLong2) {
    if (!this.e) {
      if (paramLong1 >= 0L && paramLong2 >= paramLong1) {
        while (paramLong1 < paramLong2) {
          long l = this.c.a(paramByte, paramLong1, paramLong2);
          if (l != -1L)
            return l; 
          c c1 = this.c;
          l = c1.d;
          if (l < paramLong2) {
            if (this.d.read(c1, 8192L) == -1L)
              return -1L; 
            paramLong1 = Math.max(paramLong1, l);
          } 
        } 
        return -1L;
      } 
      throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
    } 
    IllegalStateException illegalStateException = new IllegalStateException("closed");
    throw illegalStateException;
  }
  
  public String a(Charset paramCharset) {
    if (paramCharset != null) {
      this.c.a(this.d);
      return this.c.a(paramCharset);
    } 
    throw new IllegalArgumentException("charset == null");
  }
  
  public void a(c paramc, long paramLong) {
    try {
      g(paramLong);
      this.c.a(paramc, paramLong);
      return;
    } catch (EOFException eOFException) {
      paramc.a(this.c);
      throw eOFException;
    } 
  }
  
  public boolean a(long paramLong, f paramf) {
    return a(paramLong, paramf, 0, paramf.s());
  }
  
  public boolean a(long paramLong, f paramf, int paramInt1, int paramInt2) {
    if (!this.e) {
      if (paramLong >= 0L && paramInt1 >= 0 && paramInt2 >= 0) {
        if (paramf.s() - paramInt1 < paramInt2)
          return false; 
        int i;
        for (i = 0; i < paramInt2; i++) {
          long l = i + paramLong;
          if (!d(1L + l))
            return false; 
          if (this.c.a(l) != paramf.f(paramInt1 + i))
            return false; 
        } 
        return true;
      } 
      return false;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("closed");
    throw illegalStateException;
  }
  
  public f c(long paramLong) {
    g(paramLong);
    return this.c.c(paramLong);
  }
  
  public void close() {
    if (this.e)
      return; 
    this.e = true;
    this.d.close();
    this.c.a();
  }
  
  public boolean d(long paramLong) {
    if (paramLong >= 0L) {
      if (!this.e)
        while (true) {
          c c1 = this.c;
          if (c1.d < paramLong) {
            if (this.d.read(c1, 8192L) == -1L)
              return false; 
            continue;
          } 
          return true;
        }  
      throw new IllegalStateException("closed");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("byteCount < 0: ");
    stringBuilder.append(paramLong);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public byte[] e(long paramLong) {
    g(paramLong);
    return this.c.e(paramLong);
  }
  
  public c f() {
    return this.c;
  }
  
  public String f(long paramLong) {
    if (paramLong >= 0L) {
      long l1;
      if (paramLong == Long.MAX_VALUE) {
        l1 = Long.MAX_VALUE;
      } else {
        l1 = paramLong + 1L;
      } 
      long l2 = a((byte)10, 0L, l1);
      if (l2 != -1L)
        return this.c.j(l2); 
      if (l1 < Long.MAX_VALUE && d(l1) && this.c.a(l1 - 1L) == 13 && d(1L + l1) && this.c.a(l1) == 10)
        return this.c.j(l1); 
      c c1 = new c();
      c c2 = this.c;
      c2.a(c1, 0L, Math.min(32L, c2.s()));
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("\\n not found: limit=");
      stringBuilder1.append(Math.min(this.c.s(), paramLong));
      stringBuilder1.append(" content=");
      stringBuilder1.append(c1.c().b());
      stringBuilder1.append('…');
      throw new EOFException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("limit < 0: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public String g() {
    return f(Long.MAX_VALUE);
  }
  
  public void g(long paramLong) {
    if (d(paramLong))
      return; 
    throw new EOFException();
  }
  
  public byte[] h() {
    this.c.a(this.d);
    return this.c.h();
  }
  
  public int i() {
    g(4L);
    return this.c.i();
  }
  
  public boolean isOpen() {
    return this.e ^ true;
  }
  
  public boolean j() {
    if (!this.e)
      return (this.c.j() && this.d.read(this.c, 8192L) == -1L); 
    throw new IllegalStateException("closed");
  }
  
  public short k() {
    g(2L);
    return this.c.k();
  }
  
  public long l() {
    g(1L);
    int i = 0;
    while (true) {
      int j = i + 1;
      if (d(j)) {
        byte b = this.c.a(i);
        if ((b < 48 || b > 57) && (i != 0 || b != 45)) {
          if (i != 0)
            break; 
          throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[] { Byte.valueOf(b) }));
        } 
        i = j;
        continue;
      } 
      break;
    } 
    return this.c.l();
  }
  
  public long m() {
    g(1L);
    int i = 0;
    while (true) {
      int j = i + 1;
      if (d(j)) {
        byte b = this.c.a(i);
        if ((b < 48 || b > 57) && (b < 97 || b > 102) && (b < 65 || b > 70)) {
          if (i != 0)
            break; 
          throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[] { Byte.valueOf(b) }));
        } 
        i = j;
        continue;
      } 
      break;
    } 
    return this.c.m();
  }
  
  public InputStream n() {
    return new a(this);
  }
  
  public int read(ByteBuffer paramByteBuffer) {
    c c1 = this.c;
    return (c1.d == 0L && this.d.read(c1, 8192L) == -1L) ? -1 : this.c.read(paramByteBuffer);
  }
  
  public long read(c paramc, long paramLong) {
    if (paramc != null) {
      if (paramLong >= 0L) {
        if (!this.e) {
          c c1 = this.c;
          if (c1.d == 0L && this.d.read(c1, 8192L) == -1L)
            return -1L; 
          paramLong = Math.min(paramLong, this.c.d);
          return this.c.read(paramc, paramLong);
        } 
        throw new IllegalStateException("closed");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(paramLong);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("sink == null");
  }
  
  public byte readByte() {
    g(1L);
    return this.c.readByte();
  }
  
  public void readFully(byte[] paramArrayOfbyte) {
    try {
      g(paramArrayOfbyte.length);
      this.c.readFully(paramArrayOfbyte);
      return;
    } catch (EOFException eOFException) {
      int i = 0;
      while (true) {
        c c1 = this.c;
        long l = c1.d;
        if (l > 0L) {
          int j = c1.a(paramArrayOfbyte, i, (int)l);
          if (j != -1) {
            i += j;
            continue;
          } 
          throw new AssertionError();
        } 
        throw eOFException;
      } 
    } 
  }
  
  public int readInt() {
    g(4L);
    return this.c.readInt();
  }
  
  public long readLong() {
    g(8L);
    return this.c.readLong();
  }
  
  public short readShort() {
    g(2L);
    return this.c.readShort();
  }
  
  public void skip(long paramLong) {
    if (!this.e) {
      while (paramLong > 0L) {
        c c1 = this.c;
        if (c1.d != 0L || this.d.read(c1, 8192L) != -1L) {
          long l = Math.min(paramLong, this.c.s());
          this.c.skip(l);
          paramLong -= l;
          continue;
        } 
        throw new EOFException();
      } 
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("closed");
    throw illegalStateException;
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
  
  class a extends InputStream {
    a(o this$0) {}
    
    public int available() {
      o o1 = this.c;
      if (!o1.e)
        return (int)Math.min(o1.c.d, 2147483647L); 
      throw new IOException("closed");
    }
    
    public void close() {
      this.c.close();
    }
    
    public int read() {
      o o1 = this.c;
      if (!o1.e) {
        c c = o1.c;
        return (c.d == 0L && o1.d.read(c, 8192L) == -1L) ? -1 : (this.c.c.readByte() & 0xFF);
      } 
      throw new IOException("closed");
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (!this.c.e) {
        v.a(param1ArrayOfbyte.length, param1Int1, param1Int2);
        o o1 = this.c;
        c c = o1.c;
        return (c.d == 0L && o1.d.read(c, 8192L) == -1L) ? -1 : this.c.c.a(param1ArrayOfbyte, param1Int1, param1Int2);
      } 
      throw new IOException("closed");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.c);
      stringBuilder.append(".inputStream()");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */