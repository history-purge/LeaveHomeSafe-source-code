package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.a;

public class b {
  private static volatile boolean a = false;
  
  public static void a() {
    if (a)
      return; 
    a.a(0L, "FabricSoLoader.staticInit::load:fabricjni");
    ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
    SoLoader.a("fabricjni");
    ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
    a.a(0L);
    a = true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */