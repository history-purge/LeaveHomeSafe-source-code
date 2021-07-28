package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.k.b;
import com.henninghall.date_picker.pickers.a;
import java.util.ArrayList;
import java.util.Calendar;

public class d extends g {
  public d(a parama, i parami) {
    super(parama, parami);
  }
  
  public String b() {
    return this.a.o.g() ? "h" : "HH";
  }
  
  public Paint.Align d() {
    return Paint.Align.RIGHT;
  }
  
  public ArrayList<String> f() {
    byte b;
    Calendar calendar = Calendar.getInstance();
    ArrayList<String> arrayList = new ArrayList();
    if (this.a.o.g()) {
      b = 12;
    } else {
      b = 24;
    } 
    for (int i = 0; i < b; i++) {
      arrayList.add(this.e.format(calendar.getTime()));
      calendar.add(11, 1);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */