package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.HashSet;

public final class l {
  private final Context a;
  
  private final NotificationManager b;
  
  static {
    new HashSet();
  }
  
  private l(Context paramContext) {
    this.a = paramContext;
    this.b = (NotificationManager)this.a.getSystemService("notification");
  }
  
  public static l a(Context paramContext) {
    return new l(paramContext);
  }
  
  public boolean a() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 24)
      return this.b.areNotificationsEnabled(); 
    boolean bool = true;
    if (i >= 19) {
      AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
      ApplicationInfo applicationInfo = this.a.getApplicationInfo();
      String str = this.a.getApplicationContext().getPackageName();
      i = applicationInfo.uid;
      try {
        Class<?> clazz = Class.forName(AppOpsManager.class.getName());
        i = ((Integer)clazz.getMethod("checkOpNoThrow", new Class[] { int.class, int.class, String.class }).invoke(appOpsManager, new Object[] { Integer.valueOf(((Integer)clazz.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), str })).intValue();
        return (i == 0);
      } catch (ClassNotFoundException|NoSuchMethodException|NoSuchFieldException|java.lang.reflect.InvocationTargetException|IllegalAccessException|RuntimeException classNotFoundException) {
        return true;
      } 
    } 
    return bool;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */