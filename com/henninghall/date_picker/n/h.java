package com.henninghall.date_picker.n;

import android.graphics.Color;
import com.henninghall.date_picker.o.g;

public class h implements j {
  private final String a;
  
  public h(String paramString) {
    this.a = paramString;
  }
  
  public void a(g paramg) {
    int i = Color.parseColor(this.a);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("#70");
    stringBuilder.append(this.a.substring(1));
    int k = Color.parseColor(stringBuilder.toString());
    paramg.d.setNormalTextColor(k);
    paramg.d.setSelectedTextColor(i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/n/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */