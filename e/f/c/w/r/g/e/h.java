package e.f.c.w.r.g.e;

import e.f.c.s.a;

abstract class h extends j {
  h(a parama) {
    super(parama);
  }
  
  private static void b(StringBuilder paramStringBuilder, int paramInt) {
    boolean bool = false;
    int i = 0;
    int k = 0;
    while (i < 13) {
      int n = paramStringBuilder.charAt(i + paramInt) - 48;
      int m = n;
      if ((i & 0x1) == 0)
        m = n * 3; 
      k += m;
      i++;
    } 
    paramInt = 10 - k % 10;
    if (paramInt == 10)
      paramInt = bool; 
    paramStringBuilder.append(paramInt);
  }
  
  final void a(StringBuilder paramStringBuilder, int paramInt) {
    paramStringBuilder.append("(01)");
    int i = paramStringBuilder.length();
    paramStringBuilder.append('9');
    a(paramStringBuilder, paramInt, i);
  }
  
  final void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2) {
    int i;
    for (i = 0; i < 4; i++) {
      int k = a().a(i * 10 + paramInt1, 10);
      if (k / 100 == 0)
        paramStringBuilder.append('0'); 
      if (k / 10 == 0)
        paramStringBuilder.append('0'); 
      paramStringBuilder.append(k);
    } 
    b(paramStringBuilder, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */