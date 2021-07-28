package e.f.a.e.i.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class p extends a {
  public static final Parcelable.Creator<p> CREATOR = new r();
  
  private final m[] c;
  
  public final c d;
  
  private final c e;
  
  public final String f;
  
  private final float g;
  
  public final String h;
  
  private final boolean i;
  
  public p(m[] paramArrayOfm, c paramc1, c paramc2, String paramString1, float paramFloat, String paramString2, boolean paramBoolean) {
    this.c = paramArrayOfm;
    this.d = paramc1;
    this.e = paramc2;
    this.f = paramString1;
    this.g = paramFloat;
    this.h = paramString2;
    this.i = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 2, (Parcelable[])this.c, paramInt, false);
    c.a(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    c.a(paramParcel, 5, this.f, false);
    c.a(paramParcel, 6, this.g);
    c.a(paramParcel, 7, this.h, false);
    c.a(paramParcel, 8, this.i);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */