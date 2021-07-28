package e.f.a.f.x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import b.g.e.d.f;
import e.f.a.f.k;

public class d {
  public final float a;
  
  public final ColorStateList b;
  
  public final int c;
  
  public final int d;
  
  public final String e;
  
  public final ColorStateList f;
  
  public final float g;
  
  public final float h;
  
  public final float i;
  
  private final int j;
  
  private boolean k = false;
  
  private Typeface l;
  
  public d(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, k.TextAppearance);
    this.a = typedArray.getDimension(k.TextAppearance_android_textSize, 0.0F);
    this.b = c.a(paramContext, typedArray, k.TextAppearance_android_textColor);
    c.a(paramContext, typedArray, k.TextAppearance_android_textColorHint);
    c.a(paramContext, typedArray, k.TextAppearance_android_textColorLink);
    this.c = typedArray.getInt(k.TextAppearance_android_textStyle, 0);
    this.d = typedArray.getInt(k.TextAppearance_android_typeface, 1);
    paramInt = c.a(typedArray, k.TextAppearance_fontFamily, k.TextAppearance_android_fontFamily);
    this.j = typedArray.getResourceId(paramInt, 0);
    this.e = typedArray.getString(paramInt);
    typedArray.getBoolean(k.TextAppearance_textAllCaps, false);
    this.f = c.a(paramContext, typedArray, k.TextAppearance_android_shadowColor);
    this.g = typedArray.getFloat(k.TextAppearance_android_shadowDx, 0.0F);
    this.h = typedArray.getFloat(k.TextAppearance_android_shadowDy, 0.0F);
    this.i = typedArray.getFloat(k.TextAppearance_android_shadowRadius, 0.0F);
    typedArray.recycle();
  }
  
  private void b() {
    if (this.l == null) {
      String str = this.e;
      if (str != null)
        this.l = Typeface.create(str, this.c); 
    } 
    if (this.l == null) {
      Typeface typeface;
      int i = this.d;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            typeface = Typeface.DEFAULT;
          } else {
            typeface = Typeface.MONOSPACE;
          } 
        } else {
          typeface = Typeface.SERIF;
        } 
      } else {
        typeface = Typeface.SANS_SERIF;
      } 
      this.l = typeface;
      this.l = Typeface.create(this.l, this.c);
    } 
  }
  
  public Typeface a() {
    b();
    return this.l;
  }
  
  public Typeface a(Context paramContext) {
    if (this.k)
      return this.l; 
    if (!paramContext.isRestricted())
      try {
        this.l = f.a(paramContext, this.j);
        if (this.l != null)
          this.l = Typeface.create(this.l, this.c); 
      } catch (UnsupportedOperationException|android.content.res.Resources.NotFoundException unsupportedOperationException) {
      
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error loading font ");
        stringBuilder.append(this.e);
        Log.d("TextAppearance", stringBuilder.toString(), exception);
      }  
    b();
    this.k = true;
    return this.l;
  }
  
  public void a(Context paramContext, TextPaint paramTextPaint, f paramf) {
    a(paramTextPaint, a());
    a(paramContext, new b(this, paramTextPaint, paramf));
  }
  
  public void a(Context paramContext, f paramf) {
    if (e.a()) {
      a(paramContext);
    } else {
      b();
    } 
    if (this.j == 0)
      this.k = true; 
    if (this.k) {
      paramf.a(this.l, true);
      return;
    } 
    try {
      f.a(paramContext, this.j, new a(this, paramf), null);
      return;
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      this.k = true;
      paramf.a(1);
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error loading font ");
      stringBuilder.append(this.e);
      Log.d("TextAppearance", stringBuilder.toString(), exception);
      this.k = true;
      paramf.a(-3);
      return;
    } 
  }
  
  public void a(TextPaint paramTextPaint, Typeface paramTypeface) {
    float f;
    boolean bool;
    paramTextPaint.setTypeface(paramTypeface);
    int i = this.c;
    i = (paramTypeface.getStyle() ^ 0xFFFFFFFF) & i;
    if ((i & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramTextPaint.setFakeBoldText(bool);
    if ((i & 0x2) != 0) {
      f = -0.25F;
    } else {
      f = 0.0F;
    } 
    paramTextPaint.setTextSkewX(f);
    paramTextPaint.setTextSize(this.a);
  }
  
  public void b(Context paramContext, TextPaint paramTextPaint, f paramf) {
    int i;
    c(paramContext, paramTextPaint, paramf);
    ColorStateList colorStateList = this.b;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramTextPaint.drawableState, colorStateList.getDefaultColor());
    } else {
      i = -16777216;
    } 
    paramTextPaint.setColor(i);
    float f1 = this.i;
    float f2 = this.g;
    float f3 = this.h;
    colorStateList = this.f;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramTextPaint.drawableState, colorStateList.getDefaultColor());
    } else {
      i = 0;
    } 
    paramTextPaint.setShadowLayer(f1, f2, f3, i);
  }
  
  public void c(Context paramContext, TextPaint paramTextPaint, f paramf) {
    if (e.a()) {
      a(paramTextPaint, a(paramContext));
      return;
    } 
    a(paramContext, paramTextPaint, paramf);
  }
  
  class a extends f.a {
    a(d this$0, f param1f) {}
    
    public void a(int param1Int) {
      d.a(this.b, true);
      this.a.a(param1Int);
    }
    
    public void a(Typeface param1Typeface) {
      d d1 = this.b;
      d.a(d1, Typeface.create(param1Typeface, d1.c));
      d.a(this.b, true);
      this.a.a(d.a(this.b), false);
    }
  }
  
  class b extends f {
    b(d this$0, TextPaint param1TextPaint, f param1f) {}
    
    public void a(int param1Int) {
      this.b.a(param1Int);
    }
    
    public void a(Typeface param1Typeface, boolean param1Boolean) {
      this.c.a(this.a, param1Typeface);
      this.b.a(param1Typeface, param1Boolean);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/x/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */