package com.google.firebase.installations.r;

final class a extends d {
  private final String a;
  
  private final c.a b;
  
  private final String c;
  
  private final String d;
  
  private final long e;
  
  private final long f;
  
  private final String g;
  
  private a(String paramString1, c.a parama, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4) {
    this.a = paramString1;
    this.b = parama;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramLong1;
    this.f = paramLong2;
    this.g = paramString4;
  }
  
  public String a() {
    return this.c;
  }
  
  public long b() {
    return this.e;
  }
  
  public String c() {
    return this.a;
  }
  
  public String d() {
    return this.g;
  }
  
  public String e() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
      String str = this.a;
      if (((str == null) ? (paramObject.c() == null) : str.equals(paramObject.c())) && this.b.equals(paramObject.f())) {
        str = this.c;
        if ((str == null) ? (paramObject.a() == null) : str.equals(paramObject.a())) {
          str = this.d;
          if (((str == null) ? (paramObject.e() == null) : str.equals(paramObject.e())) && this.e == paramObject.b() && this.f == paramObject.g()) {
            str = this.g;
            paramObject = paramObject.d();
            if (str == null) {
              if (paramObject == null)
                return true; 
            } else if (str.equals(paramObject)) {
              return true;
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public c.a f() {
    return this.b;
  }
  
  public long g() {
    return this.f;
  }
  
  public int hashCode() {
    int i;
    int j;
    int k;
    String str = this.a;
    int m = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    int n = this.b.hashCode();
    str = this.c;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    str = this.d;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    } 
    long l = this.e;
    int i1 = (int)(l ^ l >>> 32L);
    l = this.f;
    int i2 = (int)(l ^ l >>> 32L);
    str = this.g;
    if (str != null)
      m = str.hashCode(); 
    return ((((((i ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ m;
  }
  
  public d.a m() {
    return new b(this, null);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PersistedInstallationEntry{firebaseInstallationId=");
    stringBuilder.append(this.a);
    stringBuilder.append(", registrationStatus=");
    stringBuilder.append(this.b);
    stringBuilder.append(", authToken=");
    stringBuilder.append(this.c);
    stringBuilder.append(", refreshToken=");
    stringBuilder.append(this.d);
    stringBuilder.append(", expiresInSecs=");
    stringBuilder.append(this.e);
    stringBuilder.append(", tokenCreationEpochInSecs=");
    stringBuilder.append(this.f);
    stringBuilder.append(", fisError=");
    stringBuilder.append(this.g);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends d.a {
    private String a;
    
    private c.a b;
    
    private String c;
    
    private String d;
    
    private Long e;
    
    private Long f;
    
    private String g;
    
    b() {}
    
    private b(d param1d) {
      this.a = param1d.c();
      this.b = param1d.f();
      this.c = param1d.a();
      this.d = param1d.e();
      this.e = Long.valueOf(param1d.b());
      this.f = Long.valueOf(param1d.g());
      this.g = param1d.d();
    }
    
    public d.a a(long param1Long) {
      this.e = Long.valueOf(param1Long);
      return this;
    }
    
    public d.a a(c.a param1a) {
      if (param1a != null) {
        this.b = param1a;
        return this;
      } 
      throw new NullPointerException("Null registrationStatus");
    }
    
    public d.a a(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public d a() {
      c.a a1 = this.b;
      String str1 = "";
      if (a1 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" registrationStatus");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" expiresInSecs");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.f == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" tokenCreationEpochInSecs");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public d.a b(long param1Long) {
      this.f = Long.valueOf(param1Long);
      return this;
    }
    
    public d.a b(String param1String) {
      this.a = param1String;
      return this;
    }
    
    public d.a c(String param1String) {
      this.g = param1String;
      return this;
    }
    
    public d.a d(String param1String) {
      this.d = param1String;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */