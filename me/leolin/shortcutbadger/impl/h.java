package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import h.a.a.a;
import java.util.Collections;
import java.util.List;

public class h implements a {
  private final Uri a = Uri.parse("content://com.android.badge/badge");
  
  public List<String> a() {
    return Collections.singletonList("com.zui.launcher");
  }
  
  @TargetApi(11)
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Bundle bundle = new Bundle();
    bundle.putInt("app_badge_count", paramInt);
    paramContext.getContentResolver().call(this.a, "setAppBadgeCount", null, bundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */