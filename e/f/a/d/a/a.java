package e.f.a.d.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.a.b;
import e.f.a.a.c;

public interface a extends IInterface {
  Bundle b(Bundle paramBundle);
  
  public static abstract class a extends b implements a {
    public static a a(IBinder param1IBinder) {
      if (param1IBinder != null) {
        IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return (iInterface instanceof a) ? (a)iInterface : new a(param1IBinder);
      } 
      return null;
    }
    
    public static class a extends e.f.a.a.a implements a {
      a(IBinder param2IBinder) {
        super(param2IBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
      }
      
      public final Bundle b(Bundle param2Bundle) {
        Parcel parcel2 = e();
        c.a(parcel2, (Parcelable)param2Bundle);
        Parcel parcel1 = a(parcel2);
        Bundle bundle = (Bundle)c.a(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle;
      }
    }
  }
  
  public static class a extends e.f.a.a.a implements a {
    a(IBinder param1IBinder) {
      super(param1IBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }
    
    public final Bundle b(Bundle param1Bundle) {
      Parcel parcel2 = e();
      c.a(parcel2, (Parcelable)param1Bundle);
      Parcel parcel1 = a(parcel2);
      Bundle bundle = (Bundle)c.a(parcel1, Bundle.CREATOR);
      parcel1.recycle();
      return bundle;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */