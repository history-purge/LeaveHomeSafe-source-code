package e.f.a.e.i.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;

public final class c extends a {
  public static final Parcelable.Creator<c> CREATOR = new b();
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final float g;
  
  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramFloat;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = com.google.android.gms.common.internal.t.c.a(paramParcel);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 2, this.c);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 3, this.d);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 4, this.e);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 5, this.f);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 6, this.g);
    com.google.android.gms.common.internal.t.c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */