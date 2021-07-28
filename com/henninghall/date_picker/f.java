package com.henninghall.date_picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Dynamic;
import com.henninghall.date_picker.m.c;
import java.util.ArrayList;

public class f extends RelativeLayout {
  private c c;
  
  private i d = new i();
  
  private ArrayList<String> e = new ArrayList<String>();
  
  private final Runnable f = new a(this);
  
  public f() {
    super((Context)DatePickerManager.context);
  }
  
  private boolean a(String... paramVarArgs) {
    int k = paramVarArgs.length;
    for (int j = 0; j < k; j++) {
      String str = paramVarArgs[j];
      if (this.e.contains(str))
        return true; 
    } 
    return false;
  }
  
  public void a() {
    if (a(new String[] { "androidVariant" })) {
      removeAllViewsInLayout();
      RelativeLayout.inflate(getContext(), this.d.o.b(), (ViewGroup)this);
      this.c = new c(this.d, (View)this);
    } 
    if (a(new String[] { "fadeToColor" }))
      this.c.f(); 
    if (a(new String[] { "textColor" }))
      this.c.h(); 
    if (a(new String[] { "mode", "androidVariant", "is24hourSource" }))
      this.c.k(); 
    if (a(new String[] { "height" }))
      this.c.g(); 
    if (a(new String[] { "dividerHeight" }))
      this.c.e(); 
    if (a(new String[] { "mode", "locale", "androidVariant", "is24hourSource" }))
      this.c.i(); 
    if (a(new String[] { "mode" }))
      this.c.j(); 
    if (a(new String[] { "date", "height", "locale", "maximumDate", "minimumDate", "minuteInterval", "mode", "utc", "androidVariant" }))
      this.c.d(); 
    this.c.c();
    this.e = new ArrayList<String>();
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.c.a(paramInt1, paramInt2);
  }
  
  public void a(String paramString, Dynamic paramDynamic) {
    this.d.a(paramString, paramDynamic);
    this.e.add(paramString);
  }
  
  public void requestLayout() {
    super.requestLayout();
    post(this.f);
  }
  
  class a implements Runnable {
    a(f this$0) {}
    
    public void run() {
      f f1 = this.c;
      f1.measure(View.MeasureSpec.makeMeasureSpec(f1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.getHeight(), 1073741824));
      f1 = this.c;
      f1.layout(f1.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */