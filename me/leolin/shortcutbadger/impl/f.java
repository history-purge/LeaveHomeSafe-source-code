package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import h.a.a.a;
import java.util.Arrays;
import java.util.List;

public class f implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "com.vivo.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
    intent.putExtra("packageName", paramContext.getPackageName());
    intent.putExtra("className", paramComponentName.getClassName());
    intent.putExtra("notificationNum", paramInt);
    paramContext.sendBroadcast(intent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */