package h.a.a.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import h.a.a.b;
import java.util.Collections;
import java.util.List;

public class a {
  public static List<ResolveInfo> a(Context paramContext, Intent paramIntent) {
    List<ResolveInfo> list = paramContext.getPackageManager().queryBroadcastReceivers(paramIntent, 0);
    return (list != null) ? list : Collections.emptyList();
  }
  
  public static void b(Context paramContext, Intent paramIntent) {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 26) {
      Intent intent = new Intent(paramIntent);
      intent.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
      try {
        c(paramContext, intent);
        bool1 = true;
      } catch (b b) {
        bool1 = bool2;
      } 
    } 
    if (bool1)
      return; 
    c(paramContext, paramIntent);
  }
  
  public static void c(Context paramContext, Intent paramIntent) {
    List<ResolveInfo> list = a(paramContext, paramIntent);
    if (list.size() != 0) {
      for (ResolveInfo resolveInfo : list) {
        Intent intent = new Intent(paramIntent);
        if (resolveInfo != null) {
          intent.setPackage(resolveInfo.resolvePackageName);
          paramContext.sendBroadcast(intent);
        } 
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("unable to resolve intent: ");
    stringBuilder.append(paramIntent.toString());
    b b = new b(stringBuilder.toString());
    throw b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/h/a/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */