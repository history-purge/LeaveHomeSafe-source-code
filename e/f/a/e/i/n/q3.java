package e.f.a.e.i.n;

import java.io.IOException;

public class q3 extends IOException {
  private r4 zza = null;
  
  public q3(String paramString) {
    super(paramString);
  }
  
  static q3 a() {
    return new q3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static q3 b() {
    return new q3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static q3 c() {
    return new q3("Protocol message contained an invalid tag (zero).");
  }
  
  static t3 d() {
    return new t3("Protocol message tag had invalid wire type.");
  }
  
  static q3 e() {
    return new q3("Failed to parse the message.");
  }
  
  static q3 f() {
    return new q3("Protocol message had invalid UTF-8.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/q3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */