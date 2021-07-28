package e.f.a.e.i.d;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class v4 {
  public static final Object a = new Object();
  
  public static int a(int[] paramArrayOfint) {
    return (paramArrayOfint == null || paramArrayOfint.length == 0) ? 0 : Arrays.hashCode(paramArrayOfint);
  }
  
  public static int a(long[] paramArrayOflong) {
    return (paramArrayOflong == null || paramArrayOflong.length == 0) ? 0 : Arrays.hashCode(paramArrayOflong);
  }
  
  public static int a(Object[] paramArrayOfObject) {
    int i;
    int j = 0;
    if (paramArrayOfObject == null) {
      i = 0;
    } else {
      i = paramArrayOfObject.length;
    } 
    int k;
    for (k = 0; j < i; k = m) {
      Object object = paramArrayOfObject[j];
      int m = k;
      if (object != null)
        m = k * 31 + object.hashCode(); 
      j++;
    } 
    return k;
  }
  
  public static int a(byte[][] paramArrayOfbyte) {
    int i;
    int j = 0;
    if (paramArrayOfbyte == null) {
      i = 0;
    } else {
      i = paramArrayOfbyte.length;
    } 
    int k;
    for (k = 0; j < i; k = m) {
      byte[] arrayOfByte = paramArrayOfbyte[j];
      int m = k;
      if (arrayOfByte != null)
        m = k * 31 + Arrays.hashCode(arrayOfByte); 
      j++;
    } 
    return k;
  }
  
  public static void a(r4 paramr41, r4 paramr42) {
    t4 t4 = paramr41.d;
    if (t4 != null)
      paramr42.d = (t4)t4.clone(); 
  }
  
  public static boolean a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return (paramArrayOfint1 == null || paramArrayOfint1.length == 0) ? ((paramArrayOfint2 == null || paramArrayOfint2.length == 0)) : Arrays.equals(paramArrayOfint1, paramArrayOfint2);
  }
  
  public static boolean a(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    return (paramArrayOflong1 == null || paramArrayOflong1.length == 0) ? ((paramArrayOflong2 == null || paramArrayOflong2.length == 0)) : Arrays.equals(paramArrayOflong1, paramArrayOflong2);
  }
  
  public static boolean a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    int k;
    int m;
    if (paramArrayOfObject1 == null) {
      k = 0;
    } else {
      k = paramArrayOfObject1.length;
    } 
    if (paramArrayOfObject2 == null) {
      m = 0;
    } else {
      m = paramArrayOfObject2.length;
    } 
    int i = 0;
    for (int j = 0;; j = n + 1) {
      byte b;
      int n = j;
      if (i < k) {
        n = j;
        if (paramArrayOfObject1[i] == null) {
          i++;
          continue;
        } 
      } 
      while (n < m && paramArrayOfObject2[n] == null)
        n++; 
      if (i >= k) {
        j = 1;
      } else {
        j = 0;
      } 
      if (n >= m) {
        b = 1;
      } else {
        b = 0;
      } 
      if (j != 0 && b)
        return true; 
      if (j != b)
        return false; 
      if (!paramArrayOfObject1[i].equals(paramArrayOfObject2[n]))
        return false; 
      i++;
    } 
  }
  
  public static boolean a(byte[][] paramArrayOfbyte1, byte[][] paramArrayOfbyte2) {
    int k;
    int m;
    if (paramArrayOfbyte1 == null) {
      k = 0;
    } else {
      k = paramArrayOfbyte1.length;
    } 
    if (paramArrayOfbyte2 == null) {
      m = 0;
    } else {
      m = paramArrayOfbyte2.length;
    } 
    int i = 0;
    for (int j = 0;; j = n + 1) {
      byte b;
      int n = j;
      if (i < k) {
        n = j;
        if (paramArrayOfbyte1[i] == null) {
          i++;
          continue;
        } 
      } 
      while (n < m && paramArrayOfbyte2[n] == null)
        n++; 
      if (i >= k) {
        j = 1;
      } else {
        j = 0;
      } 
      if (n >= m) {
        b = 1;
      } else {
        b = 0;
      } 
      if (j != 0 && b)
        return true; 
      if (j != b)
        return false; 
      if (!Arrays.equals(paramArrayOfbyte1[i], paramArrayOfbyte2[n]))
        return false; 
      i++;
    } 
  }
  
  static {
    Charset.forName("UTF-8");
    Charset.forName("ISO-8859-1");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/v4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */