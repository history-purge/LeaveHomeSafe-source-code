package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

final class l extends n.b {
  private final long a;
  
  private final long b;
  
  private final Set<n.c> c;
  
  private l(long paramLong1, long paramLong2, Set<n.c> paramSet) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramSet;
  }
  
  long a() {
    return this.a;
  }
  
  Set<n.c> b() {
    return this.c;
  }
  
  long c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof n.b) {
      paramObject = paramObject;
      return (this.a == paramObject.a() && this.b == paramObject.c() && this.c.equals(paramObject.b()));
    } 
    return false;
  }
  
  public int hashCode() {
    long l1 = this.a;
    int i = (int)(l1 ^ l1 >>> 32L);
    l1 = this.b;
    int j = (int)(l1 ^ l1 >>> 32L);
    return this.c.hashCode() ^ ((i ^ 0xF4243) * 1000003 ^ j) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ConfigValue{delta=");
    stringBuilder.append(this.a);
    stringBuilder.append(", maxAllowedDelay=");
    stringBuilder.append(this.b);
    stringBuilder.append(", flags=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends n.b.a {
    private Long a;
    
    private Long b;
    
    private Set<n.c> c;
    
    public n.b.a a(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public n.b.a a(Set<n.c> param1Set) {
      if (param1Set != null) {
        this.c = param1Set;
        return this;
      } 
      throw new NullPointerException("Null flags");
    }
    
    public n.b a() {
      Long long_ = this.a;
      String str1 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" delta");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" maxAllowedDelay");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" flags");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new l(this.a.longValue(), this.b.longValue(), this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public n.b.a b(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */