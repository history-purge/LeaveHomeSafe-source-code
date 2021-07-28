package e.f.a.e.e.n;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.k;

public class a {
  private final Context a;
  
  public a(@RecentlyNonNull Context paramContext) {
    this.a = paramContext;
  }
  
  @RecentlyNonNull
  public int a(@RecentlyNonNull String paramString) {
    return this.a.checkCallingOrSelfPermission(paramString);
  }
  
  @RecentlyNonNull
  public int a(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2) {
    return this.a.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  @RecentlyNonNull
  public ApplicationInfo a(@RecentlyNonNull String paramString, @RecentlyNonNull int paramInt) {
    return this.a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  @TargetApi(19)
  @RecentlyNonNull
  public final boolean a(@RecentlyNonNull int paramInt, @RecentlyNonNull String paramString) {
    if (k.d())
      try {
        AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
        if (appOpsManager != null) {
          appOpsManager.checkPackage(paramInt, paramString);
          return true;
        } 
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
      } catch (SecurityException securityException) {
        return false;
      }  
    String[] arrayOfString = this.a.getPackageManager().getPackagesForUid(paramInt);
    if (securityException != null && arrayOfString != null)
      for (paramInt = 0; paramInt < arrayOfString.length; paramInt++) {
        if (securityException.equals(arrayOfString[paramInt]))
          return true; 
      }  
    return false;
  }
  
  @RecentlyNonNull
  public PackageInfo b(@RecentlyNonNull String paramString, @RecentlyNonNull int paramInt) {
    return this.a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  @RecentlyNonNull
  public CharSequence b(@RecentlyNonNull String paramString) {
    return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(paramString, 0));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */