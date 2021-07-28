package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.f.a.c.d;
import e.f.a.c.i.z.a;
import java.util.Map;

final class k extends n {
  private final a a;
  
  private final Map<d, n.b> b;
  
  k(a parama, Map<d, n.b> paramMap) {
    if (parama != null) {
      this.a = parama;
      if (paramMap != null) {
        this.b = paramMap;
        return;
      } 
      throw new NullPointerException("Null values");
    } 
    throw new NullPointerException("Null clock");
  }
  
  a a() {
    return this.a;
  }
  
  Map<d, n.b> b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof n) {
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
    stringBuilder.append("SchedulerConfig{clock=");
    stringBuilder.append(this.a);
    stringBuilder.append(", values=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */