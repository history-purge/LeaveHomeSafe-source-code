package com.google.firebase.r;

final class c extends g {
  private final String a;
  
  private final String b;
  
  c(String paramString1, String paramString2) {
    if (paramString1 != null) {
      this.a = paramString1;
      if (paramString2 != null) {
        this.b = paramString2;
        return;
      } 
      throw new NullPointerException("Null version");
    } 
    throw new NullPointerException("Null libraryName");
  }
  
  public String a() {
    return this.a;
  }
  
  public String b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof g) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.a()) && this.b.equals(paramObject.b()));
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LibraryVersion{libraryName=");
    stringBuilder.append(this.a);
    stringBuilder.append(", version=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */