package com.henninghall.date_picker;

import java.util.Calendar;
import java.util.TimeZone;

public class a {
  private Calendar a;
  
  a(TimeZone paramTimeZone, String paramString) {
    if (paramString == null)
      return; 
    this.a = j.b(j.a(paramString, paramTimeZone));
  }
  
  protected Calendar a() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */