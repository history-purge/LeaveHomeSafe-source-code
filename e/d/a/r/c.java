package e.d.a.r;

import e.d.b.o;

public class c {
  public void a(o paramo, int paramInt, a parama) {
    while (paramo.g() < paramInt) {
      long l;
      String str = new String(paramo.a(4));
      int i = paramo.d();
      if (str.equals("LIST") || str.equals("RIFF")) {
        boolean bool = parama.c(new String(paramo.a(4)));
        i -= 4;
        if (bool) {
          a(paramo, i, parama);
          continue;
        } 
        l = i;
      } else {
        if (parama.a(str)) {
          parama.a(str, paramo.a(i));
        } else {
          paramo.a(i);
        } 
        if (i % 2 == 1) {
          l = 1L;
        } else {
          continue;
        } 
      } 
      paramo.a(l);
    } 
  }
  
  public void a(o paramo, a parama) {
    paramo.a(false);
    String str = paramo.c(4);
    if (str.equals("RIFF")) {
      int i = paramo.d();
      if (!parama.b(paramo.c(4)))
        return; 
      a(paramo, i - 4, parama);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid RIFF header: ");
    stringBuilder.append(str);
    throw new b(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */