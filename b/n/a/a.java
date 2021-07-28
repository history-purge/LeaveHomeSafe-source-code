package b.n.a;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.x;
import b.n.b.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
  public static <T extends j & x> a a(T paramT) {
    return new b((j)paramT, ((x)paramT).d());
  }
  
  public abstract <D> b<D> a(int paramInt, Bundle paramBundle, a<D> parama);
  
  public abstract void a();
  
  @Deprecated
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public static interface a<D> {
    b<D> a(int param1Int, Bundle param1Bundle);
    
    void a(b<D> param1b);
    
    void a(b<D> param1b, D param1D);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/n/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */