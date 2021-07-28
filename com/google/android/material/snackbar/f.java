package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class f {
  private static f e;
  
  private final Object a = new Object();
  
  private final Handler b = new Handler(Looper.getMainLooper(), new a(this));
  
  private c c;
  
  private c d;
  
  static f a() {
    if (e == null)
      e = new f(); 
    return e;
  }
  
  private boolean a(c paramc, int paramInt) {
    b b = paramc.a.get();
    if (b != null) {
      this.b.removeCallbacksAndMessages(paramc);
      b.a(paramInt);
      return true;
    } 
    return false;
  }
  
  private void b(c paramc) {
    int i = paramc.b;
    if (i == -2)
      return; 
    if (i <= 0)
      if (i == -1) {
        i = 1500;
      } else {
        i = 2750;
      }  
    this.b.removeCallbacksAndMessages(paramc);
    Handler handler = this.b;
    handler.sendMessageDelayed(Message.obtain(handler, 0, paramc), i);
  }
  
  private boolean c(b paramb) {
    c c1 = this.c;
    return (c1 != null && c1.a(paramb));
  }
  
  public void a(b paramb) {
    synchronized (this.a) {
      if (c(paramb) && !this.c.c) {
        this.c.c = true;
        this.b.removeCallbacksAndMessages(this.c);
      } 
      return;
    } 
  }
  
  void a(c paramc) {
    synchronized (this.a) {
      if (this.c == paramc || this.d == paramc)
        a(paramc, 2); 
      return;
    } 
  }
  
  public void b(b paramb) {
    synchronized (this.a) {
      if (c(paramb) && this.c.c) {
        this.c.c = false;
        b(this.c);
      } 
      return;
    } 
  }
  
  class a implements Handler.Callback {
    a(f this$0) {}
    
    public boolean handleMessage(Message param1Message) {
      if (param1Message.what != 0)
        return false; 
      this.a.a((f.c)param1Message.obj);
      return true;
    }
  }
  
  static interface b {
    void a(int param1Int);
  }
  
  private static class c {
    final WeakReference<f.b> a;
    
    int b;
    
    boolean c;
    
    boolean a(f.b param1b) {
      return (param1b != null && this.a.get() == param1b);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/snackbar/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */