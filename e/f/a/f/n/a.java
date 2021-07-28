package e.f.a.f.n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import b.c.a.a;
import e.f.a.f.a0.k;
import e.f.a.f.a0.n;
import e.f.a.f.b;

public class a extends a implements Checkable, n {
  private static final int[] m = new int[] { 16842911 };
  
  private static final int[] n = new int[] { 16842912 };
  
  private static final int[] o = new int[] { b.state_dragged };
  
  private final b h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private a l;
  
  private void e() {
    if (Build.VERSION.SDK_INT <= 26)
      return; 
    this.h.a();
    throw null;
  }
  
  public boolean c() {
    b b1 = this.h;
    if (b1 == null)
      return false; 
    b1.o();
    throw null;
  }
  
  public boolean d() {
    return this.k;
  }
  
  public ColorStateList getCardBackgroundColor() {
    this.h.c();
    throw null;
  }
  
  float getCardViewRadius() {
    return a(this);
  }
  
  public Drawable getCheckedIcon() {
    this.h.d();
    throw null;
  }
  
  public ColorStateList getCheckedIconTint() {
    this.h.e();
    throw null;
  }
  
  public int getContentPaddingBottom() {
    this.h.m();
    throw null;
  }
  
  public int getContentPaddingLeft() {
    this.h.m();
    throw null;
  }
  
  public int getContentPaddingRight() {
    this.h.m();
    throw null;
  }
  
  public int getContentPaddingTop() {
    this.h.m();
    throw null;
  }
  
  public float getProgress() {
    this.h.g();
    throw null;
  }
  
  public float getRadius() {
    this.h.f();
    throw null;
  }
  
  public ColorStateList getRippleColor() {
    this.h.h();
    throw null;
  }
  
  public k getShapeAppearanceModel() {
    this.h.i();
    throw null;
  }
  
  @Deprecated
  public int getStrokeColor() {
    this.h.j();
    throw null;
  }
  
  public ColorStateList getStrokeColorStateList() {
    this.h.k();
    throw null;
  }
  
  public int getStrokeWidth() {
    this.h.l();
    throw null;
  }
  
  public boolean isChecked() {
    return this.j;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.h.b();
    throw null;
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 3);
    if (c())
      FrameLayout.mergeDrawableStates(arrayOfInt, m); 
    if (isChecked())
      FrameLayout.mergeDrawableStates(arrayOfInt, n); 
    if (d())
      FrameLayout.mergeDrawableStates(arrayOfInt, o); 
    return arrayOfInt;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(a.class.getName());
    paramAccessibilityEvent.setChecked(isChecked());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(a.class.getName());
    paramAccessibilityNodeInfo.setCheckable(c());
    paramAccessibilityNodeInfo.setClickable(isClickable());
    paramAccessibilityNodeInfo.setChecked(isChecked());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    this.h.a(getMeasuredWidth(), getMeasuredHeight());
    throw null;
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (!this.i)
      return; 
    this.h.n();
    throw null;
  }
  
  void setBackgroundInternal(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setCardBackgroundColor(int paramInt) {
    this.h.a(ColorStateList.valueOf(paramInt));
    throw null;
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    this.h.a(paramColorStateList);
    throw null;
  }
  
  public void setCardElevation(float paramFloat) {
    super.setCardElevation(paramFloat);
    this.h.q();
    throw null;
  }
  
  public void setCheckable(boolean paramBoolean) {
    this.h.a(paramBoolean);
    throw null;
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.j != paramBoolean)
      toggle(); 
  }
  
  public void setCheckedIcon(Drawable paramDrawable) {
    this.h.a(paramDrawable);
    throw null;
  }
  
  public void setCheckedIconResource(int paramInt) {
    this.h.a(b.a.k.a.a.c(getContext(), paramInt));
    throw null;
  }
  
  public void setCheckedIconTint(ColorStateList paramColorStateList) {
    this.h.b(paramColorStateList);
    throw null;
  }
  
  public void setClickable(boolean paramBoolean) {
    super.setClickable(paramBoolean);
    this.h.p();
    throw null;
  }
  
  public void setDragged(boolean paramBoolean) {
    if (this.k != paramBoolean) {
      this.k = paramBoolean;
      refreshDrawableState();
      e();
      invalidate();
    } 
  }
  
  public void setMaxCardElevation(float paramFloat) {
    super.setMaxCardElevation(paramFloat);
    this.h.r();
    throw null;
  }
  
  public void setOnCheckedChangeListener(a parama) {
    this.l = parama;
  }
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    super.setPreventCornerOverlap(paramBoolean);
    this.h.r();
    throw null;
  }
  
  public void setProgress(float paramFloat) {
    this.h.b(paramFloat);
    throw null;
  }
  
  public void setRadius(float paramFloat) {
    super.setRadius(paramFloat);
    this.h.a(paramFloat);
    throw null;
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    this.h.c(paramColorStateList);
    throw null;
  }
  
  public void setRippleColorResource(int paramInt) {
    this.h.c(b.a.k.a.a.b(getContext(), paramInt));
    throw null;
  }
  
  public void setShapeAppearanceModel(k paramk) {
    this.h.a(paramk);
    throw null;
  }
  
  public void setStrokeColor(int paramInt) {
    this.h.d(ColorStateList.valueOf(paramInt));
    throw null;
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    this.h.d(paramColorStateList);
    throw null;
  }
  
  public void setStrokeWidth(int paramInt) {
    this.h.a(paramInt);
    throw null;
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    super.setUseCompatPadding(paramBoolean);
    this.h.r();
    throw null;
  }
  
  public void toggle() {
    if (c() && isEnabled()) {
      this.j ^= 0x1;
      refreshDrawableState();
      e();
      a a1 = this.l;
      if (a1 != null)
        a1.a(this, this.j); 
    } 
  }
  
  public static interface a {
    void a(a param1a, boolean param1Boolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */