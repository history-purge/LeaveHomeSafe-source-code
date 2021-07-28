package net.time4j.tz.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import net.time4j.c1.a;
import net.time4j.c1.f;
import net.time4j.c1.g;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

final class e implements m, Serializable {
  private static final long serialVersionUID = 1374714021808040253L;
  
  private final p offset;
  
  e(p paramp) {
    this.offset = paramp;
  }
  
  public List<p> a(a parama, g paramg) {
    return Collections.singletonList(this.offset);
  }
  
  public q a(f paramf) {
    return null;
  }
  
  public boolean a() {
    return false;
  }
  
  public p b() {
    return this.offset;
  }
  
  public q b(a parama, g paramg) {
    return null;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof e) {
      paramObject = paramObject;
      return this.offset.equals(((e)paramObject).offset);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.offset.hashCode();
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EmptyTransitionModel=");
    stringBuilder.append(this.offset.a());
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */