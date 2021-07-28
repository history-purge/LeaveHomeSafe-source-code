package e.a.a.j;

import e.a.a.d;
import e.a.a.k.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class m implements Comparable {
  private String c;
  
  private String d;
  
  private m e;
  
  private List f = null;
  
  private List g = null;
  
  private e h = null;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  public m(String paramString, e parame) {
    this(paramString, null, parame);
  }
  
  public m(String paramString1, String paramString2, e parame) {
    this.c = paramString1;
    this.d = paramString2;
    this.h = parame;
  }
  
  private List E() {
    if (this.f == null)
      this.f = new ArrayList(0); 
    return this.f;
  }
  
  private List F() {
    if (this.g == null)
      this.g = new ArrayList(0); 
    return this.g;
  }
  
  private boolean G() {
    return "xml:lang".equals(this.c);
  }
  
  private boolean H() {
    return "rdf:type".equals(this.c);
  }
  
  private m a(List paramList, String paramString) {
    if (paramList != null)
      for (m m1 : paramList) {
        if (m1.q().equals(paramString))
          return m1; 
      }  
    return null;
  }
  
  private void e(String paramString) {
    if (!"[]".equals(paramString)) {
      if (a(paramString) == null)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Duplicate property or field node '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new d(stringBuilder.toString(), 203);
    } 
  }
  
  private void f(String paramString) {
    if (!"[]".equals(paramString)) {
      if (b(paramString) == null)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Duplicate '");
      stringBuilder.append(paramString);
      stringBuilder.append("' qualifier");
      throw new d(stringBuilder.toString(), 203);
    } 
  }
  
  public Iterator A() {
    return (this.f != null) ? E().iterator() : Collections.EMPTY_LIST.listIterator();
  }
  
  public Iterator B() {
    return (this.g != null) ? new a(this, F().iterator()) : Collections.EMPTY_LIST.iterator();
  }
  
  public void C() {
    this.f = null;
  }
  
  public void D() {
    e e1 = r();
    e1.f(false);
    e1.e(false);
    e1.g(false);
    this.g = null;
  }
  
  public m a(String paramString) {
    return a(E(), paramString);
  }
  
  protected void a() {
    if (this.f.isEmpty())
      this.f = null; 
  }
  
  public void a(int paramInt, m paramm) {
    e(paramm.q());
    paramm.f(this);
    E().add(paramInt - 1, paramm);
  }
  
  public void a(m paramm) {
    e(paramm.q());
    paramm.f(this);
    E().add(paramm);
  }
  
  public void a(e parame) {
    this.h = parame;
  }
  
  public void a(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public int b() {
    List list = this.f;
    return (list != null) ? list.size() : 0;
  }
  
  public m b(String paramString) {
    return a(this.g, paramString);
  }
  
  public void b(int paramInt, m paramm) {
    paramm.f(this);
    E().set(paramInt - 1, paramm);
  }
  
  public void b(m paramm) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public void b(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void c(m paramm) {
    try {
      Iterator<m> iterator = A();
      while (iterator.hasNext())
        paramm.a((m)((m)iterator.next()).clone()); 
      iterator = B();
      while (iterator.hasNext())
        paramm.b((m)((m)iterator.next()).clone()); 
      return;
    } catch (d d) {
      return;
    } 
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
  
  public void c(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  public boolean c() {
    return this.j;
  }
  
  public Object clone() {
    e e1;
    try {
      e1 = new e(r().a());
    } catch (d d) {
      e1 = new e();
    } 
    m m1 = new m(this.c, this.d, e1);
    c(m1);
    return m1;
  }
  
  public int compareTo(Object paramObject) {
    if (r().j()) {
      String str4 = this.d;
      String str3 = ((m)paramObject).v();
      paramObject = str4;
      return paramObject.compareTo(str3);
    } 
    String str1 = this.c;
    String str2 = ((m)paramObject).q();
    paramObject = str1;
    str1 = str2;
    return paramObject.compareTo(str1);
  }
  
  public void d(m paramm) {
    E().remove(paramm);
    a();
  }
  
  public void d(String paramString) {
    this.d = paramString;
  }
  
  public void d(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public boolean d() {
    return this.l;
  }
  
  public void e(m paramm) {
    e e1 = r();
    if (paramm.G()) {
      e1.e(false);
    } else if (paramm.H()) {
      e1.g(false);
    } 
    F().remove(paramm);
    if (this.g.isEmpty()) {
      e1.f(false);
      this.g = null;
    } 
  }
  
  public m f(int paramInt) {
    return E().get(paramInt - 1);
  }
  
  protected void f(m paramm) {
    this.e = paramm;
  }
  
  public m g(int paramInt) {
    return F().get(paramInt - 1);
  }
  
  public void h(int paramInt) {
    E().remove(paramInt - 1);
    a();
  }
  
  public String q() {
    return this.c;
  }
  
  public e r() {
    if (this.h == null)
      this.h = new e(); 
    return this.h;
  }
  
  public m s() {
    return this.e;
  }
  
  public int t() {
    List list = this.g;
    return (list != null) ? list.size() : 0;
  }
  
  public List u() {
    return Collections.unmodifiableList(new ArrayList(E()));
  }
  
  public String v() {
    return this.d;
  }
  
  public boolean w() {
    List list = this.f;
    return (list != null && list.size() > 0);
  }
  
  public boolean x() {
    List list = this.g;
    return (list != null && list.size() > 0);
  }
  
  public boolean y() {
    return this.k;
  }
  
  public boolean z() {
    return this.i;
  }
  
  class a implements Iterator {
    a(m this$0, Iterator param1Iterator) {}
    
    public boolean hasNext() {
      return this.c.hasNext();
    }
    
    public Object next() {
      return this.c.next();
    }
    
    public void remove() {
      throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */