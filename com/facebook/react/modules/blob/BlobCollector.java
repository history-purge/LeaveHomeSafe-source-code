package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

class BlobCollector {
  static {
    SoLoader.a("reactnativeblob");
  }
  
  static void a(ReactContext paramReactContext, BlobModule paramBlobModule) {
    paramReactContext.runOnJSQueueThread(new a(paramReactContext, paramBlobModule));
  }
  
  private static native void nativeInstall(Object paramObject, long paramLong);
  
  static final class a implements Runnable {
    a(ReactContext param1ReactContext, BlobModule param1BlobModule) {}
    
    public void run() {
      JavaScriptContextHolder javaScriptContextHolder = this.c.getJavaScriptContextHolder();
      if (javaScriptContextHolder.get() != 0L)
        BlobCollector.a(this.d, javaScriptContextHolder.get()); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/blob/BlobCollector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */