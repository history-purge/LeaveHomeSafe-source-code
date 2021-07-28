package com.facebook.react.util;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b {
  private static final Pattern a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");
  
  private static String a(ReadableMap paramReadableMap) {
    if (paramReadableMap.hasKey("file") && !paramReadableMap.isNull("file") && paramReadableMap.getType("file") == ReadableType.String) {
      String str = paramReadableMap.getString("file");
      if (str != null) {
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(matcher.group(1));
          stringBuilder.append(":");
          return stringBuilder.toString();
        } 
      } 
    } 
    return "";
  }
  
  public static String a(String paramString, ReadableArray paramReadableArray) {
    StringBuilder stringBuilder = new StringBuilder(paramString);
    stringBuilder.append(", stack:\n");
    for (int i = 0; i < paramReadableArray.size(); i++) {
      byte b1;
      ReadableMap readableMap = paramReadableArray.getMap(i);
      stringBuilder.append(readableMap.getString("methodName"));
      stringBuilder.append("@");
      stringBuilder.append(a(readableMap));
      if (readableMap.hasKey("lineNumber") && !readableMap.isNull("lineNumber") && readableMap.getType("lineNumber") == ReadableType.Number) {
        b1 = readableMap.getInt("lineNumber");
      } else {
        b1 = -1;
      } 
      stringBuilder.append(b1);
      if (readableMap.hasKey("column") && !readableMap.isNull("column") && readableMap.getType("column") == ReadableType.Number) {
        stringBuilder.append(":");
        stringBuilder.append(readableMap.getInt("column"));
      } 
      stringBuilder.append("\n");
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */