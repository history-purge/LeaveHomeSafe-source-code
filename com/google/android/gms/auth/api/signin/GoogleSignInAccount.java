package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
  @RecentlyNonNull
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new f();
  
  private static e p = g.c();
  
  private final int c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private Uri h;
  
  private String i;
  
  private long j;
  
  private String k;
  
  private List<Scope> l;
  
  private String m;
  
  private String n;
  
  private Set<Scope> o = new HashSet<Scope>();
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8) {
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramUri;
    this.i = paramString5;
    this.j = paramLong;
    this.k = paramString6;
    this.l = paramList;
    this.m = paramString7;
    this.n = paramString8;
  }
  
  private final JSONObject B() {
    JSONObject jSONObject = new JSONObject();
    try {
      if (t() != null)
        jSONObject.put("id", t()); 
      if (u() != null)
        jSONObject.put("tokenId", u()); 
      if (d() != null)
        jSONObject.put("email", d()); 
      if (c() != null)
        jSONObject.put("displayName", c()); 
      if (r() != null)
        jSONObject.put("givenName", r()); 
      if (e() != null)
        jSONObject.put("familyName", e()); 
      Uri uri = v();
      if (uri != null)
        jSONObject.put("photoUrl", uri.toString()); 
      if (y() != null)
        jSONObject.put("serverAuthCode", y()); 
      jSONObject.put("expirationTime", this.j);
      jSONObject.put("obfuscatedIdentifier", this.k);
      JSONArray jSONArray = new JSONArray();
      Scope[] arrayOfScope = this.l.<Scope>toArray(new Scope[this.l.size()]);
      Arrays.sort(arrayOfScope, e.c);
      int j = arrayOfScope.length;
      for (int i = 0; i < j; i++)
        jSONArray.put(arrayOfScope[i].b()); 
      jSONObject.put("grantedScopes", jSONArray);
      return jSONObject;
    } catch (JSONException jSONException) {
      RuntimeException runtimeException = new RuntimeException((Throwable)jSONException);
      throw runtimeException;
    } 
  }
  
  private static GoogleSignInAccount a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri, Long paramLong, String paramString7, Set<Scope> paramSet) {
    if (paramLong == null)
      paramLong = Long.valueOf(p.a() / 1000L); 
    long l = paramLong.longValue();
    q.b(paramString7);
    q.a(paramSet);
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, l, paramString7, new ArrayList<Scope>(paramSet), paramString5, paramString6);
  }
  
  @RecentlyNullable
  public static GoogleSignInAccount b(String paramString) {
    String str1;
    String str2;
    String str3;
    String str4;
    boolean bool = TextUtils.isEmpty(paramString);
    String str5 = null;
    if (bool)
      return null; 
    JSONObject jSONObject = new JSONObject(paramString);
    paramString = jSONObject.optString("photoUrl");
    if (!TextUtils.isEmpty(paramString)) {
      Uri uri = Uri.parse(paramString);
    } else {
      paramString = null;
    } 
    long l = Long.parseLong(jSONObject.getString("expirationTime"));
    HashSet<Scope> hashSet = new HashSet();
    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
    int j = jSONArray.length();
    for (int i = 0; i < j; i++)
      hashSet.add(new Scope(jSONArray.getString(i))); 
    String str6 = jSONObject.optString("id");
    if (jSONObject.has("tokenId")) {
      String str = jSONObject.optString("tokenId");
    } else {
      jSONArray = null;
    } 
    if (jSONObject.has("email")) {
      str1 = jSONObject.optString("email");
    } else {
      str1 = null;
    } 
    if (jSONObject.has("displayName")) {
      str2 = jSONObject.optString("displayName");
    } else {
      str2 = null;
    } 
    if (jSONObject.has("givenName")) {
      str3 = jSONObject.optString("givenName");
    } else {
      str3 = null;
    } 
    if (jSONObject.has("familyName")) {
      str4 = jSONObject.optString("familyName");
    } else {
      str4 = null;
    } 
    GoogleSignInAccount googleSignInAccount = a(str6, (String)jSONArray, str1, str2, str3, str4, (Uri)paramString, Long.valueOf(l), jSONObject.getString("obfuscatedIdentifier"), hashSet);
    paramString = str5;
    if (jSONObject.has("serverAuthCode"))
      paramString = jSONObject.optString("serverAuthCode"); 
    googleSignInAccount.i = paramString;
    return googleSignInAccount;
  }
  
  @RecentlyNonNull
  public final String A() {
    JSONObject jSONObject = B();
    jSONObject.remove("serverAuthCode");
    return jSONObject.toString();
  }
  
  @RecentlyNullable
  public Account b() {
    String str = this.f;
    return (str == null) ? null : new Account(str, "com.google");
  }
  
  @RecentlyNullable
  public String c() {
    return this.g;
  }
  
  @RecentlyNullable
  public String d() {
    return this.f;
  }
  
  @RecentlyNullable
  public String e() {
    return this.n;
  }
  
  @RecentlyNonNull
  public boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof GoogleSignInAccount))
      return false; 
    paramObject = paramObject;
    return (((GoogleSignInAccount)paramObject).k.equals(this.k) && paramObject.x().equals(x()));
  }
  
  @RecentlyNonNull
  public int hashCode() {
    return (this.k.hashCode() + 527) * 31 + x().hashCode();
  }
  
  @RecentlyNullable
  public String r() {
    return this.m;
  }
  
  @RecentlyNullable
  public String t() {
    return this.d;
  }
  
  @RecentlyNullable
  public String u() {
    return this.e;
  }
  
  @RecentlyNullable
  public Uri v() {
    return this.h;
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, t(), false);
    c.a(paramParcel, 3, u(), false);
    c.a(paramParcel, 4, d(), false);
    c.a(paramParcel, 5, c(), false);
    c.a(paramParcel, 6, (Parcelable)v(), paramInt, false);
    c.a(paramParcel, 7, y(), false);
    c.a(paramParcel, 8, this.j);
    c.a(paramParcel, 9, this.k, false);
    c.b(paramParcel, 10, this.l, false);
    c.a(paramParcel, 11, r(), false);
    c.a(paramParcel, 12, e(), false);
    c.a(paramParcel, i);
  }
  
  public Set<Scope> x() {
    HashSet<Scope> hashSet = new HashSet<Scope>(this.l);
    hashSet.addAll(this.o);
    return hashSet;
  }
  
  @RecentlyNullable
  public String y() {
    return this.i;
  }
  
  public final String z() {
    return this.k;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */