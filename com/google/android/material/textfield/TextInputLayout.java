package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import b.g.m.v;
import com.google.android.material.internal.CheckableImageButton;
import e.f.a.f.a0.k;
import e.f.a.f.i;
import e.f.a.f.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
  private static final int t0 = j.Widget_Design_TextInputLayout;
  
  private final int A;
  
  private int B;
  
  private int C;
  
  private final Rect D;
  
  private final Rect E;
  
  private final RectF F;
  
  private Typeface G;
  
  private final CheckableImageButton H;
  
  private ColorStateList I;
  
  private boolean J;
  
  private PorterDuff.Mode K;
  
  private boolean L;
  
  private Drawable M;
  
  private View.OnLongClickListener N;
  
  private final LinkedHashSet<f> O;
  
  private int P;
  
  private final SparseArray<e> Q;
  
  private final CheckableImageButton R;
  
  private final LinkedHashSet<g> S;
  
  private ColorStateList T;
  
  private boolean U;
  
  private PorterDuff.Mode V;
  
  private boolean W;
  
  private Drawable a0;
  
  private Drawable b0;
  
  private final FrameLayout c;
  
  private final CheckableImageButton c0;
  
  private final FrameLayout d;
  
  private View.OnLongClickListener d0;
  
  EditText e;
  
  private ColorStateList e0;
  
  private CharSequence f;
  
  private ColorStateList f0;
  
  private final f g;
  
  private final int g0;
  
  boolean h;
  
  private final int h0;
  
  private int i;
  
  private int i0;
  
  private boolean j;
  
  private int j0;
  
  private TextView k;
  
  private final int k0;
  
  private int l;
  
  private final int l0;
  
  private int m;
  
  private final int m0;
  
  private ColorStateList n;
  
  private boolean n0;
  
  private ColorStateList o;
  
  final com.google.android.material.internal.a o0;
  
  private boolean p;
  
  private boolean p0;
  
  private CharSequence q;
  
  private ValueAnimator q0;
  
  private boolean r;
  
  private boolean r0;
  
  private e.f.a.f.a0.g s;
  
  private boolean s0;
  
  private e.f.a.f.a0.g t;
  
  private k u;
  
  private final int v;
  
  private int w;
  
  private final int x;
  
  private int y;
  
  private final int z;
  
  public TextInputLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, e.f.a.f.b.textInputStyle);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {}
  
  private void A() {
    TextView textView = this.k;
    if (textView != null) {
      int i;
      if (this.j) {
        i = this.l;
      } else {
        i = this.m;
      } 
      a(textView, i);
      if (!this.j) {
        ColorStateList colorStateList = this.n;
        if (colorStateList != null)
          this.k.setTextColor(colorStateList); 
      } 
      if (this.j) {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null)
          this.k.setTextColor(colorStateList); 
      } 
    } 
  }
  
  private boolean B() {
    if (this.e == null)
      return false; 
    int i = Math.max(this.R.getMeasuredHeight(), this.H.getMeasuredHeight());
    if (this.e.getMeasuredHeight() < i) {
      this.e.setMinimumHeight(i);
      return true;
    } 
    return false;
  }
  
  private boolean C() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroid/widget/EditText;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: invokespecial t : ()Z
    //   13: ifeq -> 148
    //   16: aload_0
    //   17: invokevirtual d : ()Z
    //   20: ifeq -> 148
    //   23: aload_0
    //   24: getfield H : Lcom/google/android/material/internal/CheckableImageButton;
    //   27: invokevirtual getMeasuredWidth : ()I
    //   30: ifle -> 148
    //   33: aload_0
    //   34: getfield M : Landroid/graphics/drawable/Drawable;
    //   37: ifnonnull -> 96
    //   40: aload_0
    //   41: new android/graphics/drawable/ColorDrawable
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: putfield M : Landroid/graphics/drawable/Drawable;
    //   51: aload_0
    //   52: getfield H : Lcom/google/android/material/internal/CheckableImageButton;
    //   55: invokevirtual getMeasuredWidth : ()I
    //   58: istore_1
    //   59: aload_0
    //   60: getfield e : Landroid/widget/EditText;
    //   63: invokevirtual getPaddingLeft : ()I
    //   66: istore_2
    //   67: aload_0
    //   68: getfield H : Lcom/google/android/material/internal/CheckableImageButton;
    //   71: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   74: checkcast android/view/ViewGroup$MarginLayoutParams
    //   77: invokestatic a : (Landroid/view/ViewGroup$MarginLayoutParams;)I
    //   80: istore_3
    //   81: aload_0
    //   82: getfield M : Landroid/graphics/drawable/Drawable;
    //   85: iconst_0
    //   86: iconst_0
    //   87: iload_1
    //   88: iload_2
    //   89: isub
    //   90: iload_3
    //   91: iadd
    //   92: iconst_1
    //   93: invokevirtual setBounds : (IIII)V
    //   96: aload_0
    //   97: getfield e : Landroid/widget/EditText;
    //   100: invokestatic a : (Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    //   103: astore #6
    //   105: aload #6
    //   107: iconst_0
    //   108: aaload
    //   109: astore #7
    //   111: aload_0
    //   112: getfield M : Landroid/graphics/drawable/Drawable;
    //   115: astore #8
    //   117: aload #7
    //   119: aload #8
    //   121: if_acmpeq -> 195
    //   124: aload_0
    //   125: getfield e : Landroid/widget/EditText;
    //   128: aload #8
    //   130: aload #6
    //   132: iconst_1
    //   133: aaload
    //   134: aload #6
    //   136: iconst_2
    //   137: aaload
    //   138: aload #6
    //   140: iconst_3
    //   141: aaload
    //   142: invokestatic a : (Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   145: goto -> 189
    //   148: aload_0
    //   149: getfield M : Landroid/graphics/drawable/Drawable;
    //   152: ifnull -> 195
    //   155: aload_0
    //   156: getfield e : Landroid/widget/EditText;
    //   159: invokestatic a : (Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    //   162: astore #6
    //   164: aload_0
    //   165: getfield e : Landroid/widget/EditText;
    //   168: aconst_null
    //   169: aload #6
    //   171: iconst_1
    //   172: aaload
    //   173: aload #6
    //   175: iconst_2
    //   176: aaload
    //   177: aload #6
    //   179: iconst_3
    //   180: aaload
    //   181: invokestatic a : (Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield M : Landroid/graphics/drawable/Drawable;
    //   189: iconst_1
    //   190: istore #4
    //   192: goto -> 198
    //   195: iconst_0
    //   196: istore #4
    //   198: aload_0
    //   199: invokespecial getEndIconToUpdateDummyDrawable : ()Lcom/google/android/material/internal/CheckableImageButton;
    //   202: astore #6
    //   204: aload #6
    //   206: ifnull -> 339
    //   209: aload #6
    //   211: invokevirtual getMeasuredWidth : ()I
    //   214: ifle -> 339
    //   217: aload_0
    //   218: getfield a0 : Landroid/graphics/drawable/Drawable;
    //   221: ifnonnull -> 276
    //   224: aload_0
    //   225: new android/graphics/drawable/ColorDrawable
    //   228: dup
    //   229: invokespecial <init> : ()V
    //   232: putfield a0 : Landroid/graphics/drawable/Drawable;
    //   235: aload #6
    //   237: invokevirtual getMeasuredWidth : ()I
    //   240: istore_1
    //   241: aload_0
    //   242: getfield e : Landroid/widget/EditText;
    //   245: invokevirtual getPaddingRight : ()I
    //   248: istore_2
    //   249: aload #6
    //   251: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   254: checkcast android/view/ViewGroup$MarginLayoutParams
    //   257: invokestatic b : (Landroid/view/ViewGroup$MarginLayoutParams;)I
    //   260: istore_3
    //   261: aload_0
    //   262: getfield a0 : Landroid/graphics/drawable/Drawable;
    //   265: iconst_0
    //   266: iconst_0
    //   267: iload_1
    //   268: iload_2
    //   269: isub
    //   270: iload_3
    //   271: iadd
    //   272: iconst_1
    //   273: invokevirtual setBounds : (IIII)V
    //   276: aload_0
    //   277: getfield e : Landroid/widget/EditText;
    //   280: invokestatic a : (Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    //   283: astore #6
    //   285: aload #6
    //   287: iconst_2
    //   288: aaload
    //   289: astore #7
    //   291: aload_0
    //   292: getfield a0 : Landroid/graphics/drawable/Drawable;
    //   295: astore #8
    //   297: iload #4
    //   299: istore #5
    //   301: aload #7
    //   303: aload #8
    //   305: if_acmpeq -> 405
    //   308: aload_0
    //   309: aload #6
    //   311: iconst_2
    //   312: aaload
    //   313: putfield b0 : Landroid/graphics/drawable/Drawable;
    //   316: aload_0
    //   317: getfield e : Landroid/widget/EditText;
    //   320: aload #6
    //   322: iconst_0
    //   323: aaload
    //   324: aload #6
    //   326: iconst_1
    //   327: aaload
    //   328: aload #8
    //   330: aload #6
    //   332: iconst_3
    //   333: aaload
    //   334: invokestatic a : (Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   337: iconst_1
    //   338: ireturn
    //   339: iload #4
    //   341: istore #5
    //   343: aload_0
    //   344: getfield a0 : Landroid/graphics/drawable/Drawable;
    //   347: ifnull -> 405
    //   350: aload_0
    //   351: getfield e : Landroid/widget/EditText;
    //   354: invokestatic a : (Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    //   357: astore #6
    //   359: aload #6
    //   361: iconst_2
    //   362: aaload
    //   363: aload_0
    //   364: getfield a0 : Landroid/graphics/drawable/Drawable;
    //   367: if_acmpne -> 396
    //   370: aload_0
    //   371: getfield e : Landroid/widget/EditText;
    //   374: aload #6
    //   376: iconst_0
    //   377: aaload
    //   378: aload #6
    //   380: iconst_1
    //   381: aaload
    //   382: aload_0
    //   383: getfield b0 : Landroid/graphics/drawable/Drawable;
    //   386: aload #6
    //   388: iconst_3
    //   389: aaload
    //   390: invokestatic a : (Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   393: iconst_1
    //   394: istore #4
    //   396: aload_0
    //   397: aconst_null
    //   398: putfield a0 : Landroid/graphics/drawable/Drawable;
    //   401: iload #4
    //   403: istore #5
    //   405: iload #5
    //   407: ireturn
  }
  
  private void D() {
    if (this.w != 1) {
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.c.getLayoutParams();
      int i = m();
      if (i != layoutParams.topMargin) {
        layoutParams.topMargin = i;
        this.c.requestLayout();
      } 
    } 
  }
  
  private int a(Rect paramRect, float paramFloat) {
    return u() ? (int)(paramRect.centerY() - paramFloat / 2.0F) : (paramRect.top + this.e.getCompoundPaddingTop());
  }
  
  private int a(Rect paramRect1, Rect paramRect2, float paramFloat) {
    return (this.w == 1) ? (int)(paramRect2.top + paramFloat) : (paramRect1.bottom - this.e.getCompoundPaddingBottom());
  }
  
  private Rect a(Rect paramRect) {
    EditText editText = this.e;
    if (editText != null) {
      Rect rect = this.E;
      rect.bottom = paramRect.bottom;
      int i = this.w;
      if (i != 1) {
        if (i != 2) {
          paramRect.left += editText.getCompoundPaddingLeft();
          i = getPaddingTop();
        } else {
          paramRect.left += editText.getPaddingLeft();
          paramRect.top -= m();
          int m = paramRect.right;
          i = this.e.getPaddingRight();
          rect.right = m - i;
          return rect;
        } 
      } else {
        paramRect.left += editText.getCompoundPaddingLeft();
        i = paramRect.top + this.x;
      } 
      rect.top = i;
      int j = paramRect.right;
      i = this.e.getCompoundPaddingRight();
      rect.right = j - i;
      return rect;
    } 
    IllegalStateException illegalStateException = new IllegalStateException();
    throw illegalStateException;
  }
  
  private static void a(Context paramContext, TextView paramTextView, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = i.character_counter_overflowed_content_description;
    } else {
      i = i.character_counter_content_description;
    } 
    paramTextView.setContentDescription(paramContext.getString(i, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  private void a(Canvas paramCanvas) {
    e.f.a.f.a0.g g1 = this.t;
    if (g1 != null) {
      Rect rect = g1.getBounds();
      rect.top = rect.bottom - this.y;
      this.t.draw(paramCanvas);
    } 
  }
  
  private void a(RectF paramRectF) {
    float f1 = paramRectF.left;
    int i = this.v;
    paramRectF.left = f1 - i;
    paramRectF.top -= i;
    paramRectF.right += i;
    paramRectF.bottom += i;
  }
  
  private static void a(ViewGroup paramViewGroup, boolean paramBoolean) {
    int j = paramViewGroup.getChildCount();
    for (int i = 0; i < j; i++) {
      View view = paramViewGroup.getChildAt(i);
      view.setEnabled(paramBoolean);
      if (view instanceof ViewGroup)
        a((ViewGroup)view, paramBoolean); 
    } 
  }
  
  private static void a(CheckableImageButton paramCheckableImageButton, View.OnClickListener paramOnClickListener, View.OnLongClickListener paramOnLongClickListener) {
    paramCheckableImageButton.setOnClickListener(paramOnClickListener);
    a(paramCheckableImageButton, paramOnLongClickListener);
  }
  
  private static void a(CheckableImageButton paramCheckableImageButton, View.OnLongClickListener paramOnLongClickListener) {
    boolean bool1;
    boolean bool = v.C((View)paramCheckableImageButton);
    boolean bool2 = false;
    byte b = 1;
    if (paramOnLongClickListener != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool || bool1)
      bool2 = true; 
    paramCheckableImageButton.setFocusable(bool2);
    paramCheckableImageButton.setClickable(bool);
    paramCheckableImageButton.setPressable(bool);
    paramCheckableImageButton.setLongClickable(bool1);
    if (!bool2)
      b = 2; 
    v.h((View)paramCheckableImageButton, b);
  }
  
  private void a(CheckableImageButton paramCheckableImageButton, boolean paramBoolean1, ColorStateList paramColorStateList, boolean paramBoolean2, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   4: astore #7
    //   6: aload #7
    //   8: astore #6
    //   10: aload #7
    //   12: ifnull -> 68
    //   15: iload_2
    //   16: ifne -> 28
    //   19: aload #7
    //   21: astore #6
    //   23: iload #4
    //   25: ifeq -> 68
    //   28: aload #7
    //   30: invokestatic i : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   33: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   36: astore #7
    //   38: iload_2
    //   39: ifeq -> 48
    //   42: aload #7
    //   44: aload_3
    //   45: invokestatic a : (Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    //   48: aload #7
    //   50: astore #6
    //   52: iload #4
    //   54: ifeq -> 68
    //   57: aload #7
    //   59: aload #5
    //   61: invokestatic a : (Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    //   64: aload #7
    //   66: astore #6
    //   68: aload_1
    //   69: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   72: aload #6
    //   74: if_acmpeq -> 83
    //   77: aload_1
    //   78: aload #6
    //   80: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   83: return
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEnabled : ()Z
    //   4: istore #5
    //   6: aload_0
    //   7: getfield e : Landroid/widget/EditText;
    //   10: astore #7
    //   12: iconst_1
    //   13: istore #4
    //   15: aload #7
    //   17: ifnull -> 36
    //   20: aload #7
    //   22: invokevirtual getText : ()Landroid/text/Editable;
    //   25: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   28: ifne -> 36
    //   31: iconst_1
    //   32: istore_3
    //   33: goto -> 38
    //   36: iconst_0
    //   37: istore_3
    //   38: aload_0
    //   39: getfield e : Landroid/widget/EditText;
    //   42: astore #7
    //   44: aload #7
    //   46: ifnull -> 60
    //   49: aload #7
    //   51: invokevirtual hasFocus : ()Z
    //   54: ifeq -> 60
    //   57: goto -> 63
    //   60: iconst_0
    //   61: istore #4
    //   63: aload_0
    //   64: getfield g : Lcom/google/android/material/textfield/f;
    //   67: invokevirtual c : ()Z
    //   70: istore #6
    //   72: aload_0
    //   73: getfield e0 : Landroid/content/res/ColorStateList;
    //   76: astore #7
    //   78: aload #7
    //   80: ifnull -> 103
    //   83: aload_0
    //   84: getfield o0 : Lcom/google/android/material/internal/a;
    //   87: aload #7
    //   89: invokevirtual a : (Landroid/content/res/ColorStateList;)V
    //   92: aload_0
    //   93: getfield o0 : Lcom/google/android/material/internal/a;
    //   96: aload_0
    //   97: getfield e0 : Landroid/content/res/ColorStateList;
    //   100: invokevirtual b : (Landroid/content/res/ColorStateList;)V
    //   103: iload #5
    //   105: ifne -> 139
    //   108: aload_0
    //   109: getfield o0 : Lcom/google/android/material/internal/a;
    //   112: aload_0
    //   113: getfield m0 : I
    //   116: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   119: invokevirtual a : (Landroid/content/res/ColorStateList;)V
    //   122: aload_0
    //   123: getfield o0 : Lcom/google/android/material/internal/a;
    //   126: aload_0
    //   127: getfield m0 : I
    //   130: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   133: invokevirtual b : (Landroid/content/res/ColorStateList;)V
    //   136: goto -> 227
    //   139: iload #6
    //   141: ifeq -> 161
    //   144: aload_0
    //   145: getfield o0 : Lcom/google/android/material/internal/a;
    //   148: aload_0
    //   149: getfield g : Lcom/google/android/material/textfield/f;
    //   152: invokevirtual f : ()Landroid/content/res/ColorStateList;
    //   155: invokevirtual a : (Landroid/content/res/ColorStateList;)V
    //   158: goto -> 227
    //   161: aload_0
    //   162: getfield j : Z
    //   165: ifeq -> 202
    //   168: aload_0
    //   169: getfield k : Landroid/widget/TextView;
    //   172: astore #7
    //   174: aload #7
    //   176: ifnull -> 202
    //   179: aload_0
    //   180: getfield o0 : Lcom/google/android/material/internal/a;
    //   183: astore #8
    //   185: aload #7
    //   187: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   190: astore #7
    //   192: aload #8
    //   194: aload #7
    //   196: invokevirtual a : (Landroid/content/res/ColorStateList;)V
    //   199: goto -> 227
    //   202: iload #4
    //   204: ifeq -> 227
    //   207: aload_0
    //   208: getfield f0 : Landroid/content/res/ColorStateList;
    //   211: astore #7
    //   213: aload #7
    //   215: ifnull -> 227
    //   218: aload_0
    //   219: getfield o0 : Lcom/google/android/material/internal/a;
    //   222: astore #8
    //   224: goto -> 192
    //   227: iload_3
    //   228: ifne -> 268
    //   231: aload_0
    //   232: invokevirtual isEnabled : ()Z
    //   235: ifeq -> 251
    //   238: iload #4
    //   240: ifne -> 268
    //   243: iload #6
    //   245: ifeq -> 251
    //   248: goto -> 268
    //   251: iload_2
    //   252: ifne -> 262
    //   255: aload_0
    //   256: getfield n0 : Z
    //   259: ifne -> 284
    //   262: aload_0
    //   263: iload_1
    //   264: invokespecial c : (Z)V
    //   267: return
    //   268: iload_2
    //   269: ifne -> 279
    //   272: aload_0
    //   273: getfield n0 : Z
    //   276: ifeq -> 284
    //   279: aload_0
    //   280: iload_1
    //   281: invokespecial b : (Z)V
    //   284: return
  }
  
  private Rect b(Rect paramRect) {
    if (this.e != null) {
      Rect rect = this.E;
      float f1 = this.o0.e();
      paramRect.left += this.e.getCompoundPaddingLeft();
      rect.top = a(paramRect, f1);
      paramRect.right -= this.e.getCompoundPaddingRight();
      rect.bottom = a(paramRect, rect, f1);
      return rect;
    } 
    throw new IllegalStateException();
  }
  
  private void b(int paramInt) {
    Iterator<g> iterator = this.S.iterator();
    while (iterator.hasNext())
      ((g)iterator.next()).a(this, paramInt); 
  }
  
  private void b(Canvas paramCanvas) {
    if (this.p)
      this.o0.a(paramCanvas); 
  }
  
  private static void b(CheckableImageButton paramCheckableImageButton, View.OnLongClickListener paramOnLongClickListener) {
    paramCheckableImageButton.setOnLongClickListener(paramOnLongClickListener);
    a(paramCheckableImageButton, paramOnLongClickListener);
  }
  
  private void b(boolean paramBoolean) {
    ValueAnimator valueAnimator = this.q0;
    if (valueAnimator != null && valueAnimator.isRunning())
      this.q0.cancel(); 
    if (paramBoolean && this.p0) {
      a(1.0F);
    } else {
      this.o0.b(1.0F);
    } 
    this.n0 = false;
    if (q())
      w(); 
  }
  
  private void c(Rect paramRect) {
    e.f.a.f.a0.g g1 = this.t;
    if (g1 != null) {
      int i = paramRect.bottom;
      int j = this.A;
      g1.setBounds(paramRect.left, i - j, paramRect.right, i);
    } 
  }
  
  private void c(boolean paramBoolean) {
    ValueAnimator valueAnimator = this.q0;
    if (valueAnimator != null && valueAnimator.isRunning())
      this.q0.cancel(); 
    if (paramBoolean && this.p0) {
      a(0.0F);
    } else {
      this.o0.b(0.0F);
    } 
    if (q() && ((c)this.s).s())
      p(); 
    this.n0 = true;
  }
  
  private void d(boolean paramBoolean) {
    if (paramBoolean && getEndIconDrawable() != null) {
      Drawable drawable = androidx.core.graphics.drawable.a.i(getEndIconDrawable()).mutate();
      androidx.core.graphics.drawable.a.b(drawable, this.g.e());
      this.R.setImageDrawable(drawable);
      return;
    } 
    i();
  }
  
  private void g() {
    e.f.a.f.a0.g g1 = this.s;
    if (g1 == null)
      return; 
    g1.setShapeAppearanceModel(this.u);
    if (n())
      this.s.a(this.y, this.B); 
    this.C = l();
    this.s.a(ColorStateList.valueOf(this.C));
    if (this.P == 3)
      this.e.getBackground().invalidateSelf(); 
    h();
    invalidate();
  }
  
  private e getEndIconDelegate() {
    e e = (e)this.Q.get(this.P);
    return (e != null) ? e : (e)this.Q.get(0);
  }
  
  private CheckableImageButton getEndIconToUpdateDummyDrawable() {
    return (this.c0.getVisibility() == 0) ? this.c0 : ((s() && a()) ? this.R : null);
  }
  
  private void h() {
    if (this.t == null)
      return; 
    if (o())
      this.t.a(ColorStateList.valueOf(this.B)); 
    invalidate();
  }
  
  private void i() {
    a(this.R, this.U, this.T, this.W, this.V);
  }
  
  private void j() {
    a(this.H, this.J, this.I, this.L, this.K);
  }
  
  private void k() {
    int i = this.w;
    if (i != 0) {
      if (i != 1) {
        if (i == 2) {
          e.f.a.f.a0.g g1;
          if (this.p && !(this.s instanceof c)) {
            g1 = new c(this.u);
          } else {
            g1 = new e.f.a.f.a0.g(this.u);
          } 
          this.s = g1;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.w);
          stringBuilder.append(" is illegal; only @BoxBackgroundMode constants are supported.");
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        this.s = new e.f.a.f.a0.g(this.u);
        this.t = new e.f.a.f.a0.g();
        return;
      } 
    } else {
      this.s = null;
    } 
    this.t = null;
  }
  
  private int l() {
    int i = this.C;
    if (this.w == 1)
      i = e.f.a.f.q.a.a(e.f.a.f.q.a.a((View)this, e.f.a.f.b.colorSurface, 0), this.C); 
    return i;
  }
  
  private int m() {
    if (!this.p)
      return 0; 
    int i = this.w;
    if (i != 0 && i != 1) {
      if (i != 2)
        return 0; 
      float f2 = this.o0.c() / 2.0F;
      return (int)f2;
    } 
    float f1 = this.o0.c();
    return (int)f1;
  }
  
  private boolean n() {
    return (this.w == 2 && o());
  }
  
  private boolean o() {
    return (this.y > -1 && this.B != 0);
  }
  
  private void p() {
    if (q())
      ((c)this.s).t(); 
  }
  
  private boolean q() {
    return (this.p && !TextUtils.isEmpty(this.q) && this.s instanceof c);
  }
  
  private void r() {
    Iterator<f> iterator = this.O.iterator();
    while (iterator.hasNext())
      ((f)iterator.next()).a(this); 
  }
  
  private boolean s() {
    return (this.P != 0);
  }
  
  private void setEditText(EditText paramEditText) {
    if (this.e == null) {
      if (this.P != 3 && !(paramEditText instanceof TextInputEditText))
        Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead."); 
      this.e = paramEditText;
      v();
      setTextInputAccessibilityDelegate(new e(this));
      this.o0.b(this.e.getTypeface());
      this.o0.a(this.e.getTextSize());
      int i = this.e.getGravity();
      this.o0.b(i & 0xFFFFFF8F | 0x30);
      this.o0.c(i);
      this.e.addTextChangedListener(new a(this));
      if (this.e0 == null)
        this.e0 = this.e.getHintTextColors(); 
      if (this.p) {
        if (TextUtils.isEmpty(this.q)) {
          this.f = this.e.getHint();
          setHint(this.f);
          this.e.setHint(null);
        } 
        this.r = true;
      } 
      if (this.k != null)
        a(this.e.getText().length()); 
      e();
      this.g.a();
      this.H.bringToFront();
      this.d.bringToFront();
      this.c0.bringToFront();
      r();
      a(false, true);
      return;
    } 
    throw new IllegalArgumentException("We already have an EditText, can only have one");
  }
  
  private void setErrorIconVisible(boolean paramBoolean) {
    CheckableImageButton checkableImageButton = this.c0;
    boolean bool = false;
    if (paramBoolean) {
      b = 0;
    } else {
      b = 8;
    } 
    checkableImageButton.setVisibility(b);
    FrameLayout frameLayout = this.d;
    byte b = bool;
    if (paramBoolean)
      b = 8; 
    frameLayout.setVisibility(b);
    if (!s())
      C(); 
  }
  
  private void setHintInternal(CharSequence paramCharSequence) {
    if (!TextUtils.equals(paramCharSequence, this.q)) {
      this.q = paramCharSequence;
      this.o0.a(paramCharSequence);
      if (!this.n0)
        w(); 
    } 
  }
  
  private boolean t() {
    return (getStartIconDrawable() != null);
  }
  
  private boolean u() {
    int i = this.w;
    null = true;
    if (i == 1)
      if (Build.VERSION.SDK_INT >= 16) {
        if (this.e.getMinLines() <= 1)
          return true; 
      } else {
        return null;
      }  
    return false;
  }
  
  private void v() {
    k();
    x();
    f();
    if (this.w != 0)
      D(); 
  }
  
  private void w() {
    if (!q())
      return; 
    RectF rectF = this.F;
    this.o0.a(rectF);
    a(rectF);
    rectF.offset(-getPaddingLeft(), 0.0F);
    ((c)this.s).a(rectF);
  }
  
  private void x() {
    if (y())
      v.a((View)this.e, (Drawable)this.s); 
  }
  
  private boolean y() {
    EditText editText = this.e;
    return (editText != null && this.s != null && editText.getBackground() == null && this.w != 0);
  }
  
  private void z() {
    if (this.k != null) {
      int i;
      EditText editText = this.e;
      if (editText == null) {
        i = 0;
      } else {
        i = editText.getText().length();
      } 
      a(i);
    } 
  }
  
  void a(float paramFloat) {
    if (this.o0.f() == paramFloat)
      return; 
    if (this.q0 == null) {
      this.q0 = new ValueAnimator();
      this.q0.setInterpolator(e.f.a.f.l.a.b);
      this.q0.setDuration(167L);
      this.q0.addUpdateListener(new d(this));
    } 
    this.q0.setFloatValues(new float[] { this.o0.f(), paramFloat });
    this.q0.start();
  }
  
  void a(int paramInt) {
    boolean bool = this.j;
    if (this.i == -1) {
      this.k.setText(String.valueOf(paramInt));
      this.k.setContentDescription(null);
      this.j = false;
    } else {
      boolean bool1;
      if (v.e((View)this.k) == 1)
        v.g((View)this.k, 0); 
      if (paramInt > this.i) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.j = bool1;
      a(getContext(), this.k, paramInt, this.i, this.j);
      if (bool != this.j) {
        A();
        if (this.j)
          v.g((View)this.k, 1); 
      } 
      this.k.setText(getContext().getString(i.character_counter_pattern, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.i) }));
    } 
    if (this.e != null && bool != this.j) {
      a(false);
      f();
      e();
    } 
  }
  
  void a(TextView paramTextView, int paramInt) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: iload_2
    //   4: invokestatic d : (Landroid/widget/TextView;I)V
    //   7: getstatic android/os/Build$VERSION.SDK_INT : I
    //   10: bipush #23
    //   12: if_icmplt -> 35
    //   15: aload_1
    //   16: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   19: invokevirtual getDefaultColor : ()I
    //   22: istore_2
    //   23: iload_2
    //   24: ldc_w -65281
    //   27: if_icmpne -> 35
    //   30: iload_3
    //   31: istore_2
    //   32: goto -> 40
    //   35: iconst_0
    //   36: istore_2
    //   37: goto -> 40
    //   40: iload_2
    //   41: ifeq -> 65
    //   44: aload_1
    //   45: getstatic e/f/a/f/j.TextAppearance_AppCompat_Caption : I
    //   48: invokestatic d : (Landroid/widget/TextView;I)V
    //   51: aload_1
    //   52: aload_0
    //   53: invokevirtual getContext : ()Landroid/content/Context;
    //   56: getstatic e/f/a/f/c.design_error : I
    //   59: invokestatic a : (Landroid/content/Context;I)I
    //   62: invokevirtual setTextColor : (I)V
    //   65: return
    //   66: astore #4
    //   68: iload_3
    //   69: istore_2
    //   70: goto -> 40
    // Exception table:
    //   from	to	target	type
    //   2	23	66	java/lang/Exception
  }
  
  public void a(f paramf) {
    this.O.add(paramf);
    if (this.e != null)
      paramf.a(this); 
  }
  
  public void a(g paramg) {
    this.S.add(paramg);
  }
  
  void a(boolean paramBoolean) {
    a(paramBoolean, false);
  }
  
  public boolean a() {
    return (this.d.getVisibility() == 0 && this.R.getVisibility() == 0);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (paramView instanceof EditText) {
      FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      layoutParams.gravity = layoutParams.gravity & 0xFFFFFF8F | 0x10;
      this.c.addView(paramView, (ViewGroup.LayoutParams)layoutParams);
      this.c.setLayoutParams(paramLayoutParams);
      D();
      setEditText((EditText)paramView);
      return;
    } 
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public boolean b() {
    return this.g.l();
  }
  
  boolean c() {
    return this.r;
  }
  
  public boolean d() {
    return (this.H.getVisibility() == 0);
  }
  
  public void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt) {
    if (this.f != null) {
      EditText editText = this.e;
      if (editText != null) {
        boolean bool = this.r;
        this.r = false;
        CharSequence charSequence = editText.getHint();
        this.e.setHint(this.f);
        try {
          super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
          return;
        } finally {
          this.e.setHint(charSequence);
          this.r = bool;
        } 
      } 
    } 
    super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) {
    this.s0 = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.s0 = false;
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    b(paramCanvas);
    a(paramCanvas);
  }
  
  protected void drawableStateChanged() {
    boolean bool1;
    if (this.r0)
      return; 
    boolean bool2 = true;
    this.r0 = true;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    com.google.android.material.internal.a a1 = this.o0;
    if (a1 != null) {
      bool1 = a1.a(arrayOfInt) | false;
    } else {
      bool1 = false;
    } 
    if (!v.I((View)this) || !isEnabled())
      bool2 = false; 
    a(bool2);
    e();
    f();
    if (bool1)
      invalidate(); 
    this.r0 = false;
  }
  
  void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroid/widget/EditText;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 106
    //   9: aload_0
    //   10: getfield w : I
    //   13: ifeq -> 17
    //   16: return
    //   17: aload_2
    //   18: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   21: astore_3
    //   22: aload_3
    //   23: ifnonnull -> 27
    //   26: return
    //   27: aload_3
    //   28: astore_2
    //   29: aload_3
    //   30: invokestatic a : (Landroid/graphics/drawable/Drawable;)Z
    //   33: ifeq -> 41
    //   36: aload_3
    //   37: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   40: astore_2
    //   41: aload_0
    //   42: getfield g : Lcom/google/android/material/textfield/f;
    //   45: invokevirtual c : ()Z
    //   48: ifeq -> 71
    //   51: aload_0
    //   52: getfield g : Lcom/google/android/material/textfield/f;
    //   55: invokevirtual e : ()I
    //   58: istore_1
    //   59: aload_2
    //   60: iload_1
    //   61: getstatic android/graphics/PorterDuff$Mode.SRC_IN : Landroid/graphics/PorterDuff$Mode;
    //   64: invokestatic a : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   67: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
    //   70: return
    //   71: aload_0
    //   72: getfield j : Z
    //   75: ifeq -> 95
    //   78: aload_0
    //   79: getfield k : Landroid/widget/TextView;
    //   82: astore_3
    //   83: aload_3
    //   84: ifnull -> 95
    //   87: aload_3
    //   88: invokevirtual getCurrentTextColor : ()I
    //   91: istore_1
    //   92: goto -> 59
    //   95: aload_2
    //   96: invokestatic b : (Landroid/graphics/drawable/Drawable;)V
    //   99: aload_0
    //   100: getfield e : Landroid/widget/EditText;
    //   103: invokevirtual refreshDrawableState : ()V
    //   106: return
  }
  
  void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield s : Le/f/a/f/a0/g;
    //   4: ifnull -> 362
    //   7: aload_0
    //   8: getfield w : I
    //   11: ifne -> 15
    //   14: return
    //   15: aload_0
    //   16: invokevirtual isFocused : ()Z
    //   19: istore #4
    //   21: iconst_0
    //   22: istore #5
    //   24: iload #4
    //   26: ifne -> 56
    //   29: aload_0
    //   30: getfield e : Landroid/widget/EditText;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 51
    //   40: aload #6
    //   42: invokevirtual hasFocus : ()Z
    //   45: ifeq -> 51
    //   48: goto -> 56
    //   51: iconst_0
    //   52: istore_3
    //   53: goto -> 58
    //   56: iconst_1
    //   57: istore_3
    //   58: aload_0
    //   59: invokevirtual isHovered : ()Z
    //   62: ifne -> 92
    //   65: aload_0
    //   66: getfield e : Landroid/widget/EditText;
    //   69: astore #6
    //   71: aload #6
    //   73: ifnull -> 87
    //   76: aload #6
    //   78: invokevirtual isHovered : ()Z
    //   81: ifeq -> 87
    //   84: goto -> 92
    //   87: iconst_0
    //   88: istore_2
    //   89: goto -> 94
    //   92: iconst_1
    //   93: istore_2
    //   94: aload_0
    //   95: invokevirtual isEnabled : ()Z
    //   98: ifne -> 114
    //   101: aload_0
    //   102: getfield m0 : I
    //   105: istore_1
    //   106: aload_0
    //   107: iload_1
    //   108: putfield B : I
    //   111: goto -> 194
    //   114: aload_0
    //   115: getfield g : Lcom/google/android/material/textfield/f;
    //   118: invokevirtual c : ()Z
    //   121: ifeq -> 135
    //   124: aload_0
    //   125: getfield g : Lcom/google/android/material/textfield/f;
    //   128: invokevirtual e : ()I
    //   131: istore_1
    //   132: goto -> 106
    //   135: aload_0
    //   136: getfield j : Z
    //   139: ifeq -> 162
    //   142: aload_0
    //   143: getfield k : Landroid/widget/TextView;
    //   146: astore #6
    //   148: aload #6
    //   150: ifnull -> 162
    //   153: aload #6
    //   155: invokevirtual getCurrentTextColor : ()I
    //   158: istore_1
    //   159: goto -> 106
    //   162: iload_3
    //   163: ifeq -> 174
    //   166: aload_0
    //   167: getfield i0 : I
    //   170: istore_1
    //   171: goto -> 106
    //   174: iload_2
    //   175: ifeq -> 186
    //   178: aload_0
    //   179: getfield h0 : I
    //   182: istore_1
    //   183: goto -> 106
    //   186: aload_0
    //   187: getfield g0 : I
    //   190: istore_1
    //   191: goto -> 106
    //   194: aload_0
    //   195: getfield g : Lcom/google/android/material/textfield/f;
    //   198: invokevirtual c : ()Z
    //   201: ifeq -> 220
    //   204: aload_0
    //   205: invokespecial getEndIconDelegate : ()Lcom/google/android/material/textfield/e;
    //   208: invokevirtual b : ()Z
    //   211: ifeq -> 220
    //   214: iconst_1
    //   215: istore #4
    //   217: goto -> 223
    //   220: iconst_0
    //   221: istore #4
    //   223: aload_0
    //   224: iload #4
    //   226: invokespecial d : (Z)V
    //   229: iload #5
    //   231: istore #4
    //   233: aload_0
    //   234: invokevirtual getErrorIconDrawable : ()Landroid/graphics/drawable/Drawable;
    //   237: ifnull -> 271
    //   240: iload #5
    //   242: istore #4
    //   244: aload_0
    //   245: getfield g : Lcom/google/android/material/textfield/f;
    //   248: invokevirtual k : ()Z
    //   251: ifeq -> 271
    //   254: iload #5
    //   256: istore #4
    //   258: aload_0
    //   259: getfield g : Lcom/google/android/material/textfield/f;
    //   262: invokevirtual c : ()Z
    //   265: ifeq -> 271
    //   268: iconst_1
    //   269: istore #4
    //   271: aload_0
    //   272: iload #4
    //   274: invokespecial setErrorIconVisible : (Z)V
    //   277: iload_2
    //   278: ifne -> 285
    //   281: iload_3
    //   282: ifeq -> 300
    //   285: aload_0
    //   286: invokevirtual isEnabled : ()Z
    //   289: ifeq -> 300
    //   292: aload_0
    //   293: getfield A : I
    //   296: istore_1
    //   297: goto -> 305
    //   300: aload_0
    //   301: getfield z : I
    //   304: istore_1
    //   305: aload_0
    //   306: iload_1
    //   307: putfield y : I
    //   310: aload_0
    //   311: getfield w : I
    //   314: iconst_1
    //   315: if_icmpne -> 358
    //   318: aload_0
    //   319: invokevirtual isEnabled : ()Z
    //   322: ifne -> 338
    //   325: aload_0
    //   326: getfield k0 : I
    //   329: istore_1
    //   330: aload_0
    //   331: iload_1
    //   332: putfield C : I
    //   335: goto -> 358
    //   338: iload_2
    //   339: ifeq -> 350
    //   342: aload_0
    //   343: getfield l0 : I
    //   346: istore_1
    //   347: goto -> 330
    //   350: aload_0
    //   351: getfield j0 : I
    //   354: istore_1
    //   355: goto -> 330
    //   358: aload_0
    //   359: invokespecial g : ()V
    //   362: return
  }
  
  public int getBaseline() {
    EditText editText = this.e;
    return (editText != null) ? (editText.getBaseline() + getPaddingTop() + m()) : super.getBaseline();
  }
  
  e.f.a.f.a0.g getBoxBackground() {
    int i = this.w;
    if (i == 1 || i == 2)
      return this.s; 
    throw new IllegalStateException();
  }
  
  public int getBoxBackgroundColor() {
    return this.C;
  }
  
  public int getBoxBackgroundMode() {
    return this.w;
  }
  
  public float getBoxCornerRadiusBottomEnd() {
    return this.s.b();
  }
  
  public float getBoxCornerRadiusBottomStart() {
    return this.s.c();
  }
  
  public float getBoxCornerRadiusTopEnd() {
    return this.s.n();
  }
  
  public float getBoxCornerRadiusTopStart() {
    return this.s.m();
  }
  
  public int getBoxStrokeColor() {
    return this.i0;
  }
  
  public int getCounterMaxLength() {
    return this.i;
  }
  
  CharSequence getCounterOverflowDescription() {
    if (this.h && this.j) {
      TextView textView = this.k;
      if (textView != null)
        return textView.getContentDescription(); 
    } 
    return null;
  }
  
  public ColorStateList getCounterOverflowTextColor() {
    return this.n;
  }
  
  public ColorStateList getCounterTextColor() {
    return this.n;
  }
  
  public ColorStateList getDefaultHintTextColor() {
    return this.e0;
  }
  
  public EditText getEditText() {
    return this.e;
  }
  
  public CharSequence getEndIconContentDescription() {
    return this.R.getContentDescription();
  }
  
  public Drawable getEndIconDrawable() {
    return this.R.getDrawable();
  }
  
  public int getEndIconMode() {
    return this.P;
  }
  
  CheckableImageButton getEndIconView() {
    return this.R;
  }
  
  public CharSequence getError() {
    return this.g.k() ? this.g.d() : null;
  }
  
  public int getErrorCurrentTextColors() {
    return this.g.e();
  }
  
  public Drawable getErrorIconDrawable() {
    return this.c0.getDrawable();
  }
  
  final int getErrorTextCurrentColor() {
    return this.g.e();
  }
  
  public CharSequence getHelperText() {
    return this.g.l() ? this.g.g() : null;
  }
  
  public int getHelperTextCurrentTextColor() {
    return this.g.h();
  }
  
  public CharSequence getHint() {
    return this.p ? this.q : null;
  }
  
  final float getHintCollapsedTextHeight() {
    return this.o0.c();
  }
  
  final int getHintCurrentCollapsedTextColor() {
    return this.o0.d();
  }
  
  public ColorStateList getHintTextColor() {
    return this.f0;
  }
  
  @Deprecated
  public CharSequence getPasswordVisibilityToggleContentDescription() {
    return this.R.getContentDescription();
  }
  
  @Deprecated
  public Drawable getPasswordVisibilityToggleDrawable() {
    return this.R.getDrawable();
  }
  
  public CharSequence getStartIconContentDescription() {
    return this.H.getContentDescription();
  }
  
  public Drawable getStartIconDrawable() {
    return this.H.getDrawable();
  }
  
  public Typeface getTypeface() {
    return this.G;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    EditText editText = this.e;
    if (editText != null) {
      Rect rect = this.D;
      com.google.android.material.internal.b.a((ViewGroup)this, (View)editText, rect);
      c(rect);
      if (this.p) {
        this.o0.a(a(rect));
        this.o0.b(b(rect));
        this.o0.i();
        if (q() && !this.n0)
          w(); 
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    boolean bool1 = B();
    boolean bool2 = C();
    if (bool1 || bool2)
      this.e.post(new c(this)); 
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof h)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    h h = (h)paramParcelable;
    super.onRestoreInstanceState(h.e());
    setError(h.e);
    if (h.f)
      this.R.post(new b(this)); 
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState() {
    boolean bool;
    h h = new h(super.onSaveInstanceState());
    if (this.g.c())
      h.e = getError(); 
    if (s() && this.R.isChecked()) {
      bool = true;
    } else {
      bool = false;
    } 
    h.f = bool;
    return (Parcelable)h;
  }
  
  public void setBoxBackgroundColor(int paramInt) {
    if (this.C != paramInt) {
      this.C = paramInt;
      this.j0 = paramInt;
      g();
    } 
  }
  
  public void setBoxBackgroundColorResource(int paramInt) {
    setBoxBackgroundColor(b.g.e.a.a(getContext(), paramInt));
  }
  
  public void setBoxBackgroundMode(int paramInt) {
    if (paramInt == this.w)
      return; 
    this.w = paramInt;
    if (this.e != null)
      v(); 
  }
  
  public void setBoxStrokeColor(int paramInt) {
    if (this.i0 != paramInt) {
      this.i0 = paramInt;
      f();
    } 
  }
  
  public void setCounterEnabled(boolean paramBoolean) {
    if (this.h != paramBoolean) {
      if (paramBoolean) {
        this.k = (TextView)new z(getContext());
        this.k.setId(e.f.a.f.f.textinput_counter);
        Typeface typeface = this.G;
        if (typeface != null)
          this.k.setTypeface(typeface); 
        this.k.setMaxLines(1);
        this.g.a(this.k, 2);
        A();
        z();
      } else {
        this.g.b(this.k, 2);
        this.k = null;
      } 
      this.h = paramBoolean;
    } 
  }
  
  public void setCounterMaxLength(int paramInt) {
    if (this.i != paramInt) {
      if (paramInt <= 0)
        paramInt = -1; 
      this.i = paramInt;
      if (this.h)
        z(); 
    } 
  }
  
  public void setCounterOverflowTextAppearance(int paramInt) {
    if (this.l != paramInt) {
      this.l = paramInt;
      A();
    } 
  }
  
  public void setCounterOverflowTextColor(ColorStateList paramColorStateList) {
    if (this.o != paramColorStateList) {
      this.o = paramColorStateList;
      A();
    } 
  }
  
  public void setCounterTextAppearance(int paramInt) {
    if (this.m != paramInt) {
      this.m = paramInt;
      A();
    } 
  }
  
  public void setCounterTextColor(ColorStateList paramColorStateList) {
    if (this.n != paramColorStateList) {
      this.n = paramColorStateList;
      A();
    } 
  }
  
  public void setDefaultHintTextColor(ColorStateList paramColorStateList) {
    this.e0 = paramColorStateList;
    this.f0 = paramColorStateList;
    if (this.e != null)
      a(false); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    a((ViewGroup)this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setEndIconActivated(boolean paramBoolean) {
    this.R.setActivated(paramBoolean);
  }
  
  public void setEndIconCheckable(boolean paramBoolean) {
    this.R.setCheckable(paramBoolean);
  }
  
  public void setEndIconContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setEndIconContentDescription(charSequence);
  }
  
  public void setEndIconContentDescription(CharSequence paramCharSequence) {
    if (getEndIconContentDescription() != paramCharSequence)
      this.R.setContentDescription(paramCharSequence); 
  }
  
  public void setEndIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setEndIconDrawable(drawable);
  }
  
  public void setEndIconDrawable(Drawable paramDrawable) {
    this.R.setImageDrawable(paramDrawable);
  }
  
  public void setEndIconMode(int paramInt) {
    boolean bool;
    int i = this.P;
    this.P = paramInt;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    setEndIconVisible(bool);
    if (getEndIconDelegate().a(this.w)) {
      getEndIconDelegate().a();
      i();
      b(i);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("The current box background mode ");
    stringBuilder.append(this.w);
    stringBuilder.append(" is not supported by the end icon mode ");
    stringBuilder.append(paramInt);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void setEndIconOnClickListener(View.OnClickListener paramOnClickListener) {
    a(this.R, paramOnClickListener, this.d0);
  }
  
  public void setEndIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    this.d0 = paramOnLongClickListener;
    b(this.R, paramOnLongClickListener);
  }
  
  public void setEndIconTintList(ColorStateList paramColorStateList) {
    if (this.T != paramColorStateList) {
      this.T = paramColorStateList;
      this.U = true;
      i();
    } 
  }
  
  public void setEndIconTintMode(PorterDuff.Mode paramMode) {
    if (this.V != paramMode) {
      this.V = paramMode;
      this.W = true;
      i();
    } 
  }
  
  public void setEndIconVisible(boolean paramBoolean) {
    if (a() != paramBoolean) {
      byte b;
      CheckableImageButton checkableImageButton = this.R;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 4;
      } 
      checkableImageButton.setVisibility(b);
      C();
    } 
  }
  
  public void setError(CharSequence paramCharSequence) {
    if (!this.g.k()) {
      if (TextUtils.isEmpty(paramCharSequence))
        return; 
      setErrorEnabled(true);
    } 
    if (!TextUtils.isEmpty(paramCharSequence)) {
      this.g.a(paramCharSequence);
      return;
    } 
    this.g.i();
  }
  
  public void setErrorEnabled(boolean paramBoolean) {
    this.g.a(paramBoolean);
  }
  
  public void setErrorIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setErrorIconDrawable(drawable);
  }
  
  public void setErrorIconDrawable(Drawable paramDrawable) {
    boolean bool;
    this.c0.setImageDrawable(paramDrawable);
    if (paramDrawable != null && this.g.k()) {
      bool = true;
    } else {
      bool = false;
    } 
    setErrorIconVisible(bool);
  }
  
  public void setErrorIconTintList(ColorStateList paramColorStateList) {
    Drawable drawable2 = this.c0.getDrawable();
    Drawable drawable1 = drawable2;
    if (drawable2 != null) {
      drawable1 = androidx.core.graphics.drawable.a.i(drawable2).mutate();
      androidx.core.graphics.drawable.a.a(drawable1, paramColorStateList);
    } 
    if (this.c0.getDrawable() != drawable1)
      this.c0.setImageDrawable(drawable1); 
  }
  
  public void setErrorIconTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable2 = this.c0.getDrawable();
    Drawable drawable1 = drawable2;
    if (drawable2 != null) {
      drawable1 = androidx.core.graphics.drawable.a.i(drawable2).mutate();
      androidx.core.graphics.drawable.a.a(drawable1, paramMode);
    } 
    if (this.c0.getDrawable() != drawable1)
      this.c0.setImageDrawable(drawable1); 
  }
  
  public void setErrorTextAppearance(int paramInt) {
    this.g.b(paramInt);
  }
  
  public void setErrorTextColor(ColorStateList paramColorStateList) {
    this.g.a(paramColorStateList);
  }
  
  public void setHelperText(CharSequence paramCharSequence) {
    if (TextUtils.isEmpty(paramCharSequence)) {
      if (b()) {
        setHelperTextEnabled(false);
        return;
      } 
    } else {
      if (!b())
        setHelperTextEnabled(true); 
      this.g.b(paramCharSequence);
    } 
  }
  
  public void setHelperTextColor(ColorStateList paramColorStateList) {
    this.g.b(paramColorStateList);
  }
  
  public void setHelperTextEnabled(boolean paramBoolean) {
    this.g.b(paramBoolean);
  }
  
  public void setHelperTextTextAppearance(int paramInt) {
    this.g.c(paramInt);
  }
  
  public void setHint(CharSequence paramCharSequence) {
    if (this.p) {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    } 
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean) {
    this.p0 = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean) {
    if (paramBoolean != this.p) {
      this.p = paramBoolean;
      if (!this.p) {
        this.r = false;
        if (!TextUtils.isEmpty(this.q) && TextUtils.isEmpty(this.e.getHint()))
          this.e.setHint(this.q); 
        setHintInternal(null);
      } else {
        CharSequence charSequence = this.e.getHint();
        if (!TextUtils.isEmpty(charSequence)) {
          if (TextUtils.isEmpty(this.q))
            setHint(charSequence); 
          this.e.setHint(null);
        } 
        this.r = true;
      } 
      if (this.e != null)
        D(); 
    } 
  }
  
  public void setHintTextAppearance(int paramInt) {
    this.o0.a(paramInt);
    this.f0 = this.o0.b();
    if (this.e != null) {
      a(false);
      D();
    } 
  }
  
  public void setHintTextColor(ColorStateList paramColorStateList) {
    if (this.f0 != paramColorStateList) {
      if (this.e0 == null)
        this.o0.a(paramColorStateList); 
      this.f0 = paramColorStateList;
      if (this.e != null)
        a(false); 
    } 
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setPasswordVisibilityToggleContentDescription(charSequence);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence) {
    this.R.setContentDescription(paramCharSequence);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setPasswordVisibilityToggleDrawable(drawable);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable) {
    this.R.setImageDrawable(paramDrawable);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean) {
    if (paramBoolean && this.P != 1) {
      setEndIconMode(1);
      return;
    } 
    if (!paramBoolean)
      setEndIconMode(0); 
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList) {
    this.T = paramColorStateList;
    this.U = true;
    i();
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode) {
    this.V = paramMode;
    this.W = true;
    i();
  }
  
  public void setStartIconCheckable(boolean paramBoolean) {
    this.H.setCheckable(paramBoolean);
  }
  
  public void setStartIconContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setStartIconContentDescription(charSequence);
  }
  
  public void setStartIconContentDescription(CharSequence paramCharSequence) {
    if (getStartIconContentDescription() != paramCharSequence)
      this.H.setContentDescription(paramCharSequence); 
  }
  
  public void setStartIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setStartIconDrawable(drawable);
  }
  
  public void setStartIconDrawable(Drawable paramDrawable) {
    this.H.setImageDrawable(paramDrawable);
    if (paramDrawable != null) {
      setStartIconVisible(true);
      j();
      return;
    } 
    setStartIconVisible(false);
    setStartIconOnClickListener(null);
    setStartIconOnLongClickListener(null);
    setStartIconContentDescription((CharSequence)null);
  }
  
  public void setStartIconOnClickListener(View.OnClickListener paramOnClickListener) {
    a(this.H, paramOnClickListener, this.N);
  }
  
  public void setStartIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    this.N = paramOnLongClickListener;
    b(this.H, paramOnLongClickListener);
  }
  
  public void setStartIconTintList(ColorStateList paramColorStateList) {
    if (this.I != paramColorStateList) {
      this.I = paramColorStateList;
      this.J = true;
      j();
    } 
  }
  
  public void setStartIconTintMode(PorterDuff.Mode paramMode) {
    if (this.K != paramMode) {
      this.K = paramMode;
      this.L = true;
      j();
    } 
  }
  
  public void setStartIconVisible(boolean paramBoolean) {
    if (d() != paramBoolean) {
      byte b;
      CheckableImageButton checkableImageButton = this.H;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      checkableImageButton.setVisibility(b);
      C();
    } 
  }
  
  public void setTextInputAccessibilityDelegate(e parame) {
    EditText editText = this.e;
    if (editText != null)
      v.a((View)editText, parame); 
  }
  
  public void setTypeface(Typeface paramTypeface) {
    if (paramTypeface != this.G) {
      this.G = paramTypeface;
      this.o0.b(paramTypeface);
      this.g.a(paramTypeface);
      TextView textView = this.k;
      if (textView != null)
        textView.setTypeface(paramTypeface); 
    } 
  }
  
  class a implements TextWatcher {
    a(TextInputLayout this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      TextInputLayout textInputLayout = this.c;
      textInputLayout.a(TextInputLayout.a(textInputLayout) ^ true);
      textInputLayout = this.c;
      if (textInputLayout.h)
        textInputLayout.a(param1Editable.length()); 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class b implements Runnable {
    b(TextInputLayout this$0) {}
    
    public void run() {
      TextInputLayout.b(this.c).performClick();
      TextInputLayout.b(this.c).jumpDrawablesToCurrentState();
    }
  }
  
  class c implements Runnable {
    c(TextInputLayout this$0) {}
    
    public void run() {
      this.c.e.requestLayout();
    }
  }
  
  class d implements ValueAnimator.AnimatorUpdateListener {
    d(TextInputLayout this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.o0.b(((Float)param1ValueAnimator.getAnimatedValue()).floatValue());
    }
  }
  
  public static class e extends b.g.m.a {
    private final TextInputLayout d;
    
    public e(TextInputLayout param1TextInputLayout) {
      this.d = param1TextInputLayout;
    }
    
    public void a(View param1View, b.g.m.e0.c param1c) {
      boolean bool1;
      super.a(param1View, param1c);
      EditText editText = this.d.getEditText();
      if (editText != null) {
        Editable editable = editText.getText();
      } else {
        editText = null;
      } 
      CharSequence charSequence3 = this.d.getHint();
      CharSequence charSequence1 = this.d.getError();
      CharSequence charSequence2 = this.d.getCounterOverflowDescription();
      int i = TextUtils.isEmpty((CharSequence)editText) ^ true;
      int j = TextUtils.isEmpty(charSequence3) ^ true;
      int k = TextUtils.isEmpty(charSequence1) ^ true;
      boolean bool2 = false;
      if (k != 0 || !TextUtils.isEmpty(charSequence2)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (i != 0) {
        param1c.h((CharSequence)editText);
      } else if (j != 0) {
        param1c.h(charSequence3);
      } 
      if (j != 0) {
        param1c.d(charSequence3);
        boolean bool = bool2;
        if (i == 0) {
          bool = bool2;
          if (j != 0)
            bool = true; 
        } 
        param1c.n(bool);
      } 
      if (bool1) {
        CharSequence charSequence;
        if (k != 0) {
          charSequence = charSequence1;
        } else {
          charSequence = charSequence2;
        } 
        param1c.c(charSequence);
        param1c.e(true);
      } 
    }
  }
  
  public static interface f {
    void a(TextInputLayout param1TextInputLayout);
  }
  
  public static interface g {
    void a(TextInputLayout param1TextInputLayout, int param1Int);
  }
  
  static class h extends b.i.a.a {
    public static final Parcelable.Creator<h> CREATOR = (Parcelable.Creator<h>)new a();
    
    CharSequence e;
    
    boolean f;
    
    h(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.e = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.f = bool;
    }
    
    h(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("TextInputLayout.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" error=");
      stringBuilder.append(this.e);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<h> {
      public TextInputLayout.h createFromParcel(Parcel param2Parcel) {
        return new TextInputLayout.h(param2Parcel, null);
      }
      
      public TextInputLayout.h createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new TextInputLayout.h(param2Parcel, param2ClassLoader);
      }
      
      public TextInputLayout.h[] newArray(int param2Int) {
        return new TextInputLayout.h[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<h> {
    public TextInputLayout.h createFromParcel(Parcel param1Parcel) {
      return new TextInputLayout.h(param1Parcel, null);
    }
    
    public TextInputLayout.h createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new TextInputLayout.h(param1Parcel, param1ClassLoader);
    }
    
    public TextInputLayout.h[] newArray(int param1Int) {
      return new TextInputLayout.h[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/TextInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */