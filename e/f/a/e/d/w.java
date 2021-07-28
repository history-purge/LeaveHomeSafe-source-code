package e.f.a.e.d;

import android.os.Bundle;

final class w extends u<Bundle> {
  w(int paramInt1, int paramInt2, Bundle paramBundle) {
    super(paramInt1, 1, paramBundle);
  }
  
  final void a(Bundle paramBundle) {
    Bundle bundle = paramBundle.getBundle("data");
    paramBundle = bundle;
    if (bundle == null)
      paramBundle = Bundle.EMPTY; 
    a((T)paramBundle);
  }
  
  final boolean a() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */