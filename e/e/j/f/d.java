package e.e.j.f;

import e.e.e.d.i;
import java.util.Arrays;

public class d {
  private a a = a.d;
  
  private boolean b = false;
  
  private float[] c = null;
  
  private int d = 0;
  
  private float e = 0.0F;
  
  private int f = 0;
  
  private float g = 0.0F;
  
  private boolean h = false;
  
  private boolean i = false;
  
  public static d b(float paramFloat) {
    d d1 = new d();
    d1.a(paramFloat);
    return d1;
  }
  
  private float[] j() {
    if (this.c == null)
      this.c = new float[8]; 
    return this.c;
  }
  
  public int a() {
    return this.f;
  }
  
  public d a(float paramFloat) {
    Arrays.fill(j(), paramFloat);
    return this;
  }
  
  public d a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    float[] arrayOfFloat = j();
    arrayOfFloat[1] = paramFloat1;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[3] = paramFloat2;
    arrayOfFloat[2] = paramFloat2;
    arrayOfFloat[5] = paramFloat3;
    arrayOfFloat[4] = paramFloat3;
    arrayOfFloat[7] = paramFloat4;
    arrayOfFloat[6] = paramFloat4;
    return this;
  }
  
  public d a(int paramInt) {
    this.d = paramInt;
    this.a = a.c;
    return this;
  }
  
  public d a(int paramInt, float paramFloat) {
    boolean bool;
    if (paramFloat >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool, "the border width cannot be < 0");
    this.e = paramFloat;
    this.f = paramInt;
    return this;
  }
  
  public d a(a parama) {
    this.a = parama;
    return this;
  }
  
  public float b() {
    return this.e;
  }
  
  public float[] c() {
    return this.c;
  }
  
  public int d() {
    return this.d;
  }
  
  public float e() {
    return this.g;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (d.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      return (this.b != ((d)paramObject).b) ? false : ((this.d != ((d)paramObject).d) ? false : ((Float.compare(((d)paramObject).e, this.e) != 0) ? false : ((this.f != ((d)paramObject).f) ? false : ((Float.compare(((d)paramObject).g, this.g) != 0) ? false : ((this.a != ((d)paramObject).a) ? false : ((this.h != ((d)paramObject).h) ? false : ((this.i != ((d)paramObject).i) ? false : Arrays.equals(this.c, ((d)paramObject).c))))))));
    } 
    return false;
  }
  
  public boolean f() {
    return this.i;
  }
  
  public boolean g() {
    return this.b;
  }
  
  public a h() {
    return this.a;
  }
  
  public int hashCode() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public boolean i() {
    return this.h;
  }
  
  public enum a {
    c, d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */