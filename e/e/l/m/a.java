package e.e.l.m;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import e.e.c.a.d;
import e.e.c.a.i;
import e.e.e.d.i;
import e.e.l.o.a;

public class a extends a {
  private final int b;
  
  private final int c;
  
  private d d;
  
  public a(int paramInt) {
    this(3, paramInt);
  }
  
  public a(int paramInt1, int paramInt2) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt1 > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt2 > 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public d a() {
    if (this.d == null)
      this.d = (d)new i(String.format(null, "i%dr%d", new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c) })); 
    return this.d;
  }
  
  public void a(Bitmap paramBitmap) {
    NativeBlurFilter.a(paramBitmap, this.b, this.c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */