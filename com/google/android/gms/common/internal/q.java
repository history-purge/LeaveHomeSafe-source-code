package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.r;

public final class q {
  public static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException("null reference");
  }
  
  public static <T> T a(@RecentlyNonNull T paramT, @RecentlyNonNull Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  @RecentlyNonNull
  public static String a(@RecentlyNonNull String paramString, @RecentlyNonNull Object paramObject) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void a() {
    c("Must not be called on the main application thread");
  }
  
  public static void a(@RecentlyNonNull Handler paramHandler) {
    Looper looper = Looper.myLooper();
    if (looper != paramHandler.getLooper()) {
      String str2;
      if (looper != null) {
        str2 = looper.getThread().getName();
      } else {
        str2 = "null current looper";
      } 
      String str1 = paramHandler.getLooper().getThread().getName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 36 + String.valueOf(str2).length());
      stringBuilder.append("Must be called on ");
      stringBuilder.append(str1);
      stringBuilder.append(" thread, but got ");
      stringBuilder.append(str2);
      stringBuilder.append(".");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public static void a(@RecentlyNonNull String paramString) {
    if (r.a())
      return; 
    throw new IllegalStateException(paramString);
  }
  
  public static void a(@RecentlyNonNull boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException();
  }
  
  public static void a(@RecentlyNonNull boolean paramBoolean, @RecentlyNonNull Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void a(@RecentlyNonNull boolean paramBoolean, @RecentlyNonNull String paramString, @RecentlyNonNull Object... paramVarArgs) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  @RecentlyNonNull
  public static String b(@RecentlyNonNull String paramString) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException("Given String is empty or null");
  }
  
  public static void b(@RecentlyNonNull boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException();
  }
  
  public static void b(@RecentlyNonNull boolean paramBoolean, @RecentlyNonNull Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static void c(@RecentlyNonNull String paramString) {
    if (!r.a())
      return; 
    throw new IllegalStateException(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */