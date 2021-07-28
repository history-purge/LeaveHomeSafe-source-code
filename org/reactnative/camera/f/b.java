package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class b extends c<b> {
  private static final e<b> g = new e(3);
  
  private k.b.a.b f;
  
  private void a(int paramInt, k.b.a.b paramb) {
    a(paramInt);
    this.f = paramb;
  }
  
  public static b b(int paramInt, k.b.a.b paramb) {
    b b2 = (b)g.a();
    b b1 = b2;
    if (b2 == null)
      b1 = new b(); 
    b1.a(paramInt, paramb);
    return b1;
  }
  
  private WritableMap j() {
    boolean bool;
    WritableMap writableMap = Arguments.createMap();
    k.b.a.b b1 = this.f;
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
    return CameraViewManager.a.i.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */