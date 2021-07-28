package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.net.SocketTimeoutException;

public class n {
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushNull();
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didCompleteNetworkResponse", writableArray); 
  }
  
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt1, int paramInt2, WritableMap paramWritableMap, String paramString) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt1);
    writableArray.pushInt(paramInt2);
    writableArray.pushMap((ReadableMap)paramWritableMap);
    writableArray.pushString(paramString);
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didReceiveNetworkResponse", writableArray); 
  }
  
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, long paramLong1, long paramLong2) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushInt((int)paramLong1);
    writableArray.pushInt((int)paramLong2);
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", writableArray); 
  }
  
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, WritableMap paramWritableMap) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushMap((ReadableMap)paramWritableMap);
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didReceiveNetworkData", writableArray); 
  }
  
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, String paramString) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushString(paramString);
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didReceiveNetworkData", writableArray); 
  }
  
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, String paramString, long paramLong1, long paramLong2) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushString(paramString);
    writableArray.pushInt((int)paramLong1);
    writableArray.pushInt((int)paramLong2);
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", writableArray); 
  }
  
  public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, String paramString, Throwable paramThrowable) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushString(paramString);
    if (paramThrowable != null && paramThrowable.getClass() == SocketTimeoutException.class)
      writableArray.pushBoolean(true); 
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didCompleteNetworkResponse", writableArray); 
  }
  
  public static void b(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, long paramLong1, long paramLong2) {
    WritableArray writableArray = Arguments.createArray();
    writableArray.pushInt(paramInt);
    writableArray.pushInt((int)paramLong1);
    writableArray.pushInt((int)paramLong2);
    if (paramRCTDeviceEventEmitter != null)
      paramRCTDeviceEventEmitter.emit("didSendNetworkData", writableArray); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */