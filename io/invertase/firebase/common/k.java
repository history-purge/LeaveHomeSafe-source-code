package io.invertase.firebase.common;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class k {
  private static WritableArray a(List<Object> paramList) {
    WritableArray writableArray = Arguments.createArray();
    Iterator iterator = paramList.iterator();
    while (iterator.hasNext())
      a(iterator.next(), writableArray); 
    return writableArray;
  }
  
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
  
  public static WritableMap a(Exception paramException) {
    WritableMap writableMap = Arguments.createMap();
    String str = paramException.getMessage();
    writableMap.putString("code", "unknown");
    writableMap.putString("nativeErrorCode", "unknown");
    writableMap.putString("message", str);
    writableMap.putString("nativeErrorMessage", str);
    return writableMap;
  }
  
  public static WritableMap a(Map<String, Object> paramMap) {
    WritableMap writableMap = Arguments.createMap();
    for (Map.Entry<String, Object> entry : paramMap.entrySet())
      a((String)entry.getKey(), entry.getValue(), writableMap); 
    return writableMap;
  }
  
  public static WritableMap a(JSONObject paramJSONObject) {
    Iterator<String> iterator = paramJSONObject.keys();
    WritableMap writableMap = Arguments.createMap();
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
  
  public static void a(Object paramObject, WritableArray paramWritableArray) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 484
    //   4: aload_0
    //   5: getstatic org/json/JSONObject.NULL : Ljava/lang/Object;
    //   8: if_acmpne -> 14
    //   11: goto -> 484
    //   14: aload_0
    //   15: invokevirtual getClass : ()Ljava/lang/Class;
    //   18: invokevirtual getName : ()Ljava/lang/String;
    //   21: astore #5
    //   23: iconst_m1
    //   24: istore #4
    //   26: aload #5
    //   28: invokevirtual hashCode : ()I
    //   31: lookupswitch default -> 104, -2056817302 -> 221, -527879800 -> 205, 146015330 -> 188, 344809556 -> 172, 398795216 -> 156, 761287205 -> 140, 1195259493 -> 124, 1614941136 -> 107
    //   104: goto -> 234
    //   107: aload #5
    //   109: ldc 'org.json.JSONObject$1'
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifeq -> 234
    //   117: bipush #6
    //   119: istore #4
    //   121: goto -> 234
    //   124: aload #5
    //   126: ldc 'java.lang.String'
    //   128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   131: ifeq -> 234
    //   134: iconst_5
    //   135: istore #4
    //   137: goto -> 234
    //   140: aload #5
    //   142: ldc 'java.lang.Double'
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifeq -> 234
    //   150: iconst_3
    //   151: istore #4
    //   153: goto -> 234
    //   156: aload #5
    //   158: ldc 'java.lang.Long'
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 234
    //   166: iconst_1
    //   167: istore #4
    //   169: goto -> 234
    //   172: aload #5
    //   174: ldc 'java.lang.Boolean'
    //   176: invokevirtual equals : (Ljava/lang/Object;)Z
    //   179: ifeq -> 234
    //   182: iconst_0
    //   183: istore #4
    //   185: goto -> 234
    //   188: aload #5
    //   190: ldc 'org.json.JSONArray$1'
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: ifeq -> 234
    //   198: bipush #7
    //   200: istore #4
    //   202: goto -> 234
    //   205: aload #5
    //   207: ldc 'java.lang.Float'
    //   209: invokevirtual equals : (Ljava/lang/Object;)Z
    //   212: ifeq -> 234
    //   215: iconst_2
    //   216: istore #4
    //   218: goto -> 234
    //   221: aload #5
    //   223: ldc 'java.lang.Integer'
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifeq -> 234
    //   231: iconst_4
    //   232: istore #4
    //   234: iload #4
    //   236: tableswitch default -> 284, 0 -> 403, 1 -> 386, 2 -> 374, 3 -> 363, 4 -> 349, 5 -> 338, 6 -> 324, 7 -> 310
    //   284: ldc java/util/List
    //   286: aload_0
    //   287: invokevirtual getClass : ()Ljava/lang/Class;
    //   290: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   293: ifeq -> 417
    //   296: aload_1
    //   297: aload_0
    //   298: checkcast java/util/List
    //   301: invokestatic a : (Ljava/util/List;)Lcom/facebook/react/bridge/WritableArray;
    //   304: invokeinterface pushArray : (Lcom/facebook/react/bridge/ReadableArray;)V
    //   309: return
    //   310: aload_1
    //   311: aload_0
    //   312: checkcast org/json/JSONArray
    //   315: invokestatic a : (Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;
    //   318: invokeinterface pushArray : (Lcom/facebook/react/bridge/ReadableArray;)V
    //   323: return
    //   324: aload_1
    //   325: aload_0
    //   326: checkcast org/json/JSONObject
    //   329: invokestatic a : (Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;
    //   332: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   337: return
    //   338: aload_1
    //   339: aload_0
    //   340: checkcast java/lang/String
    //   343: invokeinterface pushString : (Ljava/lang/String;)V
    //   348: return
    //   349: aload_1
    //   350: aload_0
    //   351: checkcast java/lang/Integer
    //   354: invokevirtual intValue : ()I
    //   357: invokeinterface pushInt : (I)V
    //   362: return
    //   363: aload_0
    //   364: checkcast java/lang/Double
    //   367: invokevirtual doubleValue : ()D
    //   370: dstore_2
    //   371: goto -> 395
    //   374: aload_0
    //   375: checkcast java/lang/Float
    //   378: invokevirtual floatValue : ()F
    //   381: f2d
    //   382: dstore_2
    //   383: goto -> 395
    //   386: aload_0
    //   387: checkcast java/lang/Long
    //   390: invokevirtual longValue : ()J
    //   393: l2d
    //   394: dstore_2
    //   395: aload_1
    //   396: dload_2
    //   397: invokeinterface pushDouble : (D)V
    //   402: return
    //   403: aload_1
    //   404: aload_0
    //   405: checkcast java/lang/Boolean
    //   408: invokevirtual booleanValue : ()Z
    //   411: invokeinterface pushBoolean : (Z)V
    //   416: return
    //   417: ldc java/util/Map
    //   419: aload_0
    //   420: invokevirtual getClass : ()Ljava/lang/Class;
    //   423: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   426: ifeq -> 443
    //   429: aload_1
    //   430: aload_0
    //   431: checkcast java/util/Map
    //   434: invokestatic a : (Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;
    //   437: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   442: return
    //   443: new java/lang/StringBuilder
    //   446: dup
    //   447: invokespecial <init> : ()V
    //   450: astore_0
    //   451: aload_0
    //   452: ldc_w 'utils:arrayPushValue:unknownType:'
    //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: pop
    //   459: aload_0
    //   460: aload #5
    //   462: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: pop
    //   466: ldc_w 'Utils'
    //   469: aload_0
    //   470: invokevirtual toString : ()Ljava/lang/String;
    //   473: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   476: pop
    //   477: aload_1
    //   478: invokeinterface pushNull : ()V
    //   483: return
    //   484: aload_1
    //   485: invokeinterface pushNull : ()V
    //   490: return
    //   491: astore_0
    //   492: goto -> 477
    // Exception table:
    //   from	to	target	type
    //   310	323	491	org/json/JSONException
    //   324	337	491	org/json/JSONException
  }
  
  public static void a(String paramString, Object paramObject, WritableMap paramWritableMap) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 493
    //   4: aload_1
    //   5: getstatic org/json/JSONObject.NULL : Ljava/lang/Object;
    //   8: if_acmpne -> 14
    //   11: goto -> 493
    //   14: aload_1
    //   15: invokevirtual getClass : ()Ljava/lang/Class;
    //   18: invokevirtual getName : ()Ljava/lang/String;
    //   21: astore #6
    //   23: iconst_m1
    //   24: istore #5
    //   26: aload #6
    //   28: invokevirtual hashCode : ()I
    //   31: lookupswitch default -> 104, -2056817302 -> 221, -527879800 -> 205, 146015330 -> 188, 344809556 -> 172, 398795216 -> 156, 761287205 -> 140, 1195259493 -> 124, 1614941136 -> 107
    //   104: goto -> 234
    //   107: aload #6
    //   109: ldc 'org.json.JSONObject$1'
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifeq -> 234
    //   117: bipush #6
    //   119: istore #5
    //   121: goto -> 234
    //   124: aload #6
    //   126: ldc 'java.lang.String'
    //   128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   131: ifeq -> 234
    //   134: iconst_5
    //   135: istore #5
    //   137: goto -> 234
    //   140: aload #6
    //   142: ldc 'java.lang.Double'
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifeq -> 234
    //   150: iconst_3
    //   151: istore #5
    //   153: goto -> 234
    //   156: aload #6
    //   158: ldc 'java.lang.Long'
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 234
    //   166: iconst_1
    //   167: istore #5
    //   169: goto -> 234
    //   172: aload #6
    //   174: ldc 'java.lang.Boolean'
    //   176: invokevirtual equals : (Ljava/lang/Object;)Z
    //   179: ifeq -> 234
    //   182: iconst_0
    //   183: istore #5
    //   185: goto -> 234
    //   188: aload #6
    //   190: ldc 'org.json.JSONArray$1'
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: ifeq -> 234
    //   198: bipush #7
    //   200: istore #5
    //   202: goto -> 234
    //   205: aload #6
    //   207: ldc 'java.lang.Float'
    //   209: invokevirtual equals : (Ljava/lang/Object;)Z
    //   212: ifeq -> 234
    //   215: iconst_2
    //   216: istore #5
    //   218: goto -> 234
    //   221: aload #6
    //   223: ldc 'java.lang.Integer'
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifeq -> 234
    //   231: iconst_4
    //   232: istore #5
    //   234: iload #5
    //   236: tableswitch default -> 284, 0 -> 409, 1 -> 391, 2 -> 379, 3 -> 368, 4 -> 353, 5 -> 341, 6 -> 326, 7 -> 311
    //   284: ldc java/util/List
    //   286: aload_1
    //   287: invokevirtual getClass : ()Ljava/lang/Class;
    //   290: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   293: ifeq -> 424
    //   296: aload_2
    //   297: aload_0
    //   298: aload_1
    //   299: checkcast java/util/List
    //   302: invokestatic a : (Ljava/util/List;)Lcom/facebook/react/bridge/WritableArray;
    //   305: invokeinterface putArray : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    //   310: return
    //   311: aload_2
    //   312: aload_0
    //   313: aload_1
    //   314: checkcast org/json/JSONArray
    //   317: invokestatic a : (Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;
    //   320: invokeinterface putArray : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    //   325: return
    //   326: aload_2
    //   327: aload_0
    //   328: aload_1
    //   329: checkcast org/json/JSONObject
    //   332: invokestatic a : (Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;
    //   335: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   340: return
    //   341: aload_2
    //   342: aload_0
    //   343: aload_1
    //   344: checkcast java/lang/String
    //   347: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   352: return
    //   353: aload_2
    //   354: aload_0
    //   355: aload_1
    //   356: checkcast java/lang/Integer
    //   359: invokevirtual intValue : ()I
    //   362: invokeinterface putInt : (Ljava/lang/String;I)V
    //   367: return
    //   368: aload_1
    //   369: checkcast java/lang/Double
    //   372: invokevirtual doubleValue : ()D
    //   375: dstore_3
    //   376: goto -> 400
    //   379: aload_1
    //   380: checkcast java/lang/Float
    //   383: invokevirtual floatValue : ()F
    //   386: f2d
    //   387: dstore_3
    //   388: goto -> 400
    //   391: aload_1
    //   392: checkcast java/lang/Long
    //   395: invokevirtual longValue : ()J
    //   398: l2d
    //   399: dstore_3
    //   400: aload_2
    //   401: aload_0
    //   402: dload_3
    //   403: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   408: return
    //   409: aload_2
    //   410: aload_0
    //   411: aload_1
    //   412: checkcast java/lang/Boolean
    //   415: invokevirtual booleanValue : ()Z
    //   418: invokeinterface putBoolean : (Ljava/lang/String;Z)V
    //   423: return
    //   424: ldc java/util/Map
    //   426: aload_1
    //   427: invokevirtual getClass : ()Ljava/lang/Class;
    //   430: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   433: ifeq -> 451
    //   436: aload_2
    //   437: aload_0
    //   438: aload_1
    //   439: checkcast java/util/Map
    //   442: invokestatic a : (Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;
    //   445: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   450: return
    //   451: new java/lang/StringBuilder
    //   454: dup
    //   455: invokespecial <init> : ()V
    //   458: astore_1
    //   459: aload_1
    //   460: ldc_w 'utils:mapPutValue:unknownType:'
    //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: pop
    //   467: aload_1
    //   468: aload #6
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: pop
    //   474: ldc_w 'Utils'
    //   477: aload_1
    //   478: invokevirtual toString : ()Ljava/lang/String;
    //   481: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   484: pop
    //   485: aload_2
    //   486: aload_0
    //   487: invokeinterface putNull : (Ljava/lang/String;)V
    //   492: return
    //   493: aload_2
    //   494: aload_0
    //   495: invokeinterface putNull : (Ljava/lang/String;)V
    //   500: return
    //   501: astore_1
    //   502: goto -> 485
    // Exception table:
    //   from	to	target	type
    //   311	325	501	org/json/JSONException
    //   326	340	501	org/json/JSONException
  }
  
  public static boolean a(Context paramContext) {
    ActivityManager activityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (activityManager == null)
      return false; 
    List list = activityManager.getRunningAppProcesses();
    if (list == null)
      return false; 
    String str = paramContext.getPackageName();
    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
      if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(str))
        try {
          ReactContext reactContext = (ReactContext)paramContext;
          return (reactContext.getLifecycleState() == LifecycleState.e);
        } catch (ClassCastException classCastException) {
          return true;
        }  
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */