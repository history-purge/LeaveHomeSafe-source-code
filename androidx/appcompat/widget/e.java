package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b.a.j;
import b.g.m.v;

class e {
  private final View a;
  
  private final j b;
  
  private int c = -1;
  
  private v0 d;
  
  private v0 e;
  
  private v0 f;
  
  e(View paramView) {
    this.a = paramView;
    this.b = j.b();
  }
  
  private boolean b(Drawable paramDrawable) {
    if (this.f == null)
      this.f = new v0(); 
    v0 v01 = this.f;
    v01.a();
    ColorStateList colorStateList = v.h(this.a);
    if (colorStateList != null) {
      v01.d = true;
      v01.a = colorStateList;
    } 
    PorterDuff.Mode mode = v.i(this.a);
    if (mode != null) {
      v01.c = true;
      v01.b = mode;
    } 
    if (v01.d || v01.c) {
      j.a(paramDrawable, v01, this.a.getDrawableState());
      return true;
    } 
    return false;
  }
  
  private boolean d() {
    int i = Build.VERSION.SDK_INT;
    return (i > 21) ? ((this.d != null)) : ((i == 21));
  }
  
  void a() {
    Drawable drawable = this.a.getBackground();
    if (drawable != null) {
      if (d() && b(drawable))
        return; 
      v0 v01 = this.e;
      if (v01 != null) {
        j.a(drawable, v01, this.a.getDrawableState());
        return;
      } 
      v01 = this.d;
      if (v01 != null)
        j.a(drawable, v01, this.a.getDrawableState()); 
    } 
  }
  
  void a(int paramInt) {
    this.c = paramInt;
    j j1 = this.b;
    if (j1 != null) {
      ColorStateList colorStateList = j1.b(this.a.getContext(), paramInt);
    } else {
      j1 = null;
    } 
    a((ColorStateList)j1);
    a();
  }
  
  void a(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if (this.d == null)
        this.d = new v0(); 
      v0 v01 = this.d;
      v01.a = paramColorStateList;
      v01.d = true;
    } else {
      this.d = null;
    } 
    a();
  }
  
  void a(PorterDuff.Mode paramMode) {
    if (this.e == null)
      this.e = new v0(); 
    v0 v01 = this.e;
    v01.b = paramMode;
    v01.c = true;
    a();
  }
  
  void a(Drawable paramDrawable) {
    this.c = -1;
    a((ColorStateList)null);
    a();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    x0 x0 = x0.a(this.a.getContext(), paramAttributeSet, j.ViewBackgroundHelper, paramInt, 0);
    View view = this.a;
    v.a(view, view.getContext(), j.ViewBackgroundHelper, paramAttributeSet, x0.a(), paramInt, 0);
    try {
      if (x0.g(j.ViewBackgroundHelper_android_background)) {
        this.c = x0.g(j.ViewBackgroundHelper_android_background, -1);
        ColorStateList colorStateList = this.b.b(this.a.getContext(), this.c);
        if (colorStateList != null)
          a(colorStateList); 
      } 
      if (x0.g(j.ViewBackgroundHelper_backgroundTint))
        v.a(this.a, x0.a(j.ViewBackgroundHelper_backgroundTint)); 
      if (x0.g(j.ViewBackgroundHelper_backgroundTintMode))
        v.a(this.a, e0.a(x0.d(j.ViewBackgroundHelper_backgroundTintMode, -1), null)); 
      return;
    } finally {
      x0.b();
    } 
  }
  
  ColorStateList b() {
    v0 v01 = this.e;
    return (v01 != null) ? v01.a : null;
  }
  
  void b(ColorStateList paramColorStateList) {
    if (this.e == null)
      this.e = new v0(); 
    v0 v01 = this.e;
    v01.a = paramColorStateList;
    v01.d = true;
    a();
  }
  
  PorterDuff.Mode c() {
    v0 v01 = this.e;
    return (v01 != null) ? v01.b : null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */