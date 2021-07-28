package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import b.g.m.v;
import e.f.a.f.d;
import e.f.a.f.l.b;
import java.util.ArrayList;
import java.util.List;

final class f {
  private final Context a;
  
  private final TextInputLayout b;
  
  private LinearLayout c;
  
  private int d;
  
  private FrameLayout e;
  
  private int f;
  
  private Animator g;
  
  private final float h;
  
  private int i;
  
  private int j;
  
  private CharSequence k;
  
  private boolean l;
  
  private TextView m;
  
  private int n;
  
  private ColorStateList o;
  
  private CharSequence p;
  
  private boolean q;
  
  private TextView r;
  
  private int s;
  
  private ColorStateList t;
  
  private Typeface u;
  
  public f(TextInputLayout paramTextInputLayout) {
    this.a = paramTextInputLayout.getContext();
    this.b = paramTextInputLayout;
    this.h = this.a.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
  }
  
  private ObjectAnimator a(TextView paramTextView) {
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramTextView, View.TRANSLATION_Y, new float[] { -this.h, 0.0F });
    objectAnimator.setDuration(217L);
    objectAnimator.setInterpolator(e.f.a.f.l.a.d);
    return objectAnimator;
  }
  
  private ObjectAnimator a(TextView paramTextView, boolean paramBoolean) {
    float f1;
    if (paramBoolean) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    } 
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramTextView, View.ALPHA, new float[] { f1 });
    objectAnimator.setDuration(167L);
    objectAnimator.setInterpolator(e.f.a.f.l.a.a);
    return objectAnimator;
  }
  
  private void a(int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    if (paramInt2 != 0) {
      TextView textView = d(paramInt2);
      if (textView != null) {
        textView.setVisibility(0);
        textView.setAlpha(1.0F);
      } 
    } 
    if (paramInt1 != 0) {
      TextView textView = d(paramInt1);
      if (textView != null) {
        textView.setVisibility(4);
        if (paramInt1 == 1)
          textView.setText(null); 
      } 
    } 
    this.i = paramInt2;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      AnimatorSet animatorSet = new AnimatorSet();
      this.g = (Animator)animatorSet;
      ArrayList<Animator> arrayList = new ArrayList();
      a(arrayList, this.q, this.r, 2, paramInt1, paramInt2);
      a(arrayList, this.l, this.m, 1, paramInt1, paramInt2);
      b.a(animatorSet, arrayList);
      animatorSet.addListener((Animator.AnimatorListener)new a(this, paramInt2, d(paramInt1), paramInt1, d(paramInt2)));
      animatorSet.start();
    } else {
      a(paramInt1, paramInt2);
    } 
    this.b.e();
    this.b.a(paramBoolean);
    this.b.f();
  }
  
  private void a(ViewGroup paramViewGroup, int paramInt) {
    if (paramInt == 0)
      paramViewGroup.setVisibility(8); 
  }
  
  private void a(TextView paramTextView, Typeface paramTypeface) {
    if (paramTextView != null)
      paramTextView.setTypeface(paramTypeface); 
  }
  
  private void a(List<Animator> paramList, boolean paramBoolean, TextView paramTextView, int paramInt1, int paramInt2, int paramInt3) {
    if (paramTextView != null) {
      if (!paramBoolean)
        return; 
      if (paramInt1 == paramInt3 || paramInt1 == paramInt2) {
        if (paramInt3 == paramInt1) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        } 
        paramList.add(a(paramTextView, paramBoolean));
        if (paramInt3 == paramInt1)
          paramList.add(a(paramTextView)); 
      } 
    } 
  }
  
  private boolean a(TextView paramTextView, CharSequence paramCharSequence) {
    return (v.I((View)this.b) && this.b.isEnabled() && (this.j != this.i || paramTextView == null || !TextUtils.equals(paramTextView.getText(), paramCharSequence)));
  }
  
  private TextView d(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? null : this.r) : this.m;
  }
  
  private boolean e(int paramInt) {
    return (paramInt == 1 && this.m != null && !TextUtils.isEmpty(this.k));
  }
  
  private boolean m() {
    return (this.c != null && this.b.getEditText() != null);
  }
  
  void a() {
    if (m())
      v.a((View)this.c, v.u((View)this.b.getEditText()), 0, v.t((View)this.b.getEditText()), 0); 
  }
  
  void a(ColorStateList paramColorStateList) {
    this.o = paramColorStateList;
    TextView textView = this.m;
    if (textView != null && paramColorStateList != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  void a(Typeface paramTypeface) {
    if (paramTypeface != this.u) {
      this.u = paramTypeface;
      a(this.m, paramTypeface);
      a(this.r, paramTypeface);
    } 
  }
  
  void a(TextView paramTextView, int paramInt) {
    if (this.c == null && this.e == null) {
      this.c = new LinearLayout(this.a);
      this.c.setOrientation(0);
      this.b.addView((View)this.c, -1, -2);
      this.e = new FrameLayout(this.a);
      this.c.addView((View)this.e, -1, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2));
      Space space = new Space(this.a);
      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0, 1.0F);
      this.c.addView((View)space, (ViewGroup.LayoutParams)layoutParams);
      if (this.b.getEditText() != null)
        a(); 
    } 
    if (a(paramInt)) {
      this.e.setVisibility(0);
      this.e.addView((View)paramTextView);
      this.f++;
    } else {
      this.c.addView((View)paramTextView, paramInt);
    } 
    this.c.setVisibility(0);
    this.d++;
  }
  
  void a(CharSequence paramCharSequence) {
    b();
    this.k = paramCharSequence;
    this.m.setText(paramCharSequence);
    if (this.i != 1)
      this.j = 1; 
    a(this.i, this.j, a(this.m, paramCharSequence));
  }
  
  void a(boolean paramBoolean) {
    if (this.l == paramBoolean)
      return; 
    b();
    if (paramBoolean) {
      this.m = (TextView)new z(this.a);
      this.m.setId(e.f.a.f.f.textinput_error);
      Typeface typeface = this.u;
      if (typeface != null)
        this.m.setTypeface(typeface); 
      b(this.n);
      a(this.o);
      this.m.setVisibility(4);
      v.g((View)this.m, 1);
      a(this.m, 0);
    } else {
      i();
      b(this.m, 0);
      this.m = null;
      this.b.e();
      this.b.f();
    } 
    this.l = paramBoolean;
  }
  
  boolean a(int paramInt) {
    boolean bool = true;
    if (paramInt != 0) {
      if (paramInt == 1)
        return true; 
      bool = false;
    } 
    return bool;
  }
  
  void b() {
    Animator animator = this.g;
    if (animator != null)
      animator.cancel(); 
  }
  
  void b(int paramInt) {
    this.n = paramInt;
    TextView textView = this.m;
    if (textView != null)
      this.b.a(textView, paramInt); 
  }
  
  void b(ColorStateList paramColorStateList) {
    this.t = paramColorStateList;
    TextView textView = this.r;
    if (textView != null && paramColorStateList != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  void b(TextView paramTextView, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/widget/LinearLayout;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: iload_2
    //   10: invokevirtual a : (I)Z
    //   13: ifeq -> 55
    //   16: aload_0
    //   17: getfield e : Landroid/widget/FrameLayout;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnull -> 55
    //   25: aload_0
    //   26: aload_0
    //   27: getfield f : I
    //   30: iconst_1
    //   31: isub
    //   32: putfield f : I
    //   35: aload_0
    //   36: aload_3
    //   37: aload_0
    //   38: getfield f : I
    //   41: invokespecial a : (Landroid/view/ViewGroup;I)V
    //   44: aload_0
    //   45: getfield e : Landroid/widget/FrameLayout;
    //   48: aload_1
    //   49: invokevirtual removeView : (Landroid/view/View;)V
    //   52: goto -> 63
    //   55: aload_0
    //   56: getfield c : Landroid/widget/LinearLayout;
    //   59: aload_1
    //   60: invokevirtual removeView : (Landroid/view/View;)V
    //   63: aload_0
    //   64: aload_0
    //   65: getfield d : I
    //   68: iconst_1
    //   69: isub
    //   70: putfield d : I
    //   73: aload_0
    //   74: aload_0
    //   75: getfield c : Landroid/widget/LinearLayout;
    //   78: aload_0
    //   79: getfield d : I
    //   82: invokespecial a : (Landroid/view/ViewGroup;I)V
    //   85: return
  }
  
  void b(CharSequence paramCharSequence) {
    b();
    this.p = paramCharSequence;
    this.r.setText(paramCharSequence);
    if (this.i != 2)
      this.j = 2; 
    a(this.i, this.j, a(this.r, paramCharSequence));
  }
  
  void b(boolean paramBoolean) {
    if (this.q == paramBoolean)
      return; 
    b();
    if (paramBoolean) {
      this.r = (TextView)new z(this.a);
      this.r.setId(e.f.a.f.f.textinput_helper_text);
      Typeface typeface = this.u;
      if (typeface != null)
        this.r.setTypeface(typeface); 
      this.r.setVisibility(4);
      v.g((View)this.r, 1);
      c(this.s);
      b(this.t);
      a(this.r, 1);
    } else {
      j();
      b(this.r, 1);
      this.r = null;
      this.b.e();
      this.b.f();
    } 
    this.q = paramBoolean;
  }
  
  void c(int paramInt) {
    this.s = paramInt;
    TextView textView = this.r;
    if (textView != null)
      i.d(textView, paramInt); 
  }
  
  boolean c() {
    return e(this.j);
  }
  
  CharSequence d() {
    return this.k;
  }
  
  int e() {
    TextView textView = this.m;
    return (textView != null) ? textView.getCurrentTextColor() : -1;
  }
  
  ColorStateList f() {
    TextView textView = this.m;
    return (textView != null) ? textView.getTextColors() : null;
  }
  
  CharSequence g() {
    return this.p;
  }
  
  int h() {
    TextView textView = this.r;
    return (textView != null) ? textView.getCurrentTextColor() : -1;
  }
  
  void i() {
    this.k = null;
    b();
    if (this.i == 1) {
      boolean bool;
      if (this.q && !TextUtils.isEmpty(this.p)) {
        bool = true;
      } else {
        bool = false;
      } 
      this.j = bool;
    } 
    a(this.i, this.j, a(this.m, (CharSequence)null));
  }
  
  void j() {
    b();
    if (this.i == 2)
      this.j = 0; 
    a(this.i, this.j, a(this.r, (CharSequence)null));
  }
  
  boolean k() {
    return this.l;
  }
  
  boolean l() {
    return this.q;
  }
  
  class a extends AnimatorListenerAdapter {
    a(f this$0, int param1Int1, TextView param1TextView1, int param1Int2, TextView param1TextView2) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      f.a(this.e, this.a);
      f.a(this.e, (Animator)null);
      TextView textView = this.b;
      if (textView != null) {
        textView.setVisibility(4);
        if (this.c == 1 && f.a(this.e) != null)
          f.a(this.e).setText(null); 
        textView = this.d;
        if (textView != null) {
          textView.setTranslationY(0.0F);
          this.d.setAlpha(1.0F);
        } 
      } 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      TextView textView = this.d;
      if (textView != null)
        textView.setVisibility(0); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */