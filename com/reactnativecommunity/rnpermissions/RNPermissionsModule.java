package com.reactnativecommunity.rnpermissions;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.core.app.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@a(name = "RNPermissions")
public class RNPermissionsModule extends ReactContextBaseJavaModule {
  private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
  
  public static final String MODULE_NAME = "RNPermissions";
  
  private static final String[][] PERMISSIONS;
  
  private static final String SETTING_NAME = "@RNPermissions:NonRequestables";
  
  private final SharedPreferences sharedPrefs;
  
  static {
    String[] arrayOfString1 = { "ACCEPT_HANDOVER", "android.permission.ACCEPT_HANDOVER" };
    String[] arrayOfString2 = { "ACCESS_BACKGROUND_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION" };
    String[] arrayOfString3 = { "ACCESS_FINE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" };
    String[] arrayOfString4 = { "ADD_VOICEMAIL", "com.android.voicemail.permission.ADD_VOICEMAIL" };
    String[] arrayOfString5 = { "ANSWER_PHONE_CALLS", "android.permission.ANSWER_PHONE_CALLS" };
    String[] arrayOfString6 = { "BODY_SENSORS", "android.permission.BODY_SENSORS" };
    String[] arrayOfString7 = { "CALL_PHONE", "android.permission.CALL_PHONE" };
    String[] arrayOfString8 = { "GET_ACCOUNTS", "android.permission.GET_ACCOUNTS" };
    String[] arrayOfString9 = { "PROCESS_OUTGOING_CALLS", "android.permission.PROCESS_OUTGOING_CALLS" };
    String[] arrayOfString10 = { "READ_CALENDAR", "android.permission.READ_CALENDAR" };
    String[] arrayOfString11 = { "READ_CALL_LOG", "android.permission.READ_CALL_LOG" };
    String[] arrayOfString12 = { "READ_CONTACTS", "android.permission.READ_CONTACTS" };
    String[] arrayOfString13 = { "READ_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE" };
    String[] arrayOfString14 = { "READ_PHONE_NUMBERS", "android.permission.READ_PHONE_NUMBERS" };
    String[] arrayOfString15 = { "READ_PHONE_STATE", "android.permission.READ_PHONE_STATE" };
    String[] arrayOfString16 = { "READ_SMS", "android.permission.READ_SMS" };
    String[] arrayOfString17 = { "RECEIVE_MMS", "android.permission.RECEIVE_MMS" };
    String[] arrayOfString18 = { "RECEIVE_SMS", "android.permission.RECEIVE_SMS" };
    String[] arrayOfString19 = { "RECEIVE_WAP_PUSH", "android.permission.RECEIVE_WAP_PUSH" };
    String[] arrayOfString20 = { "SEND_SMS", "android.permission.SEND_SMS" };
    String[] arrayOfString21 = { "USE_SIP", "android.permission.USE_SIP" };
    String[] arrayOfString22 = { "WRITE_CALENDAR", "android.permission.WRITE_CALENDAR" };
    String[] arrayOfString23 = { "WRITE_CALL_LOG", "android.permission.WRITE_CALL_LOG" };
    String[] arrayOfString24 = { "WRITE_CONTACTS", "android.permission.WRITE_CONTACTS" };
    String[] arrayOfString25 = { "WRITE_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE" };
    PERMISSIONS = new String[][] { 
        arrayOfString1, arrayOfString2, { "ACCESS_COARSE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION" }, arrayOfString3, { "ACTIVITY_RECOGNITION", "android.permission.ACTIVITY_RECOGNITION" }, arrayOfString4, arrayOfString5, arrayOfString6, arrayOfString7, { "CAMERA", "android.permission.CAMERA" }, 
        arrayOfString8, arrayOfString9, arrayOfString10, arrayOfString11, arrayOfString12, arrayOfString13, arrayOfString14, arrayOfString15, arrayOfString16, arrayOfString17, 
        arrayOfString18, arrayOfString19, { "RECORD_AUDIO", "android.permission.RECORD_AUDIO" }, arrayOfString20, arrayOfString21, arrayOfString22, arrayOfString23, arrayOfString24, arrayOfString25 };
  }
  
  public RNPermissionsModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.sharedPrefs = paramReactApplicationContext.getSharedPreferences("@RNPermissions:NonRequestables", 0);
  }
  
  private boolean fieldExists(String paramString) {
    try {
      Manifest.permission.class.getField(paramString);
      return true;
    } catch (NoSuchFieldException noSuchFieldException) {
      return false;
    } 
  }
  
  @ReactMethod
  public void checkNotifications(Promise paramPromise) {
    String str;
    boolean bool = l.a((Context)getReactApplicationContext()).a();
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    if (bool) {
      str = "granted";
    } else {
      str = "blocked";
    } 
    writableMap1.putString("status", str);
    writableMap1.putMap("settings", (ReadableMap)writableMap2);
    paramPromise.resolve(writableMap1);
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    WritableArray writableArray = Arguments.createArray();
    for (String[] arrayOfString : PERMISSIONS) {
      if (fieldExists(arrayOfString[0]))
        writableArray.pushString(arrayOfString[1]); 
    } 
    hashMap.put("available", writableArray);
    return (Map)hashMap;
  }
  
  public String getName() {
    return "RNPermissions";
  }
  
  @ReactMethod
  public void getNonRequestables(Promise paramPromise) {
    WritableArray writableArray = Arguments.createArray();
    Iterator<Map.Entry> iterator = this.sharedPrefs.getAll().entrySet().iterator();
    while (iterator.hasNext())
      writableArray.pushString((String)((Map.Entry)iterator.next()).getKey()); 
    paramPromise.resolve(writableArray);
  }
  
  @ReactMethod
  public void isNonRequestable(String paramString, Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(this.sharedPrefs.getBoolean(paramString, false)));
  }
  
  @ReactMethod
  public void openSettings(Promise paramPromise) {
    try {
      ReactApplicationContext reactApplicationContext = getReactApplicationContext();
      Intent intent = new Intent();
      String str = reactApplicationContext.getPackageName();
      intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
      intent.addFlags(268435456);
      intent.setData(Uri.fromParts("package", str, null));
      reactApplicationContext.startActivity(intent);
      paramPromise.resolve(Boolean.valueOf(true));
      return;
    } catch (Exception exception) {
      paramPromise.reject("E_INVALID_ACTIVITY", exception);
      return;
    } 
  }
  
  @ReactMethod
  public void setNonRequestable(String paramString, Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(this.sharedPrefs.edit().putBoolean(paramString, true).commit()));
  }
  
  @ReactMethod
  public void setNonRequestables(ReadableArray paramReadableArray, Promise paramPromise) {
    SharedPreferences.Editor editor = this.sharedPrefs.edit();
    for (int i = 0; i < paramReadableArray.size(); i++)
      editor.putBoolean(paramReadableArray.getString(i), true); 
    paramPromise.resolve(Boolean.valueOf(editor.commit()));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/rnpermissions/RNPermissionsModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */