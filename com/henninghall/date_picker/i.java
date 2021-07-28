package com.henninghall.date_picker;

import com.facebook.react.bridge.Dynamic;
import com.henninghall.date_picker.k.a;
import com.henninghall.date_picker.k.b;
import com.henninghall.date_picker.k.c;
import com.henninghall.date_picker.l.a;
import com.henninghall.date_picker.l.b;
import com.henninghall.date_picker.l.c;
import com.henninghall.date_picker.l.d;
import com.henninghall.date_picker.l.e;
import com.henninghall.date_picker.l.f;
import com.henninghall.date_picker.l.g;
import com.henninghall.date_picker.l.h;
import com.henninghall.date_picker.l.i;
import com.henninghall.date_picker.l.j;
import com.henninghall.date_picker.l.k;
import com.henninghall.date_picker.l.l;
import com.henninghall.date_picker.l.m;
import com.henninghall.date_picker.l.n;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public class i {
  private final a a = new a();
  
  private final j b = new j();
  
  private final f c = new f();
  
  private final c d = new c();
  
  private final l e = new l();
  
  private final i f = new i();
  
  private final h g = new h();
  
  private final g h = new g();
  
  private final m i = new m();
  
  private final d j = new d();
  
  private final n k = new n();
  
  private final b l = new b();
  
  private final e m = new e();
  
  private final HashMap n = new a();
  
  public c o = new c(this);
  
  private k a(String paramString) {
    return (k)this.n.get(paramString);
  }
  
  public Calendar a() {
    return j.a(b(), n());
  }
  
  void a(String paramString, Dynamic paramDynamic) {
    a(paramString).a(paramDynamic);
  }
  
  public String b() {
    return (String)this.a.a();
  }
  
  public int c() {
    return ((Integer)this.l.a()).intValue();
  }
  
  public String d() {
    return (String)this.d.a();
  }
  
  public Integer e() {
    return (Integer)this.j.a();
  }
  
  public a f() {
    return (a)this.m.a();
  }
  
  public Locale g() {
    return (Locale)this.c.a();
  }
  
  public String h() {
    return this.c.b();
  }
  
  public Calendar i() {
    return (new a(n(), (String)this.h.a())).a();
  }
  
  public Calendar j() {
    return (new a(n(), (String)this.g.a())).a();
  }
  
  public int k() {
    return ((Integer)this.f.a()).intValue();
  }
  
  public b l() {
    return (b)this.b.a();
  }
  
  public String m() {
    return (String)this.e.a();
  }
  
  public TimeZone n() {
    return ((Boolean)this.i.a()).booleanValue() ? TimeZone.getTimeZone("UTC") : TimeZone.getDefault();
  }
  
  public c o() {
    return (c)this.k.a();
  }
  
  class a extends HashMap<String, k> {
    a() {
      put((K)"date", (V)i.a(i.this));
      put((K)"mode", (V)i.b(i.this));
      put((K)"locale", (V)i.f(i.this));
      put((K)"fadeToColor", (V)i.g(i.this));
      put((K)"textColor", (V)i.h(i.this));
      put((K)"minuteInterval", (V)i.i(i.this));
      put((K)"minimumDate", (V)i.j(i.this));
      put((K)"maximumDate", (V)i.k(i.this));
      put((K)"utc", (V)i.l(i.this));
      put((K)"height", (V)i.m(i.this));
      put((K)"androidVariant", (V)i.c(i.this));
      put((K)"dividerHeight", (V)i.d(i.this));
      put((K)"is24hourSource", (V)i.e(i.this));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */