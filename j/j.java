package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class j implements t {
  private int c = 0;
  
  private final e d;
  
  private final Inflater e;
  
  private final k f;
  
  private final CRC32 g = new CRC32();
  
  public j(t paramt) {
    if (paramt != null) {
      this.e = new Inflater(true);
      this.d = l.a(paramt);
      this.f = new k(this.d, this.e);
      return;
    } 
    throw new IllegalArgumentException("source == null");
  }
  
  private void a() {
    boolean bool;
    this.d.g(10L);
    byte b = this.d.f().a(3L);
    if ((b >> 1 & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      a(this.d.f(), 0L, 10L); 
    a("ID1ID2", 8075, this.d.readShort());
    this.d.skip(8L);
    if ((b >> 2 & 0x1) == 1) {
      this.d.g(2L);
      if (bool)
        a(this.d.f(), 0L, 2L); 
      short s = this.d.f().k();
      e e1 = this.d;
      long l = s;
      e1.g(l);
      if (bool)
        a(this.d.f(), 0L, l); 
      this.d.skip(l);
    } 
    if ((b >> 3 & 0x1) == 1) {
      long l = this.d.a((byte)0);
      if (l != -1L) {
        if (bool)
          a(this.d.f(), 0L, l + 1L); 
        this.d.skip(l + 1L);
      } else {
        throw new EOFException();
      } 
    } 
    if ((b >> 4 & 0x1) == 1) {
      long l = this.d.a((byte)0);
      if (l != -1L) {
        if (bool)
          a(this.d.f(), 0L, l + 1L); 
        this.d.skip(l + 1L);
      } else {
        throw new EOFException();
      } 
    } 
    if (bool) {
      a("FHCRC", this.d.k(), (short)(int)this.g.getValue());
      this.g.reset();
    } 
  }
  
  private void a(c paramc, long paramLong1, long paramLong2) {
    p p = paramc.c;
    while (true) {
      int i = p.c;
      int m = p.b;
      if (paramLong1 >= (i - m)) {
        paramLong1 -= (i - m);
        p = p.f;
        continue;
      } 
      break;
    } 
    while (paramLong2 > 0L) {
      int i = (int)(p.b + paramLong1);
      int m = (int)Math.min((p.c - i), paramLong2);
      this.g.update(p.a, i, m);
      paramLong2 -= m;
      p = p.f;
      paramLong1 = 0L;
    } 
  }
  
  private void a(String paramString, int paramInt1, int paramInt2) {
    if (paramInt2 == paramInt1)
      return; 
    throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) }));
  }
  
  private void b() {
    a("CRC", this.d.i(), (int)this.g.getValue());
    a("ISIZE", this.d.i(), (int)this.e.getBytesWritten());
  }
  
  public void close() {
    this.f.close();
  }
  
  public long read(c paramc, long paramLong) {
    if (paramLong >= 0L) {
      if (paramLong == 0L)
        return 0L; 
      if (this.c == 0) {
        a();
        this.c = 1;
      } 
      if (this.c == 1) {
        long l = paramc.d;
        paramLong = this.f.read(paramc, paramLong);
        if (paramLong != -1L) {
          a(paramc, l, paramLong);
          return paramLong;
        } 
        this.c = 2;
      } 
      if (this.c == 2) {
        b();
        this.c = 3;
        if (this.d.j())
          return -1L; 
        throw new IOException("gzip finished without exhausting source");
      } 
      return -1L;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("byteCount < 0: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public u timeout() {
    return this.d.timeout();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */