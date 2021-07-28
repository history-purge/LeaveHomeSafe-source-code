package net.time4j;

import java.io.InvalidObjectException;

final class s extends a<Integer> implements j0<Integer, f0> {
  private static final long serialVersionUID = -1337148214680014674L;
  
  private final transient int c;
  
  private final transient Integer d;
  
  private final transient Integer e;
  
  private final transient char f;
  
  private s(String paramString, int paramInt, Integer paramInteger1, Integer paramInteger2, char paramChar) {
    super(paramString);
    this.c = paramInt;
    this.d = paramInteger1;
    this.e = paramInteger2;
    this.f = paramChar;
    new k0(this, false);
  }
  
  static s a(String paramString, int paramInt1, int paramInt2, int paramInt3, char paramChar) {
    return new s(paramString, paramInt1, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramChar);
  }
  
  private Object readResolve() {
    Object object = f0.a(name());
    if (object != null)
      return object; 
    throw new InvalidObjectException(name());
  }
  
  public char a() {
    return this.f;
  }
  
  public Integer b() {
    return this.e;
  }
  
  public boolean d() {
    return true;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<Integer> getType() {
    return Integer.class;
  }
  
  int h() {
    return this.c;
  }
  
  public Integer q() {
    return this.d;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */