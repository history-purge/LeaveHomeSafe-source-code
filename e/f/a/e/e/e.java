package e.f.a.e.e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.common.util.h;
import e.f.a.e.e.n.b;

public class e {
  @RecentlyNonNull
  public static final int a = g.a;
  
  static {
    new e();
  }
  
  private static String b(Context paramContext, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("gcore_");
    stringBuilder.append(a);
    stringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString))
      stringBuilder.append(paramString); 
    stringBuilder.append("-");
    if (paramContext != null)
      stringBuilder.append(paramContext.getPackageName()); 
    stringBuilder.append("-");
    if (paramContext != null)
      try {
        stringBuilder.append((b.a(paramContext).b(paramContext.getPackageName(), 0)).versionCode);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {} 
    return stringBuilder.toString();
  }
  
  @RecentlyNonNull
  public int a(@RecentlyNonNull Context paramContext) {
    return a(paramContext, a);
  }
  
  @RecentlyNonNull
  public int a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt) {
    int i = g.a(paramContext, paramInt);
    paramInt = i;
    if (g.b(paramContext, i))
      paramInt = 18; 
    return paramInt;
  }
  
  @RecentlyNullable
  public PendingIntent a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2) {
    return a(paramContext, paramInt1, paramInt2, null);
  }
  
  @RecentlyNullable
  public PendingIntent a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2, String paramString) {
    Intent intent = a(paramContext, paramInt1, paramString);
    return (intent == null) ? null : PendingIntent.getActivity(paramContext, paramInt2, intent, 134217728);
  }
  
  @RecentlyNullable
  public Intent a(Context paramContext, @RecentlyNonNull int paramInt, String paramString) {
    return (paramInt != 1 && paramInt != 2) ? ((paramInt != 3) ? null : r0.a("com.google.android.gms")) : ((paramContext != null && h.c(paramContext)) ? r0.a() : r0.a("com.google.android.gms", b(paramContext, paramString)));
  }
  
  public String a(@RecentlyNonNull int paramInt) {
    return g.a(paramInt);
  }
  
  @RecentlyNonNull
  public boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString) {
    return g.a(paramContext, paramString);
  }
  
  @RecentlyNonNull
  public boolean b(@RecentlyNonNull int paramInt) {
    return g.b(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */