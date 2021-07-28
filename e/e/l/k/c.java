package e.e.l.k;

import android.graphics.Bitmap;
import com.facebook.imageutils.a;
import e.e.e.d.i;
import e.e.e.h.a;

public class c extends a {
  private a<Bitmap> c;
  
  private volatile Bitmap d;
  
  private final g e;
  
  private final int f;
  
  private final int g;
  
  public c(Bitmap paramBitmap, e.e.e.h.c<Bitmap> paramc, g paramg, int paramInt) {
    this(paramBitmap, paramc, paramg, paramInt, 0);
  }
  
  public c(Bitmap paramBitmap, e.e.e.h.c<Bitmap> paramc, g paramg, int paramInt1, int paramInt2) {
    i.a(paramBitmap);
    this.d = paramBitmap;
    paramBitmap = this.d;
    i.a(paramc);
    this.c = a.a(paramBitmap, paramc);
    this.e = paramg;
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public c(a<Bitmap> parama, g paramg, int paramInt1, int paramInt2) {
    parama = parama.a();
    i.a(parama);
    this.c = parama;
    this.d = (Bitmap)this.c.b();
    this.e = paramg;
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  private static int a(Bitmap paramBitmap) {
    return (paramBitmap == null) ? 0 : paramBitmap.getHeight();
  }
  
  private static int b(Bitmap paramBitmap) {
    return (paramBitmap == null) ? 0 : paramBitmap.getWidth();
  }
  
  private a<Bitmap> v() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Le/e/e/h/a;
    //   6: astore_1
    //   7: aload_0
    //   8: aconst_null
    //   9: putfield c : Le/e/e/h/a;
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield d : Landroid/graphics/Bitmap;
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: areturn
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	21	finally
  }
  
  public int a() {
    if (this.f % 180 == 0) {
      int i = this.g;
      if (i != 5 && i != 7)
        return a(this.d); 
    } 
    return b(this.d);
  }
  
  public int b() {
    if (this.f % 180 == 0) {
      int i = this.g;
      if (i != 5 && i != 7)
        return b(this.d); 
    } 
    return a(this.d);
  }
  
  public g c() {
    return this.e;
  }
  
  public void close() {
    a<Bitmap> a1 = v();
    if (a1 != null)
      a1.close(); 
  }
  
  public int d() {
    return a.a(this.d);
  }
  
  public boolean isClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Le/e/e/h/a;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull -> 16
    //   11: iconst_1
    //   12: istore_1
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public Bitmap r() {
    return this.d;
  }
  
  public int t() {
    return this.g;
  }
  
  public int u() {
    return this.f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */