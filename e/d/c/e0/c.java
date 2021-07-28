package e.d.c.e0;

import e.d.a.r.a;
import e.d.b.b;
import e.d.b.k;
import e.d.c.e;
import e.d.c.o.i;
import java.io.IOException;

public class c implements a {
  private final e a;
  
  public c(e parame) {
    this.a = parame;
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    b b;
    b b1 = new b();
    if (paramString.equals("EXIF")) {
      (new i()).a((k)new b(paramArrayOfbyte), this.a);
      return;
    } 
    if (paramString.equals("ICCP")) {
      (new e.d.c.r.c()).a((k)new b(paramArrayOfbyte), this.a);
      return;
    } 
    if (paramString.equals("XMP ")) {
      (new e.d.c.f0.c()).a(paramArrayOfbyte, this.a);
      return;
    } 
    if (paramString.equals("VP8X") && paramArrayOfbyte.length == 10) {
      b = new b(paramArrayOfbyte);
      b.a(false);
      try {
        boolean bool1 = b.a(1);
        boolean bool2 = b.a(4);
        int i = b.f(4);
        int j = b.f(7);
        b1.a(2, i + 1);
        b1.a(1, j + 1);
        b1.a(3, bool2);
        b1.a(4, bool1);
        this.a.a(b1);
        return;
      } catch (IOException iOException) {
        iOException.printStackTrace(System.err);
        return;
      } 
    } 
    if (iOException.equals("VP8L") && paramArrayOfbyte.length > 4) {
      b = new b(paramArrayOfbyte);
      b.a(false);
      if (b.i(0) != 47)
        return; 
      short s1 = b.m(1);
      short s2 = b.m(2);
      short s3 = b.m(3);
      short s4 = b.m(4);
      b1.a(2, (s1 | (s2 & 0x3F) << 8) + 1);
      b1.a(1, ((s4 & 0xF) << 10 | s3 << 2 | (s2 & 0xC0) >> 6) + 1);
      this.a.a(b1);
      return;
    } 
    if (b.equals("VP8 ") && paramArrayOfbyte.length > 9) {
      b = new b(paramArrayOfbyte);
      b.a(false);
      try {
        if (b.m(3) == 157 && b.m(4) == 1) {
          if (b.m(5) != 42)
            return; 
          int i = b.k(6);
          int j = b.k(8);
          b1.a(2, i);
          b1.a(1, j);
          this.a.a(b1);
          return;
        } 
        return;
      } catch (IOException iOException1) {
        b1.a(iOException1.getMessage());
      } 
    } 
  }
  
  public boolean a(String paramString) {
    return (paramString.equals("VP8X") || paramString.equals("VP8L") || paramString.equals("VP8 ") || paramString.equals("EXIF") || paramString.equals("ICCP") || paramString.equals("XMP "));
  }
  
  public boolean b(String paramString) {
    return paramString.equals("WEBP");
  }
  
  public boolean c(String paramString) {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/e0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */