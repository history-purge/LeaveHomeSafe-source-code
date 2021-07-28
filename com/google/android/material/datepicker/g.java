package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import e.f.a.f.h;
import e.f.a.f.i;
import java.util.Calendar;
import java.util.Locale;

class g extends BaseAdapter {
  private static final int f;
  
  private final Calendar c = r.d();
  
  private final int d = this.c.getMaximum(7);
  
  private final int e = this.c.getFirstDayOfWeek();
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 26) {
      bool = true;
    } else {
      bool = true;
    } 
    f = bool;
  }
  
  private int a(int paramInt) {
    int i = paramInt + this.e;
    int j = this.d;
    paramInt = i;
    if (i > j)
      paramInt = i - j; 
    return paramInt;
  }
  
  public int getCount() {
    return this.d;
  }
  
  public Integer getItem(int paramInt) {
    return (paramInt >= this.d) ? null : Integer.valueOf(a(paramInt));
  }
  
  public long getItemId(int paramInt) {
    return 0L;
  }
  
  @SuppressLint({"WrongConstant"})
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    TextView textView = (TextView)paramView;
    if (paramView == null)
      textView = (TextView)LayoutInflater.from(paramViewGroup.getContext()).inflate(h.mtrl_calendar_day_of_week, paramViewGroup, false); 
    this.c.set(7, a(paramInt));
    textView.setText(this.c.getDisplayName(7, f, Locale.getDefault()));
    textView.setContentDescription(String.format(paramViewGroup.getContext().getString(i.mtrl_picker_day_of_week_column_header), new Object[] { this.c.getDisplayName(7, 2, Locale.getDefault()) }));
    return (View)textView;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */