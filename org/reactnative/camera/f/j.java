package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class j extends c<j> {
  private static final e<j> f = new e(3);
  
  public static j b(int paramInt) {
    j j2 = (j)f.a();
    j j1 = j2;
    if (j2 == null)
      j1 = new j(); 
    j1.a(paramInt);
    return j1;
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
    return CameraViewManager.a.n.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */