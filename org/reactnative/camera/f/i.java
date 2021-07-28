package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class i extends c<i> {
  private static final e<i> f = new e(3);
  
  public static i b(int paramInt) {
    i i2 = (i)f.a();
    i i1 = i2;
    if (i2 == null)
      i1 = new i(); 
    i1.a(paramInt);
    return i1;
  }
  
  private WritableMap j() {
    return Arguments.createMap();
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return CameraViewManager.a.k.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */