package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b.g.m.v;
import com.google.android.material.internal.h;
import e.f.a.f.a0.g;
import e.f.a.f.a0.k;
import e.f.a.f.a0.n;
import e.f.a.f.b;
import e.f.a.f.k;
import e.f.a.f.x.c;
import e.f.a.f.y.b;

class a {
  private static final boolean s;
  
  private final MaterialButton a;
  
  private k b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private PorterDuff.Mode i;
  
  private ColorStateList j;
  
  private ColorStateList k;
  
  private ColorStateList l;
  
  private Drawable m;
  
  private boolean n = false;
  
  private boolean o = false;
  
  private boolean p = false;
  
  private boolean q;
  
  private LayerDrawable r;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    s = bool;
  }
  
  a(MaterialButton paramMaterialButton, k paramk) {
    this.a = paramMaterialButton;
    this.b = paramk;
  }
  
  private InsetDrawable a(Drawable paramDrawable) {
    return new InsetDrawable(paramDrawable, this.c, this.e, this.d, this.f);
  }
  
  private void b(k paramk) {
    if (c() != null)
      c().setShapeAppearanceModel(paramk); 
    if (n() != null)
      n().setShapeAppearanceModel(paramk); 
    if (b() != null)
      b().setShapeAppearanceModel(paramk); 
  }
  
  private g c(boolean paramBoolean) {
    LayerDrawable layerDrawable = this.r;
    if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
      if (s) {
        layerDrawable = (LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable();
        return (g)layerDrawable.getDrawable(paramBoolean ^ true);
      } 
      layerDrawable = this.r;
      return (g)layerDrawable.getDrawable(paramBoolean ^ true);
    } 
    return null;
  }
  
  private Drawable m() {
    boolean bool;
    g g1 = new g(this.b);
    g1.a(this.a.getContext());
    androidx.core.graphics.drawable.a.a((Drawable)g1, this.j);
    PorterDuff.Mode mode = this.i;
    if (mode != null)
      androidx.core.graphics.drawable.a.a((Drawable)g1, mode); 
    g1.a(this.h, this.k);
    g g2 = new g(this.b);
    g2.setTint(0);
    float f = this.h;
    if (this.n) {
      bool = e.f.a.f.q.a.a((View)this.a, b.colorSurface);
    } else {
      bool = false;
    } 
    g2.a(f, bool);
    if (s) {
      this.m = (Drawable)new g(this.b);
      androidx.core.graphics.drawable.a.b(this.m, -1);
      this.r = (LayerDrawable)new RippleDrawable(b.a(this.l), (Drawable)a((Drawable)new LayerDrawable(new Drawable[] { (Drawable)g2, (Drawable)g1 }, )), this.m);
      return (Drawable)this.r;
    } 
    this.m = (Drawable)new e.f.a.f.y.a(this.b);
    androidx.core.graphics.drawable.a.a(this.m, b.a(this.l));
    this.r = new LayerDrawable(new Drawable[] { (Drawable)g2, (Drawable)g1, this.m });
    return (Drawable)a((Drawable)this.r);
  }
  
  private g n() {
    return c(true);
  }
  
  private void o() {
    g g1 = c();
    g g2 = n();
    if (g1 != null) {
      g1.a(this.h, this.k);
      if (g2 != null) {
        boolean bool;
        float f = this.h;
        if (this.n) {
          bool = e.f.a.f.q.a.a((View)this.a, b.colorSurface);
        } else {
          bool = false;
        } 
        g2.a(f, bool);
      } 
    } 
  }
  
  int a() {
    return this.g;
  }
  
  void a(int paramInt) {
    if (c() != null)
      c().setTint(paramInt); 
  }
  
  void a(int paramInt1, int paramInt2) {
    Drawable drawable = this.m;
    if (drawable != null)
      drawable.setBounds(this.c, this.e, paramInt2 - this.d, paramInt1 - this.f); 
  }
  
  void a(ColorStateList paramColorStateList) {
    if (this.l != paramColorStateList) {
      this.l = paramColorStateList;
      if (s && this.a.getBackground() instanceof RippleDrawable) {
        ((RippleDrawable)this.a.getBackground()).setColor(b.a(paramColorStateList));
        return;
      } 
      if (!s && this.a.getBackground() instanceof e.f.a.f.y.a)
        ((e.f.a.f.y.a)this.a.getBackground()).setTintList(b.a(paramColorStateList)); 
    } 
  }
  
  void a(TypedArray paramTypedArray) {
    this.c = paramTypedArray.getDimensionPixelOffset(k.MaterialButton_android_insetLeft, 0);
    this.d = paramTypedArray.getDimensionPixelOffset(k.MaterialButton_android_insetRight, 0);
    this.e = paramTypedArray.getDimensionPixelOffset(k.MaterialButton_android_insetTop, 0);
    this.f = paramTypedArray.getDimensionPixelOffset(k.MaterialButton_android_insetBottom, 0);
    if (paramTypedArray.hasValue(k.MaterialButton_cornerRadius)) {
      this.g = paramTypedArray.getDimensionPixelSize(k.MaterialButton_cornerRadius, -1);
      a(this.b.a(this.g));
      this.p = true;
    } 
    this.h = paramTypedArray.getDimensionPixelSize(k.MaterialButton_strokeWidth, 0);
    this.i = h.a(paramTypedArray.getInt(k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
    this.j = c.a(this.a.getContext(), paramTypedArray, k.MaterialButton_backgroundTint);
    this.k = c.a(this.a.getContext(), paramTypedArray, k.MaterialButton_strokeColor);
    this.l = c.a(this.a.getContext(), paramTypedArray, k.MaterialButton_rippleColor);
    this.q = paramTypedArray.getBoolean(k.MaterialButton_android_checkable, false);
    int i = paramTypedArray.getDimensionPixelSize(k.MaterialButton_elevation, 0);
    int j = v.u((View)this.a);
    int m = this.a.getPaddingTop();
    int n = v.t((View)this.a);
    int i1 = this.a.getPaddingBottom();
    this.a.setInternalBackground(m());
    g g = c();
    if (g != null)
      g.a(i); 
    v.a((View)this.a, j + this.c, m + this.e, n + this.d, i1 + this.f);
  }
  
  void a(PorterDuff.Mode paramMode) {
    if (this.i != paramMode) {
      this.i = paramMode;
      if (c() != null && this.i != null)
        androidx.core.graphics.drawable.a.a((Drawable)c(), this.i); 
    } 
  }
  
  void a(k paramk) {
    this.b = paramk;
    b(paramk);
  }
  
  void a(boolean paramBoolean) {
    this.q = paramBoolean;
  }
  
  public n b() {
    LayerDrawable layerDrawable = this.r;
    if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
      if (this.r.getNumberOfLayers() > 2) {
        Drawable drawable1 = this.r.getDrawable(2);
        return (n)drawable1;
      } 
      Drawable drawable = this.r.getDrawable(1);
      return (n)drawable;
    } 
    return null;
  }
  
  void b(int paramInt) {
    if (!this.p || this.g != paramInt) {
      this.g = paramInt;
      this.p = true;
      a(this.b.a(paramInt));
    } 
  }
  
  void b(ColorStateList paramColorStateList) {
    if (this.k != paramColorStateList) {
      this.k = paramColorStateList;
      o();
    } 
  }
  
  void b(boolean paramBoolean) {
    this.n = paramBoolean;
    o();
  }
  
  g c() {
    return c(false);
  }
  
  void c(int paramInt) {
    if (this.h != paramInt) {
      this.h = paramInt;
      o();
    } 
  }
  
  void c(ColorStateList paramColorStateList) {
    if (this.j != paramColorStateList) {
      this.j = paramColorStateList;
      if (c() != null)
        androidx.core.graphics.drawable.a.a((Drawable)c(), this.j); 
    } 
  }
  
  ColorStateList d() {
    return this.l;
  }
  
  k e() {
    return this.b;
  }
  
  ColorStateList f() {
    return this.k;
  }
  
  int g() {
    return this.h;
  }
  
  ColorStateList h() {
    return this.j;
  }
  
  PorterDuff.Mode i() {
    return this.i;
  }
  
  boolean j() {
    return this.o;
  }
  
  boolean k() {
    return this.q;
  }
  
  void l() {
    this.o = true;
    this.a.setSupportBackgroundTintList(this.j);
    this.a.setSupportBackgroundTintMode(this.i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/button/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */