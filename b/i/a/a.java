package b.i.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
  public static final Parcelable.Creator<a> CREATOR;
  
  public static final a d = new a();
  
  private final Parcelable c;
  
  static {
    CREATOR = (Parcelable.Creator<a>)new b();
  }
  
  private a() {
    this.c = null;
  }
  
  protected a(Parcel paramParcel, ClassLoader paramClassLoader) {
    Parcelable parcelable = paramParcel.readParcelable(paramClassLoader);
    if (parcelable == null)
      parcelable = d; 
    this.c = parcelable;
  }
  
  protected a(Parcelable paramParcelable) {
    if (paramParcelable != null) {
      if (paramParcelable == d)
        paramParcelable = null; 
      this.c = paramParcelable;
      return;
    } 
    throw new IllegalArgumentException("superState must not be null");
  }
  
  public int describeContents() {
    return 0;
  }
  
  public final Parcelable e() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.c, paramInt);
  }
  
  static final class a extends a {
    a() {
      super((a)null);
    }
  }
  
  static final class b implements Parcelable.ClassLoaderCreator<a> {
    public a createFromParcel(Parcel param1Parcel) {
      return createFromParcel(param1Parcel, (ClassLoader)null);
    }
    
    public a createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      if (param1Parcel.readParcelable(param1ClassLoader) == null)
        return a.d; 
      throw new IllegalStateException("superState must be null");
    }
    
    public a[] newArray(int param1Int) {
      return new a[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/i/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */