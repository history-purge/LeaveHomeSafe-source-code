package e.d.c.s;

import e.d.b.o;
import e.d.c.e;
import java.io.IOException;

public class c {
  public void a(o paramo, e parame) {
    int i = 0;
    paramo.a(false);
    try {
      b b;
      if (paramo.h() != 0) {
        b = new b();
        b.a("Invalid header bytes");
        parame.a(b);
        return;
      } 
      int j = b.h();
      if (j != 1 && j != 2) {
        b = new b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid type ");
        stringBuilder.append(j);
        stringBuilder.append(" -- expecting 1 or 2");
        b.a(stringBuilder.toString());
        parame.a(b);
        return;
      } 
      int k = b.h();
      if (k == 0) {
        b = new b();
        b.a("Image count cannot be zero");
        parame.a(b);
        return;
      } 
      while (i < k) {
        b b1 = new b();
        try {
          byte b2;
          int m;
          b1.a(1, j);
          b1.a(2, b.j());
          b1.a(3, b.j());
          b1.a(4, b.j());
          b.j();
          if (j == 1) {
            b1.a(5, b.h());
            b2 = 7;
            m = b.h();
          } else {
            b1.a(6, b.h());
            b2 = 8;
            m = b.h();
          } 
          b1.a(b2, m);
          b1.a(9, b.i());
          b1.a(10, b.i());
        } catch (IOException iOException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Exception reading ICO file metadata: ");
          stringBuilder.append(iOException.getMessage());
          b1.a(stringBuilder.toString());
        } 
        parame.a(b1);
        i++;
      } 
      return;
    } catch (IOException iOException) {
      b b = new b();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Exception reading ICO file metadata: ");
      stringBuilder.append(iOException.getMessage());
      b.a(stringBuilder.toString());
      parame.a(b);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */