package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

public class a {
  private static a b;
  
  private Choreographer a = a();
  
  private Choreographer a() {
    return Choreographer.getInstance();
  }
  
  private void a(Choreographer.FrameCallback paramFrameCallback) {
    this.a.postFrameCallback(paramFrameCallback);
  }
  
  public static a b() {
    UiThreadUtil.assertOnUiThread();
    if (b == null)
      b = new a(); 
    return b;
  }
  
  private void b(Choreographer.FrameCallback paramFrameCallback) {
    this.a.removeFrameCallback(paramFrameCallback);
  }
  
  public void a(a parama) {
    a(parama.a());
  }
  
  public void b(a parama) {
    b(parama.a());
  }
  
  public static abstract class a {
    private Choreographer.FrameCallback a;
    
    Choreographer.FrameCallback a() {
      if (this.a == null)
        this.a = new a(this); 
      return this.a;
    }
    
    public abstract void a(long param1Long);
    
    class a implements Choreographer.FrameCallback {
      a(a.a this$0) {}
      
      public void doFrame(long param2Long) {
        this.a.a(param2Long);
      }
    }
  }
  
  class a implements Choreographer.FrameCallback {
    a(a this$0) {}
    
    public void doFrame(long param1Long) {
      this.a.a(param1Long);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */