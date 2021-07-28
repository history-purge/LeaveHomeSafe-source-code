package e.f.a.e.i.n;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class o1<MessageType extends o1<MessageType, BuilderType>, BuilderType extends n1<MessageType, BuilderType>> implements r4 {
  protected int zza = 0;
  
  protected static <T> void a(Iterable<T> paramIterable, List<? super T> paramList) {
    String str;
    l3.a(paramIterable);
    if (paramIterable instanceof b4) {
      List<?> list = ((b4)paramIterable).f();
      paramIterable = (b4)paramList;
      int j = paramList.size();
      Iterator<?> iterator1 = list.iterator();
      while (iterator1.hasNext()) {
        list = (List<?>)iterator1.next();
        if (list == null) {
          int k = paramIterable.size();
          StringBuilder stringBuilder = new StringBuilder(37);
          stringBuilder.append("Element at index ");
          stringBuilder.append(k - j);
          stringBuilder.append(" is null.");
          str = stringBuilder.toString();
          for (k = paramIterable.size() - 1; k >= j; k--)
            paramIterable.remove(k); 
          throw new NullPointerException(str);
        } 
        if (list instanceof z1) {
          paramIterable.a((z1)list);
          continue;
        } 
        paramIterable.add((T)list);
      } 
      return;
    } 
    if (paramIterable instanceof c5) {
      str.addAll((Collection)paramIterable);
      return;
    } 
    if (str instanceof ArrayList && paramIterable instanceof Collection)
      ((ArrayList)str).ensureCapacity(str.size() + ((Collection)paramIterable).size()); 
    int i = str.size();
    Iterator<T> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      T t = iterator.next();
      if (t == null) {
        int j = str.size();
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Element at index ");
        stringBuilder.append(j - i);
        stringBuilder.append(" is null.");
        String str1 = stringBuilder.toString();
        for (j = str.size() - 1; j >= i; j--)
          str.remove(j); 
        throw new NullPointerException(str1);
      } 
      str.add(t);
    } 
  }
  
  void a(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public final z1 g() {
    try {
      i2 i2 = z1.a(f());
      a(i2.b());
      return i2.a();
    } catch (IOException iOException) {
      String str = getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 62 + "ByteString".length());
      stringBuilder.append("Serializing ");
      stringBuilder.append(str);
      stringBuilder.append(" to a ");
      stringBuilder.append("ByteString");
      stringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(stringBuilder.toString(), iOException);
    } 
  }
  
  public final byte[] h() {
    try {
      byte[] arrayOfByte = new byte[f()];
      o2 o2 = o2.a(arrayOfByte);
      a(o2);
      o2.b();
      return arrayOfByte;
    } catch (IOException iOException) {
      String str = getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 62 + "byte array".length());
      stringBuilder.append("Serializing ");
      stringBuilder.append(str);
      stringBuilder.append(" to a ");
      stringBuilder.append("byte array");
      stringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(stringBuilder.toString(), iOException);
    } 
  }
  
  int i() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/o1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */