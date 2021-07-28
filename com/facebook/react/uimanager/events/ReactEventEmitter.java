package com.facebook.react.uimanager.events;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.f1.a;
import e.e.e.e.a;
import e.e.m.a.a;

public class ReactEventEmitter implements RCTEventEmitter {
  private static final String TAG = "ReactEventEmitter";
  
  private final SparseArray<RCTEventEmitter> mEventEmitters = new SparseArray();
  
  private final ReactApplicationContext mReactContext;
  
  public ReactEventEmitter(ReactApplicationContext paramReactApplicationContext) {
    this.mReactContext = paramReactApplicationContext;
  }
  
  private RCTEventEmitter getEventEmitter(int paramInt) {
    int i = a.a(paramInt);
    RCTEventEmitter rCTEventEmitter = (RCTEventEmitter)this.mEventEmitters.get(i);
    if (rCTEventEmitter == null) {
      a.a("ReactEventEmitter", "Unable to find event emitter for reactTag: %d - uiManagerType: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      if (this.mReactContext.hasActiveCatalystInstance())
        return (RCTEventEmitter)this.mReactContext.getJSModule(RCTEventEmitter.class); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot get RCTEventEmitter from Context for reactTag: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" - uiManagerType: ");
      stringBuilder.append(i);
      stringBuilder.append(" - No active Catalyst instance!");
      ReactSoftException.logSoftException("ReactEventEmitter", (Throwable)new ReactNoCrashSoftException(stringBuilder.toString()));
    } 
    return rCTEventEmitter;
  }
  
  public void receiveEvent(int paramInt, String paramString, WritableMap paramWritableMap) {
    RCTEventEmitter rCTEventEmitter = getEventEmitter(paramInt);
    if (rCTEventEmitter != null)
      rCTEventEmitter.receiveEvent(paramInt, paramString, paramWritableMap); 
  }
  
  public void receiveTouches(String paramString, WritableArray paramWritableArray1, WritableArray paramWritableArray2) {
    boolean bool;
    if (paramWritableArray1.size() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool);
    RCTEventEmitter rCTEventEmitter = getEventEmitter(paramWritableArray1.getMap(0).getInt("target"));
    if (rCTEventEmitter != null)
      rCTEventEmitter.receiveTouches(paramString, paramWritableArray1, paramWritableArray2); 
  }
  
  public void register(int paramInt, RCTEventEmitter paramRCTEventEmitter) {
    this.mEventEmitters.put(paramInt, paramRCTEventEmitter);
  }
  
  public void unregister(int paramInt) {
    this.mEventEmitters.remove(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/ReactEventEmitter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */