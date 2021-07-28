package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import h.a.a.a;
import h.a.a.d.a;
import java.util.Arrays;
import java.util.List;

public class AdwHomeBadger implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "org.adw.launcher", "org.adwfreak.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Intent intent = new Intent("org.adw.launcher.counter.SEND");
    intent.putExtra("PNAME", paramComponentName.getPackageName());
    intent.putExtra("CNAME", paramComponentName.getClassName());
    intent.putExtra("COUNT", paramInt);
    a.c(paramContext, intent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/AdwHomeBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */