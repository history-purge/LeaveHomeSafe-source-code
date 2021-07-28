package e.f.a.f.a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {
  d a = h.a();
  
  d b = h.a();
  
  d c = h.a();
  
  d d = h.a();
  
  c e = new a(0.0F);
  
  c f = new a(0.0F);
  
  c g = new a(0.0F);
  
  c h = new a(0.0F);
  
  f i = h.b();
  
  f j = h.b();
  
  f k = h.b();
  
  f l = h.b();
  
  static {
    new i(0.5F);
  }
  
  public k() {}
  
  private k(b paramb) {}
  
  private static c a(TypedArray paramTypedArray, int paramInt, c paramc) {
    TypedValue typedValue = paramTypedArray.peekValue(paramInt);
    if (typedValue == null)
      return paramc; 
    paramInt = typedValue.type;
    return (paramInt == 5) ? new a(TypedValue.complexToDimensionPixelSize(typedValue.data, paramTypedArray.getResources().getDisplayMetrics())) : ((paramInt == 6) ? new i(typedValue.getFraction(1.0F, 1.0F)) : paramc);
  }
  
  public static b a(Context paramContext, int paramInt1, int paramInt2) {
    return a(paramContext, paramInt1, paramInt2, 0);
  }
  
  private static b a(Context paramContext, int paramInt1, int paramInt2, int paramInt3) {
    return a(paramContext, paramInt1, paramInt2, new a(paramInt3));
  }
  
  private static b a(Context paramContext, int paramInt1, int paramInt2, c paramc) {
    ContextThemeWrapper contextThemeWrapper;
    Context context = paramContext;
    int i = paramInt1;
    if (paramInt2 != 0) {
      contextThemeWrapper = new ContextThemeWrapper(paramContext, paramInt1);
      i = paramInt2;
    } 
    TypedArray typedArray = contextThemeWrapper.obtainStyledAttributes(i, e.f.a.f.k.ShapeAppearance);
    try {
      int j = typedArray.getInt(e.f.a.f.k.ShapeAppearance_cornerFamily, 0);
      paramInt1 = typedArray.getInt(e.f.a.f.k.ShapeAppearance_cornerFamilyTopLeft, j);
      paramInt2 = typedArray.getInt(e.f.a.f.k.ShapeAppearance_cornerFamilyTopRight, j);
      i = typedArray.getInt(e.f.a.f.k.ShapeAppearance_cornerFamilyBottomRight, j);
      j = typedArray.getInt(e.f.a.f.k.ShapeAppearance_cornerFamilyBottomLeft, j);
      c c3 = a(typedArray, e.f.a.f.k.ShapeAppearance_cornerSize, paramc);
      paramc = a(typedArray, e.f.a.f.k.ShapeAppearance_cornerSizeTopLeft, c3);
      c c1 = a(typedArray, e.f.a.f.k.ShapeAppearance_cornerSizeTopRight, c3);
      c c2 = a(typedArray, e.f.a.f.k.ShapeAppearance_cornerSizeBottomRight, c3);
      c3 = a(typedArray, e.f.a.f.k.ShapeAppearance_cornerSizeBottomLeft, c3);
      b b = new b();
      b.c(paramInt1, paramc);
      b.d(paramInt2, c1);
      b.b(i, c2);
      b.a(j, c3);
      return b;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static b a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    return a(paramContext, paramAttributeSet, paramInt1, paramInt2, 0);
  }
  
  public static b a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, int paramInt3) {
    return a(paramContext, paramAttributeSet, paramInt1, paramInt2, new a(paramInt3));
  }
  
  public static b a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, c paramc) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.f.a.f.k.MaterialShape, paramInt1, paramInt2);
    paramInt1 = typedArray.getResourceId(e.f.a.f.k.MaterialShape_shapeAppearance, 0);
    paramInt2 = typedArray.getResourceId(e.f.a.f.k.MaterialShape_shapeAppearanceOverlay, 0);
    typedArray.recycle();
    return a(paramContext, paramInt1, paramInt2, paramc);
  }
  
  public static b n() {
    return new b();
  }
  
  public f a() {
    return this.k;
  }
  
  public k a(float paramFloat) {
    b b = m();
    b.a(paramFloat);
    return b.a();
  }
  
  public k a(c paramc) {
    b b = m();
    b.c(paramc.a(j()));
    b.d(paramc.a(l()));
    b.a(paramc.a(c()));
    b.b(paramc.a(e()));
    return b.a();
  }
  
  public boolean a(RectF paramRectF) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    if (this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    float f1 = this.e.a(paramRectF);
    if (this.f.a(paramRectF) == f1 && this.h.a(paramRectF) == f1 && this.g.a(paramRectF) == f1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.b instanceof j && this.a instanceof j && this.c instanceof j && this.d instanceof j) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    return (bool1 && bool2 && bool3);
  }
  
  public d b() {
    return this.d;
  }
  
  public c c() {
    return this.h;
  }
  
  public d d() {
    return this.c;
  }
  
  public c e() {
    return this.g;
  }
  
  public f f() {
    return this.l;
  }
  
  public f g() {
    return this.j;
  }
  
  public f h() {
    return this.i;
  }
  
  public d i() {
    return this.a;
  }
  
  public c j() {
    return this.e;
  }
  
  public d k() {
    return this.b;
  }
  
  public c l() {
    return this.f;
  }
  
  public b m() {
    return new b(this);
  }
  
  public static final class b {
    private d a = h.a();
    
    private d b = h.a();
    
    private d c = h.a();
    
    private d d = h.a();
    
    private c e = new a(0.0F);
    
    private c f = new a(0.0F);
    
    private c g = new a(0.0F);
    
    private c h = new a(0.0F);
    
    private f i = h.b();
    
    private f j = h.b();
    
    private f k = h.b();
    
    private f l = h.b();
    
    public b() {}
    
    public b(k param1k) {
      this.a = param1k.a;
      this.b = param1k.b;
      this.c = param1k.c;
      this.d = param1k.d;
      this.e = param1k.e;
      this.f = param1k.f;
      this.g = param1k.g;
      this.h = param1k.h;
      this.i = param1k.i;
      this.j = param1k.j;
      this.k = param1k.k;
      this.l = param1k.l;
    }
    
    private static float e(d param1d) {
      return (param1d instanceof j) ? ((j)param1d).a : ((param1d instanceof e) ? ((e)param1d).a : -1.0F);
    }
    
    public b a(float param1Float) {
      d(param1Float);
      e(param1Float);
      c(param1Float);
      b(param1Float);
      return this;
    }
    
    public b a(int param1Int, c param1c) {
      a(h.a(param1Int));
      a(param1c);
      return this;
    }
    
    public b a(c param1c) {
      this.h = param1c;
      return this;
    }
    
    public b a(d param1d) {
      this.d = param1d;
      float f1 = e(param1d);
      if (f1 != -1.0F)
        b(f1); 
      return this;
    }
    
    public k a() {
      return new k(this, null);
    }
    
    public b b(float param1Float) {
      this.h = new a(param1Float);
      return this;
    }
    
    public b b(int param1Int, c param1c) {
      b(h.a(param1Int));
      b(param1c);
      return this;
    }
    
    public b b(c param1c) {
      this.g = param1c;
      return this;
    }
    
    public b b(d param1d) {
      this.c = param1d;
      float f1 = e(param1d);
      if (f1 != -1.0F)
        c(f1); 
      return this;
    }
    
    public b c(float param1Float) {
      this.g = new a(param1Float);
      return this;
    }
    
    public b c(int param1Int, c param1c) {
      c(h.a(param1Int));
      c(param1c);
      return this;
    }
    
    public b c(c param1c) {
      this.e = param1c;
      return this;
    }
    
    public b c(d param1d) {
      this.a = param1d;
      float f1 = e(param1d);
      if (f1 != -1.0F)
        d(f1); 
      return this;
    }
    
    public b d(float param1Float) {
      this.e = new a(param1Float);
      return this;
    }
    
    public b d(int param1Int, c param1c) {
      d(h.a(param1Int));
      d(param1c);
      return this;
    }
    
    public b d(c param1c) {
      this.f = param1c;
      return this;
    }
    
    public b d(d param1d) {
      this.b = param1d;
      float f1 = e(param1d);
      if (f1 != -1.0F)
        e(f1); 
      return this;
    }
    
    public b e(float param1Float) {
      this.f = new a(param1Float);
      return this;
    }
  }
  
  public static interface c {
    c a(c param1c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */