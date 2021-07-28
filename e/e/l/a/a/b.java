package e.e.l.a.a;

import e.e.c.a.d;
import e.e.l.c.f;
import e.e.l.d.h;
import e.e.l.f.f;

public class b {
  private static boolean a;
  
  private static a b;
  
  public static a a(f paramf, f paramf1, h<d, e.e.l.k.b> paramh, boolean paramBoolean) {
    if (!a) {
      try {
        b = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[] { f.class, f.class, h.class, boolean.class }).newInstance(new Object[] { paramf, paramf1, paramh, Boolean.valueOf(paramBoolean) });
      } finally {}
      if (b != null)
        a = true; 
    } 
    return b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */