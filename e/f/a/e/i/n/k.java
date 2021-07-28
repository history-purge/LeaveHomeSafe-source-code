package e.f.a.e.i.n;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class k extends a {
  public static final Parcelable.Creator<k> CREATOR = new j();
  
  public final Rect c;
  
  public k(Rect paramRect) {
    this.c = paramRect;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */