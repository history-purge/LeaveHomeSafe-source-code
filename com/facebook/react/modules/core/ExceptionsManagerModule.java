package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.d;
import com.facebook.react.devsupport.h.c;
import com.facebook.react.util.a;
import com.facebook.react.util.b;
import e.e.e.e.a;
import e.e.o.d0.a.a;

@a(name = "ExceptionsManager")
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
  public static final String NAME = "ExceptionsManager";
  
  private final c mDevSupportManager;
  
  public ExceptionsManagerModule(c paramc) {
    super(null);
    this.mDevSupportManager = paramc;
  }
  
  public void dismissRedbox() {
    if (this.mDevSupportManager.a())
      this.mDevSupportManager.c(); 
  }
  
  public String getName() {
    return "ExceptionsManager";
  }
  
  public void reportException(ReadableMap paramReadableMap) {
    byte b;
    String str;
    WritableArray writableArray;
    if (paramReadableMap.hasKey("message")) {
      str = paramReadableMap.getString("message");
    } else {
      str = "";
    } 
    if (paramReadableMap.hasKey("stack")) {
      ReadableArray readableArray = paramReadableMap.getArray("stack");
    } else {
      writableArray = Arguments.createArray();
    } 
    if (paramReadableMap.hasKey("id")) {
      b = paramReadableMap.getInt("id");
    } else {
      b = -1;
    } 
    boolean bool = paramReadableMap.hasKey("isFatal");
    boolean bool1 = false;
    if (bool) {
      bool = paramReadableMap.getBoolean("isFatal");
    } else {
      bool = false;
    } 
    if (this.mDevSupportManager.a()) {
      bool = bool1;
      if (paramReadableMap.getMap("extraData") != null) {
        bool = bool1;
        if (paramReadableMap.getMap("extraData").hasKey("suppressRedBox"))
          bool = paramReadableMap.getMap("extraData").getBoolean("suppressRedBox"); 
      } 
      if (!bool) {
        this.mDevSupportManager.a(str, (ReadableArray)writableArray, b);
        return;
      } 
    } else {
      String str1 = a.a(paramReadableMap);
      if (!bool) {
        a.b("ReactNative", b.a(str, (ReadableArray)writableArray));
        if (str1 != null)
          a.a("ReactNative", "extraData: %s", str1); 
        return;
      } 
      throw (new d(b.a(str, writableArray))).a(str1);
    } 
  }
  
  public void reportFatalException(String paramString, ReadableArray paramReadableArray, double paramDouble) {
    int i = (int)paramDouble;
    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
    javaOnlyMap.putString("message", paramString);
    javaOnlyMap.putArray("stack", paramReadableArray);
    javaOnlyMap.putInt("id", i);
    javaOnlyMap.putBoolean("isFatal", true);
    reportException((ReadableMap)javaOnlyMap);
  }
  
  public void reportSoftException(String paramString, ReadableArray paramReadableArray, double paramDouble) {
    int i = (int)paramDouble;
    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
    javaOnlyMap.putString("message", paramString);
    javaOnlyMap.putArray("stack", paramReadableArray);
    javaOnlyMap.putInt("id", i);
    javaOnlyMap.putBoolean("isFatal", false);
    reportException((ReadableMap)javaOnlyMap);
  }
  
  public void updateExceptionMessage(String paramString, ReadableArray paramReadableArray, double paramDouble) {
    int i = (int)paramDouble;
    if (this.mDevSupportManager.a())
      this.mDevSupportManager.b(paramString, paramReadableArray, i); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/ExceptionsManagerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */