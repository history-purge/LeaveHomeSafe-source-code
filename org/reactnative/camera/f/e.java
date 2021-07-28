package org.reactnative.camera.f;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class e extends c<e> {
  private static final androidx.core.util.e<e> f = new androidx.core.util.e(3);
  
  public static e b(int paramInt) {
    e e2 = (e)f.a();
    e e1 = e2;
    if (e2 == null)
      e1 = new e(); 
    e1.a(paramInt);
    return e1;
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
    return CameraViewManager.a.c.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */