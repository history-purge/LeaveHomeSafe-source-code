package e.f.a.b;

import android.os.Parcel;
import android.os.Parcelable;

public class j implements Comparable<j>, Parcelable {
  public static final Parcelable.Creator<j> CREATOR = new a();
  
  private final int c;
  
  private final int d;
  
  public j(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public static j a(String paramString) {
    int i = paramString.indexOf('x');
    if (i != -1)
      try {
        return new j(Integer.parseInt(paramString.substring(0, i)), Integer.parseInt(paramString.substring(i + 1)));
      } catch (NumberFormatException numberFormatException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Malformed size: ");
        stringBuilder1.append(paramString);
        throw new IllegalArgumentException(stringBuilder1.toString(), numberFormatException);
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Malformed size: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a(j paramj) {
    return this.c * this.d - paramj.c * paramj.d;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool2 = false;
    if (paramObject == null)
      return false; 
    if (this == paramObject)
      return true; 
    boolean bool1 = bool2;
    if (paramObject instanceof j) {
      paramObject = paramObject;
      bool1 = bool2;
      if (this.c == ((j)paramObject).c) {
        bool1 = bool2;
        if (this.d == ((j)paramObject).d)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    int i = this.d;
    int k = this.c;
    return i ^ (k >>> 16 | k << 16);
  }
  
  public int q() {
    return this.d;
  }
  
  public int r() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c);
    stringBuilder.append("x");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
  }
  
  class a implements Parcelable.Creator<j> {
    public j createFromParcel(Parcel param1Parcel) {
      return new j(param1Parcel.readInt(), param1Parcel.readInt());
    }
    
    public j[] newArray(int param1Int) {
      return new j[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */