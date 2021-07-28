package e.f.a.e.i.d;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class u4 implements Cloneable {
  private s4<?, ?> c;
  
  private Object d;
  
  private List<Object> e = new ArrayList();
  
  private final byte[] b() {
    byte[] arrayOfByte = new byte[a()];
    a(p4.a(arrayOfByte));
    return arrayOfByte;
  }
  
  private final u4 c() {
    u4 u41 = new u4();
    try {
      u41.c = this.c;
      if (this.e == null) {
        u41.e = null;
      } else {
        u41.e.addAll(this.e);
      } 
      if (this.d != null) {
        if (this.d instanceof w4) {
          w4 w4 = (w4)((w4)this.d).clone();
          u41.d = w4;
          return u41;
        } 
        if (this.d instanceof byte[]) {
          Object object = ((byte[])this.d).clone();
          u41.d = object;
          return u41;
        } 
        boolean bool1 = this.d instanceof byte[][];
        boolean bool = false;
        int i = 0;
        if (bool1) {
          byte[][] arrayOfByte1 = (byte[][])this.d;
          byte[][] arrayOfByte2 = new byte[arrayOfByte1.length][];
          u41.d = arrayOfByte2;
          while (i < arrayOfByte1.length) {
            arrayOfByte2[i] = (byte[])arrayOfByte1[i].clone();
            i++;
          } 
        } else {
          if (this.d instanceof boolean[]) {
            Object object = ((boolean[])this.d).clone();
            u41.d = object;
            return u41;
          } 
          if (this.d instanceof int[]) {
            Object object = ((int[])this.d).clone();
            u41.d = object;
            return u41;
          } 
          if (this.d instanceof long[]) {
            Object object = ((long[])this.d).clone();
            u41.d = object;
            return u41;
          } 
          if (this.d instanceof float[]) {
            Object object = ((float[])this.d).clone();
            u41.d = object;
            return u41;
          } 
          if (this.d instanceof double[]) {
            Object object = ((double[])this.d).clone();
            u41.d = object;
            return u41;
          } 
          if (this.d instanceof w4[]) {
            w4[] arrayOfW41 = (w4[])this.d;
            w4[] arrayOfW42 = new w4[arrayOfW41.length];
            u41.d = arrayOfW42;
            for (i = bool; i < arrayOfW41.length; i++)
              arrayOfW42[i] = (w4)arrayOfW41[i].clone(); 
          } 
        } 
      } 
      return u41;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      AssertionError assertionError = new AssertionError(cloneNotSupportedException);
      throw assertionError;
    } 
  }
  
  final int a() {
    if (this.d == null) {
      Iterator iterator = this.e.iterator();
      if (!iterator.hasNext())
        return 0; 
      iterator.next();
      throw new NoSuchMethodError();
    } 
    throw new NoSuchMethodError();
  }
  
  final void a(p4 paramp4) {
    if (this.d == null) {
      Iterator iterator = this.e.iterator();
      if (!iterator.hasNext())
        return; 
      iterator.next();
      throw new NoSuchMethodError();
    } 
    throw new NoSuchMethodError();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof u4))
      return false; 
    paramObject = paramObject;
    if (this.d != null && ((u4)paramObject).d != null) {
      s4<?, ?> s41 = this.c;
      if (s41 != ((u4)paramObject).c)
        return false; 
      if (!s41.a.isArray())
        return this.d.equals(((u4)paramObject).d); 
      Object object = this.d;
      return (object instanceof byte[]) ? Arrays.equals((byte[])object, (byte[])((u4)paramObject).d) : ((object instanceof int[]) ? Arrays.equals((int[])object, (int[])((u4)paramObject).d) : ((object instanceof long[]) ? Arrays.equals((long[])object, (long[])((u4)paramObject).d) : ((object instanceof float[]) ? Arrays.equals((float[])object, (float[])((u4)paramObject).d) : ((object instanceof double[]) ? Arrays.equals((double[])object, (double[])((u4)paramObject).d) : ((object instanceof boolean[]) ? Arrays.equals((boolean[])object, (boolean[])((u4)paramObject).d) : Arrays.deepEquals((Object[])object, (Object[])((u4)paramObject).d))))));
    } 
    List<Object> list = this.e;
    if (list != null) {
      List<Object> list1 = ((u4)paramObject).e;
      if (list1 != null)
        return list.equals(list1); 
    } 
    try {
      return Arrays.equals(b(), paramObject.b());
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException);
    } 
  }
  
  public final int hashCode() {
    try {
      int i = Arrays.hashCode(b());
      return i + 527;
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/u4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */