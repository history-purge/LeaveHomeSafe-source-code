package e.c.a.b;

import android.content.ComponentName;
import android.content.Context;
import h.a.a.c;

public class a {
  public static final a c = new a();
  
  private Boolean a;
  
  private ComponentName b;
  
  private void b(Context paramContext, int paramInt) {
    String str;
    Boolean bool = this.a;
    if (bool == null) {
      this.a = Boolean.valueOf(c.a(paramContext, paramInt));
      if (this.a.booleanValue()) {
        str = "First attempt to use automatic badger succeeded; permanently enabling method.";
      } else {
        str = "First attempt to use automatic badger failed; permanently disabling method.";
      } 
      e.e.e.e.a.c("ApplicationBadgeHelper", str);
      return;
    } 
    if (!bool.booleanValue())
      return; 
    c.a((Context)str, paramInt);
  }
  
  public void a(Context paramContext, int paramInt) {
    if (this.b == null)
      this.b = paramContext.getPackageManager().getLaunchIntentForPackage(paramContext.getPackageName()).getComponent(); 
    b(paramContext, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/c/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */