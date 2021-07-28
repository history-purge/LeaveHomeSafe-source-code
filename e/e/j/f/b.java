package e.e.j.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import e.e.e.d.i;
import e.e.j.e.r;
import java.util.Iterator;
import java.util.List;

public class b {
  public static final r.b r = r.b.d;
  
  public static final r.b s = r.b.e;
  
  private Resources a;
  
  private int b;
  
  private Drawable c;
  
  private r.b d;
  
  private Drawable e;
  
  private r.b f;
  
  private Drawable g;
  
  private r.b h;
  
  private Drawable i;
  
  private r.b j;
  
  private r.b k;
  
  private PointF l;
  
  private ColorFilter m;
  
  private Drawable n;
  
  private List<Drawable> o;
  
  private Drawable p;
  
  private d q;
  
  public b(Resources paramResources) {
    this.a = paramResources;
    s();
  }
  
  public static b a(Resources paramResources) {
    return new b(paramResources);
  }
  
  private void s() {
    this.b = 300;
    this.c = null;
    r.b b1 = r;
    this.d = b1;
    this.e = null;
    this.f = b1;
    this.g = null;
    this.h = b1;
    this.i = null;
    this.j = b1;
    this.k = s;
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  private void t() {
    List<Drawable> list = this.o;
    if (list != null) {
      Iterator<Drawable> iterator = list.iterator();
      while (iterator.hasNext())
        i.a(iterator.next()); 
    } 
  }
  
  public a a() {
    t();
    return new a(this);
  }
  
  public b a(d paramd) {
    this.q = paramd;
    return this;
  }
  
  public ColorFilter b() {
    return this.m;
  }
  
  public PointF c() {
    return this.l;
  }
  
  public r.b d() {
    return this.k;
  }
  
  public Drawable e() {
    return this.n;
  }
  
  public int f() {
    return this.b;
  }
  
  public Drawable g() {
    return this.g;
  }
  
  public r.b h() {
    return this.h;
  }
  
  public List<Drawable> i() {
    return this.o;
  }
  
  public Drawable j() {
    return this.c;
  }
  
  public r.b k() {
    return this.d;
  }
  
  public Drawable l() {
    return this.p;
  }
  
  public Drawable m() {
    return this.i;
  }
  
  public r.b n() {
    return this.j;
  }
  
  public Resources o() {
    return this.a;
  }
  
  public Drawable p() {
    return this.e;
  }
  
  public r.b q() {
    return this.f;
  }
  
  public d r() {
    return this.q;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */