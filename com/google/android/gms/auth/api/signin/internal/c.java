package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class c {
  private static final Lock c = new ReentrantLock();
  
  private static c d;
  
  private final Lock a = new ReentrantLock();
  
  private final SharedPreferences b;
  
  private c(Context paramContext) {
    this.b = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  private final GoogleSignInAccount a(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    paramString = c(b("googleSignInAccount", paramString));
    if (paramString != null)
      try {
        return GoogleSignInAccount.b(paramString);
      } catch (JSONException jSONException) {
        return null;
      }  
    return null;
  }
  
  @RecentlyNonNull
  public static c a(@RecentlyNonNull Context paramContext) {
    q.a(paramContext);
    c.lock();
    try {
      if (d == null)
        d = new c(paramContext.getApplicationContext()); 
      return d;
    } finally {
      c.unlock();
    } 
  }
  
  private final void a(String paramString1, String paramString2) {
    this.a.lock();
    try {
      this.b.edit().putString(paramString1, paramString2).apply();
      return;
    } finally {
      this.a.unlock();
    } 
  }
  
  private final GoogleSignInOptions b(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    paramString = c(b("googleSignInOptions", paramString));
    if (paramString != null)
      try {
        return GoogleSignInOptions.b(paramString);
      } catch (JSONException jSONException) {
        return null;
      }  
    return null;
  }
  
  private static String b(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 1 + String.valueOf(paramString2).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(":");
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  private final String c(String paramString) {
    this.a.lock();
    try {
      paramString = this.b.getString(paramString, null);
      return paramString;
    } finally {
      this.a.unlock();
    } 
  }
  
  public void a() {
    this.a.lock();
    try {
      this.b.edit().clear().apply();
      return;
    } finally {
      this.a.unlock();
    } 
  }
  
  public void a(@RecentlyNonNull GoogleSignInAccount paramGoogleSignInAccount, @RecentlyNonNull GoogleSignInOptions paramGoogleSignInOptions) {
    q.a(paramGoogleSignInAccount);
    q.a(paramGoogleSignInOptions);
    a("defaultGoogleSignInAccount", paramGoogleSignInAccount.z());
    q.a(paramGoogleSignInAccount);
    q.a(paramGoogleSignInOptions);
    String str = paramGoogleSignInAccount.z();
    a(b("googleSignInAccount", str), paramGoogleSignInAccount.A());
    a(b("googleSignInOptions", str), paramGoogleSignInOptions.x());
  }
  
  @RecentlyNullable
  public GoogleSignInAccount b() {
    return a(c("defaultGoogleSignInAccount"));
  }
  
  @RecentlyNullable
  public GoogleSignInOptions c() {
    return b(c("defaultGoogleSignInAccount"));
  }
  
  @RecentlyNullable
  public String d() {
    return c("refreshToken");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */