package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.e;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.k.b;
import com.henninghall.date_picker.pickers.a;
import java.util.ArrayList;
import java.util.Calendar;

public class h extends g {
  private int f = 1900;
  
  private int g = 2100;
  
  public h(a parama, i parami) {
    super(parama, parami);
  }
  
  private int l() {
    return (this.a.i() == null) ? this.g : this.a.i().get(1);
  }
  
  private int m() {
    return (this.a.j() == null) ? this.f : this.a.j().get(1);
  }
  
  public String b() {
    return e.d(this.a.h());
  }
  
  public Paint.Align d() {
    return Paint.Align.RIGHT;
  }
  
  public ArrayList<String> f() {
    ArrayList<String> arrayList = new ArrayList();
    Calendar calendar = Calendar.getInstance();
    int j = m();
    int k = l();
    calendar.set(1, j);
    for (int i = 0; i <= k - j; i++) {
      arrayList.add(b(calendar));
      calendar.add(1, 1);
    } 
    return arrayList;
  }
  
  public boolean j() {
    return (this.a.l() == b.c);
  }
  
  public boolean k() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */