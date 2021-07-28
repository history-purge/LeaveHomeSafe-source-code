package e.f.a.f.x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.x0;
import b.a.k.a.a;

public class c {
  public static int a(Context paramContext, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    TypedValue typedValue = new TypedValue();
    if (!paramTypedArray.getValue(paramInt1, typedValue) || typedValue.type != 2)
      return paramTypedArray.getDimensionPixelSize(paramInt1, paramInt2); 
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
    paramInt1 = typedArray.getDimensionPixelSize(0, paramInt2);
    typedArray.recycle();
    return paramInt1;
  }
  
  static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    return paramTypedArray.hasValue(paramInt1) ? paramInt1 : paramInt2;
  }
  
  public static ColorStateList a(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.b(paramContext, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    if (Build.VERSION.SDK_INT <= 15) {
      int i = paramTypedArray.getColor(paramInt, -1);
      if (i != -1)
        return ColorStateList.valueOf(i); 
    } 
    return paramTypedArray.getColorStateList(paramInt);
  }
  
  public static ColorStateList a(Context paramContext, x0 paramx0, int paramInt) {
    if (paramx0.g(paramInt)) {
      int i = paramx0.g(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.b(paramContext, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    if (Build.VERSION.SDK_INT <= 15) {
      int i = paramx0.a(paramInt, -1);
      if (i != -1)
        return ColorStateList.valueOf(i); 
    } 
    return paramx0.a(paramInt);
  }
  
  public static Drawable b(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        Drawable drawable = a.c(paramContext, i);
        if (drawable != null)
          return drawable; 
      } 
    } 
    return paramTypedArray.getDrawable(paramInt);
  }
  
  public static d c(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      paramInt = paramTypedArray.getResourceId(paramInt, 0);
      if (paramInt != 0)
        return new d(paramContext, paramInt); 
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/x/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */