package net.time4j.tz;

import java.io.Serializable;

class e implements k, Serializable {
  private static final long serialVersionUID = -4889632013137688471L;
  
  private final String tzid;
  
  e(String paramString) {
    this.tzid = paramString;
  }
  
  public String a() {
    return this.tzid;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof e) {
      paramObject = paramObject;
      return this.tzid.equals(((e)paramObject).tzid);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.tzid.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(e.class.getName());
    stringBuilder.append("@");
    stringBuilder.append(this.tzid);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */