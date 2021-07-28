package org.devio.rn.splashscreen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class SplashScreenModule extends ReactContextBaseJavaModule {
  public SplashScreenModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public String getName() {
    return "SplashScreen";
  }
  
  @ReactMethod
  public void hide() {
    c.a(getCurrentActivity());
  }
  
  @ReactMethod
  public void show() {
    c.b(getCurrentActivity());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/devio/rn/splashscreen/SplashScreenModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */