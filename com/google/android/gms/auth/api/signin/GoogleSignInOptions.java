package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends a implements a.d.f, ReflectedParcelable {
  @RecentlyNonNull
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
  
  @RecentlyNonNull
  public static final Scope m = new Scope("profile");
  
  @RecentlyNonNull
  public static final Scope n = new Scope("openid");
  
  @RecentlyNonNull
  public static final Scope o = new Scope("https://www.googleapis.com/auth/games_lite");
  
  @RecentlyNonNull
  public static final Scope p = new Scope("https://www.googleapis.com/auth/games");
  
  @RecentlyNonNull
  public static final GoogleSignInOptions q;
  
  private static Comparator<Scope> r;
  
  private final int c;
  
  private final ArrayList<Scope> d;
  
  private Account e;
  
  private boolean f;
  
  private final boolean g;
  
  private final boolean h;
  
  private String i;
  
  private String j;
  
  private ArrayList<a> k;
  
  private String l;
  
  static {
    a a1 = new a();
    a1.b();
    a1.c();
    q = a1.a();
    a1 = new a();
    a1.a(o, new Scope[0]);
    a1.a();
    CREATOR = new h();
    r = new g();
  }
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, ArrayList<a> paramArrayList1, String paramString3) {
    this(paramInt, paramArrayList, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, b(paramArrayList1), paramString3);
  }
  
  private GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map<Integer, a> paramMap, String paramString3) {
    this.c = paramInt;
    this.d = paramArrayList;
    this.e = paramAccount;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.h = paramBoolean3;
    this.i = paramString1;
    this.j = paramString2;
    this.k = new ArrayList<a>(paramMap.values());
    this.l = paramString3;
  }
  
  @RecentlyNullable
  public static GoogleSignInOptions b(String paramString) {
    boolean bool1 = TextUtils.isEmpty(paramString);
    String str = null;
    if (bool1)
      return null; 
    JSONObject jSONObject = new JSONObject(paramString);
    HashSet<Scope> hashSet = new HashSet();
    JSONArray jSONArray = jSONObject.getJSONArray("scopes");
    int j = jSONArray.length();
    for (int i = 0; i < j; i++)
      hashSet.add(new Scope(jSONArray.getString(i))); 
    if (jSONObject.has("accountName")) {
      String str1 = jSONObject.optString("accountName");
    } else {
      jSONArray = null;
    } 
    if (!TextUtils.isEmpty((CharSequence)jSONArray)) {
      Account account = new Account((String)jSONArray, "com.google");
    } else {
      jSONArray = null;
    } 
    ArrayList<Scope> arrayList = new ArrayList<Scope>(hashSet);
    bool1 = jSONObject.getBoolean("idTokenRequested");
    boolean bool2 = jSONObject.getBoolean("serverAuthRequested");
    boolean bool3 = jSONObject.getBoolean("forceCodeForRefreshToken");
    if (jSONObject.has("serverClientId")) {
      String str1 = jSONObject.optString("serverClientId");
    } else {
      hashSet = null;
    } 
    if (jSONObject.has("hostedDomain"))
      str = jSONObject.optString("hostedDomain"); 
    return new GoogleSignInOptions(3, arrayList, (Account)jSONArray, bool1, bool2, bool3, (String)hashSet, str, new HashMap<Integer, a>(), null);
  }
  
  private static Map<Integer, a> b(List<a> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    if (paramList == null)
      return (Map)hashMap; 
    for (a a1 : paramList)
      hashMap.put(Integer.valueOf(a1.b()), a1); 
    return (Map)hashMap;
  }
  
  private final JSONObject y() {
    JSONObject jSONObject = new JSONObject();
    try {
      JSONArray jSONArray = new JSONArray();
      Collections.sort(this.d, r);
      ArrayList<Scope> arrayList = this.d;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        Scope scope = (Scope)arrayList.get(i);
        i++;
        jSONArray.put(((Scope)scope).b());
      } 
      jSONObject.put("scopes", jSONArray);
      if (this.e != null)
        jSONObject.put("accountName", this.e.name); 
      jSONObject.put("idTokenRequested", this.f);
      jSONObject.put("forceCodeForRefreshToken", this.h);
      jSONObject.put("serverAuthRequested", this.g);
      if (!TextUtils.isEmpty(this.i))
        jSONObject.put("serverClientId", this.i); 
      if (!TextUtils.isEmpty(this.j))
        jSONObject.put("hostedDomain", this.j); 
      return jSONObject;
    } catch (JSONException jSONException) {
      RuntimeException runtimeException = new RuntimeException((Throwable)jSONException);
      throw runtimeException;
    } 
  }
  
  @RecentlyNullable
  public Account b() {
    return this.e;
  }
  
  @RecentlyNonNull
  public ArrayList<a> c() {
    return this.k;
  }
  
  @RecentlyNullable
  public String d() {
    return this.l;
  }
  
  @RecentlyNonNull
  public ArrayList<Scope> e() {
    return new ArrayList<Scope>(this.d);
  }
  
  @RecentlyNonNull
  public boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    try {
      paramObject = paramObject;
      if (this.k.size() <= 0) {
        if (((GoogleSignInOptions)paramObject).k.size() > 0)
          return false; 
        if (this.d.size() == paramObject.e().size()) {
          if (!this.d.containsAll(paramObject.e()))
            return false; 
          if (((this.e == null) ? (paramObject.b() == null) : this.e.equals(paramObject.b())) && (TextUtils.isEmpty(this.i) ? TextUtils.isEmpty(paramObject.r()) : this.i.equals(paramObject.r())) && this.h == paramObject.t() && this.f == paramObject.u() && this.g == paramObject.v()) {
            boolean bool = TextUtils.equals(this.l, paramObject.d());
            if (bool)
              return true; 
          } 
        } 
      } 
      return false;
    } catch (ClassCastException classCastException) {
      return false;
    } 
  }
  
  @RecentlyNonNull
  public int hashCode() {
    ArrayList<String> arrayList = new ArrayList();
    ArrayList<Scope> arrayList1 = this.d;
    int j = arrayList1.size();
    int i = 0;
    while (i < j) {
      Scope scope = (Scope)arrayList1.get(i);
      i++;
      arrayList.add(((Scope)scope).b());
    } 
    Collections.sort(arrayList);
    b b = new b();
    b.a(arrayList);
    b.a(this.e);
    b.a(this.i);
    b.a(this.h);
    b.a(this.f);
    b.a(this.g);
    b.a(this.l);
    return b.a();
  }
  
  @RecentlyNullable
  public String r() {
    return this.i;
  }
  
  @RecentlyNonNull
  public boolean t() {
    return this.h;
  }
  
  @RecentlyNonNull
  public boolean u() {
    return this.f;
  }
  
  @RecentlyNonNull
  public boolean v() {
    return this.g;
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.b(paramParcel, 2, e(), false);
    c.a(paramParcel, 3, (Parcelable)b(), paramInt, false);
    c.a(paramParcel, 4, u());
    c.a(paramParcel, 5, v());
    c.a(paramParcel, 6, t());
    c.a(paramParcel, 7, r(), false);
    c.a(paramParcel, 8, this.j, false);
    c.b(paramParcel, 9, c(), false);
    c.a(paramParcel, 10, d(), false);
    c.a(paramParcel, i);
  }
  
  @RecentlyNonNull
  public final String x() {
    return y().toString();
  }
  
  static {
    new Scope("email");
  }
  
  public static final class a {
    private Set<Scope> a = new HashSet<Scope>();
    
    private boolean b;
    
    private boolean c;
    
    private boolean d;
    
    private String e;
    
    private Account f;
    
    private String g;
    
    private Map<Integer, a> h = new HashMap<Integer, a>();
    
    private String i;
    
    public a() {}
    
    public a(@RecentlyNonNull GoogleSignInOptions param1GoogleSignInOptions) {
      q.a(param1GoogleSignInOptions);
      this.a = new HashSet<Scope>(GoogleSignInOptions.a(param1GoogleSignInOptions));
      this.b = GoogleSignInOptions.b(param1GoogleSignInOptions);
      this.c = GoogleSignInOptions.c(param1GoogleSignInOptions);
      this.d = GoogleSignInOptions.d(param1GoogleSignInOptions);
      this.e = GoogleSignInOptions.e(param1GoogleSignInOptions);
      this.f = GoogleSignInOptions.f(param1GoogleSignInOptions);
      this.g = GoogleSignInOptions.g(param1GoogleSignInOptions);
      this.h = GoogleSignInOptions.a(GoogleSignInOptions.h(param1GoogleSignInOptions));
      this.i = GoogleSignInOptions.i(param1GoogleSignInOptions);
    }
    
    @RecentlyNonNull
    public final a a(@RecentlyNonNull Scope param1Scope, @RecentlyNonNull Scope... param1VarArgs) {
      this.a.add(param1Scope);
      this.a.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    @RecentlyNonNull
    public final a a(@RecentlyNonNull String param1String) {
      this.i = param1String;
      return this;
    }
    
    @RecentlyNonNull
    public final GoogleSignInOptions a() {
      if (this.a.contains(GoogleSignInOptions.p) && this.a.contains(GoogleSignInOptions.o))
        this.a.remove(GoogleSignInOptions.o); 
      if (this.d && (this.f == null || !this.a.isEmpty()))
        b(); 
      return new GoogleSignInOptions(3, new ArrayList<Scope>(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i, null);
    }
    
    @RecentlyNonNull
    public final a b() {
      this.a.add(GoogleSignInOptions.n);
      return this;
    }
    
    @RecentlyNonNull
    public final a c() {
      this.a.add(GoogleSignInOptions.m);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */