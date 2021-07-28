package e.f.a.e.i.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import e.f.a.e.f.a;
import e.f.a.e.f.b;

public final class o extends d7<e> {
  private final n i;
  
  public o(Context paramContext, n paramn) {
    super(paramContext, "TextNativeHandle", "ocr");
    this.i = paramn;
    d();
  }
  
  protected final void a() {
    e e = (e)d();
    q.a(e);
    e.zzb();
  }
  
  public final i[] a(Bitmap paramBitmap, c7 paramc7, k paramk) {
    if (!b())
      return new i[0]; 
    try {
      a a = b.a(paramBitmap);
      e e = (e)d();
      q.a(e);
      return e.a(a, paramc7, paramk);
    } catch (RemoteException remoteException) {
      Log.e("TextNativeHandle", "Error calling native text recognizer", (Throwable)remoteException);
      return new i[0];
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */