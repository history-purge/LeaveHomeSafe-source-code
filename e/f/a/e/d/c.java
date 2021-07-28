package e.f.a.e.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

interface c extends IInterface {
  void a(Message paramMessage);
  
  public static class a implements c {
    private final IBinder a;
    
    a(IBinder param1IBinder) {
      this.a = param1IBinder;
    }
    
    public void a(Message param1Message) {
      Parcel parcel = Parcel.obtain();
      parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
      parcel.writeInt(1);
      param1Message.writeToParcel(parcel, 0);
      try {
        this.a.transact(1, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
    
    public IBinder asBinder() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */