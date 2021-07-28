package b.g.j;

import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

public final class b {
  public static c a(Configuration paramConfiguration) {
    return (Build.VERSION.SDK_INT >= 24) ? c.a(paramConfiguration.getLocales()) : c.a(new Locale[] { paramConfiguration.locale });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */