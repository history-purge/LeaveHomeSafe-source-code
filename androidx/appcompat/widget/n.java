package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.e;
import b.a.j;
import b.a.k.a.a;
import b.g.m.v;

public class n {
  private final ImageView a;
  
  private v0 b;
  
  private v0 c;
  
  private v0 d;
  
  public n(ImageView paramImageView) {
    this.a = paramImageView;
  }
  
  private boolean a(Drawable paramDrawable) {
    if (this.d == null)
      this.d = new v0(); 
    v0 v01 = this.d;
    v01.a();
    ColorStateList colorStateList = e.a(this.a);
    if (colorStateList != null) {
      v01.d = true;
      v01.a = colorStateList;
    } 
    PorterDuff.Mode mode = e.b(this.a);
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
  
  private boolean e() {
    int i = Build.VERSION.SDK_INT;
    return (i > 21) ? ((this.b != null)) : ((i == 21));
  }
  
  void a() {
    Drawable drawable = this.a.getDrawable();
    if (drawable != null)
      e0.b(drawable); 
    if (drawable != null) {
      if (e() && a(drawable))
        return; 
      v0 v01 = this.c;
      if (v01 != null) {
        j.a(drawable, v01, this.a.getDrawableState());
        return;
      } 
      v01 = this.b;
      if (v01 != null)
        j.a(drawable, v01, this.a.getDrawableState()); 
    } 
  }
  
  public void a(int paramInt) {
    if (paramInt != 0) {
      Drawable drawable = a.c(this.a.getContext(), paramInt);
      if (drawable != null)
        e0.b(drawable); 
      this.a.setImageDrawable(drawable);
    } else {
      this.a.setImageDrawable(null);
    } 
    a();
  }
  
  void a(ColorStateList paramColorStateList) {
    if (this.c == null)
      this.c = new v0(); 
    v0 v01 = this.c;
    v01.a = paramColorStateList;
    v01.d = true;
    a();
  }
  
  void a(PorterDuff.Mode paramMode) {
    if (this.c == null)
      this.c = new v0(); 
    v0 v01 = this.c;
    v01.b = paramMode;
    v01.c = true;
    a();
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt) {
    x0 x0 = x0.a(this.a.getContext(), paramAttributeSet, j.AppCompatImageView, paramInt, 0);
    ImageView imageView = this.a;
    v.a((View)imageView, imageView.getContext(), j.AppCompatImageView, paramAttributeSet, x0.a(), paramInt, 0);
    try {
      Drawable drawable2 = this.a.getDrawable();
      Drawable drawable1 = drawable2;
      if (drawable2 == null) {
        paramInt = x0.g(j.AppCompatImageView_srcCompat, -1);
        drawable1 = drawable2;
        if (paramInt != -1) {
          drawable2 = a.c(this.a.getContext(), paramInt);
          drawable1 = drawable2;
          if (drawable2 != null) {
            this.a.setImageDrawable(drawable2);
            drawable1 = drawable2;
          } 
        } 
      } 
      if (drawable1 != null)
        e0.b(drawable1); 
      if (x0.g(j.AppCompatImageView_tint))
        e.a(this.a, x0.a(j.AppCompatImageView_tint)); 
      if (x0.g(j.AppCompatImageView_tintMode))
        e.a(this.a, e0.a(x0.d(j.AppCompatImageView_tintMode, -1), null)); 
      return;
    } finally {
      x0.b();
    } 
  }
  
  ColorStateList b() {
    v0 v01 = this.c;
    return (v01 != null) ? v01.a : null;
  }
  
  PorterDuff.Mode c() {
    v0 v01 = this.c;
    return (v01 != null) ? v01.b : null;
  }
  
  boolean d() {
    Drawable drawable = this.a.getBackground();
    return !(Build.VERSION.SDK_INT >= 21 && drawable instanceof android.graphics.drawable.RippleDrawable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */