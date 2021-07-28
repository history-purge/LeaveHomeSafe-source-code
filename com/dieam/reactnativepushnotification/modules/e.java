package com.dieam.reactnativepushnotification.modules;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import e.e.l.e.d;
import e.e.l.o.d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
  private AtomicInteger a = new AtomicInteger(0);
  
  private Bitmap b;
  
  private Bitmap c;
  
  private c d;
  
  public e(c paramc) {
    this.d = paramc;
  }
  
  private void a() {
    synchronized (this.a) {
      if (this.a.incrementAndGet() >= 2 && this.d != null)
        this.d.a(this.b, this.c); 
      return;
    } 
  }
  
  private void a(Context paramContext, Uri paramUri, e.e.l.g.b paramb) {
    d d = d.b(paramUri);
    d.a(d.e);
    d.a(e.e.l.o.c.b.c);
    e.e.l.o.c c1 = d.a();
    if (!e.e.j.a.a.c.c())
      e.e.j.a.a.c.a(paramContext); 
    e.e.j.a.a.c.a().a(c1, paramContext).a((e.e.g.e)paramb, (Executor)e.e.e.b.a.a());
  }
  
  public void a(Context paramContext, String paramString) {
    if (paramString == null) {
      a(null);
      return;
    } 
    try {
      Uri uri = Uri.parse(paramString);
      a(paramContext, uri, new a(this, this));
      return;
    } catch (Exception exception) {
      Log.e("RNPushNotification", "Failed to parse bigPictureUrl", exception);
      a(null);
      return;
    } 
  }
  
  public void a(Bitmap paramBitmap) {
    this.c = paramBitmap;
    a();
  }
  
  public void b(Context paramContext, String paramString) {
    if (paramString == null) {
      b(null);
      return;
    } 
    try {
      Uri uri = Uri.parse(paramString);
      a(paramContext, uri, new b(this, this));
      return;
    } catch (Exception exception) {
      Log.e("RNPushNotification", "Failed to parse largeIconUrl", exception);
      b(null);
      return;
    } 
  }
  
  public void b(Bitmap paramBitmap) {
    this.b = paramBitmap;
    a();
  }
  
  class a extends e.e.l.g.b {
    a(e this$0, e param1e1) {}
    
    public void a(Bitmap param1Bitmap) {
      this.a.a(param1Bitmap);
    }
    
    public void e(e.e.g.c param1c) {
      this.a.a(null);
    }
  }
  
  class b extends e.e.l.g.b {
    b(e this$0, e param1e1) {}
    
    public void a(Bitmap param1Bitmap) {
      this.a.b(param1Bitmap);
    }
    
    public void e(e.e.g.c param1c) {
      this.a.b(null);
    }
  }
  
  static interface c {
    void a(Bitmap param1Bitmap1, Bitmap param1Bitmap2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */