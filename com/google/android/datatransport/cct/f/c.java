package com.google.android.datatransport.cct.f;

final class c extends a {
  private final Integer a;
  
  private final String b;
  
  private final String c;
  
  private final String d;
  
  private final String e;
  
  private final String f;
  
  private final String g;
  
  private final String h;
  
  private final String i;
  
  private final String j;
  
  private final String k;
  
  private final String l;
  
  private c(Integer paramInteger, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11) {
    this.a = paramInteger;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramString8;
    this.j = paramString9;
    this.k = paramString10;
    this.l = paramString11;
  }
  
  public String a() {
    return this.l;
  }
  
  public String b() {
    return this.j;
  }
  
  public String c() {
    return this.d;
  }
  
  public String d() {
    return this.h;
  }
  
  public String e() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof a) {
      paramObject = paramObject;
      Integer integer = this.a;
      if ((integer == null) ? (paramObject.l() == null) : integer.equals(paramObject.l())) {
        String str = this.b;
        if ((str == null) ? (paramObject.i() == null) : str.equals(paramObject.i())) {
          str = this.c;
          if ((str == null) ? (paramObject.e() == null) : str.equals(paramObject.e())) {
            str = this.d;
            if ((str == null) ? (paramObject.c() == null) : str.equals(paramObject.c())) {
              str = this.e;
              if ((str == null) ? (paramObject.k() == null) : str.equals(paramObject.k())) {
                str = this.f;
                if ((str == null) ? (paramObject.j() == null) : str.equals(paramObject.j())) {
                  str = this.g;
                  if ((str == null) ? (paramObject.g() == null) : str.equals(paramObject.g())) {
                    str = this.h;
                    if ((str == null) ? (paramObject.d() == null) : str.equals(paramObject.d())) {
                      str = this.i;
                      if ((str == null) ? (paramObject.f() == null) : str.equals(paramObject.f())) {
                        str = this.j;
                        if ((str == null) ? (paramObject.b() == null) : str.equals(paramObject.b())) {
                          str = this.k;
                          if ((str == null) ? (paramObject.h() == null) : str.equals(paramObject.h())) {
                            str = this.l;
                            paramObject = paramObject.a();
                            if (str == null) {
                              if (paramObject == null)
                                return true; 
                            } else if (str.equals(paramObject)) {
                              return true;
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public String f() {
    return this.i;
  }
  
  public String g() {
    return this.g;
  }
  
  public String h() {
    return this.k;
  }
  
  public int hashCode() {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    Integer integer = this.a;
    int i7 = 0;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    String str = this.b;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    str = this.c;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    } 
    str = this.d;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    } 
    str = this.e;
    if (str == null) {
      n = 0;
    } else {
      n = str.hashCode();
    } 
    str = this.f;
    if (str == null) {
      i1 = 0;
    } else {
      i1 = str.hashCode();
    } 
    str = this.g;
    if (str == null) {
      i2 = 0;
    } else {
      i2 = str.hashCode();
    } 
    str = this.h;
    if (str == null) {
      i3 = 0;
    } else {
      i3 = str.hashCode();
    } 
    str = this.i;
    if (str == null) {
      i4 = 0;
    } else {
      i4 = str.hashCode();
    } 
    str = this.j;
    if (str == null) {
      i5 = 0;
    } else {
      i5 = str.hashCode();
    } 
    str = this.k;
    if (str == null) {
      i6 = 0;
    } else {
      i6 = str.hashCode();
    } 
    str = this.l;
    if (str != null)
      i7 = str.hashCode(); 
    return (((((((((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7;
  }
  
  public String i() {
    return this.b;
  }
  
  public String j() {
    return this.f;
  }
  
  public String k() {
    return this.e;
  }
  
  public Integer l() {
    return this.a;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AndroidClientInfo{sdkVersion=");
    stringBuilder.append(this.a);
    stringBuilder.append(", model=");
    stringBuilder.append(this.b);
    stringBuilder.append(", hardware=");
    stringBuilder.append(this.c);
    stringBuilder.append(", device=");
    stringBuilder.append(this.d);
    stringBuilder.append(", product=");
    stringBuilder.append(this.e);
    stringBuilder.append(", osBuild=");
    stringBuilder.append(this.f);
    stringBuilder.append(", manufacturer=");
    stringBuilder.append(this.g);
    stringBuilder.append(", fingerprint=");
    stringBuilder.append(this.h);
    stringBuilder.append(", locale=");
    stringBuilder.append(this.i);
    stringBuilder.append(", country=");
    stringBuilder.append(this.j);
    stringBuilder.append(", mccMnc=");
    stringBuilder.append(this.k);
    stringBuilder.append(", applicationBuild=");
    stringBuilder.append(this.l);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends a.a {
    private Integer a;
    
    private String b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    private String f;
    
    private String g;
    
    private String h;
    
    private String i;
    
    private String j;
    
    private String k;
    
    private String l;
    
    public a.a a(Integer param1Integer) {
      this.a = param1Integer;
      return this;
    }
    
    public a.a a(String param1String) {
      this.l = param1String;
      return this;
    }
    
    public a a() {
      return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
    }
    
    public a.a b(String param1String) {
      this.j = param1String;
      return this;
    }
    
    public a.a c(String param1String) {
      this.d = param1String;
      return this;
    }
    
    public a.a d(String param1String) {
      this.h = param1String;
      return this;
    }
    
    public a.a e(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public a.a f(String param1String) {
      this.i = param1String;
      return this;
    }
    
    public a.a g(String param1String) {
      this.g = param1String;
      return this;
    }
    
    public a.a h(String param1String) {
      this.k = param1String;
      return this;
    }
    
    public a.a i(String param1String) {
      this.b = param1String;
      return this;
    }
    
    public a.a j(String param1String) {
      this.f = param1String;
      return this;
    }
    
    public a.a k(String param1String) {
      this.e = param1String;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */