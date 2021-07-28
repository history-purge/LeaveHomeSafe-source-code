package e.f.a.c.i.x;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.z.a;

public abstract class h {
  static s a(Context paramContext, y paramy, n paramn, a parama) {
    return (s)((Build.VERSION.SDK_INT >= 21) ? new m(paramContext, paramy, paramn) : new j(paramContext, paramy, parama, paramn));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */