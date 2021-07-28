package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class p extends s {
  private final l i;
  
  private final int[] j;
  
  public p(ReadableMap paramReadableMap, l paraml) {
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
          b = b;
          double d = b.e();
          if (i != 0)
            d = this.f - b.e(); 
          this.f = d;
          i++;
          continue;
        } 
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
      } 
      break;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */