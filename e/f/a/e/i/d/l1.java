package e.f.a.e.i.d;

import java.io.IOException;

public class l1 extends IOException {
  private k2 zzkw = null;
  
  public l1(String paramString) {
    super(paramString);
  }
  
  static l1 a() {
    return new l1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static l1 b() {
    return new l1("Protocol message contained an invalid tag (zero).");
  }
  
  static m1 c() {
    return new m1("Protocol message tag had invalid wire type.");
  }
  
  static l1 d() {
    return new l1("Failed to parse the message.");
  }
  
  static l1 e() {
    return new l1("Protocol message had invalid UTF-8.");
  }
  
  public final l1 a(k2 paramk2) {
    this.zzkw = paramk2;
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/l1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */