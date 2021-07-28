package net.time4j;

import java.io.InvalidObjectException;

final class t extends b<Integer> implements j0<Integer, g0> {
  private static final long serialVersionUID = -1337148214680014674L;
  
  private final transient int c;
  
  private final transient Integer d;
  
  private final transient Integer e;
  
  private final transient char f;
  
  private t(String paramString, int paramInt, Integer paramInteger1, Integer paramInteger2, char paramChar) {
    super(paramString);
    boolean bool;
    this.c = paramInt;
    this.d = paramInteger1;
    this.e = paramInteger2;
    this.f = paramChar;
    if (paramInt != 5 && paramInt != 7 && paramInt != 9 && paramInt != 13) {
      bool = false;
    } else {
      bool = true;
    } 
    new k0(this, bool);
  }
  
  static t a(String paramString, int paramInt1, int paramInt2, int paramInt3, char paramChar) {
    return new t(paramString, paramInt1, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramChar);
  }
  
  static t a(String paramString, boolean paramBoolean) {
    byte b1;
    boolean bool;
    byte b2;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = true;
    } 
    if (paramBoolean) {
      b2 = 24;
    } else {
      b2 = 12;
    } 
    if (paramBoolean) {
      b1 = 107;
    } else {
      b1 = 104;
    } 
    return new t(paramString, bool, Integer.valueOf(1), Integer.valueOf(b2), b1);
  }
  
  private Object readResolve() {
    Object object = g0.a(name());
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
    return false;
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
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */