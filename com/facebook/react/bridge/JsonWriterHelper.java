package com.facebook.react.bridge;

import android.util.JsonWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonWriterHelper {
  private static void dynamicValue(JsonWriter paramJsonWriter, Dynamic paramDynamic) {
    StringBuilder stringBuilder;
    switch (paramDynamic.getType()) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown data type: ");
        stringBuilder.append(paramDynamic.getType());
        throw new IllegalArgumentException(stringBuilder.toString());
      case null:
        readableArrayValue((JsonWriter)stringBuilder, paramDynamic.asArray());
        return;
      case Map:
        readableMapValue((JsonWriter)stringBuilder, paramDynamic.asMap());
        return;
      case String:
        stringBuilder.value(paramDynamic.asString());
        return;
      case Number:
        stringBuilder.value(paramDynamic.asDouble());
        return;
      case Boolean:
        stringBuilder.value(paramDynamic.asBoolean());
        return;
      case Null:
        break;
    } 
    stringBuilder.nullValue();
  }
  
  private static void listValue(JsonWriter paramJsonWriter, List<?> paramList) {
    paramJsonWriter.beginArray();
    Iterator<?> iterator = paramList.iterator();
    while (iterator.hasNext())
      objectValue(paramJsonWriter, iterator.next()); 
    paramJsonWriter.endArray();
  }
  
  private static void mapValue(JsonWriter paramJsonWriter, Map<?, ?> paramMap) {
    paramJsonWriter.beginObject();
    for (Map.Entry<?, ?> entry : paramMap.entrySet()) {
      paramJsonWriter.name(entry.getKey().toString());
      value(paramJsonWriter, entry.getValue());
    } 
    paramJsonWriter.endObject();
  }
  
  private static void objectValue(JsonWriter paramJsonWriter, Object paramObject) {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
      return;
    } 
    if (paramObject instanceof String) {
      paramJsonWriter.value((String)paramObject);
      return;
    } 
    if (paramObject instanceof Number) {
      paramJsonWriter.value((Number)paramObject);
      return;
    } 
    if (paramObject instanceof Boolean) {
      paramJsonWriter.value(((Boolean)paramObject).booleanValue());
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown value: ");
    stringBuilder.append(paramObject);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static void readableArrayValue(JsonWriter paramJsonWriter, ReadableArray paramReadableArray) {
    paramJsonWriter.beginArray();
    for (int i = 0;; i++) {
      try {
      
      } finally {
        paramJsonWriter.endArray();
      } 
    } 
  }
  
  private static void readableMapValue(JsonWriter paramJsonWriter, ReadableMap paramReadableMap) {
    paramJsonWriter.beginObject();
    try {
      ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
      while (readableMapKeySetIterator.hasNextKey()) {
        String str = readableMapKeySetIterator.nextKey();
        paramJsonWriter.name(str);
        switch (paramReadableMap.getType(str)) {
          case null:
            readableArrayValue(paramJsonWriter, paramReadableMap.getArray(str));
            continue;
          case Map:
            readableMapValue(paramJsonWriter, paramReadableMap.getMap(str));
            continue;
          case String:
            paramJsonWriter.value(paramReadableMap.getString(str));
            continue;
          case Number:
            paramJsonWriter.value(paramReadableMap.getDouble(str));
            continue;
          case Boolean:
            paramJsonWriter.value(paramReadableMap.getBoolean(str));
            continue;
          case Null:
            paramJsonWriter.nullValue();
            continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown data type: ");
        stringBuilder.append(paramReadableMap.getType(str));
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return;
    } finally {
      paramJsonWriter.endObject();
    } 
  }
  
  public static void value(JsonWriter paramJsonWriter, Object paramObject) {
    if (paramObject instanceof Map) {
      mapValue(paramJsonWriter, (Map<?, ?>)paramObject);
      return;
    } 
    if (paramObject instanceof List) {
      listValue(paramJsonWriter, (List)paramObject);
      return;
    } 
    if (paramObject instanceof ReadableMap) {
      readableMapValue(paramJsonWriter, (ReadableMap)paramObject);
      return;
    } 
    if (paramObject instanceof ReadableArray) {
      readableArrayValue(paramJsonWriter, (ReadableArray)paramObject);
      return;
    } 
    if (paramObject instanceof Dynamic) {
      dynamicValue(paramJsonWriter, (Dynamic)paramObject);
      return;
    } 
    objectValue(paramJsonWriter, paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JsonWriterHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */