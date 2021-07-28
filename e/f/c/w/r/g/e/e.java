package e.f.c.w.r.g.e;

import e.f.c.j;
import e.f.c.s.a;

final class e extends i {
  private final String c;
  
  private final String d;
  
  e(a parama, String paramString1, String paramString2) {
    super(parama);
    this.c = paramString2;
    this.d = paramString1;
  }
  
  private void c(StringBuilder paramStringBuilder, int paramInt) {
    int j = a().a(paramInt, 16);
    if (j == 38400)
      return; 
    paramStringBuilder.append('(');
    paramStringBuilder.append(this.c);
    paramStringBuilder.append(')');
    paramInt = j % 32;
    int k = j / 32;
    j = k % 12 + 1;
    k /= 12;
    if (k / 10 == 0)
      paramStringBuilder.append('0'); 
    paramStringBuilder.append(k);
    if (j / 10 == 0)
      paramStringBuilder.append('0'); 
    paramStringBuilder.append(j);
    if (paramInt / 10 == 0)
      paramStringBuilder.append('0'); 
    paramStringBuilder.append(paramInt);
  }
  
  protected int a(int paramInt) {
    return paramInt % 100000;
  }
  
  protected void b(StringBuilder paramStringBuilder, int paramInt) {
    paramStringBuilder.append('(');
    paramStringBuilder.append(this.d);
    paramStringBuilder.append(paramInt / 100000);
    paramStringBuilder.append(')');
  }
  
  public String c() {
    if (b().c() == 84) {
      StringBuilder stringBuilder = new StringBuilder();
      a(stringBuilder, 8);
      b(stringBuilder, 48, 20);
      c(stringBuilder, 68);
      return stringBuilder.toString();
    } 
    throw j.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */