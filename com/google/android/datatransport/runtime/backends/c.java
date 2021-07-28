package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import e.f.a.c.i.z.a;

final class c extends h {
  private final Context a;
  
  private final a b;
  
  private final a c;
  
  private final String d;
  
  c(Context paramContext, a parama1, a parama2, String paramString) {
    if (paramContext != null) {
      this.a = paramContext;
      if (parama1 != null) {
        this.b = parama1;
        if (parama2 != null) {
          this.c = parama2;
          if (paramString != null) {
            this.d = paramString;
            return;
          } 
          throw new NullPointerException("Null backendName");
        } 
        throw new NullPointerException("Null monotonicClock");
      } 
      throw new NullPointerException("Null wallClock");
    } 
    throw new NullPointerException("Null applicationContext");
  }
  
  public Context a() {
    return this.a;
  }
  
  public String b() {
    return this.d;
  }
  
  public a c() {
    return this.c;
  }
  
  public a d() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof h) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.a()) && this.b.equals(paramObject.d()) && this.c.equals(paramObject.c()) && this.d.equals(paramObject.b()));
    } 
    return false;
  }
  
  public int hashCode() {
    return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CreationContext{applicationContext=");
    stringBuilder.append(this.a);
    stringBuilder.append(", wallClock=");
    stringBuilder.append(this.b);
    stringBuilder.append(", monotonicClock=");
    stringBuilder.append(this.c);
    stringBuilder.append(", backendName=");
    stringBuilder.append(this.d);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/backends/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */