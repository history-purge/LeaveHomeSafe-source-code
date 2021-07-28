package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t.a;
import java.util.Map;

public final class j0 extends a {
  public static final Parcelable.Creator<j0> CREATOR = new k0();
  
  Bundle c;
  
  private Map<String, String> d;
  
  private c e;
  
  public j0(Bundle paramBundle) {
    this.c = paramBundle;
  }
  
  void a(Intent paramIntent) {
    paramIntent.putExtras(this.c);
  }
  
  public String b() {
    return this.c.getString("collapse_key");
  }
  
  public Map<String, String> c() {
    if (this.d == null)
      this.d = (Map<String, String>)b.a.a(this.c); 
    return this.d;
  }
  
  public String d() {
    return this.c.getString("from");
  }
  
  public String e() {
    String str2 = this.c.getString("google.message_id");
    String str1 = str2;
    if (str2 == null)
      str1 = this.c.getString("message_id"); 
    return str1;
  }
  
  public String r() {
    return this.c.getString("message_type");
  }
  
  public c t() {
    if (this.e == null && i0.a(this.c))
      this.e = new c(new i0(this.c), null); 
    return this.e;
  }
  
  public long u() {
    Object object = this.c.get("google.sent_time");
    if (object instanceof Long)
      return ((Long)object).longValue(); 
    if (object instanceof String)
      try {
        return Long.parseLong((String)object);
      } catch (NumberFormatException numberFormatException) {
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(object).length() + 19);
        stringBuilder.append("Invalid sent time: ");
        stringBuilder.append((String)object);
        Log.w("FirebaseMessaging", stringBuilder.toString());
      }  
    return 0L;
  }
  
  public String v() {
    return this.c.getString("google.to");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    k0.a(this, paramParcel, paramInt);
  }
  
  public int x() {
    Object object = this.c.get("google.ttl");
    if (object instanceof Integer)
      return ((Integer)object).intValue(); 
    if (object instanceof String)
      try {
        return Integer.parseInt((String)object);
      } catch (NumberFormatException numberFormatException) {
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(object).length() + 13);
        stringBuilder.append("Invalid TTL: ");
        stringBuilder.append((String)object);
        Log.w("FirebaseMessaging", stringBuilder.toString());
      }  
    return 0;
  }
  
  public static class b {
    private final Bundle a = new Bundle();
    
    private final Map<String, String> b = (Map<String, String>)new b.d.a();
    
    public b(String param1String) {
      if (TextUtils.isEmpty(param1String)) {
        param1String = String.valueOf(param1String);
        if (param1String.length() != 0) {
          param1String = "Invalid to: ".concat(param1String);
        } else {
          param1String = new String("Invalid to: ");
        } 
        throw new IllegalArgumentException(param1String);
      } 
      this.a.putString("google.to", param1String);
    }
    
    public b a(int param1Int) {
      this.a.putString("google.ttl", String.valueOf(param1Int));
      return this;
    }
    
    public b a(String param1String) {
      this.a.putString("collapse_key", param1String);
      return this;
    }
    
    public b a(String param1String1, String param1String2) {
      this.b.put(param1String1, param1String2);
      return this;
    }
    
    public j0 a() {
      Bundle bundle = new Bundle();
      for (Map.Entry<String, String> entry : this.b.entrySet())
        bundle.putString((String)entry.getKey(), (String)entry.getValue()); 
      bundle.putAll(this.a);
      this.a.remove("from");
      return new j0(bundle);
    }
    
    public b b(String param1String) {
      this.a.putString("google.message_id", param1String);
      return this;
    }
    
    public b c(String param1String) {
      this.a.putString("message_type", param1String);
      return this;
    }
  }
  
  public static class c {
    private final String a;
    
    private final String b;
    
    private final String[] c;
    
    private final String d;
    
    private final String e;
    
    private final String[] f;
    
    private final String g;
    
    private final String h;
    
    private final String i;
    
    private final String j;
    
    private final String k;
    
    private final String l;
    
    private final Uri m;
    
    private final String n;
    
    private final Integer o;
    
    private final Integer p;
    
    private final Integer q;
    
    private c(i0 param1i0) {
      this.a = param1i0.g("gcm.n.title");
      this.b = param1i0.e("gcm.n.title");
      this.c = a(param1i0, "gcm.n.title");
      this.d = param1i0.g("gcm.n.body");
      this.e = param1i0.e("gcm.n.body");
      this.f = a(param1i0, "gcm.n.body");
      this.g = param1i0.g("gcm.n.icon");
      this.i = param1i0.f();
      param1i0.g("gcm.n.tag");
      this.j = param1i0.g("gcm.n.color");
      this.k = param1i0.g("gcm.n.click_action");
      this.l = param1i0.g("gcm.n.android_channel_id");
      this.m = param1i0.b();
      this.h = param1i0.g("gcm.n.image");
      this.n = param1i0.g("gcm.n.ticker");
      this.o = param1i0.b("gcm.n.notification_priority");
      this.p = param1i0.b("gcm.n.visibility");
      this.q = param1i0.b("gcm.n.notification_count");
      param1i0.a("gcm.n.sticky");
      param1i0.a("gcm.n.local_only");
      param1i0.a("gcm.n.default_sound");
      param1i0.a("gcm.n.default_vibrate_timings");
      param1i0.a("gcm.n.default_light_settings");
      param1i0.f("gcm.n.event_time");
      param1i0.a();
      param1i0.g();
    }
    
    private static String[] a(i0 param1i0, String param1String) {
      Object[] arrayOfObject = param1i0.d(param1String);
      if (arrayOfObject == null)
        return null; 
      String[] arrayOfString = new String[arrayOfObject.length];
      for (int i = 0; i < arrayOfObject.length; i++)
        arrayOfString[i] = String.valueOf(arrayOfObject[i]); 
      return arrayOfString;
    }
    
    public String a() {
      return this.d;
    }
    
    public String[] b() {
      return this.f;
    }
    
    public String c() {
      return this.e;
    }
    
    public String d() {
      return this.l;
    }
    
    public String e() {
      return this.k;
    }
    
    public String f() {
      return this.j;
    }
    
    public String g() {
      return this.g;
    }
    
    public Uri h() {
      String str = this.h;
      return (str != null) ? Uri.parse(str) : null;
    }
    
    public Uri i() {
      return this.m;
    }
    
    public Integer j() {
      return this.q;
    }
    
    public Integer k() {
      return this.o;
    }
    
    public String l() {
      return this.i;
    }
    
    public String m() {
      return this.n;
    }
    
    public String n() {
      return this.a;
    }
    
    public String[] o() {
      return this.c;
    }
    
    public String p() {
      return this.b;
    }
    
    public Integer q() {
      return this.p;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */