package e.e.l.e;

import e.e.e.d.i;
import e.e.e.k.b;
import java.util.regex.Pattern;

public class a {
  private static Pattern c;
  
  public final int a;
  
  public final int b;
  
  public a(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static a a(int paramInt) {
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    return new a(paramInt, 2147483647);
  }
  
  public static a a(String paramString) {
    if (paramString == null)
      return null; 
    if (c == null)
      c = Pattern.compile("[-/ ]"); 
    try {
      boolean bool;
      String[] arrayOfString = c.split(paramString);
      if (arrayOfString.length == 4) {
        bool = true;
      } else {
        bool = false;
      } 
      i.a(bool);
      i.a(arrayOfString[0].equals("bytes"));
      int i = Integer.parseInt(arrayOfString[1]);
      int j = Integer.parseInt(arrayOfString[2]);
      int k = Integer.parseInt(arrayOfString[3]);
      if (j > i) {
        bool = true;
      } else {
        bool = false;
      } 
      i.a(bool);
      if (k > j) {
        bool = true;
      } else {
        bool = false;
      } 
      i.a(bool);
      return (j < k - 1) ? new a(i, j) : new a(i, 2147483647);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", new Object[] { paramString }), illegalArgumentException);
    } 
  }
  
  public static a b(int paramInt) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    return new a(0, paramInt);
  }
  
  private static String c(int paramInt) {
    return (paramInt == Integer.MAX_VALUE) ? "" : Integer.toString(paramInt);
  }
  
  public String a() {
    return String.format(null, "bytes=%s-%s", new Object[] { c(this.a), c(this.b) });
  }
  
  public boolean a(a parama) {
    boolean bool2 = false;
    if (parama == null)
      return false; 
    boolean bool1 = bool2;
    if (this.a <= parama.a) {
      bool1 = bool2;
      if (this.b >= parama.b)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return (this.a == ((a)paramObject).a && this.b == ((a)paramObject).b);
  }
  
  public int hashCode() {
    return b.a(this.a, this.b);
  }
  
  public String toString() {
    return String.format(null, "%s-%s", new Object[] { c(this.a), c(this.b) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */