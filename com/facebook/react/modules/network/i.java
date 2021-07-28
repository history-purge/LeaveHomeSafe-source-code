package com.facebook.react.modules.network;

import j.d;
import j.l;
import j.s;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class i extends RequestBody {
  private final RequestBody a;
  
  private final h b;
  
  private long c = 0L;
  
  public i(RequestBody paramRequestBody, h paramh) {
    this.a = paramRequestBody;
    this.b = paramh;
  }
  
  private s a(d paramd) {
    return l.a(new a(this, paramd.q()));
  }
  
  public long contentLength() {
    if (this.c == 0L)
      this.c = this.a.contentLength(); 
    return this.c;
  }
  
  public MediaType contentType() {
    return this.a.contentType();
  }
  
  public void writeTo(d paramd) {
    paramd = l.a(a(paramd));
    contentLength();
    this.a.writeTo(paramd);
    paramd.flush();
  }
  
  class a extends b {
    a(i this$0, OutputStream param1OutputStream) {
      super(param1OutputStream);
    }
    
    private void b() {
      boolean bool;
      long l1 = a();
      long l2 = this.d.contentLength();
      h h = i.a(this.d);
      if (l1 == l2) {
        bool = true;
      } else {
        bool = false;
      } 
      h.a(l1, l2, bool);
    }
    
    public void write(int param1Int) {
      super.write(param1Int);
      b();
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      super.write(param1ArrayOfbyte, param1Int1, param1Int2);
      b();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */