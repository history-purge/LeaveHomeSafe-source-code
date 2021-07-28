package net.time4j;

import net.time4j.d1.q;
import net.time4j.d1.v;

final class q<T extends q<T>> implements v<T> {
  private final char c;
  
  private final boolean d;
  
  q(char paramChar, boolean paramBoolean) {
    this.c = paramChar;
    this.d = paramBoolean;
  }
  
  public T a(T paramT) {
    StringBuilder stringBuilder;
    if (this.c == '9')
      return paramT; 
    int j = ((Integer)paramT.e(g0.E)).intValue();
    int m = ((Integer)paramT.b(g0.E)).intValue();
    char c = this.c;
    int i = 0;
    if (c != '3') {
      if (c == '6') {
        int n = j / 1000 * 1000;
        j = n;
        if (this.d) {
          i = 999;
          j = n;
        } 
        return (T)paramT.a(g0.E, Math.min(m, j + i));
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown: ");
      stringBuilder.append(this.c);
      throw new UnsupportedOperationException(stringBuilder.toString());
    } 
    int k = j / 1000000 * 1000000;
    j = k;
    if (this.d) {
      i = 999999;
      j = k;
    } 
    return (T)stringBuilder.a(g0.E, Math.min(m, j + i));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */