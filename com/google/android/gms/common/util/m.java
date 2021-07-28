package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.util.regex.Pattern;

public class m {
  static {
    Pattern.compile("\\$\\{(.*?)\\}");
  }
  
  @RecentlyNonNull
  public static boolean a(String paramString) {
    return (paramString == null || paramString.trim().isEmpty());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */