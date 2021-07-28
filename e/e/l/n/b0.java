package e.e.l.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import e.e.e.g.h;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.IOException;
import java.util.concurrent.Executor;

public class b0 extends z {
  private final Resources c;
  
  public b0(Executor paramExecutor, h paramh, Resources paramResources) {
    super(paramExecutor, paramh);
    this.c = paramResources;
  }
  
  private int b(c paramc) {
    AssetFileDescriptor assetFileDescriptor2 = null;
    AssetFileDescriptor assetFileDescriptor1 = null;
    try {
      AssetFileDescriptor assetFileDescriptor = this.c.openRawResourceFd(c(paramc));
      assetFileDescriptor1 = assetFileDescriptor;
      assetFileDescriptor2 = assetFileDescriptor;
      long l = assetFileDescriptor.getLength();
      int i = (int)l;
      return i;
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
    
    } finally {
      if (assetFileDescriptor1 != null)
        try {
          assetFileDescriptor1.close();
        } catch (IOException iOException) {} 
    } 
    return -1;
  }
  
  private static int c(c paramc) {
    return Integer.parseInt(paramc.p().getPath().substring(1));
  }
  
  protected d a(c paramc) {
    return b(this.c.openRawResource(c(paramc)), b(paramc));
  }
  
  protected String a() {
    return "LocalResourceFetchProducer";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */