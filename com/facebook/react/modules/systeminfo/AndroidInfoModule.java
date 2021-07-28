package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.interfaces.a;
import e.e.o.d0.a.a;
import e.e.o.i;
import java.util.HashMap;
import java.util.Map;

@a(name = "PlatformConstants")
@SuppressLint({"HardwareIds"})
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec implements a {
  private static final String IS_TESTING = "IS_TESTING";
  
  public static final String NAME = "PlatformConstants";
  
  public AndroidInfoModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private String getServerHost() {
    return a.a(Integer.valueOf(getReactApplicationContext().getApplicationContext().getResources().getInteger(i.react_native_dev_server_port)));
  }
  
  private Boolean isRunningScreenshotTest() {
    try {
      Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
      return Boolean.valueOf(true);
    } catch (ClassNotFoundException classNotFoundException) {
      return Boolean.valueOf(false);
    } 
  }
  
  private String uiMode() {
    int i = ((UiModeManager)getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
    return (i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 4) ? ((i != 6) ? "unknown" : "watch") : "tv") : "car") : "desk") : "normal";
  }
  
  public String getAndroidID() {
    return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
  }
  
  public String getName() {
    return "PlatformConstants";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
    hashMap.put("Release", Build.VERSION.RELEASE);
    hashMap.put("Serial", Build.SERIAL);
    hashMap.put("Fingerprint", Build.FINGERPRINT);
    hashMap.put("Model", Build.MODEL);
    if ("true".equals(System.getProperty("IS_TESTING")) || isRunningScreenshotTest().booleanValue()) {
      boolean bool1 = true;
      hashMap.put("isTesting", Boolean.valueOf(bool1));
      hashMap.put("reactNativeVersion", b.a);
      hashMap.put("uiMode", uiMode());
      return (Map)hashMap;
    } 
    boolean bool = false;
    hashMap.put("isTesting", Boolean.valueOf(bool));
    hashMap.put("reactNativeVersion", b.a);
    hashMap.put("uiMode", uiMode());
    return (Map)hashMap;
  }
  
  public void invalidate() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/systeminfo/AndroidInfoModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */