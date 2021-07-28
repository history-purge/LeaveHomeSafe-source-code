package e.f.a.f.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import com.google.android.material.internal.g;
import e.f.a.f.b;
import e.f.a.f.j;
import e.f.a.f.k;
import e.f.a.f.x.c;

public class a extends g {
  private static final int h = j.Widget_MaterialComponents_CompoundButton_CheckBox;
  
  private static final int[][] i = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
  
  private ColorStateList f;
  
  private boolean g;
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.checkboxStyle);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(g.b(paramContext, paramAttributeSet, paramInt, h), paramAttributeSet, paramInt);
    paramContext = getContext();
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.MaterialCheckBox, paramInt, h, new int[0]);
    if (typedArray.hasValue(k.MaterialCheckBox_buttonTint))
      c.a((CompoundButton)this, c.a(paramContext, typedArray, k.MaterialCheckBox_buttonTint)); 
    this.g = typedArray.getBoolean(k.MaterialCheckBox_useMaterialThemeColors, false);
    typedArray.recycle();
  }
  
  private ColorStateList getMaterialThemeColorsTintList() {
    if (this.f == null) {
      int[] arrayOfInt = new int[i.length];
      int i = e.f.a.f.q.a.a((View)this, b.colorControlActivated);
      int j = e.f.a.f.q.a.a((View)this, b.colorSurface);
      int k = e.f.a.f.q.a.a((View)this, b.colorOnSurface);
      arrayOfInt[0] = e.f.a.f.q.a.a(j, i, 1.0F);
      arrayOfInt[1] = e.f.a.f.q.a.a(j, k, 0.54F);
      arrayOfInt[2] = e.f.a.f.q.a.a(j, k, 0.38F);
      arrayOfInt[3] = e.f.a.f.q.a.a(j, k, 0.38F);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */