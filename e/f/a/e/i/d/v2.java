package e.f.a.e.i.d;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.n;
import e.f.a.e.c.a;
import e.f.a.e.c.c;
import e.f.a.e.c.f;

public final class v2 extends e<a.d.d> implements c {
  private v2(Context paramContext) {
    super(paramContext, a.o, null, (n)new a());
  }
  
  public static c a(Context paramContext) {
    return new v2(paramContext);
  }
  
  public final h<Status> a(f paramf) {
    l5 l5 = new l5(paramf, a());
    a(l5);
    return (h<Status>)l5;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/v2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */