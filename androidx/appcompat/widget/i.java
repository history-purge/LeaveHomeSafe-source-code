package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

class i {
  private final CompoundButton a;
  
  private ColorStateList b = null;
  
  private PorterDuff.Mode c = null;
  
  private boolean d = false;
  
  private boolean e = false;
  
  private boolean f;
  
  i(CompoundButton paramCompoundButton) {
    this.a = paramCompoundButton;
  }
  
  int a(int paramInt) {
    int j = paramInt;
    if (Build.VERSION.SDK_INT < 17) {
      Drawable drawable = c.a(this.a);
      j = paramInt;
      if (drawable != null)
        j = paramInt + drawable.getIntrinsicWidth(); 
    } 
    return j;
  }
  
  void a() {
    Drawable drawable = c.a(this.a);
    if (drawable != null && (this.d || this.e)) {
      drawable = a.i(drawable).mutate();
      if (this.d)
        a.a(drawable, this.b); 
      if (this.e)
        a.a(drawable, this.c); 
      if (drawable.isStateful())
        drawable.setState(this.a.getDrawableState()); 
      this.a.setButtonDrawable(drawable);
    } 
  }
  
  void a(ColorStateList paramColorStateList) {
    this.b = paramColorStateList;
    this.d = true;
    a();
  }
  
  void a(PorterDuff.Mode paramMode) {
    this.c = paramMode;
    this.e = true;
    a();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/widget/CompoundButton;
    //   4: invokevirtual getContext : ()Landroid/content/Context;
    //   7: aload_1
    //   8: getstatic b/a/j.CompoundButton : [I
    //   11: iload_2
    //   12: iconst_0
    //   13: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/x0;
    //   16: astore_3
    //   17: aload_0
    //   18: getfield a : Landroid/widget/CompoundButton;
    //   21: astore #4
    //   23: aload #4
    //   25: aload #4
    //   27: invokevirtual getContext : ()Landroid/content/Context;
    //   30: getstatic b/a/j.CompoundButton : [I
    //   33: aload_1
    //   34: aload_3
    //   35: invokevirtual a : ()Landroid/content/res/TypedArray;
    //   38: iload_2
    //   39: iconst_0
    //   40: invokestatic a : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   43: aload_3
    //   44: getstatic b/a/j.CompoundButton_buttonCompat : I
    //   47: invokevirtual g : (I)Z
    //   50: ifeq -> 89
    //   53: aload_3
    //   54: getstatic b/a/j.CompoundButton_buttonCompat : I
    //   57: iconst_0
    //   58: invokevirtual g : (II)I
    //   61: istore_2
    //   62: iload_2
    //   63: ifeq -> 89
    //   66: aload_0
    //   67: getfield a : Landroid/widget/CompoundButton;
    //   70: aload_0
    //   71: getfield a : Landroid/widget/CompoundButton;
    //   74: invokevirtual getContext : ()Landroid/content/Context;
    //   77: iload_2
    //   78: invokestatic c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   81: invokevirtual setButtonDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   84: iconst_1
    //   85: istore_2
    //   86: goto -> 91
    //   89: iconst_0
    //   90: istore_2
    //   91: iload_2
    //   92: ifne -> 136
    //   95: aload_3
    //   96: getstatic b/a/j.CompoundButton_android_button : I
    //   99: invokevirtual g : (I)Z
    //   102: ifeq -> 136
    //   105: aload_3
    //   106: getstatic b/a/j.CompoundButton_android_button : I
    //   109: iconst_0
    //   110: invokevirtual g : (II)I
    //   113: istore_2
    //   114: iload_2
    //   115: ifeq -> 136
    //   118: aload_0
    //   119: getfield a : Landroid/widget/CompoundButton;
    //   122: aload_0
    //   123: getfield a : Landroid/widget/CompoundButton;
    //   126: invokevirtual getContext : ()Landroid/content/Context;
    //   129: iload_2
    //   130: invokestatic c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   133: invokevirtual setButtonDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   136: aload_3
    //   137: getstatic b/a/j.CompoundButton_buttonTint : I
    //   140: invokevirtual g : (I)Z
    //   143: ifeq -> 160
    //   146: aload_0
    //   147: getfield a : Landroid/widget/CompoundButton;
    //   150: aload_3
    //   151: getstatic b/a/j.CompoundButton_buttonTint : I
    //   154: invokevirtual a : (I)Landroid/content/res/ColorStateList;
    //   157: invokestatic a : (Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
    //   160: aload_3
    //   161: getstatic b/a/j.CompoundButton_buttonTintMode : I
    //   164: invokevirtual g : (I)Z
    //   167: ifeq -> 189
    //   170: aload_0
    //   171: getfield a : Landroid/widget/CompoundButton;
    //   174: aload_3
    //   175: getstatic b/a/j.CompoundButton_buttonTintMode : I
    //   178: iconst_m1
    //   179: invokevirtual d : (II)I
    //   182: aconst_null
    //   183: invokestatic a : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   186: invokestatic a : (Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    //   189: aload_3
    //   190: invokevirtual b : ()V
    //   193: return
    //   194: astore_1
    //   195: aload_3
    //   196: invokevirtual b : ()V
    //   199: aload_1
    //   200: athrow
    //   201: astore_1
    //   202: goto -> 89
    // Exception table:
    //   from	to	target	type
    //   43	62	194	finally
    //   66	84	201	android/content/res/Resources$NotFoundException
    //   66	84	194	finally
    //   95	114	194	finally
    //   118	136	194	finally
    //   136	160	194	finally
    //   160	189	194	finally
  }
  
  ColorStateList b() {
    return this.b;
  }
  
  PorterDuff.Mode c() {
    return this.c;
  }
  
  void d() {
    if (this.f) {
      this.f = false;
      return;
    } 
    this.f = true;
    a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */