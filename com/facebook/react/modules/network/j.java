package com.facebook.react.modules.network;

import j.c;
import j.e;
import j.h;
import j.l;
import j.t;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public class j extends ResponseBody {
  private final ResponseBody c;
  
  private final h d;
  
  private e e;
  
  private long f;
  
  public j(ResponseBody paramResponseBody, h paramh) {
    this.c = paramResponseBody;
    this.d = paramh;
    this.f = 0L;
  }
  
  private t b(t paramt) {
    return (t)new a(this, paramt);
  }
  
  public long a() {
    return this.f;
  }
  
  public long contentLength() {
    return this.c.contentLength();
  }
  
  public MediaType contentType() {
    return this.c.contentType();
  }
  
  public e source() {
    if (this.e == null)
      this.e = l.a(b((t)this.c.source())); 
    return this.e;
  }
  
  class a extends h {
    a(j this$0, t param1t) {
      super(param1t);
    }
    
    public long read(c param1c, long param1Long) {
      boolean bool;
      long l1 = super.read(param1c, param1Long);
      j j1 = this.c;
      long l2 = j.a(j1);
      if (l1 != -1L) {
        param1Long = l1;
      } else {
        param1Long = 0L;
      } 
      j.a(j1, l2 + param1Long);
      h h1 = j.c(this.c);
      param1Long = j.a(this.c);
      l2 = j.b(this.c).contentLength();
      if (l1 == -1L) {
        bool = true;
      } else {
        bool = false;
      } 
      h1.a(param1Long, l2, bool);
      return l1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */