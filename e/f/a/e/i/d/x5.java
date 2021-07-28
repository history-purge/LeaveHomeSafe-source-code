package e.f.a.e.i.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class x5 extends a {
  public static final Parcelable.Creator<x5> CREATOR = new y5();
  
  private final String c;
  
  private final int d;
  
  public final int e;
  
  private final String f;
  
  private final String g;
  
  private final boolean h;
  
  public final String i;
  
  private final boolean j;
  
  private final int k;
  
  public x5(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean, c5 paramc5) {
    q.a(paramString1);
    this.c = paramString1;
    this.d = paramInt1;
    this.e = paramInt2;
    this.i = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramBoolean ^ true;
    this.j = paramBoolean;
    this.k = paramc5.g();
  }
  
  public x5(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, int paramInt3) {
    this.c = paramString1;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramBoolean1;
    this.i = paramString4;
    this.j = paramBoolean2;
    this.k = paramInt3;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof x5) {
      paramObject = paramObject;
      if (o.a(this.c, ((x5)paramObject).c) && this.d == ((x5)paramObject).d && this.e == ((x5)paramObject).e && o.a(this.i, ((x5)paramObject).i) && o.a(this.f, ((x5)paramObject).f) && o.a(this.g, ((x5)paramObject).g) && this.h == ((x5)paramObject).h && this.j == ((x5)paramObject).j && this.k == ((x5)paramObject).k)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return o.a(new Object[] { this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.i, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.j), Integer.valueOf(this.k) });
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PlayLoggerContext[");
    stringBuilder.append("package=");
    stringBuilder.append(this.c);
    stringBuilder.append(',');
    stringBuilder.append("packageVersionCode=");
    stringBuilder.append(this.d);
    stringBuilder.append(',');
    stringBuilder.append("logSource=");
    stringBuilder.append(this.e);
    stringBuilder.append(',');
    stringBuilder.append("logSourceName=");
    stringBuilder.append(this.i);
    stringBuilder.append(',');
    stringBuilder.append("uploadAccount=");
    stringBuilder.append(this.f);
    stringBuilder.append(',');
    stringBuilder.append("loggingId=");
    stringBuilder.append(this.g);
    stringBuilder.append(',');
    stringBuilder.append("logAndroidId=");
    stringBuilder.append(this.h);
    stringBuilder.append(',');
    stringBuilder.append("isAnonymous=");
    stringBuilder.append(this.j);
    stringBuilder.append(',');
    stringBuilder.append("qosTier=");
    stringBuilder.append(this.k);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, this.c, false);
    c.a(paramParcel, 3, this.d);
    c.a(paramParcel, 4, this.e);
    c.a(paramParcel, 5, this.f, false);
    c.a(paramParcel, 6, this.g, false);
    c.a(paramParcel, 7, this.h);
    c.a(paramParcel, 8, this.i, false);
    c.a(paramParcel, 9, this.j);
    c.a(paramParcel, 10, this.k);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/x5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */