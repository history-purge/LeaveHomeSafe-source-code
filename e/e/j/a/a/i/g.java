package e.e.j.a.a.i;

import android.graphics.Rect;
import com.facebook.common.time.b;
import e.e.j.a.a.d;
import e.e.j.a.a.i.i.a;
import e.e.j.a.a.i.i.b;
import e.e.j.a.a.i.i.c;
import e.e.j.c.d;
import e.e.j.h.b;
import e.e.l.l.b;
import e.e.l.l.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class g {
  private final d a;
  
  private final b b;
  
  private final h c;
  
  private c d;
  
  private b e;
  
  private c f;
  
  private a g;
  
  private b h;
  
  private List<f> i;
  
  private boolean j;
  
  public g(b paramb, d paramd) {
    this.b = paramb;
    this.a = paramd;
    this.c = new h();
  }
  
  private void d() {
    if (this.g == null)
      this.g = new a(this.b, this.c, this); 
    if (this.f == null)
      this.f = new c(this.b, this.c); 
    if (this.e == null)
      this.e = (b)new b(this.c, this); 
    c c1 = this.d;
    if (c1 == null) {
      this.d = new c(this.a.l(), this.e);
    } else {
      c1.c(this.a.l());
    } 
    if (this.h == null)
      this.h = new b(new c[] { (c)this.f, (c)this.d }); 
  }
  
  public void a() {
    b b1 = this.a.c();
    if (b1 != null && b1.b() != null) {
      Rect rect = b1.b().getBounds();
      this.c.d(rect.width());
      this.c.c(rect.height());
    } 
  }
  
  public void a(f paramf) {
    if (paramf == null)
      return; 
    if (this.i == null)
      this.i = new LinkedList<f>(); 
    this.i.add(paramf);
  }
  
  public void a(h paramh, int paramInt) {
    if (this.j) {
      List<f> list = this.i;
      if (list != null) {
        if (list.isEmpty())
          return; 
        e e = paramh.c();
        Iterator<f> iterator = this.i.iterator();
        while (iterator.hasNext())
          ((f)iterator.next()).b(e, paramInt); 
      } 
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.j = paramBoolean;
    if (paramBoolean) {
      d();
      b b2 = this.e;
      if (b2 != null)
        this.a.a(b2); 
      a a1 = this.g;
      if (a1 != null)
        this.a.a((d)a1); 
      b b1 = this.h;
      if (b1 != null) {
        this.a.a((c)b1);
        return;
      } 
    } else {
      b b2 = this.e;
      if (b2 != null)
        this.a.b(b2); 
      a a1 = this.g;
      if (a1 != null)
        this.a.b((d)a1); 
      b b1 = this.h;
      if (b1 != null)
        this.a.b((c)b1); 
    } 
  }
  
  public void b() {
    List<f> list = this.i;
    if (list != null)
      list.clear(); 
  }
  
  public void b(h paramh, int paramInt) {
    paramh.a(paramInt);
    if (this.j) {
      List<f> list = this.i;
      if (list != null) {
        if (list.isEmpty())
          return; 
        if (paramInt == 3)
          a(); 
        e e = paramh.c();
        Iterator<f> iterator = this.i.iterator();
        while (iterator.hasNext())
          ((f)iterator.next()).a(e, paramInt); 
      } 
    } 
  }
  
  public void c() {
    b();
    a(false);
    this.c.b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */