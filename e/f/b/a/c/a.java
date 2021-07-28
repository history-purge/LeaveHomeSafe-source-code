package e.f.b.a.c;

import androidx.annotation.RecentlyNonNull;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class a {
  private final ReferenceQueue<Object> a = new ReferenceQueue();
  
  private final Set<s> b = Collections.synchronizedSet(new HashSet<s>());
  
  @RecentlyNonNull
  public static a a() {
    a a1 = new a();
    a1.a(a1, p.c);
    Thread thread = new Thread(new q(a1.a, a1.b), "MlKitCleaner");
    thread.setDaemon(true);
    thread.start();
    return a1;
  }
  
  @RecentlyNonNull
  public a a(@RecentlyNonNull Object paramObject, @RecentlyNonNull Runnable paramRunnable) {
    paramObject = new s(paramObject, this.a, this.b, paramRunnable, null);
    this.b.add(paramObject);
    return (a)paramObject;
  }
  
  public static interface a {
    void a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */