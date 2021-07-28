package e.f.a.e.i.k;

import com.google.android.gms.common.internal.q;
import com.google.firebase.m.j.d;
import java.io.UnsupportedEncodingException;

public final class l7 {
  private final x5 a;
  
  private l7(x5 paramx5) {
    this.a = paramx5;
  }
  
  public static l7 a(x5 paramx5) {
    return new l7(paramx5);
  }
  
  public final l7 a(g7 paramg7) {
    this.a.a(paramg7);
    return this;
  }
  
  public final l7 a(v5 paramv5) {
    this.a.a(paramv5);
    return this;
  }
  
  public final byte[] a() {
    try {
      b8.a();
      y5 y5 = this.a.a();
      d d = new d();
      d.a(n4.a);
      d.a(true);
      return d.a().a(y5).getBytes("utf-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", unsupportedEncodingException);
    } 
  }
  
  public final String b() {
    g7 g7 = this.a.a().a();
    if (g7 != null && !f5.a(g7.d())) {
      String str = g7.d();
      q.a(str);
      return str;
    } 
    return "NA";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/l7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */