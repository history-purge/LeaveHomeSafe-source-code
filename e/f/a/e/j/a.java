package e.f.a.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a extends a {
  public static final Parcelable.Creator<a> CREATOR = new g();
  
  private static final byte[][] k = new byte[0][];
  
  private final String c;
  
  private final byte[] d;
  
  private final byte[][] e;
  
  private final byte[][] f;
  
  private final byte[][] g;
  
  private final byte[][] h;
  
  private final int[] i;
  
  private final byte[][] j;
  
  static {
    byte[][] arrayOfByte = k;
    new a("", null, arrayOfByte, arrayOfByte, arrayOfByte, arrayOfByte, null, null);
    new c();
    new d();
    new e();
    new f();
  }
  
  public a(String paramString, byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1, byte[][] paramArrayOfbyte2, byte[][] paramArrayOfbyte3, byte[][] paramArrayOfbyte4, int[] paramArrayOfint, byte[][] paramArrayOfbyte5) {
    this.c = paramString;
    this.d = paramArrayOfbyte;
    this.e = paramArrayOfbyte1;
    this.f = paramArrayOfbyte2;
    this.g = paramArrayOfbyte3;
    this.h = paramArrayOfbyte4;
    this.i = paramArrayOfint;
    this.j = paramArrayOfbyte5;
  }
  
  private static List<Integer> a(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return Collections.emptyList(); 
    ArrayList<Integer> arrayList = new ArrayList(paramArrayOfint.length);
    int j = paramArrayOfint.length;
    for (int i = 0; i < j; i++)
      arrayList.add(Integer.valueOf(paramArrayOfint[i])); 
    Collections.sort(arrayList);
    return arrayList;
  }
  
  private static List<String> a(byte[][] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return Collections.emptyList(); 
    ArrayList<String> arrayList = new ArrayList(paramArrayOfbyte.length);
    int j = paramArrayOfbyte.length;
    for (int i = 0; i < j; i++)
      arrayList.add(Base64.encodeToString(paramArrayOfbyte[i], 3)); 
    Collections.sort(arrayList);
    return arrayList;
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, byte[][] paramArrayOfbyte) {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append("=");
    if (paramArrayOfbyte == null) {
      paramString = "null";
    } else {
      paramStringBuilder.append("(");
      int j = paramArrayOfbyte.length;
      int i = 0;
      boolean bool;
      for (bool = true; i < j; bool = false) {
        byte[] arrayOfByte = paramArrayOfbyte[i];
        if (!bool)
          paramStringBuilder.append(", "); 
        paramStringBuilder.append("'");
        paramStringBuilder.append(Base64.encodeToString(arrayOfByte, 3));
        paramStringBuilder.append("'");
        i++;
      } 
      paramString = ")";
    } 
    paramStringBuilder.append(paramString);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof a) {
      paramObject = paramObject;
      if (i.a(this.c, ((a)paramObject).c) && Arrays.equals(this.d, ((a)paramObject).d) && i.a(a(this.e), a(((a)paramObject).e)) && i.a(a(this.f), a(((a)paramObject).f)) && i.a(a(this.g), a(((a)paramObject).g)) && i.a(a(this.h), a(((a)paramObject).h)) && i.a(a(this.i), a(((a)paramObject).i)) && i.a(a(this.j), a(((a)paramObject).j)))
        return true; 
    } 
    return false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
    stringBuilder.append("(");
    String str = this.c;
    if (str == null) {
      str = "null";
    } else {
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 2);
      stringBuilder1.append("'");
      stringBuilder1.append(str);
      stringBuilder1.append("'");
      str = stringBuilder1.toString();
    } 
    stringBuilder.append(str);
    stringBuilder.append(", ");
    byte[] arrayOfByte = this.d;
    stringBuilder.append("direct");
    stringBuilder.append("=");
    if (arrayOfByte == null) {
      stringBuilder.append("null");
    } else {
      stringBuilder.append("'");
      stringBuilder.append(Base64.encodeToString(arrayOfByte, 3));
      stringBuilder.append("'");
    } 
    stringBuilder.append(", ");
    a(stringBuilder, "GAIA", this.e);
    stringBuilder.append(", ");
    a(stringBuilder, "PSEUDO", this.f);
    stringBuilder.append(", ");
    a(stringBuilder, "ALWAYS", this.g);
    stringBuilder.append(", ");
    a(stringBuilder, "OTHER", this.h);
    stringBuilder.append(", ");
    int[] arrayOfInt = this.i;
    stringBuilder.append("weak");
    stringBuilder.append("=");
    if (arrayOfInt == null) {
      stringBuilder.append("null");
    } else {
      stringBuilder.append("(");
      int j = arrayOfInt.length;
      int i = 0;
      for (boolean bool = true; i < j; bool = false) {
        int k = arrayOfInt[i];
        if (!bool)
          stringBuilder.append(", "); 
        stringBuilder.append(k);
        i++;
      } 
      stringBuilder.append(")");
    } 
    stringBuilder.append(", ");
    a(stringBuilder, "directs", this.j);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, this.c, false);
    c.a(paramParcel, 3, this.d, false);
    c.a(paramParcel, 4, this.e, false);
    c.a(paramParcel, 5, this.f, false);
    c.a(paramParcel, 6, this.g, false);
    c.a(paramParcel, 7, this.h, false);
    c.a(paramParcel, 8, this.i, false);
    c.a(paramParcel, 9, this.j, false);
    c.a(paramParcel, paramInt);
  }
  
  private static interface a {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */