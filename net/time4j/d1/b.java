package net.time4j.d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class b<U extends w, P extends a<U>> implements k0<U, P>, Comparator<U> {
  protected b(boolean paramBoolean, U... paramVarArgs) {
    if (paramVarArgs.length != 0) {
      ArrayList<? super U> arrayList = new ArrayList(paramVarArgs.length);
      Collections.addAll(arrayList, paramVarArgs);
      Collections.sort(arrayList, this);
      int i = 0;
      int j = arrayList.size();
      while (i < j) {
        int k = i + 1;
        int m = k;
        while (m < j) {
          if (!((w)arrayList.get(i)).equals(arrayList.get(m))) {
            m++;
            continue;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Duplicate unit: ");
          stringBuilder.append(arrayList.get(i));
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        i = k;
      } 
      Collections.unmodifiableList((List)arrayList);
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing units.");
    throw illegalArgumentException;
  }
  
  public int a(U paramU1, U paramU2) {
    return Double.compare(paramU2.b(), paramU1.b());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */