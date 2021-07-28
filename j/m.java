package j;

import java.io.IOException;

public final class m {
  final long a;
  
  final c b = new c();
  
  boolean c;
  
  boolean d;
  
  private final s e = new a(this);
  
  private final t f = new b(this);
  
  public m(long paramLong) {
    if (paramLong >= 1L) {
      this.a = paramLong;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("maxBufferSize < 1: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final s a() {
    return this.e;
  }
  
  public final t b() {
    return this.f;
  }
  
  final class a implements s {
    final u c = new u();
    
    a(m this$0) {}
    
    public void close() {
      synchronized (this.d.b) {
        if (this.d.c)
          return; 
        if (!this.d.d || this.d.b.s() <= 0L) {
          this.d.c = true;
          this.d.b.notifyAll();
          return;
        } 
        throw new IOException("source is closed");
      } 
    }
    
    public void flush() {
      synchronized (this.d.b) {
        if (!this.d.c) {
          if (!this.d.d || this.d.b.s() <= 0L)
            return; 
          throw new IOException("source is closed");
        } 
        throw new IllegalStateException("closed");
      } 
    }
    
    public u timeout() {
      return this.c;
    }
    
    public void write(c param1c, long param1Long) {
      synchronized (this.d.b) {
        if (!this.d.c) {
          while (param1Long > 0L) {
            if (!this.d.d) {
              long l = this.d.a - this.d.b.s();
              if (l == 0L) {
                this.c.waitUntilNotified(this.d.b);
                continue;
              } 
              l = Math.min(l, param1Long);
              this.d.b.write(param1c, l);
              param1Long -= l;
              this.d.b.notifyAll();
              continue;
            } 
            throw new IOException("source is closed");
          } 
          return;
        } 
        throw new IllegalStateException("closed");
      } 
    }
  }
  
  final class b implements t {
    final u c = new u();
    
    b(m this$0) {}
    
    public void close() {
      synchronized (this.d.b) {
        this.d.d = true;
        this.d.b.notifyAll();
        return;
      } 
    }
    
    public long read(c param1c, long param1Long) {
      synchronized (this.d.b) {
        if (!this.d.d) {
          while (this.d.b.s() == 0L) {
            if (this.d.c)
              return -1L; 
            this.c.waitUntilNotified(this.d.b);
          } 
          param1Long = this.d.b.read(param1c, param1Long);
          this.d.b.notifyAll();
          return param1Long;
        } 
        throw new IllegalStateException("closed");
      } 
    }
    
    public u timeout() {
      return this.c;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */