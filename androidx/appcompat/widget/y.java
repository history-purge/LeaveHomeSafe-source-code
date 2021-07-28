package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import b.a.j;
import b.g.e.d.f;
import b.g.m.v;
import java.lang.ref.WeakReference;
import java.util.Locale;

class y {
  private final TextView a;
  
  private v0 b;
  
  private v0 c;
  
  private v0 d;
  
  private v0 e;
  
  private v0 f;
  
  private v0 g;
  
  private v0 h;
  
  private final a0 i;
  
  private int j = 0;
  
  private int k = -1;
  
  private Typeface l;
  
  private boolean m;
  
  y(TextView paramTextView) {
    this.a = paramTextView;
    this.i = new a0(this.a);
  }
  
  private static v0 a(Context paramContext, j paramj, int paramInt) {
    ColorStateList colorStateList = paramj.b(paramContext, paramInt);
    if (colorStateList != null) {
      v0 v01 = new v0();
      v01.d = true;
      v01.a = colorStateList;
      return v01;
    } 
    return null;
  }
  
  private void a(Context paramContext, x0 paramx0) {
    this.j = paramx0.d(j.TextAppearance_android_textStyle, this.j);
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 28) {
      this.k = paramx0.d(j.TextAppearance_android_textFontWeight, -1);
      if (this.k != -1)
        this.j = this.j & 0x2 | 0x0; 
    } 
    if (paramx0.g(j.TextAppearance_android_fontFamily) || paramx0.g(j.TextAppearance_fontFamily)) {
      this.l = null;
      if (paramx0.g(j.TextAppearance_fontFamily)) {
        i = j.TextAppearance_fontFamily;
      } else {
        i = j.TextAppearance_android_fontFamily;
      } 
      int j = this.k;
      int k = this.j;
      if (!paramContext.isRestricted()) {
        a a = new a(this, j, k, new WeakReference<TextView>(this.a));
        try {
          boolean bool1;
          Typeface typeface = paramx0.a(i, this.j, a);
          if (typeface != null) {
            Typeface typeface1 = typeface;
            if (Build.VERSION.SDK_INT >= 28) {
              typeface1 = typeface;
              if (this.k != -1) {
                typeface1 = Typeface.create(typeface, 0);
                j = this.k;
                if ((this.j & 0x2) != 0) {
                  bool1 = true;
                } else {
                  bool1 = false;
                } 
                typeface1 = Typeface.create(typeface1, j, bool1);
              } 
            } 
            this.l = typeface1;
          } 
          if (this.l == null) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          this.m = bool1;
        } catch (UnsupportedOperationException|android.content.res.Resources.NotFoundException unsupportedOperationException) {}
      } 
      if (this.l == null) {
        String str = paramx0.d(i);
        if (str != null) {
          Typeface typeface;
          if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            typeface = Typeface.create(str, 0);
            i = this.k;
            boolean bool1 = bool;
            if ((this.j & 0x2) != 0)
              bool1 = true; 
            typeface = Typeface.create(typeface, i, bool1);
          } else {
            typeface = Typeface.create((String)typeface, this.j);
          } 
          this.l = typeface;
        } 
      } 
      return;
    } 
    if (paramx0.g(j.TextAppearance_android_typeface)) {
      Typeface typeface;
      this.m = false;
      i = paramx0.d(j.TextAppearance_android_typeface, 1);
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return; 
          typeface = Typeface.MONOSPACE;
        } else {
          typeface = Typeface.SERIF;
        } 
      } else {
        typeface = Typeface.SANS_SERIF;
      } 
      this.l = typeface;
    } 
  }
  
  private void a(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4, Drawable paramDrawable5, Drawable paramDrawable6) {
    TextView textView;
    Drawable[] arrayOfDrawable;
    if (Build.VERSION.SDK_INT >= 17 && (paramDrawable5 != null || paramDrawable6 != null)) {
      arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      textView = this.a;
      if (paramDrawable5 == null)
        paramDrawable5 = arrayOfDrawable[0]; 
      if (paramDrawable2 == null)
        paramDrawable2 = arrayOfDrawable[1]; 
      if (paramDrawable6 == null)
        paramDrawable6 = arrayOfDrawable[2]; 
      if (paramDrawable4 == null)
        paramDrawable4 = arrayOfDrawable[3]; 
      textView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable5, paramDrawable2, paramDrawable6, paramDrawable4);
      return;
    } 
    if (textView != null || paramDrawable2 != null || arrayOfDrawable != null || paramDrawable4 != null) {
      Drawable drawable1;
      Drawable drawable2;
      if (Build.VERSION.SDK_INT >= 17) {
        Drawable[] arrayOfDrawable2 = this.a.getCompoundDrawablesRelative();
        if (arrayOfDrawable2[0] != null || arrayOfDrawable2[2] != null) {
          textView = this.a;
          drawable2 = arrayOfDrawable2[0];
          if (paramDrawable2 == null)
            paramDrawable2 = arrayOfDrawable2[1]; 
          paramDrawable6 = arrayOfDrawable2[2];
          if (paramDrawable4 == null)
            paramDrawable4 = arrayOfDrawable2[3]; 
          textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, paramDrawable2, paramDrawable6, paramDrawable4);
          return;
        } 
      } 
      Drawable[] arrayOfDrawable1 = this.a.getCompoundDrawables();
      TextView textView1 = this.a;
      if (textView == null)
        drawable1 = arrayOfDrawable1[0]; 
      if (paramDrawable2 == null)
        paramDrawable2 = arrayOfDrawable1[1]; 
      if (drawable2 == null)
        drawable2 = arrayOfDrawable1[2]; 
      if (paramDrawable4 == null)
        paramDrawable4 = arrayOfDrawable1[3]; 
      textView1.setCompoundDrawablesWithIntrinsicBounds(drawable1, paramDrawable2, drawable2, paramDrawable4);
    } 
  }
  
  private void a(Drawable paramDrawable, v0 paramv0) {
    if (paramDrawable != null && paramv0 != null)
      j.a(paramDrawable, paramv0, this.a.getDrawableState()); 
  }
  
  private void b(int paramInt, float paramFloat) {
    this.i.a(paramInt, paramFloat);
  }
  
  private void l() {
    v0 v01 = this.h;
    this.b = v01;
    this.c = v01;
    this.d = v01;
    this.e = v01;
    this.f = v01;
    this.g = v01;
  }
  
  void a() {
    if (this.b != null || this.c != null || this.d != null || this.e != null) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.b);
      a(arrayOfDrawable[1], this.c);
      a(arrayOfDrawable[2], this.d);
      a(arrayOfDrawable[3], this.e);
    } 
    if (Build.VERSION.SDK_INT >= 17 && (this.f != null || this.g != null)) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.f);
      a(arrayOfDrawable[2], this.g);
    } 
  }
  
  void a(int paramInt) {
    this.i.b(paramInt);
  }
  
  void a(int paramInt, float paramFloat) {
    if (!b.a && !j())
      b(paramInt, paramFloat); 
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.i.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void a(Context paramContext, int paramInt) {
    x0 x0 = x0.a(paramContext, paramInt, j.TextAppearance);
    if (x0.g(j.TextAppearance_textAllCaps))
      a(x0.a(j.TextAppearance_textAllCaps, false)); 
    if (Build.VERSION.SDK_INT < 23 && x0.g(j.TextAppearance_android_textColor)) {
      ColorStateList colorStateList = x0.a(j.TextAppearance_android_textColor);
      if (colorStateList != null)
        this.a.setTextColor(colorStateList); 
    } 
    if (x0.g(j.TextAppearance_android_textSize) && x0.c(j.TextAppearance_android_textSize, -1) == 0)
      this.a.setTextSize(0, 0.0F); 
    a(paramContext, x0);
    if (Build.VERSION.SDK_INT >= 26 && x0.g(j.TextAppearance_fontVariationSettings)) {
      String str = x0.d(j.TextAppearance_fontVariationSettings);
      if (str != null)
        this.a.setFontVariationSettings(str); 
    } 
    x0.b();
    Typeface typeface = this.l;
    if (typeface != null)
      this.a.setTypeface(typeface, this.j); 
  }
  
  void a(ColorStateList paramColorStateList) {
    boolean bool;
    if (this.h == null)
      this.h = new v0(); 
    v0 v01 = this.h;
    v01.a = paramColorStateList;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    } 
    v01.d = bool;
    l();
  }
  
  void a(PorterDuff.Mode paramMode) {
    boolean bool;
    if (this.h == null)
      this.h = new v0(); 
    v0 v01 = this.h;
    v01.b = paramMode;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    } 
    v01.c = bool;
    l();
  }
  
  @SuppressLint({"NewApi"})
  void a(AttributeSet paramAttributeSet, int paramInt) {
    boolean bool1;
    String str1;
    x0 x02;
    String str2;
    ColorStateList colorStateList1;
    ColorStateList colorStateList2;
    ColorStateList colorStateList3;
    Context context = this.a.getContext();
    j j1 = j.b();
    x0 x01 = x0.a(context, paramAttributeSet, j.AppCompatTextHelper, paramInt, 0);
    TextView textView1 = this.a;
    v.a((View)textView1, textView1.getContext(), j.AppCompatTextHelper, paramAttributeSet, x01.a(), paramInt, 0);
    int i = x01.g(j.AppCompatTextHelper_android_textAppearance, -1);
    if (x01.g(j.AppCompatTextHelper_android_drawableLeft))
      this.b = a(context, j1, x01.g(j.AppCompatTextHelper_android_drawableLeft, 0)); 
    if (x01.g(j.AppCompatTextHelper_android_drawableTop))
      this.c = a(context, j1, x01.g(j.AppCompatTextHelper_android_drawableTop, 0)); 
    if (x01.g(j.AppCompatTextHelper_android_drawableRight))
      this.d = a(context, j1, x01.g(j.AppCompatTextHelper_android_drawableRight, 0)); 
    if (x01.g(j.AppCompatTextHelper_android_drawableBottom))
      this.e = a(context, j1, x01.g(j.AppCompatTextHelper_android_drawableBottom, 0)); 
    if (Build.VERSION.SDK_INT >= 17) {
      if (x01.g(j.AppCompatTextHelper_android_drawableStart))
        this.f = a(context, j1, x01.g(j.AppCompatTextHelper_android_drawableStart, 0)); 
      if (x01.g(j.AppCompatTextHelper_android_drawableEnd))
        this.g = a(context, j1, x01.g(j.AppCompatTextHelper_android_drawableEnd, 0)); 
    } 
    x01.b();
    boolean bool2 = this.a.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
    if (i != -1) {
      x0 x0 = x0.a(context, i, j.TextAppearance);
      if (!bool2 && x0.g(j.TextAppearance_textAllCaps)) {
        bool1 = x0.a(j.TextAppearance_textAllCaps, false);
        i = 1;
      } else {
        i = 0;
        bool1 = false;
      } 
      a(context, x0);
      if (Build.VERSION.SDK_INT < 23) {
        TextView textView;
        x0 x06;
        if (x0.g(j.TextAppearance_android_textColor)) {
          ColorStateList colorStateList = x0.a(j.TextAppearance_android_textColor);
        } else {
          x01 = null;
        } 
        if (x0.g(j.TextAppearance_android_textColorHint)) {
          ColorStateList colorStateList = x0.a(j.TextAppearance_android_textColorHint);
        } else {
          textView1 = null;
        } 
        if (x0.g(j.TextAppearance_android_textColorLink)) {
          colorStateList1 = x0.a(j.TextAppearance_android_textColorLink);
          x02 = x01;
          textView = textView1;
          x06 = x02;
        } else {
          x02 = (x0)textView;
          x0 x07 = x06;
          TextView textView3 = (TextView)x02;
          colorStateList1 = null;
        } 
      } else {
        x01 = null;
        textView1 = null;
        colorStateList1 = null;
      } 
      if (x0.g(j.TextAppearance_textLocale)) {
        str2 = x0.d(j.TextAppearance_textLocale);
      } else {
        str2 = null;
      } 
      if (Build.VERSION.SDK_INT >= 26 && x0.g(j.TextAppearance_fontVariationSettings)) {
        x02 = (x0)x0.d(j.TextAppearance_fontVariationSettings);
      } else {
        x02 = null;
      } 
      x0.b();
    } else {
      x01 = null;
      x02 = null;
      i = 0;
      bool1 = false;
      textView1 = null;
      str2 = null;
      colorStateList1 = null;
    } 
    x0 x05 = x0.a(context, paramAttributeSet, j.TextAppearance, paramInt, 0);
    if (!bool2 && x05.g(j.TextAppearance_textAllCaps)) {
      bool1 = x05.a(j.TextAppearance_textAllCaps, false);
      i = 1;
    } 
    x0 x04 = x01;
    TextView textView2 = textView1;
    ColorStateList colorStateList4 = colorStateList1;
    if (Build.VERSION.SDK_INT < 23) {
      ColorStateList colorStateList5;
      ColorStateList colorStateList6;
      if (x05.g(j.TextAppearance_android_textColor))
        colorStateList6 = x05.a(j.TextAppearance_android_textColor); 
      if (x05.g(j.TextAppearance_android_textColorHint))
        colorStateList5 = x05.a(j.TextAppearance_android_textColorHint); 
      colorStateList2 = colorStateList5;
      colorStateList3 = colorStateList6;
      colorStateList4 = colorStateList1;
      if (x05.g(j.TextAppearance_android_textColorLink)) {
        colorStateList4 = x05.a(j.TextAppearance_android_textColorLink);
        colorStateList3 = colorStateList6;
        colorStateList2 = colorStateList5;
      } 
    } 
    if (x05.g(j.TextAppearance_textLocale))
      str2 = x05.d(j.TextAppearance_textLocale); 
    x01 = x02;
    if (Build.VERSION.SDK_INT >= 26) {
      x01 = x02;
      if (x05.g(j.TextAppearance_fontVariationSettings))
        str1 = x05.d(j.TextAppearance_fontVariationSettings); 
    } 
    if (Build.VERSION.SDK_INT >= 28 && x05.g(j.TextAppearance_android_textSize) && x05.c(j.TextAppearance_android_textSize, -1) == 0)
      this.a.setTextSize(0, 0.0F); 
    a(context, x05);
    x05.b();
    if (colorStateList3 != null)
      this.a.setTextColor(colorStateList3); 
    if (colorStateList2 != null)
      this.a.setHintTextColor(colorStateList2); 
    if (colorStateList4 != null)
      this.a.setLinkTextColor(colorStateList4); 
    if (!bool2 && i != 0)
      a(bool1); 
    Typeface typeface = this.l;
    if (typeface != null)
      if (this.k == -1) {
        this.a.setTypeface(typeface, this.j);
      } else {
        this.a.setTypeface(typeface);
      }  
    if (str1 != null)
      this.a.setFontVariationSettings(str1); 
    if (str2 != null) {
      i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        this.a.setTextLocales(LocaleList.forLanguageTags(str2));
      } else if (i >= 21) {
        str1 = str2.substring(0, str2.indexOf(','));
        this.a.setTextLocale(Locale.forLanguageTag(str1));
      } 
    } 
    this.i.a(paramAttributeSet, paramInt);
    if (b.a && this.i.f() != 0) {
      int[] arrayOfInt = this.i.e();
      if (arrayOfInt.length > 0)
        if (this.a.getAutoSizeStepGranularity() != -1.0F) {
          this.a.setAutoSizeTextTypeUniformWithConfiguration(this.i.c(), this.i.b(), this.i.d(), 0);
        } else {
          this.a.setAutoSizeTextTypeUniformWithPresetSizes(arrayOfInt, 0);
        }  
    } 
    x0 x03 = x0.a(context, paramAttributeSet, j.AppCompatTextView);
    paramInt = x03.g(j.AppCompatTextView_drawableLeftCompat, -1);
    if (paramInt != -1) {
      Drawable drawable = j1.a(context, paramInt);
    } else {
      paramAttributeSet = null;
    } 
    paramInt = x03.g(j.AppCompatTextView_drawableTopCompat, -1);
    if (paramInt != -1) {
      Drawable drawable = j1.a(context, paramInt);
    } else {
      str1 = null;
    } 
    paramInt = x03.g(j.AppCompatTextView_drawableRightCompat, -1);
    if (paramInt != -1) {
      Drawable drawable = j1.a(context, paramInt);
    } else {
      typeface = null;
    } 
    paramInt = x03.g(j.AppCompatTextView_drawableBottomCompat, -1);
    if (paramInt != -1) {
      Drawable drawable = j1.a(context, paramInt);
    } else {
      x02 = null;
    } 
    paramInt = x03.g(j.AppCompatTextView_drawableStartCompat, -1);
    if (paramInt != -1) {
      Drawable drawable = j1.a(context, paramInt);
    } else {
      str2 = null;
    } 
    paramInt = x03.g(j.AppCompatTextView_drawableEndCompat, -1);
    if (paramInt != -1) {
      Drawable drawable = j1.a(context, paramInt);
    } else {
      colorStateList1 = null;
    } 
    a((Drawable)paramAttributeSet, (Drawable)str1, (Drawable)typeface, (Drawable)x02, (Drawable)str2, (Drawable)colorStateList1);
    if (x03.g(j.AppCompatTextView_drawableTint)) {
      ColorStateList colorStateList = x03.a(j.AppCompatTextView_drawableTint);
      i.a(this.a, colorStateList);
    } 
    if (x03.g(j.AppCompatTextView_drawableTintMode)) {
      PorterDuff.Mode mode = e0.a(x03.d(j.AppCompatTextView_drawableTintMode, -1), null);
      i.a(this.a, mode);
    } 
    paramInt = x03.c(j.AppCompatTextView_firstBaselineToTopHeight, -1);
    i = x03.c(j.AppCompatTextView_lastBaselineToBottomHeight, -1);
    int j = x03.c(j.AppCompatTextView_lineHeight, -1);
    x03.b();
    if (paramInt != -1)
      i.a(this.a, paramInt); 
    if (i != -1)
      i.b(this.a, i); 
    if (j != -1)
      i.c(this.a, j); 
  }
  
  void a(WeakReference<TextView> paramWeakReference, Typeface paramTypeface) {
    if (this.m) {
      this.l = paramTypeface;
      TextView textView = paramWeakReference.get();
      if (textView != null)
        textView.setTypeface(paramTypeface, this.j); 
    } 
  }
  
  void a(boolean paramBoolean) {
    this.a.setAllCaps(paramBoolean);
  }
  
  void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!b.a)
      b(); 
  }
  
  void a(int[] paramArrayOfint, int paramInt) {
    this.i.a(paramArrayOfint, paramInt);
  }
  
  void b() {
    this.i.a();
  }
  
  int c() {
    return this.i.b();
  }
  
  int d() {
    return this.i.c();
  }
  
  int e() {
    return this.i.d();
  }
  
  int[] f() {
    return this.i.e();
  }
  
  int g() {
    return this.i.f();
  }
  
  ColorStateList h() {
    v0 v01 = this.h;
    return (v01 != null) ? v01.a : null;
  }
  
  PorterDuff.Mode i() {
    v0 v01 = this.h;
    return (v01 != null) ? v01.b : null;
  }
  
  boolean j() {
    return this.i.g();
  }
  
  void k() {
    a();
  }
  
  class a extends f.a {
    a(y this$0, int param1Int1, int param1Int2, WeakReference param1WeakReference) {}
    
    public void a(int param1Int) {}
    
    public void a(Typeface param1Typeface) {
      Typeface typeface = param1Typeface;
      if (Build.VERSION.SDK_INT >= 28) {
        int i = this.a;
        typeface = param1Typeface;
        if (i != -1) {
          boolean bool;
          if ((this.b & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          typeface = Typeface.create(param1Typeface, i, bool);
        } 
      } 
      this.d.a(this.c, typeface);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */