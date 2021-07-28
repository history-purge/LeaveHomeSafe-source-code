package com.google.firebase.installations.s;

final class b extends f {
  private final String a;
  
  private final long b;
  
  private final f.b c;
  
  private b(String paramString, long paramLong, f.b paramb) {
    this.a = paramString;
    this.b = paramLong;
    this.c = paramb;
  }
  
  public f.b a() {
    return this.c;
  }
  
  public String b() {
    return this.a;
  }
  
  public long c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      String str = this.a;
      if (((str == null) ? (paramObject.b() == null) : str.equals(paramObject.b())) && this.b == paramObject.c()) {
        f.b b1 = this.c;
        paramObject = paramObject.a();
        if (b1 == null) {
          if (paramObject == null)
            return true; 
        } else if (b1.equals(paramObject)) {
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    String str = this.a;
    int j = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    long l = this.b;
    int k = (int)(l ^ l >>> 32L);
    f.b b1 = this.c;
    if (b1 != null)
      j = b1.hashCode(); 
    return ((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TokenResult{token=");
    stringBuilder.append(this.a);
    stringBuilder.append(", tokenExpirationTimestamp=");
    stringBuilder.append(this.b);
    stringBuilder.append(", responseCode=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends f.a {
    private String a;
    
    private Long b;
    
    private f.b c;
    
    public f.a a(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
    
    public f.a a(f.b param1b) {
      this.c = param1b;
      return this;
    }
    
    public f.a a(String param1String) {
      this.a = param1String;
      return this;
    }
    
    public f a() {
      Long long_ = this.b;
      String str = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" tokenExpirationTimestamp");
        str = stringBuilder1.toString();
      } 
      if (str.isEmpty())
        return new b(this.a, this.b.longValue(), this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */