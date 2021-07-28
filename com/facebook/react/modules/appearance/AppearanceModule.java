package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import e.e.o.d0.a.a;

@a(name = "Appearance")
public class AppearanceModule extends NativeAppearanceSpec {
  private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
  
  public static final String NAME = "Appearance";
  
  private String mColorScheme = "light";
  
  private final a mOverrideColorScheme;
  
  public AppearanceModule(ReactApplicationContext paramReactApplicationContext) {
    this(paramReactApplicationContext, null);
  }
  
  public AppearanceModule(ReactApplicationContext paramReactApplicationContext, a parama) {
    super(paramReactApplicationContext);
    this.mOverrideColorScheme = parama;
    this.mColorScheme = colorSchemeForCurrentConfiguration((Context)paramReactApplicationContext);
  }
  
  private String colorSchemeForCurrentConfiguration(Context paramContext) {
    a a1 = this.mOverrideColorScheme;
    if (a1 != null)
      return a1.a(); 
    int i = (paramContext.getResources().getConfiguration()).uiMode & 0x30;
    return (i != 16) ? ((i != 32) ? "light" : "dark") : "light";
  }
  
  public void addListener(String paramString) {}
  
  public void emitAppearanceChanged(String paramString) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("colorScheme", paramString);
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    if (reactApplicationContext != null)
      ((DeviceEventManagerModule.RCTDeviceEventEmitter)reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("appearanceChanged", writableMap); 
  }
  
  public String getColorScheme() {
    this.mColorScheme = colorSchemeForCurrentConfiguration((Context)getReactApplicationContext());
    return this.mColorScheme;
  }
  
  public String getName() {
    return "Appearance";
  }
  
  public void onConfigurationChanged(Context paramContext) {
    String str = colorSchemeForCurrentConfiguration(paramContext);
    if (!this.mColorScheme.equals(str)) {
      this.mColorScheme = str;
      emitAppearanceChanged(this.mColorScheme);
    } 
  }
  
  public void removeListeners(double paramDouble) {}
  
  public static interface a {
    String a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/appearance/AppearanceModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */