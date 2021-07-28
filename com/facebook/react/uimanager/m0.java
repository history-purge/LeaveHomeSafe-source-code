package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

public class m0 {
  private static ThreadLocal<double[]> a = new a();
  
  private static double a(ReadableMap paramReadableMap, String paramString) {
    String str;
    double d;
    ReadableType readableType1 = paramReadableMap.getType(paramString);
    ReadableType readableType2 = ReadableType.String;
    boolean bool2 = true;
    boolean bool1 = true;
    if (readableType1 == readableType2) {
      paramString = paramReadableMap.getString(paramString);
      if (paramString.endsWith("rad")) {
        str = paramString.substring(0, paramString.length() - 3);
      } else {
        str = paramString;
        if (paramString.endsWith("deg")) {
          str = paramString.substring(0, paramString.length() - 3);
          bool1 = false;
        } 
      } 
      d = Float.parseFloat(str);
    } else {
      d = str.getDouble(paramString);
      bool1 = bool2;
    } 
    return bool1 ? d : j.a(d);
  }
  
  public static void a(ReadableArray paramReadableArray, double[] paramArrayOfdouble) {
    double[] arrayOfDouble = a.get();
    j.c(paramArrayOfdouble);
    int j = paramReadableArray.size();
    int i;
    for (i = 0;; i++) {
      if (i < j) {
        ReadableArray readableArray;
        ReadableMap readableMap = paramReadableArray.getMap(i);
        String str = readableMap.keySetIterator().nextKey();
        j.c(arrayOfDouble);
        if ("matrix".equals(str)) {
          readableArray = readableMap.getArray(str);
          int k;
          for (k = 0; k < 16; k++)
            arrayOfDouble[k] = readableArray.getDouble(k); 
        } else if ("perspective".equals(readableArray)) {
          j.a(arrayOfDouble, readableMap.getDouble((String)readableArray));
        } else if ("rotateX".equals(readableArray)) {
          j.b(arrayOfDouble, a(readableMap, (String)readableArray));
        } else if ("rotateY".equals(readableArray)) {
          j.c(arrayOfDouble, a(readableMap, (String)readableArray));
        } else if ("rotate".equals(readableArray) || "rotateZ".equals(readableArray)) {
          j.d(arrayOfDouble, a(readableMap, (String)readableArray));
        } else {
          double d;
          if ("scale".equals(readableArray)) {
            d = readableMap.getDouble((String)readableArray);
            j.e(arrayOfDouble, d);
          } else {
            if ("scaleX".equals(readableArray)) {
              j.e(arrayOfDouble, readableMap.getDouble((String)readableArray));
            } else {
              if ("scaleY".equals(readableArray)) {
                d = readableMap.getDouble((String)readableArray);
              } else {
                boolean bool = "translate".equals(readableArray);
                d = 0.0D;
                if (bool) {
                  readableArray = readableMap.getArray((String)readableArray);
                  double d1 = readableArray.getDouble(0);
                  double d2 = readableArray.getDouble(1);
                  if (readableArray.size() > 2)
                    d = readableArray.getDouble(2); 
                  j.a(arrayOfDouble, d1, d2, d);
                } else if ("translateX".equals(readableArray)) {
                  j.a(arrayOfDouble, readableMap.getDouble((String)readableArray), 0.0D);
                } else if ("translateY".equals(readableArray)) {
                  j.a(arrayOfDouble, 0.0D, readableMap.getDouble((String)readableArray));
                } else if ("skewX".equals(readableArray)) {
                  j.g(arrayOfDouble, a(readableMap, (String)readableArray));
                } else if ("skewY".equals(readableArray)) {
                  j.h(arrayOfDouble, a(readableMap, (String)readableArray));
                } else {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Unsupported transform type: ");
                  stringBuilder.append((String)readableArray);
                  throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                } 
                j.a(paramArrayOfdouble, paramArrayOfdouble, arrayOfDouble);
                i++;
              } 
              j.f(arrayOfDouble, d);
            } 
            j.a(paramArrayOfdouble, paramArrayOfdouble, arrayOfDouble);
            i++;
          } 
          j.f(arrayOfDouble, d);
        } 
      } else {
        break;
      } 
      j.a(paramArrayOfdouble, paramArrayOfdouble, arrayOfDouble);
    } 
  }
  
  static final class a extends ThreadLocal<double[]> {
    protected double[] initialValue() {
      return new double[16];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */