package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import h.a.a.a;
import java.util.Arrays;
import java.util.List;

public class a implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "com.asus.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
    intent.putExtra("badge_count", paramInt);
    intent.putExtra("badge_count_package_name", paramComponentName.getPackageName());
    intent.putExtra("badge_count_class_name", paramComponentName.getClassName());
    intent.putExtra("badge_vip_count", 0);
    h.a.a.d.a.b(paramContext, intent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */