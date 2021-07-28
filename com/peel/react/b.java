package com.peel.react;

import android.util.SparseArray;
import e.g.a.f;
import e.g.a.g;
import e.g.a.i;
import e.g.a.q;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public final class b {
  private SparseArray<Object> a = new SparseArray();
  
  private WeakReference<a> b;
  
  private e.g.a.d c = e.g.a.d.d();
  
  private int d = 5000;
  
  public b(a parama) {
    this.b = new WeakReference<a>(parama);
  }
  
  private void a(Integer paramInteger, f paramf) {
    paramf.b(new a(this, paramInteger));
    paramf.a(new b(this, paramInteger));
    paramf.a(new c(this, paramInteger, paramf));
  }
  
  public void a() {
    for (int i = 0; i < this.a.size(); i++)
      a(Integer.valueOf(this.a.keyAt(i))); 
    this.a.clear();
  }
  
  public void a(Integer paramInteger) {
    Object object = this.a.get(paramInteger.intValue());
    if (object != null) {
      if (object instanceof f) {
        ((f)object).close();
        return;
      } 
      if (object instanceof e.g.a.e) {
        ((e.g.a.e)object).stop();
        return;
      } 
    } else {
      object = this.b.get();
      if (object != null)
        object.onError(paramInteger, "unable to find socket"); 
    } 
  }
  
  public void a(Integer paramInteger1, String paramString, Integer paramInteger2) {
    InetSocketAddress inetSocketAddress;
    if (paramString != null) {
      inetSocketAddress = new InetSocketAddress(InetAddress.getByName(paramString), paramInteger2.intValue());
    } else {
      inetSocketAddress = new InetSocketAddress(paramInteger2.intValue());
    } 
    this.c.a(inetSocketAddress, new e(this, paramInteger1, inetSocketAddress));
  }
  
  public void a(Integer paramInteger, byte[] paramArrayOfbyte) {
    Object object = this.a.get(paramInteger.intValue());
    if (object != null && object instanceof f)
      ((f)object).a(new g(paramArrayOfbyte)); 
  }
  
  public void b(Integer paramInteger1, String paramString, Integer paramInteger2) {
    InetSocketAddress inetSocketAddress;
    if (paramString != null) {
      inetSocketAddress = new InetSocketAddress(InetAddress.getByName(paramString), paramInteger2.intValue());
    } else {
      inetSocketAddress = new InetSocketAddress(paramInteger2.intValue());
    } 
    this.c.a(InetAddress.getByName(paramString), paramInteger2.intValue(), new d(this, paramInteger1, inetSocketAddress));
  }
  
  class a implements e.g.a.r.a {
    a(b this$0, Integer param1Integer) {}
    
    public void a(Exception param1Exception) {
      a a1 = b.a(this.b).get();
      if (a1 != null) {
        String str;
        Integer integer = this.a;
        if (param1Exception == null) {
          param1Exception = null;
        } else {
          str = param1Exception.getMessage();
        } 
        a1.onClose(integer, str);
      } 
    }
  }
  
  class b implements e.g.a.r.c {
    b(b this$0, Integer param1Integer) {}
    
    public void a(i param1i, g param1g) {
      a a = b.a(this.b).get();
      if (a != null)
        a.onData(this.a, param1g.b()); 
    }
  }
  
  class c implements e.g.a.r.a {
    c(b this$0, Integer param1Integer, f param1f) {}
    
    public void a(Exception param1Exception) {
      if (param1Exception != null) {
        a a1 = b.a(this.c).get();
        if (a1 != null)
          a1.onError(this.a, param1Exception.getMessage()); 
      } 
      this.b.close();
    }
  }
  
  class d implements e.g.a.r.d {
    d(b this$0, Integer param1Integer, InetSocketAddress param1InetSocketAddress) {}
    
    public void a(e.g.a.e param1e) {
      b.b(this.c).put(this.a.intValue(), param1e);
      a a = b.a(this.c).get();
      if (a != null)
        a.onConnect(this.a, this.b); 
    }
    
    public void a(f param1f) {
      InetSocketAddress inetSocketAddress;
      b b2 = this.c;
      b.a(b2, Integer.valueOf(b.c(b2)), param1f);
      b.b(this.c).put(b.c(this.c), param1f);
      e.g.a.b b1 = (e.g.a.b)q.a(param1f, e.g.a.b.class);
      if (b1 != null) {
        inetSocketAddress = b1.e();
      } else {
        inetSocketAddress = this.b;
      } 
      a a = b.a(this.c).get();
      if (a != null)
        a.onConnection(this.a, Integer.valueOf(b.c(this.c)), inetSocketAddress); 
      b.d(this.c);
    }
    
    public void a(Exception param1Exception) {
      b.b(this.c).delete(this.a.intValue());
      a a = b.a(this.c).get();
      if (a != null) {
        Integer integer = this.a;
        if (param1Exception != null) {
          String str = param1Exception.getMessage();
        } else {
          param1Exception = null;
        } 
        a.onClose(integer, (String)param1Exception);
      } 
    }
  }
  
  class e implements e.g.a.r.b {
    e(b this$0, Integer param1Integer, InetSocketAddress param1InetSocketAddress) {}
    
    public void a(Exception param1Exception, f param1f) {
      a a = b.a(this.c).get();
      if (param1Exception == null) {
        b.b(this.c).put(this.a.intValue(), param1f);
        b.a(this.c, this.a, param1f);
        if (a != null) {
          a.onConnect(this.a, this.b);
          return;
        } 
      } else if (a != null) {
        a.onError(this.a, param1Exception.getMessage());
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/peel/react/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */