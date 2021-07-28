package e.f.a.e.i.d;

import java.io.IOException;

public abstract class q<MessageType extends q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements k2 {
  private static boolean zzey = false;
  
  protected int zzex = 0;
  
  void a(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public final a0 c() {
    try {
      f0 f0 = a0.b(f());
      a(f0.b());
      return f0.a();
    } catch (IOException iOException) {
      String str = getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 62 + "ByteString".length());
      stringBuilder.append("Serializing ");
      stringBuilder.append(str);
      stringBuilder.append(" to a ");
      stringBuilder.append("ByteString");
      stringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(stringBuilder.toString(), iOException);
    } 
  }
  
  int g() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */