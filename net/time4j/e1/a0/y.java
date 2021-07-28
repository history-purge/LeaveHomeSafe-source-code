package net.time4j.e1.a0;

import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.n;
import net.time4j.d1.o;
import net.time4j.d1.p;

final class y implements h<Void> {
  private final int c;
  
  private final n<Character> d;
  
  y(n<Character> paramn, int paramInt) {
    if (paramn != null) {
      if (paramInt >= 1) {
        this.d = paramn;
        this.c = paramInt;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Must be positive: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing condition for unparseable chars.");
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    return 0;
  }
  
  public h<Void> a(p<Void> paramp) {
    return this;
  }
  
  public h<Void> a(c<?> paramc, d paramd, int paramInt) {
    return this;
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    int j = params.f();
    int k = paramCharSequence.length();
    if (this.d == null) {
      i = k - this.c;
    } else {
      i = j;
      int m = 0;
      while (m < this.c) {
        int i1 = m + j;
        if (i1 < k && this.d.b(Character.valueOf(paramCharSequence.charAt(i1)))) {
          i++;
          m++;
        } 
      } 
    } 
    int i = Math.min(Math.max(i, 0), k);
    if (i > j)
      params.a(i); 
  }
  
  public boolean a() {
    return false;
  }
  
  public p<Void> b() {
    return null;
  }
  
  public boolean equals(Object<Character> paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof y) {
      y y1 = (y)paramObject;
      if (this.c == y1.c) {
        paramObject = (Object<Character>)this.d;
        n<Character> n1 = y1.d;
        if (paramObject == null) {
          if (n1 == null)
            return true; 
        } else if (paramObject.equals(n1)) {
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    n<Character> n1 = this.d;
    if (n1 == null)
      return this.c; 
    int i = this.c;
    return n1.hashCode() ^ i ^ 0xFFFFFFFF;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(y.class.getName());
    if (this.d == null) {
      str = "[keepRemainingChars=";
    } else {
      stringBuilder.append("[condition=");
      stringBuilder.append(this.d);
      str = ", maxIterations=";
    } 
    stringBuilder.append(str);
    stringBuilder.append(this.c);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */