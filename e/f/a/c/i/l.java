package e.f.a.c.i;

import e.f.a.c.i.v.a;
import java.util.concurrent.Executor;

class l implements Executor {
  private final Executor c;
  
  l(Executor paramExecutor) {
    this.c = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable) {
    this.c.execute(new a(paramRunnable));
  }
  
  static class a implements Runnable {
    private final Runnable c;
    
    a(Runnable param1Runnable) {
      this.c = param1Runnable;
    }
    
    public void run() {
      try {
        this.c.run();
        return;
      } catch (Exception exception) {
        a.a("Executor", "Background execution failure.", exception);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */