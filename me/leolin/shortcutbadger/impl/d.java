package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import h.a.a.a;
import h.a.a.d.a;
import java.util.Collections;
import java.util.List;

public class d implements a {
  private int a = -1;
  
  @TargetApi(11)
  private void a(Context paramContext, int paramInt) {
    try {
      Bundle bundle = new Bundle();
      bundle.putInt("app_badge_count", paramInt);
      return;
    } finally {
      paramContext = null;
    } 
  }
  
  private void b(Context paramContext, ComponentName paramComponentName, int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = -1; 
    Intent intent = new Intent("com.oppo.unsettledevent");
    intent.putExtra("pakeageName", paramComponentName.getPackageName());
    intent.putExtra("number", i);
    intent.putExtra("upgradeNumber", i);
    a.c(paramContext, intent);
  }
  
  public List<String> a() {
    return Collections.singletonList("com.oppo.launcher");
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    if (this.a == paramInt)
      return; 
    this.a = paramInt;
    if (Build.VERSION.SDK_INT >= 11) {
      a(paramContext, paramInt);
      return;
    } 
    b(paramContext, paramComponentName, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */