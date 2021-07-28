package e.e.l.n;

import e.e.e.g.h;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

public class a0 extends z {
  public a0(Executor paramExecutor, h paramh) {
    super(paramExecutor, paramh);
  }
  
  protected d a(c paramc) {
    return b(new FileInputStream(paramc.o().toString()), (int)paramc.o().length());
  }
  
  protected String a() {
    return "LocalFileFetchProducer";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */