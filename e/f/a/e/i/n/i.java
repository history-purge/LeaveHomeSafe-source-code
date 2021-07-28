package e.f.a.e.i.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class i extends a {
  public static final Parcelable.Creator<i> CREATOR = new h();
  
  public final p[] c;
  
  public final c d;
  
  private final c e;
  
  private final c f;
  
  public final String g;
  
  private final float h;
  
  public final String i;
  
  private final int j;
  
  public final boolean k;
  
  public final int l;
  
  public final int m;
  
  public i(p[] paramArrayOfp, c paramc1, c paramc2, c paramc3, String paramString1, float paramFloat, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
    this.c = paramArrayOfp;
    this.d = paramc1;
    this.e = paramc2;
    this.f = paramc3;
    this.g = paramString1;
    this.h = paramFloat;
    this.i = paramString2;
    this.j = paramInt1;
    this.k = paramBoolean;
    this.l = paramInt2;
    this.m = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int j = c.a(paramParcel);
    c.a(paramParcel, 2, (Parcelable[])this.c, paramInt, false);
    c.a(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    c.a(paramParcel, 5, (Parcelable)this.f, paramInt, false);
    c.a(paramParcel, 6, this.g, false);
    c.a(paramParcel, 7, this.h);
    c.a(paramParcel, 8, this.i, false);
    c.a(paramParcel, 9, this.j);
    c.a(paramParcel, 10, this.k);
    c.a(paramParcel, 11, this.l);
    c.a(paramParcel, 12, this.m);
    c.a(paramParcel, j);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */