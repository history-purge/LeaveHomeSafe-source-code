package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import h.a.a.a;
import java.util.Arrays;
import java.util.List;

public class b implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "me.everything.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    ContentValues contentValues = new ContentValues();
    contentValues.put("package_name", paramComponentName.getPackageName());
    contentValues.put("activity_name", paramComponentName.getClassName());
    contentValues.put("count", Integer.valueOf(paramInt));
    paramContext.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */