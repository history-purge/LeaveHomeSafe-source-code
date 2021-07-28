package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import b.a.j;

class v extends r {
  private final SeekBar d;
  
  private Drawable e;
  
  private ColorStateList f = null;
  
  private PorterDuff.Mode g = null;
  
  private boolean h = false;
  
  private boolean i = false;
  
  v(SeekBar paramSeekBar) {
    super((ProgressBar)paramSeekBar);
    this.d = paramSeekBar;
  }
  
  private void d() {
    if (this.e != null && (this.h || this.i)) {
      this.e = a.i(this.e.mutate());
      if (this.h)
        a.a(this.e, this.f); 
      if (this.i)
        a.a(this.e, this.g); 
      if (this.e.isStateful())
        this.e.setState(this.d.getDrawableState()); 
    } 
  }
  
  void a(Canvas paramCanvas) {
    if (this.e != null) {
      int j = this.d.getMax();
      int i = 1;
      if (j > 1) {
        int k = this.e.getIntrinsicWidth();
        int m = this.e.getIntrinsicHeight();
        if (k >= 0) {
          k /= 2;
        } else {
          k = 1;
        } 
        if (m >= 0)
          i = m / 2; 
        this.e.setBounds(-k, -i, k, i);
        float f = (this.d.getWidth() - this.d.getPaddingLeft() - this.d.getPaddingRight()) / j;
        i = paramCanvas.save();
        paramCanvas.translate(this.d.getPaddingLeft(), (this.d.getHeight() / 2));
        for (k = 0; k <= j; k++) {
          this.e.draw(paramCanvas);
          paramCanvas.translate(f, 0.0F);
        } 
        paramCanvas.restoreToCount(i);
      } 
    } 
  }
  
  void a(Drawable paramDrawable) {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.setCallback(null); 
    this.e = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this.d);
      a.a(paramDrawable, b.g.m.v.p((View)this.d));
      if (paramDrawable.isStateful())
        paramDrawable.setState(this.d.getDrawableState()); 
      d();
    } 
    this.d.invalidate();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    super.a(paramAttributeSet, paramInt);
    x0 x0 = x0.a(this.d.getContext(), paramAttributeSet, j.AppCompatSeekBar, paramInt, 0);
    SeekBar seekBar = this.d;
    b.g.m.v.a((View)seekBar, seekBar.getContext(), j.AppCompatSeekBar, paramAttributeSet, x0.a(), paramInt, 0);
    Drawable drawable = x0.c(j.AppCompatSeekBar_android_thumb);
    if (drawable != null)
      this.d.setThumb(drawable); 
    a(x0.b(j.AppCompatSeekBar_tickMark));
    if (x0.g(j.AppCompatSeekBar_tickMarkTintMode)) {
      this.g = e0.a(x0.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
      this.i = true;
    } 
    if (x0.g(j.AppCompatSeekBar_tickMarkTint)) {
      this.f = x0.a(j.AppCompatSeekBar_tickMarkTint);
      this.h = true;
    } 
    x0.b();
    d();
  }
  
  void b() {
    Drawable drawable = this.e;
    if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState()))
      this.d.invalidateDrawable(drawable); 
  }
  
  void c() {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */