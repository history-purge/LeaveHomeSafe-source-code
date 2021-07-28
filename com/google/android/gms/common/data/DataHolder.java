package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends a implements Closeable {
  @RecentlyNonNull
  public static final Parcelable.Creator<DataHolder> CREATOR = new b();
  
  private final int c;
  
  private final String[] d;
  
  private Bundle e;
  
  private final CursorWindow[] f;
  
  private final int g;
  
  private final Bundle h;
  
  private int[] i;
  
  private boolean j = false;
  
  private boolean k = true;
  
  static {
    new a(new String[0], null);
  }
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle) {
    this.c = paramInt1;
    this.d = paramArrayOfString;
    this.f = paramArrayOfCursorWindow;
    this.g = paramInt2;
    this.h = paramBundle;
  }
  
  @RecentlyNullable
  public final Bundle b() {
    return this.h;
  }
  
  @RecentlyNonNull
  public final int c() {
    return this.g;
  }
  
  public final void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Z
    //   6: ifne -> 41
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield j : Z
    //   14: iconst_0
    //   15: istore_1
    //   16: iload_1
    //   17: aload_0
    //   18: getfield f : [Landroid/database/CursorWindow;
    //   21: arraylength
    //   22: if_icmpge -> 41
    //   25: aload_0
    //   26: getfield f : [Landroid/database/CursorWindow;
    //   29: iload_1
    //   30: aaload
    //   31: invokevirtual close : ()V
    //   34: iload_1
    //   35: iconst_1
    //   36: iadd
    //   37: istore_1
    //   38: goto -> 16
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_2
    //   45: aload_0
    //   46: monitorexit
    //   47: goto -> 52
    //   50: aload_2
    //   51: athrow
    //   52: goto -> 50
    // Exception table:
    //   from	to	target	type
    //   2	14	44	finally
    //   16	34	44	finally
    //   41	43	44	finally
    //   45	47	44	finally
  }
  
  public final void d() {
    this.e = new Bundle();
    int j = 0;
    int i = 0;
    while (true) {
      String[] arrayOfString = this.d;
      if (i < arrayOfString.length) {
        this.e.putInt(arrayOfString[i], i);
        i++;
        continue;
      } 
      this.i = new int[this.f.length];
      int k = 0;
      i = j;
      while (true) {
        CursorWindow[] arrayOfCursorWindow = this.f;
        if (i < arrayOfCursorWindow.length) {
          this.i[i] = k;
          j = arrayOfCursorWindow[i].getStartPosition();
          k += this.f[i].getNumRows() - k - j;
          i++;
          continue;
        } 
        break;
      } 
      return;
    } 
  }
  
  protected final void finalize() {
    try {
      if (this.k && this.f.length > 0 && !isClosed()) {
        close();
        String str = toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 178);
        stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
        stringBuilder.append(str);
        stringBuilder.append(")");
        Log.e("DataBuffer", stringBuilder.toString());
      } 
      return;
    } finally {
      super.finalize();
    } 
  }
  
  @RecentlyNonNull
  public final boolean isClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	11	finally
    //   12	14	11	finally
  }
  
  public final void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.d, false);
    c.a(paramParcel, 2, (Parcelable[])this.f, paramInt, false);
    c.a(paramParcel, 3, c());
    c.a(paramParcel, 4, b(), false);
    c.a(paramParcel, 1000, this.c);
    c.a(paramParcel, i);
    if ((paramInt & 0x1) != 0)
      close(); 
  }
  
  public static class a {
    private a(String[] param1ArrayOfString, String param1String) {
      q.a(param1ArrayOfString);
      param1ArrayOfString = param1ArrayOfString;
      new ArrayList();
      new HashMap<Object, Object>();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/data/DataHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */