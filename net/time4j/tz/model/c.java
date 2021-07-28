package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.b0;
import net.time4j.c1.b;
import net.time4j.f;
import net.time4j.f0;
import net.time4j.w0;

final class c extends g {
  private static final long serialVersionUID = -7354650946442523175L;
  
  private final transient byte h;
  
  private final transient byte i;
  
  private final transient boolean j;
  
  c(b0 paramb0, int paramInt1, w0 paramw0, int paramInt2, i parami, int paramInt3, boolean paramBoolean) {
    super(paramb0, paramInt2, parami, paramInt3);
    b.a(2000, paramb0.a(), paramInt1);
    this.h = (byte)paramInt1;
    this.i = (byte)paramw0.a();
    this.j = paramBoolean;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, f());
  }
  
  protected f0 b(int paramInt) {
    byte b = g();
    int i = b.b(paramInt, b, this.h);
    f0 f0 = f0.b(paramInt, b, this.h);
    paramInt = this.i;
    if (i == paramInt)
      return f0; 
    int j = i - paramInt;
    i = -1;
    paramInt = j;
    if (this.j) {
      paramInt = -j;
      i = 1;
    } 
    j = paramInt;
    if (paramInt < 0)
      j = paramInt + 7; 
    return (f0)f0.b((j * i), f.j);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof c) {
      paramObject = paramObject;
      return (this.h == ((c)paramObject).h && this.i == ((c)paramObject).i && this.j == ((c)paramObject).j && a((g)paramObject));
    } 
    return false;
  }
  
  int f() {
    return 121;
  }
  
  int h() {
    return this.h;
  }
  
  public int hashCode() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  byte i() {
    return this.i;
  }
  
  boolean j() {
    return this.j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("DayOfWeekInMonthPattern:[month=");
    stringBuilder.append(g());
    stringBuilder.append(",dayOfMonth=");
    stringBuilder.append(this.h);
    stringBuilder.append(",dayOfWeek=");
    stringBuilder.append(w0.g(this.i));
    stringBuilder.append(",day-overflow=");
    stringBuilder.append(b());
    stringBuilder.append(",time-of-day=");
    stringBuilder.append(e());
    stringBuilder.append(",offset-indicator=");
    stringBuilder.append(c());
    stringBuilder.append(",dst-offset=");
    stringBuilder.append(d());
    stringBuilder.append(",after=");
    stringBuilder.append(this.j);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */