package e.d.c.l;

import e.d.a.r.a;
import e.d.b.b;
import e.d.c.e;
import java.io.IOException;

public class c implements a {
  private final b a = new b();
  
  public c(e parame) {
    parame.a(this.a);
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    try {
      String str;
      if (paramString.equals("strh")) {
        Integer integer;
        b b1 = new b(paramArrayOfbyte);
        b1.a(false);
        String str1 = new String(b1.a(0, 4));
        paramString = new String(b1.a(4, 4));
        float f1 = b1.d(20);
        float f2 = b1.d(24);
        int i = b1.g(32);
        if (str1.equals("vids")) {
          if (!this.a.a(1)) {
            b b2 = this.a;
            f1 = f2 / f1;
            b2.a(1, f1);
            double d1 = (i / f1);
            i = (int)d1;
            Integer integer1 = Integer.valueOf(i / (int)Math.pow(60.0D, 2.0D));
            integer = Integer.valueOf(i / (int)Math.pow(60.0D, 1.0D) - integer1.intValue() * 60);
            double d2 = Math.pow(60.0D, 0.0D);
            Double.isNaN(d1);
            d1 /= d2;
            i = integer.intValue();
            d2 = (i * 60);
            Double.isNaN(d2);
            str = String.format("%1$02d:%2$02d:%3$02d", new Object[] { integer1, integer, Integer.valueOf((int)Math.round(d1 - d2)) });
            this.a.a(3, str);
            this.a.a(4, paramString);
            return;
          } 
        } else if (integer.equals("auds") && !this.a.a(2)) {
          this.a.a(2, (f2 / f1));
          return;
        } 
      } else if (paramString.equals("avih")) {
        b b1 = new b((byte[])str);
        b1.a(false);
        int i = b1.g(24);
        int j = b1.g(32);
        int k = b1.g(36);
        this.a.a(6, j);
        this.a.a(7, k);
        this.a.a(8, i);
        return;
      } 
    } catch (IOException iOException) {
      this.a.a(iOException.getMessage());
    } 
  }
  
  public boolean a(String paramString) {
    return (paramString.equals("strh") || paramString.equals("avih"));
  }
  
  public boolean b(String paramString) {
    return paramString.equals("AVI ");
  }
  
  public boolean c(String paramString) {
    return (paramString.equals("hdrl") || paramString.equals("strl") || paramString.equals("AVI "));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */