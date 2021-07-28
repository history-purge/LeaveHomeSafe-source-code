package e.d.a.n;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class d {
  private static final Set<String> c = new HashSet<String>(Arrays.asList(new String[] { "IDAT", "sPLT", "iTXt", "tEXt", "zTXt" }));
  
  public static final d d;
  
  public static final d e;
  
  public static final d f;
  
  public static final d g;
  
  public static final d h;
  
  public static final d i;
  
  public static final d j;
  
  public static final d k;
  
  public static final d l;
  
  public static final d m;
  
  public static final d n;
  
  public static final d o;
  
  public static final d p;
  
  public static final d q;
  
  public static final d r;
  
  private final byte[] a;
  
  private final boolean b;
  
  static {
    try {
      d = new d("IHDR");
      e = new d("PLTE");
      new d("IDAT", true);
      f = new d("IEND");
      g = new d("cHRM");
      h = new d("gAMA");
      i = new d("iCCP");
      j = new d("sBIT");
      k = new d("sRGB");
      l = new d("bKGD");
      new d("hIST");
      m = new d("tRNS");
      n = new d("pHYs");
      new d("sPLT", true);
      o = new d("tIME");
      p = new d("iTXt", true);
      q = new d("tEXt", true);
      r = new d("zTXt", true);
      return;
    } catch (h h) {
      throw new IllegalArgumentException(h);
    } 
  }
  
  public d(String paramString) {
    this(paramString, false);
  }
  
  public d(String paramString, boolean paramBoolean) {
    this.b = paramBoolean;
    try {
      byte[] arrayOfByte = paramString.getBytes("ASCII");
      a(arrayOfByte);
      this.a = arrayOfByte;
      return;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new IllegalArgumentException("Unable to convert string code to bytes.");
    } 
  }
  
  public d(byte[] paramArrayOfbyte) {
    a(paramArrayOfbyte);
    this.a = paramArrayOfbyte;
    this.b = c.contains(b());
  }
  
  private static void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length == 4) {
      int j = paramArrayOfbyte.length;
      int i = 0;
      while (i < j) {
        if (a(paramArrayOfbyte[i])) {
          i++;
          continue;
        } 
        throw new h("PNG chunk type identifier may only contain alphabet characters");
      } 
      return;
    } 
    h h = new h("PNG chunk type identifier must be four bytes in length");
    throw h;
  }
  
  private static boolean a(byte paramByte) {
    return ((paramByte >= 65 && paramByte <= 90) || (paramByte >= 97 && paramByte <= 122));
  }
  
  public boolean a() {
    return this.b;
  }
  
  public String b() {
    try {
      return new String(this.a, "ASCII");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return "Invalid object instance";
    } 
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || d.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals(this.a, ((d)paramObject).a);
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.a);
  }
  
  public String toString() {
    return b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/n/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */