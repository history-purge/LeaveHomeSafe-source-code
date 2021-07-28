package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class u implements Parcelable {
  public static final Parcelable.Creator<u> CREATOR = new a();
  
  final String c;
  
  final String d;
  
  final boolean e;
  
  final int f;
  
  final int g;
  
  final String h;
  
  final boolean i;
  
  final boolean j;
  
  final boolean k;
  
  final Bundle l;
  
  final boolean m;
  
  final int n;
  
  Bundle o;
  
  u(Parcel paramParcel) {
    boolean bool1;
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool2 = true;
    if (i != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.e = bool1;
    this.f = paramParcel.readInt();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.i = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.j = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.k = bool1;
    this.l = paramParcel.readBundle();
    if (paramParcel.readInt() != 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    this.m = bool1;
    this.o = paramParcel.readBundle();
    this.n = paramParcel.readInt();
  }
  
  u(Fragment paramFragment) {
    this.c = paramFragment.getClass().getName();
    this.d = paramFragment.h;
    this.e = paramFragment.p;
    this.f = paramFragment.y;
    this.g = paramFragment.z;
    this.h = paramFragment.A;
    this.i = paramFragment.D;
    this.j = paramFragment.o;
    this.k = paramFragment.C;
    this.l = paramFragment.i;
    this.m = paramFragment.B;
    this.n = paramFragment.S.ordinal();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentState{");
    stringBuilder.append(this.c);
    stringBuilder.append(" (");
    stringBuilder.append(this.d);
    stringBuilder.append(")}:");
    if (this.e)
      stringBuilder.append(" fromLayout"); 
    if (this.g != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.g));
    } 
    String str = this.h;
    if (str != null && !str.isEmpty()) {
      stringBuilder.append(" tag=");
      stringBuilder.append(this.h);
    } 
    if (this.i)
      stringBuilder.append(" retainInstance"); 
    if (this.j)
      stringBuilder.append(" removing"); 
    if (this.k)
      stringBuilder.append(" detached"); 
    if (this.m)
      stringBuilder.append(" hidden"); 
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  class a implements Parcelable.Creator<u> {
    public u createFromParcel(Parcel param1Parcel) {
      return new u(param1Parcel);
    }
    
    public u[] newArray(int param1Int) {
      return new u[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */