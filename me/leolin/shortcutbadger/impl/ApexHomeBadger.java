package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import h.a.a.a;
import h.a.a.d.a;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "com.anddoes.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
    intent.putExtra("package", paramComponentName.getPackageName());
    intent.putExtra("count", paramInt);
    intent.putExtra("class", paramComponentName.getClassName());
    a.c(paramContext, intent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/ApexHomeBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */