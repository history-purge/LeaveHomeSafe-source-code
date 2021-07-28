package e.d.c.b0;

import e.d.a.n.e;
import e.d.b.j;
import e.d.b.n;
import e.d.c.j;
import java.io.IOException;
import java.util.List;

public class b extends j<c> {
  public b(c paramc) {
    super(paramc);
  }
  
  public String a() {
    byte[] arrayOfByte = ((c)this.a).d(15);
    Integer integer = ((c)this.a).k(4);
    if (arrayOfByte != null) {
      if (integer == null)
        return null; 
      n n = new n(arrayOfByte);
      try {
        int i = integer.intValue();
        if (i != 0)
          if (i != 6 && i != 2) {
            if (i != 3) {
              if (i != 4)
                return null; 
            } else {
              return String.format("Palette Index %d", new Object[] { Short.valueOf(n.j()) });
            } 
          } else {
            return String.format("R %d, G %d, B %d", new Object[] { Integer.valueOf(n.h()), Integer.valueOf(n.h()), Integer.valueOf(n.h()) });
          }  
        return String.format("Greyscale Level %d", new Object[] { Integer.valueOf(n.h()) });
      } catch (IOException iOException) {
        return null;
      } 
    } 
    return null;
  }
  
  public String b() {
    Integer integer = ((c)this.a).k(4);
    if (integer == null)
      return null; 
    e e = e.f(integer.intValue());
    return (e == null) ? null : e.a();
  }
  
  public String c() {
    return a(5, new String[] { "Deflate" });
  }
  
  public String c(int paramInt) {
    return (paramInt != 4) ? ((paramInt != 5) ? ((paramInt != 6) ? ((paramInt != 7) ? ((paramInt != 9) ? ((paramInt != 10) ? ((paramInt != 13) ? ((paramInt != 15) ? ((paramInt != 18) ? super.c(paramInt) : i()) : a()) : h()) : f()) : g()) : e()) : d()) : c()) : b();
  }
  
  public String d() {
    return a(6, new String[] { "Adaptive" });
  }
  
  public String e() {
    return a(7, new String[] { "No Interlace", "Adam7 Interlace" });
  }
  
  public String f() {
    return a(10, new String[] { "Perceptual", "Relative Colorimetric", "Saturation", "Absolute Colorimetric" });
  }
  
  public String g() {
    return a(9, new String[] { null, "Yes" });
  }
  
  public String h() {
    Object object = ((c)this.a).m(13);
    if (object == null)
      return null; 
    List list = (List)object;
    object = new StringBuilder();
    for (j j1 : list) {
      if (object.length() != 0)
        object.append('\n'); 
      object.append(String.format("%s: %s", new Object[] { j1.a(), j1.b() }));
    } 
    return object.toString();
  }
  
  public String i() {
    return a(18, new String[] { "Unspecified", "Metres" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/b0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */