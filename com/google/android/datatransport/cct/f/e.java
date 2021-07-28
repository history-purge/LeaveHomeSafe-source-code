package com.google.android.datatransport.cct.f;

final class e extends k {
  private final k.b a;
  
  private final a b;
  
  private e(k.b paramb, a parama) {
    this.a = paramb;
    this.b = parama;
  }
  
  public a a() {
    return this.b;
  }
  
  public k.b b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof k) {
      paramObject = paramObject;
      k.b b1 = this.a;
      if ((b1 == null) ? (paramObject.b() == null) : b1.equals(paramObject.b())) {
        a a1 = this.b;
        paramObject = paramObject.a();
        if (a1 == null) {
          if (paramObject == null)
            return true; 
        } else if (a1.equals(paramObject)) {
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    k.b b1 = this.a;
    int j = 0;
    if (b1 == null) {
      i = 0;
    } else {
      i = b1.hashCode();
    } 
    a a1 = this.b;
    if (a1 != null)
      j = a1.hashCode(); 
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ClientInfo{clientType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", androidClientInfo=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends k.a {
    private k.b a;
    
    private a b;
    
    public k.a a(a param1a) {
      this.b = param1a;
      return this;
    }
    
    public k.a a(k.b param1b) {
      this.a = param1b;
      return this;
    }
    
    public k a() {
      return new e(this.a, this.b, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */