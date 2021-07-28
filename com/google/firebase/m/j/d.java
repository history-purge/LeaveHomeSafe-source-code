package com.google.firebase.m.j;

import com.google.firebase.m.c;
import com.google.firebase.m.e;
import com.google.firebase.m.f;
import com.google.firebase.m.g;
import com.google.firebase.m.h;
import com.google.firebase.m.i.b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class d implements b<d> {
  private static final e<Object> e = b.a;
  
  private static final g<String> f = a.a;
  
  private static final g<Boolean> g = c.a;
  
  private static final b h = new b(null);
  
  private final Map<Class<?>, e<?>> a = new HashMap<Class<?>, e<?>>();
  
  private final Map<Class<?>, g<?>> b = new HashMap<Class<?>, g<?>>();
  
  private e<Object> c = e;
  
  private boolean d = false;
  
  public d() {
    a(String.class, f);
    a(Boolean.class, g);
    a(Date.class, h);
  }
  
  public com.google.firebase.m.a a() {
    return new a(this);
  }
  
  public d a(com.google.firebase.m.i.a parama) {
    parama.a(this);
    return this;
  }
  
  public <T> d a(Class<T> paramClass, e<? super T> parame) {
    this.a.put(paramClass, parame);
    this.b.remove(paramClass);
    return this;
  }
  
  public <T> d a(Class<T> paramClass, g<? super T> paramg) {
    this.b.put(paramClass, paramg);
    this.a.remove(paramClass);
    return this;
  }
  
  public d a(boolean paramBoolean) {
    this.d = paramBoolean;
    return this;
  }
  
  class a implements com.google.firebase.m.a {
    a(d this$0) {}
    
    public String a(Object param1Object) {
      StringWriter stringWriter = new StringWriter();
      try {
        a(param1Object, stringWriter);
      } catch (IOException iOException) {}
      return stringWriter.toString();
    }
    
    public void a(Object param1Object, Writer param1Writer) {
      e e = new e(param1Writer, d.a(this.a), d.b(this.a), d.c(this.a), d.d(this.a));
      e.a(param1Object, false);
      e.a();
    }
  }
  
  private static final class b implements g<Date> {
    private static final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    
    static {
      a.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    private b() {}
    
    public void a(Date param1Date, h param1h) {
      param1h.a(a.format(param1Date));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/m/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */