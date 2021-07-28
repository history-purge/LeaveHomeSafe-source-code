package e.e.j.i;

import android.net.Uri;
import e.e.e.d.l;
import e.e.e.k.f;
import e.e.j.c.b;
import e.e.j.h.a;
import e.e.j.h.d;
import e.e.l.o.c;

public class e extends d {
  private b i;
  
  public static void a(l<? extends b> paraml) {}
  
  public void a(int paramInt, Object paramObject) {
    a(f.a(paramInt), paramObject);
  }
  
  public void a(Uri paramUri, Object paramObject) {
    b b1 = this.i;
    b1.a(paramObject);
    d d1 = b1.a(paramUri);
    d1.a(getController());
    setController(d1.a());
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramString != null) {
      Uri uri = Uri.parse(paramString);
    } else {
      paramString = null;
    } 
    a((Uri)paramString, paramObject);
  }
  
  protected b getControllerBuilder() {
    return this.i;
  }
  
  public void setActualImageResource(int paramInt) {
    a(paramInt, (Object)null);
  }
  
  public void setImageRequest(c paramc) {
    b b1 = this.i;
    b1.b(paramc);
    b1.a(getController());
    setController((a)b1.a());
  }
  
  public void setImageResource(int paramInt) {
    super.setImageResource(paramInt);
  }
  
  public void setImageURI(Uri paramUri) {
    a(paramUri, (Object)null);
  }
  
  public void setImageURI(String paramString) {
    a(paramString, (Object)null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */