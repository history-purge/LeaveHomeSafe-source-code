package e.e.l.f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class b implements f {
  private final Executor a = Executors.newFixedThreadPool(2, new l(10, "FrescoIoBoundExecutor", true));
  
  private final Executor b;
  
  private final Executor c;
  
  private final Executor d;
  
  public b(int paramInt) {
    this.b = Executors.newFixedThreadPool(paramInt, new l(10, "FrescoDecodeExecutor", true));
    this.c = Executors.newFixedThreadPool(paramInt, new l(10, "FrescoBackgroundExecutor", true));
    this.d = Executors.newFixedThreadPool(1, new l(10, "FrescoLightWeightBackgroundExecutor", true));
  }
  
  public Executor a() {
    return this.b;
  }
  
  public Executor b() {
    return this.d;
  }
  
  public Executor c() {
    return this.a;
  }
  
  public Executor d() {
    return this.c;
  }
  
  public Executor e() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */