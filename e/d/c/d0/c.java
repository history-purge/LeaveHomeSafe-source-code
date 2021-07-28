package e.d.c.d0;

import e.d.a.r.a;
import e.d.b.b;
import e.d.c.e;
import e.d.c.f;
import java.io.IOException;

public class c implements a {
  private final b a = new b();
  
  private String b = "";
  
  public c(e parame) {
    parame.a(this.a);
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    try {
      b b1;
      String str;
      Integer integer;
      if (paramString.equals("fmt ")) {
        b b2 = new b(paramArrayOfbyte);
        b2.a(false);
        short s1 = b2.e(0);
        short s2 = b2.e(2);
        int i = b2.g(4);
        int j = b2.g(8);
        short s3 = b2.e(12);
        if (s1 != 1) {
          if (b.g.containsKey(Integer.valueOf(s1))) {
            b1 = this.a;
            str = b.g.get(Integer.valueOf(s1));
          } else {
            b1 = this.a;
            str = "Unknown";
          } 
        } else {
          short s = b1.e(14);
          this.a.a(6, s);
          b1 = this.a;
          str = b.g.get(Integer.valueOf(s1));
        } 
        b1.a(1, str);
        this.a.a(2, s2);
        this.a.a(3, i);
        this.a.a(4, j);
        this.a.a(5, s3);
        return;
      } 
      boolean bool = b1.equals("data");
      if (bool)
        try {
          if (this.a.a(4)) {
            double d1 = str.length;
            double d2 = this.a.f(4);
            Double.isNaN(d1);
            d1 /= d2;
            int i = (int)d1;
            Integer integer1 = Integer.valueOf(i / (int)Math.pow(60.0D, 2.0D));
            integer = Integer.valueOf(i / (int)Math.pow(60.0D, 1.0D) - integer1.intValue() * 60);
            d1 /= Math.pow(60.0D, 0.0D);
            i = integer.intValue();
            d2 = (i * 60);
            Double.isNaN(d2);
            String str1 = String.format("%1$02d:%2$02d:%3$02d", new Object[] { integer1, integer, Integer.valueOf((int)Math.round(d1 - d2)) });
            this.a.a(16, str1);
            return;
          } 
          return;
        } catch (f f) {
          this.a.a("Error calculating duration: bytes per second not found");
          return;
        }  
      if (b.f.containsKey(f)) {
        this.a.a(((Integer)b.f.get(f)).intValue(), (new String((byte[])integer)).substring(0, integer.length - 1));
        return;
      } 
    } catch (IOException iOException) {
      this.a.a(iOException.getMessage());
    } 
  }
  
  public boolean a(String paramString) {
    return (paramString.equals("fmt ") || (this.b.equals("INFO") && b.f.containsKey(paramString)) || paramString.equals("data"));
  }
  
  public boolean b(String paramString) {
    return paramString.equals("WAVE");
  }
  
  public boolean c(String paramString) {
    if (paramString.equals("INFO")) {
      this.b = "INFO";
      return true;
    } 
    this.b = "";
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/d0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */