package e.f.a.e.i.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import b.g.e.c;

public abstract class f<T> {
  private static final Object g = new Object();
  
  @SuppressLint({"StaticFieldLeak"})
  private static Context h;
  
  private static volatile Boolean i;
  
  private static volatile Boolean j;
  
  private final p a;
  
  final String b;
  
  private final String c;
  
  private final T d;
  
  private volatile c e = null;
  
  private volatile SharedPreferences f = null;
  
  private f(p paramp, String paramString, T paramT) {
    if (p.a(paramp) != null || p.b(paramp) != null) {
      if (p.a(paramp) == null || p.b(paramp) == null) {
        this.a = paramp;
        String str2 = String.valueOf(p.c(paramp));
        String str3 = String.valueOf(paramString);
        if (str3.length() != 0) {
          str2 = str2.concat(str3);
        } else {
          str2 = new String(str2);
        } 
        this.c = str2;
        String str1 = String.valueOf(p.d(paramp));
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          str1 = str1.concat(paramString);
        } else {
          str1 = new String(str1);
        } 
        this.b = str1;
        this.d = paramT;
        return;
      } 
      throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
    } 
    throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
  }
  
  private static <T> f<T> a(p paramp, String paramString, T paramT, o<T> paramo) {
    return new m(paramp, paramString, paramT, paramo);
  }
  
  private static f<String> a(p paramp, String paramString1, String paramString2) {
    return new l(paramp, paramString1, paramString2);
  }
  
  private static f<Boolean> a(p paramp, String paramString, boolean paramBoolean) {
    return new k(paramp, paramString, Boolean.valueOf(paramBoolean));
  }
  
  private static <V> V a(n<V> paramn) {
    try {
      return paramn.a();
    } catch (SecurityException securityException) {
      long l = Binder.clearCallingIdentity();
      try {
        paramn = (n<V>)paramn.a();
        return (V)paramn;
      } finally {
        Binder.restoreCallingIdentity(l);
      } 
    } 
  }
  
  public static void a(Context paramContext) {
    if (h == null)
      synchronized (g) {
        if (Build.VERSION.SDK_INT < 24 || !paramContext.isDeviceProtectedStorage()) {
          Context context = paramContext.getApplicationContext();
          if (context != null)
            paramContext = context; 
        } 
        if (h != paramContext)
          i = null; 
        h = paramContext;
        return;
      }  
  }
  
  static boolean a(String paramString, boolean paramBoolean) {
    return e() ? ((Boolean)a(new i(paramString, false))).booleanValue() : false;
  }
  
  @TargetApi(24)
  private final T c() {
    if (!a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
      if (p.b(this.a) != null) {
        if (this.e == null)
          this.e = c.a(h.getContentResolver(), p.b(this.a)); 
        String str = a(new g(this, this.e));
        if (str != null)
          return a(str); 
      } else if (p.a(this.a) != null) {
        boolean bool;
        if (Build.VERSION.SDK_INT >= 24 && !h.isDeviceProtectedStorage()) {
          if (j == null || !j.booleanValue())
            j = Boolean.valueOf(((UserManager)h.getSystemService(UserManager.class)).isUserUnlocked()); 
          bool = j.booleanValue();
        } else {
          bool = true;
        } 
        if (!bool)
          return null; 
        if (this.f == null)
          this.f = h.getSharedPreferences(p.a(this.a), 0); 
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences.contains(this.b))
          return a(sharedPreferences); 
      } 
    } else {
      String str = String.valueOf(this.b);
      if (str.length() != 0) {
        str = "Bypass reading Phenotype values for flag: ".concat(str);
      } else {
        str = new String("Bypass reading Phenotype values for flag: ");
      } 
      Log.w("PhenotypeFlag", str);
    } 
    return null;
  }
  
  private final T d() {
    if (!p.f(this.a) && e()) {
      String str = a(new h(this));
      if (str != null)
        return a(str); 
    } 
    return null;
  }
  
  private static boolean e() {
    if (i == null) {
      Context context = h;
      boolean bool = false;
      if (context != null) {
        if (c.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0)
          bool = true; 
        i = Boolean.valueOf(bool);
      } else {
        return false;
      } 
    } 
    return i.booleanValue();
  }
  
  public final T a() {
    if (h != null) {
      if (p.e(this.a)) {
        T t = d();
        if (t != null)
          return t; 
        t = c();
        if (t != null)
          return t; 
      } else {
        T t = c();
        if (t != null)
          return t; 
        t = d();
        if (t != null)
          return t; 
      } 
      return this.d;
    } 
    throw new IllegalStateException("Must call PhenotypeFlag.init() first");
  }
  
  protected abstract T a(SharedPreferences paramSharedPreferences);
  
  protected abstract T a(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */