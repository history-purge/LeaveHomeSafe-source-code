package e.e.l.n;

import android.content.ContentResolver;
import android.net.Uri;
import e.e.e.g.h;
import e.e.l.k.d;
import e.e.l.o.c;
import java.util.concurrent.Executor;

public class n0 extends z {
  private final ContentResolver c;
  
  public n0(Executor paramExecutor, h paramh, ContentResolver paramContentResolver) {
    super(paramExecutor, paramh);
    this.c = paramContentResolver;
  }
  
  protected d a(c paramc) {
    Uri uri = paramc.p();
    return b(this.c.openInputStream(uri), -1);
  }
  
  protected String a() {
    return "QualifiedResourceFetchProducer";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */