package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

public abstract class z extends ReplacementSpan implements l {
  public static void a(Spannable paramSpannable, TextView paramTextView) {
    int j = paramSpannable.length();
    int i = 0;
    z[] arrayOfZ = (z[])paramSpannable.getSpans(0, j, z.class);
    j = arrayOfZ.length;
    while (i < j) {
      z z1 = arrayOfZ[i];
      z1.c();
      z1.a(paramTextView);
      i++;
    } 
  }
  
  public abstract Drawable a();
  
  public abstract void a(TextView paramTextView);
  
  public abstract int b();
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */