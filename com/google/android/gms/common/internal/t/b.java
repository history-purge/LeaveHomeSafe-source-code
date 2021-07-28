package com.google.android.gms.common.internal.t;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

public class b {
  @RecentlyNonNull
  public static int a(@RecentlyNonNull int paramInt) {
    return paramInt & 0xFFFF;
  }
  
  @RecentlyNonNull
  public static int a(@RecentlyNonNull Parcel paramParcel) {
    return paramParcel.readInt();
  }
  
  @RecentlyNonNull
  public static Bundle a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Bundle bundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i + paramInt);
    return bundle;
  }
  
  @RecentlyNonNull
  public static <T extends Parcelable> T a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull Parcelable.Creator<T> paramCreator) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Parcelable parcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return (T)parcelable;
  }
  
  private static void a(Parcel paramParcel, int paramInt1, int paramInt2) {
    paramInt1 = o(paramParcel, paramInt1);
    if (paramInt1 == paramInt2)
      return; 
    String str = Integer.toHexString(paramInt1);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    stringBuilder.append("Expected size ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" got ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" (0x");
    stringBuilder.append(str);
    stringBuilder.append(")");
    throw new a(stringBuilder.toString(), paramParcel);
  }
  
  @RecentlyNonNull
  public static int b(@RecentlyNonNull Parcel paramParcel) {
    int j = a(paramParcel);
    int k = o(paramParcel, j);
    int i = paramParcel.dataPosition();
    if (a(j) != 20293) {
      String str = String.valueOf(Integer.toHexString(j));
      if (str.length() != 0) {
        str = "Expected object header. Got 0x".concat(str);
      } else {
        str = new String("Expected object header. Got 0x");
      } 
      throw new a(str, paramParcel);
    } 
    j = k + i;
    if (j >= i && j <= paramParcel.dataSize())
      return j; 
    StringBuilder stringBuilder = new StringBuilder(54);
    stringBuilder.append("Size read is invalid start=");
    stringBuilder.append(i);
    stringBuilder.append(" end=");
    stringBuilder.append(j);
    throw new a(stringBuilder.toString(), paramParcel);
  }
  
  @RecentlyNonNull
  public static byte[] b(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfByte;
  }
  
  @RecentlyNonNull
  public static <T> T[] b(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull Parcelable.Creator<T> paramCreator) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return (T[])arrayOfObject;
  }
  
  @RecentlyNonNull
  public static <T> ArrayList<T> c(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull Parcelable.Creator<T> paramCreator) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    ArrayList<T> arrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return arrayList;
  }
  
  @RecentlyNonNull
  public static byte[][] c(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = o(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    int k = paramParcel.readInt();
    byte[][] arrayOfByte = new byte[k][];
    for (paramInt = 0; paramInt < k; paramInt++)
      arrayOfByte[paramInt] = paramParcel.createByteArray(); 
    paramParcel.setDataPosition(j + i);
    return arrayOfByte;
  }
  
  @RecentlyNonNull
  public static int[] d(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfInt;
  }
  
  @RecentlyNonNull
  public static String e(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + paramInt);
    return str;
  }
  
  @RecentlyNonNull
  public static String[] f(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    String[] arrayOfString = paramParcel.createStringArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfString;
  }
  
  @RecentlyNonNull
  public static ArrayList<String> g(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    ArrayList<String> arrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(i + paramInt);
    return arrayList;
  }
  
  public static void h(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    if (paramParcel.dataPosition() == paramInt)
      return; 
    StringBuilder stringBuilder = new StringBuilder(37);
    stringBuilder.append("Overread allowed size end=");
    stringBuilder.append(paramInt);
    throw new a(stringBuilder.toString(), paramParcel);
  }
  
  @RecentlyNonNull
  public static boolean i(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    a(paramParcel, paramInt, 4);
    return (paramParcel.readInt() != 0);
  }
  
  @RecentlyNonNull
  public static double j(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    a(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }
  
  @RecentlyNonNull
  public static float k(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    a(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  @RecentlyNonNull
  public static IBinder l(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    IBinder iBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + paramInt);
    return iBinder;
  }
  
  @RecentlyNonNull
  public static int m(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  @RecentlyNonNull
  public static long n(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    a(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  @RecentlyNonNull
  public static int o(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    return ((paramInt & 0xFFFF0000) != -65536) ? (paramInt >> 16 & 0xFFFF) : paramParcel.readInt();
  }
  
  public static void p(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = o(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static class a extends RuntimeException {
    public a(@RecentlyNonNull String param1String, @RecentlyNonNull Parcel param1Parcel) {
      super(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */