package e.e.j.c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import e.e.e.d.h;
import e.e.e.d.l;
import e.e.g.d;
import e.e.g.f;
import e.e.g.g;
import e.e.j.h.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements d {
  private static final d<Object> p = new a();
  
  private static final NullPointerException q = new NullPointerException("No image request was specified!");
  
  private static final AtomicLong r = new AtomicLong();
  
  private final Context a;
  
  private final Set<d> b;
  
  private Object c;
  
  private REQUEST d;
  
  private REQUEST e;
  
  private REQUEST[] f;
  
  private boolean g;
  
  private l<e.e.g.c<IMAGE>> h;
  
  private d<? super INFO> i;
  
  private e j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private String n;
  
  private e.e.j.h.a o;
  
  protected b(Context paramContext, Set<d> paramSet) {
    this.a = paramContext;
    this.b = paramSet;
    n();
  }
  
  protected static String m() {
    return String.valueOf(r.getAndIncrement());
  }
  
  private void n() {
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = true;
    this.i = null;
    this.j = null;
    this.k = false;
    this.l = false;
    this.o = null;
    this.n = null;
  }
  
  protected l<e.e.g.c<IMAGE>> a(e.e.j.h.a parama, String paramString) {
    l<e.e.g.c<IMAGE>> l1;
    g g2;
    l<e.e.g.c<IMAGE>> l2 = this.h;
    if (l2 != null)
      return l2; 
    l2 = null;
    REQUEST rEQUEST = this.d;
    if (rEQUEST != null) {
      l2 = a(parama, paramString, rEQUEST);
    } else {
      REQUEST[] arrayOfREQUEST = this.f;
      if (arrayOfREQUEST != null)
        l2 = a(parama, paramString, arrayOfREQUEST, this.g); 
    } 
    l<e.e.g.c<IMAGE>> l3 = l2;
    if (l2 != null) {
      l3 = l2;
      if (this.e != null) {
        ArrayList<l<e.e.g.c<IMAGE>>> arrayList = new ArrayList(2);
        arrayList.add(l2);
        arrayList.add(a(parama, paramString, this.e));
        g2 = g.a(arrayList, false);
      } 
    } 
    g g1 = g2;
    if (g2 == null)
      l1 = d.a(q); 
    return l1;
  }
  
  protected l<e.e.g.c<IMAGE>> a(e.e.j.h.a parama, String paramString, REQUEST paramREQUEST) {
    return a(parama, paramString, paramREQUEST, c.c);
  }
  
  protected l<e.e.g.c<IMAGE>> a(e.e.j.h.a parama, String paramString, REQUEST paramREQUEST, c paramc) {
    return new b(this, parama, paramString, paramREQUEST, c(), paramc);
  }
  
  protected l<e.e.g.c<IMAGE>> a(e.e.j.h.a parama, String paramString, REQUEST[] paramArrayOfREQUEST, boolean paramBoolean) {
    ArrayList<l<e.e.g.c<IMAGE>>> arrayList = new ArrayList(paramArrayOfREQUEST.length * 2);
    byte b1 = 0;
    int i = b1;
    if (paramBoolean) {
      int j = 0;
      while (true) {
        i = b1;
        if (j < paramArrayOfREQUEST.length) {
          arrayList.add(a(parama, paramString, paramArrayOfREQUEST[j], c.e));
          j++;
          continue;
        } 
        break;
      } 
    } 
    while (i < paramArrayOfREQUEST.length) {
      arrayList.add(a(parama, paramString, paramArrayOfREQUEST[i]));
      i++;
    } 
    return (l<e.e.g.c<IMAGE>>)f.a(arrayList);
  }
  
  protected abstract e.e.g.c<IMAGE> a(e.e.j.h.a parama, String paramString, REQUEST paramREQUEST, Object paramObject, c paramc);
  
  public a a() {
    l();
    if (this.d == null && this.f == null) {
      REQUEST rEQUEST = this.e;
      if (rEQUEST != null) {
        this.d = rEQUEST;
        this.e = null;
      } 
    } 
    return b();
  }
  
  public BUILDER a(d<? super INFO> paramd) {
    this.i = paramd;
    i();
    return (BUILDER)this;
  }
  
  public BUILDER a(e.e.j.h.a parama) {
    this.o = parama;
    i();
    return (BUILDER)this;
  }
  
  public BUILDER a(Object paramObject) {
    this.c = paramObject;
    i();
    return (BUILDER)this;
  }
  
  public BUILDER a(boolean paramBoolean) {
    this.l = paramBoolean;
    i();
    return (BUILDER)this;
  }
  
  protected void a(a parama) {
    Set<d> set = this.b;
    if (set != null) {
      Iterator<d> iterator = set.iterator();
      while (iterator.hasNext())
        parama.a(iterator.next()); 
    } 
    d<? super INFO> d1 = this.i;
    if (d1 != null)
      parama.a(d1); 
    if (this.l)
      parama.a(p); 
  }
  
  protected a b() {
    if (e.e.l.p.b.c())
      e.e.l.p.b.a("AbstractDraweeControllerBuilder#buildController"); 
    a a1 = j();
    a1.a(h());
    a1.a(d());
    a1.a(e());
    c(a1);
    a(a1);
    if (e.e.l.p.b.c())
      e.e.l.p.b.a(); 
    return a1;
  }
  
  public BUILDER b(REQUEST paramREQUEST) {
    this.d = paramREQUEST;
    i();
    return (BUILDER)this;
  }
  
  protected void b(a parama) {
    if (parama.k() == null)
      parama.a(e.e.j.g.a.a(this.a)); 
  }
  
  public BUILDER c(REQUEST paramREQUEST) {
    this.e = paramREQUEST;
    i();
    return (BUILDER)this;
  }
  
  public Object c() {
    return this.c;
  }
  
  protected void c(a parama) {
    if (!this.k)
      return; 
    parama.m().a(this.k);
    b(parama);
  }
  
  public String d() {
    return this.n;
  }
  
  public e e() {
    return this.j;
  }
  
  public REQUEST f() {
    return this.d;
  }
  
  public e.e.j.h.a g() {
    return this.o;
  }
  
  public boolean h() {
    return this.m;
  }
  
  protected final BUILDER i() {
    return (BUILDER)this;
  }
  
  protected abstract a j();
  
  public BUILDER k() {
    n();
    i();
    return (BUILDER)this;
  }
  
  protected void l() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : [Ljava/lang/Object;
    //   4: astore_3
    //   5: iconst_0
    //   6: istore_2
    //   7: aload_3
    //   8: ifnull -> 26
    //   11: aload_0
    //   12: getfield d : Ljava/lang/Object;
    //   15: ifnonnull -> 21
    //   18: goto -> 26
    //   21: iconst_0
    //   22: istore_1
    //   23: goto -> 28
    //   26: iconst_1
    //   27: istore_1
    //   28: iload_1
    //   29: ldc_w 'Cannot specify both ImageRequest and FirstAvailableImageRequests!'
    //   32: invokestatic b : (ZLjava/lang/Object;)V
    //   35: aload_0
    //   36: getfield h : Le/e/e/d/l;
    //   39: ifnull -> 69
    //   42: iload_2
    //   43: istore_1
    //   44: aload_0
    //   45: getfield f : [Ljava/lang/Object;
    //   48: ifnonnull -> 71
    //   51: iload_2
    //   52: istore_1
    //   53: aload_0
    //   54: getfield d : Ljava/lang/Object;
    //   57: ifnonnull -> 71
    //   60: iload_2
    //   61: istore_1
    //   62: aload_0
    //   63: getfield e : Ljava/lang/Object;
    //   66: ifnonnull -> 71
    //   69: iconst_1
    //   70: istore_1
    //   71: iload_1
    //   72: ldc_w 'Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.'
    //   75: invokestatic b : (ZLjava/lang/Object;)V
    //   78: return
  }
  
  static final class a extends c<Object> {
    public void a(String param1String, Object param1Object, Animatable param1Animatable) {
      if (param1Animatable != null)
        param1Animatable.start(); 
    }
  }
  
  class b implements l<e.e.g.c<IMAGE>> {
    b(b this$0, e.e.j.h.a param1a, String param1String, Object param1Object1, Object param1Object2, b.c param1c) {}
    
    public e.e.g.c<IMAGE> get() {
      return this.f.a(this.a, this.b, this.c, this.d, this.e);
    }
    
    public String toString() {
      h.b b1 = h.a(this);
      b1.a("request", this.c.toString());
      return b1.toString();
    }
  }
  
  public enum c {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */