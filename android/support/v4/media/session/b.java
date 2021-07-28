package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface b extends IInterface {
  void a(a parama);
  
  public static abstract class a extends Binder implements b {
    public static b a(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      return (iInterface != null && iInterface instanceof b) ? (b)iInterface : new a(param1IBinder);
    }
    
    private static class a implements b {
      private IBinder a;
      
      a(IBinder param2IBinder) {
        this.a = param2IBinder;
      }
      
      public void a(a param2a) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          if (param2a != null) {
            IBinder iBinder = param2a.asBinder();
          } else {
            param2a = null;
          } 
          parcel1.writeStrongBinder((IBinder)param2a);
          this.a.transact(3, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public IBinder asBinder() {
        return this.a;
      }
    }
  }
  
  private static class a implements b {
    private IBinder a;
    
    a(IBinder param1IBinder) {
      this.a = param1IBinder;
    }
    
    public void a(a param1a) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        if (param1a != null) {
          IBinder iBinder = param1a.asBinder();
        } else {
          param1a = null;
        } 
        parcel1.writeStrongBinder((IBinder)param1a);
        this.a.transact(3, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public IBinder asBinder() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/session/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */