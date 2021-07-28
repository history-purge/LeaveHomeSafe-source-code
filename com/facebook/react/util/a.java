package com.facebook.react.util;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;

public class a {
  public static String a(ReadableMap paramReadableMap) {
    if (paramReadableMap != null) {
      if (paramReadableMap.getType("extraData") == ReadableType.Null)
        return null; 
      try {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        JsonWriterHelper.value(jsonWriter, paramReadableMap.getDynamic("extraData"));
        jsonWriter.close();
        stringWriter.close();
        return stringWriter.toString();
      } catch (IOException iOException) {
        return null;
      } 
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */