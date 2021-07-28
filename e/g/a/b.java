package e.g.a;

import android.util.Log;
import e.g.a.r.a;
import e.g.a.r.c;
import e.g.a.r.e;
import e.g.a.t.a;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

public class b implements f {
  InetSocketAddress a;
  
  private h b;
  
  private SelectionKey c;
  
  private d d;
  
  private g e = new g();
  
  a f;
  
  boolean g;
  
  e h;
  
  c i;
  
  a j;
  
  boolean k;
  
  private a l;
  
  boolean m = false;
  
  private void a(int paramInt) {
    if (this.c.isValid()) {
      SelectionKey selectionKey;
      if (paramInt > 0) {
        selectionKey = this.c;
        paramInt = 5;
      } else {
        selectionKey = this.c;
        paramInt = 1;
      } 
      selectionKey.interestOps(paramInt);
      return;
    } 
    throw new IOException(new CancelledKeyException());
  }
  
  private void h() {
    if (this.e.c())
      q.a(this, this.e); 
  }
  
  void a(d paramd, SelectionKey paramSelectionKey) {
    this.d = paramd;
    this.c = paramSelectionKey;
  }
  
  public void a(g paramg) {
    if (this.d.a() != Thread.currentThread()) {
      this.d.b(new a(this, paramg));
      return;
    } 
    if (!this.b.a())
      return; 
    try {
      int i = paramg.e();
      ByteBuffer[] arrayOfByteBuffer = paramg.a();
      this.b.a(arrayOfByteBuffer);
      paramg.a(arrayOfByteBuffer);
      a(paramg.e());
      this.d.b(i - paramg.e());
      return;
    } catch (IOException iOException) {
      d();
      c(iOException);
      a(iOException);
      return;
    } 
  }
  
  public void a(a parama) {
    this.l = parama;
  }
  
  public void a(c paramc) {
    this.i = paramc;
  }
  
  protected void a(Exception paramException) {
    if (this.g)
      return; 
    this.g = true;
    a a1 = this.j;
    if (a1 != null) {
      a1.a(paramException);
      this.j = null;
    } 
  }
  
  void a(SocketChannel paramSocketChannel, InetSocketAddress paramInetSocketAddress) {
    this.a = paramInetSocketAddress;
    this.f = new a();
    this.b = new o(paramSocketChannel);
  }
  
  public void b(a parama) {
    this.j = parama;
  }
  
  void b(Exception paramException) {
    if (this.k)
      return; 
    this.k = true;
    a a1 = this.l;
    if (a1 != null) {
      a1.a(paramException);
      return;
    } 
    if (paramException != null)
      Log.e("NIO", "Unhandled exception", paramException); 
  }
  
  public boolean b() {
    return this.m;
  }
  
  public c c() {
    return this.i;
  }
  
  void c(Exception paramException) {
    if (this.e.c())
      return; 
    b(paramException);
  }
  
  public void close() {
    d();
    a((Exception)null);
  }
  
  public void d() {
    this.c.cancel();
    try {
      this.b.close();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public InetSocketAddress e() {
    return this.a;
  }
  
  public void f() {
    e e1 = this.h;
    if (e1 != null)
      e1.a(); 
  }
  
  int g() {
    h();
    boolean bool = this.m;
    byte b1 = 0;
    int i = 0;
    if (bool)
      return 0; 
    int j = b1;
    try {
      ByteBuffer byteBuffer = this.f.a();
      j = b1;
      long l = this.b.read(byteBuffer);
      if (l < 0L) {
        j = b1;
        d();
        b1 = 1;
      } else {
        i = (int)(0L + l);
        b1 = 0;
      } 
      if (l > 0L) {
        j = i;
        this.f.a(l);
        j = i;
        byteBuffer.flip();
        j = i;
        this.e.a(byteBuffer);
        j = i;
        q.a(this, this.e);
      } else {
        j = i;
        g.b(byteBuffer);
      } 
      j = i;
      if (b1 != 0) {
        j = i;
        c(null);
        j = i;
        a((Exception)null);
        return i;
      } 
    } catch (Exception exception) {
      d();
      c(exception);
      a(exception);
    } 
    return j;
  }
  
  class a implements Runnable {
    a(b this$0, g param1g) {}
    
    public void run() {
      this.d.a(this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */