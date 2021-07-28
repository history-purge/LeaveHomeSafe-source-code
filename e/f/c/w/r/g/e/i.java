package e.f.c.w.r.g.e;

import e.f.c.s.a;

abstract class i extends h {
  i(a parama) {
    super(parama);
  }
  
  protected abstract int a(int paramInt);
  
  protected abstract void b(StringBuilder paramStringBuilder, int paramInt);
  
  final void b(StringBuilder paramStringBuilder, int paramInt1, int paramInt2) {
    paramInt1 = a().a(paramInt1, paramInt2);
    b(paramStringBuilder, paramInt1);
    int j = a(paramInt1);
    paramInt2 = 100000;
    for (paramInt1 = 0; paramInt1 < 5; paramInt1++) {
      if (j / paramInt2 == 0)
        paramStringBuilder.append('0'); 
      paramInt2 /= 10;
    } 
    paramStringBuilder.append(j);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */