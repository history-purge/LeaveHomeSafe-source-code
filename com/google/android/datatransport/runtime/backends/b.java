package com.google.android.datatransport.runtime.backends;

final class b extends g {
  private final g.a a;
  
  private final long b;
  
  b(g.a parama, long paramLong) {
    if (parama != null) {
      this.a = parama;
      this.b = paramLong;
      return;
    } 
    throw new NullPointerException("Null status");
  }
  
  public long a() {
    return this.b;
  }
  
  public g.a b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof g) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.b()) && this.b == paramObject.a());
    } 
    return false;
  }
  
  public int hashCode() {
    int i = this.a.hashCode();
    long l = this.b;
    return (i ^ 0xF4243) * 1000003 ^ (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("BackendResponse{status=");
    stringBuilder.append(this.a);
    stringBuilder.append(", nextRequestWaitMillis=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/backends/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */