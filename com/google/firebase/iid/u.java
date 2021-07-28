package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class u {
  final SharedPreferences a;
  
  final Context b;
  
  private final Map<String, Long> c = (Map<String, Long>)new b.d.a();
  
  public u(Context paramContext) {
    this.b = paramContext;
    this.a = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    b("com.google.android.gms.appid-no-backup");
  }
  
  static String a(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 6);
    stringBuilder.append(paramString1);
    stringBuilder.append("|S|cre");
    return stringBuilder.toString();
  }
  
  private void b(String paramString) {
    File file = new File(b.g.e.a.c(this.b), "com.google.android.gms.appid-no-backup");
    if (file.exists())
      return; 
    try {
      if (file.createNewFile() && !b()) {
        Log.i("FirebaseInstanceId", "App restored, clearing state");
        a();
        return;
      } 
    } catch (IOException iOException) {
      if (Log.isLoggable("FirebaseInstanceId", 3)) {
        String str = String.valueOf(iOException.getMessage());
        if (str.length() != 0) {
          str = "Error creating file in no backup dir: ".concat(str);
        } else {
          str = new String("Error creating file in no backup dir: ");
        } 
        Log.d("FirebaseInstanceId", str);
      } 
    } 
  }
  
  private long c(String paramString) {
    paramString = this.a.getString(a(paramString, "cre"), null);
    if (paramString != null)
      try {
        return Long.parseLong(paramString);
      } catch (NumberFormatException numberFormatException) {} 
    return 0L;
  }
  
  private String c(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 4 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length());
    stringBuilder.append(paramString1);
    stringBuilder.append("|T|");
    stringBuilder.append(paramString2);
    stringBuilder.append("|");
    stringBuilder.append(paramString3);
    return stringBuilder.toString();
  }
  
  private long d(String paramString) {
    long l = System.currentTimeMillis();
    String str = a(paramString, "cre");
    if (!this.a.contains(str)) {
      SharedPreferences.Editor editor = this.a.edit();
      editor.putString(a(paramString, "cre"), String.valueOf(l));
      editor.commit();
      return l;
    } 
    return c(paramString);
  }
  
  public long a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial d : (Ljava/lang/String;)J
    //   7: lstore_2
    //   8: aload_0
    //   9: getfield c : Ljava/util/Map;
    //   12: aload_1
    //   13: lload_2
    //   14: invokestatic valueOf : (J)Ljava/lang/Long;
    //   17: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: aload_0
    //   24: monitorexit
    //   25: lload_2
    //   26: lreturn
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	27	finally
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: invokeinterface clear : ()V
    //   11: aload_0
    //   12: getfield a : Landroid/content/SharedPreferences;
    //   15: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   20: invokeinterface clear : ()Landroid/content/SharedPreferences$Editor;
    //   25: invokeinterface commit : ()Z
    //   30: pop
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	31	34	finally
  }
  
  public void a(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: aload_3
    //   6: invokespecial c : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_1
    //   10: aload_0
    //   11: getfield a : Landroid/content/SharedPreferences;
    //   14: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   19: astore_2
    //   20: aload_2
    //   21: aload_1
    //   22: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   27: pop
    //   28: aload_2
    //   29: invokeinterface commit : ()Z
    //   34: pop
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	35	38	finally
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload #4
    //   4: aload #5
    //   6: invokestatic currentTimeMillis : ()J
    //   9: invokestatic a : (Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    //   12: astore #4
    //   14: aload #4
    //   16: ifnonnull -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield a : Landroid/content/SharedPreferences;
    //   26: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   31: astore #5
    //   33: aload #5
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: aload_3
    //   39: invokespecial c : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   42: aload #4
    //   44: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   49: pop
    //   50: aload #5
    //   52: invokeinterface commit : ()Z
    //   57: pop
    //   58: aload_0
    //   59: monitorexit
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	61	finally
    //   22	58	61	finally
  }
  
  public a b(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/SharedPreferences;
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: aload_3
    //   10: invokespecial c : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   13: aconst_null
    //   14: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   19: invokestatic b : (Ljava/lang/String;)Lcom/google/firebase/iid/u$a;
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: areturn
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	27	finally
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
    
    static String a(a param1a) {
      return (param1a == null) ? null : param1a.a;
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
        Log.w("FirebaseInstanceId", stringBuilder.toString());
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
          Log.w("FirebaseInstanceId", stringBuilder.toString());
          return null;
        }  
      return new a(str, null, 0L);
    }
    
    boolean a(String param1String) {
      return (System.currentTimeMillis() > this.c + d || !param1String.equals(this.b));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */