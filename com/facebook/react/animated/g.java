package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class g extends s {
  private final l i;
  
  private final int[] j;
  
  public g(ReadableMap paramReadableMap, l paraml) {
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
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.j;
      if (i < arrayOfInt.length) {
        b b = this.i.d(arrayOfInt[i]);
        if (b != null && b instanceof s) {
          double d = ((s)b).e();
          if (i == 0) {
            this.f = d;
          } else if (d != 0.0D) {
            this.f /= d;
          } else {
            throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node");
          } 
          i++;
          continue;
        } 
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node");
      } 
      break;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */