package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import h.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class g implements a {
  public List<String> a() {
    return new ArrayList<String>(0);
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Bundle bundle = new Bundle();
    bundle.putInt("app_badge_count", paramInt);
    bundle.putString("app_badge_component_name", paramComponentName.flattenToString());
    if (Build.VERSION.SDK_INT >= 11)
      paramContext.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", null, bundle); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */