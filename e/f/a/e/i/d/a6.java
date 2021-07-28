package e.f.a.e.i.d;

import android.database.ContentObserver;
import android.os.Handler;

final class a6 extends ContentObserver {
  a6(Handler paramHandler) {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean) {
    z5.a().set(true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */