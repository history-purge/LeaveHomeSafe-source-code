package com.henninghall.date_picker.m;

import android.view.View;
import com.henninghall.date_picker.i;
import com.henninghall.date_picker.k.c;
import com.henninghall.date_picker.k.d;
import com.henninghall.date_picker.n.f;
import com.henninghall.date_picker.n.j;
import com.henninghall.date_picker.o.c;
import com.henninghall.date_picker.o.d;
import com.henninghall.date_picker.o.e;
import com.henninghall.date_picker.o.f;
import com.henninghall.date_picker.o.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class g {
  private final i a;
  
  private final d.a.a.a.a.a b;
  
  private final d.a.a.a.a.a c;
  
  private d d;
  
  private c e;
  
  private e f;
  
  private com.henninghall.date_picker.o.a g;
  
  private com.henninghall.date_picker.o.b h;
  
  private f i;
  
  private h j;
  
  private View k;
  
  private final b l;
  
  private HashMap<d, com.henninghall.date_picker.o.g> m;
  
  g(i parami, View paramView) {
    this.a = parami;
    this.k = paramView;
    this.l = new b(paramView);
    this.j = new h(a(com.henninghall.date_picker.g.year), parami);
    this.i = new f(a(com.henninghall.date_picker.g.month), parami);
    this.h = new com.henninghall.date_picker.o.b(a(com.henninghall.date_picker.g.date), parami);
    this.e = new c(a(com.henninghall.date_picker.g.day), parami);
    this.f = new e(a(com.henninghall.date_picker.g.minutes), parami);
    this.g = new com.henninghall.date_picker.o.a(a(com.henninghall.date_picker.g.ampm), parami);
    this.d = new d(a(com.henninghall.date_picker.g.hour), parami);
    this.b = (d.a.a.a.a.a)paramView.findViewById(com.henninghall.date_picker.g.empty_start);
    this.c = (d.a.a.a.a.a)paramView.findViewById(com.henninghall.date_picker.g.empty_end);
    this.m = m();
    i();
  }
  
  private com.henninghall.date_picker.pickers.a a(int paramInt) {
    return (com.henninghall.date_picker.pickers.a)this.k.findViewById(paramInt);
  }
  
  private void h() {
    Iterator<d> iterator = this.a.o.a().iterator();
    while (iterator.hasNext()) {
      com.henninghall.date_picker.o.g g1 = a(iterator.next());
      this.l.a(g1.d.getView());
    } 
  }
  
  private void i() {
    ((com.henninghall.date_picker.o.g)this.d).d.setOnValueChangeListenerInScrolling(new a(this));
  }
  
  private List<com.henninghall.date_picker.o.g> j() {
    return new ArrayList<com.henninghall.date_picker.o.g>(Arrays.asList(new com.henninghall.date_picker.o.g[] { (com.henninghall.date_picker.o.g)this.j, (com.henninghall.date_picker.o.g)this.i, (com.henninghall.date_picker.o.g)this.h, (com.henninghall.date_picker.o.g)this.e, (com.henninghall.date_picker.o.g)this.d, (com.henninghall.date_picker.o.g)this.f, (com.henninghall.date_picker.o.g)this.g }));
  }
  
  private String k() {
    ArrayList<com.henninghall.date_picker.o.g> arrayList = l();
    if (this.a.l() == com.henninghall.date_picker.k.b.c) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(((com.henninghall.date_picker.o.g)arrayList.get(0)).b());
      stringBuilder.append(" ");
      stringBuilder.append(((com.henninghall.date_picker.o.g)arrayList.get(1)).b());
      stringBuilder.append(" ");
      stringBuilder.append(((com.henninghall.date_picker.o.g)arrayList.get(2)).b());
      return stringBuilder.toString();
    } 
    return this.e.b();
  }
  
  private ArrayList<com.henninghall.date_picker.o.g> l() {
    ArrayList<com.henninghall.date_picker.o.g> arrayList = new ArrayList();
    Iterator<d> iterator = this.a.o.a().iterator();
    while (iterator.hasNext())
      arrayList.add(a(iterator.next())); 
    return arrayList;
  }
  
  private HashMap<d, com.henninghall.date_picker.o.g> m() {
    return new b();
  }
  
  com.henninghall.date_picker.o.g a(d paramd) {
    return this.m.get(paramd);
  }
  
  String a() {
    String str;
    ArrayList<com.henninghall.date_picker.o.g> arrayList = l();
    if (this.a.l() == com.henninghall.date_picker.k.b.c) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(((com.henninghall.date_picker.o.g)arrayList.get(0)).e());
      stringBuilder1.append(" ");
      stringBuilder1.append(((com.henninghall.date_picker.o.g)arrayList.get(1)).e());
      stringBuilder1.append(" ");
      stringBuilder1.append(((com.henninghall.date_picker.o.g)arrayList.get(2)).e());
      str = stringBuilder1.toString();
    } else {
      str = this.e.e();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" ");
    stringBuilder.append(this.d.e());
    stringBuilder.append(" ");
    stringBuilder.append(this.f.e());
    stringBuilder.append(this.g.e());
    return stringBuilder.toString();
  }
  
  void a(j paramj) {
    Iterator<com.henninghall.date_picker.o.g> iterator = j().iterator();
    while (iterator.hasNext())
      paramj.a(iterator.next()); 
  }
  
  String b() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<com.henninghall.date_picker.o.g> iterator = l().iterator();
    while (iterator.hasNext())
      stringBuilder.append(((com.henninghall.date_picker.o.g)iterator.next()).a()); 
    return stringBuilder.toString();
  }
  
  void b(j paramj) {
    for (com.henninghall.date_picker.o.g g1 : j()) {
      if (!g1.j())
        paramj.a(g1); 
    } 
  }
  
  public String c() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(k());
    stringBuilder.append(" ");
    stringBuilder.append(this.d.b());
    stringBuilder.append(" ");
    stringBuilder.append(this.f.b());
    stringBuilder.append(this.g.b());
    return stringBuilder.toString();
  }
  
  void c(j paramj) {
    for (com.henninghall.date_picker.o.g g1 : j()) {
      if (g1.j())
        paramj.a(g1); 
    } 
  }
  
  public boolean d() {
    Iterator<com.henninghall.date_picker.o.g> iterator = j().iterator();
    while (iterator.hasNext()) {
      if (((com.henninghall.date_picker.o.g)iterator.next()).d.a())
        return true; 
    } 
    return false;
  }
  
  void e() {
    int j = this.a.c();
    a((j)new f(j));
    if (this.a.o() == c.c) {
      this.b.setDividerHeight(j);
      this.c.setDividerHeight(j);
    } 
  }
  
  void f() {
    int j = this.a.o.c();
    a((j)new com.henninghall.date_picker.n.g(j));
    if (this.a.o() == c.c) {
      this.b.setShownCount(j);
      this.c.setShownCount(j);
    } 
  }
  
  void g() {
    this.l.a();
    if (this.a.o() == c.c)
      this.l.a((View)this.b); 
    h();
    if (this.a.o() == c.c)
      this.l.a((View)this.c); 
  }
  
  class a implements com.henninghall.date_picker.pickers.a.b {
    a(g this$0) {}
    
    public void a(com.henninghall.date_picker.pickers.a param1a, int param1Int1, int param1Int2) {
      if ((g.a(this.a)).o.g()) {
        String str1 = g.b(this.a).a(param1Int1);
        String str2 = g.b(this.a).a(param1Int2);
        if ((str1.equals("12") && str2.equals("11")) || (str1.equals("11") && str2.equals("12"))) {
          param1Int1 = 1;
        } else {
          param1Int1 = 0;
        } 
        if (param1Int1 != 0)
          ((com.henninghall.date_picker.o.g)g.c(this.a)).d.a((((com.henninghall.date_picker.o.g)g.c(this.a)).d.getValue() + 1) % 2, false); 
      } 
    }
  }
  
  class b extends HashMap<d, com.henninghall.date_picker.o.g> {
    b() {
      put((K)d.c, (V)g.d(g.this));
      put((K)d.f, (V)g.e(g.this));
      put((K)d.e, (V)g.f(g.this));
      put((K)d.d, (V)g.g(g.this));
      put((K)d.g, (V)g.b(g.this));
      put((K)d.h, (V)g.h(g.this));
      put((K)d.i, (V)g.c(g.this));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/m/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */