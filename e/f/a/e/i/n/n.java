package e.f.a.e.i.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class n extends a {
  public static final Parcelable.Creator<n> CREATOR = new q();
  
  private final String c;
  
  public n() {
    this(null);
  }
  
  public n(String paramString) {
    this.c = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, this.c, false);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */