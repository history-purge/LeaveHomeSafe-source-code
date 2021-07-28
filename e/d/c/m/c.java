package e.d.c.m;

import e.d.b.b;
import e.d.b.f;
import e.d.b.k;
import e.d.b.o;
import e.d.c.b;
import e.d.c.e;
import e.d.c.f;
import java.io.IOException;

public class c {
  public void a(o paramo, e parame) {
    paramo.a(false);
    a(paramo, parame, true);
  }
  
  protected void a(o paramo, e parame, boolean paramBoolean) {
    try {
      b b;
      int i = paramo.h();
      Object object = null;
      if (i != 16706) {
        if (i != 17225 && i != 18755 && i != 19778 && i != 20547 && i != 21584) {
          try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid BMP magic number 0x");
            stringBuilder.append(Integer.toHexString(i));
            parame.a((b)new e.d.c.c(stringBuilder.toString()));
            return;
          } catch (IOException iOException) {}
        } else {
          b b1 = new b();
          try {
            parame.a(b1);
            b1.a(-2, i);
            iOException.a(12L);
            a((o)iOException, b1, parame);
            return;
          } catch (IOException iOException1) {
            b = b1;
          } 
        } 
      } else {
        if (!paramBoolean) {
          a("Invalid bitmap file - nested arrays not allowed", parame);
          return;
        } 
        b.a(4L);
        long l = b.i();
        b.a(4L);
        a((o)b, parame, false);
        if (l == 0L)
          return; 
        if (b.g() > l) {
          a("Invalid next header offset", parame);
          return;
        } 
        b.a(l - b.g());
        a((o)b, parame, true);
        return;
      } 
      if (b == null) {
        a("Unable to read BMP file header", parame);
        return;
      } 
      b.a("Unable to read BMP file header");
      return;
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't determine bitmap type: ");
      stringBuilder.append(iOException.getMessage());
      parame.a((b)new e.d.c.c(stringBuilder.toString()));
      return;
    } 
  }
  
  protected void a(o paramo, b paramb, e parame) {
    String str;
    try {
      StringBuilder stringBuilder;
      int i = paramb.i(-2);
      long l = paramo.g();
      int j = paramo.d();
      paramb.a(-1, j);
      if (j == 12 && i == 19778) {
        paramb.a(2, paramo.c());
        paramb.a(1, paramo.c());
        paramb.a(3, paramo.h());
      } else if (j == 12) {
        paramb.a(2, paramo.h());
        paramb.a(1, paramo.h());
        paramb.a(3, paramo.h());
      } else {
        if (j == 16 || j == 64) {
          paramb.a(2, paramo.d());
          paramb.a(1, paramo.d());
          paramb.a(3, paramo.h());
          paramb.a(4, paramo.h());
          if (j > 16) {
            paramb.a(5, paramo.d());
            paramo.a(4L);
            paramb.a(6, paramo.d());
            paramb.a(7, paramo.d());
            paramb.a(8, paramo.d());
            paramb.a(9, paramo.d());
            paramo.a(6L);
            paramb.a(10, paramo.h());
            paramo.a(8L);
            paramb.a(11, paramo.d());
            paramo.a(4L);
            return;
          } 
          return;
        } 
        if (j == 40 || j == 52 || j == 56 || j == 108 || j == 124) {
          b b1;
          paramb.a(2, paramo.d());
          paramb.a(1, paramo.d());
          paramb.a(3, paramo.h());
          paramb.a(4, paramo.h());
          paramb.a(5, paramo.d());
          paramo.a(4L);
          paramb.a(6, paramo.d());
          paramb.a(7, paramo.d());
          paramb.a(8, paramo.d());
          paramb.a(9, paramo.d());
          if (j == 40)
            return; 
          paramb.a(12, paramo.i());
          paramb.a(13, paramo.i());
          paramb.a(14, paramo.i());
          if (j == 52)
            return; 
          paramb.a(15, paramo.i());
          if (j == 56)
            return; 
          long l1 = paramo.i();
          paramb.a(16, l1);
          paramo.a(36L);
          paramb.a(17, paramo.i());
          paramb.a(18, paramo.i());
          paramb.a(19, paramo.i());
          if (j == 108)
            return; 
          paramb.a(20, paramo.d());
          if (l1 == b.d.g.a() || l1 == b.d.f.a()) {
            StringBuilder stringBuilder1;
            long l3 = paramo.i();
            i = paramo.d();
            long l2 = paramo.g();
            l += l3;
            if (l2 > l) {
              stringBuilder1 = new StringBuilder();
              stringBuilder1.append("Invalid profile data offset 0x");
              stringBuilder1.append(Long.toHexString(l));
              paramb.a(stringBuilder1.toString());
              return;
            } 
            stringBuilder1.a(l - stringBuilder1.g());
            if (l1 == b.d.f.a()) {
              paramb.a(21, stringBuilder1.a(i, f.f));
              return;
            } 
            b1 = new b(stringBuilder1.a(i));
            (new e.d.c.r.c()).a((k)b1, parame, paramb);
            return;
          } 
          b1.a(12L);
          return;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected DIB header size: ");
        stringBuilder.append(j);
        paramb.a(stringBuilder.toString());
        return;
      } 
      paramb.a(4, stringBuilder.h());
      return;
    } catch (IOException iOException) {
      str = "Unable to read BMP header";
    } catch (f f) {
      str = "Internal error";
    } 
    paramb.a(str);
  }
  
  protected void a(String paramString, e parame) {
    e.d.c.c c1 = (e.d.c.c)parame.b(e.d.c.c.class);
    if (c1 == null) {
      parame.a((b)new e.d.c.c(paramString));
      return;
    } 
    c1.a(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/m/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */