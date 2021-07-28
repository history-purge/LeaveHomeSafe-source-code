package com.henninghall.date_picker.m;

import android.view.View;
import android.widget.LinearLayout;
import com.henninghall.date_picker.g;

class b {
  private final LinearLayout a;
  
  b(View paramView) {
    this.a = (LinearLayout)paramView.findViewById(g.pickerWrapper);
    this.a.setWillNotDraw(false);
  }
  
  void a() {
    this.a.removeAllViews();
  }
  
  void a(View paramView) {
    this.a.addView(paramView);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */