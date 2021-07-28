package e.e.l.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import e.e.e.g.h;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.IOException;
import java.util.concurrent.Executor;

public class v extends z {
  private final AssetManager c;
  
  public v(Executor paramExecutor, h paramh, AssetManager paramAssetManager) {
    super(paramExecutor, paramh);
    this.c = paramAssetManager;
  }
  
  private static String b(c paramc) {
    return paramc.p().getPath().substring(1);
  }
  
  private int c(c paramc) {
    AssetFileDescriptor assetFileDescriptor2 = null;
    AssetFileDescriptor assetFileDescriptor1 = null;
    try {
      AssetFileDescriptor assetFileDescriptor = this.c.openFd(b(paramc));
      assetFileDescriptor1 = assetFileDescriptor;
      assetFileDescriptor2 = assetFileDescriptor;
      long l = assetFileDescriptor.getLength();
      int i = (int)l;
      return i;
    } catch (IOException iOException) {
    
    } finally {
      if (assetFileDescriptor1 != null)
        try {
          assetFileDescriptor1.close();
        } catch (IOException iOException) {} 
    } 
    return -1;
  }
  
  protected d a(c paramc) {
    return b(this.c.open(b(paramc), 2), c(paramc));
  }
  
  protected String a() {
    return "LocalAssetFetchProducer";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */