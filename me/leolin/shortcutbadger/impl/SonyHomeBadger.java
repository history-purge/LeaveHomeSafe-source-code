package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Looper;
import h.a.a.a;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements a {
  private final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
  
  private AsyncQueryHandler b;
  
  private ContentValues a(int paramInt, ComponentName paramComponentName) {
    ContentValues contentValues = new ContentValues();
    contentValues.put("badge_count", Integer.valueOf(paramInt));
    contentValues.put("package_name", paramComponentName.getPackageName());
    contentValues.put("activity_name", paramComponentName.getClassName());
    return contentValues;
  }
  
  private void a(ContentValues paramContentValues) {
    this.b.startInsert(0, null, this.a, paramContentValues);
  }
  
  private void a(Context paramContext, ContentValues paramContentValues) {
    paramContext.getApplicationContext().getContentResolver().insert(this.a, paramContentValues);
  }
  
  private static boolean a(Context paramContext) {
    PackageManager packageManager = paramContext.getPackageManager();
    boolean bool = false;
    if (packageManager.resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null)
      bool = true; 
    return bool;
  }
  
  private static void b(Context paramContext, ComponentName paramComponentName, int paramInt) {
    boolean bool;
    Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
    intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", paramComponentName.getPackageName());
    intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", paramComponentName.getClassName());
    intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(paramInt));
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", bool);
    paramContext.sendBroadcast(intent);
  }
  
  private void c(Context paramContext, ComponentName paramComponentName, int paramInt) {
    if (paramInt < 0)
      return; 
    ContentValues contentValues = a(paramInt, paramComponentName);
    if (Looper.myLooper() == Looper.getMainLooper()) {
      if (this.b == null)
        this.b = new a(this, paramContext.getApplicationContext().getContentResolver()); 
      a(contentValues);
      return;
    } 
    a(paramContext, contentValues);
  }
  
  public List<String> a() {
    return Arrays.asList(new String[] { "com.sonyericsson.home", "com.sonymobile.home" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    if (a(paramContext)) {
      c(paramContext, paramComponentName, paramInt);
      return;
    } 
    b(paramContext, paramComponentName, paramInt);
  }
  
  class a extends AsyncQueryHandler {
    a(SonyHomeBadger this$0, ContentResolver param1ContentResolver) {
      super(param1ContentResolver);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/SonyHomeBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */