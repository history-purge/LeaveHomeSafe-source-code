package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class r0 {
  final SharedPreferences a;
  
  final Context b;
  
  public r0(Context paramContext) {
    this.b = paramContext;
    this.a = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    a("com.google.android.gms.appid-no-backup");
  }
  
  private void a(String paramString) {
    File file = new File(b.g.e.a.c(this.b), "com.google.android.gms.appid-no-backup");
    if (file.exists())
      return; 
    try {
      if (file.createNewFile() && !b()) {
        Log.i("FirebaseMessaging", "App restored, clearing state");
        a();
        return;
      } 
    } catch (IOException iOException) {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        String str = String.valueOf(iOException.getMessage());
        if (str.length() != 0) {
          str = "Error creating file in no backup dir: ".concat(str);
        } else {
          str = new String("Error creating file in no backup dir: ");
        } 
        Log.d("FirebaseMessaging", str);
      } 
    } 
  }
  
  private String b(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 5 + String.valueOf(paramString2).length());
    stringBuilder.append(paramString1);
    stringBuilder.append("|T|");
    stringBuilder.append(paramString2);
    stringBuilder.append("|*");
    return stringBuilder.toString();
  }
  
  public a a(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/SharedPreferences;
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   12: aconst_null
    //   13: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   18: invokestatic b : (Ljava/lang/String;)Lcom/google/firebase/messaging/r0$a;
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: areturn
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	26	finally
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/SharedPreferences;
    //   6: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   11: invokeinterface clear : ()Landroid/content/SharedPreferences$Editor;
    //   16: invokeinterface commit : ()Z
    //   21: pop
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	25	finally
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_3
    //   3: aload #4
    //   5: invokestatic currentTimeMillis : ()J
    //   8: invokestatic a : (Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    //   11: astore_3
    //   12: aload_3
    //   13: ifnonnull -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: getfield a : Landroid/content/SharedPreferences;
    //   23: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   28: astore #4
    //   30: aload #4
    //   32: aload_0
    //   33: aload_1
    //   34: aload_2
    //   35: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: aload_3
    //   39: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   44: pop
    //   45: aload #4
    //   47: invokeinterface commit : ()Z
    //   52: pop
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	56	finally
    //   19	53	56	finally
  }
  
  public boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/SharedPreferences;
    //   6: invokeinterface getAll : ()Ljava/util/Map;
    //   11: invokeinterface isEmpty : ()Z
    //   16: istore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: iload_1
    //   20: ireturn
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	21	finally
  }
  
  static class a {
    private static final long d = TimeUnit.DAYS.toMillis(7L);
    
    final String a;
    
    final String b;
    
    final long c;
    
    private a(String param1String1, String param1String2, long param1Long) {
      this.a = param1String1;
      this.b = param1String2;
      this.c = param1Long;
    }
    
    static String a(String param1String1, String param1String2, long param1Long) {
      try {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", param1String1);
        jSONObject.put("appVersion", param1String2);
        jSONObject.put("timestamp", param1Long);
        return jSONObject.toString();
      } catch (JSONException jSONException) {
        String str = String.valueOf(jSONException);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 24);
        stringBuilder.append("Failed to encode token: ");
        stringBuilder.append(str);
        Log.w("FirebaseMessaging", stringBuilder.toString());
        return null;
      } 
    }
    
    static a b(String param1String) {
      String str;
      if (TextUtils.isEmpty(param1String))
        return null; 
      if (param1String.startsWith("{"))
        try {
          JSONObject jSONObject = new JSONObject(param1String);
          return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException jSONException) {
          str = String.valueOf(jSONException);
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
          stringBuilder.append("Failed to parse token: ");
          stringBuilder.append(str);
          Log.w("FirebaseMessaging", stringBuilder.toString());
          return null;
        }  
      return new a(str, null, 0L);
    }
    
    boolean a(String param1String) {
      return (System.currentTimeMillis() > this.c + d || !param1String.equals(this.b));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */