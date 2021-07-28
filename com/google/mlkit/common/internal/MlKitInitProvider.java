package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.q;
import e.f.b.a.c.i;

public class MlKitInitProvider extends ContentProvider {
  public final void attachInfo(@RecentlyNonNull Context paramContext, @RecentlyNonNull ProviderInfo paramProviderInfo) {
    q.b(paramProviderInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider") ^ true, "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    super.attachInfo(paramContext, paramProviderInfo);
  }
  
  public final int delete(@RecentlyNonNull Uri paramUri, String paramString, String[] paramArrayOfString) {
    return 0;
  }
  
  @RecentlyNullable
  public final String getType(@RecentlyNonNull Uri paramUri) {
    return null;
  }
  
  @RecentlyNullable
  public final Uri insert(@RecentlyNonNull Uri paramUri, ContentValues paramContentValues) {
    return null;
  }
  
  public final boolean onCreate() {
    Context context = getContext();
    if (context == null) {
      Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
      return false;
    } 
    i.a(context);
    return false;
  }
  
  @RecentlyNullable
  public final Cursor query(@RecentlyNonNull Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    return null;
  }
  
  public final int update(@RecentlyNonNull Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/common/internal/MlKitInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */