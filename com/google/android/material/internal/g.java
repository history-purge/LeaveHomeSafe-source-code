package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.x0;
import e.f.a.f.b;
import e.f.a.f.k;

public final class g {
  private static final int[] a = new int[] { b.colorPrimary };
  
  private static final int[] b = new int[] { b.colorPrimaryVariant };
  
  private static final int[] c = new int[] { 16842752, b.theme };
  
  private static final int[] d = new int[] { b.materialThemeOverlay };
  
  private static int a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c);
    int i = typedArray.getResourceId(0, 0);
    int j = typedArray.getResourceId(1, 0);
    typedArray.recycle();
    return (i != 0) ? i : j;
  }
  
  public static void a(Context paramContext) {
    a(paramContext, a, "Theme.AppCompat");
  }
  
  private static void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.ThemeEnforcement, paramInt1, paramInt2);
    boolean bool = typedArray.getBoolean(k.ThemeEnforcement_enforceMaterialTheme, false);
    typedArray.recycle();
    if (bool) {
      TypedValue typedValue = new TypedValue();
      if (!paramContext.getTheme().resolveAttribute(b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0))
        b(paramContext); 
    } 
    a(paramContext);
  }
  
  private static void a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    boolean bool;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.ThemeEnforcement, paramInt1, paramInt2);
    if (!typedArray.getBoolean(k.ThemeEnforcement_enforceTextAppearance, false)) {
      typedArray.recycle();
      return;
    } 
    if (paramVarArgs1 == null || paramVarArgs1.length == 0) {
      if (typedArray.getResourceId(k.ThemeEnforcement_android_textAppearance, -1) != -1) {
        bool = true;
      } else {
        bool = false;
      } 
    } else {
      bool = b(paramContext, paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2, paramVarArgs1);
    } 
    typedArray.recycle();
    if (bool)
      return; 
    throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
  }
  
  private static void a(Context paramContext, int[] paramArrayOfint, String paramString) {
    if (a(paramContext, paramArrayOfint))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("The style on this component requires your app theme to be ");
    stringBuilder.append(paramString);
    stringBuilder.append(" (or a descendant).");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static boolean a(Context paramContext, int[] paramArrayOfint) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramArrayOfint);
    for (int i = 0; i < paramArrayOfint.length; i++) {
      if (!typedArray.hasValue(i)) {
        typedArray.recycle();
        return false;
      } 
    } 
    typedArray.recycle();
    return true;
  }
  
  public static Context b(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: iload_3
    //   4: invokestatic c : (Landroid/content/Context;Landroid/util/AttributeSet;II)I
    //   7: istore_2
    //   8: aload_0
    //   9: astore #4
    //   11: iload_2
    //   12: ifeq -> 69
    //   15: aload_0
    //   16: instanceof b/a/o/d
    //   19: ifeq -> 36
    //   22: aload_0
    //   23: astore #4
    //   25: aload_0
    //   26: checkcast b/a/o/d
    //   29: invokevirtual a : ()I
    //   32: iload_2
    //   33: if_icmpeq -> 69
    //   36: new b/a/o/d
    //   39: dup
    //   40: aload_0
    //   41: iload_2
    //   42: invokespecial <init> : (Landroid/content/Context;I)V
    //   45: astore #4
    //   47: aload #4
    //   49: aload_1
    //   50: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;)I
    //   53: istore_2
    //   54: iload_2
    //   55: ifeq -> 69
    //   58: new b/a/o/d
    //   61: dup
    //   62: aload #4
    //   64: iload_2
    //   65: invokespecial <init> : (Landroid/content/Context;I)V
    //   68: areturn
    //   69: aload #4
    //   71: areturn
  }
  
  public static void b(Context paramContext) {
    a(paramContext, b, "Theme.MaterialComponents");
  }
  
  private static boolean b(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2);
    paramInt2 = paramVarArgs1.length;
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      if (typedArray.getResourceId(paramVarArgs1[paramInt1], -1) == -1) {
        typedArray.recycle();
        return false;
      } 
    } 
    typedArray.recycle();
    return true;
  }
  
  private static int c(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, d, paramInt1, paramInt2);
    paramInt1 = typedArray.getResourceId(0, 0);
    typedArray.recycle();
    return paramInt1;
  }
  
  public static TypedArray c(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2, paramVarArgs1);
    return paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2);
  }
  
  public static x0 d(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2, paramVarArgs1);
    return x0.a(paramContext, paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */