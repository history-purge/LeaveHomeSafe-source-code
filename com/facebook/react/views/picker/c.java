package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

class c {
  public final String a;
  
  public final Integer b;
  
  public c(ReadableMap paramReadableMap) {
    this.a = paramReadableMap.getString("label");
    if (paramReadableMap.hasKey("color") && !paramReadableMap.isNull("color")) {
      Integer integer = Integer.valueOf(paramReadableMap.getInt("color"));
    } else {
      paramReadableMap = null;
    } 
    this.b = (Integer)paramReadableMap;
  }
  
  public static List<c> a(ReadableArray paramReadableArray) {
    if (paramReadableArray == null)
      return null; 
    ArrayList<c> arrayList = new ArrayList(paramReadableArray.size());
    for (int i = 0; i < paramReadableArray.size(); i++)
      arrayList.add(new c(paramReadableArray.getMap(i))); 
    return arrayList;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */