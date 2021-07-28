package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import e.e.m.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class c {
  private static DisplayMetrics a;
  
  private static DisplayMetrics b;
  
  public static DisplayMetrics a() {
    return b;
  }
  
  public static Map<String, Map<String, Object>> a(double paramDouble) {
    if (a != null || b != null) {
      boolean bool1 = true;
      a.a(Boolean.valueOf(bool1), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap1.put("windowPhysicalPixels", a(a, paramDouble));
      hashMap1.put("screenPhysicalPixels", a(b, paramDouble));
      return (Map)hashMap1;
    } 
    boolean bool = false;
    a.a(Boolean.valueOf(bool), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("windowPhysicalPixels", a(a, paramDouble));
    hashMap.put("screenPhysicalPixels", a(b, paramDouble));
    return (Map)hashMap;
  }
  
  private static Map<String, Object> a(DisplayMetrics paramDisplayMetrics, double paramDouble) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("width", Integer.valueOf(paramDisplayMetrics.widthPixels));
    hashMap.put("height", Integer.valueOf(paramDisplayMetrics.heightPixels));
    hashMap.put("scale", Float.valueOf(paramDisplayMetrics.density));
    hashMap.put("fontScale", Double.valueOf(paramDouble));
    hashMap.put("densityDpi", Integer.valueOf(paramDisplayMetrics.densityDpi));
    return (Map)hashMap;
  }
  
  public static void a(Context paramContext) {
    DisplayMetrics displayMetrics2 = paramContext.getResources().getDisplayMetrics();
    b(displayMetrics2);
    DisplayMetrics displayMetrics1 = new DisplayMetrics();
    displayMetrics1.setTo(displayMetrics2);
    WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
    a.a(windowManager, "WindowManager is null!");
    Display display = windowManager.getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17) {
      display.getRealMetrics(displayMetrics1);
    } else {
      try {
        Method method = Display.class.getMethod("getRawHeight", new Class[0]);
        displayMetrics1.widthPixels = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(display, new Object[0])).intValue();
        displayMetrics1.heightPixels = ((Integer)method.invoke(display, new Object[0])).intValue();
        a(displayMetrics1);
        return;
      } catch (InvocationTargetException invocationTargetException) {
      
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (NoSuchMethodException noSuchMethodException) {}
      throw new RuntimeException("Error getting real dimensions for API level < 17", noSuchMethodException);
    } 
    a(displayMetrics1);
  }
  
  public static void a(DisplayMetrics paramDisplayMetrics) {
    b = paramDisplayMetrics;
  }
  
  @Deprecated
  public static DisplayMetrics b() {
    return a;
  }
  
  public static WritableNativeMap b(double paramDouble) {
    if (a != null || b != null) {
      boolean bool1 = true;
      a.a(Boolean.valueOf(bool1), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
      WritableNativeMap writableNativeMap1 = new WritableNativeMap();
      writableNativeMap1.putMap("windowPhysicalPixels", (ReadableMap)b(a, paramDouble));
      writableNativeMap1.putMap("screenPhysicalPixels", (ReadableMap)b(b, paramDouble));
      return writableNativeMap1;
    } 
    boolean bool = false;
    a.a(Boolean.valueOf(bool), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putMap("windowPhysicalPixels", (ReadableMap)b(a, paramDouble));
    writableNativeMap.putMap("screenPhysicalPixels", (ReadableMap)b(b, paramDouble));
    return writableNativeMap;
  }
  
  private static WritableNativeMap b(DisplayMetrics paramDisplayMetrics, double paramDouble) {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putInt("width", paramDisplayMetrics.widthPixels);
    writableNativeMap.putInt("height", paramDisplayMetrics.heightPixels);
    writableNativeMap.putDouble("scale", paramDisplayMetrics.density);
    writableNativeMap.putDouble("fontScale", paramDouble);
    writableNativeMap.putDouble("densityDpi", paramDisplayMetrics.densityDpi);
    return writableNativeMap;
  }
  
  public static void b(Context paramContext) {
    if (a() != null)
      return; 
    a(paramContext);
  }
  
  public static void b(DisplayMetrics paramDisplayMetrics) {
    a = paramDisplayMetrics;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */