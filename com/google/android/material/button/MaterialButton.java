package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.f;
import androidx.core.widget.i;
import b.g.m.v;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;
import e.f.a.f.a0.h;
import e.f.a.f.a0.k;
import e.f.a.f.a0.n;
import e.f.a.f.j;
import e.f.a.f.k;
import e.f.a.f.x.c;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends f implements Checkable, n {
  private static final int[] q = new int[] { 16842911 };
  
  private static final int[] r = new int[] { 16842912 };
  
  private static final int s = j.Widget_MaterialComponents_Button;
  
  private final a e;
  
  private final LinkedHashSet<a> f = new LinkedHashSet<a>();
  
  private b g;
  
  private PorterDuff.Mode h;
  
  private ColorStateList i;
  
  private Drawable j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private boolean n;
  
  private boolean o;
  
  private int p;
  
  public MaterialButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, e.f.a.f.b.materialButtonStyle);
  }
  
  public MaterialButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(g.b(paramContext, paramAttributeSet, paramInt, s), paramAttributeSet, paramInt);
    boolean bool = false;
    this.n = false;
    this.o = false;
    paramContext = getContext();
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.MaterialButton, paramInt, s, new int[0]);
    this.m = typedArray.getDimensionPixelSize(k.MaterialButton_iconPadding, 0);
    this.h = h.a(typedArray.getInt(k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
    this.i = c.a(getContext(), typedArray, k.MaterialButton_iconTint);
    this.j = c.b(getContext(), typedArray, k.MaterialButton_icon);
    this.p = typedArray.getInteger(k.MaterialButton_iconGravity, 1);
    this.k = typedArray.getDimensionPixelSize(k.MaterialButton_iconSize, 0);
    this.e = new a(this, k.a(paramContext, paramAttributeSet, paramInt, s).a());
    this.e.a(typedArray);
    typedArray.recycle();
    setCompoundDrawablePadding(this.m);
    if (this.j != null)
      bool = true; 
    b(bool);
  }
  
  private void a(boolean paramBoolean) {
    if (paramBoolean) {
      i.a((TextView)this, this.j, null, null, null);
      return;
    } 
    i.a((TextView)this, null, null, this.j, null);
  }
  
  private void b(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Landroid/graphics/drawable/Drawable;
    //   4: astore #7
    //   6: iconst_0
    //   7: istore #4
    //   9: aload #7
    //   11: ifnull -> 122
    //   14: aload_0
    //   15: aload #7
    //   17: invokestatic i : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   20: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   23: putfield j : Landroid/graphics/drawable/Drawable;
    //   26: aload_0
    //   27: getfield j : Landroid/graphics/drawable/Drawable;
    //   30: aload_0
    //   31: getfield i : Landroid/content/res/ColorStateList;
    //   34: invokestatic a : (Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    //   37: aload_0
    //   38: getfield h : Landroid/graphics/PorterDuff$Mode;
    //   41: astore #7
    //   43: aload #7
    //   45: ifnull -> 57
    //   48: aload_0
    //   49: getfield j : Landroid/graphics/drawable/Drawable;
    //   52: aload #7
    //   54: invokestatic a : (Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    //   57: aload_0
    //   58: getfield k : I
    //   61: istore_2
    //   62: iload_2
    //   63: ifeq -> 69
    //   66: goto -> 77
    //   69: aload_0
    //   70: getfield j : Landroid/graphics/drawable/Drawable;
    //   73: invokevirtual getIntrinsicWidth : ()I
    //   76: istore_2
    //   77: aload_0
    //   78: getfield k : I
    //   81: istore_3
    //   82: iload_3
    //   83: ifeq -> 89
    //   86: goto -> 97
    //   89: aload_0
    //   90: getfield j : Landroid/graphics/drawable/Drawable;
    //   93: invokevirtual getIntrinsicHeight : ()I
    //   96: istore_3
    //   97: aload_0
    //   98: getfield j : Landroid/graphics/drawable/Drawable;
    //   101: astore #7
    //   103: aload_0
    //   104: getfield l : I
    //   107: istore #5
    //   109: aload #7
    //   111: iload #5
    //   113: iconst_0
    //   114: iload_2
    //   115: iload #5
    //   117: iadd
    //   118: iload_3
    //   119: invokevirtual setBounds : (IIII)V
    //   122: aload_0
    //   123: getfield p : I
    //   126: istore_2
    //   127: iload_2
    //   128: iconst_1
    //   129: if_icmpeq -> 146
    //   132: iload_2
    //   133: iconst_2
    //   134: if_icmpne -> 140
    //   137: goto -> 146
    //   140: iconst_0
    //   141: istore #6
    //   143: goto -> 149
    //   146: iconst_1
    //   147: istore #6
    //   149: iload_1
    //   150: ifeq -> 160
    //   153: aload_0
    //   154: iload #6
    //   156: invokespecial a : (Z)V
    //   159: return
    //   160: aload_0
    //   161: invokestatic a : (Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    //   164: astore #8
    //   166: aload #8
    //   168: iconst_0
    //   169: aaload
    //   170: astore #7
    //   172: aload #8
    //   174: iconst_2
    //   175: aaload
    //   176: astore #8
    //   178: iload #6
    //   180: ifeq -> 192
    //   183: aload #7
    //   185: aload_0
    //   186: getfield j : Landroid/graphics/drawable/Drawable;
    //   189: if_acmpne -> 212
    //   192: iload #4
    //   194: istore_2
    //   195: iload #6
    //   197: ifne -> 214
    //   200: iload #4
    //   202: istore_2
    //   203: aload #8
    //   205: aload_0
    //   206: getfield j : Landroid/graphics/drawable/Drawable;
    //   209: if_acmpeq -> 214
    //   212: iconst_1
    //   213: istore_2
    //   214: iload_2
    //   215: ifeq -> 224
    //   218: aload_0
    //   219: iload #6
    //   221: invokespecial a : (Z)V
    //   224: return
  }
  
  private boolean b() {
    return (v.p((View)this) == 1);
  }
  
  private boolean c() {
    a a1 = this.e;
    return (a1 != null && !a1.j());
  }
  
  private void d() {
    if (this.j != null) {
      if (getLayout() == null)
        return; 
      int i = this.p;
      boolean bool1 = true;
      if (i == 1 || i == 3) {
        this.l = 0;
        b(false);
        return;
      } 
      TextPaint textPaint = getPaint();
      String str2 = getText().toString();
      String str1 = str2;
      if (getTransformationMethod() != null)
        str1 = getTransformationMethod().getTransformation(str2, (View)this).toString(); 
      int k = Math.min((int)textPaint.measureText(str1), getLayout().getEllipsizedWidth());
      int j = this.k;
      i = j;
      if (j == 0)
        i = this.j.getIntrinsicWidth(); 
      j = (getMeasuredWidth() - k - v.t((View)this) - i - this.m - v.u((View)this)) / 2;
      boolean bool2 = b();
      if (this.p != 4)
        bool1 = false; 
      i = j;
      if (bool2 != bool1)
        i = -j; 
      if (this.l != i) {
        this.l = i;
        b(false);
      } 
      return;
    } 
  }
  
  private String getA11yClassName() {
    Class<Button> clazz;
    if (a()) {
      Class<CompoundButton> clazz1 = CompoundButton.class;
    } else {
      clazz = Button.class;
    } 
    return clazz.getName();
  }
  
  public boolean a() {
    a a1 = this.e;
    return (a1 != null && a1.k());
  }
  
  public ColorStateList getBackgroundTintList() {
    return getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getBackgroundTintMode() {
    return getSupportBackgroundTintMode();
  }
  
  public int getCornerRadius() {
    return c() ? this.e.a() : 0;
  }
  
  public Drawable getIcon() {
    return this.j;
  }
  
  public int getIconGravity() {
    return this.p;
  }
  
  public int getIconPadding() {
    return this.m;
  }
  
  public int getIconSize() {
    return this.k;
  }
  
  public ColorStateList getIconTint() {
    return this.i;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.h;
  }
  
  public ColorStateList getRippleColor() {
    return c() ? this.e.d() : null;
  }
  
  public k getShapeAppearanceModel() {
    if (c())
      return this.e.e(); 
    throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
  }
  
  public ColorStateList getStrokeColor() {
    return c() ? this.e.f() : null;
  }
  
  public int getStrokeWidth() {
    return c() ? this.e.g() : 0;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    return c() ? this.e.h() : super.getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    return c() ? this.e.i() : super.getSupportBackgroundTintMode();
  }
  
  public boolean isChecked() {
    return this.n;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    h.a((View)this, this.e.c());
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 2);
    if (a())
      Button.mergeDrawableStates(arrayOfInt, q); 
    if (isChecked())
      Button.mergeDrawableStates(arrayOfInt, r); 
    return arrayOfInt;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(getA11yClassName());
    paramAccessibilityEvent.setChecked(isChecked());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(getA11yClassName());
    paramAccessibilityNodeInfo.setCheckable(a());
    paramAccessibilityNodeInfo.setChecked(isChecked());
    paramAccessibilityNodeInfo.setClickable(isClickable());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (Build.VERSION.SDK_INT == 21) {
      a a1 = this.e;
      if (a1 != null)
        a1.a(paramInt4 - paramInt2, paramInt3 - paramInt1); 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    d();
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    d();
  }
  
  public boolean performClick() {
    toggle();
    return super.performClick();
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundColor(int paramInt) {
    if (c()) {
      this.e.a(paramInt);
      return;
    } 
    super.setBackgroundColor(paramInt);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (c())
      if (paramDrawable != getBackground()) {
        Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
        this.e.l();
      } else {
        getBackground().setState(paramDrawable.getState());
        return;
      }  
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setBackgroundDrawable(drawable);
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    setSupportBackgroundTintList(paramColorStateList);
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    setSupportBackgroundTintMode(paramMode);
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (c())
      this.e.a(paramBoolean); 
  }
  
  public void setChecked(boolean paramBoolean) {
    if (a() && isEnabled() && this.n != paramBoolean) {
      this.n = paramBoolean;
      refreshDrawableState();
      if (this.o)
        return; 
      this.o = true;
      Iterator<a> iterator = this.f.iterator();
      while (iterator.hasNext())
        ((a)iterator.next()).a(this, this.n); 
      this.o = false;
    } 
  }
  
  public void setCornerRadius(int paramInt) {
    if (c())
      this.e.b(paramInt); 
  }
  
  public void setCornerRadiusResource(int paramInt) {
    if (c())
      setCornerRadius(getResources().getDimensionPixelSize(paramInt)); 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    if (c())
      this.e.c().a(paramFloat); 
  }
  
  public void setIcon(Drawable paramDrawable) {
    if (this.j != paramDrawable) {
      this.j = paramDrawable;
      b(true);
    } 
  }
  
  public void setIconGravity(int paramInt) {
    if (this.p != paramInt) {
      this.p = paramInt;
      d();
    } 
  }
  
  public void setIconPadding(int paramInt) {
    if (this.m != paramInt) {
      this.m = paramInt;
      setCompoundDrawablePadding(paramInt);
    } 
  }
  
  public void setIconResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setIcon(drawable);
  }
  
  public void setIconSize(int paramInt) {
    if (paramInt >= 0) {
      if (this.k != paramInt) {
        this.k = paramInt;
        b(true);
      } 
      return;
    } 
    throw new IllegalArgumentException("iconSize cannot be less than 0");
  }
  
  public void setIconTint(ColorStateList paramColorStateList) {
    if (this.i != paramColorStateList) {
      this.i = paramColorStateList;
      b(false);
    } 
  }
  
  public void setIconTintMode(PorterDuff.Mode paramMode) {
    if (this.h != paramMode) {
      this.h = paramMode;
      b(false);
    } 
  }
  
  public void setIconTintResource(int paramInt) {
    setIconTint(b.a.k.a.a.b(getContext(), paramInt));
  }
  
  void setInternalBackground(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  void setOnPressedChangeListenerInternal(b paramb) {
    this.g = paramb;
  }
  
  public void setPressed(boolean paramBoolean) {
    b b1 = this.g;
    if (b1 != null)
      b1.a(this, paramBoolean); 
    super.setPressed(paramBoolean);
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    if (c())
      this.e.a(paramColorStateList); 
  }
  
  public void setRippleColorResource(int paramInt) {
    if (c())
      setRippleColor(b.a.k.a.a.b(getContext(), paramInt)); 
  }
  
  public void setShapeAppearanceModel(k paramk) {
    if (c()) {
      this.e.a(paramk);
      return;
    } 
    throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
  }
  
  void setShouldDrawSurfaceColorStroke(boolean paramBoolean) {
    if (c())
      this.e.b(paramBoolean); 
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    if (c())
      this.e.b(paramColorStateList); 
  }
  
  public void setStrokeColorResource(int paramInt) {
    if (c())
      setStrokeColor(b.a.k.a.a.b(getContext(), paramInt)); 
  }
  
  public void setStrokeWidth(int paramInt) {
    if (c())
      this.e.c(paramInt); 
  }
  
  public void setStrokeWidthResource(int paramInt) {
    if (c())
      setStrokeWidth(getResources().getDimensionPixelSize(paramInt)); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (c()) {
      this.e.c(paramColorStateList);
      return;
    } 
    super.setSupportBackgroundTintList(paramColorStateList);
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (c()) {
      this.e.a(paramMode);
      return;
    } 
    super.setSupportBackgroundTintMode(paramMode);
  }
  
  public void toggle() {
    setChecked(this.n ^ true);
  }
  
  public static interface a {
    void a(MaterialButton param1MaterialButton, boolean param1Boolean);
  }
  
  static interface b {
    void a(MaterialButton param1MaterialButton, boolean param1Boolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/button/MaterialButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */