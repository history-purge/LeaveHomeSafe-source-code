package e.f.a.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class d extends a {
  public static final Parcelable.Creator<d> CREATOR = new e();
  
  private final boolean c;
  
  private final long d;
  
  private final long e;
  
  public d(boolean paramBoolean, long paramLong1, long paramLong2) {
    this.c = paramBoolean;
    this.d = paramLong1;
    this.e = paramLong2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
      if (this.c == ((d)paramObject).c && this.d == ((d)paramObject).d && this.e == ((d)paramObject).e)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return o.a(new Object[] { Boolean.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e) });
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
    stringBuilder.append(this.c);
    stringBuilder.append(",collectForDebugStartTimeMillis: ");
    stringBuilder.append(this.d);
    stringBuilder.append(",collectForDebugExpiryTimeMillis: ");
    stringBuilder.append(this.e);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, this.e);
    c.a(paramParcel, 3, this.d);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */