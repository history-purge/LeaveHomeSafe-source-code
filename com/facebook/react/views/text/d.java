package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;

public final class d {
  public static ColorStateList a(Context paramContext) {
    return a(paramContext, 16842904);
  }
  
  private static ColorStateList a(Context paramContext, int paramInt) {
    TypedArray typedArray;
    null = paramContext.getTheme();
    paramContext = null;
    try {
      TypedArray typedArray1 = null.obtainStyledAttributes(new int[] { paramInt });
      typedArray = typedArray1;
      return typedArray1.getColorStateList(0);
    } finally {
      if (typedArray != null)
        typedArray.recycle(); 
    } 
  }
  
  public static int b(Context paramContext) {
    return a(paramContext, 16842905).getDefaultColor();
  }
  
  public static ColorStateList c(Context paramContext) {
    return a(paramContext, 16842906);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */