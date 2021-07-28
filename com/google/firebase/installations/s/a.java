package com.google.firebase.installations.s;

final class a extends d {
  private final String a;
  
  private final String b;
  
  private final String c;
  
  private final f d;
  
  private final d.b e;
  
  private a(String paramString1, String paramString2, String paramString3, f paramf, d.b paramb) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramf;
    this.e = paramb;
  }
  
  public f a() {
    return this.d;
  }
  
  public String b() {
    return this.b;
  }
  
  public String c() {
    return this.c;
  }
  
  public d.b d() {
    return this.e;
  }
  
  public String e() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
      String str = this.a;
      if ((str == null) ? (paramObject.e() == null) : str.equals(paramObject.e())) {
        str = this.b;
        if ((str == null) ? (paramObject.b() == null) : str.equals(paramObject.b())) {
          str = this.c;
          if ((str == null) ? (paramObject.c() == null) : str.equals(paramObject.c())) {
            f f1 = this.d;
            if ((f1 == null) ? (paramObject.a() == null) : f1.equals(paramObject.a())) {
              d.b b1 = this.e;
              paramObject = paramObject.d();
              if (b1 == null) {
                if (paramObject == null)
                  return true; 
              } else if (b1.equals(paramObject)) {
                return true;
              } 
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    int j;
    int k;
    int m;
    String str = this.a;
    int n = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    str = this.b;
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
    f f1 = this.d;
    if (f1 == null) {
      m = 0;
    } else {
      m = f1.hashCode();
    } 
    d.b b1 = this.e;
    if (b1 != null)
      n = b1.hashCode(); 
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("InstallationResponse{uri=");
    stringBuilder.append(this.a);
    stringBuilder.append(", fid=");
    stringBuilder.append(this.b);
    stringBuilder.append(", refreshToken=");
    stringBuilder.append(this.c);
    stringBuilder.append(", authToken=");
    stringBuilder.append(this.d);
    stringBuilder.append(", responseCode=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends d.a {
    private String a;
    
    private String b;
    
    private String c;
    
    private f d;
    
    private d.b e;
    
    public d.a a(d.b param1b) {
      this.e = param1b;
      return this;
    }
    
    public d.a a(f param1f) {
      this.d = param1f;
      return this;
    }
    
    public d.a a(String param1String) {
      this.b = param1String;
      return this;
    }
    
    public d a() {
      return new a(this.a, this.b, this.c, this.d, this.e, null);
    }
    
    public d.a b(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public d.a c(String param1String) {
      this.a = param1String;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */