package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.g;
import com.google.firebase.installations.i;
import com.google.firebase.installations.m;
import com.google.firebase.o.f;
import com.google.firebase.p.b;
import com.google.firebase.r.i;
import e.f.a.e.d.d;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

public class k {
  private final g a;
  
  private final n b;
  
  private final d c;
  
  private final b<i> d;
  
  private final b<f> e;
  
  private final i f;
  
  public k(g paramg, n paramn, b<i> paramb, b<f> paramb1, i parami) {
    this(paramg, paramn, new d(paramg.b()), paramb, paramb1, parami);
  }
  
  k(g paramg, n paramn, d paramd, b<i> paramb, b<f> paramb1, i parami) {
    this.a = paramg;
    this.b = paramn;
    this.c = paramd;
    this.d = paramb;
    this.e = paramb1;
    this.f = parami;
  }
  
  private Bundle a(String paramString1, String paramString2, String paramString3, Bundle paramBundle) {
    paramBundle.putString("scope", paramString3);
    paramBundle.putString("sender", paramString2);
    paramBundle.putString("subtype", paramString2);
    paramBundle.putString("appid", paramString1);
    paramBundle.putString("gmp_app_id", this.a.d().b());
    paramBundle.putString("gmsv", Integer.toString(this.b.c()));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", this.b.a());
    paramBundle.putString("app_ver_name", this.b.b());
    paramBundle.putString("firebase-app-name-hash", a());
    try {
      paramString1 = ((m)o.a(this.f.a(false))).a();
      if (!TextUtils.isEmpty(paramString1)) {
        paramBundle.putString("Goog-Firebase-Installations-Auth", paramString1);
      } else {
        Log.w("FirebaseInstanceId", "FIS auth token is empty");
      } 
    } catch (ExecutionException executionException) {
      Log.e("FirebaseInstanceId", "Failed to get FIS auth token", executionException);
    } catch (InterruptedException interruptedException) {}
    paramBundle.putString("cliv", "fiid-21.1.0");
    f f = (f)this.e.get();
    i i1 = (i)this.d.get();
    if (f != null && i1 != null) {
      f.a a = f.a("fire-iid");
      if (a != f.a.c) {
        paramBundle.putString("Firebase-Client-Log-Type", Integer.toString(a.a()));
        paramBundle.putString("Firebase-Client", i1.a());
      } 
    } 
    return paramBundle;
  }
  
  private String a() {
    String str = this.a.c();
    try {
      return a(MessageDigest.getInstance("SHA-1").digest(str.getBytes()));
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      return "[HASH-ERROR]";
    } 
  }
  
  private String a(Bundle paramBundle) {
    if (paramBundle != null) {
      String str = paramBundle.getString("registration_id");
      if (str != null)
        return str; 
      str = paramBundle.getString("unregistered");
      if (str != null)
        return str; 
      str = paramBundle.getString("error");
      if (!"RST".equals(str)) {
        if (str != null)
          throw new IOException(str); 
        String str1 = String.valueOf(paramBundle);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 21);
        stringBuilder.append("Unexpected response: ");
        stringBuilder.append(str1);
        Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
      } 
      throw new IOException("INSTANCE_ID_RESET");
    } 
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    return Base64.encodeToString(paramArrayOfbyte, 11);
  }
  
  static boolean a(String paramString) {
    return ("SERVICE_NOT_AVAILABLE".equals(paramString) || "INTERNAL_SERVER_ERROR".equals(paramString) || "InternalServerError".equals(paramString));
  }
  
  private l<String> b(l<Bundle> paraml) {
    return paraml.a(b.a(), new j(this));
  }
  
  private l<Bundle> b(String paramString1, String paramString2, String paramString3, Bundle paramBundle) {
    a(paramString1, paramString2, paramString3, paramBundle);
    return this.c.a(paramBundle);
  }
  
  public l<?> a(String paramString1, String paramString2, String paramString3) {
    Bundle bundle = new Bundle();
    bundle.putString("delete", "1");
    return b(b(paramString1, paramString2, paramString3, bundle));
  }
  
  public l<String> b(String paramString1, String paramString2, String paramString3) {
    return b(b(paramString1, paramString2, paramString3, new Bundle()));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */