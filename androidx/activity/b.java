package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {
  private boolean a;
  
  private CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<a>();
  
  public b(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public abstract void a();
  
  void a(a parama) {
    this.b.add(parama);
  }
  
  public final void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  void b(a parama) {
    this.b.remove(parama);
  }
  
  public final boolean b() {
    return this.a;
  }
  
  public final void c() {
    Iterator<a> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).cancel(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */