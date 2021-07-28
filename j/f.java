package j;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f implements Serializable, Comparable<f> {
  static final char[] e = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'a', 'b', 'c', 'd', 'e', 'f' };
  
  public static final f f = a(new byte[0]);
  
  private static final long serialVersionUID = 1L;
  
  transient int c;
  
  transient String d;
  
  final byte[] data;
  
  f(byte[] paramArrayOfbyte) {
    this.data = paramArrayOfbyte;
  }
  
  private static int a(char paramChar) {
    if (paramChar >= '0' && paramChar <= '9')
      return paramChar - 48; 
    byte b = 97;
    if (paramChar < 'a' || paramChar > 'f') {
      b = 65;
      if (paramChar < 'A' || paramChar > 'F') {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append(paramChar);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
      } 
    } 
    return paramChar - b + 10;
  }
  
  static int a(String paramString, int paramInt) {
    int k = paramString.length();
    int i = 0;
    int j = 0;
    while (i < k) {
      if (j == paramInt)
        return i; 
      int m = paramString.codePointAt(i);
      if ((Character.isISOControl(m) && m != 10 && m != 13) || m == 65533)
        return -1; 
      j++;
      i += Character.charCount(m);
    } 
    return paramString.length();
  }
  
  public static f a(InputStream paramInputStream, int paramInt) {
    if (paramInputStream != null) {
      if (paramInt >= 0) {
        byte[] arrayOfByte = new byte[paramInt];
        int i = 0;
        while (i < paramInt) {
          int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
          if (j != -1) {
            i += j;
            continue;
          } 
          throw new EOFException();
        } 
        return new f(arrayOfByte);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("in == null");
    throw illegalArgumentException;
  }
  
  public static f a(String paramString) {
    if (paramString != null) {
      byte[] arrayOfByte = b.a(paramString);
      return (arrayOfByte != null) ? new f(arrayOfByte) : null;
    } 
    throw new IllegalArgumentException("base64 == null");
  }
  
  public static f a(String paramString, Charset paramCharset) {
    if (paramString != null) {
      if (paramCharset != null)
        return new f(paramString.getBytes(paramCharset)); 
      throw new IllegalArgumentException("charset == null");
    } 
    throw new IllegalArgumentException("s == null");
  }
  
  public static f a(byte... paramVarArgs) {
    if (paramVarArgs != null)
      return new f((byte[])paramVarArgs.clone()); 
    throw new IllegalArgumentException("data == null");
  }
  
  public static f b(String paramString) {
    if (paramString != null) {
      if (paramString.length() % 2 == 0) {
        byte[] arrayOfByte = new byte[paramString.length() / 2];
        for (int i = 0; i < arrayOfByte.length; i++) {
          int j = i * 2;
          arrayOfByte[i] = (byte)((a(paramString.charAt(j)) << 4) + a(paramString.charAt(j + 1)));
        } 
        return a(arrayOfByte);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected hex string: ");
      stringBuilder.append(paramString);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("hex == null");
    throw illegalArgumentException;
  }
  
  private f c(String paramString) {
    try {
      return a(MessageDigest.getInstance(paramString).digest(this.data));
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new AssertionError(noSuchAlgorithmException);
    } 
  }
  
  public static f d(String paramString) {
    if (paramString != null) {
      f f1 = new f(paramString.getBytes(v.a));
      f1.d = paramString;
      return f1;
    } 
    throw new IllegalArgumentException("s == null");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    f f1 = a(paramObjectInputStream, paramObjectInputStream.readInt());
    try {
      Field field = f.class.getDeclaredField("data");
      field.setAccessible(true);
      field.set(this, f1.data);
      return;
    } catch (NoSuchFieldException noSuchFieldException) {
      throw new AssertionError();
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError();
    } 
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) {
    paramObjectOutputStream.writeInt(this.data.length);
    paramObjectOutputStream.write(this.data);
  }
  
  public int a(f paramf) {
    int j = s();
    int k = paramf.s();
    int m = Math.min(j, k);
    int i = 0;
    while (i < m) {
      int n = f(i) & 0xFF;
      int i1 = paramf.f(i) & 0xFF;
      if (n == i1) {
        i++;
        continue;
      } 
      return (n < i1) ? -1 : 1;
    } 
    return (j == k) ? 0 : ((j < k) ? -1 : 1);
  }
  
  public f a(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      byte[] arrayOfByte = this.data;
      if (paramInt2 <= arrayOfByte.length) {
        int i = paramInt2 - paramInt1;
        if (i >= 0) {
          if (paramInt1 == 0 && paramInt2 == arrayOfByte.length)
            return this; 
          arrayOfByte = new byte[i];
          System.arraycopy(this.data, paramInt1, arrayOfByte, 0, i);
          return new f(arrayOfByte);
        } 
        throw new IllegalArgumentException("endIndex < beginIndex");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("endIndex > length(");
      stringBuilder.append(this.data.length);
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("beginIndex < 0");
  }
  
  public String a() {
    return b.a(this.data);
  }
  
  void a(c paramc) {
    byte[] arrayOfByte = this.data;
    paramc.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public boolean a(int paramInt1, f paramf, int paramInt2, int paramInt3) {
    return paramf.a(paramInt2, this.data, paramInt1, paramInt3);
  }
  
  public boolean a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    if (paramInt1 >= 0) {
      byte[] arrayOfByte = this.data;
      if (paramInt1 <= arrayOfByte.length - paramInt3 && paramInt2 >= 0 && paramInt2 <= paramArrayOfbyte.length - paramInt3 && v.a(arrayOfByte, paramInt1, paramArrayOfbyte, paramInt2, paramInt3))
        return true; 
    } 
    return false;
  }
  
  public String b() {
    byte[] arrayOfByte = this.data;
    char[] arrayOfChar = new char[arrayOfByte.length * 2];
    int k = arrayOfByte.length;
    int i = 0;
    int j = 0;
    while (i < k) {
      byte b = arrayOfByte[i];
      int m = j + 1;
      char[] arrayOfChar1 = e;
      arrayOfChar[j] = arrayOfChar1[b >> 4 & 0xF];
      j = m + 1;
      arrayOfChar[m] = arrayOfChar1[b & 0xF];
      i++;
    } 
    return new String(arrayOfChar);
  }
  
  public final boolean b(f paramf) {
    return a(0, paramf, 0, paramf.s());
  }
  
  byte[] c() {
    return this.data;
  }
  
  public f d() {
    return c("MD5");
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      int i = paramObject.s();
      byte[] arrayOfByte = this.data;
      if (i == arrayOfByte.length && paramObject.a(0, arrayOfByte, 0, arrayOfByte.length))
        return true; 
    } 
    return false;
  }
  
  public byte f(int paramInt) {
    return this.data[paramInt];
  }
  
  public int hashCode() {
    int i = this.c;
    if (i != 0)
      return i; 
    i = Arrays.hashCode(this.data);
    this.c = i;
    return i;
  }
  
  public f q() {
    return c("SHA-1");
  }
  
  public f r() {
    return c("SHA-256");
  }
  
  public int s() {
    return this.data.length;
  }
  
  public f t() {
    int i = 0;
    while (true) {
      byte[] arrayOfByte = this.data;
      if (i < arrayOfByte.length) {
        byte b = arrayOfByte[i];
        if (b < 65 || b > 90) {
          i++;
          continue;
        } 
        arrayOfByte = (byte[])arrayOfByte.clone();
        int j = i + 1;
        arrayOfByte[i] = (byte)(b + 32);
        for (i = j; i < arrayOfByte.length; i++) {
          j = arrayOfByte[i];
          if (j >= 65 && j <= 90)
            arrayOfByte[i] = (byte)(j + 32); 
        } 
        return new f(arrayOfByte);
      } 
      return this;
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder;
    if (this.data.length == 0)
      return "[size=0]"; 
    String str1 = v();
    int i = a(str1, 64);
    if (i == -1) {
      if (this.data.length <= 64) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("[hex=");
        stringBuilder.append(b());
        stringBuilder.append("]");
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("[size=");
        stringBuilder.append(this.data.length);
        stringBuilder.append(" hex=");
        stringBuilder.append(a(0, 64).b());
        stringBuilder.append("…]");
      } 
      return stringBuilder.toString();
    } 
    String str2 = stringBuilder.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
    if (i < stringBuilder.length()) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("[size=");
      stringBuilder.append(this.data.length);
      stringBuilder.append(" text=");
      stringBuilder.append(str2);
      stringBuilder.append("…]");
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("[text=");
      stringBuilder.append(str2);
      stringBuilder.append("]");
    } 
    return stringBuilder.toString();
  }
  
  public byte[] u() {
    return (byte[])this.data.clone();
  }
  
  public String v() {
    String str = this.d;
    if (str != null)
      return str; 
    str = new String(this.data, v.a);
    this.d = str;
    return str;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */