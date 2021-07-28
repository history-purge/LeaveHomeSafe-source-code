package net.time4j.d1;

import java.io.Serializable;
import net.time4j.c1.f;

public abstract class e<V extends Comparable<V>> implements p<V>, Serializable {
  private final int hash;
  
  private final int identity;
  
  private final String name;
  
  protected e(String paramString) {
    if (!paramString.trim().isEmpty()) {
      this.name = paramString;
      this.hash = paramString.hashCode();
      boolean bool = g();
      int i = -1;
      if (bool) {
        i = this.hash;
        if (i == -1)
          i ^= 0xFFFFFFFF; 
      } 
      this.identity = i;
      return;
    } 
    throw new IllegalArgumentException("Element name is empty or contains only white space.");
  }
  
  public char a() {
    return Character.MIN_VALUE;
  }
  
  public int a(o paramo1, o paramo2) {
    return ((Comparable)paramo1.<Comparable>e(this)).compareTo(paramo2.e(this));
  }
  
  protected <T extends q<T>> z<T, V> a(x<T> paramx) {
    return null;
  }
  
  protected boolean a(e<?> parame) {
    return true;
  }
  
  protected String b(x<?> paramx) {
    if (f() && f.class.isAssignableFrom(paramx.e())) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Accessing the local element [");
      stringBuilder.append(this.name);
      stringBuilder.append("] from a global type requires a timezone.\n");
      stringBuilder.append("- Try to apply a zonal query like \"");
      stringBuilder.append(this.name);
      stringBuilder.append(".atUTC()\".\n");
      stringBuilder.append("- Or try to first convert the global type to ");
      stringBuilder.append("a zonal timestamp: ");
      stringBuilder.append("\"moment.toZonalTimestamp(...)\".\n");
      stringBuilder.append("- If used in formatting then consider ");
      stringBuilder.append("\"ChronoFormatter.withTimezone(TZID)\".");
      return stringBuilder.toString();
    } 
    return null;
  }
  
  public boolean c() {
    return false;
  }
  
  protected p<?> e() {
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() == paramObject.getClass()) {
      paramObject = paramObject;
      int i = this.identity;
      if (i == ((e)paramObject).identity)
        if (i == -1) {
          if (name().equals(paramObject.name()) && a((e<?>)paramObject))
            return true; 
        } else {
          return bool;
        }  
      return false;
    } 
    return false;
  }
  
  public boolean f() {
    return true;
  }
  
  protected boolean g() {
    return false;
  }
  
  public final int hashCode() {
    return this.hash;
  }
  
  public final String name() {
    return this.name;
  }
  
  public String toString() {
    String str = getClass().getName();
    StringBuilder stringBuilder = new StringBuilder(str.length() + 32);
    stringBuilder.append(str);
    stringBuilder.append('@');
    stringBuilder.append(this.name);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */