package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import h.a.a.a;
import h.a.a.d.b;
import java.util.Arrays;
import java.util.List;

public class e implements a {
  private static final String[] b = new String[] { "_id", "class" };
  
  private DefaultBadger a;
  
  public e() {
    if (Build.VERSION.SDK_INT >= 21)
      this.a = new DefaultBadger(); 
  }
  
  private ContentValues a(ComponentName paramComponentName, int paramInt, boolean paramBoolean) {
    ContentValues contentValues = new ContentValues();
    if (paramBoolean) {
      contentValues.put("package", paramComponentName.getPackageName());
      contentValues.put("class", paramComponentName.getClassName());
    } 
    contentValues.put("badgecount", Integer.valueOf(paramInt));
    return contentValues;
  }
  
  public List<String> a() {
    return Arrays.asList(new String[] { "com.sec.android.app.launcher", "com.sec.android.app.twlauncher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    Cursor cursor;
    DefaultBadger defaultBadger = this.a;
    if (defaultBadger != null && defaultBadger.a(paramContext)) {
      this.a.a(paramContext, paramComponentName, paramInt);
      return;
    } 
    Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
    ContentResolver contentResolver = paramContext.getContentResolver();
    paramContext = null;
    try {
      Cursor cursor1 = contentResolver.query(uri, b, "package=?", new String[] { paramComponentName.getPackageName() }, null);
      if (cursor1 != null) {
        cursor = cursor1;
        String str = paramComponentName.getClassName();
        boolean bool = false;
        while (true) {
          cursor = cursor1;
          if (cursor1.moveToNext()) {
            cursor = cursor1;
            int i = cursor1.getInt(0);
            cursor = cursor1;
            contentResolver.update(uri, a(paramComponentName, paramInt, false), "_id=?", new String[] { String.valueOf(i) });
            cursor = cursor1;
            if (str.equals(cursor1.getString(cursor1.getColumnIndex("class"))))
              bool = true; 
            continue;
          } 
          if (!bool) {
            cursor = cursor1;
            contentResolver.insert(uri, a(paramComponentName, paramInt, true));
          } 
          break;
        } 
      } 
      return;
    } finally {
      b.a(cursor);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */