package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;

class EventAnimationDriver implements RCTEventEmitter {
  private List<String> mEventPath;
  
  s mValueNode;
  
  public EventAnimationDriver(List<String> paramList, s params) {
    this.mEventPath = paramList;
    this.mValueNode = params;
  }
  
  public void receiveEvent(int paramInt, String paramString, WritableMap paramWritableMap) {
    if (paramWritableMap != null) {
      ReadableMap readableMap;
      for (paramInt = 0; paramInt < this.mEventPath.size() - 1; paramInt++)
        readableMap = paramWritableMap.getMap(this.mEventPath.get(paramInt)); 
      s s1 = this.mValueNode;
      List<String> list = this.mEventPath;
      s1.f = readableMap.getDouble(list.get(list.size() - 1));
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Native animated events must have event data.");
    throw illegalArgumentException;
  }
  
  public void receiveTouches(String paramString, WritableArray paramWritableArray1, WritableArray paramWritableArray2) {
    throw new RuntimeException("receiveTouches is not support by native animated events");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/EventAnimationDriver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */