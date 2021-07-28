package e.e.l.e;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import e.e.l.i.c;
import e.e.l.r.a;

public class b {
  private static final b j = b().a();
  
  public final int a;
  
  public final boolean b;
  
  public final boolean c;
  
  public final boolean d;
  
  public final boolean e;
  
  public final Bitmap.Config f;
  
  public final c g;
  
  public final a h;
  
  public final ColorSpace i;
  
  public b(c paramc) {
    this.a = paramc.i();
    this.b = paramc.g();
    this.c = paramc.j();
    this.d = paramc.f();
    this.e = paramc.h();
    this.f = paramc.b();
    this.g = paramc.e();
    this.h = paramc.c();
    this.i = paramc.d();
  }
  
  public static b a() {
    return j;
  }
  
  public static c b() {
    return new c();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (b.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      return (this.b != ((b)paramObject).b) ? false : ((this.c != ((b)paramObject).c) ? false : ((this.d != ((b)paramObject).d) ? false : ((this.e != ((b)paramObject).e) ? false : ((this.f != ((b)paramObject).f) ? false : ((this.g != ((b)paramObject).g) ? false : ((this.h != ((b)paramObject).h) ? false : (!(this.i != ((b)paramObject).i))))))));
    } 
    return false;
  }
  
  public int hashCode() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public String toString() {
    return String.format(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", new Object[] { Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f.name(), this.g, this.h, this.i });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */