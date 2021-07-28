package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import b.g.m.v;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;
import e.f.a.f.a0.h;
import e.f.a.f.a0.k;
import e.f.a.f.a0.n;
import e.f.a.f.i;
import e.f.a.f.j;
import e.f.a.f.k;
import e.f.a.f.l.h;
import e.f.a.f.x.d;
import e.f.a.f.x.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends g implements a.a, n {
  private static final Rect v = new Rect();
  
  private static final int[] w = new int[] { 16842913 };
  
  private static final int[] x = new int[] { 16842911 };
  
  private a f;
  
  private InsetDrawable g;
  
  private RippleDrawable h;
  
  private View.OnClickListener i;
  
  private CompoundButton.OnCheckedChangeListener j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private int p;
  
  private int q;
  
  private final c r;
  
  private final Rect s = new Rect();
  
  private final RectF t = new RectF();
  
  private final f u = new a(this);
  
  public Chip(Context paramContext) {
    this(paramContext, null);
  }
  
  public Chip(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, e.f.a.f.b.chipStyle);
  }
  
  public Chip(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
    a a1 = a.a(paramContext, paramAttributeSet, paramInt, j.Widget_MaterialComponents_Chip_Action);
    a(paramContext, paramAttributeSet, paramInt);
    setChipDrawable(a1);
    a1.a(v.l((View)this));
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.Chip, paramInt, j.Widget_MaterialComponents_Chip_Action, new int[0]);
    if (Build.VERSION.SDK_INT < 23)
      setTextColor(e.f.a.f.x.c.a(paramContext, typedArray, k.Chip_android_textColor)); 
    boolean bool = typedArray.hasValue(k.Chip_shapeAppearance);
    typedArray.recycle();
    this.r = new c(this, this);
    if (Build.VERSION.SDK_INT >= 24) {
      v.a((View)this, (b.g.m.a)this.r);
    } else {
      l();
    } 
    if (!bool)
      j(); 
    setChecked(this.k);
    setText(a1.S());
    setEllipsize(a1.M());
    setIncludeFontPadding(false);
    p();
    if (!this.f.b0())
      setSingleLine(); 
    setGravity(8388627);
    o();
    if (e())
      setMinHeight(this.q); 
    this.p = v.p((View)this);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.g = new InsetDrawable((Drawable)this.f, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.Chip, paramInt, j.Widget_MaterialComponents_Chip_Action, new int[0]);
    this.o = typedArray.getBoolean(k.Chip_ensureMinTouchTargetSize, false);
    float f1 = (float)Math.ceil(h.a(getContext(), 48));
    this.q = (int)Math.ceil(typedArray.getDimension(k.Chip_chipMinTouchTargetSize, f1));
    typedArray.recycle();
  }
  
  private void a(AttributeSet paramAttributeSet) {
    if (paramAttributeSet == null)
      return; 
    if (paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null)
      Log.w("Chip", "Do not set the background; Chip manages its own background drawable."); 
    if (paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
      if (paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
        if (paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
          if (paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
            if (paramAttributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && paramAttributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && paramAttributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && paramAttributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
              if (paramAttributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627)
                Log.w("Chip", "Chip text must be vertically center and start aligned"); 
              return;
            } 
            throw new UnsupportedOperationException("Chip does not support multi-line text");
          } 
          throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        } 
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
      } 
      throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    } 
    throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
  }
  
  private void a(a parama) {
    parama.a(this);
  }
  
  @SuppressLint({"PrivateApi"})
  private boolean a(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 10)
      try {
        Field field = b.i.b.a.class.getDeclaredField("m");
        field.setAccessible(true);
        if (((Integer)field.get(this.r)).intValue() != Integer.MIN_VALUE) {
          Class<int> clazz = int.class;
          Method method = b.i.b.a.class.getDeclaredMethod("i", new Class[] { clazz });
          method.setAccessible(true);
          method.invoke(this.r, new Object[] { Integer.valueOf(-2147483648) });
          return true;
        } 
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.e("Chip", "Unable to send Accessibility Exit event", noSuchMethodException);
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException invocationTargetException) {
      
      } catch (NoSuchFieldException noSuchFieldException) {} 
    return false;
  }
  
  private void b(a parama) {
    if (parama != null)
      parama.a((a.a)null); 
  }
  
  private int[] g() {
    boolean bool1 = isEnabled();
    boolean bool = false;
    if (bool1) {
      j = 1;
    } else {
      j = 0;
    } 
    int i = j;
    if (this.n)
      i = j + 1; 
    int j = i;
    if (this.m)
      j = i + 1; 
    i = j;
    if (this.l)
      i = j + 1; 
    j = i;
    if (isChecked())
      j = i + 1; 
    int[] arrayOfInt = new int[j];
    j = bool;
    if (isEnabled()) {
      arrayOfInt[0] = 16842910;
      j = 1;
    } 
    i = j;
    if (this.n) {
      arrayOfInt[j] = 16842908;
      i = j + 1;
    } 
    j = i;
    if (this.m) {
      arrayOfInt[i] = 16843623;
      j = i + 1;
    } 
    i = j;
    if (this.l) {
      arrayOfInt[j] = 16842919;
      i = j + 1;
    } 
    if (isChecked())
      arrayOfInt[i] = 16842913; 
    return arrayOfInt;
  }
  
  private RectF getCloseIconTouchBounds() {
    this.t.setEmpty();
    if (i())
      this.f.a(this.t); 
    return this.t;
  }
  
  private Rect getCloseIconTouchBoundsInt() {
    RectF rectF = getCloseIconTouchBounds();
    this.s.set((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
    return this.s;
  }
  
  private d getTextAppearance() {
    a a1 = this.f;
    return (a1 != null) ? a1.T() : null;
  }
  
  private void h() {
    if (getBackgroundDrawable() == this.g && this.f.getCallback() == null)
      this.f.setCallback((Drawable.Callback)this.g); 
  }
  
  private boolean i() {
    a a1 = this.f;
    return (a1 != null && a1.F() != null);
  }
  
  private void j() {
    if (Build.VERSION.SDK_INT >= 21)
      setOutlineProvider(new b(this)); 
  }
  
  private void k() {
    if (this.g != null) {
      this.g = null;
      setMinWidth(0);
      setMinHeight((int)getChipMinHeight());
      m();
    } 
  }
  
  private void l() {
    b.g.m.a a1;
    if (Build.VERSION.SDK_INT >= 24)
      return; 
    if (i() && c()) {
      a1 = (b.g.m.a)this.r;
    } else {
      a1 = null;
    } 
    v.a((View)this, a1);
  }
  
  private void m() {
    if (e.f.a.f.y.b.a) {
      n();
      return;
    } 
    this.f.f(true);
    v.a((View)this, getBackgroundDrawable());
    h();
  }
  
  private void n() {
    this.h = new RippleDrawable(e.f.a.f.y.b.a(this.f.Q()), getBackgroundDrawable(), null);
    this.f.f(false);
    v.a((View)this, (Drawable)this.h);
  }
  
  private void o() {
    if (!TextUtils.isEmpty(getText())) {
      a a1 = this.f;
      if (a1 == null)
        return; 
      int i = (int)(a1.x() + this.f.U() + this.f.t());
      v.a((View)this, (int)(this.f.C() + this.f.V() + this.f.s()), getPaddingTop(), i, getPaddingBottom());
    } 
  }
  
  private void p() {
    TextPaint textPaint = getPaint();
    a a1 = this.f;
    if (a1 != null)
      textPaint.drawableState = a1.getState(); 
    d d = getTextAppearance();
    if (d != null)
      d.b(getContext(), textPaint, this.u); 
  }
  
  private void setCloseIconHovered(boolean paramBoolean) {
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
      refreshDrawableState();
    } 
  }
  
  private void setCloseIconPressed(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      refreshDrawableState();
    } 
  }
  
  public void a() {
    a(this.q);
    m();
    o();
    requestLayout();
    if (Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public boolean a(int paramInt) {
    this.q = paramInt;
    boolean bool = e();
    int j = 0;
    if (!bool) {
      k();
      return false;
    } 
    int k = Math.max(0, paramInt - this.f.getIntrinsicHeight());
    int i = Math.max(0, paramInt - this.f.getIntrinsicWidth());
    if (i <= 0 && k <= 0) {
      k();
      return false;
    } 
    if (i > 0) {
      i /= 2;
    } else {
      i = 0;
    } 
    if (k > 0)
      j = k / 2; 
    if (this.g != null) {
      Rect rect = new Rect();
      this.g.getPadding(rect);
      if (rect.top == j && rect.bottom == j && rect.left == i && rect.right == i)
        return true; 
    } 
    if (Build.VERSION.SDK_INT >= 16) {
      if (getMinHeight() != paramInt)
        setMinHeight(paramInt); 
      if (getMinWidth() != paramInt)
        setMinWidth(paramInt); 
    } else {
      setMinHeight(paramInt);
      setMinWidth(paramInt);
    } 
    a(i, j, i, j);
    return true;
  }
  
  public boolean b() {
    a a1 = this.f;
    return (a1 != null && a1.X());
  }
  
  public boolean c() {
    a a1 = this.f;
    return (a1 != null && a1.Z());
  }
  
  public boolean d() {
    boolean bool = false;
    playSoundEffect(0);
    View.OnClickListener onClickListener = this.i;
    if (onClickListener != null) {
      onClickListener.onClick((View)this);
      bool = true;
    } 
    this.r.a(1, 1);
    return bool;
  }
  
  protected boolean dispatchHoverEvent(MotionEvent paramMotionEvent) {
    return (a(paramMotionEvent) || this.r.a(paramMotionEvent) || super.dispatchHoverEvent(paramMotionEvent));
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (this.r.a(paramKeyEvent) && this.r.c() != Integer.MIN_VALUE) ? true : super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected void drawableStateChanged() {
    boolean bool;
    super.drawableStateChanged();
    a a1 = this.f;
    if (a1 != null && a1.Y()) {
      bool = this.f.a(g());
    } else {
      bool = false;
    } 
    if (bool)
      invalidate(); 
  }
  
  public boolean e() {
    return this.o;
  }
  
  public Drawable getBackgroundDrawable() {
    a a1;
    InsetDrawable insetDrawable2 = this.g;
    InsetDrawable insetDrawable1 = insetDrawable2;
    if (insetDrawable2 == null)
      a1 = this.f; 
    return (Drawable)a1;
  }
  
  public Drawable getCheckedIcon() {
    a a1 = this.f;
    return (a1 != null) ? a1.u() : null;
  }
  
  public ColorStateList getChipBackgroundColor() {
    a a1 = this.f;
    return (a1 != null) ? a1.v() : null;
  }
  
  public float getChipCornerRadius() {
    a a1 = this.f;
    return (a1 != null) ? a1.w() : 0.0F;
  }
  
  public Drawable getChipDrawable() {
    return (Drawable)this.f;
  }
  
  public float getChipEndPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.x() : 0.0F;
  }
  
  public Drawable getChipIcon() {
    a a1 = this.f;
    return (a1 != null) ? a1.y() : null;
  }
  
  public float getChipIconSize() {
    a a1 = this.f;
    return (a1 != null) ? a1.z() : 0.0F;
  }
  
  public ColorStateList getChipIconTint() {
    a a1 = this.f;
    return (a1 != null) ? a1.A() : null;
  }
  
  public float getChipMinHeight() {
    a a1 = this.f;
    return (a1 != null) ? a1.B() : 0.0F;
  }
  
  public float getChipStartPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.C() : 0.0F;
  }
  
  public ColorStateList getChipStrokeColor() {
    a a1 = this.f;
    return (a1 != null) ? a1.D() : null;
  }
  
  public float getChipStrokeWidth() {
    a a1 = this.f;
    return (a1 != null) ? a1.E() : 0.0F;
  }
  
  @Deprecated
  public CharSequence getChipText() {
    return getText();
  }
  
  public Drawable getCloseIcon() {
    a a1 = this.f;
    return (a1 != null) ? a1.F() : null;
  }
  
  public CharSequence getCloseIconContentDescription() {
    a a1 = this.f;
    return (a1 != null) ? a1.G() : null;
  }
  
  public float getCloseIconEndPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.H() : 0.0F;
  }
  
  public float getCloseIconSize() {
    a a1 = this.f;
    return (a1 != null) ? a1.I() : 0.0F;
  }
  
  public float getCloseIconStartPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.J() : 0.0F;
  }
  
  public ColorStateList getCloseIconTint() {
    a a1 = this.f;
    return (a1 != null) ? a1.L() : null;
  }
  
  public TextUtils.TruncateAt getEllipsize() {
    a a1 = this.f;
    return (a1 != null) ? a1.M() : null;
  }
  
  public void getFocusedRect(Rect paramRect) {
    if (this.r.c() == 1 || this.r.b() == 1) {
      paramRect.set(getCloseIconTouchBoundsInt());
      return;
    } 
    super.getFocusedRect(paramRect);
  }
  
  public h getHideMotionSpec() {
    a a1 = this.f;
    return (a1 != null) ? a1.N() : null;
  }
  
  public float getIconEndPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.O() : 0.0F;
  }
  
  public float getIconStartPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.P() : 0.0F;
  }
  
  public ColorStateList getRippleColor() {
    a a1 = this.f;
    return (a1 != null) ? a1.Q() : null;
  }
  
  public k getShapeAppearanceModel() {
    return this.f.k();
  }
  
  public h getShowMotionSpec() {
    a a1 = this.f;
    return (a1 != null) ? a1.R() : null;
  }
  
  public float getTextEndPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.U() : 0.0F;
  }
  
  public float getTextStartPadding() {
    a a1 = this.f;
    return (a1 != null) ? a1.V() : 0.0F;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    h.a((View)this, this.f);
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 2);
    if (isChecked())
      CheckBox.mergeDrawableStates(arrayOfInt, w); 
    if (b())
      CheckBox.mergeDrawableStates(arrayOfInt, x); 
    return arrayOfInt;
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    this.r.a(paramBoolean, paramInt, paramRect);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    boolean bool;
    int i = paramMotionEvent.getActionMasked();
    if (i != 7) {
      if (i != 10)
        return super.onHoverEvent(paramMotionEvent); 
      bool = false;
    } else {
      bool = getCloseIconTouchBounds().contains(paramMotionEvent.getX(), paramMotionEvent.getY());
    } 
    setCloseIconHovered(bool);
    return super.onHoverEvent(paramMotionEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    String str;
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (b() || isClickable()) {
      if (b()) {
        str = "android.widget.CompoundButton";
      } else {
        str = "android.widget.Button";
      } 
    } else {
      str = "android.view.View";
    } 
    paramAccessibilityNodeInfo.setClassName(str);
    paramAccessibilityNodeInfo.setCheckable(b());
    paramAccessibilityNodeInfo.setClickable(isClickable());
  }
  
  @TargetApi(24)
  public PointerIcon onResolvePointerIcon(MotionEvent paramMotionEvent, int paramInt) {
    return (getCloseIconTouchBounds().contains(paramMotionEvent.getX(), paramMotionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : null;
  }
  
  @TargetApi(17)
  public void onRtlPropertiesChanged(int paramInt) {
    super.onRtlPropertiesChanged(paramInt);
    if (this.p != paramInt) {
      this.p = paramInt;
      o();
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: invokespecial getCloseIconTouchBounds : ()Landroid/graphics/RectF;
    //   9: aload_1
    //   10: invokevirtual getX : ()F
    //   13: aload_1
    //   14: invokevirtual getY : ()F
    //   17: invokevirtual contains : (FF)Z
    //   20: istore #4
    //   22: iconst_0
    //   23: istore_3
    //   24: iload_2
    //   25: ifeq -> 93
    //   28: iload_2
    //   29: iconst_1
    //   30: if_icmpeq -> 66
    //   33: iload_2
    //   34: iconst_2
    //   35: if_icmpeq -> 46
    //   38: iload_2
    //   39: iconst_3
    //   40: if_icmpeq -> 83
    //   43: goto -> 108
    //   46: aload_0
    //   47: getfield l : Z
    //   50: ifeq -> 108
    //   53: iload #4
    //   55: ifne -> 103
    //   58: aload_0
    //   59: iconst_0
    //   60: invokespecial setCloseIconPressed : (Z)V
    //   63: goto -> 103
    //   66: aload_0
    //   67: getfield l : Z
    //   70: ifeq -> 83
    //   73: aload_0
    //   74: invokevirtual d : ()Z
    //   77: pop
    //   78: iconst_1
    //   79: istore_2
    //   80: goto -> 85
    //   83: iconst_0
    //   84: istore_2
    //   85: aload_0
    //   86: iconst_0
    //   87: invokespecial setCloseIconPressed : (Z)V
    //   90: goto -> 110
    //   93: iload #4
    //   95: ifeq -> 108
    //   98: aload_0
    //   99: iconst_1
    //   100: invokespecial setCloseIconPressed : (Z)V
    //   103: iconst_1
    //   104: istore_2
    //   105: goto -> 110
    //   108: iconst_0
    //   109: istore_2
    //   110: iload_2
    //   111: ifne -> 122
    //   114: aload_0
    //   115: aload_1
    //   116: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   119: ifeq -> 124
    //   122: iconst_1
    //   123: istore_3
    //   124: iload_3
    //   125: ireturn
  }
  
  public void setBackground(Drawable paramDrawable) {
    if (paramDrawable != getBackgroundDrawable() && paramDrawable != this.h) {
      Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
      return;
    } 
    super.setBackground(paramDrawable);
  }
  
  public void setBackgroundColor(int paramInt) {
    Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (paramDrawable != getBackgroundDrawable() && paramDrawable != this.h) {
      Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
      return;
    } 
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundResource(int paramInt) {
    Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
  }
  
  public void setCheckable(boolean paramBoolean) {
    a a1 = this.f;
    if (a1 != null)
      a1.a(paramBoolean); 
  }
  
  public void setCheckableResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.b(paramInt); 
  }
  
  public void setChecked(boolean paramBoolean) {
    a a1 = this.f;
    if (a1 == null) {
      this.k = paramBoolean;
      return;
    } 
    if (a1.X()) {
      boolean bool = isChecked();
      super.setChecked(paramBoolean);
      if (bool != paramBoolean) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.j;
        if (onCheckedChangeListener != null)
          onCheckedChangeListener.onCheckedChanged((CompoundButton)this, paramBoolean); 
      } 
    } 
  }
  
  public void setCheckedIcon(Drawable paramDrawable) {
    a a1 = this.f;
    if (a1 != null)
      a1.a(paramDrawable); 
  }
  
  @Deprecated
  public void setCheckedIconEnabled(boolean paramBoolean) {
    setCheckedIconVisible(paramBoolean);
  }
  
  @Deprecated
  public void setCheckedIconEnabledResource(int paramInt) {
    setCheckedIconVisible(paramInt);
  }
  
  public void setCheckedIconResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.c(paramInt); 
  }
  
  public void setCheckedIconVisible(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.d(paramInt); 
  }
  
  public void setCheckedIconVisible(boolean paramBoolean) {
    a a1 = this.f;
    if (a1 != null)
      a1.b(paramBoolean); 
  }
  
  public void setChipBackgroundColor(ColorStateList paramColorStateList) {
    a a1 = this.f;
    if (a1 != null)
      a1.c(paramColorStateList); 
  }
  
  public void setChipBackgroundColorResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.e(paramInt); 
  }
  
  @Deprecated
  public void setChipCornerRadius(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.e(paramFloat); 
  }
  
  @Deprecated
  public void setChipCornerRadiusResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.f(paramInt); 
  }
  
  public void setChipDrawable(a parama) {
    a a1 = this.f;
    if (a1 != parama) {
      b(a1);
      this.f = parama;
      this.f.e(false);
      a(this.f);
      a(this.q);
      m();
    } 
  }
  
  public void setChipEndPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.f(paramFloat); 
  }
  
  public void setChipEndPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.g(paramInt); 
  }
  
  public void setChipIcon(Drawable paramDrawable) {
    a a1 = this.f;
    if (a1 != null)
      a1.b(paramDrawable); 
  }
  
  @Deprecated
  public void setChipIconEnabled(boolean paramBoolean) {
    setChipIconVisible(paramBoolean);
  }
  
  @Deprecated
  public void setChipIconEnabledResource(int paramInt) {
    setChipIconVisible(paramInt);
  }
  
  public void setChipIconResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.h(paramInt); 
  }
  
  public void setChipIconSize(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.g(paramFloat); 
  }
  
  public void setChipIconSizeResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.i(paramInt); 
  }
  
  public void setChipIconTint(ColorStateList paramColorStateList) {
    a a1 = this.f;
    if (a1 != null)
      a1.d(paramColorStateList); 
  }
  
  public void setChipIconTintResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.j(paramInt); 
  }
  
  public void setChipIconVisible(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.k(paramInt); 
  }
  
  public void setChipIconVisible(boolean paramBoolean) {
    a a1 = this.f;
    if (a1 != null)
      a1.c(paramBoolean); 
  }
  
  public void setChipMinHeight(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.h(paramFloat); 
  }
  
  public void setChipMinHeightResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.l(paramInt); 
  }
  
  public void setChipStartPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.i(paramFloat); 
  }
  
  public void setChipStartPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.m(paramInt); 
  }
  
  public void setChipStrokeColor(ColorStateList paramColorStateList) {
    a a1 = this.f;
    if (a1 != null)
      a1.e(paramColorStateList); 
  }
  
  public void setChipStrokeColorResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.n(paramInt); 
  }
  
  public void setChipStrokeWidth(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.j(paramFloat); 
  }
  
  public void setChipStrokeWidthResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.o(paramInt); 
  }
  
  @Deprecated
  public void setChipText(CharSequence paramCharSequence) {
    setText(paramCharSequence);
  }
  
  @Deprecated
  public void setChipTextResource(int paramInt) {
    setText(getResources().getString(paramInt));
  }
  
  public void setCloseIcon(Drawable paramDrawable) {
    a a1 = this.f;
    if (a1 != null)
      a1.c(paramDrawable); 
    l();
  }
  
  public void setCloseIconContentDescription(CharSequence paramCharSequence) {
    a a1 = this.f;
    if (a1 != null)
      a1.a(paramCharSequence); 
  }
  
  @Deprecated
  public void setCloseIconEnabled(boolean paramBoolean) {
    setCloseIconVisible(paramBoolean);
  }
  
  @Deprecated
  public void setCloseIconEnabledResource(int paramInt) {
    setCloseIconVisible(paramInt);
  }
  
  public void setCloseIconEndPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.k(paramFloat); 
  }
  
  public void setCloseIconEndPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.p(paramInt); 
  }
  
  public void setCloseIconResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.q(paramInt); 
    l();
  }
  
  public void setCloseIconSize(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.l(paramFloat); 
  }
  
  public void setCloseIconSizeResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.r(paramInt); 
  }
  
  public void setCloseIconStartPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.m(paramFloat); 
  }
  
  public void setCloseIconStartPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.s(paramInt); 
  }
  
  public void setCloseIconTint(ColorStateList paramColorStateList) {
    a a1 = this.f;
    if (a1 != null)
      a1.f(paramColorStateList); 
  }
  
  public void setCloseIconTintResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.t(paramInt); 
  }
  
  public void setCloseIconVisible(int paramInt) {
    setCloseIconVisible(getResources().getBoolean(paramInt));
  }
  
  public void setCloseIconVisible(boolean paramBoolean) {
    a a1 = this.f;
    if (a1 != null)
      a1.d(paramBoolean); 
    l();
  }
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 == 0) {
      if (paramInt3 == 0) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 == 0) {
      if (paramInt3 == 0) {
        super.setCompoundDrawablesWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    a a1 = this.f;
    if (a1 != null)
      a1.a(paramFloat); 
  }
  
  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt) {
    if (this.f == null)
      return; 
    if (paramTruncateAt != TextUtils.TruncateAt.MARQUEE) {
      super.setEllipsize(paramTruncateAt);
      a a1 = this.f;
      if (a1 != null)
        a1.a(paramTruncateAt); 
      return;
    } 
    throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
  }
  
  public void setEnsureMinTouchTargetSize(boolean paramBoolean) {
    this.o = paramBoolean;
    a(this.q);
  }
  
  public void setGravity(int paramInt) {
    if (paramInt != 8388627) {
      Log.w("Chip", "Chip text must be vertically center and start aligned");
      return;
    } 
    super.setGravity(paramInt);
  }
  
  public void setHideMotionSpec(h paramh) {
    a a1 = this.f;
    if (a1 != null)
      a1.a(paramh); 
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.u(paramInt); 
  }
  
  public void setIconEndPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.n(paramFloat); 
  }
  
  public void setIconEndPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.v(paramInt); 
  }
  
  public void setIconStartPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.o(paramFloat); 
  }
  
  public void setIconStartPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.w(paramInt); 
  }
  
  public void setLayoutDirection(int paramInt) {
    if (this.f == null)
      return; 
    if (Build.VERSION.SDK_INT >= 17)
      super.setLayoutDirection(paramInt); 
  }
  
  public void setLines(int paramInt) {
    if (paramInt <= 1) {
      super.setLines(paramInt);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setMaxLines(int paramInt) {
    if (paramInt <= 1) {
      super.setMaxLines(paramInt);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setMaxWidth(int paramInt) {
    super.setMaxWidth(paramInt);
    a a1 = this.f;
    if (a1 != null)
      a1.x(paramInt); 
  }
  
  public void setMinLines(int paramInt) {
    if (paramInt <= 1) {
      super.setMinLines(paramInt);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener) {
    this.j = paramOnCheckedChangeListener;
  }
  
  public void setOnCloseIconClickListener(View.OnClickListener paramOnClickListener) {
    this.i = paramOnClickListener;
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    a a1 = this.f;
    if (a1 != null)
      a1.g(paramColorStateList); 
    if (!this.f.W())
      n(); 
  }
  
  public void setRippleColorResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null) {
      a1.y(paramInt);
      if (!this.f.W())
        n(); 
    } 
  }
  
  public void setShapeAppearanceModel(k paramk) {
    this.f.setShapeAppearanceModel(paramk);
  }
  
  public void setShowMotionSpec(h paramh) {
    a a1 = this.f;
    if (a1 != null)
      a1.b(paramh); 
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.z(paramInt); 
  }
  
  public void setSingleLine(boolean paramBoolean) {
    if (paramBoolean) {
      super.setSingleLine(paramBoolean);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType) {
    if (this.f == null)
      return; 
    CharSequence charSequence = paramCharSequence;
    if (paramCharSequence == null)
      charSequence = ""; 
    if (this.f.b0()) {
      paramCharSequence = null;
    } else {
      paramCharSequence = charSequence;
    } 
    super.setText(paramCharSequence, paramBufferType);
    a a1 = this.f;
    if (a1 != null)
      a1.b(charSequence); 
  }
  
  public void setTextAppearance(int paramInt) {
    super.setTextAppearance(paramInt);
    a a1 = this.f;
    if (a1 != null)
      a1.A(paramInt); 
    p();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    a a1 = this.f;
    if (a1 != null)
      a1.A(paramInt); 
    p();
  }
  
  public void setTextAppearance(d paramd) {
    a a1 = this.f;
    if (a1 != null)
      a1.a(paramd); 
    p();
  }
  
  public void setTextAppearanceResource(int paramInt) {
    setTextAppearance(getContext(), paramInt);
  }
  
  public void setTextEndPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.p(paramFloat); 
  }
  
  public void setTextEndPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.B(paramInt); 
  }
  
  public void setTextStartPadding(float paramFloat) {
    a a1 = this.f;
    if (a1 != null)
      a1.q(paramFloat); 
  }
  
  public void setTextStartPaddingResource(int paramInt) {
    a a1 = this.f;
    if (a1 != null)
      a1.C(paramInt); 
  }
  
  class a extends f {
    a(Chip this$0) {}
    
    public void a(int param1Int) {}
    
    public void a(Typeface param1Typeface, boolean param1Boolean) {
      CharSequence charSequence;
      Chip chip = this.a;
      if (Chip.a(chip).b0()) {
        charSequence = Chip.a(this.a).S();
      } else {
        charSequence = this.a.getText();
      } 
      chip.setText(charSequence);
      this.a.requestLayout();
      this.a.invalidate();
    }
  }
  
  class b extends ViewOutlineProvider {
    b(Chip this$0) {}
    
    @TargetApi(21)
    public void getOutline(View param1View, Outline param1Outline) {
      if (Chip.a(this.a) != null) {
        Chip.a(this.a).getOutline(param1Outline);
        return;
      } 
      param1Outline.setAlpha(0.0F);
    }
  }
  
  private class c extends b.i.b.a {
    c(Chip this$0, Chip param1Chip1) {
      super((View)param1Chip1);
    }
    
    protected int a(float param1Float1, float param1Float2) {
      return (Chip.b(this.q) && Chip.c(this.q).contains(param1Float1, param1Float2)) ? 1 : 0;
    }
    
    protected void a(int param1Int, b.g.m.e0.c param1c) {
      if (param1Int == 1) {
        CharSequence charSequence = this.q.getCloseIconContentDescription();
        if (charSequence == null) {
          charSequence = this.q.getText();
          Context context = this.q.getContext();
          param1Int = i.mtrl_chip_close_icon_content_description;
          if (TextUtils.isEmpty(charSequence))
            charSequence = ""; 
          charSequence = context.getString(param1Int, new Object[] { charSequence }).trim();
        } 
        param1c.b(charSequence);
        param1c.c(Chip.d(this.q));
        param1c.a(b.g.m.e0.c.a.g);
        param1c.f(this.q.isEnabled());
        return;
      } 
      param1c.b("");
      param1c.c(Chip.f());
    }
    
    protected void a(int param1Int, boolean param1Boolean) {
      if (param1Int == 1) {
        Chip.a(this.q, param1Boolean);
        this.q.refreshDrawableState();
      } 
    }
    
    protected void a(b.g.m.e0.c param1c) {
      String str;
      param1c.b(this.q.b());
      param1c.d(this.q.isClickable());
      if (this.q.b() || this.q.isClickable()) {
        if (this.q.b()) {
          str = "android.widget.CompoundButton";
        } else {
          str = "android.widget.Button";
        } 
      } else {
        str = "android.view.View";
      } 
      param1c.a(str);
      CharSequence charSequence = this.q.getText();
      if (Build.VERSION.SDK_INT >= 23) {
        param1c.h(charSequence);
        return;
      } 
      param1c.b(charSequence);
    }
    
    protected void a(List<Integer> param1List) {
      param1List.add(Integer.valueOf(0));
      if (Chip.b(this.q) && this.q.c())
        param1List.add(Integer.valueOf(1)); 
    }
    
    protected boolean a(int param1Int1, int param1Int2, Bundle param1Bundle) {
      if (param1Int2 == 16) {
        if (param1Int1 == 0)
          return this.q.performClick(); 
        if (param1Int1 == 1)
          return this.q.d(); 
      } 
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/chip/Chip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */