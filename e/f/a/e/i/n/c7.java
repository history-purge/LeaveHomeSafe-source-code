package e.f.a.e.i.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.n.b;

public final class c7 extends a {
  public static final Parcelable.Creator<c7> CREATOR = new f7();
  
  public int c;
  
  public int d;
  
  public int e;
  
  public long f;
  
  public int g;
  
  public c7() {}
  
  public c7(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramLong;
    this.g = paramInt4;
  }
  
  public static c7 a(b paramb) {
    c7 c71 = new c7();
    c71.c = paramb.c().f();
    c71.d = paramb.c().b();
    c71.g = paramb.c().d();
    c71.e = paramb.c().c();
    c71.f = paramb.c().e();
    return c71;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, this.c);
    c.a(paramParcel, 3, this.d);
    c.a(paramParcel, 4, this.e);
    c.a(paramParcel, 5, this.f);
    c.a(paramParcel, 6, this.g);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/c7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */