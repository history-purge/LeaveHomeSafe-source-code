package e.e.j.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import e.e.e.d.e;
import e.e.e.d.h;
import e.e.e.d.i;
import e.e.e.d.l;
import e.e.e.e.a;
import e.e.e.h.a;
import e.e.g.c;
import e.e.i.a.a;
import e.e.j.a.a.h.a;
import e.e.j.a.a.i.b;
import e.e.j.a.a.i.f;
import e.e.j.a.a.i.g;
import e.e.j.b.a;
import e.e.j.c.a;
import e.e.j.d.a;
import e.e.j.d.b.a;
import e.e.j.d.b.b;
import e.e.j.e.q;
import e.e.j.e.r;
import e.e.j.h.b;
import e.e.l.d.p;
import e.e.l.j.a;
import e.e.l.k.b;
import e.e.l.k.e;
import e.e.l.l.c;
import e.e.l.p.b;
import java.util.Set;
import java.util.concurrent.Executor;

public class d extends a<a<b>, e> {
  private static final Class<?> F = d.class;
  
  private e<a> A;
  
  private g B;
  
  private Set<c> C;
  
  private b D;
  
  private a E;
  
  private final a u;
  
  private final e<a> v;
  
  private final p<e.e.c.a.d, b> w;
  
  private e.e.c.a.d x;
  
  private l<c<a<b>>> y;
  
  private boolean z;
  
  public d(Resources paramResources, a parama, a parama1, Executor paramExecutor, p<e.e.c.a.d, b> paramp, e<a> parame) {
    super(parama, paramExecutor, null, null);
    this.u = new a(paramResources, parama1);
    this.v = parame;
    this.w = paramp;
  }
  
  private Drawable a(e<a> parame, b paramb) {
    if (parame == null)
      return null; 
    for (a a1 : parame) {
      if (a1.a(paramb)) {
        Drawable drawable = a1.b(paramb);
        if (drawable != null)
          return drawable; 
      } 
    } 
    return null;
  }
  
  private void a(l<c<a<b>>> paraml) {
    this.y = paraml;
    a((b)null);
  }
  
  private void a(b paramb) {
    if (!this.z)
      return; 
    if (i() == null) {
      a a1 = new a();
      a a2 = new a((b)a1);
      this.E = new a();
      a((e.e.j.c.d)a2);
      b((Drawable)a1);
    } 
    if (this.D == null)
      a((b)this.E); 
    if (i() instanceof a)
      a(paramb, (a)i()); 
  }
  
  protected Drawable a(a<b> parama) {
    try {
      if (b.c())
        b.a("PipelineDraweeController#createDrawable"); 
      i.b(a.c(parama));
      b b1 = (b)parama.b();
      a(b1);
      Drawable drawable = a(this.A, b1);
      if (drawable != null)
        return drawable; 
      drawable = a(this.v, b1);
      if (drawable != null)
        return drawable; 
      drawable = this.u.b(b1);
      if (drawable != null)
        return drawable; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unrecognized image class: ");
      stringBuilder.append(b1);
      throw new UnsupportedOperationException(stringBuilder.toString());
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
  
  protected void a(Drawable paramDrawable) {
    if (paramDrawable instanceof a)
      ((a)paramDrawable).a(); 
  }
  
  public void a(e<a> parame) {
    this.A = parame;
  }
  
  public void a(l<c<a<b>>> paraml, String paramString, e.e.c.a.d paramd, Object paramObject, e<a> parame, b paramb) {
    if (b.c())
      b.a("PipelineDraweeController#initialize"); 
    a(paramString, paramObject);
    a(paraml);
    this.x = paramd;
    a(parame);
    p();
    a((b)null);
    a(paramb);
    if (b.c())
      b.a(); 
  }
  
  public void a(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield D : Le/e/j/a/a/i/b;
    //   6: instanceof e/e/j/a/a/i/a
    //   9: ifeq -> 26
    //   12: aload_0
    //   13: getfield D : Le/e/j/a/a/i/b;
    //   16: checkcast e/e/j/a/a/i/a
    //   19: aload_1
    //   20: invokevirtual a : (Le/e/j/a/a/i/b;)V
    //   23: goto -> 67
    //   26: aload_0
    //   27: getfield D : Le/e/j/a/a/i/b;
    //   30: ifnull -> 62
    //   33: aload_0
    //   34: new e/e/j/a/a/i/a
    //   37: dup
    //   38: iconst_2
    //   39: anewarray e/e/j/a/a/i/b
    //   42: dup
    //   43: iconst_0
    //   44: aload_0
    //   45: getfield D : Le/e/j/a/a/i/b;
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload_1
    //   52: aastore
    //   53: invokespecial <init> : ([Le/e/j/a/a/i/b;)V
    //   56: putfield D : Le/e/j/a/a/i/b;
    //   59: goto -> 67
    //   62: aload_0
    //   63: aload_1
    //   64: putfield D : Le/e/j/a/a/i/b;
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	70	finally
    //   26	59	70	finally
    //   62	67	70	finally
  }
  
  protected void a(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield B : Le/e/j/a/a/i/g;
    //   6: ifnull -> 16
    //   9: aload_0
    //   10: getfield B : Le/e/j/a/a/i/g;
    //   13: invokevirtual c : ()V
    //   16: aload_1
    //   17: ifnull -> 58
    //   20: aload_0
    //   21: getfield B : Le/e/j/a/a/i/g;
    //   24: ifnonnull -> 42
    //   27: aload_0
    //   28: new e/e/j/a/a/i/g
    //   31: dup
    //   32: invokestatic get : ()Lcom/facebook/common/time/AwakeTimeSinceBootClock;
    //   35: aload_0
    //   36: invokespecial <init> : (Lcom/facebook/common/time/b;Le/e/j/a/a/d;)V
    //   39: putfield B : Le/e/j/a/a/i/g;
    //   42: aload_0
    //   43: getfield B : Le/e/j/a/a/i/g;
    //   46: aload_1
    //   47: invokevirtual a : (Le/e/j/a/a/i/f;)V
    //   50: aload_0
    //   51: getfield B : Le/e/j/a/a/i/g;
    //   54: iconst_1
    //   55: invokevirtual a : (Z)V
    //   58: aload_0
    //   59: monitorexit
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	61	finally
    //   20	42	61	finally
    //   42	58	61	finally
  }
  
  public void a(b paramb) {
    super.a(paramb);
    a((b)null);
  }
  
  protected void a(b paramb, a parama) {
    parama.a(l());
    b b3 = c();
    r.b b2 = null;
    r.b b1 = b2;
    if (b3 != null) {
      q q = r.a(b3.b());
      b1 = b2;
      if (q != null)
        b1 = q.c(); 
    } 
    parama.a(b1);
    parama.b(this.E.a());
    if (paramb != null) {
      parama.a(paramb.b(), paramb.a());
      parama.a(paramb.d());
      return;
    } 
    parama.a();
  }
  
  public void a(c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield C : Ljava/util/Set;
    //   6: ifnonnull -> 20
    //   9: aload_0
    //   10: new java/util/HashSet
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield C : Ljava/util/Set;
    //   20: aload_0
    //   21: getfield C : Ljava/util/Set;
    //   24: aload_1
    //   25: invokeinterface add : (Ljava/lang/Object;)Z
    //   30: pop
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	34	finally
    //   20	31	34	finally
  }
  
  protected void a(String paramString, a<b> parama) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial b : (Ljava/lang/String;Ljava/lang/Object;)V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield D : Le/e/j/a/a/i/b;
    //   12: ifnull -> 30
    //   15: aload_0
    //   16: getfield D : Le/e/j/a/a/i/b;
    //   19: aload_1
    //   20: iconst_5
    //   21: iconst_1
    //   22: ldc_w 'PipelineDraweeController'
    //   25: invokeinterface a : (Ljava/lang/String;IZLjava/lang/String;)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   8	30	33	finally
    //   30	32	33	finally
    //   34	36	33	finally
  }
  
  protected int b(a<b> parama) {
    return (parama != null) ? parama.c() : 0;
  }
  
  public void b(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield D : Le/e/j/a/a/i/b;
    //   6: instanceof e/e/j/a/a/i/a
    //   9: ifeq -> 26
    //   12: aload_0
    //   13: getfield D : Le/e/j/a/a/i/b;
    //   16: checkcast e/e/j/a/a/i/a
    //   19: aload_1
    //   20: invokevirtual b : (Le/e/j/a/a/i/b;)V
    //   23: goto -> 67
    //   26: aload_0
    //   27: getfield D : Le/e/j/a/a/i/b;
    //   30: ifnull -> 62
    //   33: aload_0
    //   34: new e/e/j/a/a/i/a
    //   37: dup
    //   38: iconst_2
    //   39: anewarray e/e/j/a/a/i/b
    //   42: dup
    //   43: iconst_0
    //   44: aload_0
    //   45: getfield D : Le/e/j/a/a/i/b;
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload_1
    //   52: aastore
    //   53: invokespecial <init> : ([Le/e/j/a/a/i/b;)V
    //   56: putfield D : Le/e/j/a/a/i/b;
    //   59: goto -> 67
    //   62: aload_0
    //   63: aload_1
    //   64: putfield D : Le/e/j/a/a/i/b;
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	70	finally
    //   26	59	70	finally
    //   62	67	70	finally
  }
  
  public void b(c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield C : Ljava/util/Set;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield C : Ljava/util/Set;
    //   18: aload_1
    //   19: invokeinterface remove : (Ljava/lang/Object;)Z
    //   24: pop
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	28	finally
    //   14	25	28	finally
  }
  
  public void b(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  protected e c(a<b> parama) {
    i.b(a.c(parama));
    return (e)parama.b();
  }
  
  protected void d(a<b> parama) {
    a.b(parama);
  }
  
  protected a<b> g() {
    if (b.c())
      b.a("PipelineDraweeController#getCachedImage"); 
    try {
      if (this.w == null || this.x == null)
        return null; 
      a<b> a1 = this.w.get(this.x);
      if (a1 != null && !((b)a1.b()).c().a()) {
        a1.close();
        return null;
      } 
      return a1;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
  
  protected c<a<b>> j() {
    if (b.c())
      b.a("PipelineDraweeController#getDataSource"); 
    if (a.a(2))
      a.b(F, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this))); 
    c<a<b>> c = (c)this.y.get();
    if (b.c())
      b.a(); 
    return c;
  }
  
  protected void p() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield D : Le/e/j/a/a/i/b;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	10	finally
    //   11	13	10	finally
  }
  
  public c q() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: getfield D : Le/e/j/a/a/i/b;
    //   8: ifnull -> 27
    //   11: new e/e/j/a/a/i/c
    //   14: dup
    //   15: aload_0
    //   16: invokevirtual l : ()Ljava/lang/String;
    //   19: aload_0
    //   20: getfield D : Le/e/j/a/a/i/b;
    //   23: invokespecial <init> : (Ljava/lang/String;Le/e/j/a/a/i/b;)V
    //   26: astore_1
    //   27: aload_0
    //   28: getfield C : Ljava/util/Set;
    //   31: ifnull -> 59
    //   34: new e/e/l/l/b
    //   37: dup
    //   38: aload_0
    //   39: getfield C : Ljava/util/Set;
    //   42: invokespecial <init> : (Ljava/util/Set;)V
    //   45: astore_2
    //   46: aload_1
    //   47: ifnull -> 55
    //   50: aload_2
    //   51: aload_1
    //   52: invokevirtual a : (Le/e/l/l/c;)V
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_2
    //   58: areturn
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: areturn
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    // Exception table:
    //   from	to	target	type
    //   4	27	63	finally
    //   27	46	63	finally
    //   50	55	63	finally
  }
  
  public String toString() {
    h.b b1 = h.a(this);
    b1.a("super", super.toString());
    b1.a("dataSourceSupplier", this.y);
    return b1.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */