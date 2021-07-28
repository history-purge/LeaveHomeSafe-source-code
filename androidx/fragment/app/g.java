package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class g {
  public abstract View a(int paramInt);
  
  @Deprecated
  public Fragment a(Context paramContext, String paramString, Bundle paramBundle) {
    return Fragment.a(paramContext, paramString, paramBundle);
  }
  
  public abstract boolean c();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */