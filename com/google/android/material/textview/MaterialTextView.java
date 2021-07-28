package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import e.f.a.f.b;
import e.f.a.f.k;
import e.f.a.f.x.b;
import e.f.a.f.x.c;

public class MaterialTextView extends z {
  public MaterialTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1);
    if (a(paramContext)) {
      Resources.Theme theme = paramContext.getTheme();
      if (!a(paramContext, theme, paramAttributeSet, paramInt1, paramInt2)) {
        paramInt1 = a(theme, paramAttributeSet, paramInt1, paramInt2);
        if (paramInt1 != -1)
          a(theme, paramInt1); 
      } 
    } 
  }
  
  private static int a(Context paramContext, TypedArray paramTypedArray, int... paramVarArgs) {
    int i = 0;
    int j = -1;
    while (i < paramVarArgs.length && j < 0) {
      j = c.a(paramContext, paramTypedArray, paramVarArgs[i], -1);
      i++;
    } 
    return j;
  }
  
  private static int a(Resources.Theme paramTheme, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, k.MaterialTextView, paramInt1, paramInt2);
    paramInt1 = typedArray.getResourceId(k.MaterialTextView_android_textAppearance, -1);
    typedArray.recycle();
    return paramInt1;
  }
  
  private void a(Resources.Theme paramTheme, int paramInt) {
    TypedArray typedArray = paramTheme.obtainStyledAttributes(paramInt, k.MaterialTextAppearance);
    paramInt = a(getContext(), typedArray, new int[] { k.MaterialTextAppearance_android_lineHeight, k.MaterialTextAppearance_lineHeight });
    typedArray.recycle();
    if (paramInt >= 0)
      setLineHeight(paramInt); 
  }
  
  private static boolean a(Context paramContext) {
    return b.a(paramContext, b.textAppearanceLineHeightEnabled, true);
  }
  
  private static boolean a(Context paramContext, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, k.MaterialTextView, paramInt1, paramInt2);
    paramInt1 = k.MaterialTextView_android_lineHeight;
    boolean bool = false;
    paramInt1 = a(paramContext, typedArray, new int[] { paramInt1, k.MaterialTextView_lineHeight });
    typedArray.recycle();
    if (paramInt1 != -1)
      bool = true; 
    return bool;
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (a(paramContext))
      a(paramContext.getTheme(), paramInt); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textview/MaterialTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */