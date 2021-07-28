package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import h.a.a.a;
import h.a.a.d.a;
import java.util.Arrays;
import java.util.List;

public class DefaultBadger implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
    intent.putExtra("badge_count", paramInt);
    intent.putExtra("badge_count_package_name", paramComponentName.getPackageName());
    intent.putExtra("badge_count_class_name", paramComponentName.getClassName());
    a.b(paramContext, intent);
  }
  
  boolean a(Context paramContext) {
    return (a.a(paramContext, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || (Build.VERSION.SDK_INT >= 26 && a.a(paramContext, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/DefaultBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */