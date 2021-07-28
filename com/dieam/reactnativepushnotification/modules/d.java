package com.dieam.reactnativepushnotification.modules;

import android.os.Build;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
  private ReactContext a;
  
  public d(ReactContext paramReactContext) {
    this.a = paramReactContext;
  }
  
  private JSONObject d(Bundle paramBundle) {
    JSONObject jSONObject = new JSONObject();
    for (String str : paramBundle.keySet()) {
      Object object1;
      Object object2 = paramBundle.get(str);
      if (object2 instanceof Bundle) {
        object1 = d((Bundle)object2);
      } else {
        object1 = object2;
        if (Build.VERSION.SDK_INT >= 19)
          object1 = JSONObject.wrap(object2); 
      } 
      jSONObject.put(str, object1);
    } 
    return jSONObject;
  }
  
  String a(Bundle paramBundle) {
    try {
      return d(paramBundle).toString();
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  void a(String paramString, Object paramObject) {
    if (this.a.hasActiveCatalystInstance())
      ((DeviceEventManagerModule.RCTDeviceEventEmitter)this.a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(paramString, paramObject); 
  }
  
  void b(Bundle paramBundle) {
    String str = a(paramBundle);
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("dataJSON", str);
    a("remoteNotificationReceived", writableMap);
  }
  
  void c(Bundle paramBundle) {
    String str = a(paramBundle);
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("dataJSON", str);
    a("notificationActionReceived", writableMap);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */