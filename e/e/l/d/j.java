package e.e.l.d;

import android.net.Uri;
import e.e.c.a.d;
import e.e.c.a.i;
import e.e.l.o.c;
import e.e.l.o.e;

public class j implements f {
  private static j a;
  
  public static j a() {
    // Byte code:
    //   0: ldc e/e/l/d/j
    //   2: monitorenter
    //   3: getstatic e/e/l/d/j.a : Le/e/l/d/j;
    //   6: ifnonnull -> 19
    //   9: new e/e/l/d/j
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/l/d/j.a : Le/e/l/d/j;
    //   19: getstatic e/e/l/d/j.a : Le/e/l/d/j;
    //   22: astore_0
    //   23: ldc e/e/l/d/j
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/l/d/j
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  protected Uri a(Uri paramUri) {
    return paramUri;
  }
  
  public d a(c paramc, Uri paramUri, Object paramObject) {
    a(paramUri);
    return (d)new i(paramUri.toString());
  }
  
  public d a(c paramc, Object paramObject) {
    Uri uri = paramc.p();
    a(uri);
    return new c(uri.toString(), paramc.l(), paramc.n(), paramc.c(), null, null, paramObject);
  }
  
  public d b(c paramc, Object paramObject) {
    e e1;
    e e2 = paramc.f();
    if (e2 != null) {
      d d = e2.a();
      String str = e2.getClass().getName();
    } else {
      e1 = null;
      e2 = e1;
    } 
    Uri uri = paramc.p();
    a(uri);
    return new c(uri.toString(), paramc.l(), paramc.n(), paramc.c(), (d)e1, (String)e2, paramObject);
  }
  
  public d c(c paramc, Object paramObject) {
    return a(paramc, paramc.p(), paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */