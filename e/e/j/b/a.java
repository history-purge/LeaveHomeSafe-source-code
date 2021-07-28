package e.e.j.b;

import android.os.Handler;
import android.os.Looper;
import e.e.e.d.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a {
  private static a d;
  
  private final Set<b> a = new HashSet<b>();
  
  private final Handler b = new Handler(Looper.getMainLooper());
  
  private final Runnable c = new a(this);
  
  private static void b() {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
  }
  
  public static a c() {
    // Byte code:
    //   0: ldc e/e/j/b/a
    //   2: monitorenter
    //   3: getstatic e/e/j/b/a.d : Le/e/j/b/a;
    //   6: ifnonnull -> 19
    //   9: new e/e/j/b/a
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/j/b/a.d : Le/e/j/b/a;
    //   19: getstatic e/e/j/b/a.d : Le/e/j/b/a;
    //   22: astore_0
    //   23: ldc e/e/j/b/a
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/j/b/a
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public void a(b paramb) {
    b();
    this.a.remove(paramb);
  }
  
  public void b(b paramb) {
    b();
    if (!this.a.add(paramb))
      return; 
    if (this.a.size() == 1)
      this.b.post(this.c); 
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      a.a();
      Iterator<a.b> iterator = a.a(this.c).iterator();
      while (iterator.hasNext())
        ((a.b)iterator.next()).a(); 
      a.a(this.c).clear();
    }
  }
  
  public static interface b {
    void a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */