package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class g implements Parcelable {
  public static final Parcelable.Creator<g> CREATOR = new a();
  
  private final IntentSender c;
  
  private final Intent d;
  
  private final int e;
  
  private final int f;
  
  g(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2) {
    this.c = paramIntentSender;
    this.d = paramIntent;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  g(Parcel paramParcel) {
    this.c = (IntentSender)paramParcel.readParcelable(IntentSender.class.getClassLoader());
    this.d = (Intent)paramParcel.readParcelable(Intent.class.getClassLoader());
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public Intent e() {
    return this.d;
  }
  
  public int f() {
    return this.e;
  }
  
  public int g() {
    return this.f;
  }
  
  public IntentSender h() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable((Parcelable)this.c, paramInt);
    paramParcel.writeParcelable((Parcelable)this.d, paramInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
  }
  
  class a implements Parcelable.Creator<g> {
    public g createFromParcel(Parcel param1Parcel) {
      return new g(param1Parcel);
    }
    
    public g[] newArray(int param1Int) {
      return new g[param1Int];
    }
  }
  
  public static final class b {
    private IntentSender a;
    
    private Intent b;
    
    private int c;
    
    private int d;
    
    public b(IntentSender param1IntentSender) {
      this.a = param1IntentSender;
    }
    
    public b a(int param1Int1, int param1Int2) {
      this.d = param1Int1;
      this.c = param1Int2;
      return this;
    }
    
    public b a(Intent param1Intent) {
      this.b = param1Intent;
      return this;
    }
    
    public g a() {
      return new g(this.a, this.b, this.c, this.d);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/result/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */