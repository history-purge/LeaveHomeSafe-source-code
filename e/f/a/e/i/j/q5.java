package e.f.a.e.i.j;

import com.google.android.gms.common.internal.q;
import com.google.firebase.m.j.d;
import java.io.UnsupportedEncodingException;

public final class q5 {
  private final e4 a;
  
  private q5(e4 parame4) {
    this.a = parame4;
  }
  
  public static q5 a(e4 parame4) {
    return new q5(parame4);
  }
  
  public final q5 a(c4 paramc4) {
    this.a.a(paramc4);
    return this;
  }
  
  public final q5 a(m5 paramm5) {
    this.a.a(paramm5);
    return this;
  }
  
  public final byte[] a() {
    try {
      g6.a();
      g4 g4 = this.a.a();
      d d = new d();
      d.a(y2.a);
      d.a(true);
      return d.a().a(g4).getBytes("utf-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", unsupportedEncodingException);
    } 
  }
  
  public final String b() {
    m5 m5 = this.a.a().a();
    if (m5 != null && !g5.a(m5.d())) {
      String str = m5.d();
      q.a(str);
      return str;
    } 
    return "NA";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/q5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */