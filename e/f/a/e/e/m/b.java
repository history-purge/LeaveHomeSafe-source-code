package e.f.a.e.e.m;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;

@Deprecated
public class b {
  @RecentlyNonNull
  public static String a(@RecentlyNonNull PowerManager.WakeLock paramWakeLock, @RecentlyNonNull String paramString) {
    String str2 = String.valueOf(String.valueOf(Process.myPid() << 32L | System.identityHashCode(paramWakeLock)));
    String str1 = paramString;
    if (TextUtils.isEmpty(paramString))
      str1 = ""; 
    str1 = String.valueOf(str1);
    return (str1.length() != 0) ? str2.concat(str1) : new String(str2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */