package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import org.reactnative.facedetector.b;

public class f extends c<f> {
  private static final e<f> g = new e(3);
  
  private b f;
  
  private void a(int paramInt, b paramb) {
    a(paramInt);
    this.f = paramb;
  }
  
  public static f b(int paramInt, b paramb) {
    f f2 = (f)g.a();
    f f1 = f2;
    if (f2 == null)
      f1 = new f(); 
    f1.a(paramInt, paramb);
    return f1;
  }
  
  private WritableMap j() {
    boolean bool;
    WritableMap writableMap = Arguments.createMap();
    b b1 = this.f;
    if (b1 != null && b1.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    writableMap.putBoolean("isOperational", bool);
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return CameraViewManager.a.h.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */