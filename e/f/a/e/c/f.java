package e.f.a.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.i.d.m5;
import e.f.a.e.i.d.x5;
import e.f.a.e.j.a;
import java.util.Arrays;

public final class f extends a {
  public static final Parcelable.Creator<f> CREATOR = new g();
  
  public x5 c;
  
  public byte[] d;
  
  private int[] e;
  
  private String[] f;
  
  private int[] g;
  
  private byte[][] h;
  
  private a[] i;
  
  private boolean j;
  
  public final m5 k;
  
  public final a.c l;
  
  public final a.c m;
  
  public f(x5 paramx5, m5 paramm5, a.c paramc1, a.c paramc2, int[] paramArrayOfint1, String[] paramArrayOfString, int[] paramArrayOfint2, byte[][] paramArrayOfbyte, a[] paramArrayOfa, boolean paramBoolean) {
    this.c = paramx5;
    this.k = paramm5;
    this.l = paramc1;
    this.m = null;
    this.e = paramArrayOfint1;
    this.f = null;
    this.g = paramArrayOfint2;
    this.h = null;
    this.i = null;
    this.j = paramBoolean;
  }
  
  f(x5 paramx5, byte[] paramArrayOfbyte, int[] paramArrayOfint1, String[] paramArrayOfString, int[] paramArrayOfint2, byte[][] paramArrayOfbyte1, boolean paramBoolean, a[] paramArrayOfa) {
    this.c = paramx5;
    this.d = paramArrayOfbyte;
    this.e = paramArrayOfint1;
    this.f = paramArrayOfString;
    this.k = null;
    this.l = null;
    this.m = null;
    this.g = paramArrayOfint2;
    this.h = paramArrayOfbyte1;
    this.i = paramArrayOfa;
    this.j = paramBoolean;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      if (o.a(this.c, ((f)paramObject).c) && Arrays.equals(this.d, ((f)paramObject).d) && Arrays.equals(this.e, ((f)paramObject).e) && Arrays.equals((Object[])this.f, (Object[])((f)paramObject).f) && o.a(this.k, ((f)paramObject).k) && o.a(this.l, ((f)paramObject).l) && o.a(this.m, ((f)paramObject).m) && Arrays.equals(this.g, ((f)paramObject).g) && Arrays.deepEquals((Object[])this.h, (Object[])((f)paramObject).h) && Arrays.equals((Object[])this.i, (Object[])((f)paramObject).i) && this.j == ((f)paramObject).j)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return o.a(new Object[] { 
          this.c, this.d, this.e, this.f, this.k, this.l, this.m, this.g, this.h, this.i, 
          Boolean.valueOf(this.j) });
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
    stringBuilder.append(this.c);
    stringBuilder.append(", LogEventBytes: ");
    byte[] arrayOfByte = this.d;
    if (arrayOfByte == null) {
      arrayOfByte = null;
    } else {
      str = new String(arrayOfByte);
    } 
    stringBuilder.append(str);
    stringBuilder.append(", TestCodes: ");
    stringBuilder.append(Arrays.toString(this.e));
    stringBuilder.append(", MendelPackages: ");
    stringBuilder.append(Arrays.toString((Object[])this.f));
    stringBuilder.append(", LogEvent: ");
    stringBuilder.append(this.k);
    stringBuilder.append(", ExtensionProducer: ");
    stringBuilder.append(this.l);
    stringBuilder.append(", VeProducer: ");
    stringBuilder.append(this.m);
    stringBuilder.append(", ExperimentIDs: ");
    stringBuilder.append(Arrays.toString(this.g));
    stringBuilder.append(", ExperimentTokens: ");
    stringBuilder.append(Arrays.toString((Object[])this.h));
    stringBuilder.append(", ExperimentTokensParcelables: ");
    stringBuilder.append(Arrays.toString((Object[])this.i));
    stringBuilder.append(", AddPhenotypeExperimentTokens: ");
    stringBuilder.append(this.j);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    c.a(paramParcel, 3, this.d, false);
    c.a(paramParcel, 4, this.e, false);
    c.a(paramParcel, 5, this.f, false);
    c.a(paramParcel, 6, this.g, false);
    c.a(paramParcel, 7, this.h, false);
    c.a(paramParcel, 8, this.j);
    c.a(paramParcel, 9, (Parcelable[])this.i, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */