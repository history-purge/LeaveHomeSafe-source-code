package e.e.l.k;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.b;
import com.facebook.imageutils.c;
import com.facebook.imageutils.f;
import e.e.e.d.i;
import e.e.e.d.l;
import e.e.e.g.g;
import e.e.e.g.i;
import e.e.e.h.a;
import e.e.k.b;
import e.e.k.c;
import e.e.l.e.a;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class d implements Closeable {
  private final a<g> c;
  
  private final l<FileInputStream> d;
  
  private c e = c.b;
  
  private int f = -1;
  
  private int g = 0;
  
  private int h = -1;
  
  private int i = -1;
  
  private int j = 1;
  
  private int k = -1;
  
  private a l;
  
  private ColorSpace m;
  
  public d(l<FileInputStream> paraml) {
    i.a(paraml);
    this.c = null;
    this.d = paraml;
  }
  
  public d(l<FileInputStream> paraml, int paramInt) {
    this(paraml);
    this.k = paramInt;
  }
  
  public d(a<g> parama) {
    i.a(a.c(parama));
    this.c = parama.clone();
    this.d = null;
  }
  
  private void C() {
    if (this.h < 0 || this.i < 0)
      B(); 
  }
  
  private b D() {
    Exception exception;
    InputStream inputStream;
    try {
      inputStream = u();
    } finally {
      exception = null;
    } 
    if (inputStream != null)
      try {
        inputStream.close();
      } catch (IOException iOException) {} 
    throw exception;
  }
  
  private Pair<Integer, Integer> E() {
    Pair<Integer, Integer> pair = f.e(u());
    if (pair != null) {
      this.h = ((Integer)pair.first).intValue();
      this.i = ((Integer)pair.second).intValue();
    } 
    return pair;
  }
  
  public static d b(d paramd) {
    return (paramd != null) ? paramd.a() : null;
  }
  
  public static void c(d paramd) {
    if (paramd != null)
      paramd.close(); 
  }
  
  public static boolean d(d paramd) {
    return (paramd.f >= 0 && paramd.h >= 0 && paramd.i >= 0);
  }
  
  public static boolean e(d paramd) {
    return (paramd != null && paramd.A());
  }
  
  public boolean A() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Le/e/e/h/a;
    //   6: invokestatic c : (Le/e/e/h/a;)Z
    //   9: ifne -> 29
    //   12: aload_0
    //   13: getfield d : Le/e/e/d/l;
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull -> 24
    //   21: goto -> 29
    //   24: iconst_0
    //   25: istore_1
    //   26: goto -> 31
    //   29: iconst_1
    //   30: istore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_1
    //   34: ireturn
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	35	finally
  }
  
  public void B() {
    Pair pair;
    c c1 = e.e.k.d.c(u());
    this.e = c1;
    if (b.b(c1)) {
      pair = E();
    } else {
      pair = D().b();
    } 
    if (c1 == b.a && this.f == -1) {
      if (pair != null) {
        i = c.a(u());
      } else {
        return;
      } 
    } else if (c1 == b.k && this.f == -1) {
      i = HeifExifUtil.a(u());
    } else {
      i = 0;
      this.f = i;
    } 
    this.g = i;
    int i = c.a(this.g);
    this.f = i;
  }
  
  public d a() {
    l<FileInputStream> l1 = this.d;
    if (l1 != null) {
      d d1 = new d(l1, this.k);
    } else {
      a<g> a1 = a.a(this.c);
      if (a1 == null) {
        l1 = null;
      } else {
        try {
          d d1 = new d(a1);
        } finally {
          a.b(a1);
        } 
      } 
      a.b(a1);
    } 
    if (l1 != null)
      l1.a(this); 
    return (d)l1;
  }
  
  public void a(c paramc) {
    this.e = paramc;
  }
  
  public void a(a parama) {
    this.l = parama;
  }
  
  public void a(d paramd) {
    this.e = paramd.t();
    this.h = paramd.z();
    this.i = paramd.r();
    this.f = paramd.v();
    this.g = paramd.e();
    this.j = paramd.x();
    this.k = paramd.y();
    this.l = paramd.c();
    this.m = paramd.d();
  }
  
  public a<g> b() {
    return a.a(this.c);
  }
  
  public String b(int paramInt) {
    StringBuilder stringBuilder;
    a<g> a1 = b();
    if (a1 == null)
      return ""; 
    paramInt = Math.min(y(), paramInt);
    null = new byte[paramInt];
    try {
      g g = (g)a1.b();
      if (g == null)
        return ""; 
      g.a(0, null, 0, paramInt);
      a1.close();
      stringBuilder = new StringBuilder(null.length * 2);
      int i = null.length;
      return stringBuilder.toString();
    } finally {
      stringBuilder.close();
    } 
  }
  
  public a c() {
    return this.l;
  }
  
  public boolean c(int paramInt) {
    if (this.e != b.a)
      return true; 
    if (this.d != null)
      return true; 
    i.a(this.c);
    g g = (g)this.c.b();
    return (g.a(paramInt - 2) == -1 && g.a(paramInt - 1) == -39);
  }
  
  public void close() {
    a.b(this.c);
  }
  
  public ColorSpace d() {
    C();
    return this.m;
  }
  
  public void d(int paramInt) {
    this.g = paramInt;
  }
  
  public int e() {
    C();
    return this.g;
  }
  
  public void e(int paramInt) {
    this.i = paramInt;
  }
  
  public void f(int paramInt) {
    this.f = paramInt;
  }
  
  public void g(int paramInt) {
    this.j = paramInt;
  }
  
  public void h(int paramInt) {
    this.h = paramInt;
  }
  
  public int r() {
    C();
    return this.i;
  }
  
  public c t() {
    C();
    return this.e;
  }
  
  public InputStream u() {
    l<FileInputStream> l1 = this.d;
    if (l1 != null)
      return (InputStream)l1.get(); 
    a a1 = a.a(this.c);
    if (a1 != null)
      try {
        return (InputStream)new i((g)a1.b());
      } finally {
        a.b(a1);
      }  
    return null;
  }
  
  public int v() {
    C();
    return this.f;
  }
  
  public int x() {
    return this.j;
  }
  
  public int y() {
    a<g> a1 = this.c;
    return (a1 != null && a1.b() != null) ? ((g)this.c.b()).size() : this.k;
  }
  
  public int z() {
    C();
    return this.h;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */