package com.henninghall.date_picker.o;

import android.graphics.Paint;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.k.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

public abstract class g {
  protected final i a;
  
  private Calendar b;
  
  private ArrayList<String> c = new ArrayList<String>();
  
  public com.henninghall.date_picker.pickers.a d;
  
  public SimpleDateFormat e;
  
  public g(com.henninghall.date_picker.pickers.a parama, i parami) {
    this.a = parami;
    this.d = parama;
    this.e = new SimpleDateFormat(b(), parami.g());
    parama.setTextAlign(d());
    parama.setWrapSelectorWheel(k());
  }
  
  private String a(Calendar paramCalendar, Locale paramLocale) {
    return a(paramLocale).format(paramCalendar.getTime());
  }
  
  private SimpleDateFormat a(Locale paramLocale) {
    return new SimpleDateFormat(b(), paramLocale);
  }
  
  private String[] a(ArrayList<String> paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      arrayList.add(a(iterator.next())); 
    return arrayList.<String>toArray(new String[0]);
  }
  
  private int d(Calendar paramCalendar) {
    this.e.setTimeZone(this.a.n());
    return this.c.indexOf(this.e.format(paramCalendar.getTime()));
  }
  
  private int l() {
    return this.d.getValue();
  }
  
  private void m() {
    this.d.setMinValue(0);
    this.d.setMaxValue(0);
    this.c = f();
    this.d.setDisplayedValues(a(this.c));
    this.d.setMaxValue(this.c.size() - 1);
  }
  
  public String a() {
    return a(a(l()));
  }
  
  public String a(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public String a(String paramString) {
    return paramString;
  }
  
  public void a(Calendar paramCalendar) {
    this.d.a(d(paramCalendar));
  }
  
  public abstract String b();
  
  String b(Calendar paramCalendar) {
    return a(paramCalendar, this.a.g());
  }
  
  public int c() {
    b b = this.a.l();
    return this.a.o.f() ? 10 : ((a.a[b.ordinal()] != 1) ? 5 : 15);
  }
  
  public void c(Calendar paramCalendar) {
    this.e.setTimeZone(this.a.n());
    this.b = paramCalendar;
    int j = d(paramCalendar);
    if (j > -1) {
      if (this.d.getValue() == 0) {
        this.d.setValue(j);
        return;
      } 
      this.d.a(j);
    } 
  }
  
  public abstract Paint.Align d();
  
  public String e() {
    return !j() ? this.e.format(this.b.getTime()) : a(l());
  }
  
  public abstract ArrayList<String> f();
  
  public void g() {
    this.e = new SimpleDateFormat(b(), this.a.g());
    if (!j())
      return; 
    m();
  }
  
  public void h() {
    this.d.setItemPaddingHorizontal(c());
  }
  
  public void i() {
    byte b;
    if (j()) {
      b = 0;
    } else {
      b = 8;
    } 
    this.d.setVisibility(b);
  }
  
  public abstract boolean j();
  
  public abstract boolean k();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/o/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */