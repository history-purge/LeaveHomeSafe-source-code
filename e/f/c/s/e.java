package e.f.c.s;

import java.util.List;

public final class e {
  private final byte[] a;
  
  private int b;
  
  private final String c;
  
  private final List<byte[]> d;
  
  private final String e;
  
  private Object f;
  
  private final int g;
  
  private final int h;
  
  public e(byte[] paramArrayOfbyte, String paramString1, List<byte[]> paramList, String paramString2) {
    this(paramArrayOfbyte, paramString1, paramList, paramString2, -1, -1);
  }
  
  public e(byte[] paramArrayOfbyte, String paramString1, List<byte[]> paramList, String paramString2, int paramInt1, int paramInt2) {
    int i;
    this.a = paramArrayOfbyte;
    if (paramArrayOfbyte == null) {
      i = 0;
    } else {
      i = paramArrayOfbyte.length * 8;
    } 
    this.b = i;
    this.c = paramString1;
    this.d = paramList;
    this.e = paramString2;
    this.g = paramInt2;
    this.h = paramInt1;
  }
  
  public List<byte[]> a() {
    return this.d;
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
  
  public void a(Integer paramInteger) {}
  
  public void a(Object paramObject) {
    this.f = paramObject;
  }
  
  public String b() {
    return this.e;
  }
  
  public void b(Integer paramInteger) {}
  
  public int c() {
    return this.b;
  }
  
  public Object d() {
    return this.f;
  }
  
  public byte[] e() {
    return this.a;
  }
  
  public int f() {
    return this.g;
  }
  
  public int g() {
    return this.h;
  }
  
  public String h() {
    return this.c;
  }
  
  public boolean i() {
    return (this.g >= 0 && this.h >= 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */