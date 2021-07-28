package e.f.a.e.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import java.util.List;

public final class h extends a implements l {
  public static final Parcelable.Creator<h> CREATOR = new j();
  
  private final List<String> c;
  
  private final String d;
  
  public h(List<String> paramList, String paramString) {
    this.c = paramList;
    this.d = paramString;
  }
  
  public final Status a() {
    return (this.d != null) ? Status.h : Status.l;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, this.c, false);
    c.a(paramParcel, 2, this.d, false);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */