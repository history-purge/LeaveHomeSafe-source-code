package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.e;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.pickers.a;
import java.util.ArrayList;
import java.util.Calendar;

public class b extends g {
  public b(a parama, i parami) {
    super(parama, parami);
  }
  
  public String b() {
    return e.a(this.a.h());
  }
  
  public Paint.Align d() {
    return Paint.Align.RIGHT;
  }
  
  public ArrayList<String> f() {
    Calendar calendar = Calendar.getInstance();
    ArrayList<String> arrayList = new ArrayList();
    calendar.set(2, 0);
    calendar.set(5, 0);
    for (int i = 1; i <= 31; i++) {
      arrayList.add(b(calendar));
      calendar.add(5, 1);
    } 
    return arrayList;
  }
  
  public boolean j() {
    return (this.a.l() == com.henninghall.date_picker.k.b.c);
  }
  
  public boolean k() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */