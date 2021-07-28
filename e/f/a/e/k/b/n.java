package e.f.a.e.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.g0;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.e.a;

public final class n extends a {
  public static final Parcelable.Creator<n> CREATOR = new m();
  
  private final int c;
  
  private final a d;
  
  private final g0 e;
  
  public n(int paramInt) {
    this(new a(8, null), null);
  }
  
  n(int paramInt, a parama, g0 paramg0) {
    this.c = paramInt;
    this.d = parama;
    this.e = paramg0;
  }
  
  private n(a parama, g0 paramg0) {
    this(1, parama, null);
  }
  
  public final a b() {
    return this.d;
  }
  
  public final g0 c() {
    return this.e;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, 3, (Parcelable)this.e, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */