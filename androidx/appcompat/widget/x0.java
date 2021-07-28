package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.a.k.a.a;
import b.g.e.d.f;

public class x0 {
  private final Context a;
  
  private final TypedArray b;
  
  private TypedValue c;
  
  private x0(Context paramContext, TypedArray paramTypedArray) {
    this.a = paramContext;
    this.b = paramTypedArray;
  }
  
  public static x0 a(Context paramContext, int paramInt, int[] paramArrayOfint) {
    return new x0(paramContext, paramContext.obtainStyledAttributes(paramInt, paramArrayOfint));
  }
  
  public static x0 a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return new x0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint));
  }
  
  public static x0 a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint, int paramInt1, int paramInt2) {
    return new x0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, paramInt1, paramInt2));
  }
  
  public float a(int paramInt, float paramFloat) {
    return this.b.getDimension(paramInt, paramFloat);
  }
  
  public int a(int paramInt1, int paramInt2) {
    return this.b.getColor(paramInt1, paramInt2);
  }
  
  public ColorStateList a(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.b(this.a, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return this.b.getColorStateList(paramInt);
  }
  
  public TypedArray a() {
    return this.b;
  }
  
  public Typeface a(int paramInt1, int paramInt2, f.a parama) {
    paramInt1 = this.b.getResourceId(paramInt1, 0);
    if (paramInt1 == 0)
      return null; 
    if (this.c == null)
      this.c = new TypedValue(); 
    return f.a(this.a, paramInt1, this.c, paramInt2, parama);
  }
  
  public boolean a(int paramInt, boolean paramBoolean) {
    return this.b.getBoolean(paramInt, paramBoolean);
  }
  
  public float b(int paramInt, float paramFloat) {
    return this.b.getFloat(paramInt, paramFloat);
  }
  
  public int b(int paramInt1, int paramInt2) {
    return this.b.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public Drawable b(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return a.c(this.a, i); 
    } 
    return this.b.getDrawable(paramInt);
  }
  
  public void b() {
    this.b.recycle();
  }
  
  public int c(int paramInt1, int paramInt2) {
    return this.b.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Drawable c(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      paramInt = this.b.getResourceId(paramInt, 0);
      if (paramInt != 0)
        return j.b().a(this.a, paramInt, true); 
    } 
    return null;
  }
  
  public int d(int paramInt1, int paramInt2) {
    return this.b.getInt(paramInt1, paramInt2);
  }
  
  public String d(int paramInt) {
    return this.b.getString(paramInt);
  }
  
  public int e(int paramInt1, int paramInt2) {
    return this.b.getInteger(paramInt1, paramInt2);
  }
  
  public CharSequence e(int paramInt) {
    return this.b.getText(paramInt);
  }
  
  public int f(int paramInt1, int paramInt2) {
    return this.b.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public CharSequence[] f(int paramInt) {
    return this.b.getTextArray(paramInt);
  }
  
  public int g(int paramInt1, int paramInt2) {
    return this.b.getResourceId(paramInt1, paramInt2);
  }
  
  public boolean g(int paramInt) {
    return this.b.hasValue(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */