package com.henninghall.date_picker.m;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.henninghall.date_picker.g;
import com.henninghall.date_picker.i;

public class a {
  private final GradientDrawable a;
  
  private final GradientDrawable b;
  
  private final i c;
  
  a(i parami, View paramView) {
    this.c = parami;
    ImageView imageView1 = (ImageView)paramView.findViewById(g.overlay_top);
    ImageView imageView2 = (ImageView)paramView.findViewById(g.overlay_bottom);
    this.a = (GradientDrawable)imageView1.getDrawable();
    this.b = (GradientDrawable)imageView2.getDrawable();
  }
  
  private boolean a(String paramString) {
    return (paramString != null && paramString.length() == 7);
  }
  
  void a() {
    int j;
    String str = this.c.d();
    if (a(str)) {
      j = 255;
    } else {
      j = 0;
    } 
    this.a.setAlpha(j);
    this.b.setAlpha(j);
    if (a(str)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("#FF");
      stringBuilder.append(str.substring(1));
      j = Color.parseColor(stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("#00");
      stringBuilder.append(str.substring(1));
      int k = Color.parseColor(stringBuilder.toString());
      this.a.setColors(new int[] { j, k });
      this.b.setColors(new int[] { j, k });
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */