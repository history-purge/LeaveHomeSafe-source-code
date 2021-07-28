package e.f.b.a.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.k;
import java.util.Locale;

public class c {
  private static final i a = new i("CommonUtils", "");
  
  @RecentlyNonNull
  public static String a(@RecentlyNonNull Context paramContext) {
    try {
      int j = (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
      return String.valueOf(j);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      i i1 = a;
      String str = String.valueOf(nameNotFoundException);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 48);
      stringBuilder.append("Exception thrown when trying to get app version ");
      stringBuilder.append(str);
      i1.b("CommonUtils", stringBuilder.toString());
      return "";
    } 
  }
  
  public static String a(@RecentlyNonNull Locale paramLocale) {
    if (k.f())
      return paramLocale.toLanguageTag(); 
    StringBuilder stringBuilder = new StringBuilder(paramLocale.getLanguage());
    if (!TextUtils.isEmpty(paramLocale.getCountry())) {
      stringBuilder.append("-");
      stringBuilder.append(paramLocale.getCountry());
    } 
    if (!TextUtils.isEmpty(paramLocale.getVariant())) {
      stringBuilder.append("-");
      stringBuilder.append(paramLocale.getVariant());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */