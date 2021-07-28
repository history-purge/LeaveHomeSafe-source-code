package com.henninghall.date_picker.m;

import com.henninghall.date_picker.o.g;
import com.henninghall.date_picker.pickers.a;

public class f {
  public void a(g paramg, int paramInt) {
    a a = paramg.d;
    int j = a.getValue();
    int i = a.getMaxValue();
    boolean bool = a.getWrapSelectorWheel();
    paramInt = j + paramInt;
    if (paramInt <= i || bool)
      a.a(paramInt % (i + 1)); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/m/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */