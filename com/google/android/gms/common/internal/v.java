package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import b.d.g;
import b.g.j.b;
import com.google.android.gms.common.util.h;
import e.f.a.e.b.b;
import e.f.a.e.e.f;
import e.f.a.e.e.i;
import e.f.a.e.e.n.b;
import java.util.Locale;

public final class v {
  private static final g<String, String> a = new g();
  
  private static Locale b;
  
  public static String a(Context paramContext) {
    return paramContext.getResources().getString(b.common_google_play_services_notification_channel_name);
  }
  
  public static String a(Context paramContext, int paramInt) {
    StringBuilder stringBuilder;
    String str;
    Resources resources = paramContext.getResources();
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unexpected error code ");
        stringBuilder.append(paramInt);
        str = stringBuilder.toString();
        Log.e("GoogleApiAvailability", str);
        return null;
      case 20:
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return a((Context)str, "common_google_play_services_restricted_profile_title");
      case 17:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return a((Context)str, "common_google_play_services_sign_in_failed_title");
      case 16:
        str = "One of the API components you attempted to connect to is not available.";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 11:
        str = "The application is not licensed to the user.";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 10:
        str = "Developer error occurred. Please see logs for detailed information";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 9:
        str = "Google Play services is invalid. Cannot recover.";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 8:
        str = "Internal error occurred. Please see logs for detailed information";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        return a((Context)str, "common_google_play_services_network_error_title");
      case 5:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        return a((Context)str, "common_google_play_services_invalid_account_title");
      case 4:
      case 6:
      case 18:
        return null;
      case 3:
        return resources.getString(b.common_google_play_services_enable_title);
      case 2:
        return resources.getString(b.common_google_play_services_update_title);
      case 1:
        break;
    } 
    return resources.getString(b.common_google_play_services_install_title);
  }
  
  private static String a(Context paramContext, String paramString) {
    synchronized (a) {
      Locale locale = b.a(paramContext.getResources().getConfiguration()).a(0);
      if (!locale.equals(b)) {
        a.clear();
        b = locale;
      } 
      String str2 = (String)a.get(paramString);
      if (str2 != null)
        return str2; 
      Resources resources = f.a(paramContext);
      if (resources == null)
        return null; 
      int i = resources.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0) {
        str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "Missing resource: ".concat(str1);
        } else {
          str1 = new String("Missing resource: ");
        } 
        Log.w("GoogleApiAvailability", str1);
        return null;
      } 
      String str1 = str1.getString(i);
      if (TextUtils.isEmpty(str1)) {
        str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "Got empty resource: ".concat(str1);
        } else {
          str1 = new String("Got empty resource: ");
        } 
        Log.w("GoogleApiAvailability", str1);
        return null;
      } 
      a.put(paramString, str1);
      return str1;
    } 
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2) {
    Resources resources = paramContext.getResources();
    paramString1 = a(paramContext, paramString1);
    String str = paramString1;
    if (paramString1 == null)
      str = resources.getString(i.common_google_play_services_unknown_issue); 
    return String.format((resources.getConfiguration()).locale, str, new Object[] { paramString2 });
  }
  
  private static String b(Context paramContext) {
    String str = paramContext.getPackageName();
    try {
      return b.a(paramContext).b(str).toString();
    } catch (android.content.pm.PackageManager.NameNotFoundException|NullPointerException nameNotFoundException) {
      String str1 = (paramContext.getApplicationInfo()).name;
      return TextUtils.isEmpty(str1) ? str : str1;
    } 
  }
  
  public static String b(Context paramContext, int paramInt) {
    String str1;
    if (paramInt == 6) {
      str1 = a(paramContext, "common_google_play_services_resolution_required_title");
    } else {
      str1 = a(paramContext, paramInt);
    } 
    String str2 = str1;
    if (str1 == null)
      str2 = paramContext.getResources().getString(b.common_google_play_services_notification_ticker); 
    return str2;
  }
  
  public static String c(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    String str = b(paramContext);
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 5) {
            if (paramInt != 7) {
              if (paramInt != 9) {
                if (paramInt != 20) {
                  switch (paramInt) {
                    default:
                      return resources.getString(i.common_google_play_services_unknown_issue, new Object[] { str });
                    case 18:
                      return resources.getString(b.common_google_play_services_updating_text, new Object[] { str });
                    case 17:
                      return a(paramContext, "common_google_play_services_sign_in_failed_text", str);
                    case 16:
                      break;
                  } 
                  return a(paramContext, "common_google_play_services_api_unavailable_text", str);
                } 
                return a(paramContext, "common_google_play_services_restricted_profile_text", str);
              } 
              return resources.getString(b.common_google_play_services_unsupported_text, new Object[] { str });
            } 
            return a(paramContext, "common_google_play_services_network_error_text", str);
          } 
          return a(paramContext, "common_google_play_services_invalid_account_text", str);
        } 
        return resources.getString(b.common_google_play_services_enable_text, new Object[] { str });
      } 
      return h.c(paramContext) ? resources.getString(b.common_google_play_services_wear_update_text) : resources.getString(b.common_google_play_services_update_text, new Object[] { str });
    } 
    return resources.getString(b.common_google_play_services_install_text, new Object[] { str });
  }
  
  public static String d(Context paramContext, int paramInt) {
    return (paramInt == 6 || paramInt == 19) ? a(paramContext, "common_google_play_services_resolution_required_text", b(paramContext)) : c(paramContext, paramInt);
  }
  
  public static String e(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          paramInt = 17039370;
          return resources.getString(paramInt);
        } 
        paramInt = b.common_google_play_services_enable_button;
        return resources.getString(paramInt);
      } 
      paramInt = b.common_google_play_services_update_button;
      return resources.getString(paramInt);
    } 
    paramInt = b.common_google_play_services_install_button;
    return resources.getString(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */