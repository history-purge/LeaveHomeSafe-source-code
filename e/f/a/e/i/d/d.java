package e.f.a.e.i.d;

import android.database.ContentObserver;
import android.os.Handler;

final class d extends ContentObserver {
  d(c paramc, Handler paramHandler) {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean) {
    this.a.b();
    c.a(this.a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */