package org.reactnative.camera.f;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class l extends c<l> {
  private static final e<l> g = new e(3);
  
  private WritableArray f;
  
  private void a(int paramInt, WritableArray paramWritableArray) {
    a(paramInt);
    this.f = paramWritableArray;
  }
  
  public static l b(int paramInt, WritableArray paramWritableArray) {
    l l2 = (l)g.a();
    l l1 = l2;
    if (l2 == null)
      l1 = new l(); 
    l1.a(paramInt, paramWritableArray);
    return l1;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("type", "textBlock");
    writableMap.putArray("textBlocks", (ReadableArray)this.f);
    writableMap.putInt("target", g());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return CameraViewManager.a.j.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */