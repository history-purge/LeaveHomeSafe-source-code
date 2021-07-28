package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

class b extends c<b> {
  private final String f;
  
  protected b(int paramInt, String paramString) {
    super(paramInt);
    this.f = paramString;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("pageScrollState", this.f);
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return "topPageScrollStateChanged";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/viewpager/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */