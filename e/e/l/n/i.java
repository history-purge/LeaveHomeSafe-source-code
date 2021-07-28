package e.e.l.n;

import android.graphics.Bitmap;
import e.e.e.h.a;
import e.e.l.k.b;
import e.e.l.k.c;

public class i implements j0<a<b>> {
  private final j0<a<b>> a;
  
  private final int b;
  
  private final int c;
  
  private final boolean d;
  
  public i(j0<a<b>> paramj0, int paramInt1, int paramInt2, boolean paramBoolean) {
    boolean bool;
    if (paramInt1 <= paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.e.d.i.a(bool);
    e.e.e.d.i.a(paramj0);
    this.a = paramj0;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
  }
  
  public void a(k<a<b>> paramk, k0 paramk0) {
    if (paramk0.d() && !this.d) {
      this.a.a(paramk, paramk0);
      return;
    } 
    this.a.a(new a(paramk, this.b, this.c), paramk0);
  }
  
  private static class a extends n<a<b>, a<b>> {
    private final int c;
    
    private final int d;
    
    a(k<a<b>> param1k, int param1Int1, int param1Int2) {
      super(param1k);
      this.c = param1Int1;
      this.d = param1Int2;
    }
    
    private void a(a<b> param1a) {
      if (param1a != null) {
        if (!param1a.d())
          return; 
        b b = (b)param1a.b();
        if (b != null) {
          if (b.isClosed())
            return; 
          if (b instanceof c) {
            Bitmap bitmap = ((c)b).r();
            if (bitmap == null)
              return; 
            int i = bitmap.getRowBytes() * bitmap.getHeight();
            if (i < this.c)
              return; 
            if (i > this.d)
              return; 
            bitmap.prepareToDraw();
          } 
        } 
      } 
    }
    
    protected void a(a<b> param1a, int param1Int) {
      a(param1a);
      c().a((O)param1a, param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */