package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.k.b;
import java.util.ArrayList;
import java.util.Calendar;

public class a extends g {
  public a(com.henninghall.date_picker.pickers.a parama, i parami) {
    super(parama, parami);
  }
  
  public String b() {
    return this.a.o.g() ? " a " : "";
  }
  
  public Paint.Align d() {
    return Paint.Align.RIGHT;
  }
  
  public ArrayList<String> f() {
    Calendar calendar = Calendar.getInstance();
    ArrayList<String> arrayList = new ArrayList();
    calendar.set(11, 0);
    arrayList.add(this.e.format(calendar.getTime()));
    calendar.add(11, 12);
    arrayList.add(this.e.format(calendar.getTime()));
    return arrayList;
  }
  
  public boolean j() {
    return (this.a.o.g() && this.a.l() != b.c);
  }
  
  public boolean k() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */