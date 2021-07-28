package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;

public class i {
  private static final char[] a = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'A', 'B', 'C', 'D', 'E', 'F' };
  
  @RecentlyNonNull
  public static String a(@RecentlyNonNull byte[] paramArrayOfbyte, @RecentlyNonNull boolean paramBoolean) {
    int k = paramArrayOfbyte.length;
    StringBuilder stringBuilder = new StringBuilder(k << 1);
    for (int j = 0; j < k && (!paramBoolean || j != k - 1 || (paramArrayOfbyte[j] & 0xFF) != 0); j++) {
      stringBuilder.append(a[(paramArrayOfbyte[j] & 0xF0) >>> 4]);
      stringBuilder.append(a[paramArrayOfbyte[j] & 0xF]);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */