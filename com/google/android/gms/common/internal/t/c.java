package com.google.android.gms.common.internal.t;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public class c {
  @RecentlyNonNull
  public static int a(@RecentlyNonNull Parcel paramParcel) {
    return b(paramParcel, 20293);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull double paramDouble) {
    b(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull float paramFloat) {
    b(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2) {
    b(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull long paramLong) {
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull Bundle paramBundle, @RecentlyNonNull boolean paramBoolean) {
    if (paramBundle == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull IBinder paramIBinder, @RecentlyNonNull boolean paramBoolean) {
    if (paramIBinder == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt1, @RecentlyNonNull Parcelable paramParcelable, @RecentlyNonNull int paramInt2, @RecentlyNonNull boolean paramBoolean) {
    if (paramParcelable == null) {
      if (paramBoolean)
        b(paramParcel, paramInt1, 0); 
      return;
    } 
    paramInt1 = b(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    c(paramParcel, paramInt1);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull String paramString, @RecentlyNonNull boolean paramBoolean) {
    if (paramString == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull List<String> paramList, @RecentlyNonNull boolean paramBoolean) {
    if (paramList == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull boolean paramBoolean) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull byte[] paramArrayOfbyte, @RecentlyNonNull boolean paramBoolean) {
    if (paramArrayOfbyte == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfbyte);
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull int[] paramArrayOfint, @RecentlyNonNull boolean paramBoolean) {
    if (paramArrayOfint == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfint);
    c(paramParcel, paramInt);
  }
  
  public static <T extends Parcelable> void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt1, @RecentlyNonNull T[] paramArrayOfT, @RecentlyNonNull int paramInt2, @RecentlyNonNull boolean paramBoolean) {
    if (paramArrayOfT == null) {
      if (paramBoolean)
        b(paramParcel, paramInt1, 0); 
      return;
    } 
    int i = b(paramParcel, paramInt1);
    int j = paramArrayOfT.length;
    paramParcel.writeInt(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
      T t = paramArrayOfT[paramInt1];
      if (t == null) {
        paramParcel.writeInt(0);
      } else {
        a(paramParcel, t, paramInt2);
      } 
    } 
    c(paramParcel, i);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull String[] paramArrayOfString, @RecentlyNonNull boolean paramBoolean) {
    if (paramArrayOfString == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    c(paramParcel, paramInt);
  }
  
  public static void a(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull byte[][] paramArrayOfbyte, @RecentlyNonNull boolean paramBoolean) {
    boolean bool = false;
    if (paramArrayOfbyte == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    int i = b(paramParcel, paramInt);
    int j = paramArrayOfbyte.length;
    paramParcel.writeInt(j);
    for (paramInt = bool; paramInt < j; paramInt++)
      paramParcel.writeByteArray(paramArrayOfbyte[paramInt]); 
    c(paramParcel, i);
  }
  
  private static <T extends Parcelable> void a(Parcel paramParcel, T paramT, int paramInt) {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
  
  private static int b(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  private static void b(Parcel paramParcel, int paramInt1, int paramInt2) {
    if (paramInt2 >= 65535) {
      paramParcel.writeInt(paramInt1 | 0xFFFF0000);
      paramParcel.writeInt(paramInt2);
      return;
    } 
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  public static <T extends Parcelable> void b(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt, @RecentlyNonNull List<T> paramList, @RecentlyNonNull boolean paramBoolean) {
    if (paramList == null) {
      if (paramBoolean)
        b(paramParcel, paramInt, 0); 
      return;
    } 
    int i = b(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++) {
      Parcelable parcelable = (Parcelable)paramList.get(paramInt);
      if (parcelable == null) {
        paramParcel.writeInt(0);
      } else {
        a(paramParcel, parcelable, 0);
      } 
    } 
    c(paramParcel, i);
  }
  
  private static void c(Parcel paramParcel, int paramInt) {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/t/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */