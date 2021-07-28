package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.b;
import java.util.ArrayList;
import java.util.List;

public class EventNode extends m implements RCTEventEmitter {
  private final List<a> mMapping;
  
  public EventNode(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.mMapping = processMapping(paramReadableMap.getArray("argMapping"));
  }
  
  private static List<a> processMapping(ReadableArray paramReadableArray) {
    int j = paramReadableArray.size();
    ArrayList<a> arrayList = new ArrayList(j);
    for (int i = 0; i < j; i++)
      arrayList.add(new a(paramReadableArray.getArray(i))); 
    return arrayList;
  }
  
  protected Double evaluate() {
    return m.ZERO;
  }
  
  public void receiveEvent(int paramInt, String paramString, WritableMap paramWritableMap) {
    if (paramWritableMap != null) {
      for (paramInt = 0; paramInt < this.mMapping.size(); paramInt++) {
        a a = this.mMapping.get(paramInt);
        Double double_ = a.a((ReadableMap)paramWritableMap);
        if (double_ != null)
          ((u)this.mNodesManager.a(a.a(a), u.class)).a(double_); 
      } 
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Animated events must have event data.");
    throw illegalArgumentException;
  }
  
  public void receiveTouches(String paramString, WritableArray paramWritableArray1, WritableArray paramWritableArray2) {
    throw new RuntimeException("receiveTouches is not support by animated events");
  }
  
  private static class a {
    private final int a;
    
    private final String[] b;
    
    public a(ReadableArray param1ReadableArray) {
      int j = param1ReadableArray.size() - 1;
      this.b = new String[j];
      for (int i = 0; i < j; i++)
        this.b[i] = param1ReadableArray.getString(i); 
      this.a = param1ReadableArray.getInt(j);
    }
    
    public Double a(ReadableMap param1ReadableMap) {
      Double double_;
      String[] arrayOfString2;
      int i = 0;
      while (true) {
        arrayOfString2 = null;
        if (param1ReadableMap != null) {
          String[] arrayOfString = this.b;
          if (i < arrayOfString.length - 1) {
            String str = arrayOfString[i];
            if (param1ReadableMap.hasKey(str)) {
              param1ReadableMap = param1ReadableMap.getMap(str);
            } else {
              param1ReadableMap = null;
            } 
            i++;
            continue;
          } 
        } 
        break;
      } 
      String[] arrayOfString1 = arrayOfString2;
      if (param1ReadableMap != null) {
        arrayOfString1 = this.b;
        String str = arrayOfString1[arrayOfString1.length - 1];
        arrayOfString1 = arrayOfString2;
        if (param1ReadableMap.hasKey(str))
          double_ = Double.valueOf(param1ReadableMap.getDouble(str)); 
      } 
      return double_;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/EventNode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */