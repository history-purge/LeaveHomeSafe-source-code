package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
public final class j {
  public static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (IOException iOException) {
        return;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */