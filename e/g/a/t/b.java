package e.g.a.t;

import java.io.Closeable;
import java.io.IOException;

public class b {
  public static void a(Closeable... paramVarArgs) {
    if (paramVarArgs == null)
      return; 
    int j = paramVarArgs.length;
    int i = 0;
    while (true) {
      if (i < j) {
        Closeable closeable = paramVarArgs[i];
        if (closeable != null)
          try {
            closeable.close();
          } catch (IOException iOException) {} 
        i++;
        continue;
      } 
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */