package e.f.a.e.i.b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import e.f.a.e.a.a.c;

public final class b extends g<c> {
  private final Bundle z;
  
  public b(Context paramContext, Looper paramLooper, d paramd, c paramc, f.a parama, f.b paramb) {
    super(paramContext, paramLooper, 16, paramd, parama, paramb);
    if (paramc == null) {
      this.z = new Bundle();
      return;
    } 
    throw new NoSuchMethodError();
  }
  
  public final int d() {
    return 12451000;
  }
  
  public final boolean j() {
    d d = B();
    return (!TextUtils.isEmpty(d.b()) && !d.a(e.f.a.e.a.a.b.c).isEmpty());
  }
  
  protected final Bundle r() {
    return this.z;
  }
  
  protected final String v() {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  protected final String w() {
    return "com.google.android.gms.auth.service.START";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */