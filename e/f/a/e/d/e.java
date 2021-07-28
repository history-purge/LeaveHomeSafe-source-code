package e.f.a.e.d;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class e implements Parcelable {
  public static final Parcelable.Creator<e> CREATOR = new g();
  
  private Messenger c;
  
  private c d;
  
  public e(IBinder paramIBinder) {
    if (Build.VERSION.SDK_INT >= 21) {
      this.c = new Messenger(paramIBinder);
      return;
    } 
    this.d = new c.a(paramIBinder);
  }
  
  private final IBinder e() {
    Messenger messenger = this.c;
    return (messenger != null) ? messenger.getBinder() : this.d.asBinder();
  }
  
  public final void a(Message paramMessage) {
    Messenger messenger = this.c;
    if (messenger != null) {
      messenger.send(paramMessage);
      return;
    } 
    this.d.a(paramMessage);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    try {
      return e().equals(((e)paramObject).e());
    } catch (ClassCastException classCastException) {
      return false;
    } 
  }
  
  public int hashCode() {
    return e().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    IBinder iBinder;
    Messenger messenger = this.c;
    if (messenger != null) {
      iBinder = messenger.getBinder();
    } else {
      iBinder = this.d.asBinder();
    } 
    paramParcel.writeStrongBinder(iBinder);
  }
  
  public static final class a extends ClassLoader {
    protected final Class<?> loadClass(String param1String, boolean param1Boolean) {
      if ("com.google.android.gms.iid.MessengerCompat".equals(param1String)) {
        boolean bool;
        if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class"); 
        return e.class;
      } 
      return super.loadClass(param1String, param1Boolean);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */