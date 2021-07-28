package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import e.f.a.e.f.a;
import e.f.a.e.f.b;
import e.f.a.e.g.g;

@DynamiteApi
public class FlagProviderImpl extends g {
  private boolean a = false;
  
  private SharedPreferences b;
  
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt) {
    return !this.a ? paramBoolean : b.a(this.b, paramString, Boolean.valueOf(paramBoolean)).booleanValue();
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2) {
    return !this.a ? paramInt1 : d.a(this.b, paramString, Integer.valueOf(paramInt1)).intValue();
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt) {
    return !this.a ? paramLong : f.a(this.b, paramString, Long.valueOf(paramLong)).longValue();
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt) {
    return !this.a ? paramString2 : h.a(this.b, paramString1, paramString2);
  }
  
  public void init(a parama) {
    Context context = (Context)b.a(parama);
    if (this.a)
      return; 
    try {
      this.b = j.a(context.createPackageContext("com.google.android.gms", 0));
      this.a = true;
      return;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return;
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Could not retrieve sdk flags, continuing with defaults: ".concat(str);
      } else {
        str = new String("Could not retrieve sdk flags, continuing with defaults: ");
      } 
      Log.w("FlagProviderImpl", str);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/flags/impl/FlagProviderImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */