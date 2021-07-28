package io.liteglue;

import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

public abstract class SQLitePluginConverter {
  static Object get(ReadableArray paramReadableArray, int paramInt, Object paramObject) {
    if (paramReadableArray == null)
      return paramObject; 
    try {
      ReadableType readableType = paramReadableArray.getType(paramInt);
      int i = null.$SwitchMap$com$facebook$react$bridge$ReadableType[readableType.ordinal()];
      if (i != 1)
        return (i != 2) ? ((i != 3) ? ((i != 5) ? ((i != 6) ? null : paramReadableArray.getArray(paramInt)) : paramReadableArray.getMap(paramInt)) : paramReadableArray.getString(paramInt)) : Boolean.valueOf(paramReadableArray.getBoolean(paramInt)); 
      double d = paramReadableArray.getDouble(paramInt);
      return Double.valueOf(d);
    } catch (NoSuchKeyException noSuchKeyException) {
      return paramObject;
    } 
  }
  
  static Object get(ReadableMap paramReadableMap, String paramString, Object paramObject) {
    if (paramReadableMap == null)
      return paramObject; 
    try {
      Double double_;
      ReadableType readableType = paramReadableMap.getType(paramString);
      int i = null.$SwitchMap$com$facebook$react$bridge$ReadableType[readableType.ordinal()];
      readableType = null;
      switch (i) {
        case 6:
          return paramReadableMap.getArray(paramString);
        case 5:
          return paramReadableMap.getMap(paramString);
        case 3:
          return paramReadableMap.getString(paramString);
        case 2:
          return Boolean.valueOf(paramReadableMap.getBoolean(paramString));
        case 1:
          double_ = Double.valueOf(paramReadableMap.getDouble(paramString));
        case 4:
          return double_;
      } 
    } catch (NoSuchKeyException noSuchKeyException) {
      return paramObject;
    } 
    return null;
  }
  
  static boolean getBoolean(ReadableArray paramReadableArray, int paramInt, boolean paramBoolean) {
    if (paramReadableArray == null)
      return paramBoolean; 
    try {
      String str;
      ReadableType readableType = paramReadableArray.getType(paramInt);
      int i = null.$SwitchMap$com$facebook$react$bridge$ReadableType[readableType.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return paramBoolean; 
          } else {
            str = paramReadableArray.getString(paramInt);
            if ("true".equalsIgnoreCase(str))
              return true; 
            "false".equalsIgnoreCase(str);
            return false;
          } 
        } else {
          return str.getBoolean(paramInt);
        } 
      } else {
        return (str.getDouble(paramInt) == 0.0D) ? Boolean.FALSE.booleanValue() : Boolean.TRUE.booleanValue();
      } 
    } catch (NoSuchKeyException noSuchKeyException) {
      return paramBoolean;
    } 
    return false;
  }
  
  static boolean getBoolean(ReadableMap paramReadableMap, String paramString, boolean paramBoolean) {
    if (paramReadableMap == null)
      return paramBoolean; 
    try {
      String str;
      ReadableType readableType = paramReadableMap.getType(paramString);
      int i = null.$SwitchMap$com$facebook$react$bridge$ReadableType[readableType.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return paramBoolean; 
          } else {
            str = paramReadableMap.getString(paramString);
            if ("true".equalsIgnoreCase(str))
              return true; 
            "false".equalsIgnoreCase(str);
            return false;
          } 
        } else {
          return str.getBoolean(paramString);
        } 
      } else {
        return (str.getDouble(paramString) == 0.0D) ? Boolean.FALSE.booleanValue() : Boolean.TRUE.booleanValue();
      } 
    } catch (NoSuchKeyException noSuchKeyException) {
      return paramBoolean;
    } 
    return false;
  }
  
  static String getString(ReadableArray paramReadableArray, int paramInt, String paramString) {
    if (paramReadableArray == null)
      return paramString; 
    try {
      ReadableType readableType = paramReadableArray.getType(paramInt);
      int i = null.$SwitchMap$com$facebook$react$bridge$ReadableType[readableType.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return paramString; 
          } else {
            return paramReadableArray.getString(paramInt);
          } 
        } else {
          return String.valueOf(paramReadableArray.getBoolean(paramInt));
        } 
      } else {
        double d = paramReadableArray.getDouble(paramInt);
        long l = (long)d;
        return (d == l) ? String.valueOf(l) : String.valueOf(d);
      } 
    } catch (NoSuchKeyException noSuchKeyException) {
      return paramString;
    } 
    return null;
  }
  
  static String getString(ReadableMap paramReadableMap, String paramString1, String paramString2) {
    if (paramReadableMap == null)
      return paramString2; 
    try {
      ReadableType readableType = paramReadableMap.getType(paramString1);
      int i = null.$SwitchMap$com$facebook$react$bridge$ReadableType[readableType.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return paramString2; 
          } else {
            return paramReadableMap.getString(paramString1);
          } 
        } else {
          return String.valueOf(paramReadableMap.getBoolean(paramString1));
        } 
      } else {
        double d = paramReadableMap.getDouble(paramString1);
        long l = (long)d;
        return (d == l) ? String.valueOf(l) : String.valueOf(d);
      } 
    } catch (NoSuchKeyException noSuchKeyException) {
      return paramString2;
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLitePluginConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */