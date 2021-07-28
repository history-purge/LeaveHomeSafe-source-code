package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class d extends c<d> {
  private static final e<d> g = new e(3);
  
  private String f;
  
  private void a(int paramInt, String paramString) {
    a(paramInt);
    this.f = paramString;
  }
  
  public static d b(int paramInt, String paramString) {
    d d2 = (d)g.a();
    d d1 = d2;
    if (d2 == null)
      d1 = new d(); 
    d1.a(paramInt, paramString);
    return d1;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("message", this.f);
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return CameraViewManager.a.d.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */