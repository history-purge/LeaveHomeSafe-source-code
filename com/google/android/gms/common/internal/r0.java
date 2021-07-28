package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class r0 {
  static {
    Uri.parse("https://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
  }
  
  public static Intent a() {
    Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    intent.setPackage("com.google.android.wearable.app");
    return intent;
  }
  
  public static Intent a(String paramString) {
    Uri uri = Uri.fromParts("package", paramString, null);
    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    intent.setData(uri);
    return intent;
  }
  
  public static Intent a(String paramString1, String paramString2) {
    Intent intent = new Intent("android.intent.action.VIEW");
    Uri.Builder builder = Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString1);
    if (!TextUtils.isEmpty(paramString2))
      builder.appendQueryParameter("pcampaignid", paramString2); 
    intent.setData(builder.build());
    intent.setPackage("com.android.vending");
    intent.addFlags(524288);
    return intent;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */