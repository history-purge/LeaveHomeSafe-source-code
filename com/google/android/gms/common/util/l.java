package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.q;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class l {
  private static String a;
  
  private static int b;
  
  private static BufferedReader a(String paramString) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
    try {
      return new BufferedReader(new FileReader(paramString));
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  @RecentlyNullable
  public static String a() {
    if (a == null) {
      if (b == 0)
        b = Process.myPid(); 
      a = a(b);
    } 
    return a;
  }
  
  private static String a(int paramInt) {
    IOException iOException1;
    null = null;
    String str = null;
    if (paramInt <= 0)
      return null; 
    try {
      StringBuilder stringBuilder = new StringBuilder(25);
      stringBuilder.append("/proc/");
      stringBuilder.append(paramInt);
      stringBuilder.append("/cmdline");
      BufferedReader bufferedReader = a(stringBuilder.toString());
      try {
        str = bufferedReader.readLine();
        q.a(str);
        str = str.trim();
        null = str;
      } catch (IOException iOException2) {
      
      } finally {}
      j.a(bufferedReader);
      throw null;
    } catch (IOException null) {
    
    } finally {
      iOException1 = iOException2;
      j.a((Closeable)iOException1);
    } 
    j.a((Closeable)iOException1);
    return (String)SYNTHETIC_LOCAL_VARIABLE_2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */