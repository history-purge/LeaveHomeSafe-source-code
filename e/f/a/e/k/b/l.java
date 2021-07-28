package e.f.a.e.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class l extends a {
  public static final Parcelable.Creator<l> CREATOR = new k();
  
  private final int c;
  
  private final f0 d;
  
  l(int paramInt, f0 paramf0) {
    this.c = paramInt;
    this.d = paramf0;
  }
  
  public l(f0 paramf0) {
    this(1, paramf0);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */