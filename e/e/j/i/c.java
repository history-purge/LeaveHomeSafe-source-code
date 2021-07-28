package e.e.j.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import e.e.e.d.h;
import e.e.j.h.a;
import e.e.j.h.b;
import e.e.l.p.b;

public class c<DH extends b> extends ImageView {
  private static boolean h = false;
  
  private final a.a c = new a.a();
  
  private float d = 0.0F;
  
  private b<DH> e;
  
  private boolean f = false;
  
  private boolean g = false;
  
  public c(Context paramContext) {
    super(paramContext);
    a(paramContext);
  }
  
  private void a(Context paramContext) {
    try {
      if (b.c())
        b.a("DraweeView#init"); 
      boolean bool = this.f;
      if (bool)
        return; 
      bool = true;
      this.f = true;
      this.e = b.a(null, paramContext);
      if (Build.VERSION.SDK_INT >= 21) {
        ColorStateList colorStateList = getImageTintList();
        if (colorStateList == null)
          return; 
        setColorFilter(colorStateList.getDefaultColor());
      } 
      if (!h || (paramContext.getApplicationInfo()).targetSdkVersion < 24)
        bool = false; 
      this.g = bool;
      return;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
  
  private void e() {
    if (this.g) {
      Drawable drawable = getDrawable();
      if (drawable != null) {
        boolean bool;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        drawable.setVisible(bool, false);
      } 
    } 
  }
  
  public static void setGlobalLegacyVisibilityHandlingEnabled(boolean paramBoolean) {
    h = paramBoolean;
  }
  
  protected void a() {
    this.e.f();
  }
  
  protected void b() {
    this.e.g();
  }
  
  protected void c() {
    a();
  }
  
  protected void d() {
    b();
  }
  
  public float getAspectRatio() {
    return this.d;
  }
  
  public a getController() {
    return this.e.b();
  }
  
  public DH getHierarchy() {
    return this.e.c();
  }
  
  public Drawable getTopLevelDrawable() {
    return this.e.d();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    e();
    c();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    e();
    d();
  }
  
  public void onFinishTemporaryDetach() {
    super.onFinishTemporaryDetach();
    e();
    c();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    a.a a1 = this.c;
    a1.a = paramInt1;
    a1.b = paramInt2;
    a.a(a1, this.d, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
    a1 = this.c;
    super.onMeasure(a1.a, a1.b);
  }
  
  public void onStartTemporaryDetach() {
    super.onStartTemporaryDetach();
    e();
    d();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    return this.e.a(paramMotionEvent) ? true : super.onTouchEvent(paramMotionEvent);
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    e();
  }
  
  public void setAspectRatio(float paramFloat) {
    if (paramFloat == this.d)
      return; 
    this.d = paramFloat;
    requestLayout();
  }
  
  public void setController(a parama) {
    this.e.a(parama);
    super.setImageDrawable(this.e.d());
  }
  
  public void setHierarchy(DH paramDH) {
    this.e.a(paramDH);
    super.setImageDrawable(this.e.d());
  }
  
  @Deprecated
  public void setImageBitmap(Bitmap paramBitmap) {
    a(getContext());
    this.e.a((a)null);
    super.setImageBitmap(paramBitmap);
  }
  
  @Deprecated
  public void setImageDrawable(Drawable paramDrawable) {
    a(getContext());
    this.e.a((a)null);
    super.setImageDrawable(paramDrawable);
  }
  
  @Deprecated
  public void setImageResource(int paramInt) {
    a(getContext());
    this.e.a((a)null);
    super.setImageResource(paramInt);
  }
  
  @Deprecated
  public void setImageURI(Uri paramUri) {
    a(getContext());
    this.e.a((a)null);
    super.setImageURI(paramUri);
  }
  
  public void setLegacyVisibilityHandlingEnabled(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public String toString() {
    String str;
    h.b b2 = h.a(this);
    b<DH> b1 = this.e;
    if (b1 != null) {
      str = b1.toString();
    } else {
      str = "<no holder set>";
    } 
    b2.a("holder", str);
    return b2.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */