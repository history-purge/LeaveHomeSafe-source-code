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
import e.f.a.e.n.d.a;
import java.nio.ByteBuffer;

public final class g6 extends d7<g5> {
  private final g4 i;
  
  public g6(Context paramContext, g4 paramg4) {
    super(paramContext, "BarcodeNativeHandle", "barcode");
    this.i = paramg4;
    d();
  }
  
  protected final void a() {
    if (b()) {
      g5 g5 = (g5)d();
      q.a(g5);
      g5.zza();
    } 
  }
  
  public final a[] a(Bitmap paramBitmap, c7 paramc7) {
    if (!b())
      return new a[0]; 
    try {
      a a = b.a(paramBitmap);
      g5 g5 = (g5)d();
      q.a(g5);
      return g5.b(a, paramc7);
    } catch (RemoteException remoteException) {
      Log.e("BarcodeNativeHandle", "Error calling native barcode detector", (Throwable)remoteException);
      return new a[0];
    } 
  }
  
  public final a[] a(ByteBuffer paramByteBuffer, c7 paramc7) {
    if (!b())
      return new a[0]; 
    try {
      a a = b.a(paramByteBuffer);
      g5 g5 = (g5)d();
      q.a(g5);
      return g5.a(a, paramc7);
    } catch (RemoteException remoteException) {
      Log.e("BarcodeNativeHandle", "Error calling native barcode detector", (Throwable)remoteException);
      return new a[0];
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/g6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */