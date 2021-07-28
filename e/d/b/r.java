package e.d.b;

import java.util.Iterator;

public final class r {
  public static String a(Iterable<? extends CharSequence> paramIterable, String paramString) {
    int j = paramString.length();
    Iterator<? extends CharSequence> iterator2 = paramIterable.iterator();
    boolean bool = iterator2.hasNext();
    int i = 0;
    if (bool)
      i = 0 + ((CharSequence)iterator2.next()).length() + j; 
    StringBuilder stringBuilder = new StringBuilder(i);
    Iterator<? extends CharSequence> iterator1 = paramIterable.iterator();
    if (iterator1.hasNext())
      while (true) {
        stringBuilder.append(iterator1.next());
        if (iterator1.hasNext()) {
          stringBuilder.append(paramString);
          continue;
        } 
        break;
      }  
    return stringBuilder.toString();
  }
  
  public static <T extends CharSequence> String a(T[] paramArrayOfT, String paramString) {
    int k = paramString.length();
    int m = paramArrayOfT.length;
    int i = 0;
    int j = 0;
    while (i < m) {
      j += paramArrayOfT[i].length() + k;
      i++;
    } 
    StringBuilder stringBuilder = new StringBuilder(j);
    k = paramArrayOfT.length;
    i = 0;
    j = 1;
    while (i < k) {
      T t = paramArrayOfT[i];
      if (j == 0) {
        stringBuilder.append(paramString);
      } else {
        j = 0;
      } 
      stringBuilder.append((CharSequence)t);
      i++;
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */