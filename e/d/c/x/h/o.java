package e.d.c.x.h;

public class o extends c {
  int c;
  
  int d;
  
  int e;
  
  int[] f;
  
  int[] g;
  
  String h;
  
  public o(e.d.b.o paramo, a parama) {
    super(paramo, parama);
    this.c = paramo.c();
    this.d = paramo.c();
    this.e = paramo.c();
    paramo.a(2L);
    this.f = new int[] { paramo.h(), paramo.h(), paramo.h() };
    this.g = new int[] { paramo.h(), paramo.h(), paramo.h() };
    this.h = paramo.c(paramo.j());
  }
  
  public void a(e.d.c.x.i.o paramo) {
    String str;
    paramo.a(5, this.c);
    int i = this.d;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i != 8) {
            if (i != 16) {
              if (i != 32) {
                if (i != 64) {
                  paramo.a(7, this.e);
                  paramo.a(8, this.f);
                  paramo.a(9, this.g);
                  paramo.a(10, this.h);
                  return;
                } 
                str = "Extend";
              } else {
                str = "Condense";
              } 
            } else {
              str = "Shadow";
            } 
          } else {
            str = "Outline";
          } 
        } else {
          str = "Underline";
        } 
      } else {
        str = "Italic";
      } 
    } else {
      str = "Bold";
    } 
    paramo.a(6, str);
    paramo.a(7, this.e);
    paramo.a(8, this.f);
    paramo.a(9, this.g);
    paramo.a(10, this.h);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */