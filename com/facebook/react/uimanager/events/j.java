package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;

public class j {
  private static WritableArray a(int paramInt, g paramg) {
    WritableArray writableArray = Arguments.createArray();
    MotionEvent motionEvent = paramg.j();
    float f1 = motionEvent.getX();
    float f2 = paramg.k();
    float f3 = motionEvent.getY();
    float f4 = paramg.l();
    int i;
    for (i = 0; i < motionEvent.getPointerCount(); i++) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putDouble("pageX", q.a(motionEvent.getX(i)));
      writableMap.putDouble("pageY", q.a(motionEvent.getY(i)));
      float f5 = motionEvent.getX(i);
      float f6 = motionEvent.getY(i);
      writableMap.putDouble("locationX", q.a(f5 - f1 - f2));
      writableMap.putDouble("locationY", q.a(f6 - f3 - f4));
      writableMap.putInt("target", paramInt);
      writableMap.putDouble("timestamp", paramg.e());
      writableMap.putDouble("identifier", motionEvent.getPointerId(i));
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    return writableArray;
  }
  
  public static void a(RCTEventEmitter paramRCTEventEmitter, i parami, int paramInt, g paramg) {
    StringBuilder stringBuilder;
    WritableArray writableArray1 = a(paramInt, paramg);
    MotionEvent motionEvent = paramg.j();
    WritableArray writableArray2 = Arguments.createArray();
    if (parami == i.e || parami == i.f) {
      for (paramInt = 0; paramInt < motionEvent.getPointerCount(); paramInt++)
        writableArray2.pushInt(paramInt); 
    } else if (parami == i.c || parami == i.d) {
      writableArray2.pushInt(motionEvent.getActionIndex());
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown touch type: ");
      stringBuilder.append(parami);
      throw new RuntimeException(stringBuilder.toString());
    } 
    stringBuilder.receiveTouches(i.a(parami), writableArray1, writableArray2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */