package e.e.j.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import e.e.e.d.h;
import e.e.e.d.i;
import e.e.e.e.a;
import e.e.j.e.u;
import e.e.j.e.v;
import e.e.j.h.a;
import e.e.j.h.b;

public class b<DH extends b> implements v {
  private boolean a = false;
  
  private boolean b = false;
  
  private boolean c = true;
  
  private DH d;
  
  private a e = null;
  
  private final e.e.j.b.b f = e.e.j.b.b.a();
  
  public b(DH paramDH) {
    if (paramDH != null)
      a(paramDH); 
  }
  
  public static <DH extends b> b<DH> a(DH paramDH, Context paramContext) {
    b<DH> b1 = new b<DH>(paramDH);
    b1.a(paramContext);
    return b1;
  }
  
  private void a(v paramv) {
    Drawable drawable = d();
    if (drawable instanceof u)
      ((u)drawable).a(paramv); 
  }
  
  private void h() {
    if (this.a)
      return; 
    this.f.a(e.e.j.b.b.a.i);
    this.a = true;
    a a1 = this.e;
    if (a1 != null && a1.c() != null)
      this.e.d(); 
  }
  
  private void i() {
    if (this.b && this.c) {
      h();
      return;
    } 
    j();
  }
  
  private void j() {
    if (!this.a)
      return; 
    this.f.a(e.e.j.b.b.a.j);
    this.a = false;
    if (e())
      this.e.b(); 
  }
  
  public void a() {
    if (this.a)
      return; 
    a.c(e.e.j.b.b.class, "%x: Draw requested for a non-attached controller %x. %s", new Object[] { Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString() });
    this.b = true;
    this.c = true;
    i();
  }
  
  public void a(Context paramContext) {}
  
  public void a(a parama) {
    boolean bool = this.a;
    if (bool)
      j(); 
    if (e()) {
      this.f.a(e.e.j.b.b.a.f);
      this.e.a(null);
    } 
    this.e = parama;
    if (this.e != null) {
      this.f.a(e.e.j.b.b.a.e);
      this.e.a((b)this.d);
    } else {
      this.f.a(e.e.j.b.b.a.g);
    } 
    if (bool)
      h(); 
  }
  
  public void a(DH paramDH) {
    boolean bool;
    this.f.a(e.e.j.b.b.a.c);
    boolean bool1 = e();
    a((v)null);
    i.a(paramDH);
    this.d = paramDH;
    Drawable drawable = this.d.b();
    if (drawable == null || drawable.isVisible()) {
      bool = true;
    } else {
      bool = false;
    } 
    a(bool);
    a(this);
    if (bool1)
      this.e.a((b)paramDH); 
  }
  
  public void a(boolean paramBoolean) {
    e.e.j.b.b.a a1;
    if (this.c == paramBoolean)
      return; 
    e.e.j.b.b b1 = this.f;
    if (paramBoolean) {
      a1 = e.e.j.b.b.a.s;
    } else {
      a1 = e.e.j.b.b.a.t;
    } 
    b1.a(a1);
    this.c = paramBoolean;
    i();
  }
  
  public boolean a(MotionEvent paramMotionEvent) {
    return !e() ? false : this.e.a(paramMotionEvent);
  }
  
  public a b() {
    return this.e;
  }
  
  public DH c() {
    DH dH = this.d;
    i.a(dH);
    return dH;
  }
  
  public Drawable d() {
    DH dH = this.d;
    return (dH == null) ? null : dH.b();
  }
  
  public boolean e() {
    a a1 = this.e;
    return (a1 != null && a1.c() == this.d);
  }
  
  public void f() {
    this.f.a(e.e.j.b.b.a.q);
    this.b = true;
    i();
  }
  
  public void g() {
    this.f.a(e.e.j.b.b.a.r);
    this.b = false;
    i();
  }
  
  public String toString() {
    h.b b1 = h.a(this);
    b1.a("controllerAttached", this.a);
    b1.a("holderAttached", this.b);
    b1.a("drawableVisible", this.c);
    b1.a("events", this.f.toString());
    return b1.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */