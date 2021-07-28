package e.f.a.e.k.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.t.a;

public final class c extends a implements l {
  public static final Parcelable.Creator<c> CREATOR = new b();
  
  private final int c;
  
  private int d;
  
  private Intent e;
  
  public c() {
    this(0, null);
  }
  
  c(int paramInt1, int paramInt2, Intent paramIntent) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramIntent;
  }
  
  private c(int paramInt, Intent paramIntent) {
    this(2, 0, null);
  }
  
  public final Status a() {
    return (this.d == 0) ? Status.h : Status.l;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = com.google.android.gms.common.internal.t.c.a(paramParcel);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 1, this.c);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 2, this.d);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 3, (Parcelable)this.e, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */