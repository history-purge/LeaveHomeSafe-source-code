package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import e.f.a.e.e.n.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
  @RecentlyNullable
  public static MessageDigest a(@RecentlyNonNull String paramString) {
    int i = 0;
    while (true) {
      if (i < 2) {
        try {
          MessageDigest messageDigest = MessageDigest.getInstance(paramString);
          if (messageDigest != null)
            return messageDigest; 
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        i++;
        continue;
      } 
      return null;
    } 
  }
  
  @Deprecated
  @RecentlyNullable
  public static byte[] a(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString) {
    PackageInfo packageInfo = b.a(paramContext).b(paramString, 64);
    Signature[] arrayOfSignature = packageInfo.signatures;
    if (arrayOfSignature != null && arrayOfSignature.length == 1) {
      MessageDigest messageDigest = a("SHA1");
      if (messageDigest != null)
        return messageDigest.digest(packageInfo.signatures[0].toByteArray()); 
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */