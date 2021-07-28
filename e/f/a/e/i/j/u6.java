package e.f.a.e.i.j;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class u6 {
  private final ConcurrentHashMap<t6, List<Throwable>> a = new ConcurrentHashMap<t6, List<Throwable>>(16, 0.75F, 10);
  
  private final ReferenceQueue<Throwable> b = new ReferenceQueue<Throwable>();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean) {
    while (true) {
      Reference<? extends Throwable> reference = this.b.poll();
      if (reference != null) {
        this.a.remove(reference);
        continue;
      } 
      reference = new t6(paramThrowable, null);
      List<Throwable> list2 = this.a.get(reference);
      if (list2 != null)
        return list2; 
      list2 = new Vector<Throwable>(2);
      List<Throwable> list1 = this.a.putIfAbsent(new t6(paramThrowable, this.b), list2);
      return (list1 == null) ? list2 : list1;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/u6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */