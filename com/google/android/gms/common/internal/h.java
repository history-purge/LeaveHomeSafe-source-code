package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public abstract class h {
  private static int a = 4225;
  
  private static final Object b = new Object();
  
  private static h c;
  
  @RecentlyNonNull
  public static int a() {
    return a;
  }
  
  @RecentlyNonNull
  public static h a(@RecentlyNonNull Context paramContext) {
    synchronized (b) {
      if (c == null)
        c = new o0(paramContext.getApplicationContext()); 
      return c;
    } 
  }
  
  public final void a(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, @RecentlyNonNull int paramInt, @RecentlyNonNull ServiceConnection paramServiceConnection, @RecentlyNonNull String paramString3, @RecentlyNonNull boolean paramBoolean) {
    b(new a(paramString1, paramString2, paramInt, paramBoolean), paramServiceConnection, paramString3);
  }
  
  protected abstract boolean a(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  protected abstract void b(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  protected static final class a {
    private static final Uri f = (new Uri.Builder()).scheme("content").authority("com.google.android.gms.chimera").build();
    
    private final String a;
    
    private final String b;
    
    private final ComponentName c;
    
    private final int d;
    
    private final boolean e;
    
    public a(String param1String1, String param1String2, int param1Int, boolean param1Boolean) {
      q.b(param1String1);
      this.a = param1String1;
      q.b(param1String2);
      this.b = param1String2;
      this.c = null;
      this.d = param1Int;
      this.e = param1Boolean;
    }
    
    private final Intent b(Context param1Context) {
      String str1;
      Intent intent;
      Bundle bundle = new Bundle();
      bundle.putString("serviceActionBundleKey", this.a);
      String str2 = null;
      try {
        Bundle bundle1 = param1Context.getContentResolver().call(f, "serviceIntentCall", null, bundle);
      } catch (IllegalArgumentException illegalArgumentException) {
        str1 = String.valueOf(illegalArgumentException);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 34);
        stringBuilder.append("Dynamic intent resolution failed: ");
        stringBuilder.append(str1);
        Log.w("ConnectionStatusConfig", stringBuilder.toString());
        str1 = null;
      } 
      if (str1 == null) {
        str1 = str2;
      } else {
        intent = (Intent)str1.getParcelable("serviceResponseIntentKey");
      } 
      if (intent == null) {
        str2 = String.valueOf(this.a);
        if (str2.length() != 0) {
          str2 = "Dynamic lookup for intent failed for action: ".concat(str2);
        } else {
          str2 = new String("Dynamic lookup for intent failed for action: ");
        } 
        Log.w("ConnectionStatusConfig", str2);
      } 
      return intent;
    }
    
    public final Intent a(Context param1Context) {
      Intent intent;
      if (this.a != null) {
        if (this.e) {
          Intent intent1 = b(param1Context);
        } else {
          param1Context = null;
        } 
        Context context = param1Context;
        if (param1Context == null)
          return (new Intent(this.a)).setPackage(this.b); 
      } else {
        intent = (new Intent()).setComponent(this.c);
      } 
      return intent;
    }
    
    public final String a() {
      return this.b;
    }
    
    public final ComponentName b() {
      return this.c;
    }
    
    public final int c() {
      return this.d;
    }
    
    public final boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (o.a(this.a, ((a)param1Object).a) && o.a(this.b, ((a)param1Object).b) && o.a(this.c, ((a)param1Object).c) && this.d == ((a)param1Object).d && this.e == ((a)param1Object).e);
    }
    
    public final int hashCode() {
      return o.a(new Object[] { this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e) });
    }
    
    public final String toString() {
      String str2 = this.a;
      String str1 = str2;
      if (str2 == null) {
        q.a(this.c);
        str1 = this.c.flattenToString();
      } 
      return str1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */