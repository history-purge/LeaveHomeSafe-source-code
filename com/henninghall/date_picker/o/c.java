package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.e;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.j;
import com.henninghall.date_picker.k.b;
import com.henninghall.date_picker.pickers.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class c extends g {
  private static int h = Calendar.getInstance().getActualMaximum(6);
  
  private String f;
  
  private HashMap<String, String> g;
  
  public c(a parama, i parami) {
    super(parama, parami);
  }
  
  private String b(String paramString) {
    String str2 = j.a(this.a.g());
    String str1 = str2;
    if (Character.isUpperCase(paramString.charAt(0)))
      str1 = j.a(str2); 
    return str1;
  }
  
  private String d(Calendar paramCalendar) {
    return l().format(paramCalendar.getTime());
  }
  
  private String e(Calendar paramCalendar) {
    return this.e.format(paramCalendar.getTime());
  }
  
  private void f(Calendar paramCalendar) {
    paramCalendar.set(11, 0);
    paramCalendar.set(12, 0);
    paramCalendar.set(13, 0);
    paramCalendar.set(14, 0);
  }
  
  private SimpleDateFormat l() {
    return new SimpleDateFormat(m(), this.a.g());
  }
  
  private String m() {
    return e.b(this.a.h());
  }
  
  private Calendar n() {
    int i;
    Calendar calendar1 = this.a.i();
    Calendar calendar2 = this.a.j();
    if (calendar1 != null) {
      calendar1 = (Calendar)calendar1.clone();
      f(calendar1);
      return calendar1;
    } 
    if (calendar2 != null) {
      calendar1 = (Calendar)calendar2.clone();
      f(calendar1);
      i = calendar1.getActualMaximum(6);
    } else {
      calendar1 = (Calendar)o().clone();
      calendar1.setTime(new Date());
      i = h;
    } 
    calendar1.add(5, i / 2);
    return calendar1;
  }
  
  private Calendar o() {
    Calendar calendar = Calendar.getInstance();
    int k = this.a.k();
    boolean bool = true;
    if (k <= 1)
      return calendar; 
    int m = Integer.valueOf((new SimpleDateFormat("mm", this.a.g())).format(calendar.getTime())).intValue() % k;
    int i = k - m;
    int j = -m;
    if (k / 2 <= m)
      bool = false; 
    if (bool)
      i = j; 
    calendar.add(12, i);
    return (Calendar)calendar.clone();
  }
  
  private Calendar p() {
    int i;
    Calendar calendar1 = this.a.i();
    Calendar calendar2 = this.a.j();
    if (calendar2 != null) {
      calendar1 = (Calendar)calendar2.clone();
      f(calendar1);
      return calendar1;
    } 
    if (calendar1 != null) {
      calendar1 = (Calendar)calendar1.clone();
      f(calendar1);
      i = calendar1.getActualMaximum(6);
    } else {
      calendar1 = (Calendar)o().clone();
      i = h;
    } 
    calendar1.add(5, -i / 2);
    return calendar1;
  }
  
  public String a(String paramString) {
    return paramString.equals(this.f) ? b(paramString) : this.g.get(paramString);
  }
  
  public String b() {
    return e.a(this.a.g()).replace("EEEE", "EEE").replace("MMMM", "MMM");
  }
  
  public Paint.Align d() {
    return Paint.Align.RIGHT;
  }
  
  public ArrayList<String> f() {
    ArrayList<String> arrayList = new ArrayList();
    this.g = new HashMap<String, String>();
    Calendar calendar1 = p();
    Calendar calendar2 = n();
    while (!calendar1.after(calendar2)) {
      String str = e(calendar1);
      arrayList.add(str);
      this.g.put(str, d(calendar1));
      if (j.c(calendar1))
        this.f = str; 
      calendar1.add(5, 1);
    } 
    return arrayList;
  }
  
  public boolean j() {
    return (this.a.l() == b.e);
  }
  
  public boolean k() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */