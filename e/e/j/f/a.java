package e.e.j.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import e.e.e.d.i;
import e.e.j.e.d;
import e.e.j.e.g;
import e.e.j.e.h;
import e.e.j.e.i;
import e.e.j.e.q;
import e.e.j.e.r;
import e.e.j.h.c;
import e.e.l.p.b;
import java.util.Iterator;
import java.util.List;

public class a implements c {
  private final Drawable a;
  
  private final Resources b;
  
  private d c;
  
  private final c d;
  
  private final g e;
  
  private final h f;
  
  a(b paramb) {
    int i;
    int j;
    this.a = (Drawable)new ColorDrawable(0);
    if (b.c())
      b.a("GenericDraweeHierarchy()"); 
    this.b = paramb.o();
    this.c = paramb.r();
    this.f = new h(this.a);
    List<Drawable> list = paramb.i();
    byte b1 = 1;
    if (list != null) {
      i = paramb.i().size();
    } else {
      i = 1;
    } 
    if (paramb.l() != null) {
      j = 1;
    } else {
      j = 0;
    } 
    i += j;
    Drawable[] arrayOfDrawable = new Drawable[i + 6];
    arrayOfDrawable[0] = b(paramb.e(), null);
    arrayOfDrawable[1] = b(paramb.j(), paramb.k());
    arrayOfDrawable[2] = a((Drawable)this.f, paramb.d(), paramb.c(), paramb.b());
    arrayOfDrawable[3] = b(paramb.m(), paramb.n());
    arrayOfDrawable[4] = b(paramb.p(), paramb.q());
    arrayOfDrawable[5] = b(paramb.g(), paramb.h());
    if (i > 0) {
      j = b1;
      if (paramb.i() != null) {
        Iterator<Drawable> iterator = paramb.i().iterator();
        i = 0;
        while (true) {
          j = i;
          if (iterator.hasNext()) {
            arrayOfDrawable[i + 6] = b(iterator.next(), null);
            i++;
            continue;
          } 
          break;
        } 
      } 
      if (paramb.l() != null)
        arrayOfDrawable[j + 6] = b(paramb.l(), null); 
    } 
    this.e = new g(arrayOfDrawable);
    this.e.e(paramb.f());
    this.d = new c(e.a((Drawable)this.e, this.c));
    this.d.mutate();
    f();
    if (b.c())
      b.a(); 
  }
  
  private Drawable a(Drawable paramDrawable, r.b paramb, PointF paramPointF, ColorFilter paramColorFilter) {
    paramDrawable.setColorFilter(paramColorFilter);
    return e.a(paramDrawable, paramb, paramPointF);
  }
  
  private void a(float paramFloat) {
    Drawable drawable = this.e.a(3);
    if (drawable == null)
      return; 
    if (paramFloat >= 0.999F) {
      if (drawable instanceof Animatable)
        ((Animatable)drawable).stop(); 
      c(3);
    } else {
      if (drawable instanceof Animatable)
        ((Animatable)drawable).start(); 
      b(3);
    } 
    drawable.setLevel(Math.round(paramFloat * 10000.0F));
  }
  
  private void a(int paramInt, Drawable paramDrawable) {
    if (paramDrawable == null) {
      this.e.a(paramInt, null);
      return;
    } 
    paramDrawable = e.b(paramDrawable, this.c, this.b);
    d(paramInt).a(paramDrawable);
  }
  
  private Drawable b(Drawable paramDrawable, r.b paramb) {
    return e.a(e.b(paramDrawable, this.c, this.b), paramb);
  }
  
  private void b(int paramInt) {
    if (paramInt >= 0)
      this.e.c(paramInt); 
  }
  
  private void c(int paramInt) {
    if (paramInt >= 0)
      this.e.d(paramInt); 
  }
  
  private d d(int paramInt) {
    i i1;
    q q;
    d d2 = this.e.b(paramInt);
    d d1 = d2;
    if (d2.a() instanceof i)
      i1 = (i)d2.a(); 
    i i2 = i1;
    if (i1.a() instanceof q)
      q = (q)i1.a(); 
    return (d)q;
  }
  
  private void d() {
    c(1);
    c(2);
    c(3);
    c(4);
    c(5);
  }
  
  private q e(int paramInt) {
    d d1 = d(paramInt);
    return (d1 instanceof q) ? (q)d1 : e.a(d1, r.b.a);
  }
  
  private void e() {
    this.f.a(this.a);
  }
  
  private void f() {
    g g1 = this.e;
    if (g1 != null) {
      g1.b();
      this.e.d();
      d();
      b(1);
      this.e.e();
      this.e.c();
    } 
  }
  
  public void a() {
    e();
    f();
  }
  
  public void a(float paramFloat, boolean paramBoolean) {
    if (this.e.a(3) == null)
      return; 
    this.e.b();
    a(paramFloat);
    if (paramBoolean)
      this.e.e(); 
    this.e.c();
  }
  
  public void a(int paramInt) {
    this.e.e(paramInt);
  }
  
  public void a(Drawable paramDrawable) {
    this.d.d(paramDrawable);
  }
  
  public void a(Drawable paramDrawable, float paramFloat, boolean paramBoolean) {
    paramDrawable = e.b(paramDrawable, this.c, this.b);
    paramDrawable.mutate();
    this.f.a(paramDrawable);
    this.e.b();
    d();
    b(2);
    a(paramFloat);
    if (paramBoolean)
      this.e.e(); 
    this.e.c();
  }
  
  public void a(Drawable paramDrawable, r.b paramb) {
    a(1, paramDrawable);
    e(1).a(paramb);
  }
  
  public void a(r.b paramb) {
    i.a(paramb);
    e(2).a(paramb);
  }
  
  public void a(d paramd) {
    this.c = paramd;
    e.a((d)this.d, this.c);
    for (int i = 0; i < this.e.a(); i++)
      e.a(d(i), this.c, this.b); 
  }
  
  public void a(Throwable paramThrowable) {
    this.e.b();
    d();
    if (this.e.a(4) != null) {
      b(4);
    } else {
      b(1);
    } 
    this.e.c();
  }
  
  public Drawable b() {
    return (Drawable)this.d;
  }
  
  public void b(Drawable paramDrawable) {
    a(0, paramDrawable);
  }
  
  public void b(Throwable paramThrowable) {
    this.e.b();
    d();
    if (this.e.a(5) != null) {
      b(5);
    } else {
      b(1);
    } 
    this.e.c();
  }
  
  public d c() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */