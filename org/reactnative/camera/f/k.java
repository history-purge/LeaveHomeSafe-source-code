package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class k extends c<k> {
  private static final e<k> g = new e(3);
  
  private WritableMap f;
  
  private void a(int paramInt, WritableMap paramWritableMap) {
    a(paramInt);
    this.f = paramWritableMap;
  }
  
  public static k b(int paramInt, WritableMap paramWritableMap) {
    k k2 = (k)g.a();
    k k1 = k2;
    if (k2 == null)
      k1 = new k(); 
    k1.a(paramInt, paramWritableMap);
    return k1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), this.f);
  }
  
  public String d() {
    return CameraViewManager.a.m.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */