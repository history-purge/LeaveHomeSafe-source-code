package e.f.a.e.n;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public class c {
  public static int a(@RecentlyNonNull String paramString, @RecentlyNonNull Object... paramVarArgs) {
    return Log.isLoggable("Vision", 3) ? Log.d("Vision", String.format(paramString, paramVarArgs)) : 0;
  }
  
  @SuppressLint({"LogTagMismatch"})
  public static int a(@RecentlyNonNull Throwable paramThrowable, @RecentlyNonNull String paramString, @RecentlyNonNull Object... paramVarArgs) {
    if (Log.isLoggable("Vision", 6)) {
      boolean bool = Log.isLoggable("Vision", 3);
      paramString = String.format(paramString, paramVarArgs);
      if (bool)
        return Log.e("Vision", paramString, paramThrowable); 
      String str = String.valueOf(paramThrowable);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(str).length());
      stringBuilder.append(paramString);
      stringBuilder.append(": ");
      stringBuilder.append(str);
      return Log.e("Vision", stringBuilder.toString());
    } 
    return 0;
  }
  
  public static int b(@RecentlyNonNull String paramString, @RecentlyNonNull Object... paramVarArgs) {
    return Log.isLoggable("Vision", 6) ? Log.e("Vision", String.format(paramString, paramVarArgs)) : 0;
  }
  
  public static int c(@RecentlyNonNull String paramString, @RecentlyNonNull Object... paramVarArgs) {
    return Log.isLoggable("Vision", 4) ? Log.i("Vision", String.format(paramString, paramVarArgs)) : 0;
  }
  
  public static int d(@RecentlyNonNull String paramString, @RecentlyNonNull Object... paramVarArgs) {
    return Log.isLoggable("Vision", 2) ? Log.v("Vision", String.format(paramString, paramVarArgs)) : 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */