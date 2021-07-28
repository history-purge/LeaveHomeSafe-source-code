package com.oblador.keychain.g;

import com.oblador.keychain.f;
import java.security.Key;
import java.util.Set;

public interface e {
  f a();
  
  d a(String paramString1, String paramString2, String paramString3, f paramf);
  
  void a(com.oblador.keychain.h.d paramd, String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, f paramf);
  
  void a(String paramString);
  
  boolean b();
  
  String c();
  
  int d();
  
  int e();
  
  boolean f();
  
  Set<String> g();
  
  public static abstract class a<T> {
    public final T a;
    
    public final T b;
    
    public a(T param1T1, T param1T2) {
      this.a = param1T1;
      this.b = param1T2;
    }
  }
  
  public static class b extends a<byte[]> {
    public final Key c;
    
    public b(String param1String, Key param1Key, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      super(param1ArrayOfbyte2, param1ArrayOfbyte1);
      this.c = param1Key;
    }
  }
  
  public static class c extends a<String> {
    private final f c;
    
    public c(String param1String1, String param1String2) {
      this(param1String1, param1String2, f.c);
    }
    
    public c(String param1String1, String param1String2, f param1f) {
      super(param1String1, param1String2);
      this.c = param1f;
    }
    
    public f a() {
      return this.c;
    }
  }
  
  public static class d extends a<byte[]> {
    public final String c;
    
    public d(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, e param1e) {
      this(param1ArrayOfbyte1, param1ArrayOfbyte2, param1e.c());
    }
    
    public d(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, String param1String) {
      super(param1ArrayOfbyte1, param1ArrayOfbyte2);
      this.c = param1String;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */