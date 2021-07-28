package com.oblador.keychain;

public enum f {
  c, d, e;
  
  public String a() {
    return String.format("SECURITY_LEVEL_%s", new Object[] { name() });
  }
  
  public boolean a(f paramf) {
    return (compareTo((E)paramf) >= 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */