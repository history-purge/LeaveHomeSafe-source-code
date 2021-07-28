package e.f.a.c.i;

import e.f.a.c.e;

final class c extends m {
  private final n a;
  
  private final String b;
  
  private final e.f.a.c.c<?> c;
  
  private final e<?, byte[]> d;
  
  private final e.f.a.c.b e;
  
  private c(n paramn, String paramString, e.f.a.c.c<?> paramc, e<?, byte[]> parame, e.f.a.c.b paramb) {
    this.a = paramn;
    this.b = paramString;
    this.c = paramc;
    this.d = parame;
    this.e = paramb;
  }
  
  public e.f.a.c.b a() {
    return this.e;
  }
  
  e.f.a.c.c<?> b() {
    return this.c;
  }
  
  e<?, byte[]> d() {
    return this.d;
  }
  
  public n e() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof m) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.e()) && this.b.equals(paramObject.f()) && this.c.equals(paramObject.b()) && this.d.equals(paramObject.d()) && this.e.equals(paramObject.a()));
    } 
    return false;
  }
  
  public String f() {
    return this.b;
  }
  
  public int hashCode() {
    return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SendRequest{transportContext=");
    stringBuilder.append(this.a);
    stringBuilder.append(", transportName=");
    stringBuilder.append(this.b);
    stringBuilder.append(", event=");
    stringBuilder.append(this.c);
    stringBuilder.append(", transformer=");
    stringBuilder.append(this.d);
    stringBuilder.append(", encoding=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends m.a {
    private n a;
    
    private String b;
    
    private e.f.a.c.c<?> c;
    
    private e<?, byte[]> d;
    
    private e.f.a.c.b e;
    
    m.a a(e.f.a.c.b param1b) {
      if (param1b != null) {
        this.e = param1b;
        return this;
      } 
      throw new NullPointerException("Null encoding");
    }
    
    m.a a(e.f.a.c.c<?> param1c) {
      if (param1c != null) {
        this.c = param1c;
        return this;
      } 
      throw new NullPointerException("Null event");
    }
    
    m.a a(e<?, byte[]> param1e) {
      if (param1e != null) {
        this.d = param1e;
        return this;
      } 
      throw new NullPointerException("Null transformer");
    }
    
    public m.a a(n param1n) {
      if (param1n != null) {
        this.a = param1n;
        return this;
      } 
      throw new NullPointerException("Null transportContext");
    }
    
    public m.a a(String param1String) {
      if (param1String != null) {
        this.b = param1String;
        return this;
      } 
      throw new NullPointerException("Null transportName");
    }
    
    public m a() {
      n n1 = this.a;
      String str1 = "";
      if (n1 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" transportContext");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" transportName");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" event");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.d == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" transformer");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" encoding");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new c(this.a, this.b, this.c, this.d, this.e, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */