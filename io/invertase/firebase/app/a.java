package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

public class a {
  private static Context a;
  
  public static Context a() {
    return a;
  }
  
  public static void a(Context paramContext) {
    Log.d("ReactNativeFirebaseApp", "received application context.");
    a = paramContext;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */