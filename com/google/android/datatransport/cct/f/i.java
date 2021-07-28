package com.google.android.datatransport.cct.f;

final class i extends o {
  private final o.c a;
  
  private final o.b b;
  
  private i(o.c paramc, o.b paramb) {
    this.a = paramc;
    this.b = paramb;
  }
  
  public o.b a() {
    return this.b;
  }
  
  public o.c b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof o) {
      paramObject = paramObject;
      o.c c1 = this.a;
      if ((c1 == null) ? (paramObject.b() == null) : c1.equals(paramObject.b())) {
        o.b b1 = this.b;
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
    int j;
    o.c c1 = this.a;
    int k = 0;
    if (c1 == null) {
      j = 0;
    } else {
      j = c1.hashCode();
    } 
    o.b b1 = this.b;
    if (b1 != null)
      k = b1.hashCode(); 
    return (j ^ 0xF4243) * 1000003 ^ k;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NetworkConnectionInfo{networkType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mobileSubtype=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends o.a {
    private o.c a;
    
    private o.b b;
    
    public o.a a(o.b param1b) {
      this.b = param1b;
      return this;
    }
    
    public o.a a(o.c param1c) {
      this.a = param1c;
      return this;
    }
    
    public o a() {
      return new i(this.a, this.b, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */