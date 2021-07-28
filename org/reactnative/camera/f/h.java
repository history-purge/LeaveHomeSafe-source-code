package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class h extends c<h> {
  private static final e<h> g = new e(5);
  
  private WritableMap f;
  
  private void a(int paramInt, WritableMap paramWritableMap) {
    a(paramInt);
    this.f = paramWritableMap;
  }
  
  public static h b(int paramInt, WritableMap paramWritableMap) {
    h h2 = (h)g.a();
    h h1 = h2;
    if (h2 == null)
      h1 = new h(); 
    h1.a(paramInt, paramWritableMap);
    return h1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), this.f);
  }
  
  public short c() {
    return (short)(this.f.getMap("data").getString("uri").hashCode() % 32767);
  }
  
  public String d() {
    return CameraViewManager.a.l.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */