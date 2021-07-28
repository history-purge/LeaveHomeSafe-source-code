package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class k implements t {
  private final e c;
  
  private final Inflater d;
  
  private int e;
  
  private boolean f;
  
  k(e parame, Inflater paramInflater) {
    if (parame != null) {
      if (paramInflater != null) {
        this.c = parame;
        this.d = paramInflater;
        return;
      } 
      throw new IllegalArgumentException("inflater == null");
    } 
    throw new IllegalArgumentException("source == null");
  }
  
  private void b() {
    int i = this.e;
    if (i == 0)
      return; 
    i -= this.d.getRemaining();
    this.e -= i;
    this.c.skip(i);
  }
  
  public final boolean a() {
    if (!this.d.needsInput())
      return false; 
    b();
    if (this.d.getRemaining() == 0) {
      if (this.c.j())
        return true; 
      p p = (this.c.f()).c;
      int i = p.c;
      int j = p.b;
      this.e = i - j;
      this.d.setInput(p.a, j, this.e);
      return false;
    } 
    throw new IllegalStateException("?");
  }
  
  public void close() {
    if (this.f)
      return; 
    this.d.end();
    this.f = true;
    this.c.close();
  }
  
  public long read(c paramc, long paramLong) {
    if (paramLong >= 0L) {
      if (!this.f) {
        if (paramLong == 0L)
          return 0L; 
        while (true) {
          boolean bool = a();
          try {
            p p = paramc.b(1);
            int i = (int)Math.min(paramLong, (8192 - p.c));
            i = this.d.inflate(p.a, p.c, i);
            if (i > 0) {
              p.c += i;
              paramLong = paramc.d;
              long l = i;
              paramc.d = paramLong + l;
              return l;
            } 
            if (this.d.finished() || this.d.needsDictionary()) {
              b();
              if (p.b == p.c) {
                paramc.c = p.b();
                q.a(p);
              } 
              return -1L;
            } 
          } catch (DataFormatException dataFormatException) {
            throw new IOException(dataFormatException);
          } 
          if (!bool)
            continue; 
          throw new EOFException("source exhausted prematurely");
        } 
      } 
      throw new IllegalStateException("closed");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("byteCount < 0: ");
    stringBuilder.append(paramLong);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public u timeout() {
    return this.c.timeout();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */