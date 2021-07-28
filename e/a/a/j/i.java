package e.a.a.j;

import e.a.a.b;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class i implements b {
  private int c = 0;
  
  private int d = 0;
  
  private int e = 0;
  
  private int f = 0;
  
  private int g = 0;
  
  private int h = 0;
  
  private TimeZone i = null;
  
  private int j;
  
  private boolean k = false;
  
  private boolean l = false;
  
  private boolean m = false;
  
  public i() {}
  
  public i(Calendar paramCalendar) {
    Date date = paramCalendar.getTime();
    TimeZone timeZone = paramCalendar.getTimeZone();
    GregorianCalendar gregorianCalendar = (GregorianCalendar)Calendar.getInstance(Locale.US);
    gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
    gregorianCalendar.setTimeZone(timeZone);
    gregorianCalendar.setTime(date);
    this.c = gregorianCalendar.get(1);
    this.d = gregorianCalendar.get(2) + 1;
    this.e = gregorianCalendar.get(5);
    this.f = gregorianCalendar.get(11);
    this.g = gregorianCalendar.get(12);
    this.h = gregorianCalendar.get(13);
    this.j = gregorianCalendar.get(14) * 1000000;
    this.i = gregorianCalendar.getTimeZone();
    this.m = true;
    this.l = true;
    this.k = true;
  }
  
  public String a() {
    return c.a(this);
  }
  
  public void a(int paramInt) {
    this.f = Math.min(Math.abs(paramInt), 23);
    this.l = true;
  }
  
  public void b(int paramInt) {
    this.g = Math.min(Math.abs(paramInt), 59);
    this.l = true;
  }
  
  public void c(int paramInt) {
    if (paramInt < 1) {
      this.e = 1;
    } else if (paramInt > 31) {
      this.e = 31;
    } else {
      this.e = paramInt;
    } 
    this.k = true;
  }
  
  public int compareTo(Object paramObject) {
    long l = l().getTimeInMillis();
    paramObject = paramObject;
    l -= paramObject.l().getTimeInMillis();
    if (l == 0L)
      l = (this.j - paramObject.i()); 
    return (int)Math.signum((float)l);
  }
  
  public void d(int paramInt) {
    this.h = Math.min(Math.abs(paramInt), 59);
    this.l = true;
  }
  
  public void e(int paramInt) {
    this.j = paramInt;
    this.l = true;
  }
  
  public int getDay() {
    return this.e;
  }
  
  public int getHour() {
    return this.f;
  }
  
  public int getMinute() {
    return this.g;
  }
  
  public int getMonth() {
    return this.d;
  }
  
  public int getSecond() {
    return this.h;
  }
  
  public TimeZone getTimeZone() {
    return this.i;
  }
  
  public int getYear() {
    return this.c;
  }
  
  public int i() {
    return this.j;
  }
  
  public boolean k() {
    return this.m;
  }
  
  public Calendar l() {
    GregorianCalendar gregorianCalendar = (GregorianCalendar)Calendar.getInstance(Locale.US);
    gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
    if (this.m)
      gregorianCalendar.setTimeZone(this.i); 
    gregorianCalendar.set(1, this.c);
    gregorianCalendar.set(2, this.d - 1);
    gregorianCalendar.set(5, this.e);
    gregorianCalendar.set(11, this.f);
    gregorianCalendar.set(12, this.g);
    gregorianCalendar.set(13, this.h);
    gregorianCalendar.set(14, this.j / 1000000);
    return gregorianCalendar;
  }
  
  public boolean m() {
    return this.l;
  }
  
  public boolean o() {
    return this.k;
  }
  
  public void setMonth(int paramInt) {
    if (paramInt < 1) {
      this.d = 1;
    } else if (paramInt > 12) {
      this.d = 12;
    } else {
      this.d = paramInt;
    } 
    this.k = true;
  }
  
  public void setTimeZone(TimeZone paramTimeZone) {
    this.i = paramTimeZone;
    this.l = true;
    this.m = true;
  }
  
  public void setYear(int paramInt) {
    this.c = Math.min(Math.abs(paramInt), 9999);
    this.k = true;
  }
  
  public String toString() {
    return a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */