package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import e.f.a.f.o.a;
import e.f.a.f.w.a;

@Keep
public class MaterialComponentsViewInflater extends i {
  private static int floatingToolbarItemBackgroundResId = -1;
  
  protected f createButton(Context paramContext, AttributeSet paramAttributeSet) {
    return (f)(shouldInflateAppCompatButton(paramContext, paramAttributeSet) ? new f(paramContext, paramAttributeSet) : new MaterialButton(paramContext, paramAttributeSet));
  }
  
  protected g createCheckBox(Context paramContext, AttributeSet paramAttributeSet) {
    return (g)new a(paramContext, paramAttributeSet);
  }
  
  protected s createRadioButton(Context paramContext, AttributeSet paramAttributeSet) {
    return (s)new a(paramContext, paramAttributeSet);
  }
  
  protected z createTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return (z)new MaterialTextView(paramContext, paramAttributeSet);
  }
  
  protected boolean shouldInflateAppCompatButton(Context paramContext, AttributeSet paramAttributeSet) {
    int j = Build.VERSION.SDK_INT;
    if (j != 23 && j != 24 && j != 25)
      return false; 
    if (floatingToolbarItemBackgroundResId == -1)
      floatingToolbarItemBackgroundResId = paramContext.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android"); 
    j = floatingToolbarItemBackgroundResId;
    if (j != 0 && j != -1)
      for (j = 0; j < paramAttributeSet.getAttributeCount(); j++) {
        if (paramAttributeSet.getAttributeNameResource(j) == 16842964) {
          int k = paramAttributeSet.getAttributeListValue(j, null, 0);
          if (floatingToolbarItemBackgroundResId == k)
            return true; 
        } 
      }  
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/theme/MaterialComponentsViewInflater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */