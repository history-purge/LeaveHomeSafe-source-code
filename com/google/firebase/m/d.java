package com.google.firebase.m;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {
  private final String a;
  
  private final Map<Class<?>, Object> b;
  
  private d(String paramString, Map<Class<?>, Object> paramMap) {
    this.a = paramString;
    this.b = paramMap;
  }
  
  public static b a(String paramString) {
    return new b(paramString);
  }
  
  public static d b(String paramString) {
    return new d(paramString, Collections.emptyMap());
  }
  
  public String a() {
    return this.a;
  }
  
  public <T extends java.lang.annotation.Annotation> T a(Class<T> paramClass) {
    return (T)this.b.get(paramClass);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof d))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(((d)paramObject).a) && this.b.equals(((d)paramObject).b));
  }
  
  public int hashCode() {
    return this.a.hashCode() * 31 + this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FieldDescriptor{name=");
    stringBuilder.append(this.a);
    stringBuilder.append(", properties=");
    stringBuilder.append(this.b.values());
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public static final class b {
    private final String a;
    
    private Map<Class<?>, Object> b = null;
    
    b(String param1String) {
      this.a = param1String;
    }
    
    public <T extends java.lang.annotation.Annotation> b a(T param1T) {
      if (this.b == null)
        this.b = new HashMap<Class<?>, Object>(); 
      this.b.put(param1T.annotationType(), param1T);
      return this;
    }
    
    public d a() {
      String str = this.a;
      Map<Class<?>, Object> map = this.b;
      if (map == null) {
        map = Collections.emptyMap();
      } else {
        map = Collections.unmodifiableMap(new HashMap<Class<?>, Object>(map));
      } 
      return new d(str, map, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */