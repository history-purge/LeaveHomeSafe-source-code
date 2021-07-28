package e.f.a.e.e;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class a extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<a> CREATOR;
  
  @RecentlyNonNull
  public static final a g = new a(0);
  
  private final int c;
  
  private final int d;
  
  private final PendingIntent e;
  
  private final String f;
  
  static {
    CREATOR = new o();
  }
  
  public a(@RecentlyNonNull int paramInt) {
    this(paramInt, null, null);
  }
  
  a(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramPendingIntent;
    this.f = paramString;
  }
  
  public a(@RecentlyNonNull int paramInt, PendingIntent paramPendingIntent) {
    this(paramInt, paramPendingIntent, null);
  }
  
  public a(@RecentlyNonNull int paramInt, PendingIntent paramPendingIntent, String paramString) {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String b(int paramInt) {
    if (paramInt != 99) {
      if (paramInt != 1500) {
        StringBuilder stringBuilder;
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                stringBuilder = new StringBuilder(31);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(paramInt);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 22:
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
              case 21:
                return "API_VERSION_UPDATE_REQUIRED";
              case 20:
                return "RESTRICTED_PROFILE";
              case 19:
                return "SERVICE_MISSING_PERMISSION";
              case 18:
                return "SERVICE_UPDATING";
              case 17:
                return "SIGN_IN_FAILED";
              case 16:
                return "API_UNAVAILABLE";
              case 15:
                return "INTERRUPTED";
              case 14:
                return "TIMEOUT";
              case 13:
                break;
            } 
            return "CANCELED";
          case 11:
            return "LICENSE_CHECK_FAILED";
          case 10:
            return "DEVELOPER_ERROR";
          case 9:
            return "SERVICE_INVALID";
          case 8:
            return "INTERNAL_ERROR";
          case 7:
            return "NETWORK_ERROR";
          case 6:
            return "RESOLUTION_REQUIRED";
          case 5:
            return "INVALID_ACCOUNT";
          case 4:
            return "SIGN_IN_REQUIRED";
          case 3:
            return "SERVICE_DISABLED";
          case 2:
            return "SERVICE_VERSION_UPDATE_REQUIRED";
          case 1:
            return "SERVICE_MISSING";
          case 0:
            return "SUCCESS";
          case -1:
            break;
        } 
        return "UNKNOWN";
      } 
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    } 
    return "UNFINISHED";
  }
  
  public final void a(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull int paramInt) {
    if (!e())
      return; 
    PendingIntent pendingIntent = this.e;
    q.a(pendingIntent);
    paramActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  @RecentlyNonNull
  public final int b() {
    return this.d;
  }
  
  @RecentlyNullable
  public final String c() {
    return this.f;
  }
  
  @RecentlyNullable
  public final PendingIntent d() {
    return this.e;
  }
  
  @RecentlyNonNull
  public final boolean e() {
    return (this.d != 0 && this.e != null);
  }
  
  @RecentlyNonNull
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return (this.d == ((a)paramObject).d && o.a(this.e, ((a)paramObject).e) && o.a(this.f, ((a)paramObject).f));
  }
  
  @RecentlyNonNull
  public final int hashCode() {
    return o.a(new Object[] { Integer.valueOf(this.d), this.e, this.f });
  }
  
  @RecentlyNonNull
  public final boolean r() {
    return (this.d == 0);
  }
  
  @RecentlyNonNull
  public final String toString() {
    o.a a1 = o.a(this);
    a1.a("statusCode", b(this.d));
    a1.a("resolution", this.e);
    a1.a("message", this.f);
    return a1.toString();
  }
  
  public final void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, b());
    c.a(paramParcel, 3, (Parcelable)d(), paramInt, false);
    c.a(paramParcel, 4, c(), false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */