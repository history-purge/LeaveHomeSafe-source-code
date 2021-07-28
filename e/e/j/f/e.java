package e.e.j.f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import e.e.e.d.i;
import e.e.e.e.a;
import e.e.j.e.d;
import e.e.j.e.k;
import e.e.j.e.l;
import e.e.j.e.m;
import e.e.j.e.n;
import e.e.j.e.p;
import e.e.j.e.q;
import e.e.j.e.r;
import e.e.l.p.b;

public class e {
  private static final Drawable a = (Drawable)new ColorDrawable(0);
  
  static Drawable a(Drawable paramDrawable, r.b paramb) {
    return a(paramDrawable, paramb, (PointF)null);
  }
  
  static Drawable a(Drawable paramDrawable, r.b paramb, PointF paramPointF) {
    if (b.c())
      b.a("WrappingUtils#maybeWrapWithScaleType"); 
    if (paramDrawable == null || paramb == null) {
      if (b.c())
        b.a(); 
      return paramDrawable;
    } 
    q q = new q(paramDrawable, paramb);
    if (paramPointF != null)
      q.a(paramPointF); 
    if (b.c())
      b.a(); 
    return (Drawable)q;
  }
  
  static Drawable a(Drawable paramDrawable, d paramd) {
    try {
      if (b.c())
        b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor"); 
      if (paramDrawable == null || paramd == null || paramd.h() != d.a.c)
        return paramDrawable; 
      n n = new n(paramDrawable);
      a((k)n, paramd);
      n.a(paramd.d());
      return (Drawable)n;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
  
  private static Drawable a(Drawable paramDrawable, d paramd, Resources paramResources) {
    l l;
    p p;
    m m;
    if (paramDrawable instanceof BitmapDrawable) {
      BitmapDrawable bitmapDrawable = (BitmapDrawable)paramDrawable;
      l = new l(paramResources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
      a((k)l, paramd);
      return (Drawable)l;
    } 
    if (l instanceof NinePatchDrawable) {
      p = new p((NinePatchDrawable)l);
      a((k)p, paramd);
      return (Drawable)p;
    } 
    if (p instanceof ColorDrawable && Build.VERSION.SDK_INT >= 11) {
      m = m.a((ColorDrawable)p);
      a((k)m, paramd);
      return (Drawable)m;
    } 
    a.c("WrappingUtils", "Don't know how to round that drawable: %s", new Object[] { m });
    return (Drawable)m;
  }
  
  static d a(d paramd) {
    while (true) {
      Drawable drawable = paramd.a();
      if (drawable != paramd) {
        if (!(drawable instanceof d))
          return paramd; 
        paramd = (d)drawable;
        continue;
      } 
      return paramd;
    } 
  }
  
  static q a(d paramd, r.b paramb) {
    Drawable drawable = a(paramd.a(a), paramb);
    paramd.a(drawable);
    i.a(drawable, "Parent has no child drawable!");
    return (q)drawable;
  }
  
  static void a(d paramd, d paramd1) {
    n n;
    Drawable drawable = paramd.a();
    if (paramd1 != null && paramd1.h() == d.a.c) {
      if (drawable instanceof n) {
        n = (n)drawable;
        a((k)n, paramd1);
        n.a(paramd1.d());
        return;
      } 
      n.a(a(n.a(a), paramd1));
      return;
    } 
    if (drawable instanceof n) {
      n.a(((n)drawable).b(a));
      a.setCallback(null);
    } 
  }
  
  static void a(d paramd, d paramd1, Resources paramResources) {
    paramd = a(paramd);
    Drawable drawable = paramd.a();
    if (paramd1 != null && paramd1.h() == d.a.d) {
      if (drawable instanceof k) {
        a((k)drawable, paramd1);
        return;
      } 
      if (drawable != null) {
        paramd.a(a);
        paramd.a(a(drawable, paramd1, paramResources));
        return;
      } 
    } else if (drawable instanceof k) {
      a((k)drawable);
    } 
  }
  
  static void a(k paramk) {
    paramk.a(false);
    paramk.b(0.0F);
    paramk.a(0, 0.0F);
    paramk.a(0.0F);
    paramk.c(false);
    paramk.b(false);
  }
  
  static void a(k paramk, d paramd) {
    paramk.a(paramd.g());
    paramk.a(paramd.c());
    paramk.a(paramd.a(), paramd.b());
    paramk.a(paramd.e());
    paramk.c(paramd.i());
    paramk.b(paramd.f());
  }
  
  static Drawable b(Drawable paramDrawable, d paramd, Resources paramResources) {
    try {
      if (b.c())
        b.a("WrappingUtils#maybeApplyLeafRounding"); 
      if (paramDrawable == null || paramd == null || paramd.h() != d.a.d)
        return paramDrawable; 
      if (paramDrawable instanceof e.e.j.e.h) {
        d d1 = a((d)paramDrawable);
        d1.a(a(d1.a(a), paramd, paramResources));
        return paramDrawable;
      } 
      paramDrawable = a(paramDrawable, paramd, paramResources);
      return paramDrawable;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */