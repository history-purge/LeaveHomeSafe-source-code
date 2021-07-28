package e.f.a.e.i.g;

import com.google.firebase.messaging.f1.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class k {
  private static final f a;
  
  static {
    e e = new e();
    j.a.a(e);
    a = e.a();
  }
  
  public static byte[] a(Object paramObject) {
    f f1 = a;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      f1.a(paramObject, byteArrayOutputStream);
    } catch (IOException iOException) {}
    return byteArrayOutputStream.toByteArray();
  }
  
  public abstract b a();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */