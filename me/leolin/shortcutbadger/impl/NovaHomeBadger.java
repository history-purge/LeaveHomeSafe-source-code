package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import h.a.a.a;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger implements a {
  public List<String> a() {
    return Arrays.asList(new String[] { "com.teslacoilsw.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    ContentValues contentValues = new ContentValues();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramComponentName.getPackageName());
    stringBuilder.append("/");
    stringBuilder.append(paramComponentName.getClassName());
    contentValues.put("tag", stringBuilder.toString());
    contentValues.put("count", Integer.valueOf(paramInt));
    paramContext.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/NovaHomeBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */