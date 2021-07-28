package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class m extends c<m> {
  private static final e<m> i = new e(3);
  
  private int f;
  
  private int g;
  
  private boolean h;
  
  private void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
    a(paramInt1);
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramBoolean;
  }
  
  public static m b(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
    m m2 = (m)i.a();
    m m1 = m2;
    if (m2 == null)
      m1 = new m(); 
    m1.a(paramInt1, paramBoolean, paramInt2, paramInt3);
    return m1;
  }
  
  private WritableMap j() {
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putInt("target", g());
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putInt("x", this.f);
    writableMap2.putInt("y", this.g);
    writableMap1.putBoolean("isDoubleTap", this.h);
    writableMap1.putMap("touchOrigin", (ReadableMap)writableMap2);
    return writableMap1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return CameraViewManager.a.o.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */