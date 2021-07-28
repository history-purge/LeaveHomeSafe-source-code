package e.e.l.i;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.platform.f;
import e.e.k.c;
import e.e.l.k.c;
import e.e.l.k.d;
import e.e.l.k.f;
import e.e.l.k.g;
import java.util.Map;

public class b implements c {
  private final c a;
  
  private final c b;
  
  private final f c;
  
  private final c d = new a(this);
  
  private final Map<c, c> e;
  
  public b(c paramc1, c paramc2, f paramf) {
    this(paramc1, paramc2, paramf, null);
  }
  
  public b(c paramc1, c paramc2, f paramf, Map<c, c> paramMap) {
    this.a = paramc1;
    this.b = paramc2;
    this.c = paramf;
    this.e = paramMap;
  }
  
  private void a(e.e.l.r.a parama, e.e.e.h.a<Bitmap> parama1) {
    if (parama == null)
      return; 
    Bitmap bitmap = (Bitmap)parama1.b();
    if (Build.VERSION.SDK_INT >= 12 && parama.a())
      bitmap.setHasAlpha(true); 
    parama.a(bitmap);
  }
  
  public e.e.l.k.b a(d paramd, int paramInt, g paramg, e.e.l.e.b paramb) {
    // Byte code:
    //   0: aload #4
    //   2: getfield g : Le/e/l/i/c;
    //   5: astore #5
    //   7: aload #5
    //   9: ifnull -> 25
    //   12: aload #5
    //   14: aload_1
    //   15: iload_2
    //   16: aload_3
    //   17: aload #4
    //   19: invokeinterface a : (Le/e/l/k/d;ILe/e/l/k/g;Le/e/l/e/b;)Le/e/l/k/b;
    //   24: areturn
    //   25: aload_1
    //   26: invokevirtual t : ()Le/e/k/c;
    //   29: astore #6
    //   31: aload #6
    //   33: ifnull -> 48
    //   36: aload #6
    //   38: astore #5
    //   40: aload #6
    //   42: getstatic e/e/k/c.b : Le/e/k/c;
    //   45: if_acmpne -> 63
    //   48: aload_1
    //   49: invokevirtual u : ()Ljava/io/InputStream;
    //   52: invokestatic c : (Ljava/io/InputStream;)Le/e/k/c;
    //   55: astore #5
    //   57: aload_1
    //   58: aload #5
    //   60: invokevirtual a : (Le/e/k/c;)V
    //   63: aload_0
    //   64: getfield e : Ljava/util/Map;
    //   67: astore #6
    //   69: aload #6
    //   71: ifnull -> 106
    //   74: aload #6
    //   76: aload #5
    //   78: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   83: checkcast e/e/l/i/c
    //   86: astore #5
    //   88: aload #5
    //   90: ifnull -> 106
    //   93: aload #5
    //   95: aload_1
    //   96: iload_2
    //   97: aload_3
    //   98: aload #4
    //   100: invokeinterface a : (Le/e/l/k/d;ILe/e/l/k/g;Le/e/l/e/b;)Le/e/l/k/b;
    //   105: areturn
    //   106: aload_0
    //   107: getfield d : Le/e/l/i/c;
    //   110: aload_1
    //   111: iload_2
    //   112: aload_3
    //   113: aload #4
    //   115: invokeinterface a : (Le/e/l/k/d;ILe/e/l/k/g;Le/e/l/e/b;)Le/e/l/k/b;
    //   120: areturn
  }
  
  public c a(d paramd, e.e.l.e.b paramb) {
    e.e.e.h.a<Bitmap> a = this.c.a(paramd, paramb.f, null, paramb.i);
    try {
      a(paramb.h, a);
      return new c(a, f.d, paramd.v(), paramd.e());
    } finally {
      a.close();
    } 
  }
  
  public e.e.l.k.b b(d paramd, int paramInt, g paramg, e.e.l.e.b paramb) {
    return this.b.a(paramd, paramInt, paramg, paramb);
  }
  
  public e.e.l.k.b c(d paramd, int paramInt, g paramg, e.e.l.e.b paramb) {
    if (paramd.z() != -1 && paramd.r() != -1) {
      if (!paramb.e) {
        c c1 = this.a;
        if (c1 != null)
          return c1.a(paramd, paramInt, paramg, paramb); 
      } 
      return (e.e.l.k.b)a(paramd, paramb);
    } 
    throw new a("image width or height is incorrect", paramd);
  }
  
  public c d(d paramd, int paramInt, g paramg, e.e.l.e.b paramb) {
    e.e.e.h.a<Bitmap> a = this.c.a(paramd, paramb.f, null, paramInt, paramb.i);
    try {
      a(paramb.h, a);
      return new c(a, paramg, paramd.v(), paramd.e());
    } finally {
      a.close();
    } 
  }
  
  class a implements c {
    a(b this$0) {}
    
    public e.e.l.k.b a(d param1d, int param1Int, g param1g, e.e.l.e.b param1b) {
      c c1 = param1d.t();
      if (c1 == e.e.k.b.a)
        return (e.e.l.k.b)this.a.d(param1d, param1Int, param1g, param1b); 
      if (c1 == e.e.k.b.c)
        return this.a.c(param1d, param1Int, param1g, param1b); 
      if (c1 == e.e.k.b.j)
        return this.a.b(param1d, param1Int, param1g, param1b); 
      if (c1 != c.b)
        return (e.e.l.k.b)this.a.a(param1d, param1b); 
      throw new a("unknown image format", param1d);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */