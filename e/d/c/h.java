package e.d.c;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class h {
  private final byte[] a;
  
  private final Charset b;
  
  public h(byte[] paramArrayOfbyte, Charset paramCharset) {
    this.a = paramArrayOfbyte;
    this.b = paramCharset;
  }
  
  public String a(Charset paramCharset) {
    if (paramCharset != null)
      try {
        return new String(this.a, paramCharset.name());
      } catch (UnsupportedEncodingException unsupportedEncodingException) {} 
    return new String(this.a);
  }
  
  public byte[] a() {
    return this.a;
  }
  
  public String toString() {
    return a(this.b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */