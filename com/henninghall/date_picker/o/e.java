package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.k.b;
import com.henninghall.date_picker.pickers.a;
import java.util.ArrayList;
import java.util.Calendar;

public class e extends g {
  public e(a parama, i parami) {
    super(parama, parami);
  }
  
  public String b() {
    return "mm";
  }
  
  public Paint.Align d() {
    return this.a.o.f() ? Paint.Align.LEFT : Paint.Align.RIGHT;
  }
  
  public ArrayList<String> f() {
    Calendar calendar = Calendar.getInstance();
    ArrayList<String> arrayList = new ArrayList();
    int i = 0;
    calendar.set(12, 0);
    while (i < 60) {
      arrayList.add(this.e.format(calendar.getTime()));
      calendar.add(12, this.a.k());
      i += this.a.k();
    } 
    return arrayList;
  }
  
  public boolean j() {
    return (this.a.l() != b.c);
  }
  
  public boolean k() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */