package e.e.l.q;

import com.facebook.imagepipeline.nativecode.c;
import e.e.k.c;

public class f implements d {
  private final int a;
  
  private final boolean b;
  
  private final d c;
  
  private final Integer d;
  
  public f(int paramInt, boolean paramBoolean, d paramd, Integer paramInteger) {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramd;
    this.d = paramInteger;
  }
  
  private c a(c paramc, boolean paramBoolean) {
    d d1 = this.c;
    return (d1 == null) ? null : d1.createImageTranscoder(paramc, paramBoolean);
  }
  
  private c b(c paramc, boolean paramBoolean) {
    Integer integer = this.d;
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i == 1)
        return d(paramc, paramBoolean); 
      throw new IllegalArgumentException("Invalid ImageTranscoderType");
    } 
    return c(paramc, paramBoolean);
  }
  
  private c c(c paramc, boolean paramBoolean) {
    return c.a(this.a, this.b).createImageTranscoder(paramc, paramBoolean);
  }
  
  private c d(c paramc, boolean paramBoolean) {
    return (new h(this.a)).createImageTranscoder(paramc, paramBoolean);
  }
  
  public c createImageTranscoder(c paramc, boolean paramBoolean) {
    c c2 = a(paramc, paramBoolean);
    c c1 = c2;
    if (c2 == null)
      c1 = b(paramc, paramBoolean); 
    c2 = c1;
    if (c1 == null)
      c2 = c(paramc, paramBoolean); 
    c1 = c2;
    if (c2 == null)
      c1 = d(paramc, paramBoolean); 
    return c1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/q/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */