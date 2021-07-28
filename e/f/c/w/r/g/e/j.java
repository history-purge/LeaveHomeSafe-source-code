package e.f.c.w.r.g.e;

import e.f.c.s.a;

public abstract class j {
  private final a a;
  
  private final s b;
  
  j(a parama) {
    this.a = parama;
    this.b = new s(parama);
  }
  
  public static j a(a parama) {
    if (parama.a(1))
      return new g(parama); 
    if (!parama.a(2))
      return new k(parama); 
    int i = s.a(parama, 1, 4);
    if (i != 4) {
      if (i != 5) {
        i = s.a(parama, 1, 5);
        if (i != 12) {
          if (i != 13) {
            switch (s.a(parama, 1, 7)) {
              default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(parama)));
              case 63:
                return new e(parama, "320", "17");
              case 62:
                return new e(parama, "310", "17");
              case 61:
                return new e(parama, "320", "15");
              case 60:
                return new e(parama, "310", "15");
              case 59:
                return new e(parama, "320", "13");
              case 58:
                return new e(parama, "310", "13");
              case 57:
                return new e(parama, "320", "11");
              case 56:
                break;
            } 
            return new e(parama, "310", "11");
          } 
          return new d(parama);
        } 
        return new c(parama);
      } 
      return new b(parama);
    } 
    return new a(parama);
  }
  
  protected final s a() {
    return this.b;
  }
  
  protected final a b() {
    return this.a;
  }
  
  public abstract String c();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */