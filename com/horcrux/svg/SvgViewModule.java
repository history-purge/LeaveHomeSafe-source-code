package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

class SvgViewModule extends ReactContextBaseJavaModule {
  SvgViewModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private static void toDataURL(int paramInt1, ReadableMap paramReadableMap, Callback paramCallback, int paramInt2) {
    UiThreadUtil.runOnUiThread(new a(paramInt1, paramReadableMap, paramCallback, paramInt2));
  }
  
  public String getName() {
    return "RNSVGSvgViewManager";
  }
  
  @ReactMethod
  public void toDataURL(int paramInt, ReadableMap paramReadableMap, Callback paramCallback) {
    toDataURL(paramInt, paramReadableMap, paramCallback, 0);
  }
  
  class a implements Runnable {
    a(SvgViewModule this$0, ReadableMap param1ReadableMap, Callback param1Callback, int param1Int1) {}
    
    public void run() {
      f0 f0 = SvgViewManager.getSvgViewByTag(this.c);
      if (f0 == null) {
        SvgViewManager.runWhenViewIsAvailable(this.c, new a(this));
        return;
      } 
      if (f0.g()) {
        f0.setToDataUrlTask(new b(this));
        return;
      } 
      ReadableMap readableMap = this.d;
      if (readableMap != null) {
        this.e.invoke(new Object[] { f0.a(readableMap.getInt("width"), this.d.getInt("height")) });
        return;
      } 
      this.e.invoke(new Object[] { f0.h() });
    }
    
    class a implements Runnable {
      a(SvgViewModule.a this$0) {}
      
      public void run() {
        f0 f0 = SvgViewManager.getSvgViewByTag(this.c.c);
        if (f0 == null)
          return; 
        f0.setToDataUrlTask(new a(this));
      }
      
      class a implements Runnable {
        a(SvgViewModule.a.a this$0) {}
        
        public void run() {
          SvgViewModule.a a1 = this.c.c;
          SvgViewModule.toDataURL(a1.c, a1.d, a1.e, a1.f + 1);
        }
      }
    }
    
    class a implements Runnable {
      a(SvgViewModule.a this$0) {}
      
      public void run() {
        SvgViewModule.a a1 = this.c.c;
        SvgViewModule.toDataURL(a1.c, a1.d, a1.e, a1.f + 1);
      }
    }
    
    class b implements Runnable {
      b(SvgViewModule.a this$0) {}
      
      public void run() {
        SvgViewModule.a a1 = this.c;
        SvgViewModule.toDataURL(a1.c, a1.d, a1.e, a1.f + 1);
      }
    }
  }
  
  class a implements Runnable {
    a(SvgViewModule this$0) {}
    
    public void run() {
      f0 f0 = SvgViewManager.getSvgViewByTag(this.c.c);
      if (f0 == null)
        return; 
      f0.setToDataUrlTask(new a(this));
    }
    
    class a implements Runnable {
      a(SvgViewModule.a.a this$0) {}
      
      public void run() {
        SvgViewModule.a a1 = this.c.c;
        SvgViewModule.toDataURL(a1.c, a1.d, a1.e, a1.f + 1);
      }
    }
  }
  
  class a implements Runnable {
    a(SvgViewModule this$0) {}
    
    public void run() {
      SvgViewModule.a a1 = this.c.c;
      SvgViewModule.toDataURL(a1.c, a1.d, a1.e, a1.f + 1);
    }
  }
  
  class b implements Runnable {
    b(SvgViewModule this$0) {}
    
    public void run() {
      SvgViewModule.a a1 = this.c;
      SvgViewModule.toDataURL(a1.c, a1.d, a1.e, a1.f + 1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/SvgViewModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */