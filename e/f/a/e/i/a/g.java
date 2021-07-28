package e.f.a.e.i.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import e.f.a.e.a.a.a;

public final class g extends g<i> {
  private final a.a z;
  
  public g(Context paramContext, Looper paramLooper, d paramd, a.a parama, f.a parama1, f.b paramb) {
    super(paramContext, paramLooper, 68, paramd, parama1, paramb);
    a.a a2 = parama;
    if (parama == null)
      a2 = a.a.f; 
    a.a.a a1 = new a.a.a(a2);
    a1.a(b.a());
    this.z = a1.a();
  }
  
  public final int d() {
    return 12800000;
  }
  
  protected final Bundle r() {
    return this.z.a();
  }
  
  protected final String v() {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  protected final String w() {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */