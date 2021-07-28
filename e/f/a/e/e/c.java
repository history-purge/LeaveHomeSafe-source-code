package e.f.a.e.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.t.a;

public class c extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<c> CREATOR = new p();
  
  private final String c;
  
  @Deprecated
  private final int d;
  
  private final long e;
  
  public c(@RecentlyNonNull String paramString, @RecentlyNonNull int paramInt, @RecentlyNonNull long paramLong) {
    this.c = paramString;
    this.d = paramInt;
    this.e = paramLong;
  }
  
  @RecentlyNonNull
  public String b() {
    return this.c;
  }
  
  @RecentlyNonNull
  public long c() {
    long l2 = this.e;
    long l1 = l2;
    if (l2 == -1L)
      l1 = this.d; 
    return l1;
  }
  
  @RecentlyNonNull
  public boolean equals(Object paramObject) {
    if (paramObject instanceof c) {
      paramObject = paramObject;
      if (((b() != null && b().equals(paramObject.b())) || (b() == null && paramObject.b() == null)) && c() == paramObject.c())
        return true; 
    } 
    return false;
  }
  
  @RecentlyNonNull
  public int hashCode() {
    return o.a(new Object[] { b(), Long.valueOf(c()) });
  }
  
  @RecentlyNonNull
  public String toString() {
    o.a a1 = o.a(this);
    a1.a("name", b());
    a1.a("version", Long.valueOf(c()));
    return a1.toString();
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = com.google.android.gms.common.internal.t.c.a(paramParcel);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 1, b(), false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 2, this.d);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 3, c());
    com.google.android.gms.common.internal.t.c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */