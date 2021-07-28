package e.f.a.e.n.d;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.t.a;

public class a extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<a> CREATOR = new d();
  
  public int c;
  
  @RecentlyNonNull
  public String d;
  
  @RecentlyNonNull
  public String e;
  
  public int f;
  
  @RecentlyNonNull
  public Point[] g;
  
  @RecentlyNonNull
  public f h;
  
  @RecentlyNonNull
  public i i;
  
  @RecentlyNonNull
  public j j;
  
  @RecentlyNonNull
  public l k;
  
  @RecentlyNonNull
  public k l;
  
  @RecentlyNonNull
  public g m;
  
  @RecentlyNonNull
  public c n;
  
  @RecentlyNonNull
  public d o;
  
  @RecentlyNonNull
  public e p;
  
  @RecentlyNonNull
  public byte[] q;
  
  public boolean r;
  
  public a() {}
  
  public a(int paramInt1, @RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, int paramInt2, @RecentlyNonNull Point[] paramArrayOfPoint, @RecentlyNonNull f paramf, @RecentlyNonNull i parami, @RecentlyNonNull j paramj, @RecentlyNonNull l paraml, @RecentlyNonNull k paramk, @RecentlyNonNull g paramg, @RecentlyNonNull c paramc, @RecentlyNonNull d paramd, @RecentlyNonNull e parame, @RecentlyNonNull byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.c = paramInt1;
    this.d = paramString1;
    this.q = paramArrayOfbyte;
    this.e = paramString2;
    this.f = paramInt2;
    this.g = paramArrayOfPoint;
    this.r = paramBoolean;
    this.h = paramf;
    this.i = parami;
    this.j = paramj;
    this.k = paraml;
    this.l = paramk;
    this.m = paramg;
    this.n = paramc;
    this.o = paramd;
    this.p = parame;
  }
  
  @RecentlyNonNull
  public Rect b() {
    int i3 = Integer.MAX_VALUE;
    int n = 0;
    int i2 = Integer.MAX_VALUE;
    int i1 = Integer.MIN_VALUE;
    int m = Integer.MIN_VALUE;
    while (true) {
      Point[] arrayOfPoint = this.g;
      if (n < arrayOfPoint.length) {
        Point point = arrayOfPoint[n];
        i3 = Math.min(i3, point.x);
        i1 = Math.max(i1, point.x);
        i2 = Math.min(i2, point.y);
        m = Math.max(m, point.y);
        n++;
        continue;
      } 
      return new Rect(i3, i2, i1, m);
    } 
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, int paramInt) {
    int m = com.google.android.gms.common.internal.t.c.a(paramParcel);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 2, this.c);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 3, this.d, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 4, this.e, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 5, this.f);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 6, (Parcelable[])this.g, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 7, (Parcelable)this.h, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 8, (Parcelable)this.i, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 9, (Parcelable)this.j, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 10, (Parcelable)this.k, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 11, (Parcelable)this.l, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 12, (Parcelable)this.m, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 13, (Parcelable)this.n, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 14, (Parcelable)this.o, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 15, (Parcelable)this.p, paramInt, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 16, this.q, false);
    com.google.android.gms.common.internal.t.c.a(paramParcel, 17, this.r);
    com.google.android.gms.common.internal.t.c.a(paramParcel, m);
  }
  
  public static class a extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new c();
    
    public int c;
    
    @RecentlyNonNull
    public String[] d;
    
    public a() {}
    
    public a(int param1Int, @RecentlyNonNull String[] param1ArrayOfString) {
      this.c = param1Int;
      this.d = param1ArrayOfString;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class b extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new f();
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    public int h;
    
    public boolean i;
    
    @RecentlyNonNull
    public String j;
    
    public b() {}
    
    public b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, boolean param1Boolean, @RecentlyNonNull String param1String) {
      this.c = param1Int1;
      this.d = param1Int2;
      this.e = param1Int3;
      this.f = param1Int4;
      this.g = param1Int5;
      this.h = param1Int6;
      this.i = param1Boolean;
      this.j = param1String;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 5, this.f);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 6, this.g);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 7, this.h);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 8, this.i);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 9, this.j, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class c extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new h();
    
    @RecentlyNonNull
    public String c;
    
    @RecentlyNonNull
    public String d;
    
    @RecentlyNonNull
    public String e;
    
    @RecentlyNonNull
    public String f;
    
    @RecentlyNonNull
    public String g;
    
    @RecentlyNonNull
    public a.b h;
    
    @RecentlyNonNull
    public a.b i;
    
    public c() {}
    
    public c(@RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2, @RecentlyNonNull String param1String3, @RecentlyNonNull String param1String4, @RecentlyNonNull String param1String5, @RecentlyNonNull a.b param1b1, @RecentlyNonNull a.b param1b2) {
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
      this.g = param1String5;
      this.h = param1b1;
      this.i = param1b2;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      int i = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 5, this.f, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 6, this.g, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 7, (Parcelable)this.h, param1Int, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 8, (Parcelable)this.i, param1Int, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, i);
    }
  }
  
  public static class d extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new g();
    
    @RecentlyNonNull
    public a.h c;
    
    @RecentlyNonNull
    public String d;
    
    @RecentlyNonNull
    public String e;
    
    @RecentlyNonNull
    public a.i[] f;
    
    @RecentlyNonNull
    public a.f[] g;
    
    @RecentlyNonNull
    public String[] h;
    
    @RecentlyNonNull
    public a.a[] i;
    
    public d() {}
    
    public d(@RecentlyNonNull a.h param1h, @RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2, @RecentlyNonNull a.i[] param1ArrayOfi, @RecentlyNonNull a.f[] param1ArrayOff, @RecentlyNonNull String[] param1ArrayOfString, @RecentlyNonNull a.a[] param1ArrayOfa) {
      this.c = param1h;
      this.d = param1String1;
      this.e = param1String2;
      this.f = param1ArrayOfi;
      this.g = param1ArrayOff;
      this.h = param1ArrayOfString;
      this.i = param1ArrayOfa;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      int j = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, (Parcelable)this.c, param1Int, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 5, (Parcelable[])this.f, param1Int, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 6, (Parcelable[])this.g, param1Int, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 7, this.h, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 8, (Parcelable[])this.i, param1Int, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, j);
    }
  }
  
  public static class e extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new j();
    
    @RecentlyNonNull
    public String c;
    
    @RecentlyNonNull
    public String d;
    
    @RecentlyNonNull
    public String e;
    
    @RecentlyNonNull
    public String f;
    
    @RecentlyNonNull
    public String g;
    
    @RecentlyNonNull
    public String h;
    
    @RecentlyNonNull
    public String i;
    
    @RecentlyNonNull
    public String j;
    
    @RecentlyNonNull
    public String k;
    
    @RecentlyNonNull
    public String l;
    
    @RecentlyNonNull
    public String m;
    
    @RecentlyNonNull
    public String n;
    
    @RecentlyNonNull
    public String o;
    
    @RecentlyNonNull
    public String p;
    
    public e() {}
    
    public e(@RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2, @RecentlyNonNull String param1String3, @RecentlyNonNull String param1String4, @RecentlyNonNull String param1String5, @RecentlyNonNull String param1String6, @RecentlyNonNull String param1String7, @RecentlyNonNull String param1String8, @RecentlyNonNull String param1String9, @RecentlyNonNull String param1String10, @RecentlyNonNull String param1String11, @RecentlyNonNull String param1String12, @RecentlyNonNull String param1String13, @RecentlyNonNull String param1String14) {
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
      this.g = param1String5;
      this.h = param1String6;
      this.i = param1String7;
      this.j = param1String8;
      this.k = param1String9;
      this.l = param1String10;
      this.m = param1String11;
      this.n = param1String12;
      this.o = param1String13;
      this.p = param1String14;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 5, this.f, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 6, this.g, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 7, this.h, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 8, this.i, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 9, this.j, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 10, this.k, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 11, this.l, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 12, this.m, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 13, this.n, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 14, this.o, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 15, this.p, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class f extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new i();
    
    public int c;
    
    @RecentlyNonNull
    public String d;
    
    @RecentlyNonNull
    public String e;
    
    @RecentlyNonNull
    public String f;
    
    public f() {}
    
    public f(int param1Int, @RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2, @RecentlyNonNull String param1String3) {
      this.c = param1Int;
      this.d = param1String1;
      this.e = param1String2;
      this.f = param1String3;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 5, this.f, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class g extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new l();
    
    public double c;
    
    public double d;
    
    public g() {}
    
    public g(double param1Double1, double param1Double2) {
      this.c = param1Double1;
      this.d = param1Double2;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class h extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<h> CREATOR = new k();
    
    @RecentlyNonNull
    public String c;
    
    @RecentlyNonNull
    public String d;
    
    @RecentlyNonNull
    public String e;
    
    @RecentlyNonNull
    public String f;
    
    @RecentlyNonNull
    public String g;
    
    @RecentlyNonNull
    public String h;
    
    @RecentlyNonNull
    public String i;
    
    public h() {}
    
    public h(@RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2, @RecentlyNonNull String param1String3, @RecentlyNonNull String param1String4, @RecentlyNonNull String param1String5, @RecentlyNonNull String param1String6, @RecentlyNonNull String param1String7) {
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
      this.g = param1String5;
      this.h = param1String6;
      this.i = param1String7;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 5, this.f, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 6, this.g, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 7, this.h, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 8, this.i, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class i extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<i> CREATOR = new n();
    
    public int c;
    
    @RecentlyNonNull
    public String d;
    
    public i() {}
    
    public i(int param1Int, @RecentlyNonNull String param1String) {
      this.c = param1Int;
      this.d = param1String;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class j extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<j> CREATOR = new m();
    
    @RecentlyNonNull
    public String c;
    
    @RecentlyNonNull
    public String d;
    
    public j() {}
    
    public j(@RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2) {
      this.c = param1String1;
      this.d = param1String2;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class k extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<k> CREATOR = new p();
    
    @RecentlyNonNull
    public String c;
    
    @RecentlyNonNull
    public String d;
    
    public k() {}
    
    public k(@RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2) {
      this.c = param1String1;
      this.d = param1String2;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
  
  public static class l extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<l> CREATOR = new o();
    
    @RecentlyNonNull
    public String c;
    
    @RecentlyNonNull
    public String d;
    
    public int e;
    
    public l() {}
    
    public l(@RecentlyNonNull String param1String1, @RecentlyNonNull String param1String2, int param1Int) {
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1Int;
    }
    
    public void writeToParcel(@RecentlyNonNull Parcel param1Parcel, int param1Int) {
      param1Int = com.google.android.gms.common.internal.t.c.a(param1Parcel);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 2, this.c, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 3, this.d, false);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, 4, this.e);
      com.google.android.gms.common.internal.t.c.a(param1Parcel, param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */