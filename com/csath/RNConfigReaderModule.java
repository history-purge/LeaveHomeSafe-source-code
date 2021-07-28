package com.csath;

import android.content.res.Resources;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class RNConfigReaderModule extends ReactContextBaseJavaModule {
  public RNConfigReaderModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    try {
      String str;
      ReactApplicationContext reactApplicationContext = getReactApplicationContext();
      int i = reactApplicationContext.getResources().getIdentifier("rn_config_reader_custom_package", "string", reactApplicationContext.getPackageName());
      try {
        str = reactApplicationContext.getString(i);
      } catch (android.content.res.Resources.NotFoundException notFoundException) {
        str = getReactApplicationContext().getApplicationContext().getPackageName();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(".BuildConfig");
      Field[] arrayOfField = Class.forName(stringBuilder.toString()).getDeclaredFields();
      int j = arrayOfField.length;
      i = 0;
      while (true) {
        if (i < j) {
          Field field = arrayOfField[i];
          try {
            hashMap.put(field.getName(), field.get(null));
          } catch (IllegalAccessException illegalAccessException) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("RNConfigReader: Could not access BuildConfig field ");
            stringBuilder1.append(field.getName());
            Log.d("ReactNative", stringBuilder1.toString());
          } 
          i++;
          continue;
        } 
        return (Map)hashMap;
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      Log.d("ReactNative", "RNConfigReader: Could not find BuildConfig class");
    } 
    return (Map)hashMap;
  }
  
  public String getName() {
    return "RNConfigReader";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/csath/RNConfigReaderModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */