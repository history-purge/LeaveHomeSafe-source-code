package e.e.l.d;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import e.e.c.a.d;
import e.e.e.d.h;
import e.e.e.d.i;
import e.e.e.k.b;
import e.e.l.e.b;
import e.e.l.e.e;
import e.e.l.e.f;

public class c implements d {
  private final String a;
  
  private final e b;
  
  private final f c;
  
  private final b d;
  
  private final d e;
  
  private final String f;
  
  private final int g;
  
  public c(String paramString1, e parame, f paramf, b paramb, d paramd, String paramString2, Object paramObject) {
    boolean bool;
    i.a(paramString1);
    this.a = paramString1;
    this.b = parame;
    this.c = paramf;
    this.d = paramb;
    this.e = paramd;
    this.f = paramString2;
    int i = paramString1.hashCode();
    if (parame != null) {
      bool = parame.hashCode();
    } else {
      bool = false;
    } 
    this.g = b.a(Integer.valueOf(i), Integer.valueOf(bool), Integer.valueOf(paramf.hashCode()), this.d, this.e, paramString2);
    RealtimeSinceBootClock.get().now();
  }
  
  public String a() {
    return this.a;
  }
  
  public boolean a(Uri paramUri) {
    return a().contains(paramUri.toString());
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof c;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (this.g == ((c)paramObject).g) {
      bool = bool1;
      if (this.a.equals(((c)paramObject).a)) {
        bool = bool1;
        if (h.a(this.b, ((c)paramObject).b)) {
          bool = bool1;
          if (h.a(this.c, ((c)paramObject).c)) {
            bool = bool1;
            if (h.a(this.d, ((c)paramObject).d)) {
              bool = bool1;
              if (h.a(this.e, ((c)paramObject).e)) {
                bool = bool1;
                if (h.a(this.f, ((c)paramObject).f))
                  bool = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool;
  }
  
  public int hashCode() {
    return this.g;
  }
  
  public String toString() {
    return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */