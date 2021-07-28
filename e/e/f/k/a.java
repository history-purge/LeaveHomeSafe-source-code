package e.e.f.k;

import java.io.IOException;

public class a {
  public static void a(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new IOException(paramString);
  }
  
  public static void b(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */