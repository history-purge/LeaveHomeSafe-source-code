package com.facebook.react.fabric.events;

import android.util.Pair;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.a;
import e.e.e.e.a;
import java.util.HashSet;

public class FabricEventEmitter implements RCTEventEmitter {
  private static final String TAG = "FabricEventEmitter";
  
  private final c mUIManager;
  
  public FabricEventEmitter(c paramc) {
    this.mUIManager = paramc;
  }
  
  private WritableArray copyWritableArray(WritableArray paramWritableArray) {
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    for (int i = 0; i < paramWritableArray.size(); i++)
      writableNativeArray.pushMap((ReadableMap)getWritableMap(paramWritableArray.getMap(i))); 
    return (WritableArray)writableNativeArray;
  }
  
  private WritableMap getWritableMap(ReadableMap paramReadableMap) {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.merge(paramReadableMap);
    return (WritableMap)writableNativeMap;
  }
  
  private Pair<WritableArray, WritableArray> removeTouchesAtIndices(WritableArray paramWritableArray1, WritableArray paramWritableArray2) {
    int j;
    WritableNativeArray writableNativeArray1 = new WritableNativeArray();
    WritableNativeArray writableNativeArray2 = new WritableNativeArray();
    HashSet<Integer> hashSet = new HashSet();
    byte b = 0;
    int i = 0;
    while (true) {
      j = b;
      if (i < paramWritableArray2.size()) {
        j = paramWritableArray2.getInt(i);
        writableNativeArray1.pushMap((ReadableMap)getWritableMap(paramWritableArray1.getMap(j)));
        hashSet.add(Integer.valueOf(j));
        i++;
        continue;
      } 
      break;
    } 
    while (j < paramWritableArray1.size()) {
      if (!hashSet.contains(Integer.valueOf(j)))
        writableNativeArray2.pushMap((ReadableMap)getWritableMap(paramWritableArray1.getMap(j))); 
      j++;
    } 
    return new Pair(writableNativeArray1, writableNativeArray2);
  }
  
  private Pair<WritableArray, WritableArray> touchSubsequence(WritableArray paramWritableArray1, WritableArray paramWritableArray2) {
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    for (int i = 0; i < paramWritableArray2.size(); i++)
      writableNativeArray.pushMap((ReadableMap)getWritableMap(paramWritableArray1.getMap(paramWritableArray2.getInt(i)))); 
    return new Pair(writableNativeArray, paramWritableArray1);
  }
  
  public void receiveEvent(int paramInt, String paramString, WritableMap paramWritableMap) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FabricEventEmitter.receiveEvent('");
    stringBuilder.append(paramString);
    stringBuilder.append("')");
    a.a(0L, stringBuilder.toString());
    this.mUIManager.a(paramInt, paramString, paramWritableMap);
    a.a(0L);
  }
  
  public void receiveTouches(String paramString, WritableArray paramWritableArray1, WritableArray paramWritableArray2) {
    Pair<WritableArray, WritableArray> pair;
    if ("topTouchEnd".equalsIgnoreCase(paramString) || "topTouchCancel".equalsIgnoreCase(paramString)) {
      pair = removeTouchesAtIndices(paramWritableArray1, paramWritableArray2);
    } else {
      pair = touchSubsequence((WritableArray)pair, paramWritableArray2);
    } 
    paramWritableArray2 = (WritableArray)pair.first;
    WritableArray writableArray = (WritableArray)pair.second;
    int i;
    for (i = 0; i < paramWritableArray2.size(); i++) {
      WritableMap writableMap = getWritableMap(paramWritableArray2.getMap(i));
      writableMap.putArray("changedTouches", (ReadableArray)copyWritableArray(paramWritableArray2));
      writableMap.putArray("touches", (ReadableArray)copyWritableArray(writableArray));
      int k = writableMap.getInt("target");
      int j = k;
      if (k < 1) {
        a.b("FabricEventEmitter", "A view is reporting that a touch occurred on tag zero.");
        j = 0;
      } 
      receiveEvent(j, paramString, writableMap);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/events/FabricEventEmitter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */