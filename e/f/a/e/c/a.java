package e.f.a.e.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;
import e.f.a.e.i.d.c5;
import e.f.a.e.i.d.m5;
import e.f.a.e.i.d.p5;
import e.f.a.e.i.d.v2;
import e.f.a.e.i.d.v5;
import e.f.a.e.i.d.x5;
import java.util.ArrayList;
import java.util.TimeZone;

public final class a {
  private static final com.google.android.gms.common.api.a.g<p5> m = new com.google.android.gms.common.api.a.g();
  
  private static final com.google.android.gms.common.api.a.a<p5, com.google.android.gms.common.api.a.d.d> n = new b();
  
  @Deprecated
  public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.d> o = new com.google.android.gms.common.api.a("ClearcutLogger.API", n, m);
  
  private final Context a;
  
  private final String b;
  
  private final int c;
  
  private String d;
  
  private int e = -1;
  
  private String f;
  
  private final boolean g;
  
  private c5 h = c5.c;
  
  private final c i;
  
  private final e j;
  
  private d k;
  
  private final b l;
  
  private a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, c paramc, e parame, d paramd, b paramb) {
    this.a = paramContext;
    this.b = paramContext.getPackageName();
    this.c = a(paramContext);
    this.e = -1;
    this.d = paramString1;
    this.f = paramString2;
    this.g = paramBoolean;
    this.i = paramc;
    this.j = parame;
    this.k = new d();
    this.h = c5.c;
    this.l = paramb;
    if (paramBoolean) {
      if (paramString2 == null) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      q.a(paramBoolean, "can't be anonymous with an upload account");
    } 
  }
  
  public a(Context paramContext, String paramString1, String paramString2) {
    this(paramContext, -1, paramString1, paramString2, null, false, v2.a(paramContext), g.c(), null, (b)new v5(paramContext));
  }
  
  private static int a(Context paramContext) {
    try {
      return (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      Log.wtf("ClearcutLogger", "This can't happen.", (Throwable)nameNotFoundException);
      return 0;
    } 
  }
  
  private static int[] a(ArrayList<Integer> paramArrayList) {
    if (paramArrayList == null)
      return null; 
    int[] arrayOfInt = new int[paramArrayList.size()];
    int k = paramArrayList.size();
    int j = 0;
    for (int i = 0; j < k; i++) {
      Object object = paramArrayList.get(j);
      j++;
      arrayOfInt[i] = ((Integer)object).intValue();
    } 
    return arrayOfInt;
  }
  
  public final a a(byte[] paramArrayOfbyte) {
    return new a(paramArrayOfbyte, null);
  }
  
  public class a {
    private int a = a.a(this.i);
    
    private String b = a.b(this.i);
    
    private String c = a.c(this.i);
    
    private String d;
    
    private c5 e;
    
    private boolean f;
    
    private final m5 g;
    
    private boolean h;
    
    private a(byte[] param1ArrayOfbyte) {
      this(param1ArrayOfbyte, null);
    }
    
    private a(byte[] param1ArrayOfbyte, a.c param1c) {
      a a1 = this.i;
      this.d = null;
      this.e = a.d(a1);
      this.f = true;
      this.g = new m5();
      this.h = false;
      this.c = a.c(a.this);
      this.d = null;
      this.g.x = e.f.a.e.i.d.b.a(a.e(a.this));
      this.g.e = a.f(a.this).a();
      this.g.f = a.f(a.this).b();
      m5 m51 = this.g;
      a.g(a.this);
      long l = this.g.e;
      m51.r = (TimeZone.getDefault().getOffset(l) / 1000);
      if (param1ArrayOfbyte != null)
        this.g.m = param1ArrayOfbyte; 
    }
    
    public a a(int param1Int) {
      this.g.h = param1Int;
      return this;
    }
    
    public void a() {
      if (!this.h) {
        this.h = true;
        f f = new f(new x5(a.i(this.i), a.j(this.i), this.a, this.b, this.c, this.d, a.h(this.i), this.e), this.g, null, null, a.b((ArrayList)null), null, a.b((ArrayList)null), null, null, this.f);
        if (a.k(this.i).a(f)) {
          a.l(this.i).a(f);
          return;
        } 
        i.a(Status.h, null);
        return;
      } 
      throw new IllegalStateException("do not reuse LogEventBuilder");
    }
  }
  
  public static interface b {
    boolean a(f param1f);
  }
  
  public static interface c {
    byte[] zza();
  }
  
  public static final class d {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */