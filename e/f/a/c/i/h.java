package e.f.a.c.i;

import e.f.a.c.b;
import java.util.Arrays;

public final class h {
  private final b a;
  
  private final byte[] b;
  
  public h(b paramb, byte[] paramArrayOfbyte) {
    if (paramb != null) {
      if (paramArrayOfbyte != null) {
        this.a = paramb;
        this.b = paramArrayOfbyte;
        return;
      } 
      throw new NullPointerException("bytes is null");
    } 
    throw new NullPointerException("encoding is null");
  }
  
  public byte[] a() {
    return this.b;
  }
  
  public b b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof h))
      return false; 
    paramObject = paramObject;
    return !this.a.equals(((h)paramObject).a) ? false : Arrays.equals(this.b, ((h)paramObject).b);
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EncodedPayload{encoding=");
    stringBuilder.append(this.a);
    stringBuilder.append(", bytes=[...]}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */