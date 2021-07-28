package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.core.util.f;
import b.g.m.v;
import e.f.a.f.a0.g;
import e.f.a.f.a0.k;
import e.f.a.f.k;
import e.f.a.f.x.c;

final class b {
  private final Rect a;
  
  private final ColorStateList b;
  
  private final ColorStateList c;
  
  private final ColorStateList d;
  
  private final int e;
  
  private final k f;
  
  private b(ColorStateList paramColorStateList1, ColorStateList paramColorStateList2, ColorStateList paramColorStateList3, int paramInt, k paramk, Rect paramRect) {
    f.a(paramRect.left);
    f.a(paramRect.top);
    f.a(paramRect.right);
    f.a(paramRect.bottom);
    this.a = paramRect;
    this.b = paramColorStateList2;
    this.c = paramColorStateList1;
    this.d = paramColorStateList3;
    this.e = paramInt;
    this.f = paramk;
  }
  
  static b a(Context paramContext, int paramInt) {
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    f.a(bool, "Cannot create a CalendarItemStyle with a styleResId of 0");
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, k.MaterialCalendarItem);
    Rect rect = new Rect(typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetLeft, 0), typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetTop, 0), typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetRight, 0), typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetBottom, 0));
    ColorStateList colorStateList1 = c.a(paramContext, typedArray, k.MaterialCalendarItem_itemFillColor);
    ColorStateList colorStateList2 = c.a(paramContext, typedArray, k.MaterialCalendarItem_itemTextColor);
    ColorStateList colorStateList3 = c.a(paramContext, typedArray, k.MaterialCalendarItem_itemStrokeColor);
    paramInt = typedArray.getDimensionPixelSize(k.MaterialCalendarItem_itemStrokeWidth, 0);
    k k1 = k.a(paramContext, typedArray.getResourceId(k.MaterialCalendarItem_itemShapeAppearance, 0), typedArray.getResourceId(k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
    typedArray.recycle();
    return new b(colorStateList1, colorStateList2, colorStateList3, paramInt, k1, rect);
  }
  
  int a() {
    return this.a.bottom;
  }
  
  void a(TextView paramTextView) {
    RippleDrawable rippleDrawable;
    g g1 = new g();
    g g2 = new g();
    g1.setShapeAppearanceModel(this.f);
    g2.setShapeAppearanceModel(this.f);
    g1.a(this.c);
    g1.a(this.e, this.d);
    paramTextView.setTextColor(this.b);
    if (Build.VERSION.SDK_INT >= 21)
      rippleDrawable = new RippleDrawable(this.b.withAlpha(30), (Drawable)g1, (Drawable)g2); 
    Rect rect = this.a;
    v.a((View)paramTextView, (Drawable)new InsetDrawable((Drawable)rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
  }
  
  int b() {
    return this.a.top;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */