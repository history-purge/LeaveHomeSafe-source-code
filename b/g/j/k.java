package b.g.j;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class k {
  public static boolean a(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 24) ? ((UserManager)paramContext.getSystemService(UserManager.class)).isUserUnlocked() : true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */