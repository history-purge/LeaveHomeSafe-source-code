package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;

public class b extends c<b> {
  private final int f;
  
  private final int g;
  
  public b(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.f = paramInt2;
    this.g = paramInt3;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("width", q.a(this.f));
    writableMap.putDouble("height", q.a(this.g));
    paramRCTEventEmitter.receiveEvent(g(), "topContentSizeChange", writableMap);
  }
  
  public String d() {
    return "topContentSizeChange";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */