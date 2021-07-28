package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import e.f.a.f.y.b;
import e.f.a.f.z.b;
import java.util.ArrayList;

class c extends b {
  c(FloatingActionButton paramFloatingActionButton, b paramb) {
    super(paramFloatingActionButton, paramb);
  }
  
  private Animator a(float paramFloat1, float paramFloat2) {
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.play((Animator)ObjectAnimator.ofFloat(this.y, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
    animatorSet.setInterpolator(b.F);
    return (Animator)animatorSet;
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (Build.VERSION.SDK_INT == 21) {
      this.y.refreshDrawableState();
    } else {
      StateListAnimator stateListAnimator = new StateListAnimator();
      stateListAnimator.addState(b.G, a(paramFloat1, paramFloat3));
      stateListAnimator.addState(b.H, a(paramFloat1, paramFloat2));
      stateListAnimator.addState(b.I, a(paramFloat1, paramFloat2));
      stateListAnimator.addState(b.J, a(paramFloat1, paramFloat2));
      AnimatorSet animatorSet = new AnimatorSet();
      ArrayList<ObjectAnimator> arrayList = new ArrayList();
      arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", new float[] { paramFloat1 }).setDuration(0L));
      int i = Build.VERSION.SDK_INT;
      if (i >= 22 && i <= 24) {
        FloatingActionButton floatingActionButton = this.y;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[] { floatingActionButton.getTranslationZ() }).setDuration(100L));
      } 
      arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(100L));
      animatorSet.playSequentially(arrayList.<Animator>toArray(new Animator[0]));
      animatorSet.setInterpolator(b.F);
      stateListAnimator.addState(b.K, (Animator)animatorSet);
      stateListAnimator.addState(b.L, a(0.0F, 0.0F));
      this.y.setStateListAnimator(stateListAnimator);
    } 
    if (s())
      w(); 
  }
  
  void a(Rect paramRect) {
    boolean bool;
    if (this.z.a()) {
      super.a(paramRect);
      return;
    } 
    if (!t()) {
      bool = (this.k - this.y.getSizeDimension()) / 2;
    } else {
      bool = false;
    } 
    paramRect.set(bool, bool, bool, bool);
  }
  
  void a(int[] paramArrayOfint) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #21
    //   5: if_icmpne -> 107
    //   8: aload_0
    //   9: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   12: invokevirtual isEnabled : ()Z
    //   15: istore_3
    //   16: fconst_0
    //   17: fstore_2
    //   18: iload_3
    //   19: ifeq -> 89
    //   22: aload_0
    //   23: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   26: aload_0
    //   27: getfield h : F
    //   30: invokevirtual setElevation : (F)V
    //   33: aload_0
    //   34: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   37: invokevirtual isPressed : ()Z
    //   40: ifeq -> 56
    //   43: aload_0
    //   44: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   47: astore_1
    //   48: aload_0
    //   49: getfield j : F
    //   52: fstore_2
    //   53: goto -> 102
    //   56: aload_0
    //   57: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   60: invokevirtual isFocused : ()Z
    //   63: ifne -> 76
    //   66: aload_0
    //   67: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   70: invokevirtual isHovered : ()Z
    //   73: ifeq -> 97
    //   76: aload_0
    //   77: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   80: astore_1
    //   81: aload_0
    //   82: getfield i : F
    //   85: fstore_2
    //   86: goto -> 102
    //   89: aload_0
    //   90: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   93: fconst_0
    //   94: invokevirtual setElevation : (F)V
    //   97: aload_0
    //   98: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   101: astore_1
    //   102: aload_1
    //   103: fload_2
    //   104: invokevirtual setTranslationZ : (F)V
    //   107: return
  }
  
  public float b() {
    return this.y.getElevation();
  }
  
  void b(ColorStateList paramColorStateList) {
    Drawable drawable = this.c;
    if (drawable instanceof RippleDrawable) {
      ((RippleDrawable)drawable).setColor(b.a(paramColorStateList));
      return;
    } 
    super.b(paramColorStateList);
  }
  
  void k() {}
  
  void m() {
    w();
  }
  
  boolean r() {
    return false;
  }
  
  boolean s() {
    return (this.z.a() || !t());
  }
  
  void u() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/floatingactionbutton/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */