package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import h.a.a.a;
import h.a.a.b;
import h.a.a.d.a;
import java.util.Collections;
import java.util.List;

public class NewHtcHomeBadger implements a {
  public List<String> a() {
    return Collections.singletonList("com.htc.launcher");
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Intent intent2 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
    intent2.putExtra("com.htc.launcher.extra.COMPONENT", paramComponentName.flattenToShortString());
    intent2.putExtra("com.htc.launcher.extra.COUNT", paramInt);
    Intent intent1 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
    intent1.putExtra("packagename", paramComponentName.getPackageName());
    intent1.putExtra("count", paramInt);
    boolean bool = false;
    try {
      a.c(paramContext, intent2);
      paramInt = 1;
    } catch (b b) {
      paramInt = 0;
    } 
    try {
      a.c(paramContext, intent1);
      bool = true;
    } catch (b b) {}
    if (paramInt == 0) {
      if (bool)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unable to resolve intent: ");
      stringBuilder.append(intent1.toString());
      throw new b(stringBuilder.toString());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/NewHtcHomeBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */