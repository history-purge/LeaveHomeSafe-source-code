package okhttp3.internal;

public abstract class NamedRunnable implements Runnable {
  protected final String name;
  
  public NamedRunnable(String paramString, Object... paramVarArgs) {
    this.name = Util.format(paramString, paramVarArgs);
  }
  
  protected abstract void execute();
  
  public final void run() {
    String str = Thread.currentThread().getName();
    Thread.currentThread().setName(this.name);
    try {
      execute();
      return;
    } finally {
      Thread.currentThread().setName(str);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/NamedRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */