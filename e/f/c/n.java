package e.f.c;

import java.util.EnumMap;
import java.util.Map;

public final class n {
  private final String a;
  
  private final byte[] b;
  
  private p[] c;
  
  private final a d;
  
  private Map<o, Object> e;
  
  public n(String paramString, byte[] paramArrayOfbyte, int paramInt, p[] paramArrayOfp, a parama, long paramLong) {
    this.a = paramString;
    this.b = paramArrayOfbyte;
    this.c = paramArrayOfp;
    this.d = parama;
    this.e = null;
  }
  
  public n(String paramString, byte[] paramArrayOfbyte, p[] paramArrayOfp, a parama) {
    this(paramString, paramArrayOfbyte, paramArrayOfp, parama, System.currentTimeMillis());
  }
  
  public n(String paramString, byte[] paramArrayOfbyte, p[] paramArrayOfp, a parama, long paramLong) {
    this(paramString, paramArrayOfbyte, i, paramArrayOfp, parama, paramLong);
  }
  
  public a a() {
    return this.d;
  }
  
  public void a(o paramo, Object paramObject) {
    if (this.e == null)
      this.e = new EnumMap<o, Object>(o.class); 
    this.e.put(paramo, paramObject);
  }
  
  public void a(Map<o, Object> paramMap) {
    if (paramMap != null) {
      Map<o, Object> map = this.e;
      if (map == null) {
        this.e = paramMap;
        return;
      } 
      map.putAll(paramMap);
    } 
  }
  
  public void a(p[] paramArrayOfp) {
    p[] arrayOfP = this.c;
    if (arrayOfP == null) {
      this.c = paramArrayOfp;
      return;
    } 
    if (paramArrayOfp != null && paramArrayOfp.length > 0) {
      p[] arrayOfP1 = new p[arrayOfP.length + paramArrayOfp.length];
      System.arraycopy(arrayOfP, 0, arrayOfP1, 0, arrayOfP.length);
      System.arraycopy(paramArrayOfp, 0, arrayOfP1, arrayOfP.length, paramArrayOfp.length);
      this.c = arrayOfP1;
    } 
  }
  
  public byte[] b() {
    return this.b;
  }
  
  public Map<o, Object> c() {
    return this.e;
  }
  
  public p[] d() {
    return this.c;
  }
  
  public String e() {
    return this.a;
  }
  
  public String toString() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */