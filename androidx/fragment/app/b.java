package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
  public static final Parcelable.Creator<b> CREATOR = new a();
  
  final int[] c;
  
  final ArrayList<String> d;
  
  final int[] e;
  
  final int[] f;
  
  final int g;
  
  final String h;
  
  final int i;
  
  final int j;
  
  final CharSequence k;
  
  final int l;
  
  final CharSequence m;
  
  final ArrayList<String> n;
  
  final ArrayList<String> o;
  
  final boolean p;
  
  public b(Parcel paramParcel) {
    boolean bool;
    this.c = paramParcel.createIntArray();
    this.d = paramParcel.createStringArrayList();
    this.e = paramParcel.createIntArray();
    this.f = paramParcel.createIntArray();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readString();
    this.i = paramParcel.readInt();
    this.j = paramParcel.readInt();
    this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.l = paramParcel.readInt();
    this.m = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.n = paramParcel.createStringArrayList();
    this.o = paramParcel.createStringArrayList();
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool;
  }
  
  public b(a parama) {
    int i = parama.a.size();
    this.c = new int[i * 5];
    if (parama.g) {
      this.d = new ArrayList<String>(i);
      this.e = new int[i];
      this.f = new int[i];
      int j = 0;
      for (int k = 0; j < i; k++) {
        x.a a1 = parama.a.get(j);
        int[] arrayOfInt2 = this.c;
        int m = k + 1;
        arrayOfInt2[k] = a1.a;
        ArrayList<String> arrayList = this.d;
        Fragment fragment = a1.b;
        if (fragment != null) {
          String str = fragment.h;
        } else {
          fragment = null;
        } 
        arrayList.add(fragment);
        int[] arrayOfInt1 = this.c;
        k = m + 1;
        arrayOfInt1[m] = a1.c;
        m = k + 1;
        arrayOfInt1[k] = a1.d;
        k = m + 1;
        arrayOfInt1[m] = a1.e;
        arrayOfInt1[k] = a1.f;
        this.e[j] = a1.g.ordinal();
        this.f[j] = a1.h.ordinal();
        j++;
      } 
      this.g = parama.f;
      this.h = parama.i;
      this.i = parama.t;
      this.j = parama.j;
      this.k = parama.k;
      this.l = parama.l;
      this.m = parama.m;
      this.n = parama.n;
      this.o = parama.o;
      this.p = parama.p;
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Not on back stack");
    throw illegalStateException;
  }
  
  public a a(n paramn) {
    a a = new a(paramn);
    int j = 0;
    int i = 0;
    while (j < this.c.length) {
      x.a a1 = new x.a();
      int[] arrayOfInt2 = this.c;
      int k = j + 1;
      a1.a = arrayOfInt2[j];
      if (n.d(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instantiate ");
        stringBuilder.append(a);
        stringBuilder.append(" op #");
        stringBuilder.append(i);
        stringBuilder.append(" base fragment #");
        stringBuilder.append(this.c[k]);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      String str = this.d.get(i);
      if (str != null) {
        Fragment fragment = paramn.b(str);
      } else {
        str = null;
      } 
      a1.b = (Fragment)str;
      a1.g = g.c.values()[this.e[i]];
      a1.h = g.c.values()[this.f[i]];
      int[] arrayOfInt1 = this.c;
      j = k + 1;
      a1.c = arrayOfInt1[k];
      k = j + 1;
      a1.d = arrayOfInt1[j];
      j = k + 1;
      a1.e = arrayOfInt1[k];
      a1.f = arrayOfInt1[j];
      a.b = a1.c;
      a.c = a1.d;
      a.d = a1.e;
      a.e = a1.f;
      a.a(a1);
      i++;
      j++;
    } 
    a.f = this.g;
    a.i = this.h;
    a.t = this.i;
    a.g = true;
    a.j = this.j;
    a.k = this.k;
    a.l = this.l;
    a.m = this.m;
    a.n = this.n;
    a.o = this.o;
    a.p = this.p;
    a.b(1);
    return a;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  class a implements Parcelable.Creator<b> {
    public b createFromParcel(Parcel param1Parcel) {
      return new b(param1Parcel);
    }
    
    public b[] newArray(int param1Int) {
      return new b[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */