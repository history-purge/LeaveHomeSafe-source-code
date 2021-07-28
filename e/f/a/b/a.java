package e.f.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.d.h;

public class a implements Comparable<a>, Parcelable {
  public static final Parcelable.Creator<a> CREATOR;
  
  private static final h<h<a>> e = new h(16);
  
  private final int c;
  
  private final int d;
  
  static {
    CREATOR = new a();
  }
  
  private a(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  private static int a(int paramInt1, int paramInt2) {
    while (true) {
      int i = paramInt1;
      paramInt1 = paramInt2;
      if (paramInt1 != 0) {
        paramInt2 = i % paramInt1;
        continue;
      } 
      return i;
    } 
  }
  
  public static a a(String paramString) {
    int i = paramString.indexOf(':');
    if (i != -1)
      try {
        return b(Integer.parseInt(paramString.substring(0, i)), Integer.parseInt(paramString.substring(i + 1)));
      } catch (NumberFormatException numberFormatException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Malformed aspect ratio: ");
        stringBuilder1.append(paramString);
        throw new IllegalArgumentException(stringBuilder1.toString(), numberFormatException);
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Malformed aspect ratio: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static a b(int paramInt1, int paramInt2) {
    int i = a(paramInt1, paramInt2);
    paramInt1 /= i;
    paramInt2 /= i;
    h h1 = (h)e.a(paramInt1);
    if (h1 == null) {
      a a3 = new a(paramInt1, paramInt2);
      h h2 = new h();
      h2.c(paramInt2, a3);
      e.c(paramInt1, h2);
      return a3;
    } 
    a a2 = (a)h1.a(paramInt2);
    a a1 = a2;
    if (a2 == null) {
      a1 = new a(paramInt1, paramInt2);
      h1.c(paramInt2, a1);
    } 
    return a1;
  }
  
  public int a(a parama) {
    return equals(parama) ? 0 : ((t() - parama.t() > 0.0F) ? 1 : -1);
  }
  
  public boolean a(j paramj) {
    int k = a(paramj.r(), paramj.q());
    int i = paramj.r() / k;
    k = paramj.q() / k;
    return (this.c == i && this.d == k);
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
    if (paramObject instanceof a) {
      paramObject = paramObject;
      bool1 = bool2;
      if (this.c == ((a)paramObject).c) {
        bool1 = bool2;
        if (this.d == ((a)paramObject).d)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    int i = this.d;
    int j = this.c;
    return i ^ (j >>> 16 | j << 16);
  }
  
  public int q() {
    return this.c;
  }
  
  public int r() {
    return this.d;
  }
  
  public a s() {
    return b(this.d, this.c);
  }
  
  public float t() {
    return this.c / this.d;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c);
    stringBuilder.append(":");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
  }
  
  class a implements Parcelable.Creator<a> {
    public a createFromParcel(Parcel param1Parcel) {
      return a.b(param1Parcel.readInt(), param1Parcel.readInt());
    }
    
    public a[] newArray(int param1Int) {
      return new a[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */