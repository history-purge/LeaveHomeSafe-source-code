package e.f.a.e.d;

import android.os.Bundle;

final class r extends u<Void> {
  r(int paramInt1, int paramInt2, Bundle paramBundle) {
    super(paramInt1, 2, paramBundle);
  }
  
  final void a(Bundle paramBundle) {
    if (paramBundle.getBoolean("ack", false)) {
      a((T)null);
      return;
    } 
    a(new t(4, "Invalid response to one way request"));
  }
  
  final boolean a() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */