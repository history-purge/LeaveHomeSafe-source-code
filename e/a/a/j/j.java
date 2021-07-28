package e.a.a.j;

import e.a.a.d;
import e.a.a.e;
import e.a.a.j.q.b;
import e.a.a.j.q.c;
import e.a.a.k.e;
import e.a.a.l.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class j implements e {
  private e.a.a.k.b c;
  
  private String d;
  
  protected boolean e;
  
  private Iterator f;
  
  public j(k paramk, String paramString1, String paramString2, e.a.a.k.b paramb) {
    m m;
    d d;
    int i;
    boolean bool;
    String str = null;
    this.d = null;
    this.e = false;
    this.f = null;
    if (paramb == null)
      paramb = new e.a.a.k.b(); 
    this.c = paramb;
    if (paramString1 != null && paramString1.length() > 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (paramString2 != null && paramString2.length() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!i && !bool) {
      m = paramk.a();
      paramString1 = str;
    } else if (i && bool) {
      b b2 = c.a(paramString1, paramString2);
      b b1 = new b();
      for (i = 0; i < b2.a() - 1; i++)
        b1.a(b2.a(i)); 
      m = n.a(m.a(), b2, false, (e)null);
      this.d = paramString1;
      paramString1 = b1.toString();
    } else if (i != 0 && !bool) {
      m = n.d(m.a(), paramString1, false);
      paramString1 = str;
    } else {
      d = new d("Schema namespace URI is required", 101);
      throw d;
    } 
    if (d != null) {
      a a;
      if (!this.c.c()) {
        a = new a(this, (m)d, paramString1, 1);
      } else {
        a = new b(this, (m)a, paramString1);
      } 
      this.f = a;
      return;
    } 
    this.f = Collections.EMPTY_LIST.iterator();
  }
  
  protected String a() {
    return this.d;
  }
  
  protected void a(String paramString) {
    this.d = paramString;
  }
  
  protected e.a.a.k.b b() {
    return this.c;
  }
  
  public boolean hasNext() {
    return this.f.hasNext();
  }
  
  public Object next() {
    return this.f.next();
  }
  
  public void remove() {
    throw new UnsupportedOperationException("The XMPIterator does not support remove().");
  }
  
  private class a implements Iterator {
    private int c = 0;
    
    private m d;
    
    private String e;
    
    private Iterator f = null;
    
    private int g = 0;
    
    private Iterator h = Collections.EMPTY_LIST.iterator();
    
    private c i = null;
    
    public a(j this$0) {}
    
    public a(j this$0, m param1m, String param1String, int param1Int) {
      this.d = param1m;
      this.c = 0;
      if (param1m.r().j())
        this$0.a(param1m.q()); 
      this.e = a(param1m, param1String, param1Int);
    }
    
    private boolean a(Iterator<m> param1Iterator) {
      j j1 = this.j;
      if (j1.e) {
        j1.e = false;
        this.h = Collections.EMPTY_LIST.iterator();
      } 
      if (!this.h.hasNext() && param1Iterator.hasNext()) {
        m m1 = param1Iterator.next();
        this.g++;
        this.h = new a(this.j, m1, this.e, this.g);
      } 
      if (this.h.hasNext()) {
        this.i = this.h.next();
        return true;
      } 
      return false;
    }
    
    protected c a() {
      return this.i;
    }
    
    protected c a(m param1m, String param1String1, String param1String2) {
      String str;
      if (param1m.r().j()) {
        str = null;
      } else {
        str = param1m.v();
      } 
      return new a(this, param1m, param1String1, param1String2, str);
    }
    
    protected String a(m param1m, String param1String, int param1Int) {
      String str1;
      String str2;
      if (param1m.s() == null || param1m.r().j())
        return null; 
      if (param1m.s().r().d()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(String.valueOf(param1Int));
        stringBuilder.append("]");
        str1 = stringBuilder.toString();
        str2 = "";
      } else {
        str1 = str1.q();
        str2 = "/";
      } 
      String str3 = str1;
      if (param1String != null) {
        if (param1String.length() == 0)
          return str1; 
        if (this.j.b().d())
          return !str1.startsWith("?") ? str1 : str1.substring(1); 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append(str2);
        stringBuilder.append(str1);
        str3 = stringBuilder.toString();
      } 
      return str3;
    }
    
    protected void a(c param1c) {
      this.i = param1c;
    }
    
    protected boolean b() {
      this.c = 1;
      if (this.d.s() != null && (!this.j.b().e() || !this.d.w())) {
        this.i = a(this.d, this.j.a(), this.e);
        return true;
      } 
      return hasNext();
    }
    
    public boolean hasNext() {
      if (this.i != null)
        return true; 
      int i = this.c;
      if (i == 0)
        return b(); 
      if (i == 1) {
        if (this.f == null)
          this.f = this.d.A(); 
        boolean bool2 = a(this.f);
        boolean bool1 = bool2;
        if (!bool2) {
          bool1 = bool2;
          if (this.d.x()) {
            bool1 = bool2;
            if (!this.j.b().f()) {
              this.c = 2;
              this.f = null;
              bool1 = hasNext();
            } 
          } 
        } 
        return bool1;
      } 
      if (this.f == null)
        this.f = this.d.B(); 
      return a(this.f);
    }
    
    public Object next() {
      if (hasNext()) {
        c c1 = this.i;
        this.i = null;
        return c1;
      } 
      throw new NoSuchElementException("There are no more nodes to return");
    }
    
    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    class a implements c {
      a(j.a this$0, m param2m, String param2String1, String param2String2, String param2String3) {}
      
      public String a() {
        return this.a;
      }
      
      public String getValue() {
        return this.b;
      }
    }
  }
  
  class a implements c {
    a(j this$0, m param1m, String param1String1, String param1String2, String param1String3) {}
    
    public String a() {
      return this.a;
    }
    
    public String getValue() {
      return this.b;
    }
  }
  
  private class b extends a {
    private String k;
    
    private Iterator l;
    
    private int m = 0;
    
    public b(j this$0, m param1m, String param1String) {
      super(this$0);
      if (param1m.r().j())
        this$0.a(param1m.q()); 
      this.k = a(param1m, param1String, 1);
      this.l = param1m.A();
    }
    
    public boolean hasNext() {
      if (a() != null)
        return true; 
      if (this.n.e)
        return false; 
      if (this.l.hasNext()) {
        m m = this.l.next();
        this.m++;
        String str = null;
        if (m.r().j()) {
          this.n.a(m.q());
        } else if (m.s() != null) {
          str = a(m, this.k, this.m);
        } 
        if (!this.n.b().e() || !m.w()) {
          a(a(m, this.n.a(), str));
          return true;
        } 
        return hasNext();
      } 
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */