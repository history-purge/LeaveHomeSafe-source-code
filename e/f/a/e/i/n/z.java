package e.f.a.e.i.n;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class z {
  private final ConcurrentHashMap<y, List<Throwable>> a = new ConcurrentHashMap<y, List<Throwable>>(16, 0.75F, 10);
  
  private final ReferenceQueue<Throwable> b = new ReferenceQueue<Throwable>();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean) {
    while (true) {
      Reference<? extends Throwable> reference = this.b.poll();
      if (reference != null) {
        this.a.remove(reference);
        continue;
      } 
      reference = new y(paramThrowable, null);
      List<Throwable> list2 = this.a.get(reference);
      if (!paramBoolean)
        return list2; 
      if (list2 != null)
        return list2; 
      list2 = new Vector<Throwable>(2);
      List<Throwable> list1 = this.a.putIfAbsent(new y(paramThrowable, this.b), list2);
      return (list1 == null) ? list2 : list1;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */