package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import h.a.a.a;
import java.util.Arrays;
import java.util.List;

public class c implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "com.huawei.android.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Bundle bundle = new Bundle();
    bundle.putString("package", paramContext.getPackageName());
    bundle.putString("class", paramComponentName.getClassName());
    bundle.putInt("badgenumber", paramInt);
    paramContext.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */