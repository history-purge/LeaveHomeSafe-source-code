package e.f.a.e.i.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class g4 extends a {
  public static final Parcelable.Creator<g4> CREATOR = new f3();
  
  public int c;
  
  private boolean d;
  
  public g4() {}
  
  public g4(int paramInt, boolean paramBoolean) {
    this.c = paramInt;
    this.d = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, this.c);
    c.a(paramParcel, 3, this.d);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/g4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */