package e.f.a.e.d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class a extends a {
  public static final Parcelable.Creator<a> CREATOR = new f();
  
  private Intent c;
  
  public a(Intent paramIntent) {
    this.c = paramIntent;
  }
  
  public final Intent b() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, (Parcelable)this.c, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */