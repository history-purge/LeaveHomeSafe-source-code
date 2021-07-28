package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.m;

public final class j {
  private final String a;
  
  private final String b;
  
  private final String c;
  
  private final String d;
  
  private final String e;
  
  private final String f;
  
  private final String g;
  
  private j(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
    q.b(m.a(paramString1) ^ true, "ApplicationId must be set.");
    this.b = paramString1;
    this.a = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramString6;
    this.g = paramString7;
  }
  
  public static j a(Context paramContext) {
    s s = new s(paramContext);
    String str = s.a("google_app_id");
    return TextUtils.isEmpty(str) ? null : new j(str, s.a("google_api_key"), s.a("firebase_database_url"), s.a("ga_trackingId"), s.a("gcm_defaultSenderId"), s.a("google_storage_bucket"), s.a("project_id"));
  }
  
  public String a() {
    return this.a;
  }
  
  public String b() {
    return this.b;
  }
  
  public String c() {
    return this.c;
  }
  
  public String d() {
    return this.d;
  }
  
  public String e() {
    return this.e;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof j;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (o.a(this.b, ((j)paramObject).b)) {
      bool = bool1;
      if (o.a(this.a, ((j)paramObject).a)) {
        bool = bool1;
        if (o.a(this.c, ((j)paramObject).c)) {
          bool = bool1;
          if (o.a(this.d, ((j)paramObject).d)) {
            bool = bool1;
            if (o.a(this.e, ((j)paramObject).e)) {
              bool = bool1;
              if (o.a(this.f, ((j)paramObject).f)) {
                bool = bool1;
                if (o.a(this.g, ((j)paramObject).g))
                  bool = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool;
  }
  
  public String f() {
    return this.g;
  }
  
  public String g() {
    return this.f;
  }
  
  public int hashCode() {
    return o.a(new Object[] { this.b, this.a, this.c, this.d, this.e, this.f, this.g });
  }
  
  public String toString() {
    o.a a = o.a(this);
    a.a("applicationId", this.b);
    a.a("apiKey", this.a);
    a.a("databaseUrl", this.c);
    a.a("gcmSenderId", this.e);
    a.a("storageBucket", this.f);
    a.a("projectId", this.g);
    return a.toString();
  }
  
  public static final class b {
    private String a;
    
    private String b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    private String f;
    
    private String g;
    
    public b a(String param1String) {
      q.a(param1String, "ApiKey must be set.");
      this.a = param1String;
      return this;
    }
    
    public j a() {
      return new j(this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
    }
    
    public b b(String param1String) {
      q.a(param1String, "ApplicationId must be set.");
      this.b = param1String;
      return this;
    }
    
    public b c(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public b d(String param1String) {
      this.d = param1String;
      return this;
    }
    
    public b e(String param1String) {
      this.e = param1String;
      return this;
    }
    
    public b f(String param1String) {
      this.g = param1String;
      return this;
    }
    
    public b g(String param1String) {
      this.f = param1String;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */