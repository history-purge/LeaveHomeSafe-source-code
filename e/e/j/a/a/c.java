package e.e.j.a.a;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import e.e.e.e.a;
import e.e.j.i.e;
import e.e.l.f.h;
import e.e.l.f.i;
import e.e.l.f.k;
import e.e.l.p.b;
import java.io.IOException;

public class c {
  private static final Class<?> a = c.class;
  
  private static f b;
  
  private static volatile boolean c = false;
  
  public static h a() {
    return b().f();
  }
  
  public static void a(Context paramContext) {
    a(paramContext, null, null);
  }
  
  private static void a(Context paramContext, b paramb) {
    if (b.c())
      b.a("Fresco.initializeDrawee"); 
    b = new f(paramContext, paramb);
    e.a(b);
    if (b.c())
      b.a(); 
  }
  
  public static void a(Context paramContext, i parami) {
    a(paramContext, parami, null);
  }
  
  public static void a(Context paramContext, i parami, b paramb) {
    if (b.c())
      b.a("Fresco#initialize"); 
    if (c) {
      a.c(a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
    } else {
      c = true;
    } 
    try {
      if (b.c())
        b.a("Fresco.initialize->SoLoader.init"); 
      SoLoader.a(paramContext, 0);
      if (b.c())
        b.a(); 
      paramContext = paramContext.getApplicationContext();
      if (parami == null) {
        k.b(paramContext);
      } else {
        k.a(parami);
      } 
      a(paramContext, paramb);
      if (b.c())
        b.a(); 
      return;
    } catch (IOException iOException) {
      if (b.c())
        b.a(); 
      throw new RuntimeException("Could not initialize SoLoader", iOException);
    } 
  }
  
  public static k b() {
    return k.o();
  }
  
  public static boolean c() {
    return c;
  }
  
  public static e d() {
    return b.get();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */