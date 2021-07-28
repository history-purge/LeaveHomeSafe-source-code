package com.henninghall.date_picker.m;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.henninghall.date_picker.DatePickerManager;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.j;
import com.henninghall.date_picker.o.g;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class e implements d {
  private final g a;
  
  private final i b;
  
  private final c c;
  
  private final View d;
  
  e(g paramg, i parami, c paramc, View paramView) {
    this.a = paramg;
    this.c = paramc;
    this.b = parami;
    this.d = paramView;
  }
  
  public void a(g paramg) {
    if (this.a.d())
      return; 
    WritableMap writableMap = Arguments.createMap();
    TimeZone timeZone = this.b.n();
    SimpleDateFormat simpleDateFormat = this.c.a();
    Calendar calendar1 = this.b.j();
    Calendar calendar2 = this.b.i();
    try {
      simpleDateFormat.setTimeZone(timeZone);
      Calendar calendar = Calendar.getInstance(timeZone);
      calendar.setTime(simpleDateFormat.parse(this.a.a()));
      String str = j.a(calendar);
      if (calendar1 != null && calendar.before(calendar1)) {
        this.c.a(calendar1);
        return;
      } 
      if (calendar2 != null && calendar.after(calendar2)) {
        this.c.a(calendar2);
        return;
      } 
      writableMap.putString("date", str);
      writableMap.putString("dateString", this.c.b());
      ((RCTEventEmitter)DatePickerManager.context.getJSModule(RCTEventEmitter.class)).receiveEvent(this.d.getId(), "dateChange", writableMap);
      return;
    } catch (ParseException parseException) {
      parseException.printStackTrace();
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/m/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */