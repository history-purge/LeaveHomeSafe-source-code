package net.time4j.e1;

import net.time4j.d1.c;

final class q<A> implements c<A> {
  private final String a;
  
  private final Class<A> b;
  
  private q(String paramString, Class<A> paramClass) {
    if (paramString != null) {
      if (paramClass != null) {
        this.a = paramString;
        this.b = paramClass;
        return;
      } 
      throw new NullPointerException("Missing type of attribute.");
    } 
    throw new NullPointerException("Missing name of attribute key.");
  }
  
  static <A> q<A> a(String paramString, Class<A> paramClass) {
    return new q<A>(paramString, paramClass);
  }
  
  public Class<A> a() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof q) {
      paramObject = paramObject;
      return (this.a.equals(((q)paramObject).a) && this.b.equals(((q)paramObject).b));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String name() {
    return this.a;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.getName());
    stringBuilder.append("@");
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */