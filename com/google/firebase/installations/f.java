package com.google.firebase.installations;

final class f extends m {
  private final String a;
  
  private final long b;
  
  private final long c;
  
  private f(String paramString, long paramLong1, long paramLong2) {
    this.a = paramString;
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public String a() {
    return this.a;
  }
  
  public long b() {
    return this.c;
  }
  
  public long c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof m) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.a()) && this.b == paramObject.c() && this.c == paramObject.b());
    } 
    return false;
  }
  
  public int hashCode() {
    int i = this.a.hashCode();
    long l = this.b;
    int j = (int)(l ^ l >>> 32L);
    l = this.c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("InstallationTokenResult{token=");
    stringBuilder.append(this.a);
    stringBuilder.append(", tokenExpirationTimestamp=");
    stringBuilder.append(this.b);
    stringBuilder.append(", tokenCreationTimestamp=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends m.a {
    private String a;
    
    private Long b;
    
    private Long c;
    
    public m.a a(long param1Long) {
      this.c = Long.valueOf(param1Long);
      return this;
    }
    
    public m.a a(String param1String) {
      if (param1String != null) {
        this.a = param1String;
        return this;
      } 
      throw new NullPointerException("Null token");
    }
    
    public m a() {
      String str2 = this.a;
      String str1 = "";
      if (str2 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" token");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" tokenExpirationTimestamp");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" tokenCreationTimestamp");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new f(this.a, this.b.longValue(), this.c.longValue(), null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public m.a b(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */