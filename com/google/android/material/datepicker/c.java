package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import e.f.a.f.b;
import e.f.a.f.k;
import e.f.a.f.x.b;

final class c {
  final b a;
  
  final b b;
  
  final b c;
  
  final b d;
  
  final b e;
  
  final b f;
  
  final b g;
  
  final Paint h;
  
  c(Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(b.a(paramContext, b.materialCalendarStyle, h.class.getCanonicalName()), k.MaterialCalendar);
    this.a = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_dayStyle, 0));
    this.g = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_dayInvalidStyle, 0));
    this.b = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_daySelectedStyle, 0));
    this.c = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_dayTodayStyle, 0));
    ColorStateList colorStateList = e.f.a.f.x.c.a(paramContext, typedArray, k.MaterialCalendar_rangeFillColor);
    this.d = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_yearStyle, 0));
    this.e = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_yearSelectedStyle, 0));
    this.f = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_yearTodayStyle, 0));
    this.h = new Paint();
    this.h.setColor(colorStateList.getDefaultColor());
    typedArray.recycle();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */