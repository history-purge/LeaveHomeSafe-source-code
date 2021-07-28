package e.f.a.e.d;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class s {
  private final Messenger a;
  
  private final e b;
  
  s(IBinder paramIBinder) {
    String str2 = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str2)) {
      this.a = new Messenger(paramIBinder);
      this.b = null;
      return;
    } 
    if ("com.google.android.gms.iid.IMessengerCompat".equals(str2)) {
      this.b = new e(paramIBinder);
      this.a = null;
      return;
    } 
    String str1 = String.valueOf(str2);
    if (str1.length() != 0) {
      str1 = "Invalid interface descriptor: ".concat(str1);
    } else {
      str1 = new String("Invalid interface descriptor: ");
    } 
    Log.w("MessengerIpcClient", str1);
    throw new RemoteException();
  }
  
  final void a(Message paramMessage) {
    Messenger messenger = this.a;
    if (messenger != null) {
      messenger.send(paramMessage);
      return;
    } 
    e e1 = this.b;
    if (e1 != null) {
      e1.a(paramMessage);
      return;
    } 
    throw new IllegalStateException("Both messengers are null");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */