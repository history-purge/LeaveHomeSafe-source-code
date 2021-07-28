package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class a extends s {
  private final l i;
  
  private final int[] j;
  
  public a(ReadableMap paramReadableMap, l paraml) {
    this.i = paraml;
    ReadableArray readableArray = paramReadableMap.getArray("input");
    this.j = new int[readableArray.size()];
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.j;
      if (i < arrayOfInt.length) {
        arrayOfInt[i] = readableArray.getInt(i);
        i++;
        continue;
      } 
      break;
    } 
  }
  
  public void a() {
    this.f = 0.0D;
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.j;
      if (i < arrayOfInt.length) {
        b b = this.i.d(arrayOfInt[i]);
        if (b != null && b instanceof s) {
          this.f += ((s)b).e();
          i++;
          continue;
        } 
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
      } 
      break;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */