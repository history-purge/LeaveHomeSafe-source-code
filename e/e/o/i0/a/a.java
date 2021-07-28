package e.e.o.i0.a;

import android.content.Context;
import android.content.ContextWrapper;

public class a {
  public static <T> T a(Context paramContext, Class<? extends T> paramClass) {
    while (!paramClass.isInstance(paramContext)) {
      if (paramContext instanceof ContextWrapper) {
        Context context = ((ContextWrapper)paramContext).getBaseContext();
        if (paramContext == context)
          return null; 
        paramContext = context;
        continue;
      } 
      return null;
    } 
    return (T)paramContext;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/i0/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */