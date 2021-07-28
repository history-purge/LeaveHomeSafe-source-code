package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class m {
  public static WritableArray a(JSONArray paramJSONArray) {
    WritableArray writableArray = Arguments.createArray();
    for (int i = 0; i < paramJSONArray.length(); i++) {
      Object object = paramJSONArray.get(i);
      if (object instanceof Float || object instanceof Double) {
        writableArray.pushDouble(paramJSONArray.getDouble(i));
      } else if (object instanceof Number) {
        writableArray.pushInt(paramJSONArray.getInt(i));
      } else if (object instanceof String) {
        writableArray.pushString(paramJSONArray.getString(i));
      } else if (object instanceof JSONObject) {
        writableArray.pushMap((ReadableMap)a(paramJSONArray.getJSONObject(i)));
      } else if (object instanceof JSONArray) {
        writableArray.pushArray((ReadableArray)a(paramJSONArray.getJSONArray(i)));
      } else if (object == JSONObject.NULL) {
        writableArray.pushNull();
      } 
    } 
    return writableArray;
  }
  
  public static WritableMap a(JSONObject paramJSONObject) {
    WritableMap writableMap = Arguments.createMap();
    Iterator<String> iterator = paramJSONObject.keys();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Object object = paramJSONObject.get(str);
      if (object instanceof Float || object instanceof Double) {
        writableMap.putDouble(str, paramJSONObject.getDouble(str));
        continue;
      } 
      if (object instanceof Number) {
        writableMap.putInt(str, paramJSONObject.getInt(str));
        continue;
      } 
      if (object instanceof String) {
        writableMap.putString(str, paramJSONObject.getString(str));
        continue;
      } 
      if (object instanceof JSONObject) {
        writableMap.putMap(str, (ReadableMap)a(paramJSONObject.getJSONObject(str)));
        continue;
      } 
      if (object instanceof JSONArray) {
        writableMap.putArray(str, (ReadableArray)a(paramJSONObject.getJSONArray(str)));
        continue;
      } 
      if (object == JSONObject.NULL)
        writableMap.putNull(str); 
    } 
    return writableMap;
  }
  
  public static JSONArray a(ReadableArray paramReadableArray) {
    // Byte code:
    //   0: new org/json/JSONArray
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: iconst_0
    //   9: istore_1
    //   10: iload_1
    //   11: aload_0
    //   12: invokeinterface size : ()I
    //   17: if_icmpge -> 180
    //   20: aload_0
    //   21: iload_1
    //   22: invokeinterface getType : (I)Lcom/facebook/react/bridge/ReadableType;
    //   27: astore_2
    //   28: getstatic io/invertase/firebase/messaging/m$a.a : [I
    //   31: aload_2
    //   32: invokevirtual ordinal : ()I
    //   35: iaload
    //   36: tableswitch default -> 76, 1 -> 163, 2 -> 148, 3 -> 118, 4 -> 107, 5 -> 93, 6 -> 79
    //   76: goto -> 173
    //   79: aload_0
    //   80: iload_1
    //   81: invokeinterface getArray : (I)Lcom/facebook/react/bridge/ReadableArray;
    //   86: invokestatic a : (Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;
    //   89: astore_2
    //   90: goto -> 167
    //   93: aload_0
    //   94: iload_1
    //   95: invokeinterface getMap : (I)Lcom/facebook/react/bridge/ReadableMap;
    //   100: invokestatic a : (Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;
    //   103: astore_2
    //   104: goto -> 167
    //   107: aload_0
    //   108: iload_1
    //   109: invokeinterface getString : (I)Ljava/lang/String;
    //   114: astore_2
    //   115: goto -> 167
    //   118: aload_3
    //   119: aload_0
    //   120: iload_1
    //   121: invokeinterface getInt : (I)I
    //   126: invokevirtual put : (I)Lorg/json/JSONArray;
    //   129: pop
    //   130: goto -> 173
    //   133: aload_3
    //   134: aload_0
    //   135: iload_1
    //   136: invokeinterface getDouble : (I)D
    //   141: invokevirtual put : (D)Lorg/json/JSONArray;
    //   144: pop
    //   145: goto -> 173
    //   148: aload_3
    //   149: aload_0
    //   150: iload_1
    //   151: invokeinterface getBoolean : (I)Z
    //   156: invokevirtual put : (Z)Lorg/json/JSONArray;
    //   159: pop
    //   160: goto -> 173
    //   163: getstatic org/json/JSONObject.NULL : Ljava/lang/Object;
    //   166: astore_2
    //   167: aload_3
    //   168: aload_2
    //   169: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
    //   172: pop
    //   173: iload_1
    //   174: iconst_1
    //   175: iadd
    //   176: istore_1
    //   177: goto -> 10
    //   180: aload_3
    //   181: areturn
    //   182: astore_2
    //   183: goto -> 133
    // Exception table:
    //   from	to	target	type
    //   118	130	182	java/lang/Exception
  }
  
  public static JSONObject a(ReadableMap paramReadableMap) {
    // Byte code:
    //   0: new org/json/JSONObject
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: invokeinterface keySetIterator : ()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
    //   14: astore_3
    //   15: aload_3
    //   16: invokeinterface hasNextKey : ()Z
    //   21: ifeq -> 202
    //   24: aload_3
    //   25: invokeinterface nextKey : ()Ljava/lang/String;
    //   30: astore #4
    //   32: aload_0
    //   33: aload #4
    //   35: invokeinterface getType : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;
    //   40: astore_1
    //   41: getstatic io/invertase/firebase/messaging/m$a.a : [I
    //   44: aload_1
    //   45: invokevirtual ordinal : ()I
    //   48: iaload
    //   49: tableswitch default -> 88, 1 -> 187, 2 -> 169, 3 -> 133, 4 -> 121, 5 -> 106, 6 -> 91
    //   88: goto -> 15
    //   91: aload_0
    //   92: aload #4
    //   94: invokeinterface getArray : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;
    //   99: invokestatic a : (Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;
    //   102: astore_1
    //   103: goto -> 191
    //   106: aload_0
    //   107: aload #4
    //   109: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   114: invokestatic a : (Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;
    //   117: astore_1
    //   118: goto -> 191
    //   121: aload_0
    //   122: aload #4
    //   124: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   129: astore_1
    //   130: goto -> 191
    //   133: aload_2
    //   134: aload #4
    //   136: aload_0
    //   137: aload #4
    //   139: invokeinterface getInt : (Ljava/lang/String;)I
    //   144: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   147: pop
    //   148: goto -> 15
    //   151: aload_2
    //   152: aload #4
    //   154: aload_0
    //   155: aload #4
    //   157: invokeinterface getDouble : (Ljava/lang/String;)D
    //   162: invokevirtual put : (Ljava/lang/String;D)Lorg/json/JSONObject;
    //   165: pop
    //   166: goto -> 15
    //   169: aload_2
    //   170: aload #4
    //   172: aload_0
    //   173: aload #4
    //   175: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   180: invokevirtual put : (Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   183: pop
    //   184: goto -> 15
    //   187: getstatic org/json/JSONObject.NULL : Ljava/lang/Object;
    //   190: astore_1
    //   191: aload_2
    //   192: aload #4
    //   194: aload_1
    //   195: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   198: pop
    //   199: goto -> 15
    //   202: aload_2
    //   203: areturn
    //   204: astore_1
    //   205: goto -> 151
    // Exception table:
    //   from	to	target	type
    //   133	148	204	java/lang/Exception
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */