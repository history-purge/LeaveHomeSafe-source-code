package com.dieam.reactnativepushnotification.modules;

import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
  private final String A;
  
  private final boolean B;
  
  private final String C;
  
  private final String D;
  
  private final double E;
  
  private final double F;
  
  private final boolean G;
  
  private final double H;
  
  private final boolean I;
  
  private final boolean J;
  
  private final boolean K;
  
  private final boolean L;
  
  private final String a;
  
  private final String b;
  
  private final double c;
  
  private final String d;
  
  private final String e;
  
  private final boolean f;
  
  private final boolean g;
  
  private final String h;
  
  private final String i;
  
  private final String j;
  
  private final String k;
  
  private final String l;
  
  private final String m;
  
  private final String n;
  
  private final String o;
  
  private final String p;
  
  private final String q;
  
  private final String r;
  
  private final String s;
  
  private final String t;
  
  private final String u;
  
  private final boolean v;
  
  private final String w;
  
  private final boolean x;
  
  private final boolean y;
  
  private final double z;
  
  public a(Bundle paramBundle) {
    this.a = paramBundle.getString("id");
    this.b = paramBundle.getString("message");
    this.c = paramBundle.getDouble("fireDate");
    this.d = paramBundle.getString("title");
    this.e = paramBundle.getString("ticker");
    this.f = paramBundle.getBoolean("showWhen");
    this.g = paramBundle.getBoolean("autoCancel");
    this.h = paramBundle.getString("largeIcon");
    this.i = paramBundle.getString("largeIconUrl");
    this.j = paramBundle.getString("smallIcon");
    this.k = paramBundle.getString("bigText");
    this.l = paramBundle.getString("subText");
    this.m = paramBundle.getString("bigPictureUrl");
    this.n = paramBundle.getString("shortcutId");
    this.o = paramBundle.getString("number");
    this.p = paramBundle.getString("channelId");
    this.q = paramBundle.getString("channelName");
    this.r = paramBundle.getString("channelDescription");
    this.s = paramBundle.getString("sound");
    this.t = paramBundle.getString("color");
    this.u = paramBundle.getString("group");
    this.v = paramBundle.getBoolean("groupSummary");
    this.w = paramBundle.getString("messageId");
    this.x = paramBundle.getBoolean("playSound");
    this.y = paramBundle.getBoolean("vibrate");
    this.z = paramBundle.getDouble("vibration");
    this.A = paramBundle.getString("actions");
    this.B = paramBundle.getBoolean("invokeApp");
    this.C = paramBundle.getString("tag");
    this.D = paramBundle.getString("repeatType");
    this.E = paramBundle.getDouble("repeatTime");
    this.F = paramBundle.getDouble("when");
    this.G = paramBundle.getBoolean("usesChronometer");
    this.H = paramBundle.getDouble("timeoutAfter");
    this.I = paramBundle.getBoolean("onlyAlertOnce");
    this.J = paramBundle.getBoolean("ongoing");
    this.K = paramBundle.getBoolean("allowWhileIdle");
    this.L = paramBundle.getBoolean("ignoreInForeground");
  }
  
  private a(JSONObject paramJSONObject) {
    try {
      boolean bool = paramJSONObject.has("id");
      String str2 = null;
      if (bool) {
        str1 = paramJSONObject.getString("id");
      } else {
        str1 = null;
      } 
      this.a = str1;
      if (paramJSONObject.has("message")) {
        str1 = paramJSONObject.getString("message");
      } else {
        str1 = null;
      } 
      this.b = str1;
      bool = paramJSONObject.has("fireDate");
      double d2 = 0.0D;
      if (bool) {
        d1 = paramJSONObject.getDouble("fireDate");
      } else {
        d1 = 0.0D;
      } 
      this.c = d1;
      if (paramJSONObject.has("title")) {
        str1 = paramJSONObject.getString("title");
      } else {
        str1 = null;
      } 
      this.d = str1;
      if (paramJSONObject.has("ticker")) {
        str1 = paramJSONObject.getString("ticker");
      } else {
        str1 = null;
      } 
      this.e = str1;
      bool = paramJSONObject.has("showWhen");
      boolean bool2 = true;
      if (bool) {
        bool = paramJSONObject.getBoolean("showWhen");
      } else {
        bool = true;
      } 
      this.f = bool;
      if (paramJSONObject.has("autoCancel")) {
        bool = paramJSONObject.getBoolean("autoCancel");
      } else {
        bool = true;
      } 
      this.g = bool;
      if (paramJSONObject.has("largeIcon")) {
        str1 = paramJSONObject.getString("largeIcon");
      } else {
        str1 = null;
      } 
      this.h = str1;
      if (paramJSONObject.has("largeIconUrl")) {
        str1 = paramJSONObject.getString("largeIconUrl");
      } else {
        str1 = null;
      } 
      this.i = str1;
      if (paramJSONObject.has("smallIcon")) {
        str1 = paramJSONObject.getString("smallIcon");
      } else {
        str1 = null;
      } 
      this.j = str1;
      if (paramJSONObject.has("bigText")) {
        str1 = paramJSONObject.getString("bigText");
      } else {
        str1 = null;
      } 
      this.k = str1;
      if (paramJSONObject.has("subText")) {
        str1 = paramJSONObject.getString("subText");
      } else {
        str1 = null;
      } 
      this.l = str1;
      if (paramJSONObject.has("bigPictureUrl")) {
        str1 = paramJSONObject.getString("bigPictureUrl");
      } else {
        str1 = null;
      } 
      this.m = str1;
      if (paramJSONObject.has("shortcutId")) {
        str1 = paramJSONObject.getString("shortcutId");
      } else {
        str1 = null;
      } 
      this.n = str1;
      if (paramJSONObject.has("number")) {
        str1 = paramJSONObject.getString("number");
      } else {
        str1 = null;
      } 
      this.o = str1;
      if (paramJSONObject.has("channelId")) {
        str1 = paramJSONObject.getString("channelId");
      } else {
        str1 = null;
      } 
      this.p = str1;
      if (paramJSONObject.has("channelName")) {
        str1 = paramJSONObject.getString("channelName");
      } else {
        str1 = null;
      } 
      this.q = str1;
      if (paramJSONObject.has("channelDescription")) {
        str1 = paramJSONObject.getString("channelDescription");
      } else {
        str1 = null;
      } 
      this.r = str1;
      if (paramJSONObject.has("sound")) {
        str1 = paramJSONObject.getString("sound");
      } else {
        str1 = null;
      } 
      this.s = str1;
      if (paramJSONObject.has("color")) {
        str1 = paramJSONObject.getString("color");
      } else {
        str1 = null;
      } 
      this.t = str1;
      if (paramJSONObject.has("group")) {
        str1 = paramJSONObject.getString("group");
      } else {
        str1 = null;
      } 
      this.u = str1;
      bool = paramJSONObject.has("groupSummary");
      boolean bool1 = false;
      if (bool) {
        bool = paramJSONObject.getBoolean("groupSummary");
      } else {
        bool = false;
      } 
      this.v = bool;
      if (paramJSONObject.has("messageId")) {
        str1 = paramJSONObject.getString("messageId");
      } else {
        str1 = null;
      } 
      this.w = str1;
      if (paramJSONObject.has("playSound")) {
        bool = paramJSONObject.getBoolean("playSound");
      } else {
        bool = true;
      } 
      this.x = bool;
      if (paramJSONObject.has("vibrate")) {
        bool = paramJSONObject.getBoolean("vibrate");
      } else {
        bool = true;
      } 
      this.y = bool;
      if (paramJSONObject.has("vibration")) {
        d1 = paramJSONObject.getDouble("vibration");
      } else {
        d1 = 1000.0D;
      } 
      this.z = d1;
      if (paramJSONObject.has("actions")) {
        str1 = paramJSONObject.getString("actions");
      } else {
        str1 = null;
      } 
      this.A = str1;
      bool = bool2;
      if (paramJSONObject.has("invokeApp"))
        bool = paramJSONObject.getBoolean("invokeApp"); 
      this.B = bool;
      if (paramJSONObject.has("tag")) {
        str1 = paramJSONObject.getString("tag");
      } else {
        str1 = null;
      } 
      this.C = str1;
      String str1 = str2;
      if (paramJSONObject.has("repeatType"))
        str1 = paramJSONObject.getString("repeatType"); 
      this.D = str1;
      double d1 = d2;
      if (paramJSONObject.has("repeatTime"))
        d1 = paramJSONObject.getDouble("repeatTime"); 
      this.E = d1;
      if (paramJSONObject.has("when")) {
        d1 = paramJSONObject.getDouble("when");
      } else {
        d1 = -1.0D;
      } 
      this.F = d1;
      if (paramJSONObject.has("usesChronometer")) {
        bool = paramJSONObject.getBoolean("usesChronometer");
      } else {
        bool = false;
      } 
      this.G = bool;
      if (paramJSONObject.has("timeoutAfter")) {
        d1 = paramJSONObject.getDouble("timeoutAfter");
      } else {
        d1 = -1.0D;
      } 
      this.H = d1;
      if (paramJSONObject.has("onlyAlertOnce")) {
        bool = paramJSONObject.getBoolean("onlyAlertOnce");
      } else {
        bool = false;
      } 
      this.I = bool;
      if (paramJSONObject.has("ongoing")) {
        bool = paramJSONObject.getBoolean("ongoing");
      } else {
        bool = false;
      } 
      this.J = bool;
      if (paramJSONObject.has("allowWhileIdle")) {
        bool = paramJSONObject.getBoolean("allowWhileIdle");
      } else {
        bool = false;
      } 
      this.K = bool;
      bool = bool1;
      if (paramJSONObject.has("ignoreInForeground"))
        bool = paramJSONObject.getBoolean("ignoreInForeground"); 
      this.L = bool;
      return;
    } catch (JSONException jSONException) {
      throw new IllegalStateException("Exception while initializing RNPushNotificationAttributes from JSON", jSONException);
    } 
  }
  
  public static a a(String paramString) {
    return new a(new JSONObject(paramString));
  }
  
  public double a() {
    return this.c;
  }
  
  public boolean a(ReadableMap paramReadableMap) {
    Bundle bundle = h();
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      if (!bundle.containsKey(str))
        return false; 
      switch (a.a[paramReadableMap.getType(str).ordinal()]) {
        default:
          continue;
        case 5:
        case 6:
          return false;
        case 4:
          if (!paramReadableMap.getString(str).equals(bundle.getString(str)))
            return false; 
          continue;
        case 3:
          if (paramReadableMap.getDouble(str) != bundle.getDouble(str) && paramReadableMap.getInt(str) != bundle.getInt(str))
            return false; 
          continue;
        case 2:
          if (paramReadableMap.getBoolean(str) != bundle.getBoolean(str))
            return false; 
          continue;
        case 1:
          break;
      } 
      if (bundle.get(str) != null)
        return false; 
    } 
    return true;
  }
  
  public String b() {
    return this.a;
  }
  
  public String c() {
    return this.b;
  }
  
  public String d() {
    return this.o;
  }
  
  public String e() {
    return this.D;
  }
  
  public String f() {
    return this.s;
  }
  
  public String g() {
    return this.d;
  }
  
  public Bundle h() {
    Bundle bundle = new Bundle();
    bundle.putString("id", this.a);
    bundle.putString("message", this.b);
    bundle.putDouble("fireDate", this.c);
    bundle.putString("title", this.d);
    bundle.putString("ticker", this.e);
    bundle.putBoolean("showWhen", this.f);
    bundle.putBoolean("autoCancel", this.g);
    bundle.putString("largeIcon", this.h);
    bundle.putString("largeIconUrl", this.i);
    bundle.putString("smallIcon", this.j);
    bundle.putString("bigText", this.k);
    bundle.putString("subText", this.l);
    bundle.putString("bigPictureUrl", this.m);
    bundle.putString("shortcutId", this.n);
    bundle.putString("number", this.o);
    bundle.putString("channelId", this.p);
    bundle.putString("channelName", this.q);
    bundle.putString("channelDescription", this.r);
    bundle.putString("sound", this.s);
    bundle.putString("color", this.t);
    bundle.putString("group", this.u);
    bundle.putBoolean("groupSummary", this.v);
    bundle.putString("messageId", this.w);
    bundle.putBoolean("playSound", this.x);
    bundle.putBoolean("vibrate", this.y);
    bundle.putDouble("vibration", this.z);
    bundle.putString("actions", this.A);
    bundle.putBoolean("invokeApp", this.B);
    bundle.putString("tag", this.C);
    bundle.putString("repeatType", this.D);
    bundle.putDouble("repeatTime", this.E);
    bundle.putDouble("when", this.F);
    bundle.putBoolean("usesChronometer", this.G);
    bundle.putDouble("timeoutAfter", this.H);
    bundle.putBoolean("onlyAlertOnce", this.I);
    bundle.putBoolean("ongoing", this.J);
    bundle.putBoolean("allowWhileIdle", this.K);
    bundle.putBoolean("ignoreInForeground", this.L);
    return bundle;
  }
  
  public JSONObject i() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("id", this.a);
      jSONObject.put("message", this.b);
      jSONObject.put("fireDate", this.c);
      jSONObject.put("title", this.d);
      jSONObject.put("ticker", this.e);
      jSONObject.put("showWhen", this.f);
      jSONObject.put("autoCancel", this.g);
      jSONObject.put("largeIcon", this.h);
      jSONObject.put("largeIconUrl", this.i);
      jSONObject.put("smallIcon", this.j);
      jSONObject.put("bigText", this.k);
      jSONObject.put("bigPictureUrl", this.m);
      jSONObject.put("subText", this.l);
      jSONObject.put("shortcutId", this.n);
      jSONObject.put("number", this.o);
      jSONObject.put("channelId", this.p);
      jSONObject.put("channelName", this.q);
      jSONObject.put("channelDescription", this.r);
      jSONObject.put("sound", this.s);
      jSONObject.put("color", this.t);
      jSONObject.put("group", this.u);
      jSONObject.put("groupSummary", this.v);
      jSONObject.put("messageId", this.w);
      jSONObject.put("playSound", this.x);
      jSONObject.put("vibrate", this.y);
      jSONObject.put("vibration", this.z);
      jSONObject.put("actions", this.A);
      jSONObject.put("invokeApp", this.B);
      jSONObject.put("tag", this.C);
      jSONObject.put("repeatType", this.D);
      jSONObject.put("repeatTime", this.E);
      jSONObject.put("when", this.F);
      jSONObject.put("usesChronometer", this.G);
      jSONObject.put("timeoutAfter", this.H);
      jSONObject.put("onlyAlertOnce", this.I);
      jSONObject.put("ongoing", this.J);
      jSONObject.put("allowWhileIdle", this.K);
      jSONObject.put("ignoreInForeground", this.L);
      return jSONObject;
    } catch (JSONException jSONException) {
      Log.e("RNPushNotification", "Exception while converting RNPushNotificationAttributes to JSON. Returning an empty object", (Throwable)jSONException);
      return new JSONObject();
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RNPushNotificationAttributes{id='");
    stringBuilder.append(this.a);
    stringBuilder.append('\'');
    stringBuilder.append(", message='");
    stringBuilder.append(this.b);
    stringBuilder.append('\'');
    stringBuilder.append(", fireDate=");
    stringBuilder.append(this.c);
    stringBuilder.append(", title='");
    stringBuilder.append(this.d);
    stringBuilder.append('\'');
    stringBuilder.append(", ticker='");
    stringBuilder.append(this.e);
    stringBuilder.append('\'');
    stringBuilder.append(", showWhen=");
    stringBuilder.append(this.f);
    stringBuilder.append(", autoCancel=");
    stringBuilder.append(this.g);
    stringBuilder.append(", largeIcon='");
    stringBuilder.append(this.h);
    stringBuilder.append('\'');
    stringBuilder.append(", largeIconUrl='");
    stringBuilder.append(this.i);
    stringBuilder.append('\'');
    stringBuilder.append(", smallIcon='");
    stringBuilder.append(this.j);
    stringBuilder.append('\'');
    stringBuilder.append(", bigText='");
    stringBuilder.append(this.k);
    stringBuilder.append('\'');
    stringBuilder.append(", subText='");
    stringBuilder.append(this.l);
    stringBuilder.append('\'');
    stringBuilder.append(", bigPictureUrl='");
    stringBuilder.append(this.m);
    stringBuilder.append('\'');
    stringBuilder.append(", shortcutId='");
    stringBuilder.append(this.n);
    stringBuilder.append('\'');
    stringBuilder.append(", number='");
    stringBuilder.append(this.o);
    stringBuilder.append('\'');
    stringBuilder.append(", channelId='");
    stringBuilder.append(this.p);
    stringBuilder.append('\'');
    stringBuilder.append(", channelName='");
    stringBuilder.append(this.p);
    stringBuilder.append('\'');
    stringBuilder.append(", channelDescription='");
    stringBuilder.append(this.r);
    stringBuilder.append('\'');
    stringBuilder.append(", sound='");
    stringBuilder.append(this.s);
    stringBuilder.append('\'');
    stringBuilder.append(", color='");
    stringBuilder.append(this.t);
    stringBuilder.append('\'');
    stringBuilder.append(", group='");
    stringBuilder.append(this.u);
    stringBuilder.append('\'');
    stringBuilder.append(", groupSummary='");
    stringBuilder.append(this.v);
    stringBuilder.append('\'');
    stringBuilder.append(", messageId='");
    stringBuilder.append(this.w);
    stringBuilder.append('\'');
    stringBuilder.append(", playSound=");
    stringBuilder.append(this.x);
    stringBuilder.append(", vibrate=");
    stringBuilder.append(this.y);
    stringBuilder.append(", vibration=");
    stringBuilder.append(this.z);
    stringBuilder.append(", actions='");
    stringBuilder.append(this.A);
    stringBuilder.append('\'');
    stringBuilder.append(", invokeApp=");
    stringBuilder.append(this.B);
    stringBuilder.append(", tag='");
    stringBuilder.append(this.C);
    stringBuilder.append('\'');
    stringBuilder.append(", repeatType='");
    stringBuilder.append(this.D);
    stringBuilder.append('\'');
    stringBuilder.append(", repeatTime=");
    stringBuilder.append(this.E);
    stringBuilder.append(", when=");
    stringBuilder.append(this.F);
    stringBuilder.append(", usesChronometer=");
    stringBuilder.append(this.G);
    stringBuilder.append(", timeoutAfter=");
    stringBuilder.append(this.H);
    stringBuilder.append(", onlyAlertOnce=");
    stringBuilder.append(this.I);
    stringBuilder.append(", ongoing=");
    stringBuilder.append(this.J);
    stringBuilder.append(", allowWhileIdle=");
    stringBuilder.append(this.K);
    stringBuilder.append(", ignoreInForeground=");
    stringBuilder.append(this.L);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */