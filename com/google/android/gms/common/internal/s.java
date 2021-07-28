package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import e.f.a.e.e.i;

public class s {
  private final Resources a;
  
  private final String b;
  
  public s(@RecentlyNonNull Context paramContext) {
    q.a(paramContext);
    this.a = paramContext.getResources();
    this.b = this.a.getResourcePackageName(i.common_google_play_services_unknown_issue);
  }
  
  @RecentlyNullable
  public String a(@RecentlyNonNull String paramString) {
    int i = this.a.getIdentifier(paramString, "string", this.b);
    return (i == 0) ? null : this.a.getString(i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */