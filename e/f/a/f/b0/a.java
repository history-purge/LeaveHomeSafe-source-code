package e.f.a.f.b0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.d.g;
import b.i.a.a;

public class a extends a {
  public static final Parcelable.Creator<a> CREATOR = (Parcelable.Creator<a>)new a();
  
  public final g<String, Bundle> e;
  
  private a(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    int j = paramParcel.readInt();
    String[] arrayOfString = new String[j];
    paramParcel.readStringArray(arrayOfString);
    Bundle[] arrayOfBundle = new Bundle[j];
    paramParcel.readTypedArray((Object[])arrayOfBundle, Bundle.CREATOR);
    this.e = new g(j);
    for (int i = 0; i < j; i++)
      this.e.put(arrayOfString[i], arrayOfBundle[i]); 
  }
  
  public a(Parcelable paramParcelable) {
    super(paramParcelable);
    this.e = new g();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ExtendableSavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" states=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.e.size();
    paramParcel.writeInt(i);
    String[] arrayOfString = new String[i];
    Bundle[] arrayOfBundle = new Bundle[i];
    for (paramInt = 0; paramInt < i; paramInt++) {
      arrayOfString[paramInt] = (String)this.e.b(paramInt);
      arrayOfBundle[paramInt] = (Bundle)this.e.d(paramInt);
    } 
    paramParcel.writeStringArray(arrayOfString);
    paramParcel.writeTypedArray((Parcelable[])arrayOfBundle, 0);
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<a> {
    public a createFromParcel(Parcel param1Parcel) {
      return new a(param1Parcel, null, null);
    }
    
    public a createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new a(param1Parcel, param1ClassLoader, null);
    }
    
    public a[] newArray(int param1Int) {
      return new a[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/b0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */