package e.f.a.f.w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import com.google.android.material.internal.g;
import e.f.a.f.b;
import e.f.a.f.j;
import e.f.a.f.k;

public class a extends s {
  private static final int h = j.Widget_MaterialComponents_CompoundButton_RadioButton;
  
  private static final int[][] i = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
  
  private ColorStateList f;
  
  private boolean g;
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.radioButtonStyle);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(g.b(paramContext, paramAttributeSet, paramInt, h), paramAttributeSet, paramInt);
    TypedArray typedArray = g.c(getContext(), paramAttributeSet, k.MaterialRadioButton, paramInt, h, new int[0]);
    this.g = typedArray.getBoolean(k.MaterialRadioButton_useMaterialThemeColors, false);
    typedArray.recycle();
  }
  
  private ColorStateList getMaterialThemeColorsTintList() {
    if (this.f == null) {
      int i = e.f.a.f.q.a.a((View)this, b.colorControlActivated);
      int j = e.f.a.f.q.a.a((View)this, b.colorOnSurface);
      int k = e.f.a.f.q.a.a((View)this, b.colorSurface);
      int[] arrayOfInt = new int[i.length];
      arrayOfInt[0] = e.f.a.f.q.a.a(k, i, 1.0F);
      arrayOfInt[1] = e.f.a.f.q.a.a(k, j, 0.54F);
      arrayOfInt[2] = e.f.a.f.q.a.a(k, j, 0.38F);
      arrayOfInt[3] = e.f.a.f.q.a.a(k, j, 0.38F);
      this.f = new ColorStateList(i, arrayOfInt);
    } 
    return this.f;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.g && c.b((CompoundButton)this) == null)
      setUseMaterialThemeColors(true); 
  }
  
  public void setUseMaterialThemeColors(boolean paramBoolean) {
    ColorStateList colorStateList;
    this.g = paramBoolean;
    if (paramBoolean) {
      colorStateList = getMaterialThemeColorsTintList();
    } else {
      colorStateList = null;
    } 
    c.a((CompoundButton)this, colorStateList);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/w/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */