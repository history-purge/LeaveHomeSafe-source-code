package b.g.j;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class h {
  @Deprecated
  public static <T> Parcelable.Creator<T> a(i<T> parami) {
    return (Parcelable.Creator<T>)new a<T>(parami);
  }
  
  static class a<T> implements Parcelable.ClassLoaderCreator<T> {
    private final i<T> a;
    
    a(i<T> param1i) {
      this.a = param1i;
    }
    
    public T createFromParcel(Parcel param1Parcel) {
      return this.a.createFromParcel(param1Parcel, null);
    }
    
    public T createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return this.a.createFromParcel(param1Parcel, param1ClassLoader);
    }
    
    public T[] newArray(int param1Int) {
      return this.a.newArray(param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */