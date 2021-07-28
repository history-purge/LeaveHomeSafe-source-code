package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class g extends c<g> {
  private static final e<g> g = new e(3);
  
  private WritableArray f;
  
  private void a(int paramInt, WritableArray paramWritableArray) {
    a(paramInt);
    this.f = paramWritableArray;
  }
  
  public static g b(int paramInt, WritableArray paramWritableArray) {
    g g2 = (g)g.a();
    g g1 = g2;
    if (g2 == null)
      g1 = new g(); 
    g1.a(paramInt, paramWritableArray);
    return g1;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("type", "face");
    writableMap.putArray("faces", (ReadableArray)this.f);
    writableMap.putInt("target", g());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return (this.f.size() > 32767) ? Short.MAX_VALUE : (short)this.f.size();
  }
  
  public String d() {
    return CameraViewManager.a.f.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */