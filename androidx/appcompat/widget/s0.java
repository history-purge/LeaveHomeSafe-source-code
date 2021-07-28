package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b.a.j;
import b.g.f.a;

public class s0 {
  private static final ThreadLocal<TypedValue> a = new ThreadLocal<TypedValue>();
  
  static final int[] b = new int[] { -16842910 };
  
  static final int[] c = new int[] { 16842908 };
  
  static final int[] d = new int[] { 16842919 };
  
  static final int[] e = new int[] { 16842912 };
  
  static final int[] f = new int[0];
  
  private static final int[] g = new int[1];
  
  public static int a(Context paramContext, int paramInt) {
    ColorStateList colorStateList = c(paramContext, paramInt);
    if (colorStateList != null && colorStateList.isStateful())
      return colorStateList.getColorForState(b, colorStateList.getDefaultColor()); 
    TypedValue typedValue = a();
    paramContext.getTheme().resolveAttribute(16842803, typedValue, true);
    return a(paramContext, paramInt, typedValue.getFloat());
  }
  
  static int a(Context paramContext, int paramInt, float paramFloat) {
    paramInt = b(paramContext, paramInt);
    return a.c(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  private static TypedValue a() {
    TypedValue typedValue2 = a.get();
    TypedValue typedValue1 = typedValue2;
    if (typedValue2 == null) {
      typedValue1 = new TypedValue();
      a.set(typedValue1);
    } 
    return typedValue1;
  }
  
  public static void a(View paramView, Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(j.AppCompatTheme);
    try {
      if (!typedArray.hasValue(j.AppCompatTheme_windowActionBar)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(paramView.getClass());
        stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
        Log.e("ThemeUtils", stringBuilder.toString());
      } 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int b(Context paramContext, int paramInt) {
    null = g;
    null[0] = paramInt;
    x0 x0 = x0.a(paramContext, (AttributeSet)null, null);
    try {
      paramInt = x0.a(0, 0);
      return paramInt;
    } finally {
      x0.b();
    } 
  }
  
  public static ColorStateList c(Context paramContext, int paramInt) {
    null = g;
    null[0] = paramInt;
    x0 x0 = x0.a(paramContext, (AttributeSet)null, null);
    try {
      return x0.a(0);
    } finally {
      x0.b();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */