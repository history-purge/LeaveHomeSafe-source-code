package com.facebook.react.views.art;

import com.facebook.react.bridge.ReadableArray;

class g {
  static int a(ReadableArray paramReadableArray, float[] paramArrayOffloat) {
    int i;
    if (paramReadableArray.size() > paramArrayOffloat.length) {
      i = paramArrayOffloat.length;
    } else {
      i = paramReadableArray.size();
    } 
    for (int j = 0; j < i; j++)
      paramArrayOffloat[j] = (float)paramReadableArray.getDouble(j); 
    return paramReadableArray.size();
  }
  
  static float[] a(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      float[] arrayOfFloat = new float[paramReadableArray.size()];
      a(paramReadableArray, arrayOfFloat);
      return arrayOfFloat;
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */